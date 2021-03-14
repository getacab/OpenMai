package org.openmai.interceptors;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.openmai.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.ContentCachingRequestWrapper;


@Component
public class RequestHandler implements HandlerInterceptor{


	@Autowired
    @Qualifier("maiRequest")
	private MAIRequest myMai1;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("------------preHandle");
        //ContentCachingRequestWrapper requestWrapper = (ContentCachingRequestWrapper) request;
        String path=request.getRequestURI();
        if(!path.contains("ping")) {
        	return true;
        }
        myMai1.doNothing();
        
		Cookie[] cookies = request.getCookies();
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
        myMai1.headers = header;
        if ("POST".equalsIgnoreCase(request.getMethod())) 
        {
            String jsonString = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
			System.out.println(jsonString);
			JSONObject jsonBody= new JSONObject(jsonString);
			myMai1.body = jsonBody;
        }

		
		String tmp = myMai1.headers.get("content-type");
		
		PingContentTypeXlation cmd = new PingContentTypeXlation(); 
		String newPath = cmd.getCommand(myMai1.headers.get("content-type"));
    	String finalPath = path.replace("ping", newPath);
    	request.getRequestDispatcher(finalPath).forward(request,response);
    	return false;
		//return HandlerInterceptor.super.preHandle(requestWrapper, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------------postHandle");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------------afterCompletion");
		//HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	

}