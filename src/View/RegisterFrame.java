/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Owner.OwnerController;
import Controller.Fields.TextFieldsCorrectnessController;
import View.ErrorMessagesRegister.MessageFrame;
import View.ErrorMessagesRegister.MessageCityTooLong;
import View.ErrorMessagesRegister.MessageCityTooShort;
import View.ErrorMessagesRegister.MessageDateIsNull;
import View.ErrorMessagesRegister.MessageFrameFNameTooLong;
import View.ErrorMessagesRegister.MessageFrameFNameTooShort;
import View.ErrorMessagesRegister.MessageFrameOnlyAlphabetics;
import View.ErrorMessagesRegister.MessageHNumberTooLong;
import View.ErrorMessagesRegister.MessageHNumberTooShort;
import View.ErrorMessagesRegister.MessageLNameTooLong;
import View.ErrorMessagesRegister.MessageLNameTooShort;
import View.ErrorMessagesRegister.MessagePCodeTooLong;
import View.ErrorMessagesRegister.MessagePCodeTooShort;
import View.ErrorMessagesRegister.MessagePeselTooLong;
import View.ErrorMessagesRegister.MessagePeselTooShort;
import View.ErrorMessagesRegister.MessageStreetTooLong;
import View.ErrorMessagesRegister.MessageStreetTooShort;
import View.ErrorMessagesRegister.MessageWrongDate;
import com.sun.glass.events.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author mateu
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    
  
    
    public static OwnerController co = new OwnerController();
    public static MessageFrame mf = new MessageFrame();
    public static RegisterNextFrame rnf = new RegisterNextFrame();
    public static MessageFrameOnlyAlphabetics mfoa = new MessageFrameOnlyAlphabetics();
    public static MessageFrameFNameTooShort mffnts = new MessageFrameFNameTooShort();
    public static MessageFrameFNameTooLong mffntl = new MessageFrameFNameTooLong();
    public static MessageLNameTooLong mfntl = new MessageLNameTooLong();
    public static MessageLNameTooShort mfnts = new MessageLNameTooShort();
    public static MessagePeselTooLong peselLong = new MessagePeselTooLong();
    public static MessagePeselTooShort peselShort = new MessagePeselTooShort();
    public static MessageStreetTooLong streetLong = new MessageStreetTooLong();
    public static MessageStreetTooShort streetShort = new MessageStreetTooShort();
    public static MessageHNumberTooLong HNumberLong = new MessageHNumberTooLong();
    public static MessageHNumberTooShort HNumberShort = new MessageHNumberTooShort();
    public static MessagePCodeTooLong PCodeLong = new MessagePCodeTooLong();
    public static MessagePCodeTooShort PCodeShort = new MessagePCodeTooShort();
    public static MessageCityTooLong CityLong = new MessageCityTooLong();
    public static MessageCityTooShort CityShort = new MessageCityTooShort();
    public static MessageDateIsNull dateNull = new MessageDateIsNull();
    public static MessageWrongDate dateWrong = new MessageWrongDate();
    
    
    public RegisterFrame() {
        
        initComponents();
        this.setLocationRelativeTo(this);
    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelRegisterClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelRegisterMinimalize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RegisterFirstNameTxtbox = new javax.swing.JTextField();
        RegisterLastNameTxtbox = new javax.swing.JTextField();
        RegisterPESELTxtbox = new javax.swing.JTextField();
        RegisterStreetTxtbox = new javax.swing.JTextField();
        RegisterHouseNumberTxtbox = new javax.swing.JTextField();
        RegisterPostalCodeTxtbox = new javax.swing.JTextField();
        RegisterCityTxtbox = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        RegisterLoginLabel = new javax.swing.JLabel();
        RegisterCancelButton = new javax.swing.JButton();
        RegisterNextButton = new javax.swing.JButton();
        RegisterRefreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        jLabelRegisterClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRegisterClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegisterClose.setText("X");
        jLabelRegisterClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegisterClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterCloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register I");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelRegisterMinimalize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRegisterClose)
                .addGap(23, 23, 23))
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("First Name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personal Data");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("______________________________________________");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PESEL:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Street:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("House Number:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Postal Code:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("City:");

        RegisterFirstNameTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        RegisterFirstNameTxtbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterFirstNameTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        RegisterFirstNameTxtbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegisterFirstNameTxtboxKeyTyped(evt);
            }
        });

        RegisterLastNameTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        RegisterLastNameTxtbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterLastNameTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        RegisterLastNameTxtbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegisterLastNameTxtboxKeyTyped(evt);
            }
        });

        RegisterPESELTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        RegisterPESELTxtbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterPESELTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPESELTxtbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegisterPESELTxtboxKeyTyped(evt);
            }
        });

        RegisterStreetTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        RegisterStreetTxtbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterStreetTxtbox.setForeground(new java.awt.Color(255, 255, 255));

        RegisterHouseNumberTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        RegisterHouseNumberTxtbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterHouseNumberTxtbox.setForeground(new java.awt.Color(255, 255, 255));

        RegisterPostalCodeTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        RegisterPostalCodeTxtbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterPostalCodeTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPostalCodeTxtbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegisterPostalCodeTxtboxKeyTyped(evt);
            }
        });

        RegisterCityTxtbox.setBackground(new java.awt.Color(108, 122, 137));
        RegisterCityTxtbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterCityTxtbox.setForeground(new java.awt.Color(255, 255, 255));
        RegisterCityTxtbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RegisterCityTxtboxKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Click here to");

        RegisterLoginLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterLoginLabel.setForeground(new java.awt.Color(0, 153, 255));
        RegisterLoginLabel.setText("Login");
        RegisterLoginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterLoginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterLoginLabelMouseClicked(evt);
            }
        });

        RegisterCancelButton.setBackground(new java.awt.Color(242, 38, 19));
        RegisterCancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterCancelButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterCancelButton.setText("Cancel");
        RegisterCancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCancelButtonActionPerformed(evt);
            }
        });

        RegisterNextButton.setBackground(new java.awt.Color(34, 167, 240));
        RegisterNextButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterNextButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterNextButton.setText("Next");
        RegisterNextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterNextButtonActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(RegisterCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(RegisterRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(RegisterNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RegisterFirstNameTxtbox, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                            .addComponent(RegisterLastNameTxtbox)
                                            .addComponent(RegisterPESELTxtbox)
                                            .addComponent(RegisterStreetTxtbox)
                                            .addComponent(RegisterHouseNumberTxtbox)
                                            .addComponent(RegisterPostalCodeTxtbox)
                                            .addComponent(RegisterCityTxtbox)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RegisterLoginLabel)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RegisterFirstNameTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RegisterLastNameTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RegisterPESELTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RegisterStreetTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(RegisterHouseNumberTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(RegisterPostalCodeTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(RegisterCityTxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterRefreshButton)
                    .addComponent(RegisterCancelButton)
                    .addComponent(RegisterNextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(RegisterLoginLabel))
                .addGap(25, 25, 25))
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

    private void RegisterLoginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLoginLabelMouseClicked
        FirstFrame.lf.setVisible(true);
        FirstFrame.lf.setExtendedState(JFrame.NORMAL);
        this.dispose();
    }//GEN-LAST:event_RegisterLoginLabelMouseClicked

    private void RegisterCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCancelButtonActionPerformed
        this.dispose();       
    }//GEN-LAST:event_RegisterCancelButtonActionPerformed
    boolean good = false;

    private void RegisterNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterNextButtonActionPerformed
        TextFieldsCorrectnessController txtcheck = new TextFieldsCorrectnessController();
        txtcheck.checkCorrectnessRegister(RegisterFirstNameTxtbox,RegisterLastNameTxtbox,RegisterPESELTxtbox,RegisterStreetTxtbox,
                RegisterHouseNumberTxtbox,RegisterPostalCodeTxtbox,RegisterCityTxtbox);
        if(txtcheck.isGood())
        {   
            rnf.setExtendedState(JFrame.NORMAL);
            rnf.setVisible(true);
            this.setVisible(false);
            this.good=false;
        }
     
    }//GEN-LAST:event_RegisterNextButtonActionPerformed
    int x1,y1;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x1 = evt.getX();
        y1 = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void RegisterRefreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterRefreshButtonMouseClicked
        RegisterFirstNameTxtbox.setText(null);
        RegisterLastNameTxtbox.setText(null);
        RegisterPESELTxtbox.setText(null);
        RegisterStreetTxtbox.setText(null);
        RegisterHouseNumberTxtbox.setText(null);
        RegisterPostalCodeTxtbox.setText(null);
        RegisterCityTxtbox.setText(null);
        
    }//GEN-LAST:event_RegisterRefreshButtonMouseClicked

    private void RegisterPESELTxtboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterPESELTxtboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            evt.consume();
            mf.setVisible(true);
//            getToolkit().beep();
        }
    }//GEN-LAST:event_RegisterPESELTxtboxKeyTyped

    private void RegisterPostalCodeTxtboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterPostalCodeTxtboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            evt.consume();
            mf.setVisible(true);
        }
    }//GEN-LAST:event_RegisterPostalCodeTxtboxKeyTyped

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-x1, y-y1);
    }//GEN-LAST:event_formMouseDragged

    private void RegisterFirstNameTxtboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterFirstNameTxtboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isAlphabetic(c)|| (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            evt.consume();
            mfoa.setVisible(true);
        }
    }//GEN-LAST:event_RegisterFirstNameTxtboxKeyTyped

    private void RegisterLastNameTxtboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterLastNameTxtboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isAlphabetic(c)|| (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            evt.consume();
            mfoa.setVisible(true);
        }
    }//GEN-LAST:event_RegisterLastNameTxtboxKeyTyped

    private void RegisterCityTxtboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterCityTxtboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isAlphabetic(c)|| (c==KeyEvent.VK_BACKSPACE) || (c==KeyEvent.VK_DELETE)))
        {
            evt.consume();
            mfoa.setVisible(true);
        }
    }//GEN-LAST:event_RegisterCityTxtboxKeyTyped

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterCancelButton;
    public static javax.swing.JTextField RegisterCityTxtbox;
    public static javax.swing.JTextField RegisterFirstNameTxtbox;
    public static javax.swing.JTextField RegisterHouseNumberTxtbox;
    public static javax.swing.JTextField RegisterLastNameTxtbox;
    private javax.swing.JLabel RegisterLoginLabel;
    private javax.swing.JButton RegisterNextButton;
    public static javax.swing.JTextField RegisterPESELTxtbox;
    public static javax.swing.JTextField RegisterPostalCodeTxtbox;
    private javax.swing.JButton RegisterRefreshButton;
    public static javax.swing.JTextField RegisterStreetTxtbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelRegisterClose;
    private javax.swing.JLabel jLabelRegisterMinimalize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

//    public JDateChooser getRegisterBirthDatePicker() {
//        return RegisterBirthDatePicker;
//    }

    public JTextField getRegisterCityTxtbox() {
        return RegisterCityTxtbox;
    }

    public JTextField getRegisterFirstNameTxtbox() {
        return RegisterFirstNameTxtbox;
    }

    public JTextField getRegisterHouseNumberTxtbox() {
        return RegisterHouseNumberTxtbox;
    }

    public JTextField getRegisterLastNameTxtbox() {
        return RegisterLastNameTxtbox;
    }

    public JTextField getRegisterPESELTxtbox() {
        return RegisterPESELTxtbox;
    }

    public JTextField getRegisterPostalCodeTxtbox() {
        return RegisterPostalCodeTxtbox;
    }

    public JTextField getRegisterStreetTxtbox() {
        return RegisterStreetTxtbox;
    }

   
}
