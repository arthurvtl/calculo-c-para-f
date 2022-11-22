
package converaocf;

import java.util.Scanner;


public class Converaocf {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String f1 = "Olá, vamos fazer uma conversão de graus celsius para graus fahrenheit";
        String f2 = "Insira sua temperatura em celsius";
        
        System.out.println(f1);
        System.out.println(f2);
        
        double c;
        c = in.nextDouble();
        double f;
        
        
        System.out.println("O valor da sua temperatura em fahrenheit e de ");
        System.out.println(fahrenheit(c));
    }
    
    public static double fahrenheit(double c){
        
        double fahrenheit = c * 1.8 + 32;
        return fahrenheit;
    } 
}
