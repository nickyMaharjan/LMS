/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lms.connection.ProvideConnection;

/**
 *
 * @author DELL
 */
public class AdminProfile extends javax.swing.JFrame {

    /**
     * Creates new form AdminProfile
     */
    int user_id;

    public AdminProfile() {
        initComponents();
        setLocation(570, 80);
    }

    public AdminProfile(int user_id) {
        initComponents();
        this.user_id = user_id;
        setLocation(850, 80);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        emailTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phonenumberTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        editprofileBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        newpasswordTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        oldpasswordTxt = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 244, 241));

        emailTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        emailTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailTxtMouseClicked(evt);
            }
        });
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel8.setText("General Profile");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Phone Number");

        phonenumberTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        phonenumberTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phonenumberTxtMouseClicked(evt);
            }
        });
        phonenumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("User name");

        usernameTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        usernameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTxtMouseClicked(evt);
            }
        });
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Email");

        editprofileBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        editprofileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/resume.png"))); // NOI18N
        editprofileBtn.setText("Edit Profile");
        editprofileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editprofileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phonenumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(editprofileBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)))
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phonenumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addComponent(editprofileBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 101, -1, -1));

        jPanel2.setBackground(new java.awt.Color(249, 244, 241));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel9.setText("Security and Login");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("Old Password");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setText("New Password");

        newpasswordTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        newpasswordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newpasswordTxtMouseClicked(evt);
            }
        });
        newpasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpasswordTxtActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/secure.png"))); // NOI18N
        jButton2.setText("Change Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newpasswordTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldpasswordTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(oldpasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newpasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 474, 608, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Admin Profile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 13, -1, -1));

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/cancel.png"))); // NOI18N
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 13, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 632, 10));

        jPanel3.setBackground(new java.awt.Color(249, 244, 241));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtMouseClicked

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void phonenumberTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phonenumberTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberTxtMouseClicked

    private void phonenumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberTxtActionPerformed

    private void usernameTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtMouseClicked

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void editprofileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editprofileBtnActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // Retrieve current values from text fields
            String newUserName = usernameTxt.getText().trim();
            String newPhoneNumber = phonenumberTxt.getText().trim();
            String newEmail = emailTxt.getText().trim();

            // Validate input fields
            if (newUserName.isEmpty() || newPhoneNumber.isEmpty() || newEmail.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields must be filled out.");
                return;
            }

            // Connect to the database
            con = ProvideConnection.getConnection();

            // Check current values in the database
            String checkQuery = "SELECT u.userName, u.email, u.phone_number FROM user_details u WHERE u.userId = ?";
            pstmt = con.prepareStatement(checkQuery);
            pstmt.setInt(1, user_id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String currentPhoneNumber = rs.getString("phone_number");
                String currentEmail = rs.getString("email");
                String currentUsername = rs.getString("userName");

                // Check if there are any changes
                if (newPhoneNumber.equals(currentPhoneNumber) && newEmail.equals(currentEmail) && newUserName.equals(currentUsername)) {
                    JOptionPane.showMessageDialog(null, "No changes detected.");
                    return;
                }

                // Update query
                String updateQuery = "UPDATE user_details SET userName = ?, email = ?, phone_number = ? WHERE userId = ?";
                pstmt = con.prepareStatement(updateQuery);
                pstmt.setString(1, newUserName);
                pstmt.setString(2, newEmail);
                pstmt.setString(3, newPhoneNumber);
                pstmt.setInt(4, user_id);

                // Execute the update
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Profile updated successfully.");
                } else {
                    JOptionPane.showMessageDialog(null, "Profile update failed.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_editprofileBtnActionPerformed

    private void newpasswordTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newpasswordTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newpasswordTxtMouseClicked

    private void newpasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpasswordTxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Retrieve values from text fields
            String oldPassword = oldpasswordTxt.getText().trim();
            String newPassword = newpasswordTxt.getText().trim();

            // Validate input fields
            if (oldPassword.isEmpty() || newPassword.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Both old and new passwords must be provided.");
                return;
            }

            // Connect to the database
            con = ProvideConnection.getConnection();

            // Check current password in the database
            String checkQuery = "SELECT password FROM user_details WHERE userId = ?";
            pstmt = con.prepareStatement(checkQuery);
            pstmt.setInt(1, user_id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                String currentPassword = rs.getString("password");

                // Verify if the old password matches the current password
                if (!oldPassword.equals(currentPassword)) {
                    JOptionPane.showMessageDialog(null, "The old password is incorrect.");
                    return;
                }

                // Update query for changing password
                String updateQuery = "UPDATE user_details SET password = ? WHERE userId = ?";
                pstmt = con.prepareStatement(updateQuery);
                pstmt.setString(1, newPassword); // Set new password
                pstmt.setInt(2, user_id); // Set userId

                // Execute the update
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Password updated successfully.");
                    oldpasswordTxt.setText("");
                    newpasswordTxt.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Password update failed.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "User not found.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Connect to the database
            con = ProvideConnection.getConnection();

            // Query to get user details
            String query = "SELECT userName, email, phone_number FROM user_details WHERE userId = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, user_id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                // Retrieve values
                String username = rs.getString("userName");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone_number");

                // Set values to text fields
                usernameTxt.setText(username);
                emailTxt.setText(email);
                phonenumberTxt.setText(phoneNumber);
            } else {
                JOptionPane.showMessageDialog(null, "User not found.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_formComponentShown

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_cancelBtnMouseClicked

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
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JButton editprofileBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField newpasswordTxt;
    private javax.swing.JPasswordField oldpasswordTxt;
    private javax.swing.JTextField phonenumberTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
