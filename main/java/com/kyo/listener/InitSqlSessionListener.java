package com.kyo.listener;

import com.kyo.utils.SqlSessionFactoryUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitSqlSessionListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("loading!!!");
        SqlSessionFactoryUtils.initSqlSessionFactry();
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("close!!!");
        SqlSessionFactoryUtils.close();
    }
}
