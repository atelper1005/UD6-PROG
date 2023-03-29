package ejercicio1;

public class Excepciones {

    public static void main(String[] args) {

        Excepciones ejemplo = new Excepciones();

        ejemplo.metodoConExcepciones();

    }

    private void metodoConExcepciones() {
    }

    public void metodoConExcepcion() throws MiExcepcionPersonalizada {
        try {
            // Código que puede lanzar una excepción
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            // Captura la excepción y lanza una excepción propia
            throw new MiExcepcionPersonalizada("Se ha producido un error en el cálculo", e);
        }
    }

    public void otroMetodo() {
        try {
            // Llamada al método que puede lanzar una excepción
            metodoConExcepcion();
        } catch (MiExcepcionPersonalizada e) {
            // Captura la excepción personalizada y muestra un mensaje
            System.out.println("Se ha producido un error: " + e.getMessage());
        } catch (Exception e) {
            // Captura cualquier otra excepción que pueda ocurrir en el método
            System.out.println("Se ha producido un error desconocido: " + e.getMessage());
        }
    }

    // Creamos nuestra propia excepción personalizada
    class MiExcepcionPersonalizada extends Exception {

        public MiExcepcionPersonalizada(String mensaje, ArithmeticException e) {
            super(mensaje);
        }

    }

}

