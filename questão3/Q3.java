package questão3;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");
        int num = scanner.nextInt();


        if(ehPerfeito(num)){
            System.out.println("O número é perfeito");
        }else {
            System.out.println("O número não é perfeito");
        }

    }

    public static boolean ehPerfeito(int num){

        int x;
        int soma = 0;

        for (x=1; x<num; x++){
            if (num%x == 0){
                soma = soma + x;
            }
        }

        if (soma == num){
            return true;
        }
        else {
           return false;
        }

    }
}
