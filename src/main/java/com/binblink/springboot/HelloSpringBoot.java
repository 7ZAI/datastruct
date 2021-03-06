package com.binblink.springboot;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.binblink.springboot.bean.Person;
import com.binblink.springboot.component.ApplicationContextUitil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,DruidDataSourceAutoConfigure.class})
@ComponentScan(basePackages = {"com.binblink.springboot"})
public class HelloSpringBoot {

    public static void main(String[] args) {

        SpringApplication.run(HelloSpringBoot.class,args);
        Person person = (Person) ApplicationContextUitil.getBean("person");
        System.out.println(person);


    }
}
