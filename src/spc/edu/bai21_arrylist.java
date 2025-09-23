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
public class bai21_arrylist {
    public static void main(String[] args) {
        System.out.println("chuong trinh nhap vao arrylist");
        Arrylist <String> sinhvien = new Arrylist <String>();
         Scanner nhap = new Scanner(System.in);
          
         while(true){
          System.out.print("nhap ten sinh vien");
           String s = nhap.next();
           
           if("0".equals(s)) break;
           
           sinhvien.add(s);
         }
              System.out.print("danh sach sinh vien la:"+sinhvien.toString());
              System.out.print("\ntong so co:"+sinhvien.size()+"sinh vien");
    }
}
