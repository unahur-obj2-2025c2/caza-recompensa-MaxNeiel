package ar.edu.unahur.obj2;

public class CazadorRural extends Cazador{

    private int experiencia;

    public CazadorRural(int experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean condicionEspecifica(Profugo profugo){
        return profugo.esNervioso();
    }
}
