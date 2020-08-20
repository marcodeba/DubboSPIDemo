package com.marco.javaspi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("optimusPrime")
public interface Robot {
    void sayHello();

    @Adaptive("robot")
    String echo(URL url);
}
