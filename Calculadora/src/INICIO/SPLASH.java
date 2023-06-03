package INICIO;

import MENU.MENU_PRINC;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author Mauricio Pelaez
 */
public class SPLASH extends javax.swing.JFrame {

    /**
     * Creates new form SPLASH
     */
    public SPLASH() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
        UIManager.put("nimbusOrange", new Color(0,153,153));
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
            getImage(ClassLoader.getSystemResource("ICON/M.png"));
        
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Splash = new javax.swing.JLabel();
        lbl_Carga = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Splash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/C X 500.png"))); // NOI18N
        getContentPane().add(lbl_Splash, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        lbl_Carga.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Carga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_Carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 485, 20));

        ProgressBar.setBackground(new java.awt.Color(0, 153, 153));
        ProgressBar.setForeground(new java.awt.Color(0, 255, 153));
        ProgressBar.setBorderPainted(false);
        getContentPane().add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 485, 22));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SPLASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPLASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPLASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPLASH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // INICIAR SPLASH
        SPLASH splash = new SPLASH();
        splash.setVisible(true);
        MENU_PRINC menu = new MENU_PRINC();
        
        try {
            for(int i=0; i<=100; i++){
                Thread.sleep(25);
                splash.ProgressBar.setValue(i);
                splash.lbl_Carga.setText(Integer.toString(i)+"%");
                
                if(i == 100){
                    menu.setVisible(true);
                    splash.setVisible(false);
                }
            }
        } catch (Exception e) {
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel lbl_Carga;
    private javax.swing.JLabel lbl_Splash;
    // End of variables declaration//GEN-END:variables
}
