package com.fhlxc.designpattern.creationmode.singleton;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午5:11:48
* @classname President
* @description 
*/

public class President {
    
    private static volatile President president = null;
    
    private President() {
        System.out.println("总统被创建。");
    }
    
    public static synchronized President getInstance() {
        if (president == null) {
            president = new President();
        } else {
            System.out.println("总统已经被创建了");
        }
        return president;
    }
    
    public void getName() {
        System.out.println("我是美国总统——特朗普");
    }

}
