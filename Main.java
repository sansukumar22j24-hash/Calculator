package Calculator;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   // int[] num=new int[3];
    //       User user2=new User();
    System.out.println("Enter the value 1");
    BigInteger value1= new BigInteger(sc.nextLine());
    int a=value1.intValue();
    System.out.println("Enter the value 2");
    BigInteger value2= new BigInteger(sc.nextLine());
    int b=value2.intValue();
    System.out.println("Enter the value 3");
    BigInteger value3= new BigInteger(sc.nextLine());
    int c=value3.intValue();
    System.out.println("Enter the Calculator Type");
    String calculatorType=sc.nextLine();
    UserInterface user1 = new User(a,b,c,calculatorType);


    if(user1.getCalculatorType().equals("Adder")){
    AdderInterface adder= new Adder(1,user1);
   adder.setUser(user1);
    user1.setAdder(adder);
   // user1.setCalculator[0](adder);
    //  Adder arr=user1.getCalculator();
    adder.compute();
  adder.calculate(1);
   adder.calculate(1,2);
   adder.calculate(1, 2, 3);
}

  else if(user1.getCalculatorType().equals("Multiplier")){
        MultiplierInterface multiplier= new Multiplier(2,user1);
        multiplier.setUser(user1);
    user1.setMultiplier(multiplier);
      //1. user1.setMultiplier(multiplier);
    multiplier.compute();
    multiplier.calculate(1);
    multiplier.calculate(1,2);
    multiplier.calculate(1, 2, 3);

    }
  else{
    System.out.println("Bro some thing Wrong Check Again !");
  }
}
}
