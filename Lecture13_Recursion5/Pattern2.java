package Lecture13_Recursion5;

import java.util.Scanner;

/*
    11111
    22222
    33333
    44444
    55555

 */
public class Pattern2 {
    public static Scanner s = new Scanner(System.in);
    public static void printpattern(int n,int r,int c){
        if(r>n){
            return;
        }
        if(c<=0){
            System.out.println();
            printpattern(n,r+1,n);
            return;
        }
        System.out.print(r);
        printpattern(n,r,c-1);
    }
    public static void main(String[] args){
        int n=s.nextInt();
        printpattern(n,1,n);

    }
}
