package com.marco.dubbospi;


import org.apache.dubbo.common.URL;

public class RobotWrapper implements Robot {
    private Robot robot;

    public RobotWrapper(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void sayHello() {
        System.out.println("before --------------");
        robot.sayHello();
        System.out.println("after --------------");
    }

    @Override
    public String echo(URL url) {
        System.out.println("call RobotWrapper echo--------------");
        return robot.echo(url);
    }
}
