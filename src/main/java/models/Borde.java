package models;

public class Borde {

    private int ancho;
    private int color;

    public Borde() {
        this(1, 0);
    }

    public Borde(int ancho, int color) {
        this.ancho = ancho;
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public int getColor() {
        return color;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setColor(int color) {
        this.color = color;
    }
}