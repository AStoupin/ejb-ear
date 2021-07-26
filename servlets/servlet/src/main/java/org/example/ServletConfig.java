package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ejb.access.LocalStatelessSessionProxyFactoryBean;

@Configuration
public class ServletConfig {

    @Bean
    public LocalStatelessSessionProxyFactoryBean myEjbBean(){
        LocalStatelessSessionProxyFactoryBean factory = new LocalStatelessSessionProxyFactoryBean();
        factory.setBusinessInterface(MyEjbInterface.class);
        factory.setJndiName("java:module/MyEjbBean");
        return factory;
    }


}
