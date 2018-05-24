package com.gupao.pattern.strategy.travel;

import com.gupao.pattern.strategy.PlanResult;

/**
 * @createby: lichanghong on 2018-05-24 18:46
 **/
public class Aircraft implements Travel {
    @Override
    public PlanResult plan(int personNum, int days) {
        //单价 人/天
        double unitPrice = 200;
        double airPrice = 5000;
        System.out.println("飞机出行");
        return new PlanResult(personNum,days,(unitPrice*personNum*days)+(airPrice*personNum));
    }
}
