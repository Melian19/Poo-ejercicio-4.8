package CarreraCiclista;

public class Velocista extends Ciclista{
    //atributos
    private double potenciaPromedio;
    private double velocidadPromedio;

    //constructor
    public Velocista(int identificador, String nombre, double potencia, double velocidad){
        super(identificador, nombre);
        potenciaPromedio = potencia;
        velocidadPromedio = velocidad;
    }

    //metodos get y set
    protected double getPotenciaPromedio(){
        return potenciaPromedio;
    }
    protected void setPotenciaPromedio(double potencia){
        potenciaPromedio = potencia;
    }
    protected double getVelocidadPromedio(){
        return velocidadPromedio;
    }
    protected void setVelocidadPromedio(double velocidad){
        velocidadPromedio = velocidad;
    }

    //metodos
    protected void imprimir(){
        super.imprimir();
        System.out.println("Potencia promedio = " + this.getPotenciaPromedio());
        System.out.println("Velocidad promedio = " + this.getVelocidadPromedio());
    }
    protected String imprimirTipo(){
        return "Es un velocista";
    }
    
}
