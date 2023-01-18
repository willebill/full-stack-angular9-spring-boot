package io.github.willebill;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MinhaConfiguration {

    @Bean(name = "applicationName")
    public String aplicationName() {
        return "Sistema de Vendas";
    }
}
