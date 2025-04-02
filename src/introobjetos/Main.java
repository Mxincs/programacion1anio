package introobjetos;

class Persona
{
    protected String nombre;
    protected int edad;

    // Constructor por defecto de Persona
    public Persona()
    {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor de Persona
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInformacion()
    {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}



class Estudiante extends Persona
{
    private String curso;

    // Constructor por defecto de Estudiante
    public Estudiante()
    {
        super(); // Llama al constructor por defecto de Persona
        this.curso = "Sin asignar";
    }

    // Constructor de Estudiante
    public Estudiante(String nombre, int edad, String curso)
    {
        super(nombre, edad); // Llamada al constructor de la superclase
        this.curso = curso;
    }

    // Getters y Setters
    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }

    // Método para mostrar información del estudiante
    @Override
    public void mostrarInformacion()
    {
        super.mostrarInformacion();
        System.out.println("Curso: " + curso);
    }
}



public class Main
{
    public static void main(String[] args)
    {
        // Uso del constructor con parámetros
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 20, "1º DAW");
        estudiante1.mostrarInformacion();

        // Uso del constructor por defecto
        Estudiante estudiante2 = new Estudiante();
        estudiante2.mostrarInformacion();

        estudiante2.nombre="Hector";
        estudiante2.mostrarInformacion();

        // Uso de los setters
        estudiante2.setNombre("Ana García");
        estudiante2.setEdad(19);
        estudiante2.setCurso("2º DAW");

        //Mostramos el contenido de los atributos
        estudiante2.mostrarInformacion();
    }
}