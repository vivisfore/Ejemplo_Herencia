public class Estudiante extends Persona {

    private int codigoEst;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Estudiante(String nombre, String apellido, int edad, int codigoEst, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEst = codigoEst;
        this.notaFinal = notaFinal;
    }

    public Estudiante(String nombre, String apellido, float notaFinal) {
        super(nombre, apellido);
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigoEst=" + codigoEst +
                ", notaFinal=" + notaFinal +
                "} " + super.toString();
    }

    public void aprobar(){
        if(this.notaFinal>=3.0){
            System.out.println("El estudiante "+this.getNombre()+" "+this.getApellido()+" aprobo");
        }else{
            System.out.println("Estudiante "+this.getNombre()+" Reprobo");
        }
    }
}
