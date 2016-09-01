package com.olgmaks;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by OLEG on 31.08.2016.
 */
public class MessageListener implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        String message =  invocation.getMethod().getAnnotation(Message.class).value();

        System.out.println(message);
        return invocation.proceed();
    }
}
