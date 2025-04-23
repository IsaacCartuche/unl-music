package com.unl.music.base.controller;



import com.unl.music.base.controller.dataStruct.list.LinkedList;
//import com.unl.music.base.models.Complejo;

public class PruebaEjec {
    public static void main(String[] args) {
        /* 
        System.out.println("vamo bien");
        ComplejoControler prueba = new ComplejoControler();
        // 1 : suma
        // 2 : resta
        // 3 : multiplicacion
        // 4 : divicion
        prueba.operar(2);

        Complejo[][] a = prueba.getMatriz();

        System.out.println( "(" + a[0][0].getNum() + ","+ a[0][0].getIma() + "i) + (" + a[0][1].getNum() + ","+ a[0][1].getIma() + "i) = " + "(" + a[0][2].getNum() + ","+ a[0][2].getIma() + "i)"     );
        */

        try {
            LinkedList prueba = new LinkedList<>();
        System.out.println(prueba.isEmpty());
        prueba.add("123");
        
        System.out.println(prueba.print());
        prueba.add("456", 1);
        System.out.println(prueba.print());
        prueba.add("789", 2);
        System.out.println(prueba.print());
        
        prueba.add("abc", 1);
        System.out.println(prueba.print());
        } catch (Exception e) {
            System.out.println("Erro" + e);
        }


    }
}