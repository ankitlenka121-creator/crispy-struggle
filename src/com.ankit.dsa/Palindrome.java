package com.ankit.dsa;

import java.util.Scanner;

public class Palindrome {



        public static void main (String[] args) {
            Scanner org=new Scanner(System.in);
            int x=org.nextInt();
            int rev=0;
            int sum=0;
            int i=x;
            while(x!=0) {
                rev = x % 10;
                x = x / 10;
                sum = sum * 10 + rev;
            }
            if (sum==i)
                System.out.println("palindrome");
            else
                System.out.println(" not palindrome");
        }
    }

