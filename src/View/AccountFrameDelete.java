/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DB.DBConnectionController;
import Controller.Fields.TextFieldsCorrectnessController;
import View.ErrorMessagesAccount.MessageAccountDeleted;
import View.ErrorMessagesAccount.MessageAccountPeselTooLong;
import View.ErrorMessagesAccount.MessageAccountPeselTooShort;
import View.ErrorMessagesLogin.MessageLOGINLoginTooLong;
import View.ErrorMessagesLogin.MessageLOGINLoginTooShort;
import View.ErrorMessagesLogin.MessageLOGINPasswordTooLong;
import View.ErrorMessagesLogin.MessageLOGINPasswordTooShort;
import static View.RegisterFrame.mf;
import com.sun.glass.events.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author mateu
 */
public class AccountFrameDelete extends javax.swing.JFrame {

    /**
     * Creates new form RegisterNextFrame
     */
    public static MessageLOGINPasswordTooLong pTooLong = new MessageLOGINPasswordTooLong();
    public static MessageLOGINPasswordTooShort pTooShort = new MessageLOGINPasswordTooShort();
    public static MessageLOGINLoginTooLong lTooLong = new MessageLOGINLoginTooLong();
    public static MessageLOGINLoginTooShort lTooShort = new MessageLOGINLoginTooShort();
    public static MessageAccountPeselTooLong peTooLong = new MessageAccountPeselTooLong();
    public static MessageAccountPeselTooShort peTooShort = new MessageAccountPeselTooShort();
    public static MessageAccountDeleted accdel = new MessageAccountDeleted();
    public static AccountFrame accframe = new AccountFrame();
    public AccountFrameDelete() {
        initComponents();
         this.setLocationRelativeTo(this);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelRegisterClose = new javax.swing.JLabel();
        jLabelRegisterMinimalize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AccountLoginTxtbox = new javax.swing.JTextField();
        AccountPasswordTxtbox = new javax.swing.JPasswordField();
        AccountDeleteButton = new javax.swing.JButton();
        AccountBackButton = new javax.swing.JButton();
        AccountRefreshButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        AccountPeselTxtbox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(470, 584));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DELETE ACCOUNT");

        jLabelRegisterClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRegisterClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegisterClose.setText("X");
        jLabelRegisterClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegisterClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterCloseMouseClicked(evt);
            }
        });

        jLabelRegisterMinimalize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRegisterMinimalize.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegisterMinimalize.setText("-");
        jLabelRegisterMinimalize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegisterMinimalize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMinimalizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelRegisterMinimalize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRegisterClose)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegisterClose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRegisterMinimalize, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("__________________________________________");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Confirmation");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Login:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");

        AccountLoginTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        AccountLoginTxtbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccountLoginTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        AccountLoginTxtbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AccountLoginTxtboxKeyTyped(evt);
            }
        });

        AccountPasswordTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        AccountPasswordTxtbox.setForeground(new java.awt.Color(255, 255, 255));

        AccountDeleteButton.setBackground(new java.awt.Color(242, 38, 19));
        AccountDeleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccountDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        AccountDeleteButton.setText("Delete");
        AccountDeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccountDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountDeleteButtonMouseClicked(evt);
            }
        });

        AccountBackButton.setBackground(new java.awt.Color(34, 167, 240));
        AccountBackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccountBackButton.setForeground(new java.awt.Color(255, 255, 255));
        AccountBackButton.setText("Back");
        AccountBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccountBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountBackButtonMouseClicked(evt);
            }
        });
        AccountBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountBackButtonActionPerformed(evt);
            }
        });

        AccountRefreshButton.setBackground(new java.awt.Color(34, 121, 44));
        AccountRefreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccountRefreshButton.setForeground(new java.awt.Color(255, 255, 255));
        AccountRefreshButton.setText("Refresh");
        AccountRefreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccountRefreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountRefreshButtonMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pesel:");

        AccountPeselTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        AccountPeselTxtbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccountPeselTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        AccountPeselTxtbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AccountPeselTxtboxKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AccountPasswordTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AccountLoginTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AccountPeselTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(AccountBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(AccountRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AccountDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AccountLoginTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AccountPasswordTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AccountPeselTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountRefreshButton)
                    .addComponent(AccountBackButton)
                    .addComponent(AccountDeleteButton))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelRegisterCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterCloseMouseClicked

    private void jLabelRegisterMinimalizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMinimalizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelRegisterMinimalizeMouseClicked
    int x1,y1;
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-x1, y-y1);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x1 = evt.getX();
        y1 = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void AccountRefreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountRefreshButtonMouseClicked
        AccountLoginTxtbox.setText(null);
        AccountPasswordTxtbox.setText(null);
        
    }//GEN-LAST:event_AccountRefreshButtonMouseClicked

    private void AccountLoginTxtboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccountLoginTxtboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            evt.consume();
            mf.setVisible(true);
        }
    }//GEN-LAST:event_AccountLoginTxtboxKeyTyped

    private void AccountBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountBackButtonMouseClicked
      
    }//GEN-LAST:event_AccountBackButtonMouseClicked

    private void AccountPeselTxtboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccountPeselTxtboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            evt.consume();
            mf.setVisible(true);
        }
    }//GEN-LAST:event_AccountPeselTxtboxKeyTyped

    private void AccountDeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountDeleteButtonMouseClicked
        TextFieldsCorrectnessController cont = new TextFieldsCorrectnessController();
        cont.checkCorrectnessDelete(AccountLoginTxtbox, AccountPasswordTxtbox, AccountPeselTxtbox);
        if(cont.isGood())
        {
            DBConnectionController dbcon = new DBConnectionController();
            boolean yes =dbcon.checkUser(AccountLoginTxtbox, AccountPasswordTxtbox,AccountPeselTxtbox);
            if(yes)
            {
                dbcon.connectAccountDelete(AccountPeselTxtbox);
                this.dispose();
                accdel.setVisible(true);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Stmdijsad");
            }
        }
    }//GEN-LAST:event_AccountDeleteButtonMouseClicked

    private void AccountBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountBackButtonActionPerformed
        AccountLoginTxtbox.setText("");
        AccountPasswordTxtbox.setText("");
        AccountPeselTxtbox.setText("");
        this.dispose();
        accframe.setVisible(true);
    }//GEN-LAST:event_AccountBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterNextFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterNextFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterNextFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterNextFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterNextFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountBackButton;
    private javax.swing.JButton AccountDeleteButton;
    private javax.swing.JTextField AccountLoginTxtbox;
    private javax.swing.JPasswordField AccountPasswordTxtbox;
    private javax.swing.JTextField AccountPeselTxtbox;
    private javax.swing.JButton AccountRefreshButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelRegisterClose;
    private javax.swing.JLabel jLabelRegisterMinimalize;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
