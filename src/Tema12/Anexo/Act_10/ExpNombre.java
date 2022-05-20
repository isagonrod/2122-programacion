package Tema12.Anexo.Act_10;

public class ExpNombre extends Exception implements IExpLogica {
    public ExpNombre () {
        super("El nombre es incorrecto.");
    }
}
