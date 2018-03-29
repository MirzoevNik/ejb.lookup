package com.mirzoevnik.ejb.lookup.listener;

import com.mirzoevnik.ejb.lookup.service.TestService;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author mirzoevnik
 */
public class StartupContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("!START!");
        try {
            InitialContext ctx = new InitialContext();
            TestService testService = (TestService)ctx.lookup("ejblocal:" + TestService.class.getName());
            testService.run();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}