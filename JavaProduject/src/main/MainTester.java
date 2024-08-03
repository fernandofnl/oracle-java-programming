package main;
import main.Tools;

public class MainTester {
    public static void main(String[] args) {

        System.out.println("Inicio do roteiro 1.");

        ConcreteClass1 cc1 = new ConcreteClass1();
        ConcreteClass2 cc2 = new ConcreteClass2();

        cc1.setPassword(5555);
        cc2.setPassword(6666);

        System.out.println(cc1.getPassword());
        System.out.println(cc2.getPassword());

        System.out.println("Fim do roteiro 1.");
        System.out.println("----------------------------------");

        System.out.println("Inicio do roteiro 2.");

        AbstractClass ac1 = new ConcreteClass();

        System.out.println("Fim do roteiro 2.");
        System.out.println("----------------------------------");
        
        System.out.println("Início do roteiro 4.");

        System.out.println(ac1.INTERFACEVAR);
        ac1.interfaceMethod1();

        System.out.println("Fim do roteiro 4.");
        System.out.println("----------------------------------");

        System.out.println("Inicio do roteiro 6.");
        
 /*       Tools t01 = new Tools();
        Tools t02 = new Tools();
        
        t01.option = 'B';
        t02.option = 'C';
        
        System.out.println(t01.option);
        System.out.println(t02.option);

*/
        Tools.option = 'D'; 
        System.out.println(Tools.option);
    }
}
