package com.unl.music.base.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.unl.music.base.controller.dataStruct.list.LinkedList;
import com.unl.music.base.controller.dataStruct.list.Node;



 
public class ControladroPracticaL2 {
    public LinkedList lista = new LinkedList<>();
    
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

    public static LinkedList procesarArchivo(String rutaArchivo) throws Exception {
        String[] datos = Contenido(rutaArchivo);
        LinkedList lista = new LinkedList<>();
        for (int i = 0; i < datos.length; i++) {
            if (!datos[i].isEmpty()) {
                lista.add(Integer.parseInt(datos[i]));
            } else {
                throw new ArrayIndexOutOfBoundsException("List Empty");
            }
        }
        return lista;
    }

    public static LinkedList BuscarRepetidos(LinkedList lista) throws Exception {
        
        LinkedList aux = new LinkedList<>();
        int numComparar;
        int repetidos = 0;
        int j = 0;
        while(j < lista.getLength()){
            numComparar = (int) lista.get(j);
            for(int i = j; i < lista.getLength()-1; i++){
                if (numComparar == (int) lista.get(i+1)) {
                    aux.add((int) lista.get(i+1));
                    lista.deleteNode(i+1);
                    repetidos++; 
                }
            }
            j++;
        }
        System.out.println("CANTIDAD DE REPETIDOS: " + repetidos);
        return aux;
    }

    public static void mostrarTiempoEjecucion(long startTime, long endTime) {
        long duration = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
    }
}
