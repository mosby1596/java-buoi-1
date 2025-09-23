/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class bai20_arry {
    public static void main(String[] args) {
         System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Chương trình nhập vào Arraylist");
        ArrayList<String> s = new ArrayList<String>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("E");
        s.add("H");
        s.remove(2);
        s.remove("A");
        for (int i = 0; i < s.size(); i++){
            System.out.println(s.get(i));
        }
    }
}
