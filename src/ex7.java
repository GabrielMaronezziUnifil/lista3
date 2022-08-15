import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a =  new int[5];
        int i,m = 0;
        for (i=0;i<5;i++){
            System.out.println("Informe um numero inteiro: ");
            a[i] = sc.nextInt();
            if(m == 0){
                m = a[i];
            } if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println(m);
    }
}
