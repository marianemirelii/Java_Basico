package questão4;

import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");
        double n = scanner.nextDouble();

        System.out.println("O fatorial é: "+ fatorial(n));
    }

    public static double fatorial(double n){
        if(n == 1){
            return 1;
        }
        return n * fatorial(n-1);
    }





}
