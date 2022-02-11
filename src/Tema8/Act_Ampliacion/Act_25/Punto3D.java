package Tema8.Act_Ampliacion.Act_25;

public class Punto3D extends Punto {
    int z;

    public Punto3D (int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double distancia (Punto3D otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.x - this.x, 2) + Math.pow(otroPunto.y - this.y, 2) + Math.pow(otroPunto.z - this.z, 2));
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.z;
    }
}
