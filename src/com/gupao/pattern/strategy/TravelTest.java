package com.gupao.pattern.strategy;

import com.gupao.pattern.strategy.travel.Aircraft;
import com.gupao.pattern.strategy.travel.Train;
import com.gupao.pattern.strategy.travel.TravelType;

/**
 * @createby: lichanghong on 2018-05-24 18:43
 **/
public class TravelTest {
    public static void main(String[] args) {
        Order order = new Order(2,4);
        System.out.println(order.plan(TravelType.AIRCRAFT));
    }
}
