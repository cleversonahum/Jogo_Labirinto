/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_labirinto;


public class Labirinto {
    //----------------------------------------
    // 0 - Paredes do Labirinto
    // 1 - Caminho que pode ser percorrido
    // 2 - Personagem
    // 3 - Saida do Labirinto
    //----------------------------------------
    
    int labirinto[][] = new int[10][10]; //Labirinto
    int pos[] = new int[2]; //Coordenadas do Personagem
    int pos_saida[] = new int[2]; //Coordenadas da Saida
    boolean levelup = false; //Jogador chegou ao final do labirinto? (true - sim e false - n�o)
    void inicializar_labirinto(int labirinto[][]) {
        this.labirinto = labirinto;
    }
    
    void mostra_labirinto() { //Funç�o que mostra o labirinto no console, para melhor controle
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i<this.labirinto.length;i++) {
            for (int j = 0; j<this.labirinto.length;j++) {
                System.out.print(this.labirinto[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");
    }
    
    
    void pos() { //Função que encontra a posição inicial do jogador e a saida do labirinto
        for (int i = 0; i<this.labirinto.length;i++) {
            for (int j = 0; j<this.labirinto.length;j++) { //Laço que encontra a coordenada do jogador no labirinto
                if(this.labirinto[i][j] == 2){
                   this.pos[0] = i;
                   this.pos[1] = j;
                }   
            }
        }
        
        for (int i = 0; i<this.labirinto.length;i++) { //Laço que encontra a coordenada da saida do labirinto
            for (int j = 0; j<this.labirinto.length;j++) {
                if(this.labirinto[i][j] == 3){
                   this.pos_saida[0] = i;
                   this.pos_saida[1] = j;
                }   
            }
        }  
    } // Fim pos_jogador
    
    
    void mover(int x) { //Função que movimenta o personagem para cima(1), baixo(2), direita(3) e esquerda(4)
        try{ //Tratamento de Exceção
            switch (x) {
                case 1: //x ==1 => Mover para cima
                    if(labirinto[pos[0]-1][pos[1]]==1 || labirinto[pos[0]-1][pos[1]]==3) {
                        labirinto[pos[0]-1][pos[1]] = 2;
                        labirinto[pos[0]][pos[1]] = 1;
                        pos[0] = pos[0]-1;
                        mostra_labirinto();
                    }
                    else {
                        System.out.println("Você não consegue atravessar paredes(ainda)");
                    }
                break;
                
                case 2: //x ==2 => Mover para baixo
                    if(labirinto[pos[0]+1][pos[1]]==1 || labirinto[pos[0]+1][pos[1]]==3) {
                        labirinto[pos[0]+1][pos[1]] = 2;
                        labirinto[pos[0]][pos[1]] = 1;
                        pos[0] = pos[0]+1;
                        mostra_labirinto();
                    }
                    else {
                        System.out.println("Você não consegue atravessar paredes(ainda)");
                    }
                break;
                
                case 3: //x ==3 => Mover para direita
                    if(labirinto[pos[0]][pos[1]+1]==1 || labirinto[pos[0]][pos[1]+1]==3) {
                        labirinto[pos[0]][pos[1]+1] = 2;
                        labirinto[pos[0]][pos[1]] = 1;
                        pos[1] = pos[1]+1;
                        mostra_labirinto();
                    }
                    else {
                        System.out.println("Você não consegue atravessar paredes(ainda)");
                    }
                break;
                
                case 4: //x ==4 => Mover para esquerda
                    if(labirinto[pos[0]][pos[1]-1]==1 || labirinto[pos[0]][pos[1]-1]==3) {
                        labirinto[pos[0]][pos[1]-1] = 2;
                        labirinto[pos[0]][pos[1]] = 1;
                        pos[1] = pos[1]-1;
                        mostra_labirinto();
                    }
                    else {
                        System.out.println("Você não consegue atravessar paredes(ainda)");
                    }
                break;
                
                default:
                    System.out.println("O personagem não sabe voar(ainda)");
                break;
            }//Fim Switch
            
        }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("O array foi excedido");
        } //Fim tratamento de Exceção
        
        if(pos[0]==pos_saida[0] && pos[1]==pos_saida[1])  {//Personagem chegou a saida do labirinto
            System.out.println("Você Venceu!");
            this.levelup = true;
        }
    }
    
    
    public static void main(String[] args) {
        int teste_labirinto[][] =  
        {
            { 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            { 0, 0, 1, 1, 1, 0, 1, 1, 1, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            { 0, 0, 0, 1, 1, 1, 1, 1, 0, 1},
            { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
            { 0, 0, 0, 1, 1, 0, 0, 1, 0, 1},
            { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1},
            { 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 1, 3, 1, 1, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 2, 0, 0, 0, 0}
        };
        Labirinto teste = new Labirinto();
        teste.inicializar_labirinto(teste_labirinto);
        teste.pos();
        teste.mostra_labirinto();
        teste.mover(1);
        teste.mover(4);
        teste.mover(4);
        System.out.println(teste.pos[0]+"  "+teste.pos[1]);
        System.out.println(teste.pos_saida[0] + "   " + teste.pos_saida[1]);
    }
}
