/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;



/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner nhap = new Scanner(System.in);

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhap" + (i+1) + ": ");
            x[i] = nhap.nextInt();
        }

  
        System.out.print("nhap: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

       
        int lonnhat = 0; 
        for (int i = 1; i < 10; i++) {
            if (x[i] > lonnhat ) {
                lonnhat = x[i]; 
            }
        }

        // In kết quả số lớn nhất
        System.out.println("So lon nhat trong mang la: " + lonnhat);
    }
}
