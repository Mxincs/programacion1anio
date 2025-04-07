package introobjetos;

    class Personas {
        //campos de la clase
        String nombre;
        int edad;

        //No se define un constructor explicito, por lo que java usara el constructor por defecto

        //Metodo para mostrar los datos de la persona
        void mostrarInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }

    }



    public class Main_ejemplo {
        public static void main (String[] args) {
            //Crear una instancia de la clase Persona, el constructor por defecto se llama automaticamente
            Personas persona1 = new Personas();
            //Imprimir la informacion (valores predeterminados de los campos)
            persona1.mostrarInfo();
        }
    }