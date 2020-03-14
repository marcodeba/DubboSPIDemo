package com.marco.dubbospi;

import org.apache.dubbo.common.URL;

public class Bumblebee implements Robot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }

    @Override
    public String echo(URL url) {
        return "echo, I am Bumblebee";
    }
}