/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai1 {
    public static void main(String[] args) {
        
        int a;
        boolean kiemTra=true;
        Scanner duyKhanh = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên :");
        a= duyKhanh.nextInt();
        for(int i=2 ;i<a-1;i++ ){
            if (a % i == 0) {
                kiemTra=false; break;
            }
    }
        if (kiemTra==false) {
            System.out.println("Số bạn vừa nhập không phải là số nguyên tố !");
        } else System.out.println("Số bạn vừa nhập là số nguyên tố !"); {
        }
    
}
}