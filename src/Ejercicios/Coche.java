package Ejercicios;

public class Coche {
    private int puertas;

    public Coche() {
    }

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void aniadirPuerta(){
        this.puertas++;
    }
}
