package questão2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de A:");
        double a = scanner.nextDouble();
        System.out.println("Informe o valor de B:");
        double b = scanner.nextDouble();
        System.out.println("Informe o valor de C");
        double c = scanner.nextDouble();

        double delta = Math.pow(b,2) - 4*a*c;

        if (delta<0){
            System.out.println("Não existem raízes");
        }

        if (delta == 0){
            System.out.println("Só tem uma raíz: " + (-b/(2*a)));
        }

        if (delta > 0){
            System.out.println("X1:  " + (-b + Math.sqrt(delta)/(2*a)));
            System.out.println("X2:  " + (-b - Math.sqrt(delta)/(2*a)));

        }
    }
}