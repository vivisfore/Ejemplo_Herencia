public class Main {
    public static void main(String[] args) {

    Persona p=new Persona("Juan","Garcia",23);
        System.out.println(p.toString());
        p.mayorEdad();

    Estudiante e=new Estudiante("Maria","Rojas",15,100,3.5f);
    System.out.println(e.toString());
    e.mayorEdad();
    e.aprobar();
    System.out.println(e.getNombre());
    }
}