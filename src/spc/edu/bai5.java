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
public class bai5 {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH NHAP HO VA TEN, NAM SINH DE TINH TUOI");
        Scanner nhap = new Scanner(System.in);
        System.out.println(" NHAP HO VA TEN");
        String hoten = nhap.nextLine();
        System.out.println("NHAP NAM SINH");
        int nam = nhap.nextInt();
        System.out.printf("Xin chao ban %s, ban nam nay duoc %d tuoi\n", hoten, 2025 - nam);
    }
} 

