package com.nk;

/**
 * Created by 87825 on 2018/3/27.
 */
public class Singleton {
    private  static  Singleton singleton=new Singleton();

    public Singleton() {
    }
    public static Singleton getInstance(){
        return singleton;
    }
}
