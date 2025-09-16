/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author ADMIN
 */
public class bai_fibonacci {
    public static void main(String[] args) {
        int nhap=10;
        int so1=1,so2=1;
        int soketiep;
        System.out.println("so1 va so2");
        for(int i=0;i<=nhap;i++){
        soketiep=so1+so2;
        System.out.println(soketiep+" ");
        so1=so2;
        so2=soketiep;
        }
    }
}
