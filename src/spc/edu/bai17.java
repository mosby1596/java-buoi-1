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
public class bai17 {
    public static void main(String[] args) {
        
        System.out.println("tinh so thoc");
        Scanner nhap = new Scanner(System.in);
        int so0,sothoc;
         System.out.println("nhap so");
         so0 = nhap.nextInt();
         double tongthoc = 0;
         sothoc = 0;
         if (so0 > 64){
          System.out.println( "tren ban co co chi co 64 o");
         }
         for (int i = 0; i < so0; i++){
         tongthoc = tongthoc + Math.pow(2, i);
         System.out.println( "o thu:" + i+1 + ":" + Math.pow(2, i) + sothoc);
         }
          System.out.println("tong so thoc la:" + tongthoc);
        
    }
}
