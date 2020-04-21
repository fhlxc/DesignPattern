package com.fhlxc.designpattern.creationmode.prototype;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午8:33:45
* @classname Shape
* @description 
*/

public interface Shape extends Cloneable {

    public Object clone();
    public void countArea();
    
}
