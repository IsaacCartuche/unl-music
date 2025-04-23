package com.unl.music.base.controller;



import com.unl.music.base.controller.dataStruct.list.LinkedList;
//import com.unl.music.base.models.Complejo;

public class PruebaEjec {
    public static void main(String[] args ) throws Exception {
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

        // try {
        //     LinkedList prueba = new LinkedList<>();
        // System.out.println(prueba.isEmpty());
        // prueba.add("123");
        
        // System.out.println(prueba.print());
        // prueba.add("456", 1);
        // System.out.println(prueba.print());
        // prueba.add("789", 2);
        // System.out.println(prueba.print());
        
        // prueba.add("abc", 1);
        // System.out.println(prueba.print());
        // } catch (Exception e) {
        //     System.out.println("Erro" + e);
        // }




        // prueba de ejecución de la practica 2 =================================================================================================
        //con arreglos
        // ControladorPracticaA2 arregloPrueba = new ControladorPracticaA2();

        // long startTime = System.nanoTime();
        // String rutaArchivo = "src\\main\\java\\com\\unl\\music\\base\\controller\\data.txt";
        // int[] array = arregloPrueba.procesarArchivo(rutaArchivo);
        // int[] result = arregloPrueba.BuscarRepetidos(array);
        // long endTime = System.nanoTime();
        // arregloPrueba.mostrarTiempoEjecucion(startTime, endTime);






        // con listas enlazadas
        ControladroPracticaL2 ListaPrueba = new ControladroPracticaL2();

        long startTime = System.nanoTime();
        String rutaArchivo = "src\\main\\java\\com\\unl\\music\\base\\controller\\data.txt";
        LinkedList array = ListaPrueba.procesarArchivo(rutaArchivo);
        LinkedList result = ListaPrueba.BuscarRepetidos(array);
        
        System.out.println(result.print());
        long endTime = System.nanoTime();
        ListaPrueba.mostrarTiempoEjecucion(startTime, endTime);


    }
}
