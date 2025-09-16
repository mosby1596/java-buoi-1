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
public class bai15 {
    public static void main(String[] args) {
         System.out.println("Tinh giai thua");
         int so,giaithua=1;
         Scanner nhap = new Scanner(System.in);
          System.out.println("nhap so");
         so = nhap.nextInt();
          for (int i = 1; i <=so ; i++)
		{
			giaithua *= i;
		}
          System.out.println( so + "!" + "=" + giaithua );
    }
}
