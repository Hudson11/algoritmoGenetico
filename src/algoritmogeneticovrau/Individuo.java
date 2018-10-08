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
public class Individuo implements Comparable<Individuo>{
    
    Random r = new Random();
    int soma = 0;

    @Override
    public int compareTo(Individuo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Bloco[] v = new Bloco[8];
    
    public Bloco iniciaBloco(){
        Bloco v;
  
        do{
            
            v = new Bloco(r.nextInt(5), r.nextInt(8));
            
        }while(!avaliar(v.getValor(), v.getPeso()));
        
        return v;
    }
    
    public boolean avaliar(int valor, int peso){
        return (valor >= 1 && valor <= 5) && (peso >= 1 && peso <= 8);
    }
    
    
    
    public Individuo(){
        
        for(int i = 0; i < 8; i++){
            v[i] = iniciaBloco();
            soma = soma +  v[i].peso;
        }
        
    }
    
    public void criaIndividuo(){
        
    }
       
}
