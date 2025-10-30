package com.anidev.securityservice.securityserv;

import com.anidev.securityservice.securityserv.config.RsaKeysConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
//Habilita la carga de propiedades de las claces RSA
@EnableConfigurationProperties(RsaKeysConfig.class)
public class SecurityServApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityServApplication.class, args);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
