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
public class Bai3 {
    public static void main(String[] args) {
        double Canh,theTichlapPhuong ;
        Scanner duyKhanh =new Scanner(System.in);
        System.out.println(" Độ dài cạnh ");
        Canh =duyKhanh.nextDouble();
        theTichlapPhuong=(Canh*Canh*Canh);
        System.out.println("Thể Tích Khối Lập Phương Bang "+theTichlapPhuong);
    }
    
}