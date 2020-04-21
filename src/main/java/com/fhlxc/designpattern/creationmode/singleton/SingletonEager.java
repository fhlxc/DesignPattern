package com.fhlxc.designpattern.creationmode.singleton;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午5:38:17
* @classname SingletonEager
* @description 
*/

public class SingletonEager {

    public static void main(String[] args) {
        JFrame jf = new JFrame("饿汉单例模式测试");
        jf.setLayout(new GridLayout(1, 2));
        Container contentPane = jf.getContentPane();
        Bajie obj1 = Bajie.getInstance();
        contentPane.add(obj1);
        Bajie obj2 = Bajie.getInstance();
        contentPane.add(obj2);
        if (obj1 == obj2) {
            System.out.println("同一个八戒");
        } else {
            System.out.println("不同的八戒");
        }
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
