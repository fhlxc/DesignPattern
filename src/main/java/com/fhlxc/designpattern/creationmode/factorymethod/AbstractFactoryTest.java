package com.fhlxc.designpattern.creationmode.factorymethod;

/**
* @author Xingchao Long
* @date 2020年5月10日 下午5:28:06
* @classname AbstractFactoryTest
* @description
*/

public class AbstractFactoryTest {

    public static void main(String[] args) {
        try {
            Product a;
            AbstractFactory af;
            af = (AbstractFactory) ReadXML1.getObject();
            a = af.newProduct();
            a.show();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}
