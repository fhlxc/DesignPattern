package com.fhlxc.designpattern.creationmode.factorymethod;

/**
* @author Xingchao Long
* @date 2020年5月10日 下午5:01:00
* @classname ConcreteProduct1
* @description
*/

public class ConcreteProduct1 implements Product {

    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }

}
