package CarreraCiclista;

public class Contrarrelojista extends Ciclista{
    //atributos
    private double velocidadMaxima;

    //constructor
    public Contrarrelojista(int identificador, String nombre, double velocidad){
        super(identificador, nombre);
        velocidadMaxima = velocidad;
    }

    //metodos get y set
    protected double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    protected void setVelocidadMaxima(double velocidad){
        velocidadMaxima = velocidad;
    }

    //metodos
    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleracion promedio = " + this.getVelocidadMaxima());
    }
    protected String imprimirTipo(){
        return "Es un contrarrelojista";
    }
}
