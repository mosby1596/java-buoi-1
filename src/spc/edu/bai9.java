/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        System.out.println("Cac thang trong nam");
        int thang;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap thang:");
        thang = nhap.nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 ngay");
                break;
            case 2:
                System.out.println("29 ngay"); // Hoặc xử lý năm nhuận nếu cần
                break;
            default:
                System.out.println("Thang khong hop le!");
        }
    }
}
