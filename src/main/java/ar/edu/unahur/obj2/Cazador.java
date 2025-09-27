package ar.edu.unahur.obj2;

public abstract class Cazador {

    private Integer experiencia;

    public Cazador(Integer experiencia){
        this.experiencia = experiencia;
    }

    public Boolean puedeCapturar(Profugo profugo){

        return this.experiencia > profugo.getInocencia()
        && condicionEspecifica(profugo);
    }

    protected abstract Boolean condicionEspecifica(Profugo profugo);

}