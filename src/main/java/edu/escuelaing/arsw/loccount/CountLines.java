package edu.escuelaing.arsw.loccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import edu.escuelaing.arsw.LocCountingException;
import edu.escuelaing.arsw.model.CodeLinesCounter;
import edu.escuelaing.arsw.model.PhysicalLinesCounter;
import edu.escuelaing.arsw.model.Reader;

/**
 * Cuenta las lineas de codigo dentro de un archivo. uso: Para contar las lineas
 * de un archivo ejecute: $ java CountLines phy [sourcefile] Para contar las
 * lineas de codigo ejecute: $ java CountLines loc [sourcefile]
 * 
 * @author Johann Cepeda
 *
 */
public class CountLines {
    static BufferedReader bufferedReader;

    /**
     * Metodo principal de la clase
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, LocCountingException {
        if(args.length <= 1)
            throw new LocCountingException(LocCountingException.MISSING_ARGS);

        String typeOfCount = args[0];
        String fileName = args[1];

        Reader reader = new Reader();

        ArrayList<String> lines = reader.ReadFile(fileName);

        if (typeOfCount.equals("phy")){
            PhysicalLinesCounter physicalLinesCounter = new PhysicalLinesCounter();
            System.out.println("Número de lineas fisicas: " + physicalLinesCounter.countLines(lines));
        }
        else if (typeOfCount.equals("loc")){
            CodeLinesCounter codeLinesCounter = new CodeLinesCounter();
            System.out.println("Número de lineas de codigo: " + codeLinesCounter.countLines(lines));
        }
        else{
            throw new LocCountingException(LocCountingException.INVALID_FORMAT);
        }

        reader.close();
    }
}
