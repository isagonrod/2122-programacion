package Tema12.Anexo.Act_3;

import java.util.Set;

public interface IPartido {
    public Set<IPartido> getPartido();

    public void setPartido(Set<IPartido> partido);

    public String toString();
}
