package com.marco.dubbospi;

import org.apache.dubbo.common.URL;

public class DubboPrime implements Robot {
    Robot robot = null;

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void sayHello() {}

    @Override
    public String echo(URL url) {
        return robot.echo(url);
    }
}
