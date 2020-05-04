package com.fhlxc.designpattern.creationmode.prototype;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午8:00:06
* @classname SunWuKong
* @description 
*/

@SuppressWarnings("serial")
public class SunWuKong extends JPanel implements Cloneable {

    public SunWuKong() {
        URL url = getClass().getClassLoader().getResource("img/sunwukong.png");
        JLabel label = new JLabel(new ImageIcon(url));
        this.add(label);
    }
    
    public Object clone() {
        SunWuKong w = null;
        try {
            w = (SunWuKong) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("复制悟空失败！");
        }
        return w;
    }
    
}
