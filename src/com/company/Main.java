package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String s1, s2;
        System.out.print("Введите первую строку");
        s1 = str.nextLine();
        System.out.print("Введите вторую строку");
        s2 = str.nextLine();

        String trueStatement ="FALSE";
        if (s1.contains(s2)){
            trueStatement ="TRUE";
        }
        System.out.print(trueStatement);




    }
}
