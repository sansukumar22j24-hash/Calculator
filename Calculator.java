package Calculator_Ad;
public abstract class Calculator implements CalculatorInterface{
    private String calculatorId;
    private int result;
    private int num1;
    private int num2;
    private int  num3;
    private  UserInterface user;
    public UserInterface getUser() {
        return user;
    }

    public void setUser(UserInterface user) {
        this.user = user;
    }
    public String getCalculatorId() {
        return calculatorId;
    }

    public void setCalculatorId(String calculatorId) {
        this.calculatorId = calculatorId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
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
    public void compute(){
        int result= this.getUser().getNum1()+ this.getUser().getNum2();
        this.setResult(result);
        System.out.println("Result : "+this.getResult());
    }

    public int calculate(int a){
        return a+a;
    }
    public int calculate(int a, int b){
        return a+b;
    }


  public int calculate(int a, int b, int c){
      return a+b+c;
  }


}