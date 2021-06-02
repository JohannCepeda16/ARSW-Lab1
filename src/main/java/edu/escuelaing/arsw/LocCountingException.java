package edu.escuelaing.arsw;

public class LocCountingException extends Exception{

    public static final String INVALID_FORMAT = "Formato de conteo invalido";
    public static final String MISSING_ARGS = "Se esperan dos parametros [modo de conteo, path]";

    public LocCountingException(String msg){
        super(msg);
    }
}
