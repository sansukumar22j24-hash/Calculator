package Calculator_Ad;

public interface UserInterface {
    public int getNum1();
    public void setNum1(int num1);
    public int getNum2();
    public void setNum2(int num2) ;
    public int getNum3() ;
    public void setNum3(int num3);
    public String getCalculatorType();
    public void setCalculatorType(String calculatorType) ;
    public int getResult() ;
    public void setResult(int result) ;
    public AdderInterface getAdder() ;
    public void setAdder(AdderInterface adder);
    public MultiplierInterface getMultiplier();
    public void setMultiplier(MultiplierInterface multiplier) ;
    public Calculator[] getNumArray() ;
    public void setNumArray(Calculator[] numArray) ;


    }
