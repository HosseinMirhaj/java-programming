package com.kargah;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your calculation   ");
        String[] x = new String[3];
        for(int i =0 ;i<3 ; i++){
            System.out.println("enter your character " + (i+1) + " :" );
            x[i] = input.nextLine();
        }
        for (int i=0;i<3;i++){
            System.out.println(x[i]);
        }
        System.out.println(" = \n ");
        int a = Integer.parseInt(x[0]);
        int b = Integer.parseInt(x[2]);
        if(x[1].equals("+")){
            Calculate calculate = CalcFactory.getCalc(Calculate.CALCPLUS);
            System.out.println(calculate.calc(a,b));
        }
        else if (x[1].equals("-")){
            Calculate calculate = CalcFactory.getCalc(Calculate.CALCMINNUS);
            System.out.println(calculate.calc(a,b));
        }
        else
            System.out.println("ERROR");
    }
}
