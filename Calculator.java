package Calculator;

public  abstract class Calculator implements CalculatorInterface {
    private int calculatorId;
    private  int result;

    // private int num1, num2, num3;
    private String calculatorType;
    private UserInterface user;


    public void compute(){
        int result = this.getUser().getNum1()+this.getUser().getNum2();
        this.setResult(result);
        System.out.println("Over "+getResult());
    }

    public String getCalculatorType() {
        return calculatorType;
    }

    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


    public void setCalculatorId(int calculatorId) {
        this.calculatorId = calculatorId;
    }

    public UserInterface getUser() {
        return user;
    }
    public void setUser(UserInterface user) {
        this.user = user;
    }
    public int calculate(int num1){
        return num1+num1;
    }
    public int calculate(int num1,int num2){
        return num1+num2;
    }
    public int calculate(int num1,int num2,int num3){
        return num1+num2+num3;
    }


    @Override
    public int getCalculatorId() {
        return calculatorId;
    }
}
