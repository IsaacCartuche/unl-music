package com.unl.music.base.controller.dao.dao_models;

import com.unl.music.base.models.Artista;

import com.unl.music.base.controller.dao.AdapterDao;

public class DaoArtista extends AdapterDao<Artista>{

    private Artista obj;

    public DaoArtista() {
        super(Artista.class);
        //TODO Auto-generated constructor stub
    }

    public Artista getObj() {
        if(obj == null)
            this.obj = new Artista();
        return this.obj;
    }

    public void setObj(Artista obj) {
        this.obj = obj;
    }

    public Boolean save() {
        try {
            this.persist(obj);
            return true;
        } catch (Exception e) {
            //LOG de error

            // TODO: handle exception
            return false;
        }
    }


    public static void main(String[] args) {
        DaoArtista da = new DaoArtista();
        da.getObj().setId(da.listAll().getLength()+1);
        da.getObj().setNacionalidad("Ecuatoriana");
        da.getObj().setNombres("Viviana Cordova");
        if(da.save())
            System.out.println("guardado");
        else 
            System.out.println("Hubo un error");
    }

}
