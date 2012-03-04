package com.chetty.licence;

import com.chetty.licence.guice.module.LicenceModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Babji, Chetty
 */
public class LicenceApp {
    public static void main(String[] args) {        
        Injector injector = Guice.createInjector(new LicenceModule());
        ServiceAdapter serviceInterface = injector.getInstance(ServiceAdapter.class);
        serviceInterface.doSomething();
    }
}
