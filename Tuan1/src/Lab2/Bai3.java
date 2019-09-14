/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai3 {
    public static void main(String[] args) {
        double a ,tienDien;
        Scanner duyKhanh = new Scanner(System.in); 
        System.out.println("Nhập số điện sử dụng trong tháng :");
        a = duyKhanh.nextDouble();
        
        if (a < 50) {
            tienDien = a*1000 ;
            System.out.println("Tiền điện phải đóng là :"+tienDien +"đồng");
        } 
        else {
            tienDien = 50*1000+(a-50)*1200;
            System.out.println("Tiền điện phải đóng là :"+tienDien +"đồng");
        }
            
        }
}