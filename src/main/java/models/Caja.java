package models;

import processing.core.PApplet;

public class Caja {
    private Posicion posicion;
    private Dimension dimension;
    private int color;

    public Caja() {
        posicion = new Posicion();
        dimension = new Dimension();
        color = 0;
    }

    public Posicion getPosicion() { return posicion; }
    public Dimension getDimension() { return dimension; }

    public void setColor(int color) {
        this.color = color;
    }

    public void dibujar(PApplet app) {
        app.fill(color);
        app.rect(
            posicion.getX(),
            posicion.getY(),
            dimension.getAncho(),
            dimension.getAlto()
        );
    }
}