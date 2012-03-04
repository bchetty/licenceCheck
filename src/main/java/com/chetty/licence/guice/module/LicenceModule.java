package com.chetty.licence.guice.module;

import com.chetty.licence.LicenceRequired;
import com.chetty.licence.LicenceChecker;
import com.chetty.licence.Service;
import com.chetty.licence.ServiceImpl1;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 *
 * @author b.chetty
 */
public class LicenceModule extends AbstractModule {
    protected void configure() {
        LicenceChecker licenceChecker = new LicenceChecker();
        requestInjection(licenceChecker);
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(LicenceRequired.class), licenceChecker);

        bind(Service.class).to(ServiceImpl1.class);
    }
}
