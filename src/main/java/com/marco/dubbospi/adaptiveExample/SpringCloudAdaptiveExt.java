package com.marco.dubbospi.adaptiveExample;

import org.apache.dubbo.common.URL;

public class SpringCloudAdaptiveExt implements AdaptiveExt {

    @Override
    public String echo(String msg, URL url) {
        return "spring cloud";
    }
}
