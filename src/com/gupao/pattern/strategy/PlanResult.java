package com.gupao.pattern.strategy;

/**
 * @createby: lichanghong on 2018-05-24 18:29
 **/
public class PlanResult {
    private double money;
    private int personNum;
    private int days;

    public PlanResult(int personNum, int days,double money) {
        this.money = money;
        this.personNum = personNum;
        this.days = days;
    }

    @Override
    public String toString() {
        return "PlanResult{" +
                " personNum=" + personNum +
                ", days=" + days +
                ",总价=" + money +

                '}';
    }
}
