public class Persona {
    
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;


    public String darNombreCompleto() {
        return nombre+ " " + apellido + ", ";
    }

    public String enviarSaludo(String saludo){
        return "Hola, como estas " + saludo;
    }
   


}
