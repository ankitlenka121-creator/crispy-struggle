package com.ankit.dsa;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int v = ar.nextInt();
        int rev = 0,sum=0;
       int  p=v;
        while(v!=0){
            rev =v%10;
            sum=sum+(rev*rev*rev );
            v=v/10;

        }
        if(sum==p)
            System.out.println("armstrong");
        else
            System.out.println(" not armstrong");
    }
}