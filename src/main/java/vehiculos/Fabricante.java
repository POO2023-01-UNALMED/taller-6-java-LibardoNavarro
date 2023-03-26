package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();;
    int ventas;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        pais.ventas++;
        fabricas.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    public static Fabricante fabricaMayorVentas(){
        Fabricante mayor = fabricas.get(0);
        for (Fabricante f : fabricas){
            if (f.ventas > mayor.ventas){
                mayor = f;
            }
        }
        return mayor;
    }
}
