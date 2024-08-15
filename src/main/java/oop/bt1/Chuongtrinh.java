/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.bt1;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Chuongtrinh {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            Rectangle r1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ,r2;
            
            System.out.println("Tao doi tuong r1...");
            r1=new Rectangle();
            System.out.println("Tao doi tuong r2...");
            
            
            System.out.println("Cho biet chieu dai:");
            double dai=sc.nextDouble();
            System.out.println("Cho biet chieu rong:");
            double rong=sc.nextDouble();
            
            r2=new Rectangle(dai,rong);
            System.out.println("Thong Bao Ket Qua");
            System.out.println("HCN thu 1 :"+r1.getLength()+" rong "+r1.getWidth()+" dien tich "+r1.FindArea()+" chu vi "+r1.findPerimeter());
            System.out.println("HCN thu 2 :"+r2.getLength()+" rong "+r2.getWidth()+" dien tich "+r2.FindArea()+" chu vi "+r2.findPerimeter());
            
    }
    
}
