import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Insira um numero: ");
        int numero1 = leitor.nextInt();
        int numero2 = numero1 % 2;

        if (numero2 == 0){
            System.out.println("Número " + numero1 + " é Par");
        } else {
            System.out.println("Número " + numero1 + " é Impar");
        }
    }
}
