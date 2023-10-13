package CarreraCiclista;

public abstract class Ciclista {
    //atributos
    private int identificador;
    private String nombre;
    private int tiempoAcumulado = 0;

    //constructor
    public Ciclista(int identificador, String nombre){
        this.identificador = identificador;
        this.nombre = nombre;
    }

    //metodos abstractos
    protected abstract String imprimirTipo();

    //metodos get y set
    protected int getIdentificador(){
        return identificador;
    }
    protected void setIdentificador(int identificador){
        this.identificador = identificador;
    }
    protected String getNombre(){
        return nombre;
    }
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    protected int getTiempoAcumulado(){
        return tiempoAcumulado;
    }
    protected void setTiempoAcumulado(int tiempo){
        tiempoAcumulado = tiempo;
    }

    protected void imprimir(){
        System.out.println("Identificador = " + this.getIdentificador());
        System.out.println("Nombre = " + this.getNombre());
        System.out.println("Tiempo Acumulado = " + this.getTiempoAcumulado());
    }
}
