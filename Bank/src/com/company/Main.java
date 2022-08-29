package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int i= 0;
        Scanner s1 = new Scanner(System.in);
        do {
            System.out.println("1) Enter 1  for close Balance Inquairy: ");
            i=s1.nextInt();
        }
while (i<=5);
    }
}
