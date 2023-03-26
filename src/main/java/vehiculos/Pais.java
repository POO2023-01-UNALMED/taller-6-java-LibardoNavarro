package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private static ArrayList<Pais> paises;
    int ventas;

    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static Pais paisMasVendedor(){
        Pais mayor = paises.get(0);
        for (Pais p : paises){
            if (p.ventas > mayor.ventas){
                mayor = p;
            }
        }
        return mayor;
    }
}
