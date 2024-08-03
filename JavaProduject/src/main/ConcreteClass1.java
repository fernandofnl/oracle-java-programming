package main;

public class ConcreteClass1 {

    //Propoprties
    private int password;
    
    //Constructors
    public ConcreteClass1() {
    	password = 1234;
    }
    
    public ConcreteClass1(int password)
    {
    	this.password = password;
    }
    //Behaviors
    public int getPassword(){
       return password;
   }
   public void setPassword(int entrada){
        password = entrada;
   }



}
