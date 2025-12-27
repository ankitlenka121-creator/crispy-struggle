import java.util.Scanner;

public class divisor {



        public  static void main(String[] args){
            Scanner div=new Scanner(System.in);
            int d=div.nextInt();
            int i;
            for(i=1;i<=100;i++){
                if(d%i==0)
                    System.out.println("divisor"+i);
            }

        }

    }


