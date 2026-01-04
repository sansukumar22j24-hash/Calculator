package Calculator_Ad;

public class User implements UserInterface{
private int  num1, num2, num3;
private String calculatorType;
//private int calculatorId;
private int result;
private AdderInterface adder;
private MultiplierInterface multiplier;
private Calculator [] numArray=new Calculator[3];

public User(int num1, int num2, int num3, String calculatorType) {
    //this.num1 = num1;
   this.setNum1(num1);
   // this.num2 = num2;
   this.setNum2(num2);
//this.num3 = num3;
   this. setNum3(num3);
    this.setCalculatorType(calculatorType);
 //   this.calculatorType = calculatorType;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public String getCalculatorType() {
        return calculatorType;
    }

    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

//    public int getCalculatorId() {
//        return calculatorId;
//    }
//
//    public void setCalculatorId(int calculatorId) {
//        this.calculatorId = calculatorId;
//    }
//
   public int getResult() {
        return result;
    }
//
    public void setResult(int result) {
        this.result = result;
   }

//    public Adder[] getNumArray() {
//        return numArray;
//    }
//
//    public void setNumArray(Adder[] numArray) {
//        this.numArray = numArray;
//    }

//    public int[] getNumArray() {
//        return numArray;
//    }
//
//    public void setNumArray(int[] numArray) {
//        this.numArray = numArray;
//    }

    public AdderInterface getAdder() {
        return adder;
    }

    public void setAdder(AdderInterface adder) {
        this.adder = adder;
    }

    public MultiplierInterface getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(MultiplierInterface multiplier) {
        this.multiplier = multiplier;
    }

    public Calculator[] getNumArray() {
        return numArray;
    }

    public void setNumArray(Calculator[] numArray) {
        this.numArray = numArray;
    }
}
