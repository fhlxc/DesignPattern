package com.fhlxc.designpattern.creationmode.prototype;

import java.util.Scanner;

/**
* @author Xingchao Long
* @date 2020年4月21日 下午8:43:12
* @classname Square
* @description 
*/

public class Square implements Shape {

    @Override
    public void countArea() {
        int a = 0;
        System.out.println("这是一个正方形, 请输入它的边长: ");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("该正方形的面积=" + a * a);
    }
    
    @Override
    public Object clone() {
        Square b = null;
        try {
            b = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("复制方形失败! ");
        }
        return b;
    }

}
