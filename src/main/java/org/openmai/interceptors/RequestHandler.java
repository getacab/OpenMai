package org.openmai.interceptors;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openmai.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.ContentCachingRequestWrapper;


@Component
public class RequestHandler implements HandlerInterceptor{


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------------preHandle");
        ContentCachingRequestWrapper requestWrapper = (ContentCachingRequestWrapper) request;
        String path=requestWrapper.getRequestURI();
        if(!path.contains("ping")) {
        	return true;
        }
        
        
		Cookie[] cookies = requestWrapper.getCookies();
		MAIRequest req = new MAIRequest(requestWrapper);
		//System.out.println(request.getAttribute("requestDispatcherPath"));
		//System.out.println(request.getPathInfo());
		
		String tmp = req.headers.get("content-type");
		
		PingContentTypeXlation cmd = new PingContentTypeXlation(); 
		String newPath = cmd.getCommand(req.headers.get("content-type"));
        if(path.contains("ping")) {
        	String finalPath = path.replace("ping", newPath);
        	request.getRequestDispatcher(finalPath).forward(requestWrapper,response);
        	return true;
        }
		return HandlerInterceptor.super.preHandle(requestWrapper, response, handler);
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
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	

}
