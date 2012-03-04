package com.chetty.licence;

import com.google.inject.Inject;

/**
 * Service Adapter.
 * 
 * @author Babji, Chetty
 */
public class ServiceAdapter {
    private final Service service;

    @Inject
    public ServiceAdapter(Service service) {
        this.service = service;
    }

    public void doSomething() {
        service.doSomething1();
        service.doSomething2();
    }
}