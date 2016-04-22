/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_labirinto;
import javax.swing.JOptionPane;
/**
 *
 * @author cleversonahum
 */
public class Labirinto_frame extends javax.swing.JFrame {
    //Inicializando Labirinto
    int teste_labirinto[][] =  
        {
            { 0, 0, 0, 0, 1, 3, 1, 0, 0, 0},
            { 0, 0, 1, 1, 1, 0, 1, 1, 1, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            { 0, 0, 0, 1, 1, 1, 1, 1, 0, 1},
            { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
            { 0, 0, 0, 1, 1, 0, 0, 1, 0, 1},
            { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1},
            { 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 1, 1, 1, 1, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 2, 0, 0, 0, 0}
        };
    void demarcarLabirinto (){ //Funçao que atualiza o labirinto
        //Inicializando Labirinto com as respectivas posiçoes
            //Linha A
            labirinto1.defineCelula(a1, 0, 0);
            labirinto1.defineCelula(a2, 0, 1);
            labirinto1.defineCelula(a3, 0, 2);
            labirinto1.defineCelula(a4, 0, 3);
            labirinto1.defineCelula(a5, 0, 4);
            labirinto1.defineCelula(a6, 0, 5);
            labirinto1.defineCelula(a7, 0, 6);
            labirinto1.defineCelula(a8, 0, 7);
            labirinto1.defineCelula(a9, 0, 8);
            labirinto1.defineCelula(a10, 0, 9);
            
            //Linha B
            labirinto1.defineCelula(b1, 1, 0);
            labirinto1.defineCelula(b2, 1, 1);
            labirinto1.defineCelula(b3, 1, 2);
            labirinto1.defineCelula(b4, 1, 3);
            labirinto1.defineCelula(b5, 1, 4);
            labirinto1.defineCelula(b6, 1, 5);
            labirinto1.defineCelula(b7, 1, 6);
            labirinto1.defineCelula(b8, 1, 7);
            labirinto1.defineCelula(b9, 1, 8);
            labirinto1.defineCelula(b10, 1, 9);
            
            //Linha C
            labirinto1.defineCelula(c1, 2, 0);
            labirinto1.defineCelula(c2, 2, 1);
            labirinto1.defineCelula(c3, 2, 2);
            labirinto1.defineCelula(c4, 2, 3);
            labirinto1.defineCelula(c5, 2, 4);
            labirinto1.defineCelula(c6, 2, 5);
            labirinto1.defineCelula(c7, 2, 6);
            labirinto1.defineCelula(c8, 2, 7);
            labirinto1.defineCelula(c9, 2, 8);
            labirinto1.defineCelula(c10, 2, 9);
            
            //Linha D
            labirinto1.defineCelula(d1, 3, 0);
            labirinto1.defineCelula(d2, 3, 1);
            labirinto1.defineCelula(d3, 3, 2);
            labirinto1.defineCelula(d4, 3, 3);
            labirinto1.defineCelula(d5, 3, 4);
            labirinto1.defineCelula(d6, 3, 5);
            labirinto1.defineCelula(d7, 3, 6);
            labirinto1.defineCelula(d8, 3, 7);
            labirinto1.defineCelula(d9, 3, 8);
            labirinto1.defineCelula(d10, 3, 9);
            
            //Linha E
            labirinto1.defineCelula(e1, 4, 0);
            labirinto1.defineCelula(e2, 4, 1);
            labirinto1.defineCelula(e3, 4, 2);
            labirinto1.defineCelula(e4, 4, 3);
            labirinto1.defineCelula(e5, 4, 4);
            labirinto1.defineCelula(e6, 4, 5);
            labirinto1.defineCelula(e7, 4, 6);
            labirinto1.defineCelula(e8, 4, 7);
            labirinto1.defineCelula(e9, 4, 8);
            labirinto1.defineCelula(e10, 4, 9);
            
            //Linha F
            labirinto1.defineCelula(f1, 5, 0);
            labirinto1.defineCelula(f2, 5, 1);
            labirinto1.defineCelula(f3, 5, 2);
            labirinto1.defineCelula(f4, 5, 3);
            labirinto1.defineCelula(f5, 5, 4);
            labirinto1.defineCelula(f6, 5, 5);
            labirinto1.defineCelula(f7, 5, 6);
            labirinto1.defineCelula(f8, 5, 7);
            labirinto1.defineCelula(f9, 5, 8);
            labirinto1.defineCelula(f10, 5, 9);
            
            //Linha G
            labirinto1.defineCelula(g1, 6, 0);
            labirinto1.defineCelula(g2, 6, 1);
            labirinto1.defineCelula(g3, 6, 2);
            labirinto1.defineCelula(g4, 6, 3);
            labirinto1.defineCelula(g5, 6, 4);
            labirinto1.defineCelula(g6, 6, 5);
            labirinto1.defineCelula(g7, 6, 6);
            labirinto1.defineCelula(g8, 6, 7);
            labirinto1.defineCelula(g9, 6, 8);
            labirinto1.defineCelula(g10, 6, 9);
            
            //Linha H
            labirinto1.defineCelula(h1, 7, 0);
            labirinto1.defineCelula(h2, 7, 1);
            labirinto1.defineCelula(h3, 7, 2);
            labirinto1.defineCelula(h4, 7, 3);
            labirinto1.defineCelula(h5, 7, 4);
            labirinto1.defineCelula(h6, 7, 5);
            labirinto1.defineCelula(h7, 7, 6);
            labirinto1.defineCelula(h8, 7, 7);
            labirinto1.defineCelula(h9, 7, 8);
            labirinto1.defineCelula(h10, 7, 9);
            
            //Linha I
            labirinto1.defineCelula(i1, 8, 0);
            labirinto1.defineCelula(i2, 8, 1);
            labirinto1.defineCelula(i3, 8, 2);
            labirinto1.defineCelula(i4, 8, 3);
            labirinto1.defineCelula(i5, 8, 4);
            labirinto1.defineCelula(i6, 8, 5);
            labirinto1.defineCelula(i7, 8, 6);
            labirinto1.defineCelula(i8, 8, 7);
            labirinto1.defineCelula(i9, 8, 8);
            labirinto1.defineCelula(i10, 8, 9);
            
            //Linha J
            labirinto1.defineCelula(j1, 9, 0);
            labirinto1.defineCelula(j2, 9, 1);
            labirinto1.defineCelula(j3, 9, 2);
            labirinto1.defineCelula(j4, 9, 3);
            labirinto1.defineCelula(j5, 9, 4);
            labirinto1.defineCelula(j6, 9, 5);
            labirinto1.defineCelula(j7, 9, 6);
            labirinto1.defineCelula(j8, 9, 7);
            labirinto1.defineCelula(j9, 9, 8);
            labirinto1.defineCelula(j10, 9, 9);
    }
    //Inicializando Instancia do Labirinto
    Labirinto labirinto1 = new Labirinto();
    /**
     * Creates new form Labirinto_frame
     */
    public Labirinto_frame() {
        initComponents();
        
        labirinto1.inicializar_labirinto(teste_labirinto);
        labirinto1.pos();
        labirinto1.mostra_labirinto();
        
        this.demarcarLabirinto();
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        a10 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        b10 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        c10 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        d8 = new javax.swing.JLabel();
        d9 = new javax.swing.JLabel();
        d10 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        e7 = new javax.swing.JLabel();
        e8 = new javax.swing.JLabel();
        e9 = new javax.swing.JLabel();
        e10 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        f5 = new javax.swing.JLabel();
        f6 = new javax.swing.JLabel();
        f7 = new javax.swing.JLabel();
        f8 = new javax.swing.JLabel();
        f9 = new javax.swing.JLabel();
        f10 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        g5 = new javax.swing.JLabel();
        g6 = new javax.swing.JLabel();
        g7 = new javax.swing.JLabel();
        g8 = new javax.swing.JLabel();
        g9 = new javax.swing.JLabel();
        g10 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        h5 = new javax.swing.JLabel();
        h6 = new javax.swing.JLabel();
        h7 = new javax.swing.JLabel();
        h8 = new javax.swing.JLabel();
        h9 = new javax.swing.JLabel();
        h10 = new javax.swing.JLabel();
        i1 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        i4 = new javax.swing.JLabel();
        i5 = new javax.swing.JLabel();
        i6 = new javax.swing.JLabel();
        i7 = new javax.swing.JLabel();
        i8 = new javax.swing.JLabel();
        i9 = new javax.swing.JLabel();
        i10 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        j6 = new javax.swing.JLabel();
        j7 = new javax.swing.JLabel();
        j8 = new javax.swing.JLabel();
        j9 = new javax.swing.JLabel();
        j10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a1.setToolTipText("");

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a2.setToolTipText("");

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a3.setToolTipText("");

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a4.setToolTipText("");

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a5.setToolTipText("");

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a6.setToolTipText("");

        a7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a7.setToolTipText("");

        a8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a8.setToolTipText("");

        a9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a9.setToolTipText("");

        a10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a10.setToolTipText("");

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b1.setToolTipText("");

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b2.setToolTipText("");

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b3.setToolTipText("");

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b4.setToolTipText("");

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b5.setToolTipText("");

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b6.setToolTipText("");

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b7.setToolTipText("");

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b8.setToolTipText("");

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b9.setToolTipText("");

        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b10.setToolTipText("");

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c1.setToolTipText("");

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c2.setToolTipText("");

        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c3.setToolTipText("");

        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c4.setToolTipText("");

        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c5.setToolTipText("");

        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c6.setToolTipText("");

        c7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c7.setToolTipText("");

        c8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c8.setToolTipText("");

        c9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c9.setToolTipText("");

        c10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c10.setToolTipText("");

        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d1.setToolTipText("");

        d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d2.setToolTipText("");

        d3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d3.setToolTipText("");

        d4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d4.setToolTipText("");

        d5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d5.setToolTipText("");

        d6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d6.setToolTipText("");

        d7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d7.setToolTipText("");

        d8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d8.setToolTipText("");

        d9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d9.setToolTipText("");

        d10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d10.setToolTipText("");

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e1.setToolTipText("");

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e2.setToolTipText("");

        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e3.setToolTipText("");

        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e4.setToolTipText("");

        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e5.setToolTipText("");

        e6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e6.setToolTipText("");

        e7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e7.setToolTipText("");

        e8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e8.setToolTipText("");

        e9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e9.setToolTipText("");

        e10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e10.setToolTipText("");

        f1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f1.setToolTipText("");

        f2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f2.setToolTipText("");

        f3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f3.setToolTipText("");

        f4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f4.setToolTipText("");

        f5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f5.setToolTipText("");

        f6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f6.setToolTipText("");

        f7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f7.setToolTipText("");

        f8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f8.setToolTipText("");

        f9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f9.setToolTipText("");

        f10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f10.setToolTipText("");

        g1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g1.setToolTipText("");

        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g2.setToolTipText("");

        g3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g3.setToolTipText("");

        g4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g4.setToolTipText("");

        g5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g5.setToolTipText("");

        g6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g6.setToolTipText("");

        g7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g7.setToolTipText("");

        g8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g8.setToolTipText("");

        g9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g9.setToolTipText("");

        g10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g10.setToolTipText("");

        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h1.setToolTipText("");

        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h2.setToolTipText("");

        h3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h3.setToolTipText("");

        h4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h4.setToolTipText("");

        h5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h5.setToolTipText("");

        h6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h6.setToolTipText("");

        h7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h7.setToolTipText("");

        h8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h8.setToolTipText("");

        h9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h9.setToolTipText("");

        h10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h10.setToolTipText("");

        i1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i1.setToolTipText("");

        i2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i2.setToolTipText("");

        i3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i3.setToolTipText("");

        i4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i4.setToolTipText("");

        i5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i5.setToolTipText("");

        i6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i6.setToolTipText("");

        i7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i7.setToolTipText("");

        i8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i8.setToolTipText("");

        i9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i9.setToolTipText("");

        i10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i10.setToolTipText("");

        j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j1.setToolTipText("");

        j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j2.setToolTipText("");

        j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j3.setToolTipText("");

        j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j4.setToolTipText("");

        j5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j5.setToolTipText("");

        j6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j6.setToolTipText("");

        j7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j7.setToolTipText("");

        j8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j8.setToolTipText("");

        j9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j9.setToolTipText("");

        j10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j10.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c1)
                            .addComponent(d1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(d8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(e1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(e4))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(g1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(g2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(f1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(f2)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(f3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(f4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(h3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(h4))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(g3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(g4)))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(h1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h2)
                                .addGap(96, 96, 96)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(e5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(g5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(g6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(f5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(f7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(g7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(g8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(g9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(g10))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(h5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(h9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(j1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(j5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(i1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(i6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(j6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(i9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(j9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j10)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a5)
                            .addComponent(a6)
                            .addComponent(a7)
                            .addComponent(a8)
                            .addComponent(a9)
                            .addComponent(a10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b10, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(a4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(a2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(a1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c1)
                            .addComponent(c2)
                            .addComponent(c3)
                            .addComponent(c4)
                            .addComponent(c5)
                            .addComponent(c6)
                            .addComponent(c7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d6)
                            .addComponent(d5)
                            .addComponent(d3)
                            .addComponent(d2)
                            .addComponent(d1)
                            .addComponent(d4)
                            .addComponent(d7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c8)
                            .addComponent(c9)
                            .addComponent(c10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d10)
                            .addComponent(d9)
                            .addComponent(d8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(e1)
                    .addComponent(e2)
                    .addComponent(e3)
                    .addComponent(e4)
                    .addComponent(e5)
                    .addComponent(e6)
                    .addComponent(e7)
                    .addComponent(e8)
                    .addComponent(e9)
                    .addComponent(e10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f1)
                    .addComponent(f2)
                    .addComponent(f4)
                    .addComponent(f3)
                    .addComponent(f5)
                    .addComponent(f6)
                    .addComponent(f7)
                    .addComponent(f8)
                    .addComponent(f9)
                    .addComponent(f10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(g2)
                        .addComponent(g1)
                        .addComponent(g3)
                        .addComponent(g4))
                    .addComponent(g6)
                    .addComponent(g5)
                    .addComponent(g7)
                    .addComponent(g8)
                    .addComponent(g9)
                    .addComponent(g10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h1)
                    .addComponent(h2)
                    .addComponent(h4)
                    .addComponent(h3)
                    .addComponent(h5)
                    .addComponent(h6)
                    .addComponent(h7)
                    .addComponent(h8)
                    .addComponent(h10)
                    .addComponent(h9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(i1)
                    .addComponent(i2)
                    .addComponent(i3)
                    .addComponent(i4)
                    .addComponent(i5)
                    .addComponent(i6)
                    .addComponent(i7)
                    .addComponent(i8)
                    .addComponent(i9)
                    .addComponent(i10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j1)
                    .addComponent(j2)
                    .addComponent(j3)
                    .addComponent(j5)
                    .addComponent(j4)
                    .addComponent(j6)
                    .addComponent(j8)
                    .addComponent(j7)
                    .addComponent(j9)
                    .addComponent(j10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        //Aqui e a parte da movimentaçao
        
        char caractere = evt.getKeyChar();
        System.out.println("Usuario Digitando a letra : "+caractere);
        switch(caractere) {
            case 'i':
                labirinto1.mover(1);
                this.demarcarLabirinto();
                break;
            case 'k':
                labirinto1.mover(2);
                this.demarcarLabirinto();
                break;
            case 'l':
                labirinto1.mover(3);
                this.demarcarLabirinto();
                break;
            case 'j':
                labirinto1.mover(4);
                this.demarcarLabirinto();
                break;
        }
        
        if(labirinto1.levelup==true) { //Usuario venceu
            System.out.println("Reconheceu");
            JOptionPane.showMessageDialog(null, "Voce conseguiu sair :) ");
        }
    }//GEN-LAST:event_formKeyTyped

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        
        //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png")));
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Labirinto_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Labirinto_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Labirinto_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Labirinto_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the <default>form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Labirinto_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel a1;
    public javax.swing.JLabel a10;
    public javax.swing.JLabel a2;
    public javax.swing.JLabel a3;
    public javax.swing.JLabel a4;
    public javax.swing.JLabel a5;
    public javax.swing.JLabel a6;
    public javax.swing.JLabel a7;
    public javax.swing.JLabel a8;
    public javax.swing.JLabel a9;
    public javax.swing.JLabel b1;
    public javax.swing.JLabel b10;
    public javax.swing.JLabel b2;
    public javax.swing.JLabel b3;
    public javax.swing.JLabel b4;
    public javax.swing.JLabel b5;
    public javax.swing.JLabel b6;
    public javax.swing.JLabel b7;
    public javax.swing.JLabel b8;
    public javax.swing.JLabel b9;
    public javax.swing.JLabel c1;
    public javax.swing.JLabel c10;
    public javax.swing.JLabel c2;
    public javax.swing.JLabel c3;
    public javax.swing.JLabel c4;
    public javax.swing.JLabel c5;
    public javax.swing.JLabel c6;
    public javax.swing.JLabel c7;
    public javax.swing.JLabel c8;
    public javax.swing.JLabel c9;
    public javax.swing.JLabel d1;
    public javax.swing.JLabel d10;
    public javax.swing.JLabel d2;
    public javax.swing.JLabel d3;
    public javax.swing.JLabel d4;
    public javax.swing.JLabel d5;
    public javax.swing.JLabel d6;
    public javax.swing.JLabel d7;
    public javax.swing.JLabel d8;
    public javax.swing.JLabel d9;
    public javax.swing.JLabel e1;
    public javax.swing.JLabel e10;
    public javax.swing.JLabel e2;
    public javax.swing.JLabel e3;
    public javax.swing.JLabel e4;
    public javax.swing.JLabel e5;
    public javax.swing.JLabel e6;
    public javax.swing.JLabel e7;
    public javax.swing.JLabel e8;
    public javax.swing.JLabel e9;
    public javax.swing.JLabel f1;
    public javax.swing.JLabel f10;
    public javax.swing.JLabel f2;
    public javax.swing.JLabel f3;
    public javax.swing.JLabel f4;
    public javax.swing.JLabel f5;
    public javax.swing.JLabel f6;
    public javax.swing.JLabel f7;
    public javax.swing.JLabel f8;
    public javax.swing.JLabel f9;
    public javax.swing.JLabel g1;
    public javax.swing.JLabel g10;
    public javax.swing.JLabel g2;
    public javax.swing.JLabel g3;
    public javax.swing.JLabel g4;
    public javax.swing.JLabel g5;
    public javax.swing.JLabel g6;
    public javax.swing.JLabel g7;
    public javax.swing.JLabel g8;
    public javax.swing.JLabel g9;
    public javax.swing.JLabel h1;
    public javax.swing.JLabel h10;
    public javax.swing.JLabel h2;
    public javax.swing.JLabel h3;
    public javax.swing.JLabel h4;
    public javax.swing.JLabel h5;
    public javax.swing.JLabel h6;
    public javax.swing.JLabel h7;
    public javax.swing.JLabel h8;
    public javax.swing.JLabel h9;
    public javax.swing.JLabel i1;
    public javax.swing.JLabel i10;
    public javax.swing.JLabel i2;
    public javax.swing.JLabel i3;
    public javax.swing.JLabel i4;
    public javax.swing.JLabel i5;
    public javax.swing.JLabel i6;
    public javax.swing.JLabel i7;
    public javax.swing.JLabel i8;
    public javax.swing.JLabel i9;
    public javax.swing.JLabel j1;
    public javax.swing.JLabel j10;
    public javax.swing.JLabel j2;
    public javax.swing.JLabel j3;
    public javax.swing.JLabel j4;
    public javax.swing.JLabel j5;
    public javax.swing.JLabel j6;
    public javax.swing.JLabel j7;
    public javax.swing.JLabel j8;
    public javax.swing.JLabel j9;
    // End of variables declaration//GEN-END:variables
}
