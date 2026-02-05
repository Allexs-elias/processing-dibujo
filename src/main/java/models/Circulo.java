package models;

import processing.core.PApplet;

public class Circulo {

    private Posicion posicion;
    private int radio;
    private int color;
    private Borde borde;

    public Circulo() {
        this(new Posicion(), 40, new Borde(2, 0), 200);
    }

    public Circulo(Posicion posicion, int radio, Borde borde, int color) {
        this.posicion = posicion;
        this.radio = radio;
        this.borde = borde;
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void dibujar(PApplet app) {
        app.stroke(borde.getColor());
        app.strokeWeight(borde.getAncho());
        app.fill(color);

        app.ellipse(
            posicion.getX(),
            posicion.getY(),
            radio * 2,
            radio * 2
        );
    }
}