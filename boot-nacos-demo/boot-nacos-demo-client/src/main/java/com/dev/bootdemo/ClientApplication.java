package com.dev.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:rpc-sofa-boot-cusumer.xml"})
public class ClientApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(ClientApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);

        HelloService helloSyncServiceReference = (HelloService) applicationContext
                .getBean("helloSyncServiceReference");

        System.out.println(helloSyncServiceReference.sayHello("sync"));
    }

}
