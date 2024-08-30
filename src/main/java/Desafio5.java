import java.util.Scanner;

//DESAFIO 5
public class Desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a palavra que deseja reverter: ");
        String word = sc.next();

        String[] wordSplit = word.split("");
        String[] reversedWordSplit = new String[word.length()];
        int counter = word.length();
        for (int i = 0; i < word.length(); i++){
            reversedWordSplit[i] = wordSplit[counter - 1];
            counter--;
        }

        System.out.println(String.join("", reversedWordSplit));
    }
}
