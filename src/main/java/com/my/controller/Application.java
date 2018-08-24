package com.my.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.MultipartConfigElement;

/**
 * Description: To do
 * <p>
 * Author : Adore Chen
 * Created: 2018-08-23
 */
@SpringBootApplication
public class Application {

    private int MAX_UPLOAD_SIZE = 5 * 1024 * 1024;

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext){
       return args -> {
            System.out.println("Picture Search Application Started ... ===>");
        };
    }

    @Bean
    MultipartConfigElement multipartConfigElement() {
        return new MultipartConfigElement(System.getProperty("java.io.tmpdir"),
                MAX_UPLOAD_SIZE, MAX_UPLOAD_SIZE * 2, MAX_UPLOAD_SIZE / 2);
    }

    @Bean
    public StandardServletMultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }

}
