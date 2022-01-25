package com.ron.test.boottester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.xml.crypto.Data;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan("com.ron.test")
public class BootTesterApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(BootTesterApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
