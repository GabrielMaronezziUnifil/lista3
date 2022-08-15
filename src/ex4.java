public class ex4 {
    public static void main(String[] args) {
        double a = 80000,b = 200000;
        int cont=0;
    while(b > a){
        a = (a +(a * 0.03));
        b = (b +(b * 0.015));
        cont++;
    }
        System.out.println("Foram necessarios "+cont+" anos para a cidade A ultrapassar  cidade B");
    }
}
