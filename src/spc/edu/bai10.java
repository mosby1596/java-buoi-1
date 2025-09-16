/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author ADMIN
 */
public class bai10 {
    public static void main(String[] args) {
         System.out.println("chuong trinh tinh tong");
         int tong=0,dem=0;
        
           for (int i = 27; i <= 50; i++) {
            if (i % 3 == 0) {
                tong += i;
                dem++;
            }
        }
         if (dem > 0) {
            double trungbinh = (double) tong / dem;
            System.out.println("Tinh Trung binh cong" + trungbinh);
             } 
         }
    }
