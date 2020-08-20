package com.marco.javaspi;

import java.util.ServiceLoader;

public class JavaSPI {
    public static void main(String[] args) {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        serviceLoader.forEach((robot) -> robot.sayHello());
    }
}
