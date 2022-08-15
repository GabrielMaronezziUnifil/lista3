import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        float soma = 0;
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Informe um numero inteiro: ");
            a[i] = sc.nextInt();
            soma = soma + a[i];
        }
        System.out.println("A soma dos 5 numeros e: " + soma + ", E sua media e:" + soma / 5);
    }
}
