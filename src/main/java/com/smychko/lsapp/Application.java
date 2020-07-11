package com.smychko.lsapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        DirectoryPrinter directoryPrinter = context.getBean("directoryPrinter", DirectoryPrinter.class);

        directoryPrinter.print("C:/Git");

    }
}