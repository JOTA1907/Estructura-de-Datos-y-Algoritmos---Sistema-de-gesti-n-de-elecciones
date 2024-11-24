
package Modelo;


import java.util.Stack;

public class Voto {
    private String tipo;//tipo (válido, nulo)
    private String dniCandidato;
    
    public Voto(String tipo){
        this.tipo= tipo;
    }
    
    public Voto(String tipo, String dniCandidato) {
        this.tipo = tipo;
        this.dniCandidato = dniCandidato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDniCandidato() {
        return dniCandidato;
    }

    public void setDniCandidato(String dniCandidato) {
        this.dniCandidato = dniCandidato;
    }
    
    

}
