package com.chetty.licence;

/**
 * Service Interface Implementation.
 * 
 * @author Babji, Chetty
 */
public class ServiceImpl1 implements Service {    
    public void doSomething1() {
        System.out.println("I'm doing something - 1");
    }

    @LicenceRequired
    public void doSomething2() {
        System.out.println("I'm doing something - 2");
    }
}
