package algoritmogenetico;

import java.util.Arrays;
import java.util.Random;

public class Individuo implements Comparable<Individuo> {

    private final Random random = new Random();
    private Integer aptidao;

    //Um indivíduo é uma possível solução para o problema.
    //atributos do problema especifico
    private static final int PESO[] = {5, 4, 7, 8, 4, 4, 6, 8};
    private static final int VALOR[] = {3, 3, 2, 4, 2, 3, 5, 8};

    private int[] cromossomo ;

    //cria um individuo aleatorio da primeira geracao
    public Individuo() {
        cromossomo = new int[8];
        do {
//			this.setPeso();
//			this.setValor();
        this.setCromossomo();
        } while (!validar());
        avaliar();
    }

    // cria um individuo a partir de genes definidos
    public Individuo(int[] novoCromossomo) {
//		qtdMilho = genes[0];
//		qtdSoja = genes[1];

        cromossomo = novoCromossomo;

        //testa se deve fazer mutacao
        if (random.nextDouble() <= Genetico.TAXADEMUTACAO) {
            int posAleatoria = random.nextInt(cromossomo.length); //define gene que sera mutado
            mutacao(posAleatoria);
        }
        avaliar();
    }

    public boolean validar() {
//		double proteina = 0.0851 * qtdMilho + 0.456 * qtdSoja;
//		double energia = 3146 * qtdMilho + 2283 * qtdSoja;

        int somaPeso = 0;
        //Validar = Peso
        for (int x = 0; x < 8; x++) {
            if (cromossomo[x] == 1) {
                
                somaPeso += PESO[x];
            }
        }
        
//        if (somaPeso <= 25) {
//            System.out.println("O PESO: "+somaPeso);
//            return true;
//        } else {
//            return false;
//        }
       return somaPeso <= 25;
    }

    private void mutacao(int posicao) {
        //do {
            if (cromossomo[posicao] == 1) {
                cromossomo[posicao] = 0;
            } else {
                cromossomo[posicao] = 1;
            }
        //} while (!validar());

    }

    private void setCromossomo() {
        //Criando um cromossomo aletatoriamente
        for (int x = 0; x < 8; x++) {
            if (random.nextBoolean()) {
                cromossomo[x] = 1;
            } else {
                cromossomo[x] = 0;
            }
        }
    }

//    private void setPeso() {
//        this.qtdMilho = random.nextDouble();
//    }
//
//    private void setValor() {
//        this.qtdSoja = random.nextDouble();
//    }
    public double getAptidao() {
        return aptidao;
    }

//    public double[] getGenes() {
//        return new double[]{qtdMilho, qtdSoja};
//    }
    public int[] getCromossomo() {

       
        return cromossomo;
    }

    private void avaliar() {

        //Avaliar = valor;
        aptidao = -1;
        for (int x = 0; x < cromossomo.length; x++) {
            if (cromossomo[x] == 1) {
                aptidao += VALOR[x];
            }
        }
    }

    @Override
    public String toString() {
        return "Cromossomo " + Arrays.toString(cromossomo) + " Aptidao: " + aptidao + "\n";
    }

    @Override
    public int compareTo(Individuo i) {
        return this.aptidao.compareTo(i.aptidao);
    }

//    @Override
//    public int compareTo(Individuo o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
