package com.nk;

/**
 * Created by 87825 on 2018/3/27.
 */
public class Singleton2 {
    private static Singleton2 singleton2=null;

    public Singleton2() {
    }

    public static Singleton2 getInstance(){
        if (singleton2==null) {
              synchronized (Singleton2.class){
                    if (singleton2==null){
                        singleton2=new Singleton2();

                    }
              }
        }
        return singleton2;
    }

}
