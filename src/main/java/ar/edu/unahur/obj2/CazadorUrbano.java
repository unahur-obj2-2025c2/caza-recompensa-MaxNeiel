package ar.edu.unahur.obj2;

public class CazadorUrbano extends Cazador{

    private int experiencia;

    public CazadorUrbano(int experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean condicionEspecifica(Profugo profugo) {
        return !profugo.esNervioso();
    }

}
