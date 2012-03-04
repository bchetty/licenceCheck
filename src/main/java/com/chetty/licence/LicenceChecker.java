package com.chetty.licence;

import com.google.inject.Inject;
import java.util.Scanner;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *
 * @author Babji, Chetty
 */
public class LicenceChecker implements MethodInterceptor {
    @Inject
    private Licence licence;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //Get License String from the user. You can read the licence string from a licence-file, from connsole, etc options.
        //In this case, I'm just reading it from the console.
        System.out.println("You need a valid Licence to use this functionality...Please enter your Licence string: ");
        Scanner input = new Scanner(System.in);
        String licenceString = input.nextLine();
                                
        if(!licence.checkLicence(licenceString)) {
            //Here, you can either throw an exception and show a "Invalid Licence" message or customize it according to your needs.            
            System.out.println("Invalid Licence!");
            throw new IllegalStateException("Invalid Licence : " + invocation.getMethod().getName());
        }
        
        return invocation.proceed();
    }
}