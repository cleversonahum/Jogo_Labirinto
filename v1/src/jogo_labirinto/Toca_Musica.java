package jogo_labirinto;

import java.io.BufferedInputStream;
import java.io.File;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author anton
 */
public class Toca_Musica {

    public static void main(String[] args) {


        
    }

    public static class MP3Musica extends Thread {

        // OBJETO PARA O ARQUIVO MP3 A SER TOCADO
        private File mp3;

        // OBJETO PLAYER DA BIBLIOTECA JLAYER QUE TOCA O ARQUIVO MP3
        private Player player;

        /*
		 * CONSTRUTOR RECEBE O OBJETO FILE REFERECIANDO O ARQUIVO MP3 A SER
		 * TOCADO E ATRIBUI AO ATRIBUTO DA CLASS
         */
        public void tocar(File mp3) {
            this.mp3 = mp3;
        }
        public void Parar(File mp3){
            this.mp3=mp3;
        }
        public void Pausar(){
            if(player != null){            
            player.close();
            System.out.println("Voce arou a musica.");

        }
        }

        //METODO RUN QUE TOCA O MP3
        public void run() {
            try {
                FileInputStream fis = new FileInputStream(mp3);
                BufferedInputStream bis = new BufferedInputStream(fis);

                this.player = new Player(bis);
                System.out.println("Tocando Musica!");

                this.player.play();
                System.out.println("Terminado Musica!");
                
                this.player.close();
                System.out.println("Musica Foi Parada!");

            } catch (Exception e) {
                System.out.println("Problema ao tocar Musica" + mp3);
                e.printStackTrace();
            }
        }

    }
}
