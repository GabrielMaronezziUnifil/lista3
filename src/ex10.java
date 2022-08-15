import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b,i;
        System.out.println("Informe o inteiro A:");
        a= sc.nextInt();

        System.out.println("Informe o inteiro B:");
        b= sc.nextInt();
        for(i= a+1; i<b;i++){
            System.out.print(i+ ", ");
        }
    }
}
