package com.example.desix.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class LogginFiilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("###########  init LoggingFilter  #############");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        Cookie[] arrayCookies = httpServletRequest.getCookies();
        boolean checkIt = false;

        if (arrayCookies == null) {
            httpServletResponse.sendRedirect("image");
        } else {

            for (Cookie cookie : arrayCookies) {
                if (cookie.getName().equals("dima")) checkIt = true;
            }

            if (checkIt) {
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                httpServletResponse.sendRedirect("image");
            }
        }
    }
}

