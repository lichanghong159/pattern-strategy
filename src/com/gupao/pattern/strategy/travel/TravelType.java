package com.gupao.pattern.strategy.travel;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @createby: lichanghong on 2018-05-24 18:34
 **/
public enum  TravelType {
        TRAIN(new Train()),
    AIRCRAFT(new Aircraft());

   private Travel travel;

    TravelType(Travel travel) {
        this.travel = travel;
    }
    public Travel getType(){return this.travel;}
}
