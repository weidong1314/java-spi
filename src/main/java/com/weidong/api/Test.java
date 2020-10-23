package com.weidong.api;

import java.util.ServiceLoader;

public class Test {

    public static void main(String[] args) {

        ServiceLoader<SPIService> loader = ServiceLoader.load(SPIService.class);
        loader.forEach(t -> {
            t.execute();
        });
    }
}
