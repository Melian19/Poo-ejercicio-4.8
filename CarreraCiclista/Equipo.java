package CarreraCiclista;
import java.util.*;

public class Equipo {
    //atributos
    private String nombre;
    private static double totalTiempo;
    private String pais;
    Vector listaCiclistas;

    //constructor
    public Equipo(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new Vector();
    }

    //metodos get y set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public double getTotalTiempo(){
        return totalTiempo;
    }
    public void setTotalTiempo(double total){
        totalTiempo = total;
    }

    //metodos
    public void añadirCiclista(Ciclista ciclista){
        listaCiclistas.add(ciclista);
    }

    public void listarEquipo(){
        for (int i=0; i<listaCiclistas.size(); i++){
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            System.out.println(c.getNombre());
        }
    }

    public void buscarCiclista(){
        System.out.println("Ingrese identificador del ciclista: ");
        Scanner sc = new Scanner(System.in);
        int identificadorCiclista = sc.nextInt();
        sc.close();
        for (int i=0; i<listaCiclistas.size(); i++){
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            if (c.getIdentificador() == identificadorCiclista){
                c.imprimir();
            }else{
                System.out.println("No hay ciclista con identificador "+identificadorCiclista);
            }
        }
    }

    public void calcularTiempo(){
        for (int i=0; i<listaCiclistas.size(); i++){
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }

    public void imprimir() {
        System.out.println("Nombre del equipo = " + this.getNombre());
        System.out.println("País = " + this.getPais());
        System.out.println("Total tiempo del equipo = " + this.getTotalTiempo());
        }

}
