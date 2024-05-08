package org.example;

import java.util.Scanner;

//Klavyeden girilen iki tamsayının en büyü ortak bölenini, "ÖKLİD ALGORTİMASI"nı kullanarak "ebob"yinelemeli fonksiyonuyla
// hesaplayarak ekrana yazdıran program.

public class Main {

    public static int ebob(int x, int y){
        if (y == 0) return x;
        else return ebob(y ,x % y);
    }

    public static void main(String[] args) {

    int a,b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Tam Sayı : ");
        a = scanner.nextInt();
        System.out.println("2. Tam Sayı : ");
        b = scanner.nextInt();
        System.out.printf("\nEBOB (%d-%d) = %d\n",a,b,ebob(a,b));
    }
}