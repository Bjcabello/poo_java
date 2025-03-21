public class App {
    public static void main(String[] args) throws Exception {
       
        Persona persona1 = new Persona();
        persona1.nombre = "Bryan";
        persona1.apellido = "Cabello";
        persona1.edad = 31;

        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Tecnólogo en Software";
        carrera1.duracion = 3;
        carrera1.enCurso = false;

        persona1.carrera = carrera1; // Se asigna la carrera antes de usarla

        Persona persona2 = new Persona();
        persona2.nombre = "Ronald";
        persona2.apellido = "Montoya";
        persona2.edad = 30;

        Carrera carrera2 = new Carrera();
        carrera2.nombre = "Ingeniería en Sistemas";
        carrera2.duracion = 5;
        carrera2.enCurso = false;

        persona2.carrera = carrera2;
        
        //String saludo = "Jeremy Veloz";
        
        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y está graduado de " + persona1.carrera.nombre);
        System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " años y está graduado de " + persona2.carrera.nombre);
        // System.out.println(persona1.enviarSaludo(saludo));
        // System.out.println(persona2.enviarSaludo("Jennifer Cabello"));

        


    }
}
