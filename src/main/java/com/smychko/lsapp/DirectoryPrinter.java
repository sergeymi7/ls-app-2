package com.smychko.lsapp;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class DirectoryPrinter {

    private final DirectoryReader directoryReader;

    public DirectoryPrinter(DirectoryReader directoryReader) {
        this.directoryReader = directoryReader;
    }

    public void print (String patch) {
            File dir = directoryReader.read(patch);

            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println("Каталог: " + item.getName());
                } else {
                    System.out.println("Файл: " + item.getName());
                }
            }
    }
}
