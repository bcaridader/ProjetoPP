/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author
 * Bruno Ferreira (bruno@dsi.uminho.pt)
 */
public class RegistoAcesso implements Serializable {
    private Utilizador utilizador;
    private LocalDateTime data;

    public RegistoAcesso() {  }

    public RegistoAcesso(Utilizador utilizador, LocalDateTime data) {
        this.utilizador = utilizador;
        this.data = data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }      
    
}


