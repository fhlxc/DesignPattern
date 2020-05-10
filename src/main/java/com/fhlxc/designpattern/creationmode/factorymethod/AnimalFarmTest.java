package com.fhlxc.designpattern.creationmode.factorymethod;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
* @author Xingchao Long
* @date 2020年5月10日 下午8:32:55
* @classname AnimalFarmTest
* @description
*/

interface Animal {
    public void show();
}

class Horse implements Animal {
    
    JScrollPane sp;
    JFrame jf = new JFrame("抽象工厂模式测试");
    
    public Horse() {
        Container container = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1));
        p1.setBorder(BorderFactory.createTitledBorder("动物：马"));
        sp = new JScrollPane(p1);
        container.add(sp, BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("img/A_Horse.png")));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void show() {
        jf.setVisible(true);
    }
    
}

class Cattle implements Animal {
    
    JScrollPane sp;
    JFrame jf = new JFrame("抽象工厂模式测试");
    
    public Cattle() {
        Container contentPane = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1));
        p1.setBorder(BorderFactory.createTitledBorder("动物：牛"));
        sp = new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("img/A_Cattle.png")));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void show() {
        jf.setVisible(true);
    }
    
}

interface Plant {
    public void show();
}

class Fruitage implements Plant {
    
    JScrollPane sp;
    JFrame jf = new JFrame("抽象工厂模式测试");
    
    public Fruitage() {
        Container contentPane = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1));
        p1.setBorder(BorderFactory.createTitledBorder("植物：水果"));
        sp = new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("img/P_Fruitage.png")));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void show() {
        jf.setVisible(true);
    };
    
}

interface Farm {
    
    public Animal newAnimal();
    public Plant newPlant();
    
}

class SGfarm implements Farm {
    
    public SGfarm() {
    }
    
    public Animal newAnimal() {
        System.out.println("新牛出生");
        return new Cattle();
    };
    
    public Plant newPlant() {
        System.out.println("蔬菜长成");
        return new Vegetables();
    };
    
}

class SRfarm implements Farm {
    
    public SRfarm() {
    }
    
    public Animal newAnimal() {
        System.out.println("新马出生");
        return new Horse();
    };
    
    public Plant newPlant() {
        System.out.println("水果长成");
        return new Fruitage();
    };
    
}

class Vegetables implements Plant {
    
    JScrollPane sp;
    JFrame jf = new JFrame("抽象工厂模式测试");
    
    public Vegetables() {
        Container contentPane = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1));
        p1.setBorder(BorderFactory.createTitledBorder("植物：蔬菜"));
        sp = new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("img/P_Vegetable.png")));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void show() {
        jf.setVisible(true);
    };
    
}

class ReadXML {
    
    public static Object getObject() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/main/resources/factorymode/config2.xml"));
            NodeList n1 = doc.getElementsByTagName("className");
            Node classNode = n1.item(0).getFirstChild();
            String cName = "com.fhlxc.designpattern.creationmode.factorymethod." + classNode.getNodeValue();
            System.out.println("新类名：" + cName);
            Class<?> c = Class.forName(cName);
            Object object = c.getConstructor().newInstance();
            return object;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
    }
    
}

public class AnimalFarmTest {

    public static void main(String[] args) {
        Farm f;
        Animal a;
        Plant p;
        f  = (Farm) ReadXML.getObject();
        a = f.newAnimal();
        p = f.newPlant();
        a.show();
        p.show();
    }

}
