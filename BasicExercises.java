/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sabijonarraydemo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BasicExercises {

    public static void main(String[] args) {

        //JustPrintOP();
        //SumOfTwo();
        //DivideOfTwo();
        //Operationing();
        //Scanninger();
        //OperaScanninger();
        //InputOneThenMagic();
        //Circle();
        //ThreeNum();
        //IntegerDigits();
        InputInfo();
    }

    //basic 1
    public static void JustPrintOP() {
        System.out.println("Hello \nChristian Sabijon");

    }

    //basic 2
    public static void SumOfTwo() {
        int a, b, c;
        a = 21;
        b = 32;
        c = a + b;
        System.out.println(c);
    }

    //basic 3
    public static void DivideOfTwo() {
        int a, b, c;
        a = 21;
        b = 3;
        c = a / b;
        System.out.println(c);
    }

    //basic 4
    public static void Operationing() {
        int a, b, c, d;
        a = -5 + 8 * 6;
        b = (55 + 9) % 9;
        c = 20 + -3 * 5 / 8;
        d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
    }

    //basic 5
    public static void Scanninger() {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number: ");
        int a = sc.nextInt();
        System.out.println("Input Second Number: ");
        int b = sc.nextInt();
        c = a * b;
        System.out.println(a + " x " + b + " = " + c);
    }

    //basic 6
    public static void OperaScanninger() {
        int c1, c2, c3, c4, c5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number: ");
        int a = sc.nextInt();
        System.out.println("Input Second Number: ");
        int b = sc.nextInt();
        c1 = a + b;
        c2 = a - b;
        c3 = a * b;
        c4 = a / b;
        c5 = a % b;
        System.out.println(a + " + " + b + " = " + c1);
        System.out.println(a + " - " + b + " = " + c2);
        System.out.println(a + " x " + b + " = " + c3);
        System.out.println(a + " / " + b + " = " + c4);
        System.out.println(a + " mod " + b + " = " + c5);
    }

    //basic 7
    public static void InputOneThenMagic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number: ");
        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }

    //basic 8
    public static void Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius = ");
        double a = sc.nextDouble();
        final double PI = Math.PI;
        double b = PI * a * a;
        double c = 2 * PI * a;

        System.out.println("Perimeter is = " + c);
        System.out.println("area is = " + b);
    }

    //basic 9
    public static void ThreeNum() {
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number: ");
        int a = sc.nextInt();
        System.out.println("Input Second Number: ");
        int b = sc.nextInt();
        System.out.println("Input Third Number: ");
        int c = sc.nextInt();
        d = (a + b + c) / 3;
        System.out.println("Average = " + d);
    }

    //basic 10
    public static void IntegerDigits() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input an Integer: ");
        int a = sc.nextInt();
        int d = String.valueOf(a)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println("The sum of the digits is: " + d);
    }

    //basic 11
    public static void InputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String a = sc.nextLine();
        System.out.println("Enter Date of Birth: ");
        String b = sc.nextLine();
        System.out.println("Address: ");
        String c = sc.nextLine();
        System.out.println("Age: ");
        String d = sc.nextLine();
        System.out.println("Course: ");
        String e = sc.nextLine();
        System.out.println("Year Level: ");
        String f = sc.nextLine();
        System.out.println("Secondary School Graduated: ");
        String g = sc.nextLine();
        System.out.println("Year: ");
        String h = sc.nextLine();

        System.out.println("==================== PERSONAL INFO ====================");
        System.out.printf("%-14s:%s\n","NAME", a);
        System.out.printf("%-14s:%s\n","DATE OF BIRTH", b);
        System.out.printf("%-14s:%s\n","ADDRESS" , c);
        System.out.printf("%-14s:%s\n","AGE" , d);
        System.out.printf("%-14s:%s\n","COURSE" , e);
        System.out.printf("%-14s:%s\n","YEAR LEVEL" , f + "\n");
        System.out.println("==================== EDUCATIONAL INFO ====================");
        System.out.println("SECONDARY LEVEL");
        System.out.printf("%-14s:%s\n","NAME OF SCHOOL" , g);
        System.out.printf("%14s:%s\n","YEAR" , h);
    }
}
