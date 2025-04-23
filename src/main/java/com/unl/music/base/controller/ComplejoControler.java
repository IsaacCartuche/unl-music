package com.unl.music.base.controller;

import com.unl.music.base.models.Complejo;

public class ComplejoControler {
    private Complejo ca;
    private Complejo cb;

    private int filas = 5;
    private int column = 3;

    public int getFilas() {
        return this.filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumn() {
        return this.column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    private Complejo[][] matriz;

    public Complejo getCa() {
        return this.ca;
    }

    public void setCa(Complejo ca) {
        this.ca = ca;
    }

    public Complejo getCb() {
        return this.cb;
    }

    public void setCb(Complejo cb) {
        this.cb = cb;
    }

    public void setMatriz(Complejo[][] matriz) {
        this.matriz = matriz;
    }

    public Complejo[][] getMatriz() {

        if (matriz == null) {
            matriz = new Complejo[filas][column];
            for (int i = 0; i < matriz.length; i++) {
                Float nu = Float.parseFloat(String.valueOf((Math.random() * 100)));
                Float im = Float.parseFloat(String.valueOf((Math.random() * 100)));

                Float nub = Float.parseFloat(String.valueOf((Math.random() * 100)));
                Float imb = Float.parseFloat(String.valueOf((Math.random() * 100)));
                matriz[i][0] = new Complejo(nu, im);
                matriz[i][1] = new Complejo(nub, imb);
                matriz[i][2] = new Complejo();
            }
        }

        return matriz;

    }

    private Complejo add() {

        Complejo c = new Complejo();
        c.setNum(ca.getNum() + cb.getNum());
        c.setIma(ca.getIma() + cb.getIma());
        return c;
    }

    private Complejo substract() {

        Complejo c = new Complejo();
        c.setNum(ca.getNum() - cb.getNum());
        c.setIma(ca.getIma() - cb.getIma());
        return c;
    }

    private Complejo mult() {

        Complejo c = new Complejo();
        c.setNum((ca.getNum() * cb.getNum()) - (ca.getIma() * cb.getIma()));

        c.setIma((ca.getNum() * cb.getIma()) + (ca.getIma() * cb.getNum()));
        return c;
    }

    private Complejo div() {

        Complejo c = new Complejo();
        c.setNum(((ca.getNum() * cb.getNum()) + (ca.getIma() * cb.getIma()))
                / ((cb.getNum() * cb.getNum()) + (cb.getIma() * cb.getIma())));

        c.setIma(((ca.getIma() * cb.getNum()) - (ca.getNum() * cb.getIma()))
                / ((cb.getNum() * cb.getNum()) + (cb.getIma() * cb.getIma())));
        return c;
    }

    public void operar(int operador) {

        if (ValidOperador(operador)) {
            MatrizIsNull();

            for (int i = 0; i < filas; i++) {
                matriz[i][2] = SelecOperacion(operador, i);
            }

        } else {

            System.out.println("El operador es incorrecto");

        }

    }

    public void MatrizIsNull() {

        if (matriz == null) {
            matriz = getMatriz();
        }

    }

    private boolean ValidOperador(int operador) {
        return operador >= 1 & operador <= 4;
    }

    private Complejo SelecOperacion(int operador, int indicador) {

        Complejo c = new Complejo();
        ca = matriz[indicador][0];
        cb = matriz[indicador][1];

        switch (operador) {
            case 1: // suma
                c = add();
                break;
            case 2: // resta
                c = substract();
                break;
            case 3: // multi
                c = mult();
                break;
            case 4: // div
                c = div();
                break;
            default:
                break;
        }

        return c;
    }

}
