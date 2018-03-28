/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DB.DBConnectionController;
import Controller.Fields.TextFieldsCorrectnessController;
import View.ErrorMessagesRegister.MessageLoginTooLong;
import View.ErrorMessagesRegister.MessageLoginTooShort;
import View.ErrorMessagesRegister.MessagePasswordTooLong;
import View.ErrorMessagesRegister.MessagePasswordTooShort;
import View.ErrorMessagesRegister.MessageRetypePasswordNotEqual;
import View.ErrorMessagesRegister.MessageRetypePasswordTooLong;
import View.ErrorMessagesRegister.MessageRetypePasswordTooShort;
import static View.RegisterFrame.RegisterCityTxtbox;
import static View.RegisterFrame.RegisterFirstNameTxtbox;
import static View.RegisterFrame.RegisterHouseNumberTxtbox;
import static View.RegisterFrame.RegisterLastNameTxtbox;
import static View.RegisterFrame.RegisterPESELTxtbox;
import static View.RegisterFrame.RegisterPostalCodeTxtbox;
import static View.RegisterFrame.RegisterStreetTxtbox;
import static View.RegisterFrame.mf;
import com.sun.glass.events.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author mateu
 */
public class RegisterNextFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterNextFrame
     */
    public static MessageLoginTooLong LoginLong = new MessageLoginTooLong();
    public static MessageLoginTooShort LoginShort = new MessageLoginTooShort();
    public static MessagePasswordTooLong PasswordLong = new MessagePasswordTooLong();
    public static MessagePasswordTooShort PasswordShort = new MessagePasswordTooShort();
    public static MessageRetypePasswordTooLong RetypePasswordLong = new MessageRetypePasswordTooLong();
    public static MessageRetypePasswordTooShort RetypePasswordShort = new MessageRetypePasswordTooShort();
    public static MessageRetypePasswordNotEqual RetypePasswordNotEqual = new MessageRetypePasswordNotEqual();
    public static MessageAccountCreated Acc = new MessageAccountCreated();
    
    
    public RegisterNextFrame() {
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
        RegisterLoginTxtbox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AccTypeCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        RegisterPasswordTxtbox = new javax.swing.JPasswordField();
        RegisterRetypePasswordTxtbox = new javax.swing.JPasswordField();
        RegisterBackButton = new javax.swing.JButton();
        RegisterCreateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegisterIITekstArea = new javax.swing.JTextArea();
        RegisterRefreshButton = new javax.swing.JButton();

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
        jLabel2.setText("Register II");

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
                .addGap(18, 18, 18))
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
        jLabel3.setText("______________________________________________");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account Data");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Login:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");

        RegisterLoginTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        RegisterLoginTxtbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterLoginTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLoginTxtbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterLoginTxtboxMouseClicked(evt);
            }
        });
        RegisterLoginTxtbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegisterLoginTxtboxKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Retype Password:");

        AccTypeCombo.setBackground(new java.awt.Color(108, 122, 137));
        AccTypeCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AccTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving Account", "Personal Account", "Company Account" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Choose Account Type:");

        RegisterPasswordTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        RegisterPasswordTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPasswordTxtbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterPasswordTxtboxMouseClicked(evt);
            }
        });

        RegisterRetypePasswordTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        RegisterRetypePasswordTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        RegisterRetypePasswordTxtbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterRetypePasswordTxtboxMouseClicked(evt);
            }
        });

        RegisterBackButton.setBackground(new java.awt.Color(242, 38, 19));
        RegisterBackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterBackButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBackButton.setText("Back");
        RegisterBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBackButtonActionPerformed(evt);
            }
        });

        RegisterCreateButton.setBackground(new java.awt.Color(34, 167, 240));
        RegisterCreateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterCreateButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterCreateButton.setText("Create");
        RegisterCreateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterCreateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterCreateButtonMouseClicked(evt);
            }
        });

        RegisterIITekstArea.setBackground(new java.awt.Color(108, 122, 137));
        RegisterIITekstArea.setColumns(20);
        RegisterIITekstArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        RegisterIITekstArea.setForeground(new java.awt.Color(255, 255, 255));
        RegisterIITekstArea.setRows(5);
        jScrollPane1.setViewportView(RegisterIITekstArea);

        RegisterRefreshButton.setBackground(new java.awt.Color(34, 121, 44));
        RegisterRefreshButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterRefreshButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterRefreshButton.setText("Refresh");
        RegisterRefreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterRefreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterRefreshButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(RegisterRetypePasswordTxtbox))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RegisterLoginTxtbox)
                            .addComponent(RegisterPasswordTxtbox, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))))
                .addGap(51, 51, 51))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AccTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(RegisterBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(RegisterRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(RegisterCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RegisterLoginTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RegisterPasswordTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(RegisterRetypePasswordTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterRefreshButton)
                    .addComponent(RegisterBackButton)
                    .addComponent(RegisterCreateButton))
                .addGap(94, 94, 94))
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

    private void RegisterBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBackButtonActionPerformed
        FirstFrame.l.setExtendedState(JFrame.NORMAL);
        FirstFrame.l.setVisible(true);  
        this.setVisible(false);
    }//GEN-LAST:event_RegisterBackButtonActionPerformed

    private void RegisterRetypePasswordTxtboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterRetypePasswordTxtboxMouseClicked
        RegisterIITekstArea.setText("Retyped Password must be the same as Passowrd!");
    }//GEN-LAST:event_RegisterRetypePasswordTxtboxMouseClicked
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

    private void RegisterRefreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterRefreshButtonMouseClicked
        RegisterLoginTxtbox.setText(null);
        RegisterPasswordTxtbox.setText(null);
        RegisterRetypePasswordTxtbox.setText(null);
    }//GEN-LAST:event_RegisterRefreshButtonMouseClicked

    private void RegisterLoginTxtboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterLoginTxtboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            evt.consume();
            mf.setVisible(true);
        }
    }//GEN-LAST:event_RegisterLoginTxtboxKeyTyped

    private void RegisterPasswordTxtboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterPasswordTxtboxMouseClicked
        RegisterIITekstArea.setText(null);
        RegisterIITekstArea.setText("Only 8 characters here!");
        
    }//GEN-LAST:event_RegisterPasswordTxtboxMouseClicked

    private void RegisterLoginTxtboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLoginTxtboxMouseClicked
        RegisterIITekstArea.setText(null);
        RegisterIITekstArea.setText("Only 8 characters here!");
    }//GEN-LAST:event_RegisterLoginTxtboxMouseClicked
    int AccountType;
    private void RegisterCreateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterCreateButtonMouseClicked
        TextFieldsCorrectnessController txtcheck2 = new TextFieldsCorrectnessController();
        txtcheck2.checkCorrectnessRegisterNextFrame(RegisterPasswordTxtbox,RegisterRetypePasswordTxtbox, RegisterLoginTxtbox);
        if(txtcheck2.isGood())
        {
            try
            {
                DBConnectionController aoc = new DBConnectionController();
                
                String value = (String)AccTypeCombo.getSelectedItem();
                if(value.equals("Saving Account"))
                {
                    AccountType = 1;
                    aoc.connectSaveOwnerAccount(RegisterPESELTxtbox, RegisterPostalCodeTxtbox, RegisterFirstNameTxtbox, 
                    AccountType, RegisterLoginTxtbox, RegisterPasswordTxtbox);
                    
                    RegisterLoginTxtbox.setText("");
                    RegisterPasswordTxtbox.setText("");
                    RegisterRetypePasswordTxtbox.setText("");
                    RegisterPESELTxtbox.setText("");
                    RegisterFirstNameTxtbox.setText("");
                    RegisterLastNameTxtbox.setText("");
                    RegisterStreetTxtbox.setText("");
                    RegisterHouseNumberTxtbox.setText("");
                    RegisterPostalCodeTxtbox.setText("");
                    RegisterCityTxtbox.setText("");
                    
                    this.dispose();
                    Acc.setVisible(true);
                }
                else if(value.equals("Personal Account"))
                {
                    AccountType = 2;
                    aoc.connectSaveOwnerAccount(RegisterPESELTxtbox, RegisterPostalCodeTxtbox, RegisterFirstNameTxtbox, 
                    AccountType, RegisterLoginTxtbox, RegisterPasswordTxtbox);
                    
                    RegisterLoginTxtbox.setText("");
                    RegisterPasswordTxtbox.setText("");
                    RegisterRetypePasswordTxtbox.setText("");
                    RegisterPESELTxtbox.setText("");
                    RegisterFirstNameTxtbox.setText("");
                    RegisterLastNameTxtbox.setText("");
                    RegisterStreetTxtbox.setText("");
                    RegisterHouseNumberTxtbox.setText("");
                    RegisterPostalCodeTxtbox.setText("");
                    RegisterCityTxtbox.setText("");
                    
                    this.dispose();
                    Acc.setVisible(true);    
                }
                else if(value.equals("Company Account"))
                {
                    AccountType = 3;
                    aoc.connectSaveOwnerAccount(RegisterPESELTxtbox, RegisterPostalCodeTxtbox, RegisterFirstNameTxtbox, 
                    AccountType, RegisterLoginTxtbox, RegisterPasswordTxtbox);
                    
                    RegisterLoginTxtbox.setText("");
                    RegisterPasswordTxtbox.setText("");
                    RegisterRetypePasswordTxtbox.setText("");
                    RegisterPESELTxtbox.setText("");
                    RegisterFirstNameTxtbox.setText("");
                    RegisterLastNameTxtbox.setText("");
                    RegisterStreetTxtbox.setText("");
                    RegisterHouseNumberTxtbox.setText("");
                    RegisterPostalCodeTxtbox.setText("");
                    RegisterCityTxtbox.setText("");
                    
                    this.dispose();
                    Acc.setVisible(true);    
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_RegisterCreateButtonMouseClicked

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
    private javax.swing.JComboBox<String> AccTypeCombo;
    private javax.swing.JButton RegisterBackButton;
    private javax.swing.JButton RegisterCreateButton;
    private javax.swing.JTextArea RegisterIITekstArea;
    private javax.swing.JTextField RegisterLoginTxtbox;
    private javax.swing.JPasswordField RegisterPasswordTxtbox;
    private javax.swing.JButton RegisterRefreshButton;
    private javax.swing.JPasswordField RegisterRetypePasswordTxtbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRegisterClose;
    private javax.swing.JLabel jLabelRegisterMinimalize;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
