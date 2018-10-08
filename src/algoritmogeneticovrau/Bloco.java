/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogeneticovrau;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Bloco {
    
    int valor;
    int peso;
    
    //Random r = new Random();
    
    public Bloco(int valor, int peso){
        this.peso = peso;
        this.valor = valor;
    }
   

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
   
}

 