package ar.edu.unahur.obj2;

public class Profugo {

    private int inocencia;
    private int habilidad;
    private Boolean esNervioso;

    public Profugo(int inocencia, int habilidad, Boolean esNervioso) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.esNervioso = esNervioso;
    }

    public Integer getInocencia() {
        return inocencia;        
    }

    public Integer getHabilidad() {
        return habilidad;
    }

    public Boolean esNervioso() {
        return esNervioso;
    }

    public void disminuirInocencia() {
        this.inocencia = Math.max(0, this.inocencia - 2);
    }

    public void disminuirHabilidad() {
        this.habilidad = Math.max(0, this.inocencia - 5);
    }

}
