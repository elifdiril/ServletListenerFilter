package com.demo;

import javax.servlet.ServletContextEvent;

/**
 * @author Elif
 */
public class ServContListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context create");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context destroy");
    }
}
