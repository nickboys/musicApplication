package com.nk;

/**
 * Created by 87825 on 2018/3/27.
 */
public class Singleton1 {
    private static Singleton1 singleton1=null;

    public Singleton1() {
    }
    public static Singleton1 getInstance(){
        if (singleton1==null) {
            singleton1=new Singleton1();
        }
        return singleton1;
    }
}
