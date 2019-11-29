package com.dev.bootdemo;



public class HelloServiceImpl implements HelloService {

    public String sayHello(String string) {
        System.out.println("Server receive: " + string);
        return "hello " + string + " ！";
    }
}
