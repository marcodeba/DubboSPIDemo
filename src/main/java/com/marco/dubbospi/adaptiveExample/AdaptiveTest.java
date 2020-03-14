package com.marco.dubbospi.adaptiveExample;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * 1. 在类上加上@Adaptive注解的类，是最为明确的创建对应类型Adaptive类,所以他优先级最高。
 * 2. @SPI注解中的value是默认值，如果通过URL获取不到关于取哪个类作为Adaptive类的话就使用这个默认值，
 *      当然如果URL中可以获取到，就用URL中的。
 * 3. 方法上增加@Adaptive注解，注解中的value与URL中的参数的key一致，URL中的key对应的value就是spi中的name，获取相应的实现类。
 */
public class AdaptiveTest {
    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }

    // SPI注解中有value值
    public static void test1() {
        ExtensionLoader<AdaptiveExt> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test");
        System.out.println(adaptiveExtension.echo("d", url));
    }

    /**
     * SPI注解中有value值，URL中也有具体的值
     * SPI注解中有value值,实现类上没有@Adaptive注解，在方法上打上@Adaptive注解，
     * 注解中的value与链接中的参数的key一致，链接中的key对应的value就是spi中的name,获取相应的实现类
     */
    public static void test2() {
        ExtensionLoader<AdaptiveExt> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?t=cloud");
        System.out.println(adaptiveExtension.echo("d", url));
    }

    // SPI注解中有value值，URL中也有具体的值,ThriftAdaptiveExt上有@Adaptive注解
    public static void test3() {
        ExtensionLoader<AdaptiveExt> loader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?adaptive.ext=cloud");
        System.out.println(adaptiveExtension.echo("d", url));
    }
}
