package com.springboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassKLM {

    @Autowired
    @Qualifier("classABC")  // Or use "classXYZ" to switch implementation
    private InterfacePQR pqr;

    public void run() {
        pqr.display();
    }
}
