package com.fhlxc.designpattern.creationmode.prototype;

import java.util.HashMap;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午8:49:04
* @classname ProtoTypeManager
* @description 
*/

public class ProtoTypeManager {

    private HashMap<String, Shape> ht = new HashMap<>();
    
    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }
    
    public void addshape(String key, Shape obj) {
        ht.put(key, obj);
    }
    
    public Shape getShape(String key) {
        Shape temp = ht.get(key);
        return (Shape) temp.clone();
    }
    
}
