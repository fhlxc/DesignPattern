package com.fhlxc.designpattern.creationmode.singleton;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午5:38:47
* @classname Bajie
* @description 
*/

@SuppressWarnings("serial")
public class Bajie extends JPanel {
    
    private static Bajie bajie = new Bajie();
    
    private Bajie() {
        JLabel label = new JLabel(new ImageIcon("./img/bajie.png"));
        File file = new File("img/bajie.png");
        if (!file.exists()) {
            System.out.println("图片不存在");
        }
        this.add(label);
    }
    
    public static Bajie getInstance() {
        return bajie;
    }
    
}
