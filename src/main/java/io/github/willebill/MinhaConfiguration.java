package io.github.willebill;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean(name = "applicationName")
    public String aplicationName() {
        return "Sistema de Vendas";
    }
}
