/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai8 {
 public static void main(String[] args){
 System.out.println("tinh chu chu vi dien tich hinh tron");
 double pi, chuvi, dientich, bankinh;
  Scanner nhap = new Scanner(System.in);
  pi = 3.14;
System.out.println("nhap ban kinh:");
 bankinh = nhap.nextDouble();
 chuvi = 2 * pi * bankinh;
 dientich = pi * (bankinh * bankinh);
 	System.out.println("chu vi hinh tron la:" + chuvi) ;
       System.out.println("dien tich hinh tron la:" + dientich);
   }
}
