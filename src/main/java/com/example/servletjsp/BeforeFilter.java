package com.example.servletjsp;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.LogRecord;

public class BeforeFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("필터체인을 거치는중");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("필터체인을 거친 후");

    }
}
