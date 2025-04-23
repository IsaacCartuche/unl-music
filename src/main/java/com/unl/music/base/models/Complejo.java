package com.unl.music.base.models;

public class Complejo {
    private Float num;
    private Float ima;

    public Complejo(Float num, Float ima){
        this.num =  num;
        this.ima = ima;
    }

    public Complejo(){
        
    }

    public Float getNum() {
      return this.num;
    }
    public void setNum(Float value) {
      this.num = value;
    }

    public Float getIma() {
      return this.ima;
    }
    public void setIma(Float value) {
      this.ima = value;
    }
}

