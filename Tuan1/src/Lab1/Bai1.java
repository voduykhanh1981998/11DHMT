/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai1 {
    public static void main(String[] args) {
        String hoTen;
        Scanner duyKhanh =new Scanner(System.in);
        
        System.out.println(" Họ Và Tên:");
         hoTen = duyKhanh .nextLine();
        
        System.out.println("Nhập Điểm TB ");
        double diemTB=duyKhanh .nextDouble();
        System.out.println("Tên nhập là "+hoTen+" Điểm Trung Bình là "+diemTB);
    }
}