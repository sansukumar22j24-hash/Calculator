package Calculator;

public class Multiplier extends Calculator implements MultiplierInterface{


    public Multiplier(){

    }
    public Multiplier(int calculatorId,UserInterface user){
        this.setCalculatorId( calculatorId);
        this.setUser(user);
    }

    public int calculate(int num1){
        return num1*num1;
    }

    public int calculate(int num1,int num2){
        return num1*num2;
    }




    public int calculate(int num1, int num2, int num3){
        return num1*num2*num3;
    }
    public void compute() {
        int result = this.getUser().getNum1() * this.getUser().getNum2() * this.getUser().getNum3();
        setResult(result);
        System.out.println("result "+getResult() );

    }

//


    // same like Adder

    //    private int calculatorId;
//    private  int result;
//
////    private int num1;
////    private int num2, num3;
//    private String calculatorType;
//    private User user;
//    public int getResult() {
//        return result;
//    }
//
//    public void setResult(int result) {
//        this.result = result;
//    }
//
//    public int getCalculatorId() {
//        return calculatorId;
//    }
//
//    public void setCalculatorId(int calculatorId) {
//        this.calculatorId = calculatorId;
//    }
//
////    public void setNum1(int num1) {
////        this.num1 = num1;
////    }
////
////    public void setNum2(int num2) {
////        this.num2 = num2;
////    }
////
////    public void setNum3(int num3) {
////        this.num3 = num3;
////    }
//
//    public String getCalculatorType() {
//        return calculatorType;
//    }
//
//    public void setCalculatorType(String calculatorType) {
//        this.calculatorType = calculatorType;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
////    public int getNum1() {
////        return num1;
////    }
////
////    public int getNum2() {
////        return num2;
////    }
////
////    public int getNum3() {
////        return num3;
////    }
}
