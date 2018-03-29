package com.mirzoevnik.ejb.lookup.service;

import javax.ejb.Stateless;

/**
 * @author mirzoevnik
 */
@Stateless
public class TestServiceImpl implements TestService {

    public TestServiceImpl() {
        System.out.println("!CONSTRUCTOR!");
    }

    @Override
    public void run() {
        System.out.println("!RUN!");
    }
}
