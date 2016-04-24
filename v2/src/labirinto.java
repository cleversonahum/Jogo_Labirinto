/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.util.Objects;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class labirinto {
    //----------------------------------------
    // 0 - Paredes do Labirinto
    // 1 - Caminho que pode ser percorrido
    // 2 - Personagem
    // 3 - Saida do Labirinto
    //----------------------------------------
    
    
    static Scanner entrada1 = new Scanner(System.in);//para fazer a escolha do nível.
    static Scanner entrada2 = new Scanner(System.in);//para se movimentar dentro do labirinto.
    static JFrame mapa = new JFrame();//variavel da interface.
    static String dados [][] = new String [22][22];//variavel da interface.
    static Object colunas[] = {"","","","","","O","","L","A","B","I","R","I","N","T","O","","","","","",""};//variavel da interface.
    static JTable tabela = new JTable(dados,colunas);//variavel da interface.
    static JScrollPane scroolPane = new JScrollPane(tabela);//essa será a janela da interface.
    
    public static void main(String[]args){
        mapa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        escolhernivel();
    }
    /*
    int labirinto[][] = new int[10][10]; //Labirinto
    int pos[] = new int[2]; //Coordenadas do Personagem
    int pos_saida[] = new int[2]; //Coordenadas da Saida
    boolean levelup = false; //Jogador chegou ao final do labirinto? (true - sim e false - n�o)
    */
    static void escolhernivel(){
        int r;
        String n = JOptionPane.showInputDialog(null, "Escolha o nível( 1 - 2 - 3 ) ??");
        if(n.equals ("1")){ // verifica se foi escolhido o nivel 1.
            mapa1(dados);
            r=mover(6,6,15,15);// é o paramatro de onde inicia e termina o labirinto do mapa de nivel 1.
            ranking1(r);
        }
        else if(n.equals("2")){ //verifica se foi escolhido o nivel 2.
            mapa2(dados);
            r=mover(3,17,17,11);// é o paramatro de onde inicia e termina o labirinto do mapa de nivel 2.
            ranking2(r);
        }
        else if(n.equals("3")){ //verifica se foi escolhido o nivel 3.
         /* FALTA IMPLEMENTAR O MAPA DE NIVEL 3.  
            mapa3(dados);
            r=mover(20,20,1,20);
            ranking3(r);
            */
        }
        else{
            JOptionPane.showMessageDialog(null, "Nível Inválido !");
            escolhernivel();
        }
    }
    
    public static int mover(int x, int y, int z, int k){ //(x,y) - sao as coordenadas iniciais, (z,k) as finais 
     int contador = 0;
     int a = x; int b=y;
     while(!dados[z][k].equals(" O")){//enquanto as posições finais(z,k)for diferente de O, usado para se movimentar.
       String sentido = JOptionPane.showInputDialog(null, "Qual sentido deseja se mover: \nN - Norte\nS - Sul\n"
               + "L - Leste\nO - Oeste").toUpperCase();//converte o caractere digitado em letra maiuscula.
       if(sentido.equals("N")){// verifica se foi escolhido ir para norte.
           dados[a][b]="";
           a-=1; // anda uma linha para cima
           mostrarmapa(scroolPane);
           if(dados[a][b].equals("XXX")){//se movimento estiver invalido, na direção da parede, por exemplo.
               JOptionPane.showMessageDialog(null, "Jogada Invalida !");
               a+=1;// faz voltar a posição inicial e repete o laço.
               mostrarmapa(scroolPane);
           }
           if(dados[a][b].equals(" ")){// verifica se a pessoa se movimentou para um espaço vazio.
               JOptionPane.showMessageDialog(null, "Você caiu em um armadilha, volte ao inicio.");
               a=x; b=y;
               mostrarmapa(scroolPane);
           }
           dados[a][b]=" O";
       }
       else if(sentido.equals("S")){// verifica se foi escolhido ir para norte.
           dados[a][b]="";
          a=a+1; // anda uma linha para baixo.
          mostrarmapa(scroolPane);
           if(dados[a][b].equals("XXX")){//se movimento estiver invalido, na direção da parede, por exemplo.
               JOptionPane.showMessageDialog(null, "Jogada Invalida !");
               a=a-1;// faz voltar a posição inicial e repete o laço.
               mostrarmapa(scroolPane);
           }
           if(dados[a][b].equals(" ")){// verifica se a pessoa se movimentou para um espaço vazio.
               JOptionPane.showMessageDialog(null, "Você caiu em um armadilha, volte ao inicio.");
               a=x; b=y;
               mostrarmapa(scroolPane);
           }
           dados[a][b]=" O";
       }
       else if(sentido.equals("L")){// verifica se foi escolhido ir para norte.
           dados[a][b]="";
           b=b+1; // anda uma casa para a direita
           mostrarmapa(scroolPane);
           if(dados[a][b].equals("XXX")){//se movimento estiver invalido, na direção da parede, por exemplo.
               JOptionPane.showMessageDialog(null, "Jogada Invalida !");
               b=b-1;// faz voltar a posição inicial e repete o laço.
               mostrarmapa(scroolPane);
           }
           if(dados[a][b].equals(" ")){// verifica se a pessoa se movimentou para um espaço vazio.
               JOptionPane.showMessageDialog(null, "Você caiu em um armadilha, volte ao inicio.");
               a=x; b=y;
               mostrarmapa(scroolPane);
           }
           dados[a][b]=" O";
       }
       else if(sentido.equals("O")){// verifica se foi escolhido ir para norte.
           dados[a][b]="";
           b=b-1; // anda uma linha para baixo.
           mostrarmapa(scroolPane);
           if(dados[a][b].equals("XXX")){//se movimento estiver invalido, na direção da parede, por exemplo.
               JOptionPane.showMessageDialog(null, "Jogada Invalida !");
               b=b+1;// faz voltar a posição inicial e repete o laço.
               mostrarmapa(scroolPane);
           }
           if(dados[a][b].equals(" ")){// verifica se a pessoa se movimentou para um espaço vazio.
               JOptionPane.showMessageDialog(null, "Você caiu em um armadilha, volte ao inicio.");
               a=x; b=y;
               mostrarmapa(scroolPane);
           }
           dados[a][b]=" O";
       }
       else{
           JOptionPane.showMessageDialog(null, "Escolha Inválida !");
           mostrarmapa(scroolPane);
       }
       contador++;
     }
     JOptionPane.showMessageDialog(null, "Parabéns, Voce Resolveu o Labirinto em %d movimentos.\n"+contador);
     return contador;
    }
    
    public static void mostrarmapa(JScrollPane scroolPane){
        mapa.add(scroolPane,BorderLayout.CENTER);
        mapa.setSize(565,410); //define o tamanho da janela da interface.
        mapa.setVisible(true);//deixa a interface visivel.
    }
    
    public static void ranking1(int C){
        if(C==22){
            JOptionPane.showMessageDialog(null, "Perfect !!");
        }
        else if(C > 22 && C<=25){
            JOptionPane.showMessageDialog(null, "Ótimo Desempenho.");
        }
        else if(C>25){
            JOptionPane.showMessageDialog(null, "Bom desempenho, tente novamente.");
            escolhernivel();
        }
    }
    
    public static void ranking2(int B){
        if(B==60){
            JOptionPane.showMessageDialog(null, "Perfect !!");
        }
        else if(B > 60 && B<=70){
            JOptionPane.showMessageDialog(null, "Ótimo Desempenho.");
        }
        else if(B>70){
            JOptionPane.showMessageDialog(null, "Bom desempenho, tente novamente.");
            escolhernivel();
        }
    }
    
    public static void ranking3(int A){
        //implementar depois de implementar o mapa de nivel 3.
    }
    
    //Mapa de Nível 1 
    public static void mapa1(String dados[][]){
        //laço que preenche o labirinto primeiro com XXX.
        for(int i = 0; i<22; i++){
            for(int j = 0; j<22;j++){
                dados[i][j]="XXX";
            }
        }
        //agora preenche o caminho que poderá ser percorrido, o restante será a "parede" do labirinto.
        dados[6][6]=" O";   dados[6][7]="";     dados[7][7]="";     dados[8][7]="";     dados[8][11]="";    dados[8][12]="";
        dados[8][13]="";    dados[9][7]="";     dados[9][8]="";     dados[9][9]="";     dados[9][10]="";    dados[9][11]="";
        dados[9][13]="";    dados[10][7]=" ";//aqui tem uma armadilha que faz voltar ao inicio do jogo.
        dados[10][10]="";   dados[10][13]="";   dados[11][6]="";    dados[11][7]="";    dados[11][10]="";   dados[11][13]="";
        dados[12][6]="";    dados[12][10]="";   dados[12][12]="";   dados[12][13]="";   dados[13][10]="";   dados[13][12]="";
        dados[14][12]="";   dados[15][12]="";   dados[15][13]="";   dados[15][14]="";   dados[15][15]="FIM";
        
        mostrarmapa(scroolPane);// chama a função, para mostrar o mapa a cada movimento feito. 
    }
    
    //Mapa Nível - 2.
    public static void mapa2(String dados[][]){
        //laço que preenche o labirinto primeiro com XXX.
        for(int i = 0; i<22; i++){
            for(int j = 0; j<22;j++){
                dados[i][j]="XXX";
            }
        }
        //agora preenche o caminho que poderá ser percorrido, o restante será a "parede" do labirinto.
        dados[3][17]=" O";  dados[3][9]="";     dados[3][10]="";    dados[3][11]="";    dados[3][14]="";    dados[3][15]="";
        dados[3][16]="";    dados[4][3]="";     dados[4][4]="";     dados[4][5]="";     dados[4][6]="";     dados[4][7]="";
        dados[4][9]="";     dados[4][11]="";    dados[4][14]="";    dados[4][17]="";    dados[5][3]="";     dados[5][7]="";    
        dados[5][9]="";     dados[5][11]="";    dados[5][12]="";    dados[5][13]="";    dados[5][14]="";    dados[5][17]="";
        dados[6][3]="";     dados[6][7]="";     dados[6][9]="";     dados[6][17]="";    dados[7][3]="";     dados[7][6]="";
        dados[7][7]="";     dados[7][8]="";     dados[7][9]="";     dados[7][11]="";    dados[7][12]="";    dados[7][13]="";
        dados[7][14]="";    dados[7][15]="";    dados[7][16]="";    dados[7][17]="";    dados[8][3]="";     dados[8][6]="";
        dados[8][8]="";     dados[8][11]="";    dados[9][3]=" ";/*Armadilha*/dados[9][6]="";     dados[9][8]="";    dados[9][9]="";
        dados[9][10]="";    dados[9][11]="";    dados[9][12]="";    dados[9][13]="";    dados[9][14]="";    dados[9][15]="";
        dados[10][3]="";    dados[10][4]="";    dados[10][5]="";    dados[10][6]="";    dados[10][16]="";   dados[11][3]="";
        dados[11][7]="";    dados[11][8]="";    dados[11][9]="";    dados[11][10]="";   dados[11][11]="";   dados[11][12]="";
        dados[11][13]="";   dados[11][14]="";   dados[11][15]="";   dados[11][16]="";   dados[12][3]="";    dados[12][4]="";    
        dados[12][5]="";    dados[12][6]="";    dados[12][7]="";    dados[12][16]="";   dados[13][5]="";    dados[13][7]=" ";/*Armadilha*/
        dados[13][9]="";    dados[13][10]="";   dados[13][11]="";   dados[13][13]="";   dados[13][14]="";   dados[13][15]="";
        dados[13][16]="";   dados[14][5]="";    dados[14][7]="";    dados[14][9]="";    dados[14][11]="";   dados[14][13]="";
        dados[14][16]="";   dados[15][5]="";    dados[15][7]="";    dados[15][11]="";   dados[15][12]="";   dados[15][13]="";
        dados[15][16]="";   dados[16][5]="";     dados[16][7]="";    dados[16][16]="";    dados[17][5]="";    dados[17][6]="";
        dados[17][7]="";    dados[17][8]=" ";/*Armadilha*/     dados[17][9]="";     dados[17][10]="";     dados[17][12]="";     dados[12][13]="";
        dados[17][14]="";     dados[17][15]="";    dados[17][16]="";    dados[17][11]="FIM";
        mostrarmapa(scroolPane);// chama a função, para mostrar o mapa a cada movimento feito. 
    }
    /*
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
        /*
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
*/
}
