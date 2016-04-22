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
            { 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 0, 0, 0, 0, 0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
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
            labirinto1.defineCelula(a11, 0, 10);
            labirinto1.defineCelula(a12, 0, 11);
            labirinto1.defineCelula(a13, 0, 12);
            labirinto1.defineCelula(a14, 0, 13);
            labirinto1.defineCelula(a15, 0, 14);
            labirinto1.defineCelula(a16, 0, 15);
            labirinto1.defineCelula(a17, 0, 16);
            labirinto1.defineCelula(a18, 0, 17);
            labirinto1.defineCelula(a19, 0, 18);
            labirinto1.defineCelula(a20, 0, 19);
            
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
            labirinto1.defineCelula(b11, 1, 10);
            labirinto1.defineCelula(b12, 1, 11);
            labirinto1.defineCelula(b13, 1, 12);
            labirinto1.defineCelula(b14, 1, 13);
            labirinto1.defineCelula(b15, 1, 14);
            labirinto1.defineCelula(b16, 1, 15);
            labirinto1.defineCelula(b17, 1, 16);
            labirinto1.defineCelula(b18, 1, 17);
            labirinto1.defineCelula(b19, 1, 18);
            labirinto1.defineCelula(b20, 1, 19);
            
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
            labirinto1.defineCelula(c11, 2, 10);
            labirinto1.defineCelula(c12, 2, 11);
            labirinto1.defineCelula(c13, 2, 12);
            labirinto1.defineCelula(c14, 2, 13);
            labirinto1.defineCelula(c15, 2, 14);
            labirinto1.defineCelula(c16, 2, 15);
            labirinto1.defineCelula(c17, 2, 16);
            labirinto1.defineCelula(c18, 2, 17);
            labirinto1.defineCelula(c19, 2, 18);
            labirinto1.defineCelula(c20, 2, 19);
            
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
            labirinto1.defineCelula(d11, 3, 10);
            labirinto1.defineCelula(d12, 3, 11);
            labirinto1.defineCelula(d13, 3, 12);
            labirinto1.defineCelula(d14, 3, 13);
            labirinto1.defineCelula(d15, 3, 14);
            labirinto1.defineCelula(d16, 3, 15);
            labirinto1.defineCelula(d17, 3, 16);
            labirinto1.defineCelula(d18, 3, 17);
            labirinto1.defineCelula(d19, 3, 18);
            labirinto1.defineCelula(d20, 3, 19);
            
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
            labirinto1.defineCelula(e11, 4, 10);
            labirinto1.defineCelula(e12, 4, 11);
            labirinto1.defineCelula(e13, 4, 12);
            labirinto1.defineCelula(e14, 4, 13);
            labirinto1.defineCelula(e15, 4, 14);
            labirinto1.defineCelula(e16, 4, 15);
            labirinto1.defineCelula(e17, 4, 16);
            labirinto1.defineCelula(e18, 4, 17);
            labirinto1.defineCelula(e19, 4, 18);
            labirinto1.defineCelula(e20, 4, 19);
            
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
            labirinto1.defineCelula(f11, 5, 10);
            labirinto1.defineCelula(f12, 5, 11);
            labirinto1.defineCelula(f13, 5, 12);
            labirinto1.defineCelula(f14, 5, 13);
            labirinto1.defineCelula(f15, 5, 14);
            labirinto1.defineCelula(f16, 5, 15);
            labirinto1.defineCelula(f17, 5, 16);
            labirinto1.defineCelula(f18, 5, 17);
            labirinto1.defineCelula(f19, 5, 18);
            labirinto1.defineCelula(f20, 5, 19);
            
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
            labirinto1.defineCelula(g11, 6, 10);
            labirinto1.defineCelula(g12, 6, 11);
            labirinto1.defineCelula(g13, 6, 12);
            labirinto1.defineCelula(g14, 6, 13);
            labirinto1.defineCelula(g15, 6, 14);
            labirinto1.defineCelula(g16, 6, 15);
            labirinto1.defineCelula(g17, 6, 16);
            labirinto1.defineCelula(g18, 6, 17);
            labirinto1.defineCelula(g19, 6, 18);
            labirinto1.defineCelula(g20, 6, 19);
            
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
            labirinto1.defineCelula(h11, 7, 10);
            labirinto1.defineCelula(h12, 7, 11);
            labirinto1.defineCelula(h13, 7, 12);
            labirinto1.defineCelula(h14, 7, 13);
            labirinto1.defineCelula(h15, 7, 14);
            labirinto1.defineCelula(h16, 7, 15);
            labirinto1.defineCelula(h17, 7, 16);
            labirinto1.defineCelula(h18, 7, 17);
            labirinto1.defineCelula(h19, 7, 18);
            labirinto1.defineCelula(h20, 7, 19);
            
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
            labirinto1.defineCelula(i11, 8, 10);
            labirinto1.defineCelula(i12, 8, 11);
            labirinto1.defineCelula(i13, 8, 12);
            labirinto1.defineCelula(i14, 8, 13);
            labirinto1.defineCelula(i15, 8, 14);
            labirinto1.defineCelula(i16, 8, 15);
            labirinto1.defineCelula(i17, 8, 16);
            labirinto1.defineCelula(i18, 8, 17);
            labirinto1.defineCelula(i19, 8, 18);
            labirinto1.defineCelula(i20, 8, 19);
            
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
            labirinto1.defineCelula(j11, 9, 10);
            labirinto1.defineCelula(j12, 9, 11);
            labirinto1.defineCelula(j13, 9, 12);
            labirinto1.defineCelula(j14, 9, 13);
            labirinto1.defineCelula(j15, 9, 14);
            labirinto1.defineCelula(j16, 9, 15);
            labirinto1.defineCelula(j17, 9, 16);
            labirinto1.defineCelula(j18, 9, 17);
            labirinto1.defineCelula(j19, 9, 18);
            labirinto1.defineCelula(j20, 9, 19);
            
            //Linha k
            labirinto1.defineCelula(k1, 10, 0);
            labirinto1.defineCelula(k2, 10, 1);
            labirinto1.defineCelula(k3, 10, 2);
            labirinto1.defineCelula(k4, 10, 3);
            labirinto1.defineCelula(k5, 10, 4);
            labirinto1.defineCelula(k6, 10, 5);
            labirinto1.defineCelula(k7, 10, 6);
            labirinto1.defineCelula(k8, 10, 7);
            labirinto1.defineCelula(k9, 10, 8);
            labirinto1.defineCelula(k10, 10, 9);
            labirinto1.defineCelula(k11, 10, 10);
            labirinto1.defineCelula(k12, 10, 11);
            labirinto1.defineCelula(k13, 10, 12);
            labirinto1.defineCelula(k14, 10, 13);
            labirinto1.defineCelula(k15, 10, 14);
            labirinto1.defineCelula(k16, 10, 15);
            labirinto1.defineCelula(k17, 10, 16);
            labirinto1.defineCelula(k18, 10, 17);
            labirinto1.defineCelula(k19, 10, 18);
            labirinto1.defineCelula(k20, 10, 19);
            
            //Linha L
            labirinto1.defineCelula(l1, 11, 0);
            labirinto1.defineCelula(l2, 11, 1);
            labirinto1.defineCelula(l3, 11, 2);
            labirinto1.defineCelula(l4, 11, 3);
            labirinto1.defineCelula(l5, 11, 4);
            labirinto1.defineCelula(l6, 11, 5);
            labirinto1.defineCelula(l7, 11, 6);
            labirinto1.defineCelula(l8, 11, 7);
            labirinto1.defineCelula(l9, 11, 8);
            labirinto1.defineCelula(l10, 11, 9);
            labirinto1.defineCelula(l11, 11, 10);
            labirinto1.defineCelula(l12, 11, 11);
            labirinto1.defineCelula(l13, 11, 12);
            labirinto1.defineCelula(l14, 11, 13);
            labirinto1.defineCelula(l15, 11, 14);
            labirinto1.defineCelula(l16, 11, 15);
            labirinto1.defineCelula(l17, 11, 16);
            labirinto1.defineCelula(l18, 11, 17);
            labirinto1.defineCelula(l19, 11, 18);
            labirinto1.defineCelula(l20, 11, 19);
            
            //Linha M
            labirinto1.defineCelula(m1, 12, 0);
            labirinto1.defineCelula(m2, 12, 1);
            labirinto1.defineCelula(m3, 12, 2);
            labirinto1.defineCelula(m4, 12, 3);
            labirinto1.defineCelula(m5, 12, 4);
            labirinto1.defineCelula(m6, 12, 5);
            labirinto1.defineCelula(m7, 12, 6);
            labirinto1.defineCelula(m8, 12, 7);
            labirinto1.defineCelula(m9, 12, 8);
            labirinto1.defineCelula(m10, 12, 9);
            labirinto1.defineCelula(m11, 12, 10);
            labirinto1.defineCelula(m12, 12, 11);
            labirinto1.defineCelula(m13, 12, 12);
            labirinto1.defineCelula(m14, 12, 13);
            labirinto1.defineCelula(m15, 12, 14);
            labirinto1.defineCelula(m16, 12, 15);
            labirinto1.defineCelula(m17, 12, 16);
            labirinto1.defineCelula(m18, 12, 17);
            labirinto1.defineCelula(m19, 12, 18);
            labirinto1.defineCelula(m20, 12, 19);
            
            //Linha N
            labirinto1.defineCelula(n1, 13, 0);
            labirinto1.defineCelula(n2, 13, 1);
            labirinto1.defineCelula(n3, 13, 2);
            labirinto1.defineCelula(n4, 13, 3);
            labirinto1.defineCelula(n5, 13, 4);
            labirinto1.defineCelula(n6, 13, 5);
            labirinto1.defineCelula(n7, 13, 6);
            labirinto1.defineCelula(n8, 13, 7);
            labirinto1.defineCelula(n9, 13, 8);
            labirinto1.defineCelula(n10, 13, 9);
            labirinto1.defineCelula(n11, 13, 10);
            labirinto1.defineCelula(n12, 13, 11);
            labirinto1.defineCelula(n13, 13, 12);
            labirinto1.defineCelula(n14, 13, 13);
            labirinto1.defineCelula(n15, 13, 14);
            labirinto1.defineCelula(n16, 13, 15);
            labirinto1.defineCelula(n17, 13, 16);
            labirinto1.defineCelula(n18, 13, 17);
            labirinto1.defineCelula(n19, 13, 18);
            labirinto1.defineCelula(n20, 13, 19);
            
            //Linha O
            labirinto1.defineCelula(o1, 14, 0);
            labirinto1.defineCelula(o2, 14, 1);
            labirinto1.defineCelula(o3, 14, 2);
            labirinto1.defineCelula(o4, 14, 3);
            labirinto1.defineCelula(o5, 14, 4);
            labirinto1.defineCelula(o6, 14, 5);
            labirinto1.defineCelula(o7, 14, 6);
            labirinto1.defineCelula(o8, 14, 7);
            labirinto1.defineCelula(o9, 14, 8);
            labirinto1.defineCelula(o10, 14, 9);
            labirinto1.defineCelula(o11, 14, 10);
            labirinto1.defineCelula(o12, 14, 11);
            labirinto1.defineCelula(o13, 14, 12);
            labirinto1.defineCelula(o14, 14, 13);
            labirinto1.defineCelula(o15, 14, 14);
            labirinto1.defineCelula(o16, 14, 15);
            labirinto1.defineCelula(o17, 14, 16);
            labirinto1.defineCelula(o18, 14, 17);
            labirinto1.defineCelula(o19, 14, 18);
            labirinto1.defineCelula(o20, 14, 19);
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
        a11 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        a13 = new javax.swing.JLabel();
        a14 = new javax.swing.JLabel();
        a15 = new javax.swing.JLabel();
        a16 = new javax.swing.JLabel();
        a17 = new javax.swing.JLabel();
        a18 = new javax.swing.JLabel();
        a19 = new javax.swing.JLabel();
        a20 = new javax.swing.JLabel();
        b11 = new javax.swing.JLabel();
        b12 = new javax.swing.JLabel();
        b13 = new javax.swing.JLabel();
        b14 = new javax.swing.JLabel();
        b15 = new javax.swing.JLabel();
        b16 = new javax.swing.JLabel();
        b17 = new javax.swing.JLabel();
        b18 = new javax.swing.JLabel();
        b19 = new javax.swing.JLabel();
        b20 = new javax.swing.JLabel();
        c11 = new javax.swing.JLabel();
        c12 = new javax.swing.JLabel();
        c13 = new javax.swing.JLabel();
        c14 = new javax.swing.JLabel();
        c15 = new javax.swing.JLabel();
        c16 = new javax.swing.JLabel();
        c17 = new javax.swing.JLabel();
        c18 = new javax.swing.JLabel();
        c19 = new javax.swing.JLabel();
        c20 = new javax.swing.JLabel();
        d11 = new javax.swing.JLabel();
        d12 = new javax.swing.JLabel();
        d13 = new javax.swing.JLabel();
        d14 = new javax.swing.JLabel();
        d15 = new javax.swing.JLabel();
        d16 = new javax.swing.JLabel();
        d17 = new javax.swing.JLabel();
        d18 = new javax.swing.JLabel();
        d19 = new javax.swing.JLabel();
        d20 = new javax.swing.JLabel();
        e11 = new javax.swing.JLabel();
        e12 = new javax.swing.JLabel();
        e13 = new javax.swing.JLabel();
        e14 = new javax.swing.JLabel();
        e15 = new javax.swing.JLabel();
        e16 = new javax.swing.JLabel();
        e17 = new javax.swing.JLabel();
        e18 = new javax.swing.JLabel();
        e19 = new javax.swing.JLabel();
        e20 = new javax.swing.JLabel();
        f11 = new javax.swing.JLabel();
        f12 = new javax.swing.JLabel();
        f13 = new javax.swing.JLabel();
        f14 = new javax.swing.JLabel();
        f15 = new javax.swing.JLabel();
        f16 = new javax.swing.JLabel();
        f17 = new javax.swing.JLabel();
        f18 = new javax.swing.JLabel();
        f19 = new javax.swing.JLabel();
        f20 = new javax.swing.JLabel();
        g11 = new javax.swing.JLabel();
        g12 = new javax.swing.JLabel();
        g13 = new javax.swing.JLabel();
        g14 = new javax.swing.JLabel();
        g15 = new javax.swing.JLabel();
        g16 = new javax.swing.JLabel();
        g17 = new javax.swing.JLabel();
        g18 = new javax.swing.JLabel();
        g19 = new javax.swing.JLabel();
        g20 = new javax.swing.JLabel();
        h11 = new javax.swing.JLabel();
        h12 = new javax.swing.JLabel();
        h13 = new javax.swing.JLabel();
        h14 = new javax.swing.JLabel();
        h15 = new javax.swing.JLabel();
        h16 = new javax.swing.JLabel();
        h17 = new javax.swing.JLabel();
        h18 = new javax.swing.JLabel();
        h19 = new javax.swing.JLabel();
        h20 = new javax.swing.JLabel();
        i11 = new javax.swing.JLabel();
        i12 = new javax.swing.JLabel();
        i13 = new javax.swing.JLabel();
        i14 = new javax.swing.JLabel();
        i15 = new javax.swing.JLabel();
        i16 = new javax.swing.JLabel();
        i17 = new javax.swing.JLabel();
        i18 = new javax.swing.JLabel();
        i19 = new javax.swing.JLabel();
        i20 = new javax.swing.JLabel();
        j11 = new javax.swing.JLabel();
        j12 = new javax.swing.JLabel();
        j13 = new javax.swing.JLabel();
        j14 = new javax.swing.JLabel();
        j15 = new javax.swing.JLabel();
        j16 = new javax.swing.JLabel();
        j17 = new javax.swing.JLabel();
        j18 = new javax.swing.JLabel();
        j19 = new javax.swing.JLabel();
        j20 = new javax.swing.JLabel();
        k1 = new javax.swing.JLabel();
        k2 = new javax.swing.JLabel();
        k3 = new javax.swing.JLabel();
        k4 = new javax.swing.JLabel();
        k5 = new javax.swing.JLabel();
        k6 = new javax.swing.JLabel();
        k7 = new javax.swing.JLabel();
        k8 = new javax.swing.JLabel();
        k9 = new javax.swing.JLabel();
        k10 = new javax.swing.JLabel();
        k11 = new javax.swing.JLabel();
        k12 = new javax.swing.JLabel();
        k13 = new javax.swing.JLabel();
        k14 = new javax.swing.JLabel();
        k15 = new javax.swing.JLabel();
        k16 = new javax.swing.JLabel();
        k17 = new javax.swing.JLabel();
        k18 = new javax.swing.JLabel();
        k19 = new javax.swing.JLabel();
        k20 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        m4 = new javax.swing.JLabel();
        m5 = new javax.swing.JLabel();
        m6 = new javax.swing.JLabel();
        m7 = new javax.swing.JLabel();
        m8 = new javax.swing.JLabel();
        m9 = new javax.swing.JLabel();
        m10 = new javax.swing.JLabel();
        m11 = new javax.swing.JLabel();
        m12 = new javax.swing.JLabel();
        m13 = new javax.swing.JLabel();
        m14 = new javax.swing.JLabel();
        m15 = new javax.swing.JLabel();
        m16 = new javax.swing.JLabel();
        m17 = new javax.swing.JLabel();
        m18 = new javax.swing.JLabel();
        m19 = new javax.swing.JLabel();
        m20 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        n6 = new javax.swing.JLabel();
        n7 = new javax.swing.JLabel();
        n8 = new javax.swing.JLabel();
        n9 = new javax.swing.JLabel();
        n10 = new javax.swing.JLabel();
        n11 = new javax.swing.JLabel();
        n12 = new javax.swing.JLabel();
        n13 = new javax.swing.JLabel();
        n14 = new javax.swing.JLabel();
        n15 = new javax.swing.JLabel();
        n16 = new javax.swing.JLabel();
        n17 = new javax.swing.JLabel();
        n18 = new javax.swing.JLabel();
        n19 = new javax.swing.JLabel();
        n20 = new javax.swing.JLabel();
        o1 = new javax.swing.JLabel();
        o2 = new javax.swing.JLabel();
        o3 = new javax.swing.JLabel();
        o4 = new javax.swing.JLabel();
        o5 = new javax.swing.JLabel();
        o6 = new javax.swing.JLabel();
        o7 = new javax.swing.JLabel();
        o8 = new javax.swing.JLabel();
        o9 = new javax.swing.JLabel();
        o10 = new javax.swing.JLabel();
        o11 = new javax.swing.JLabel();
        o12 = new javax.swing.JLabel();
        o13 = new javax.swing.JLabel();
        o14 = new javax.swing.JLabel();
        o15 = new javax.swing.JLabel();
        o16 = new javax.swing.JLabel();
        o17 = new javax.swing.JLabel();
        o18 = new javax.swing.JLabel();
        o19 = new javax.swing.JLabel();
        o20 = new javax.swing.JLabel();

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

        a11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a11.setToolTipText("");

        a12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a12.setToolTipText("");

        a13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a13.setToolTipText("");

        a14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a14.setToolTipText("");

        a15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a15.setToolTipText("");

        a16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a16.setToolTipText("");

        a17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a17.setToolTipText("");

        a18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a18.setToolTipText("");

        a19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a19.setToolTipText("");

        a20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        a20.setToolTipText("");

        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b11.setToolTipText("");

        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b12.setToolTipText("");

        b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b13.setToolTipText("");

        b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b14.setToolTipText("");

        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b15.setToolTipText("");

        b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b16.setToolTipText("");

        b17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b17.setToolTipText("");

        b18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b18.setToolTipText("");

        b19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b19.setToolTipText("");

        b20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        b20.setToolTipText("");

        c11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c11.setToolTipText("");

        c12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c12.setToolTipText("");

        c13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c13.setToolTipText("");

        c14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c14.setToolTipText("");

        c15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c15.setToolTipText("");

        c16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c16.setToolTipText("");

        c17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c17.setToolTipText("");

        c18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c18.setToolTipText("");

        c19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c19.setToolTipText("");

        c20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        c20.setToolTipText("");

        d11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d11.setToolTipText("");

        d12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d12.setToolTipText("");

        d13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d13.setToolTipText("");

        d14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d14.setToolTipText("");

        d15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d15.setToolTipText("");

        d16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d16.setToolTipText("");

        d17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d17.setToolTipText("");

        d18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d18.setToolTipText("");

        d19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d19.setToolTipText("");

        d20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        d20.setToolTipText("");

        e11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e11.setToolTipText("");

        e12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e12.setToolTipText("");

        e13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e13.setToolTipText("");

        e14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e14.setToolTipText("");

        e15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e15.setToolTipText("");

        e16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e16.setToolTipText("");

        e17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e17.setToolTipText("");

        e18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e18.setToolTipText("");

        e19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e19.setToolTipText("");

        e20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        e20.setToolTipText("");

        f11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f11.setToolTipText("");

        f12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f12.setToolTipText("");

        f13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f13.setToolTipText("");

        f14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f14.setToolTipText("");

        f15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f15.setToolTipText("");

        f16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f16.setToolTipText("");

        f17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f17.setToolTipText("");

        f18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f18.setToolTipText("");

        f19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f19.setToolTipText("");

        f20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        f20.setToolTipText("");

        g11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g11.setToolTipText("");

        g12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g12.setToolTipText("");

        g13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g13.setToolTipText("");

        g14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g14.setToolTipText("");

        g15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g15.setToolTipText("");

        g16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g16.setToolTipText("");

        g17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g17.setToolTipText("");

        g18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g18.setToolTipText("");

        g19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g19.setToolTipText("");

        g20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        g20.setToolTipText("");

        h11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h11.setToolTipText("");

        h12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h12.setToolTipText("");

        h13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h13.setToolTipText("");

        h14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h14.setToolTipText("");

        h15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h15.setToolTipText("");

        h16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h16.setToolTipText("");

        h17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h17.setToolTipText("");

        h18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h18.setToolTipText("");

        h19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h19.setToolTipText("");

        h20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        h20.setToolTipText("");

        i11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i11.setToolTipText("");

        i12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i12.setToolTipText("");

        i13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i13.setToolTipText("");

        i14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i14.setToolTipText("");

        i15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i15.setToolTipText("");

        i16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i16.setToolTipText("");

        i17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i17.setToolTipText("");

        i18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i18.setToolTipText("");

        i19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i19.setToolTipText("");

        i20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        i20.setToolTipText("");

        j11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j11.setToolTipText("");

        j12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j12.setToolTipText("");

        j13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j13.setToolTipText("");

        j14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j14.setToolTipText("");

        j15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j15.setToolTipText("");

        j16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j16.setToolTipText("");

        j17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j17.setToolTipText("");

        j18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j18.setToolTipText("");

        j19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j19.setToolTipText("");

        j20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        j20.setToolTipText("");

        k1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k1.setToolTipText("");

        k2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k2.setToolTipText("");

        k3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k3.setToolTipText("");

        k4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k4.setToolTipText("");

        k5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k5.setToolTipText("");

        k6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k6.setToolTipText("");

        k7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k7.setToolTipText("");

        k8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k8.setToolTipText("");

        k9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k9.setToolTipText("");

        k10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k10.setToolTipText("");

        k11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k11.setToolTipText("");

        k12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k12.setToolTipText("");

        k13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k13.setToolTipText("");

        k14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k14.setToolTipText("");

        k15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k15.setToolTipText("");

        k16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k16.setToolTipText("");

        k17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k17.setToolTipText("");

        k18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k18.setToolTipText("");

        k19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k19.setToolTipText("");

        k20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        k20.setToolTipText("");

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l1.setToolTipText("");

        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l2.setToolTipText("");

        l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l3.setToolTipText("");

        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l4.setToolTipText("");

        l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l5.setToolTipText("");

        l6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l6.setToolTipText("");

        l7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l7.setToolTipText("");

        l8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l8.setToolTipText("");

        l9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l9.setToolTipText("");

        l10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l10.setToolTipText("");

        l11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l11.setToolTipText("");

        l12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l12.setToolTipText("");

        l13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l13.setToolTipText("");

        l14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l14.setToolTipText("");

        l15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l15.setToolTipText("");

        l16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l16.setToolTipText("");

        l17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l17.setToolTipText("");

        l18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l18.setToolTipText("");

        l19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l19.setToolTipText("");

        l20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        l20.setToolTipText("");

        m1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m1.setToolTipText("");

        m2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m2.setToolTipText("");

        m3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m3.setToolTipText("");

        m4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m4.setToolTipText("");

        m5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m5.setToolTipText("");

        m6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m6.setToolTipText("");

        m7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m7.setToolTipText("");

        m8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m8.setToolTipText("");

        m9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m9.setToolTipText("");

        m10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m10.setToolTipText("");

        m11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m11.setToolTipText("");

        m12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m12.setToolTipText("");

        m13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m13.setToolTipText("");

        m14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m14.setToolTipText("");

        m15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m15.setToolTipText("");

        m16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m16.setToolTipText("");

        m17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m17.setToolTipText("");

        m18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m18.setToolTipText("");

        m19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m19.setToolTipText("");

        m20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        m20.setToolTipText("");

        n1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n1.setToolTipText("");

        n2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n2.setToolTipText("");

        n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n3.setToolTipText("");

        n4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n4.setToolTipText("");

        n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n5.setToolTipText("");

        n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n6.setToolTipText("");

        n7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n7.setToolTipText("");

        n8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n8.setToolTipText("");

        n9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n9.setToolTipText("");

        n10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n10.setToolTipText("");

        n11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n11.setToolTipText("");

        n12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n12.setToolTipText("");

        n13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n13.setToolTipText("");

        n14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n14.setToolTipText("");

        n15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n15.setToolTipText("");

        n16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n16.setToolTipText("");

        n17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n17.setToolTipText("");

        n18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n18.setToolTipText("");

        n19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n19.setToolTipText("");

        n20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        n20.setToolTipText("");

        o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o1.setToolTipText("");

        o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o2.setToolTipText("");

        o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o3.setToolTipText("");

        o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o4.setToolTipText("");

        o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o5.setToolTipText("");

        o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o6.setToolTipText("");

        o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o7.setToolTipText("");

        o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o8.setToolTipText("");

        o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o9.setToolTipText("");

        o10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o10.setToolTipText("");

        o11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o11.setToolTipText("");

        o12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o12.setToolTipText("");

        o13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o13.setToolTipText("");

        o14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o14.setToolTipText("");

        o15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o15.setToolTipText("");

        o16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o16.setToolTipText("");

        o17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o17.setToolTipText("");

        o18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o18.setToolTipText("");

        o19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o19.setToolTipText("");

        o20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jamellyblock.png"))); // NOI18N
        o20.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(i1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(k1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(k2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(j1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(j3)
                                    .addComponent(k3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(j4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(j5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(k4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(k5)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                        .addComponent(j9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j17)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(i9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i19)
                                        .addGap(0, 71, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(k6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(k20)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(h10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(e11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(f11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(f20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(g11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(g12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(g13))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(h11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(h12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(h13)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(g14)
                                                    .addComponent(h14))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(g15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(g16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(g17)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(g18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(g19))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(h15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(h16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(h17)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(h18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(h19))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(j18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(j19)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(h20)
                                            .addComponent(g20)
                                            .addComponent(i20)
                                            .addComponent(j20)))))
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
                                        .addComponent(c10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(d9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(d19))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(405, 405, 405)
                                                .addComponent(e18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(e19)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(e20)
                                            .addComponent(d20)))))
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
                                        .addComponent(a10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a20))
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
                                        .addComponent(b10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b20)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(o1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(o20)))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                            .addComponent(a10)
                            .addComponent(a11)
                            .addComponent(a12)
                            .addComponent(a13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(a20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(a14)
                                    .addComponent(a16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(a17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(a18, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(a19, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b20, javax.swing.GroupLayout.Alignment.TRAILING)))
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
                            .addComponent(c10)
                            .addComponent(c11)
                            .addComponent(c12)
                            .addComponent(c13)
                            .addComponent(c14)
                            .addComponent(c15)
                            .addComponent(c16)
                            .addComponent(c17)
                            .addComponent(c18)
                            .addComponent(c19)
                            .addComponent(c20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d20)
                            .addComponent(d10)
                            .addComponent(d9)
                            .addComponent(d8)
                            .addComponent(d11)
                            .addComponent(d12)
                            .addComponent(d13)
                            .addComponent(d14)
                            .addComponent(d15)
                            .addComponent(d16)
                            .addComponent(d17)
                            .addComponent(d18)
                            .addComponent(d19))))
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
                    .addComponent(e10)
                    .addComponent(e11)
                    .addComponent(e20)
                    .addComponent(e19)
                    .addComponent(e13)
                    .addComponent(e15)
                    .addComponent(e16)
                    .addComponent(e14)
                    .addComponent(e17)
                    .addComponent(e12)
                    .addComponent(e18))
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
                    .addComponent(f10)
                    .addComponent(f11)
                    .addComponent(f12)
                    .addComponent(f13)
                    .addComponent(f14)
                    .addComponent(f15)
                    .addComponent(f16)
                    .addComponent(f17)
                    .addComponent(f18)
                    .addComponent(f19)
                    .addComponent(f20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g13)
                            .addComponent(g14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h14)
                            .addComponent(h13)))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(g10)
                            .addComponent(g11)
                            .addComponent(g12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h12)
                            .addComponent(h1)
                            .addComponent(h2)
                            .addComponent(h4)
                            .addComponent(h3)
                            .addComponent(h5)
                            .addComponent(h6)
                            .addComponent(h7)
                            .addComponent(h8)
                            .addComponent(h10)
                            .addComponent(h9)
                            .addComponent(h11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g20)
                            .addComponent(g19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h19)
                            .addComponent(h20)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g15)
                            .addComponent(g16)
                            .addComponent(g17)
                            .addComponent(g18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h18)
                            .addComponent(h17)
                            .addComponent(h16)
                            .addComponent(h15))))
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
                    .addComponent(i10)
                    .addComponent(i11)
                    .addComponent(i12)
                    .addComponent(i20)
                    .addComponent(i15)
                    .addComponent(i16)
                    .addComponent(i17)
                    .addComponent(i18)
                    .addComponent(i19)
                    .addComponent(i13)
                    .addComponent(i14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j2)
                    .addComponent(j3)
                    .addComponent(j5)
                    .addComponent(j4)
                    .addComponent(j6)
                    .addComponent(j8)
                    .addComponent(j7)
                    .addComponent(j9)
                    .addComponent(j10)
                    .addComponent(j11)
                    .addComponent(j12)
                    .addComponent(j13)
                    .addComponent(j14)
                    .addComponent(j15)
                    .addComponent(j16)
                    .addComponent(j20)
                    .addComponent(j19)
                    .addComponent(j18)
                    .addComponent(j17)
                    .addComponent(j1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k1)
                    .addComponent(k3)
                    .addComponent(k2)
                    .addComponent(k4)
                    .addComponent(k5)
                    .addComponent(k6)
                    .addComponent(k7)
                    .addComponent(k8)
                    .addComponent(k9)
                    .addComponent(k10)
                    .addComponent(k11)
                    .addComponent(k12)
                    .addComponent(k13)
                    .addComponent(k14)
                    .addComponent(k15)
                    .addComponent(k16)
                    .addComponent(k17)
                    .addComponent(k18)
                    .addComponent(k19)
                    .addComponent(k20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l1)
                    .addComponent(l2)
                    .addComponent(l3)
                    .addComponent(l4)
                    .addComponent(l5)
                    .addComponent(l6)
                    .addComponent(l7)
                    .addComponent(l8)
                    .addComponent(l9)
                    .addComponent(l10)
                    .addComponent(l11)
                    .addComponent(l12)
                    .addComponent(l13)
                    .addComponent(l14)
                    .addComponent(l15)
                    .addComponent(l16)
                    .addComponent(l17)
                    .addComponent(l18)
                    .addComponent(l19)
                    .addComponent(l20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m1)
                    .addComponent(m2)
                    .addComponent(m3)
                    .addComponent(m4)
                    .addComponent(m5)
                    .addComponent(m6)
                    .addComponent(m7)
                    .addComponent(m8)
                    .addComponent(m9)
                    .addComponent(m10)
                    .addComponent(m11)
                    .addComponent(m12)
                    .addComponent(m13)
                    .addComponent(m14)
                    .addComponent(m15)
                    .addComponent(m16)
                    .addComponent(m17)
                    .addComponent(m18)
                    .addComponent(m19)
                    .addComponent(m20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n1)
                    .addComponent(n2)
                    .addComponent(n3)
                    .addComponent(n4)
                    .addComponent(n5)
                    .addComponent(n6)
                    .addComponent(n7)
                    .addComponent(n8)
                    .addComponent(n9)
                    .addComponent(n10)
                    .addComponent(n11)
                    .addComponent(n12)
                    .addComponent(n13)
                    .addComponent(n14)
                    .addComponent(n15)
                    .addComponent(n16)
                    .addComponent(n17)
                    .addComponent(n18)
                    .addComponent(n19)
                    .addComponent(n20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(o1)
                    .addComponent(o2)
                    .addComponent(o3)
                    .addComponent(o4)
                    .addComponent(o5)
                    .addComponent(o6)
                    .addComponent(o7)
                    .addComponent(o8)
                    .addComponent(o9)
                    .addComponent(o10)
                    .addComponent(o11)
                    .addComponent(o12)
                    .addComponent(o13)
                    .addComponent(o14)
                    .addComponent(o15)
                    .addComponent(o16)
                    .addComponent(o17)
                    .addComponent(o18)
                    .addComponent(o19)
                    .addComponent(o20))
                .addContainerGap(125, Short.MAX_VALUE))
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
    public javax.swing.JLabel a11;
    public javax.swing.JLabel a12;
    public javax.swing.JLabel a13;
    public javax.swing.JLabel a14;
    public javax.swing.JLabel a15;
    public javax.swing.JLabel a16;
    public javax.swing.JLabel a17;
    public javax.swing.JLabel a18;
    public javax.swing.JLabel a19;
    public javax.swing.JLabel a2;
    public javax.swing.JLabel a20;
    public javax.swing.JLabel a3;
    public javax.swing.JLabel a4;
    public javax.swing.JLabel a5;
    public javax.swing.JLabel a6;
    public javax.swing.JLabel a7;
    public javax.swing.JLabel a8;
    public javax.swing.JLabel a9;
    public javax.swing.JLabel b1;
    public javax.swing.JLabel b10;
    public javax.swing.JLabel b11;
    public javax.swing.JLabel b12;
    public javax.swing.JLabel b13;
    public javax.swing.JLabel b14;
    public javax.swing.JLabel b15;
    public javax.swing.JLabel b16;
    public javax.swing.JLabel b17;
    public javax.swing.JLabel b18;
    public javax.swing.JLabel b19;
    public javax.swing.JLabel b2;
    public javax.swing.JLabel b20;
    public javax.swing.JLabel b3;
    public javax.swing.JLabel b4;
    public javax.swing.JLabel b5;
    public javax.swing.JLabel b6;
    public javax.swing.JLabel b7;
    public javax.swing.JLabel b8;
    public javax.swing.JLabel b9;
    public javax.swing.JLabel c1;
    public javax.swing.JLabel c10;
    public javax.swing.JLabel c11;
    public javax.swing.JLabel c12;
    public javax.swing.JLabel c13;
    public javax.swing.JLabel c14;
    public javax.swing.JLabel c15;
    public javax.swing.JLabel c16;
    public javax.swing.JLabel c17;
    public javax.swing.JLabel c18;
    public javax.swing.JLabel c19;
    public javax.swing.JLabel c2;
    public javax.swing.JLabel c20;
    public javax.swing.JLabel c3;
    public javax.swing.JLabel c4;
    public javax.swing.JLabel c5;
    public javax.swing.JLabel c6;
    public javax.swing.JLabel c7;
    public javax.swing.JLabel c8;
    public javax.swing.JLabel c9;
    public javax.swing.JLabel d1;
    public javax.swing.JLabel d10;
    public javax.swing.JLabel d11;
    public javax.swing.JLabel d12;
    public javax.swing.JLabel d13;
    public javax.swing.JLabel d14;
    public javax.swing.JLabel d15;
    public javax.swing.JLabel d16;
    public javax.swing.JLabel d17;
    public javax.swing.JLabel d18;
    public javax.swing.JLabel d19;
    public javax.swing.JLabel d2;
    public javax.swing.JLabel d20;
    public javax.swing.JLabel d3;
    public javax.swing.JLabel d4;
    public javax.swing.JLabel d5;
    public javax.swing.JLabel d6;
    public javax.swing.JLabel d7;
    public javax.swing.JLabel d8;
    public javax.swing.JLabel d9;
    public javax.swing.JLabel e1;
    public javax.swing.JLabel e10;
    public javax.swing.JLabel e11;
    public javax.swing.JLabel e12;
    public javax.swing.JLabel e13;
    public javax.swing.JLabel e14;
    public javax.swing.JLabel e15;
    public javax.swing.JLabel e16;
    public javax.swing.JLabel e17;
    public javax.swing.JLabel e18;
    public javax.swing.JLabel e19;
    public javax.swing.JLabel e2;
    public javax.swing.JLabel e20;
    public javax.swing.JLabel e3;
    public javax.swing.JLabel e4;
    public javax.swing.JLabel e5;
    public javax.swing.JLabel e6;
    public javax.swing.JLabel e7;
    public javax.swing.JLabel e8;
    public javax.swing.JLabel e9;
    public javax.swing.JLabel f1;
    public javax.swing.JLabel f10;
    public javax.swing.JLabel f11;
    public javax.swing.JLabel f12;
    public javax.swing.JLabel f13;
    public javax.swing.JLabel f14;
    public javax.swing.JLabel f15;
    public javax.swing.JLabel f16;
    public javax.swing.JLabel f17;
    public javax.swing.JLabel f18;
    public javax.swing.JLabel f19;
    public javax.swing.JLabel f2;
    public javax.swing.JLabel f20;
    public javax.swing.JLabel f3;
    public javax.swing.JLabel f4;
    public javax.swing.JLabel f5;
    public javax.swing.JLabel f6;
    public javax.swing.JLabel f7;
    public javax.swing.JLabel f8;
    public javax.swing.JLabel f9;
    public javax.swing.JLabel g1;
    public javax.swing.JLabel g10;
    public javax.swing.JLabel g11;
    public javax.swing.JLabel g12;
    public javax.swing.JLabel g13;
    public javax.swing.JLabel g14;
    public javax.swing.JLabel g15;
    public javax.swing.JLabel g16;
    public javax.swing.JLabel g17;
    public javax.swing.JLabel g18;
    public javax.swing.JLabel g19;
    public javax.swing.JLabel g2;
    public javax.swing.JLabel g20;
    public javax.swing.JLabel g3;
    public javax.swing.JLabel g4;
    public javax.swing.JLabel g5;
    public javax.swing.JLabel g6;
    public javax.swing.JLabel g7;
    public javax.swing.JLabel g8;
    public javax.swing.JLabel g9;
    public javax.swing.JLabel h1;
    public javax.swing.JLabel h10;
    public javax.swing.JLabel h11;
    public javax.swing.JLabel h12;
    public javax.swing.JLabel h13;
    public javax.swing.JLabel h14;
    public javax.swing.JLabel h15;
    public javax.swing.JLabel h16;
    public javax.swing.JLabel h17;
    public javax.swing.JLabel h18;
    public javax.swing.JLabel h19;
    public javax.swing.JLabel h2;
    public javax.swing.JLabel h20;
    public javax.swing.JLabel h3;
    public javax.swing.JLabel h4;
    public javax.swing.JLabel h5;
    public javax.swing.JLabel h6;
    public javax.swing.JLabel h7;
    public javax.swing.JLabel h8;
    public javax.swing.JLabel h9;
    public javax.swing.JLabel i1;
    public javax.swing.JLabel i10;
    public javax.swing.JLabel i11;
    public javax.swing.JLabel i12;
    public javax.swing.JLabel i13;
    public javax.swing.JLabel i14;
    public javax.swing.JLabel i15;
    public javax.swing.JLabel i16;
    public javax.swing.JLabel i17;
    public javax.swing.JLabel i18;
    public javax.swing.JLabel i19;
    public javax.swing.JLabel i2;
    public javax.swing.JLabel i20;
    public javax.swing.JLabel i3;
    public javax.swing.JLabel i4;
    public javax.swing.JLabel i5;
    public javax.swing.JLabel i6;
    public javax.swing.JLabel i7;
    public javax.swing.JLabel i8;
    public javax.swing.JLabel i9;
    public javax.swing.JLabel j1;
    public javax.swing.JLabel j10;
    public javax.swing.JLabel j11;
    public javax.swing.JLabel j12;
    public javax.swing.JLabel j13;
    public javax.swing.JLabel j14;
    public javax.swing.JLabel j15;
    public javax.swing.JLabel j16;
    public javax.swing.JLabel j17;
    public javax.swing.JLabel j18;
    public javax.swing.JLabel j19;
    public javax.swing.JLabel j2;
    public javax.swing.JLabel j20;
    public javax.swing.JLabel j3;
    public javax.swing.JLabel j4;
    public javax.swing.JLabel j5;
    public javax.swing.JLabel j6;
    public javax.swing.JLabel j7;
    public javax.swing.JLabel j8;
    public javax.swing.JLabel j9;
    public javax.swing.JLabel k1;
    public javax.swing.JLabel k10;
    public javax.swing.JLabel k11;
    public javax.swing.JLabel k12;
    public javax.swing.JLabel k13;
    public javax.swing.JLabel k14;
    public javax.swing.JLabel k15;
    public javax.swing.JLabel k16;
    public javax.swing.JLabel k17;
    public javax.swing.JLabel k18;
    public javax.swing.JLabel k19;
    public javax.swing.JLabel k2;
    public javax.swing.JLabel k20;
    public javax.swing.JLabel k3;
    public javax.swing.JLabel k4;
    public javax.swing.JLabel k5;
    public javax.swing.JLabel k6;
    public javax.swing.JLabel k7;
    public javax.swing.JLabel k8;
    public javax.swing.JLabel k9;
    public javax.swing.JLabel l1;
    public javax.swing.JLabel l10;
    public javax.swing.JLabel l11;
    public javax.swing.JLabel l12;
    public javax.swing.JLabel l13;
    public javax.swing.JLabel l14;
    public javax.swing.JLabel l15;
    public javax.swing.JLabel l16;
    public javax.swing.JLabel l17;
    public javax.swing.JLabel l18;
    public javax.swing.JLabel l19;
    public javax.swing.JLabel l2;
    public javax.swing.JLabel l20;
    public javax.swing.JLabel l3;
    public javax.swing.JLabel l4;
    public javax.swing.JLabel l5;
    public javax.swing.JLabel l6;
    public javax.swing.JLabel l7;
    public javax.swing.JLabel l8;
    public javax.swing.JLabel l9;
    public javax.swing.JLabel m1;
    public javax.swing.JLabel m10;
    public javax.swing.JLabel m11;
    public javax.swing.JLabel m12;
    public javax.swing.JLabel m13;
    public javax.swing.JLabel m14;
    public javax.swing.JLabel m15;
    public javax.swing.JLabel m16;
    public javax.swing.JLabel m17;
    public javax.swing.JLabel m18;
    public javax.swing.JLabel m19;
    public javax.swing.JLabel m2;
    public javax.swing.JLabel m20;
    public javax.swing.JLabel m3;
    public javax.swing.JLabel m4;
    public javax.swing.JLabel m5;
    public javax.swing.JLabel m6;
    public javax.swing.JLabel m7;
    public javax.swing.JLabel m8;
    public javax.swing.JLabel m9;
    public javax.swing.JLabel n1;
    public javax.swing.JLabel n10;
    public javax.swing.JLabel n11;
    public javax.swing.JLabel n12;
    public javax.swing.JLabel n13;
    public javax.swing.JLabel n14;
    public javax.swing.JLabel n15;
    public javax.swing.JLabel n16;
    public javax.swing.JLabel n17;
    public javax.swing.JLabel n18;
    public javax.swing.JLabel n19;
    public javax.swing.JLabel n2;
    public javax.swing.JLabel n20;
    public javax.swing.JLabel n3;
    public javax.swing.JLabel n4;
    public javax.swing.JLabel n5;
    public javax.swing.JLabel n6;
    public javax.swing.JLabel n7;
    public javax.swing.JLabel n8;
    public javax.swing.JLabel n9;
    public javax.swing.JLabel o1;
    public javax.swing.JLabel o10;
    public javax.swing.JLabel o11;
    public javax.swing.JLabel o12;
    public javax.swing.JLabel o13;
    public javax.swing.JLabel o14;
    public javax.swing.JLabel o15;
    public javax.swing.JLabel o16;
    public javax.swing.JLabel o17;
    public javax.swing.JLabel o18;
    public javax.swing.JLabel o19;
    public javax.swing.JLabel o2;
    public javax.swing.JLabel o20;
    public javax.swing.JLabel o3;
    public javax.swing.JLabel o4;
    public javax.swing.JLabel o5;
    public javax.swing.JLabel o6;
    public javax.swing.JLabel o7;
    public javax.swing.JLabel o8;
    public javax.swing.JLabel o9;
    // End of variables declaration//GEN-END:variables
}
