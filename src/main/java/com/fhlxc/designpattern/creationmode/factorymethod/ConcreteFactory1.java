package com.fhlxc.designpattern.creationmode.factorymethod;

/**
* @author Xingchao Long
* @date 2020年5月10日 下午5:06:51
* @classname ConcreteFactory1
* @description
*/

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }

}
