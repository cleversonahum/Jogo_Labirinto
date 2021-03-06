package jogo_labirinto;


import java.io.File;
import jogo_labirinto.Labirinto_frame;
import jogo_labirinto.Toca_Musica.MP3Musica;

/*
//Obs: Para a reprodução do Aduio, é necessário repassar a localição da página, em que o mesmo esta inserido
       O audio se encontra dentro do projeto, ao baixo, é necessário repassar a String path = "" localizado ao
       método main desta classe. O caminho deve ser localizado desde o diretório Raiz.
 */

/**
 *
 * @author anton
 */
public class Tela_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Principal
     */
    MP3Musica toca = new MP3Musica();
    Labirinto_frame labirinto_interface = new Labirinto_frame();
    public Tela_Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("O LABIRINTO");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 520, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TELA_INICIAL.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 610);

        setBounds(0, 0, 884, 636);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        labirinto_interface.setVisible(true);//chama a tela onde está o jogo.
        dispose();//fecha a tela inicial;.
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
        // STRING COM O CAMINHO DO ARQUIVO MP3 A SER TOCADO
        String path = "C:\\Users\\anton\\Git\\Jogo_Labirinto\\v1\\src\\Audio\\mix_4m36s (audio-joiner.com).mp3";

        // INSTANCIAÇÃO DO OBJETO FILE COM O ARQUIVO MP3
        File mp3File = new File(path);

        // INSTANCIAÇÃO DO OBJETO MP3MUSICA DA CLASS INTERNA
        MP3Musica musica = new MP3Musica();
        musica.tocar(mp3File);
        // CHAMA O METODO QUE TOCA A MUSICA
        musica.start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
