package com.phuongtrinhbac2;

public class Phuongtrinh {
    double a,b,c;
    Phuongtrinh(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void getter(){
        double x4=(-this.c/this.b);
        if (this.a==0){
            if (this.b==0){
                System.out.println("phuong trinh vo nghiem");
            }else {
                System.out.println("phuong trinh co 1 nghiem= "+ x4);
            }
        }
    }
    double getDiscriminant(){
        double delta =this.b*this.b - 4*this.a*this.c;
        return delta;
    }
    double getRoot1(){
        double x1;
        x1=(-this.b + Math.sqrt(getDiscriminant()))/(2*this.a);
        return x1;
    }
    double getRoot2(){
        double x2;
        x2=(-this.b - Math.sqrt(getDiscriminant()))/(2*this.a);
        return x2;
    }
    double getRoot3(){
        double x3;
        x3=(-this.b/(2*this.a));
        return x3;
    }
}
