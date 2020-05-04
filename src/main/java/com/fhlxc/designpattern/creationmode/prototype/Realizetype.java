package com.fhlxc.designpattern.creationmode.prototype;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午7:50:47
* @classname Realizetype
* @description 
*/

public class Realizetype implements Cloneable {
    
    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }
    
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
    
}
