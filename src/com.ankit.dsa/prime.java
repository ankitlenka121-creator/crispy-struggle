package com.ankit.dsa;




import java.util.Scanner;

    class prime {
        public static void main(String[] args) {
            Scanner div = new Scanner(System.in);
            int d = div.nextInt();
            int i, c = 0;
            for (i = 1; i <= 100; i++) {
                if (d % i == 0) {
                    c++;
                }
            }
            if (c == 2)
                System.out.println("prime");
            else

                System.out.println("not  prime");



        }
    }





