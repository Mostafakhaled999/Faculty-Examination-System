/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fet;
import fet.JDBC.*;

//import javafx.scene.paint.Color;

/**
 *
 * @author Pharaoh
 */
public class Login extends javax.swing.JFrame {

    JDBC j = new JDBC();
    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Tf_pass = new javax.swing.JPasswordField();
        Tf_usname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(115, 217, 242));
        jPanel2.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/college-graduation (1).png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 70, 100, 70);

        jLabel2.setBackground(new java.awt.Color(115, 217, 242));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Log In");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setNextFocusableComponent(jLabel2);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 160, 120, 40);
        jLabel2.getAccessibleContext().setAccessibleParent(jPanel2);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(120, 110, 160, 210);

        jButton2.setBackground(new java.awt.Color(115, 217, 242));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Log in");
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        getContentPane().add(jButton2);
        jButton2.setBounds(1030, 60, 130, 40);

        jButton3.setBackground(new java.awt.Color(115, 217, 242));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Register");
        jButton3.setBorder(null);
        jButton3.setFocusable(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1193, 60, 130, 40);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/library-1554912167681-8420.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 230);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/show-password.png"))); // NOI18N
        jLabel6.setLabelFor(Tf_pass);
        jLabel6.setNextFocusableComponent(jLabel6);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(860, 240, 40, 40);
        jLabel6.getAccessibleContext().setAccessibleParent(jLabel6);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Username or Email");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 110, 170, 40);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(550, 210, 120, 30);

        jButton1.setBackground(new java.awt.Color(115, 217, 242));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/log-in (3).png"))); // NOI18N
        jButton1.setText("Log in");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(550, 320, 310, 50);

        Tf_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tf_pass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Tf_pass.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel1.add(Tf_pass);
        Tf_pass.setBounds(550, 240, 310, 40);

        Tf_usname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tf_usname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Tf_usname.setSelectionColor(new java.awt.Color(153, 153, 153));
        jPanel1.add(Tf_usname);
        Tf_usname.setBounds(550, 150, 310, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 230, 1370, 540);

        setSize(new java.awt.Dimension(1382, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered

        jLabel6.setOpaque(true);
        jLabel6.setBackground(java.awt.Color.GRAY);
        Tf_pass.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setOpaque(false);
        jLabel6.setBackground(java.awt.Color.WHITE);
         Tf_pass.setEchoChar('*');
    }//GEN-LAST:event_jLabel6MouseExited

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        Register r =new Register();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        j.usName = Tf_usname.getText();
        j.usPass = Tf_pass.getText();
        j.Login(j);
        Tf_usname.setText("");
        Tf_pass.setText("");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Tf_pass;
    private javax.swing.JTextField Tf_usname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
