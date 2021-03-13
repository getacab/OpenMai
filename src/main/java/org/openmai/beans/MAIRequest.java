package org.openmai.beans;

import java.io.Serializable;

import javax.servlet.http.Cookie;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import java.util.*;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import java.util.stream.Collectors;

@Component
@RequestScope
public class MAIRequest implements Serializable {

	public Map<String, String> headers;
	public Cookie[] cookies;
	public Map<String, String> urlParms;
	public JSONObject body;

	public MAIRequest(HttpServletRequest request) {


        //      Headers Extraction...

        Enumeration<String> headerNames = request.getHeaderNames();
        String headerName , headerContent;
        Map<String, String> header = new HashMap<String , String>();
        if (headerNames != null) {
                while (headerNames.hasMoreElements()) 
                {
                    headerName = headerNames.nextElement();
                    headerContent = request.getHeader(headerName);
                    //System.out.println(headerName + " : " + headerContent);
                    header.put(headerName, headerContent);
                }
        }

        //  Cookies Extraction...
        Cookie[] cookies = request.getCookies();
        if(cookies!=null) {
            //System.out.println("Cookies:");
            for (Cookie cookie : cookies) {
                //System.out.println(cookie);
            }
        }
        


        //  Body Json extraction...
        if ("POST".equalsIgnoreCase(request.getMethod())) 
        {
            try {
                String jsonString = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
                //System.out.println("Body:");
                //System.out.println(jsonString);
                JSONObject jsonBody= new JSONObject(jsonString);
                this.body = jsonBody;
                //System.out.println(jsonObject.getString("email"));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("IO exception Found !");
                e.printStackTrace();
            }
        }

        this.headers = header;
        this.cookies = cookies;
    }

	
}