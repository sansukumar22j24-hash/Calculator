package Calculator;

public interface CalculatorInterface {
    public String getCalculatorType() ;
    public void setCalculatorType(String calculatorType) ;
    public int getResult();
    public void setResult(int result);
    public int getCalculatorId();
    public void setCalculatorId(int calculatorId) ;
    public UserInterface getUser();
    public void setUser(UserInterface user) ;
    public void compute();

    public int calculate(int num1,int num2);
    public int calculate(int num1);
    public int calculate(int num1,int num2,int num3);

}
