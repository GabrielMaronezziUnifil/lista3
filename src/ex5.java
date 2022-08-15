import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,pa,pb;
        int cont=0;
        System.out.println("Informe o numero de habitantes da cidade A");
        a= sc.nextDouble();

        System.out.println("Informe o numero de habitantes da cidade B");
        b= sc.nextDouble();

        System.out.println("Informe  a taxa de crescimeto  anual da cidade A");
        pa = sc.nextDouble();

        System.out.println("Informe  a taxa de crescimeto  anual da cidade B");
        pb = sc.nextDouble();
        while(b > a){
            a = (a +(a * pa));
            b = (b +(b * pb));
            cont++;
        }
        System.out.println("Foram necessarios "+cont+" anos para a cidade A ultrapassar  cidade B");
    }
}

