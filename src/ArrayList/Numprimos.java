package ArrayList;
public class Numprimos {
     public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);


        System.out.println("***Numeros primos***");

        int numero1 = 1;
        int numero2 = 1000;

        for (int i = numero1; i <= numero2; i++){
            int divisor = 0;
            for (int x = 1; x <= i/2; x++){
                if (i%x==0){
                    divisor+=2;
                }
                if (divisor>2){
                    break;
                }
            }
            if (divisor==2){
                System.out.println(i);
            }

        }

    }
}
