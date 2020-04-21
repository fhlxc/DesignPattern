package com.fhlxc.designpattern.creationmode.prototype;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午8:26:10
* @classname Citation
* @description 
*/

public class Citation implements Cloneable {

    private String name;
    private String info;
    private String college;
    
    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    
    public void display() {
        System.out.println(name + " " + info + " " + college);
    }
    
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状复制成功! ");
        return (Citation) super.clone();
    }
    
}
