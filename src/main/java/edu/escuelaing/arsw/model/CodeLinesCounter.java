package edu.escuelaing.arsw.model;

import java.util.ArrayList;

/**
 * Administra las lineas de codigo de un archivo
 */
public class CodeLinesCounter implements Counter {

    public CodeLinesCounter(){

    }

    /**
     * Cuenta el numero de lineas de codigo, eliminando espacios, comentarios, y saltos de linea
     * @param lines Lista de lineas
     * @return Numero de lineas de codigo
     */
    @Override
    public int countLines(ArrayList<String> lines) {
        ArrayList<String> modifiedLines = new ArrayList<String>();
        for (String line : lines) {
            line = line.replaceAll(" ", "");
            if (line.length() > 0 && !line.contains("/**") && !line.contains("/*") && !line.startsWith("//")
                    && !line.startsWith("*") && !line.startsWith("#") && !line.contains("*/")) {
                modifiedLines.add(line);
            }
        }
        return modifiedLines.size();
    }
}
