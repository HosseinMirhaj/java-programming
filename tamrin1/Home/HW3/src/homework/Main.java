package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ax+by=e");
        System.out.println("cx+dy=f");
        Scanner input = new Scanner(System.in);
        EquationSolver javab = new  EquationSolver();
        System.out.println("Enter a :");
        String temp = input.nextLine();
        javab.a = Float.parseFloat(temp);
        System.out.println("Enter b :");
        temp = input.nextLine();
        javab.b = Float.parseFloat(temp);
        System.out.println("Enter c :");
        temp = input.nextLine();
        javab.c = Float.parseFloat(temp);
        System.out.println("Enter d :");
        temp = input.nextLine();
        javab.d = Float.parseFloat(temp);
        System.out.println("Enter e :");
        temp = input.nextLine();
        javab.e = Float.parseFloat(temp);
        System.out.println("Enter f :");
        temp = input.nextLine();
        javab.f = Float.parseFloat(temp);
        javab.javabe_x();
        javab.javabe_y();

    }
    }