package Calculator;

public class Adder extends Calculator implements AdderInterface {

    public Adder() {

    }

    public Adder(int calculatorId, UserInterface user) {

        this.setCalculatorId(calculatorId);
        this.setUser(user);
    }


    public int calculate(int num1){
        return num1*num1;
    }



    public int calculate(int num1, int num2){
        return num1*num2;
    }
    public int calculate(int num1,int num2,int num3){
        return num1*num2*num3;

    }
    @Override
   public void compute() {
        int result = this.getUser().getNum1() + this.getUser().getNum2() + this.getUser().getNum3();
       setResult(result);
        System.out.println("result "+getResult() );

    }
    }
//        int result = this.getUser().getNum1() + this.getUser().getNum2() + this.getUser().getNum3();
//    //    setResult(result);
 //       System.out.print("Id: " + getCalculatorId() + " ");
  //      System.out.println(" Result: " + getResult());
  //  }
//
//}


// same like Multiplier
//    public int getNum1() {
//        return num1;
//    }
//
//    public void setNum1(int num1) {
//        this.num1 = num1;
//    }
//
//    public int getNum2() {
//        return num2;
//    }
//
//    public void setNum2(int num2) {
//        this.num2 = num2;
//    }
//
//    public int getNum3() {
//        return num3;
//    }
//
//    public void setNum3(int num3) {
//        this.num3 = num3;
//    }





