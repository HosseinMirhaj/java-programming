package calculater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("........calculater.........");
        System.out.println("please enter first number:");
        Scanner input = new Scanner(System.in);
        Calculate number = new Calculate();
        int temp = input.nextInt();
        number.a = temp;
        System.out.println("please enter second number:");
        //Calculate number2 = new Calculate();
        temp = input.nextInt();
        number.b = temp;
        System.out.println("please enter 1.+|2.-|3.*|4./ :");
        //Calculate func = new Calculate();
        //int function = input.nextInt();
        temp = input.nextInt();
        if (temp == 1 ){
            number.plus();
        }else if(temp == 2){
            number.minuse();
        }else if(temp == 3){
            number.times();
        }else if(temp == 4){
            number.divide();
        }
    }
}
