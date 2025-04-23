package com.unl.music.base.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ControladorPracticaA2 {
    public static String[] Contenido(String nombreArchivo) throws IOException {
        FileReader fr = new FileReader(nombreArchivo);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder();
        String linea;
        while ((linea = br.readLine()) != null) {
            sb.append(linea).append("\n");
        }
        br.close();
        return sb.toString().split("\n");
    }

    public static int[] procesarArchivo(String rutaArchivo) throws IOException {
        String[] datos = Contenido(rutaArchivo);
        int[] array = new int[datos.length];
        for (int i = 0; i < datos.length; i++) {
            if (!datos[i].isEmpty()) {
                array[i] = Integer.parseInt(datos[i]);
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] BuscarRepetidos(int[] array) {
        
        int[] aux = new int[array.length];
        int numComparar;
        int repetidos = 0;
        int j = 0;
        while( j < array.length){
            numComparar = array[j];
            for(int i = j; i < array.length -1; i++){
                if (numComparar == array[i+1]) {
                    aux[repetidos] = array[i+1];
                    repetidos++; 
                }
            }
            j++;
        }
        
        System.out.println("cANTIDAD DE DATOS REPETIDOS: "+repetidos);
        return aux;
    }

    public static void mostrarTiempoEjecucion(long startTime, long endTime) {
        long duration = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
    }
}
