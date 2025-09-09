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
public class bai7 {
    public static void main(String[] args) {
        System.out.println("tinh chu chu vi dien tich hinh chu nhat");
        double dai, rong, dientich, chuvi;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = nhap.nextDouble();
        System.out.print("Nhap chieu rong: ");
        rong = nhap.nextDouble();
        chuvi = (dai + rong) * 2;
        dientich = dai * rong;
      System.out.print("chu vi hinh chu nhat la:" + chuvi); 
	System.out.print("dien tich hinh chu nhat la:" + dientich);
    }
}
