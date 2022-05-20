package Tema12.Anexo.Act_10;

public class ExpPrecio extends Exception implements IExpReal {
    public ExpPrecio () {
        super("El valor del precio no es válido.");
    }
}
