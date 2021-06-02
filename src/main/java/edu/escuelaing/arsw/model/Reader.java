package edu.escuelaing.arsw.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que permite el manejo de archivos
 * @author Johann Cepeda
 */
public class Reader {

    private BufferedReader bufferedReader;

    public Reader(){

    }

    /**
     * Lee un archivo para su uso
     * @param path ruta del archivo
     * @return Lista de lineas dentro del archivo
     * @throws IOException
     */
    public ArrayList<String> ReadFile(String path) throws IOException {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String st;
            while ((st = bufferedReader.readLine()) != null)
                lines.add(st);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }

    /**
     * Termina la ejecucion de lectura
     * @throws IOException
     */
    public void close() throws IOException{
        bufferedReader.close();
    }
}
