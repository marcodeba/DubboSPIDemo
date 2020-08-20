package com.marco.dubbospi.staticExtension;

import com.marco.javaspi.Robot;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

// 静态扩展点
public class DubboSPI {
    public static void main(String[] args) {
//        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
//        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
//        optimusPrime.sayHello();

        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot robot = extensionLoader.getExtension("dubboPrime");

        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("robot", "bumblebee");
        URL url = new URL("", "", 1, paramMap);
        System.out.println(robot.echo(url));
    }
}
