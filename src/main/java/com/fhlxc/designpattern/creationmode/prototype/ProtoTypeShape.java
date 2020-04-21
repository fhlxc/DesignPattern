package com.fhlxc.designpattern.creationmode.prototype;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午8:52:37
* @classname ProtoTypeShape
* @description 
*/

public class ProtoTypeShape {

    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = (Circle) pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = (Shape) pm.getShape("Square");
        obj2.countArea();
    }

}
