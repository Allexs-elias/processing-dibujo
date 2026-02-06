package nuevopoo;

import processing.core.PApplet;
import models.*;

public class Main extends PApplet {

    Caja pasto;
    Caja tronco;
    Circulo sol;
    Circulo copa1, copa2, copa3;

    public static void main(String[] args) {
        PApplet.main("nuevopoo.Main");
    }

    @Override
    public void settings() {
        size(600, 400);
    }

    @Override
    public void setup() {
        // Pasto
        pasto = new Caja();
        pasto.getPosicion().setX(0);
        pasto.getPosicion().setY(300);
        pasto.getDimension().setAncho(600);
        pasto.getDimension().setAlto(100);
        pasto.setColor(color(80, 180, 80));

        // Sol
        sol = new Circulo();
        sol.getPosicion().setX(500);
        sol.getPosicion().setY(80);
        sol.setRadio(40);
        sol.setColor(color(255, 200, 0));

        // Tronco
        tronco = new Caja();
        tronco.getPosicion().setX(280);
        tronco.getPosicion().setY(200);
        tronco.getDimension().setAncho(40);
        tronco.getDimension().setAlto(100);
        tronco.setColor(color(120, 70, 20));

        // Copa del árbol
        copa1 = new Circulo();
        copa1.getPosicion().setX(300);
        copa1.getPosicion().setY(170);
        copa1.setRadio(50);
        copa1.setColor(color(40, 160, 60));

        copa2 = new Circulo();
        copa2.getPosicion().setX(260);
        copa2.getPosicion().setY(190);
        copa2.setRadio(40);
        copa2.setColor(color(40, 160, 60));

        copa3 = new Circulo();
        copa3.getPosicion().setX(340);
        copa3.getPosicion().setY(190);
        copa3.setRadio(40);
        copa3.setColor(color(40, 160, 60));
    }

    @Override
    public void draw() {
        background(135, 206, 235);

        sol.dibujar(this);
        pasto.dibujar(this);

        tronco.dibujar(this);
        copa1.dibujar(this);
        copa2.dibujar(this);
        copa3.dibujar(this);
    }
}
