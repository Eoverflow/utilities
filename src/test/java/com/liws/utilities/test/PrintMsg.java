package com.liws.utilities.test;

import com.liws.utilities.eventchannel.Sub;

/**
 * Created by liweisheng on 16/9/7.
 */
public class PrintMsg {

    @Sub
    public void print(String msg){
        System.out.println(msg);
    }

    @Sub
    public void print(Integer count){
        System.out.println(count);
    }
}
