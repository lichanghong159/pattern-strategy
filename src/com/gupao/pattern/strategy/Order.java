package com.gupao.pattern.strategy;

import com.gupao.pattern.strategy.PlanResult;
import com.gupao.pattern.strategy.travel.Travel;
import com.gupao.pattern.strategy.travel.TravelType;

/**
 * @createby: lichanghong on 2018-05-24 18:26
 **/
public class Order {
    private int personNum;
    private int days;

    public Order(int personNum, int days) {
        this.personNum = personNum;
        this.days = days;
    }

    public PlanResult plan(TravelType travelType){
        return travelType.getType().plan(this.personNum,this.days);
    }
}
