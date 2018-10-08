/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogeneticovrau;

/**
 *
 * @author Aluno
 */
public class teste {
    public static void main(String[] args){
        Individuo v = new Individuo();
        
        for(int i = 0; i < 8; i++){
            System.out.print("peso " + v.v[i].peso);
            System.out.println(" valor " + v.v[i].valor);
        }
    }
}
