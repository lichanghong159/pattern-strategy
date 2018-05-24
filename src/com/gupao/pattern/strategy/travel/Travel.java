package com.gupao.pattern.strategy.travel;

import com.gupao.pattern.strategy.PlanResult;

/**
 * 旅行
 * @createby: lichanghong on 2018-05-24 18:09
 **/
public interface Travel {
    /**
     * 旅游计划
     * @param personNum 人数
     * @param days 天数
     */
    public PlanResult plan(int personNum, int days);
}
