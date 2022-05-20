package Tema12.Anexo.Act_10;

public class ExpCodigoBoda extends Exception implements IExpLogica {
    public ExpCodigoBoda () {
        super("El código de la boda es incorrecto");
    }
}
