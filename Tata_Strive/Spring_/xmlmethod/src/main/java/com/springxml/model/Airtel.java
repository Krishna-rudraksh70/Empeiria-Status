package com.springxml.model;

import com.springxml.dao.TRAI;

public class Airtel implements TRAI {

    @Override
    public void getSIM() {
        System.out.println("Airtel Sim");
    }

}
