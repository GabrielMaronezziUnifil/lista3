import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String sexo;
        int stringLength,idade,salario;



        do {


            System.out.println("Informe um nome com mais de 3 caracteres: ");
            nome = sc.nextLine();
            stringLength = nome.length();

        }while (stringLength<3);

        do {
            System.out.println("insira uma idade entre 0 e 150:");
            idade = sc.nextInt();

        }while((idade <0)||(idade >150));

        do {
            System.out.println("Informe um salario maior que 0:");
            salario = sc.nextInt();
        }while(salario > 0);



    }
}
