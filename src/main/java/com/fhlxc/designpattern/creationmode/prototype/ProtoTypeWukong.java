package com.fhlxc.designpattern.creationmode.prototype;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午8:07:36
* @classname ProtoTypeWukong
* @description 
*/

public class ProtoTypeWukong {

    public static void main(String[] args) {
        JFrame jf = new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container container = jf.getContentPane();
        SunWuKong obj1 = new SunWuKong();
        container.add(obj1);
        SunWuKong onj2 = (SunWuKong) obj1.clone();
        container.add(onj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
