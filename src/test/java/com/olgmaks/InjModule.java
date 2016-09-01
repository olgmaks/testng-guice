package com.olgmaks;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 * Created by OLEG on 31.08.2016.
 */
public class InjModule extends AbstractModule {
    @Override
    protected void configure() {

        MessageListener listener = new MessageListener();

        bindInterceptor(Matchers.any() , Matchers.annotatedWith(Message.class),
                listener);
//        bind(IFigure.class).to(Rectangle.class);
    }
}
