public class App {
    public static void main(String[] args) throws Exception {
       
        Persona persona1 = new Persona();
        persona1.nombre = "Bryan";
        persona1.apellido = "Cabello";
        persona1.edad = 31;

        Persona persona2 = new Persona();
        persona2.nombre = "Ronald";
        persona2.apellido = "Montoya";
        persona2.edad = 30;

        String saludo = "Bryan Cabello";

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años");
        System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " años");
        System.out.println(persona1.enviarSaludo(saludo));
        


    }
}
