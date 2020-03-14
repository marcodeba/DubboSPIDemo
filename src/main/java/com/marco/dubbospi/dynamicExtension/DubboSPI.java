package com.marco.dubbospi.dynamicExtension;

import com.marco.dubbospi.Robot;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;

public class DubboSPI {
    public static void main(String[] args) {
//        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
//        System.out.println(protocol);

        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot robot = extensionLoader.getAdaptiveExtension();
        URL url = new URL("", "", 1, new HashMap<String, String>() {
            {
                this.put("robot", "bumblebee");
            }
        });
        System.out.println(robot.echo(url));
    }
}
