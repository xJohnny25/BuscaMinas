import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[4][5];
        int numero_minas = 0;
        int mina;
        int tesoro;
        int fila;
        int columna;
        int contador_intentos = 0;


         tablero[(int) (Math.random()*4)][(int) (Math.random()*5)] = 2;


        while (numero_minas < 3){

            int fila2=(int) (Math.random()*4);
            int columna2=(int) (Math.random()*4);

            if (tablero[fila2][columna2] == 0){
                tablero[fila2][columna2] = 1;
                numero_minas++;
            }
        }



        for (int i = 0; i < tablero.length; i++){
            System.out.println();
            for (int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j] + " ");
            }
        }
        System.out.println();

//        for (int i = 0; i < tablero.length; i++){
//            for (int j = 0; j < tablero[0].length; j++){
//                if (tablero[i][j] = )
//            }
//        }

        do {
            String [][] tableroImprimir = new String[4][5];

            for (int i = 0; i < tableroImprimir.length; i++){
                for (int j = 0; j < tableroImprimir[0].length; j++){
                    tableroImprimir[i][j] = "X";
                }
            }

            for (int i = 0; i < tableroImprimir.length; i++){
                System.out.println();
                for (int j = 0; j < tableroImprimir[0].length; j++){
                    System.out.print(tableroImprimir[i][j] + " ");
                }
            }
            System.out.println();
            do {
                System.out.println("selecciona una posicion: ");

                System.out.print("Fila: ");
                fila = sc.nextInt();
                System.out.print("Columna: ");
                columna = sc.nextInt();

                if (fila > 3){
                    System.out.println("las filas van de 0 hasta 3");
                } else if (columna > 4) {
                    System.out.println("las columnas van de 0 hasta 4");
                }
            }while(fila > 3 || columna > 4);

            if (tablero[fila][columna] == 1){
                System.out.println("""
                    ¡BOOM! Has caído en una bomba
                    
                    GAME OVER
                    """);
            } else if (tablero[fila][columna] == 2) {
                System.out.println("¡ENHORABUENA! ¡Has conseguido el tesoro!");
            } else if (tablero[fila][columna] == 0) {
                System.out.println("Casilla vacía");
                contador_intentos++;
            }
        }while(!(tablero[fila][columna] == 1 || tablero[fila][columna] == 2));

        System.out.println("Has tardado " + contador_intentos + " intento/s");
    }
}