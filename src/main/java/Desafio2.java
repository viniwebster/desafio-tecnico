import java.util.Scanner;

//DESAFIO 2
public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para verificar: ");
        int number = sc.nextInt();

        if (checkFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }
    }

    private static boolean checkFibonacci(int number) {
        if (number < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        if (number == a || number == b) {
            return true;
        }

        while (b < number) {
            int temp = a;
            a = b;
            b = temp + b;

            if (b == number) {
                return true;
            }
        }
        return false;
    }
}
