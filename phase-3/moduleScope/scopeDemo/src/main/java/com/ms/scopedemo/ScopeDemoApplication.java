package com.ms.scopedemo;

import com.ms.scopedemo.bean.MyBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class ScopeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScopeDemoApplication.class, args);
    }

    @Bean
    @Scope("singleton")
    public MyBean singletonBean() {  // the bean name is singletonBeaN
        return new MyBean("singleton");
    }

    @Bean
    @Scope("prototype")
    public MyBean prototypeBean() {
        return new MyBean("prototype");
    }

    @Bean
    public CommandLineRunner run(ApplicationContext context) {
        return args -> {


            System.out.println("\n===== SINGLETON =====");

            MyBean s1 = (MyBean) context.getBean("singletonBean");
            MyBean s2 = (MyBean) context.getBean("singletonBean");


            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
            System.out.println("Same Object ? " + (s1 == s2));   // true (same instances)


            System.out.println("\n===== PROTOTYPE =====");
            MyBean p1 = (MyBean) context.getBean("prototypeBean");
            MyBean p2 = (MyBean) context.getBean("prototypeBean");
            System.out.println("p1 hashCode: " + p1.hashCode());
            System.out.println("p2 hashCode: " + p2.hashCode());
            System.out.println("Same Object? " + (p1 == p2)); // false (different instances)
        };
    }
}
