package Calculator_Ad;
public class Adder extends  Calculator implements AdderInterface{
    public  Adder(String calculatorId,UserInterface user) {

        this.setCalculatorId( calculatorId);
        this.setUser( user);
    }
    public  Adder() {

    }
    @Override
    public void compute(){
       int result= this.getUser().getNum1()+ this.getUser().getNum2()+this.getUser().getNum3();
       this.setResult(result);
       System.out.println("OverRide: " +this.getResult());
    }

}
