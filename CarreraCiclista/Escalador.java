package CarreraCiclista;

public class Escalador extends Ciclista{
    //atributos
    private double aceleracionPromedio;
    private double gradoRampa;

    //constructor
    public Escalador(int identificador, String nombre, double aceleracion, double grado){
        super(identificador, nombre);
       aceleracionPromedio = aceleracion;
       gradoRampa = grado;
    }

    //metodos get y set
    protected double getAceleracionPromedio(){
        return aceleracionPromedio;
    }
    protected void setAceleracionPromedio(double aceleracion){
        aceleracionPromedio = aceleracion;
    }
    protected double getGradoRampa(){
        return gradoRampa;
    }
    protected void setGradoRampoa(double grado){
        gradoRampa = grado;
    }

    //metodos
    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleracion promedio = " + this.getAceleracionPromedio());
        System.out.println("Grado de rampa = " + this.getGradoRampa());
    }
    protected String imprimirTipo(){
        return "Es un escalador";
    }
}
