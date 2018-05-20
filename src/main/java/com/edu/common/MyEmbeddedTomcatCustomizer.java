package com.edu.common;

import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

/**
 * @Title: MyCustomizer.java
 * @Package com.edu.common
 * @Description: tomcat 优化
 * @Author ZhangYB
 * @Date 2018-05-20 11:55
 * @Version V1.0
 */
@Component
public class MyEmbeddedTomcatCustomizer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {

        ((TomcatServletWebServerFactory)factory).addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
            connector.setPort(8888);
            Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
            //最大连接数
            protocol.setMaxConnections(200);
            //设置最大线程数
            protocol.setMaxThreads(200);
            //设置选择器超时
            protocol.setSelectorTimeout(3000);
            //设置会话超时
            protocol.setSessionTimeout(3000);
            //设置连接超时
            protocol.setConnectionTimeout(3000);
        });

    }
}
