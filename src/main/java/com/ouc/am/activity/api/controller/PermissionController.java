package com.ouc.am.activity.api.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class PermissionController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	//@ResponseBody
	public void hellotxt(HttpServletResponse response) throws IOException{
		Subject subject = SecurityUtils.getSubject();
        if (subject == null || subject.getPrincipals() == null) {
            //return null;
        }
        //return "hello " + (String) subject.getPrincipals().getPrimaryPrincipal();
        response.sendRedirect("http://localhost:8081/#/main");
	}
}
