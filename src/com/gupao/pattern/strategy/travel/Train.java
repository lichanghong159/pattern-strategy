package com.gupao.pattern.strategy.travel;

import com.gupao.pattern.strategy.PlanResult;

/**
 * @createby: lichanghong on 2018-05-24 18:34
 **/
public class Train implements Travel {
    @Override
    public PlanResult plan(int personNum, int days) {
        //单价 人/天
        double unitPrice = 200;
        double tainPrice = 500;
        System.out.println("火车出行");
        return new PlanResult(personNum,days,(unitPrice*personNum*days)+(tainPrice*personNum));
    }
}
