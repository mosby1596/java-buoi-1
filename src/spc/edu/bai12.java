/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author ADMIN
 */
public class bai12 {
    public static void main(String[] args) {
        System.out.println("Tinh luy thua"); 

        int so = 2;
        int mu = 6;
        int luythua = 1;

        for (int i = 1; i <= mu; i++) {
            luythua *= so;
        }

        System.out.println(so + "^" + mu + " = " + luythua);
    }  
}

 
