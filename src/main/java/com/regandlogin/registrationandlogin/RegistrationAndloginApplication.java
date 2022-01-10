package com.regandlogin.registrationandlogin;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class RegistrationAndloginApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationAndloginApplication.class, args);
    }

}
