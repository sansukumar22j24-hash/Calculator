package Calculator_Ad;

public class Multiplier extends Calculator implements MultiplierInterface{
   // private String calculatorId;

    public Multiplier(){

    }
    public Multiplier(String calculatorId,UserInterface user){
        this.setCalculatorId( calculatorId);
        this.setUser( user);
    }

@Override
    public void compute(){
        int result= this.getUser().getNum1()* this.getUser().getNum2()*this.getUser().getNum3();
        this.setResult(result);
        System.out.println("OverRide: "+this.getResult());
    }


}
