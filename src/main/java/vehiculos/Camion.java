package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;
    private int puertas = 2;
    private int velocidadMaxima = 80;
    private String traccion = "4X2";

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante,int ejes) {
        super(placa, nombre, precio, peso, fabricante);
        this.ejes = ejes;
        Vehiculo.CantidadCamiones++;
    }
    
    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
