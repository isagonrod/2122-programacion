package Tema12.Anexo.Act_10;

public class ExpDisponible extends Exception implements IExpLogica {
    public ExpDisponible () {
        super("El regalo no está disponible.");
    }
}
