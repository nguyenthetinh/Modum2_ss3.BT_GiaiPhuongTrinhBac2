package com.phuongtrinhbac2;
import java.util.Scanner;
public class Myclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a=scanner.nextInt();
        System.out.println("Nhap b:");
        double b=scanner.nextInt();
        System.out.println("Nhap c:");
        double c=scanner.nextInt();
        Phuongtrinh phuongtrinh=new Phuongtrinh(a,b,c);
        phuongtrinh.getter();
        if (phuongtrinh.getDiscriminant()>0){
            System.out.println("puong trinh co hai nghiem : X1 ="+phuongtrinh.getRoot1()+" , X2="+phuongtrinh.getRoot2());
        }else if (phuongtrinh.getDiscriminant()==0){
            System.out.println("puong trinh co 2 nghiem bang nhau: "+ phuongtrinh.getRoot3());
        }else {
            System.out.println("phuong trinh vo nghiem");
        }

    }
}
