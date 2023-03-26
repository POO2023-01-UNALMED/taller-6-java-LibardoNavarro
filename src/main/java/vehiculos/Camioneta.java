package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;
    private int velocidadMaxima = 90;
    private String traccion = "4X4";
    
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante,boolean volco) {
        super(placa, puertas, nombre, precio, peso, fabricante);
        this.volco = volco;
        Vehiculo.CantidadCamionetas++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
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
