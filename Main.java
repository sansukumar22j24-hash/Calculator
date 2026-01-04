package Calculator_Ad;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] num = new int[3];
       //       User user2=new User();
       {
           System.out.println("==============================User1================================================");
       System.out.println("Enter the value 1");
       num[0] = new BigInteger(sc.nextLine()).intValue();
       System.out.println("Enter the value 2");
       num[1] = new BigInteger(sc.nextLine()).intValue();
       System.out.println("Enter the value 3");
       num[2] = new BigInteger(sc.nextLine()).intValue();
       System.out.println("Enter the Calculator Type");
       String calculatorType = sc.nextLine();
       UserInterface user1 = new User(num[0], num[1], num[2], calculatorType);
       Calculator calculator;

       if (user1.getCalculatorType().equals("Adder")) {
           Calculator adder = new Adder("A1", user1);
           Calculator[] array = user1.getNumArray();
           array[0] = adder;
           // adder.setUser();
           //user1.getNumArray();
           adder.compute();
           int cal;
           System.out.print("OverLoad: ");
           System.out.print(adder.calculate(num[0]) + " ");
           System.out.print(adder.calculate(num[0], num[1]) + " ");
           System.out.print(adder.calculate(num[0], num[1], num[2]));


       } else {
           Calculator multiplier = new Multiplier("A2", user1);
           Calculator[] array = user1.getNumArray();
           array[1] = multiplier;
           // adder.setUser();
          // user1.getNumArray();
           multiplier.compute();
           int cal;
           System.out.print("OverLoad: ");
           System.out.print(multiplier.calculate(num[0]) + " ");
           System.out.print(multiplier.calculate(num[0], num[1]) + " ");
           System.out.println(multiplier.calculate(num[0], num[1], num[2]));
       }
   }
       System.out.println();
       {

           System.out.println("==========user2============");
           System.out.println("Enter the value 1");
           num[0] = new BigInteger(sc.nextLine()).intValue();
           System.out.println("Enter the value 2");
           num[1] = new BigInteger(sc.nextLine()).intValue();
           System.out.println("Enter the value 3");
           num[2] = new BigInteger(sc.nextLine()).intValue();
           System.out.println("Enter the Calculator Type");
           String calculatorType2 = sc.nextLine();
           UserInterface user2 = new User(num[0], num[1], num[2], calculatorType2);

           if (user2.getCalculatorType().equals("Adder")) {
               Calculator adder = new Adder("A2", user2);
               Calculator[] array = user2.getNumArray();
               array[0] = adder;
               // adder.setUser();
               //user2.getNumArray();
               adder.compute();
               int cal;
               System.out.print("OverLoad: ");
               System.out.print(adder.calculate(num[0]) + " ");
               System.out.print(adder.calculate(num[0], num[1]) + " ");
               System.out.print(adder.calculate(num[0], num[1], num[2]));


           }
           if (user2.getCalculatorType().equals("Multiplier")) {
               Calculator multiplier = new Multiplier("A2", user2);
               Calculator[] array = user2.getNumArray();
               array[1] = multiplier;
               // adder.setUser();
             //  user2.getNumArray();
               multiplier.compute();
               int cal;
               System.out.print("OverLoad: ");
               System.out.print(multiplier.calculate(num[0]) + " ");
               System.out.print(multiplier.calculate(num[0], num[1]) + " ");
               System.out.print(multiplier.calculate(num[0], num[1], num[2]));
           }
       }











   }
}
