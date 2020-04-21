package com.fhlxc.designpattern.creationmode.singleton;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午5:06:38
* @classname HungrySingleton
* @description 
*/

public class HungrySingleton {

    public static final HungrySingleton instance = new HungrySingleton();
    
    private HungrySingleton() {
        //todo 防止被实例化
    }
    
    public HungrySingleton getInstance() {
        return instance;
    }
    
}
