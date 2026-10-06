import java.util.Scanner;

public class TorresHanoiRestringido {

    // Contador global para registrar el número de movimientos
    private static int contadorMovimientos = 0;

    /**
     * Resuelve el problema de las Torres de Hanoi con la restricción de que
     * todo movimiento debe pasar obligatoriamente por o desde la clavija B.
     * 
     * @param n Cantidad de discos a mover.
     * @param origen Clavija inicial (ej. 'A')
     * @param aux Clavija intermedia (ej. 'B')
     * @param destino Clavija final (ej. 'C')
     */
    public static void hanoiRestringido(int n, char origen, char aux, char destino) {
        // Caso base: mover 1 disco de origen a destino pasando por aux
        if (n == 1) {
            moverDisco(1, origen, aux);
            moverDisco(1, aux, destino);
            return;
        }

        // Paso 1: Mover n-1 discos de origen (A) a destino (C)
        hanoiRestringido(n - 1, origen, aux, destino);

        // Paso 2: Mover el disco n de origen (A) a aux (B)
        moverDisco(n, origen, aux);

        // Paso 3: Mover n-1 discos de destino (C) a origen (A)
        hanoiRestringido(n - 1, destino, aux, origen);

        // Paso 4: Mover el disco n de aux (B) a destino (C)
        moverDisco(n, aux, destino);

        // Paso 5: Mover n-1 discos de origen (A) a destino (C)
        hanoiRestringido(n - 1, origen, aux, destino);
    }

    private static void moverDisco(int disco, char desde, char hacia) {
        contadorMovimientos++;
        System.out.printf("Movimiento %2d: Disco %d desde '%c' hasta '%c'\n", 
                          contadorMovimientos, disco, desde, hacia);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de discos (n): ");
        int n = scanner.nextInt();

        System.out.println("\n--- Secuencia de Movimientos ---");
        hanoiRestringido(n, 'A', 'B', 'C');

        int teorico = (int) Math.pow(3, n) - 1;
        System.out.println("\n--- Resumen de Evidencia ---");
        System.out.println("Numero total de movimientos ejecutados: " + contadorMovimientos);
        System.out.println("Numero teórico esperado (3^n - 1): " + teorico);
        
        if (contadorMovimientos == teorico) {
            System.out.println("Verificacion exitosa: El algoritmo coincide con el modelo matemático.");
        }
        
        scanner.close();
    }
}