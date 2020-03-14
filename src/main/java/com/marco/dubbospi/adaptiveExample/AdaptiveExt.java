package com.marco.dubbospi.adaptiveExample;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("dubbo")
public interface AdaptiveExt {
    //@Adaptive
    @Adaptive({"t"})
    String echo(String msg, URL url);
}
