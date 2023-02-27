package com.example.servletjsp;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationContextListener implements ServletContextListener {


    //서블릿 컨텍스트가 생성될때 실행되는 메서드
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("create");
    }
    // ServletContext 서블릿 컨텍스트(ServletContext)란
    // 하나의 서블릿이 서블릿 컨테이너와 통신하기 위해서 사용되어지는 메서드들을 가지고 있는 클래스가 바로 ServletContext다.

    /*
     서블릿 컨텍스트가 파괴될때 실행되는 메서드
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Dede");
    }
}
