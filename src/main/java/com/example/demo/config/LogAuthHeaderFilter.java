package com.example.demo.config;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class LogAuthHeaderFilter implements Filter {
	

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        String auth = req.getHeader("Authorization");
        System.out.println(">>> Authorization header diterima: " + auth);
        chain.doFilter(request, response);
    }

}
