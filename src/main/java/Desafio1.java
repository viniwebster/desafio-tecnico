//DESAFIO 1
public class Desafio1 {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k++;
            soma += k;
        }
        System.out.println(soma); // O valor final da soma sera 91
    }
}