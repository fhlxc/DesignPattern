package com.fhlxc.designpattern.creationmode.singleton;

/**
* @author Xingchao Long
* @date 2020年4月13日 下午9:40:47
* @classname LazySingleton
* @description 
* 懒汉单例模式，当调用getInstance方法时才会生成
*/

public class LazySingleton {
    
    private static volatile LazySingleton instance = null;
    
    private LazySingleton() {
        //避免类在外部使用默认的构造函数被实例化
    }
    
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        } else {
            System.out.println("单例对象已经创建！");
        }
        return instance;
    }

}
