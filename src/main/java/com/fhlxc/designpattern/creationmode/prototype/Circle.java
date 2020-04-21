package com.fhlxc.designpattern.creationmode.prototype;

import java.util.Scanner;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午8:35:00
* @classname Circle
* @description 
*/

public class Circle implements Shape {

    @Override
    public void countArea() {
        int r = 0;
        System.out.println("这是一个圆, 请输入圆的半径: ");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积=" + 3.1415 * r * r);
    }

    @Override
    public Object clone() {
        Circle w = null;
        try {
            w = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("复制圆失败! ");
        }
        return w;
    }
    
}
