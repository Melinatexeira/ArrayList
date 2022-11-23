package ArrayList;
public class Vector {
   public static void main(String [] args ) {

        int vector [] = new int[5];

        Scanner entradaEscaner = new Scanner(System.in);
        for (int i=0; i<vector.length; i++) {
            System.out.println("Ingrese un número para el índice" + " " + i);
            vector[i] = entradaEscaner.nextInt();
        }


        for (int i=0; i<vector.length; i++) {
            System.out.println("[" + i + "]" +  vector[i]);

        }
    }
}
