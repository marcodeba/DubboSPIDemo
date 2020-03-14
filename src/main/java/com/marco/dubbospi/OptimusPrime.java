package com.marco.dubbospi;

import org.apache.dubbo.common.URL;

public class OptimusPrime implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }

    @Override
    public String echo(URL url) {
        return "echo, I am OptimusPrime";
    }
}
