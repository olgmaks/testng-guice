package com.olgmaks;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

/**
 * Created by OLEG on 31.08.2016.
 */

@Guice(modules = InjModule.class)
public class GuiceTest {

    @Inject
    private Rectangle figure;


    @Test
    public void testGuice (){
        System.out.println(figure.area());
        figure.messagedVoid();
    }
}
