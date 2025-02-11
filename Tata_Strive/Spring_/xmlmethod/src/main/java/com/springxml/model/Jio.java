package com.springxml.model;

import com.springxml.dao.TRAI;

public class Jio implements TRAI {

    @Override
    public void getSIM() {
        System.out.println("JIO Sim");
    }

}
