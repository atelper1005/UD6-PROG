package ejercicio2;

public class Hanoi {
    public static void main(String[] args) {
        int numDiscos = 3;
        resolverHanoi(numDiscos, 'A', 'C', 'B');
    }

    public static void resolverHanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de la torre " + origen + " a la torre " + destino);
        } else {
            resolverHanoi(n-1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " de la torre " + origen + " a la torre " + destino);
            resolverHanoi(n-1, auxiliar, destino, origen);
        }
    }
}
