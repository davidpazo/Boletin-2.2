//calcular area do cuadrado

import java.util.Scanner;

public class Boletin02 {

    //
    public static void main(String[] args) {
        float lado;
        
        System.out.println("lado ; ");
        Scanner dato = new Scanner (System.in);
        lado=dato.nextFloat();  //Podo utilizar dato para recoller a altura
        
        System.out.println("area="+ lado*lado);
       double area=Math.pow(lado,2);
        System.out.println("area2="+ area);
       
    }
    
}
