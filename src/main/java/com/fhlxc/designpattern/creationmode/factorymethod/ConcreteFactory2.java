package com.fhlxc.designpattern.creationmode.factorymethod;

/**
* @author Xingchao Long
* @date 2020年5月10日 下午5:07:52
* @classname ConcreteFactory2
* @description
*/

public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }

}
