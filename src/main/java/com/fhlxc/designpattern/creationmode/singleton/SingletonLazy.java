package com.fhlxc.designpattern.creationmode.singleton;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午5:10:02
* @classname SingletonLazy
* @description 
*/

public class SingletonLazy {

    public static void main(String[] args) {
        President p1 = President.getInstance();
        p1.getName();
        President p2 = President.getInstance();
        p2.getName();
        if (p1 == p2) {
            System.out.println("同一个人");
        } else {
            System.out.println("不同的人");
        }
    }

}
