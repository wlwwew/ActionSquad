package com.wlw.test01;

/**
 * @Author:吴林蔚
 * @Date:Create in 2022/9/25 16:51
 */
import java.util.Scanner;

public class main {
    public static String toString(double x)
    {
        String yuan="亿千百拾万千百拾元";
        String small = "分角";
        String digit="零壹贰叁肆伍陆柒捌玖";
        String result="";
        int y=(int)x*100/100;
        for (int i=0;  y>0 && i<small.length();  i++, y/=10)
            result = ""+digit.charAt(y % 10)+small.charAt(i)+result;
        y=(int)x;
        for (int i=yuan.length()-1;  y>0 && i>0;  i--, y/=10)
            result = ""+digit.charAt(y % 10)+yuan.charAt(i)+result;

return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字");
        System.out.println("");
        double nub=sc.nextDouble();
        System.out.println(toString(nub));

    }
}

