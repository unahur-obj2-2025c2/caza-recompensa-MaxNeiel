package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProfugoTest {
    
    @Test
    public void guardaYDevuelveAtributos(){
        Profugo p = new Profugo(50,60,true);
        assertEquals(Integer.valueOf(50), p.getInocencia());
        assertEquals(Integer.valueOf(60), p.getHabilidad());
        assertTrue(p.esNervioso());

    }
    @Test
    public void disminuirInocenciaNoBajaDeCero(){
        Profugo p = new Profugo(1,30,false);
        p.disminuirInocencia();
        p.disminuirInocencia();
        assertEquals(Integer.valueOf(0), p.getInocencia());
    }
    @Test
    public void disminuirHabilidadNoBajaDeCero(){
        Profugo p = new Profugo(1,3,false);
        p.disminuirHabilidad();
        p.disminuirHabilidad();
        assertEquals(Integer.valueOf(0), p.getHabilidad());
    }
}
