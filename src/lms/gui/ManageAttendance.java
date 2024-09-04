/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import lms.connection.ProvideConnection;

/**
 *
 * @author DELL
 */
public class ManageAttendance extends javax.swing.JFrame {

    /**
     * Creates new form ManageAttendance
     */
    public int tutor_id;
    public int count_student = 0;

    public ManageAttendance() {
        initComponents();
        setLocation(560, 60);
        dateChooser.setDate(new Date());
    }

    public ManageAttendance(int tutor_id) {
        initComponents();
        this.tutor_id = tutor_id;
        setLocation(560, 60);
        dateChooser.setDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        courseCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentattendanceTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        absentstudentTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        totalstudentTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        coursenameTxt = new javax.swing.JTextField();
        presentstudentTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cancelBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Manage Attendance");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 13, -1, -1));

        dateChooser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        getContentPane().add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 74, 300, 35));

        courseCombo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        courseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        courseCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                courseComboItemStateChanged(evt);
            }
        });
        getContentPane().add(courseCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 74, 300, 35));

        studentattendanceTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Status"
            }
        ));
        studentattendanceTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentattendanceTblMouseClicked(evt);
            }
        });
        studentattendanceTbl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                studentattendanceTblPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(studentattendanceTbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 169, 1176, 580));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel3.setText("Course Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 120, -1, -1));

        saveBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/complete-task.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setActionCommand("");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 820, 120, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel4.setText("Absent Students");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 770, -1, -1));

        absentstudentTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        absentstudentTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentstudentTxtActionPerformed(evt);
            }
        });
        getContentPane().add(absentstudentTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 770, 150, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel5.setText("Total Students");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 770, -1, -1));

        totalstudentTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        totalstudentTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalstudentTxtActionPerformed(evt);
            }
        });
        getContentPane().add(totalstudentTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 770, 150, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel6.setText("Present Students");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 770, -1, -1));

        coursenameTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        coursenameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursenameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(coursenameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 116, 200, 35));

        presentstudentTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        presentstudentTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentstudentTxtActionPerformed(evt);
            }
        });
        getContentPane().add(presentstudentTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 770, 150, 35));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 1200, 10));

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/images/cancel.png"))); // NOI18N
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1156, 13, -1, -1));

        jPanel2.setBackground(new java.awt.Color(249, 244, 241));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1199, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public List<String> getCourseNamesByTutorId(int tutorId) {
        List<String> courseNames = new ArrayList<>();

        String courseIdQuery = "SELECT course_id FROM assign_tutor WHERE tutor_id = ?";
        String courseNameQuery = "SELECT course_name FROM course WHERE course_id = ?";

        try {
            // Retrieve course IDs
            Connection con = ProvideConnection.getConnection();
            List<Integer> courseIds = new ArrayList<>();
            try (PreparedStatement courseIdStmt = con.prepareStatement(courseIdQuery)) {
                courseIdStmt.setInt(1, tutorId);
                try (ResultSet courseIdRs = courseIdStmt.executeQuery()) {
                    while (courseIdRs.next()) {
                        courseIds.add(courseIdRs.getInt("course_id"));
                    }
                }
            }

            // Retrieve course names for the obtained course IDs
            try (PreparedStatement courseNameStmt = con.prepareStatement(courseNameQuery)) {
                for (int courseId : courseIds) {
                    courseNameStmt.setInt(1, courseId);
                    try (ResultSet courseNameRs = courseNameStmt.executeQuery()) {
                        if (courseNameRs.next()) {
                            courseNames.add(courseNameRs.getString("course_name"));
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return courseNames;
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        List<String> courseNames = getCourseNamesByTutorId(tutor_id);
        for (String courseName : courseNames) {
            courseCombo.addItem(courseName);
        }
    }//GEN-LAST:event_formComponentShown
    private List<Object[]> getStudentsByCourse(String course) {
        List<Object[]> students = new ArrayList<>();

        String studentQuery = "SELECT student_id, first_name FROM student WHERE course = ?";

        try (Connection connection = ProvideConnection.getConnection();
                PreparedStatement studentStmt = connection.prepareStatement(studentQuery)) {
            studentStmt.setString(1, course);
            try (ResultSet studentRs = studentStmt.executeQuery()) {
                while (studentRs.next()) {
                    int studentId = studentRs.getInt("student_id");
                    String firstName = studentRs.getString("first_name");
                    students.add(new Object[]{studentId, firstName, "None"});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    private void updateStudentTable(List<Object[]> students) {
        DefaultTableModel tableModel = (DefaultTableModel) studentattendanceTbl.getModel();
        // Clear existing data
        tableModel.setRowCount(0);

        // Add new data
        for (Object[] student : students) {
            tableModel.addRow(student);
        }

        totalstudentTxt.setText("" + students.size());
        // Ensure the "Attendance" column has a combo box for each row
        TableColumn attendanceColumn = studentattendanceTbl.getColumnModel().getColumn(2);
        JComboBox<String> attendanceCombo = new JComboBox<>(new String[]{"None", "Absent", "Present"});
        attendanceColumn.setCellEditor(new DefaultCellEditor(attendanceCombo));
    }
    private void courseComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_courseComboItemStateChanged
        // TODO add your handling code here:
        String selectedCourse = (String) courseCombo.getSelectedItem();
        coursenameTxt.setText(selectedCourse);
        if (selectedCourse != null) {
            List<Object[]> students = getStudentsByCourse(selectedCourse);
            updateStudentTable(students);
        }
    }//GEN-LAST:event_courseComboItemStateChanged

    private void absentstudentTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentstudentTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_absentstudentTxtActionPerformed

    private void totalstudentTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalstudentTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalstudentTxtActionPerformed

    private void coursenameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursenameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursenameTxtActionPerformed

    private void presentstudentTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentstudentTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presentstudentTxtActionPerformed

    private void studentattendanceTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentattendanceTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_studentattendanceTblMouseClicked
    private void updateAttendanceCounts() {
        int presentCount = 0;
        int absentCount = 0;

        for (int i = 0; i < studentattendanceTbl.getRowCount(); i++) {
            String attendance = (String) studentattendanceTbl.getValueAt(i, 2);
            if ("Present".equals(attendance)) {
                presentCount++;
            } else if ("Absent".equals(attendance)) {
                absentCount++;
            }
        }

        presentstudentTxt.setText("" + presentCount);
        absentstudentTxt.setText("" + absentCount);
    }
    private void studentattendanceTblPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_studentattendanceTblPropertyChange
        // TODO add your handling code here:
        updateAttendanceCounts();
    }//GEN-LAST:event_studentattendanceTblPropertyChange

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) studentattendanceTbl.getModel();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String selectedDate = dateFormat.format(dateChooser.getDate());
        String course_name = coursenameTxt.getText();
        boolean hasNone = false;
        String insertQuery = "INSERT INTO student_attendance (date, course_name, student_id, student_name, status) VALUES (?, ?, ?, ?, ?)";

        // Check if any student has a status of "None"
        for (int i = 0; i < studentattendanceTbl.getRowCount(); i++) {
            String status = (String) studentattendanceTbl.getValueAt(i, 2);
            if (status.equals("None")) {
                hasNone = true;
                JOptionPane.showMessageDialog(null, "Complete attendance for all students.");
                break;
            }
        }

        if (!hasNone) {
            try (Connection connection = ProvideConnection.getConnection();
                    PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {

                for (int i = 0; i < studentattendanceTbl.getRowCount(); i++) {
                    int studentId = (int) studentattendanceTbl.getValueAt(i, 0);
                    String studentName = (String) studentattendanceTbl.getValueAt(i, 1);
                    String status = (String) studentattendanceTbl.getValueAt(i, 2);
                   
                    insertStmt.setString(1, selectedDate);
                    insertStmt.setString(2, course_name);
                    insertStmt.setInt(3, studentId);
                    insertStmt.setString(4, studentName);
                    insertStmt.setString(5, status);
                    insertStmt.addBatch();
                }

                insertStmt.executeBatch();

                // Reset the table and UI elements after successful insertion
                tableModel.setRowCount(0);
                courseCombo.setSelectedItem("None");
                totalstudentTxt.setText("0");
                presentstudentTxt.setText("0");
                absentstudentTxt.setText("0");
                JOptionPane.showMessageDialog(null, "Attendance Added Successfully.");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error Adding Attendance: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManageAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absentstudentTxt;
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JTextField coursenameTxt;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField presentstudentTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable studentattendanceTbl;
    private javax.swing.JTextField totalstudentTxt;
    // End of variables declaration//GEN-END:variables
}
