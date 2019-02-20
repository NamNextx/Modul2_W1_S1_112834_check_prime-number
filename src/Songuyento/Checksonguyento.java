package Songuyento;

import java.util.Scanner;

public class Checksonguyento {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Pls input your number");
        int number=sc.nextInt();
        display(number);
    }
    static void display(int number){
        if (checkPrimeNumber(number)){
            System.out.println("Is not a prime");
        }
        else System.out.println("Number "+number+" is a prime number");
    }

    static boolean checkPrimeNumber(int number){
        boolean flag=false;
        if (number<2){
            flag=true;
        }
        else {
            int i=2;
            while (i<=Math.sqrt(number)){
                if (number%i==0){
                    flag=true;
                    break;

                }
                i++;
            }

        }
        return flag;
    }
}
