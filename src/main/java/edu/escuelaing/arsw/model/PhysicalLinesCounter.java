package edu.escuelaing.arsw.model;

import java.util.ArrayList;

/**
 * Administra las lineas de un archivo
 */
public class PhysicalLinesCounter implements Counter{

    /**
     * Cuenta el numero de lineas fisicas
     * @param lines Lista de lineas
     * @return Numero de lineas
     */
    @Override
    public int countLines(ArrayList<String> lines) {
        return lines.size();
    }
    
}
