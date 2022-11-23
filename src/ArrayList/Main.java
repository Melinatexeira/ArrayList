package ArrayList;

public class Main {
   public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);
        int arreglo[] = new int[20];
        int cont_pares=0, cont_impares=0;

        for (int i=0; i<20; i++ ){
            System.out.println((i+1)+ "."+"Digite un numero del 1 al 100: ");
            arreglo[i] = entradaEscaner.nextInt();

            if(arreglo[i] % 2 == 0){
                cont_pares++;
            }
            else {
                cont_impares++;
            }
        }

        int par[] = new int[cont_pares];
        int impar[] = new int[cont_pares];

        cont_pares = 0;
        cont_impares = 0;

        for (int i=0; i<20;i++){
            if (arreglo[i] % 2 == 0) {
                par[cont_pares] = arreglo[i];
                cont_pares++;
            }
            else {
                impar[cont_impares] = arreglo[i];
                cont_impares++;
            }
        }

        System.out.println("Numero pares:");
        for (int i=0; i<cont_pares; i++) {
            System.out.print(par[i] + "-");
        }
        System.out.println("");

        System.out.println("Numeros impares:");
        for (int i=0; i<cont_impares; i++) {
            System.out.print(impar[i] + "-");

        }
        System.out.println("");


    }
}
