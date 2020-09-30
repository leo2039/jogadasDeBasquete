/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leo
 */
public class Jogadas {

    private int jogos;

    public Jogadas(int jogos) {
        this.jogos = jogos;
    }

    Jogadas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getJogos() {
        return jogos;
    }

    public void setJogos(int jogos) {
        this.jogos = jogos;
    }
    
    public boolean pMin(int pJogo, int pMin){ //função que testa a houve placar minimo recebe como parametro dois valores inteiros placar do jogo atual e valor da pontuação minima atualizada
        if(pJogo < pMin){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean pMax(int pJogo, int pMax){ //Função que retorna falso ou verdadiro para placar maximo , recebe dois inteiros como parametro 
        if(pJogo > pMax){
            return true;
        }else{
            return false;
        }
    }
}
