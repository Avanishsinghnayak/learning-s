package com.company;
import java.util.Scanner;
public class exercise_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject 1 (out of 100):");
        int sub1 = sc.nextInt();
        System.out.println("enter marks of subject 2 (out of 100):");
        int sub2 = sc.nextInt();
        System.out.println("enter marks of subject 3 (out of 100):");
        int sub3 = sc.nextInt();
        System.out.println("enter marks of subject 4 (out of 100):");
        int sub4 = sc.nextInt();
        System.out.println("enter marks of subject 5 (out of 100):");
        int sub5 = sc.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (total / 500.0)*100;
        System.out.println("total marks:" + total + "/500");
        System.out.printf("percentage: %.2f%%\n" , percentage);
        sc.close();
    }
}
