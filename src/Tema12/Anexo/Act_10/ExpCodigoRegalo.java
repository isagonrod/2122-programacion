package Tema12.Anexo.Act_10;

public class ExpCodigoRegalo extends Exception implements IExpLogica {
    public ExpCodigoRegalo () {
        super("El código del regalo es incorrecto.");
    }
}
