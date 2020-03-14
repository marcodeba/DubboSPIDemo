package com.marco.dubbospi.adaptiveExample;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

@Adaptive
public class ThriftAdaptiveExt implements AdaptiveExt {
    @Override
    public String echo(String msg, URL url) {
        return "thrift";
    }
}
