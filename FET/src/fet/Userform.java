/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fet;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import fet.JDBC.*;

/**
 *
 * @author Pharaoh
 */
public class Userform extends javax.swing.JFrame {

  
    
    JDBC j = new JDBC();
    
    
    public Userform() {
        initComponents();
       collpanel.setVisible(false);
       hm.setVisible(true);
       exampanel.setVisible(false);
       stdpanel.setVisible(false);
       profilepanel.setVisible(false);
       //n_lab.setText(j.);
       //name_label.setText(j.Name);
//       DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
//        TableColumnModel cm=jTable3.getColumnModel();
//        cm.getColumn(4).setCellEditor(new DefaultCellEditor(
//    new JComboBox(new DefaultComboBoxModel(new String[]{} ))));
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instructor_panel = new javax.swing.JPanel();
        collpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        expandpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        n_lab = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        exampanel = new javax.swing.JPanel();
        createexam = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examTable = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        exam_duration = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        exam_date = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        exam_name = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        course_name = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        sessionpanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        exam_list = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        exam_session = new javax.swing.JTable();
        questpanel = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        quest_tf = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        choose_3_tf = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        choose_4_tf = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        choose_1_tf = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        choose_2_tf = new javax.swing.JTextField();
        next_btn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        correct_cb = new javax.swing.JComboBox();
        hm = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        stdpanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        profilepanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        instructor_panel.setBackground(new java.awt.Color(255, 255, 255));
        instructor_panel.setPreferredSize(new java.awt.Dimension(1366, 769));
        instructor_panel.setLayout(null);

        collpanel.setBackground(new java.awt.Color(39, 42, 54));
        collpanel.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/menu (1).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        collpanel.add(jLabel3);
        jLabel3.setBounds(0, 0, 80, 40);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/home-icon-silhouette (2).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        collpanel.add(jLabel10);
        jLabel10.setBounds(0, 200, 80, 60);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/test (6).png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        collpanel.add(jLabel11);
        jLabel11.setBounds(0, 260, 80, 60);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/male-university-graduate-silhouette-with-the-cap.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        collpanel.add(jLabel12);
        jLabel12.setBounds(0, 320, 80, 60);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/logout.png"))); // NOI18N
        collpanel.add(jLabel13);
        jLabel13.setBounds(0, 710, 80, 60);

        instructor_panel.add(collpanel);
        collpanel.setBounds(0, 0, 80, 770);

        expandpanel.setBackground(new java.awt.Color(39, 42, 54));
        expandpanel.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/home-icon-silhouette (2).png"))); // NOI18N
        jLabel6.setText("   Home");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        expandpanel.add(jLabel6);
        jLabel6.setBounds(10, 200, 190, 60);

        n_lab.setBackground(new java.awt.Color(255, 255, 255));
        n_lab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n_lab.setForeground(new java.awt.Color(255, 255, 255));
        n_lab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n_lab.setText("Name");
        expandpanel.add(n_lab);
        n_lab.setBounds(50, 130, 100, 40);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/menu.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        expandpanel.add(jLabel2);
        jLabel2.setBounds(160, 0, 40, 40);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/icons8-customer-64.png"))); // NOI18N
        expandpanel.add(jLabel5);
        jLabel5.setBounds(50, 70, 100, 60);

        jLabel7.setBackground(new java.awt.Color(39, 42, 54));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/test (6).png"))); // NOI18N
        jLabel7.setText("   Exam");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        expandpanel.add(jLabel7);
        jLabel7.setBounds(10, 260, 190, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/logout.png"))); // NOI18N
        jLabel8.setText("    Log Out");
        expandpanel.add(jLabel8);
        jLabel8.setBounds(10, 710, 190, 60);

        jLabel9.setBackground(new java.awt.Color(39, 42, 54));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/male-university-graduate-silhouette-with-the-cap.png"))); // NOI18N
        jLabel9.setText("   Students");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        expandpanel.add(jLabel9);
        jLabel9.setBounds(10, 320, 190, 60);

        instructor_panel.add(expandpanel);
        expandpanel.setBounds(0, 0, 200, 770);

        name_label.setBackground(new java.awt.Color(255, 255, 255));
        name_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/icons8-customer-40.png"))); // NOI18N
        instructor_panel.add(name_label);
        name_label.setBounds(1230, 0, 140, 60);

        exampanel.setBackground(new java.awt.Color(255, 255, 255));
        exampanel.setMinimumSize(new java.awt.Dimension(1370, 770));
        exampanel.setLayout(null);

        createexam.setBackground(new java.awt.Color(255, 255, 255));
        createexam.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        examTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Duration", "Date", "Course Name"
            }
        ));
        examTable.setFocusable(false);
        examTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        examTable.setRowHeight(30);
        examTable.setShowHorizontalLines(false);
        examTable.setShowVerticalLines(false);
        examTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(examTable);

        createexam.add(jScrollPane1);
        jScrollPane1.setBounds(230, 90, 1010, 270);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Duration");
        createexam.add(jLabel27);
        jLabel27.setBounds(350, 600, 60, 17);

        exam_duration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createexam.add(exam_duration);
        exam_duration.setBounds(440, 590, 210, 40);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Date");
        createexam.add(jLabel28);
        jLabel28.setBounds(350, 680, 60, 17);

        exam_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createexam.add(exam_date);
        exam_date.setBounds(440, 670, 210, 40);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Name");
        createexam.add(jLabel30);
        jLabel30.setBounds(350, 450, 60, 17);

        exam_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createexam.add(exam_name);
        exam_name.setBounds(440, 440, 210, 40);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Course Name");
        createexam.add(jLabel31);
        jLabel31.setBounds(340, 520, 90, 17);

        course_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createexam.add(course_name);
        course_name.setBounds(440, 510, 210, 40);

        jButton5.setText("Create");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        createexam.add(jButton5);
        jButton5.setBounds(790, 520, 170, 90);

        exampanel.add(createexam);
        createexam.setBounds(0, 0, 1370, 770);

        sessionpanel.setBackground(new java.awt.Color(255, 255, 255));
        sessionpanel.setLayout(null);

        exam_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        exam_list.setRowHeight(30);
        exam_list.setShowHorizontalLines(false);
        exam_list.setShowVerticalLines(false);
        jScrollPane3.setViewportView(exam_list);

        sessionpanel.add(jScrollPane3);
        jScrollPane3.setBounds(230, 330, 1000, 220);

        jButton8.setText("Assign");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        sessionpanel.add(jButton8);
        jButton8.setBounds(720, 640, 160, 50);

        exam_session.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        exam_session.setRowHeight(30);
        exam_session.setShowHorizontalLines(false);
        exam_session.setShowVerticalLines(false);
        jScrollPane4.setViewportView(exam_session);

        sessionpanel.add(jScrollPane4);
        jScrollPane4.setBounds(230, 80, 1000, 220);

        exampanel.add(sessionpanel);
        sessionpanel.setBounds(0, 0, 1370, 770);

        questpanel.setBackground(new java.awt.Color(255, 255, 255));
        questpanel.setLayout(null);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Question ");
        questpanel.add(jLabel29);
        jLabel29.setBounds(620, 20, 290, 120);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Question");
        questpanel.add(jLabel32);
        jLabel32.setBounds(350, 260, 70, 20);
        questpanel.add(quest_tf);
        quest_tf.setBounds(430, 250, 720, 40);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Choose 3:");
        questpanel.add(jLabel33);
        jLabel33.setBounds(430, 560, 80, 30);
        questpanel.add(choose_3_tf);
        choose_3_tf.setBounds(430, 590, 650, 30);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Choose 4:");
        questpanel.add(jLabel37);
        jLabel37.setBounds(430, 640, 80, 30);
        questpanel.add(choose_4_tf);
        choose_4_tf.setBounds(430, 670, 650, 30);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Choose 1:");
        questpanel.add(jLabel39);
        jLabel39.setBounds(430, 410, 80, 30);
        questpanel.add(choose_1_tf);
        choose_1_tf.setBounds(430, 440, 650, 30);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Choose 2:");
        questpanel.add(jLabel40);
        jLabel40.setBounds(430, 480, 80, 30);
        questpanel.add(choose_2_tf);
        choose_2_tf.setBounds(430, 510, 650, 30);

        next_btn.setText("Next");
        next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btnActionPerformed(evt);
            }
        });
        questpanel.add(next_btn);
        next_btn.setBounds(1110, 710, 120, 40);

        jButton7.setText("Finish");
        jButton7.setToolTipText("");
        questpanel.add(jButton7);
        jButton7.setBounds(1250, 710, 110, 40);

        correct_cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correct_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose the correct answer", "1", "2", "3", "4", " ", " " }));
        questpanel.add(correct_cb);
        correct_cb.setBounds(560, 340, 330, 30);

        exampanel.add(questpanel);
        questpanel.setBounds(0, 0, 1370, 770);

        instructor_panel.add(exampanel);
        exampanel.setBounds(0, 0, 1370, 770);

        hm.setBackground(new java.awt.Color(255, 255, 255));
        hm.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/test (7).png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 0, 180, 140);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Num of exams");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 140, 140, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Exams");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(40, 180, 100, 30);

        hm.add(jPanel1);
        jPanel1.setBounds(830, 240, 180, 210);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/icons8-students-100.png"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 30, 140, 100);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Number of Students");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(0, 140, 190, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Students");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 180, 120, 30);

        hm.add(jPanel2);
        jPanel2.setBounds(470, 240, 190, 220);

        instructor_panel.add(hm);
        hm.setBounds(0, 0, 1370, 770);

        stdpanel.setBackground(new java.awt.Color(255, 255, 255));
        stdpanel.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable2.setRowHeight(30);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        stdpanel.add(jScrollPane2);
        jScrollPane2.setBounds(320, 140, 860, 540);

        instructor_panel.add(stdpanel);
        stdpanel.setBounds(0, 0, 1370, 770);

        profilepanel.setBackground(new java.awt.Color(255, 255, 255));
        profilepanel.setLayout(null);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/user.png"))); // NOI18N
        profilepanel.add(jLabel20);
        jLabel20.setBounds(280, 50, 190, 170);

        jButton1.setBackground(new java.awt.Color(39, 42, 54));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Upload Photo");
        jButton1.setBorder(null);
        profilepanel.add(jButton1);
        jButton1.setBounds(310, 230, 130, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Name");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(110, 90, 80, 20);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField5);
        jTextField5.setBounds(230, 80, 230, 40);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Mobile Number");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(110, 180, 100, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField1);
        jTextField1.setBounds(230, 170, 230, 40);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Add Course");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(110, 500, 90, 20);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField4);
        jTextField4.setBounds(230, 260, 230, 40);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Email Address");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(110, 270, 100, 20);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField2);
        jTextField2.setBounds(230, 350, 230, 40);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Age");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(110, 360, 70, 20);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField3);
        jTextField3.setBounds(230, 490, 230, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "List Of Courses", " " }));
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(230, 440, 230, 19);

        jButton4.setBackground(new java.awt.Color(39, 42, 54));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fet/Images/add (2).png"))); // NOI18N
        jPanel3.add(jButton4);
        jButton4.setBounds(470, 490, 40, 40);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Courses");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(110, 440, 90, 17);

        profilepanel.add(jPanel3);
        jPanel3.setBounds(510, 50, 540, 570);

        jButton2.setBackground(new java.awt.Color(39, 42, 54));
        jButton2.setText("Edit");
        profilepanel.add(jButton2);
        jButton2.setBounds(620, 640, 130, 40);

        jButton3.setBackground(new java.awt.Color(39, 42, 54));
        jButton3.setText("Save");
        profilepanel.add(jButton3);
        jButton3.setBounds(860, 640, 130, 40);

        instructor_panel.add(profilepanel);
        profilepanel.setBounds(0, 0, 1370, 770);

        getContentPane().add(instructor_panel);
        instructor_panel.setBounds(0, 0, 1366, 769);

        setSize(new java.awt.Dimension(1382, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btnActionPerformed
        j.question = quest_tf.getText();
        j.correctAns = correct_cb.getSelectedItem().toString();
        j.choose_1 = choose_1_tf.getText();
        j.choose_2 = choose_2_tf.getText();
        j.choose_3 = choose_3_tf.getText();
        j.choose_4 = choose_4_tf.getText();
        for (int i = 0; i < examTable.getModel().getRowCount(); i++) {
            Emergency.ID = (int)examTable.getModel().getValueAt(i, 0);
        }
        j.questionNum++;
        j.addQuest();
        quest_tf.setText("");
        choose_1_tf.setText("");
        choose_2_tf.setText("");
        choose_3_tf.setText("");
        choose_4_tf.setText("");
    }//GEN-LAST:event_next_btnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        expandpanel.setVisible(false);
        collpanel.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        expandpanel.setVisible(true);
        collpanel.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       hm.setVisible(true);
       exampanel.setVisible(false);
       stdpanel.setVisible(false);
       profilepanel.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       hm.setVisible(true);
       exampanel.setVisible(false);
       stdpanel.setVisible(false);
       profilepanel.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       hm.setVisible(false);
       exampanel.setVisible(true);
       stdpanel.setVisible(false);
       profilepanel.setVisible(false);
       j.examTable = (DefaultTableModel)examTable.getModel();
       j.showExams();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        hm.setVisible(false);
       exampanel.setVisible(true);
       stdpanel.setVisible(false);
       profilepanel.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        hm.setVisible(false);
       exampanel.setVisible(false);
       stdpanel.setVisible(true);
       profilepanel.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        hm.setVisible(false);
       exampanel.setVisible(false);
       stdpanel.setVisible(true);
       profilepanel.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        j.examTable = (DefaultTableModel)examTable.getModel();
        j.examName = exam_name.getText();
        j.courseName = course_name.getText();
        j.examDuration = Integer.parseInt(exam_duration.getText());
        j.examDate = exam_date.getText();
        for (int i = examTable.getModel().getRowCount()-1; i >= 0; i--) {
            j.examTable.removeRow(i);
        }
        j.addExam();
        j.showExams();
        for (int i = 0; i < examTable.getModel().getRowCount(); i++){
            Emergency.ID = (int)examTable.getModel().getValueAt(i, 0);
        }
        j.createSession();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField choose_1_tf;
    private javax.swing.JTextField choose_2_tf;
    private javax.swing.JTextField choose_3_tf;
    private javax.swing.JTextField choose_4_tf;
    private javax.swing.JPanel collpanel;
    private javax.swing.JComboBox correct_cb;
    private javax.swing.JTextField course_name;
    private javax.swing.JPanel createexam;
    private javax.swing.JTable examTable;
    private javax.swing.JTextField exam_date;
    private javax.swing.JTextField exam_duration;
    private javax.swing.JTable exam_list;
    private javax.swing.JTextField exam_name;
    private javax.swing.JTable exam_session;
    private javax.swing.JPanel exampanel;
    private javax.swing.JPanel expandpanel;
    private javax.swing.JPanel hm;
    private javax.swing.JPanel instructor_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel n_lab;
    private javax.swing.JLabel name_label;
    private javax.swing.JButton next_btn;
    private javax.swing.JPanel profilepanel;
    private javax.swing.JTextField quest_tf;
    private javax.swing.JPanel questpanel;
    private javax.swing.JPanel sessionpanel;
    private javax.swing.JPanel stdpanel;
    // End of variables declaration//GEN-END:variables
}
