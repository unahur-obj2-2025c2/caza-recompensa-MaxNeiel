package ar.edu.unahur.obj2;

public class CazadorSigiloso extends Cazador {

    private int experiencia;

    public CazadorSigiloso(int experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean condicionEspecifica(Profugo profugo) {
        return profugo.getHabilidad()<50;
    }}
