package delacasa_sms;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.text.*;
/**
 * @author Angelica DC
 */
public class DisplayFrame extends javax.swing.JFrame {
    int xx, xy;
    private DefaultTableModel model;
    private DataManager dataManager;
    private List<Student> studentList;
    public DisplayFrame() {
        initComponents();
        dataManager = new DataManager();
        studentList=dataManager.loadStudentData();
        model=(DefaultTableModel) jTable2.getModel();
        tableViewStudent();
        setIconImage();
        setTitle("RGO - SMS");
        init();
    }

public class ScaleImage extends javax.swing.JFrame{
    public ScaleImage(){
        initComponents();
        scaleImage();
    }
    
    public void scaleImage(){
        try{
        ImageIcon icon = new ImageIcon("newRGO_LOGO.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(imgLogo.getWidth(), imgLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        imgLogo.setIcon(scaledIcon);
        }catch (Exception e){
        e.printStackTrace();
        }
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        labelHeader = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        chooseBday = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        selectGender = new javax.swing.JComboBox<>();
        selectBranch = new javax.swing.JComboBox<>();
        selectProgram = new javax.swing.JComboBox<>();
        selectStatus = new javax.swing.JComboBox<>();
        txtMobile = new javax.swing.JTextField();
        labelID = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelBirthdate = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelMobile = new javax.swing.JLabel();
        labelBranch = new javax.swing.JLabel();
        labelProgram = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        labelSearchStudent = new javax.swing.JLabel();
        txtSearchBar = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 70, 103));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel2.setBackground(new java.awt.Color(142, 194, 65));

        jPanel6.setBackground(new java.awt.Color(64, 121, 192));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 72, 143), 5, true));
        jPanel6.setMaximumSize(new java.awt.Dimension(200, 200));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        labelHeader.setBackground(new java.awt.Color(0, 102, 102));
        labelHeader.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        labelHeader.setForeground(new java.awt.Color(255, 255, 255));
        labelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHeader.setText("RGO Student Management System");

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delacasa_sms/resizeRGO_LOGO.png"))); // NOI18N
        imgLogo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/delacasa_sms/resizeRGO_LOGO.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(imgLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(383, 383, 383))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(142, 194, 65));

        jPanel4.setBackground(new java.awt.Color(64, 121, 192));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 72, 143), 5, true));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setForeground(new java.awt.Color(0, 0, 0));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setForeground(new java.awt.Color(0, 0, 0));

        chooseBday.setBackground(new java.awt.Color(255, 255, 255));
        chooseBday.setForeground(new java.awt.Color(0, 0, 0));
        chooseBday.setDateFormatString("yyyy-MM-dd");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));

        selectGender.setBackground(new java.awt.Color(255, 255, 255));
        selectGender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        selectGender.setForeground(new java.awt.Color(0, 0, 0));
        selectGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        selectBranch.setBackground(new java.awt.Color(255, 255, 255));
        selectBranch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        selectBranch.setForeground(new java.awt.Color(0, 0, 0));
        selectBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Davao", "Cagayan de Oro", "Butuan", "Koronadal", "General Santos" }));

        selectProgram.setBackground(new java.awt.Color(255, 255, 255));
        selectProgram.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        selectProgram.setForeground(new java.awt.Color(0, 0, 0));
        selectProgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Psychometrician", "Civil Service", "NAPOLCOM" }));

        selectStatus.setBackground(new java.awt.Color(255, 255, 255));
        selectStatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        selectStatus.setForeground(new java.awt.Color(0, 0, 0));
        selectStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENROLLED", "NOT ENROLLED" }));
        selectStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectStatusActionPerformed(evt);
            }
        });

        txtMobile.setBackground(new java.awt.Color(255, 255, 255));
        txtMobile.setForeground(new java.awt.Color(0, 0, 0));
        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobileKeyTyped(evt);
            }
        });

        labelID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        labelID.setForeground(new java.awt.Color(255, 255, 255));
        labelID.setText("Student ID");

        labelName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Name");

        labelBirthdate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        labelBirthdate.setForeground(new java.awt.Color(255, 255, 255));
        labelBirthdate.setText("Birth Date");

        labelGender.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        labelGender.setForeground(new java.awt.Color(255, 255, 255));
        labelGender.setText("Gender");

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("Email Address");

        labelMobile.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        labelMobile.setForeground(new java.awt.Color(255, 255, 255));
        labelMobile.setText("Mobile Number");

        labelBranch.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        labelBranch.setForeground(new java.awt.Color(255, 255, 255));
        labelBranch.setText("Branch");

        labelProgram.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        labelProgram.setForeground(new java.awt.Color(255, 255, 255));
        labelProgram.setText("Program");

        labelStatus.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setText("Status");

        btnEdit.setBackground(new java.awt.Color(51, 70, 103));
        btnEdit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAddNew.setBackground(new java.awt.Color(51, 70, 103));
        btnAddNew.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAddNew.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(51, 70, 103));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 70, 103));
        btnClear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(51, 70, 103));
        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 70, 103));
        btnUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectGender, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(labelBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(labelProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labelMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMobile))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chooseBday, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseBday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit)
                        .addComponent(btnAddNew)
                        .addComponent(btnClear)
                        .addComponent(btnExit)
                        .addComponent(btnDelete))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        jPanel5.setBackground(new java.awt.Color(64, 121, 192));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(22, 72, 143), 5, true));

        labelSearchStudent.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        labelSearchStudent.setForeground(new java.awt.Color(255, 255, 255));
        labelSearchStudent.setText("Search Student");

        txtSearchBar.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchBar.setForeground(new java.awt.Color(0, 0, 0));
        txtSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBarActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(51, 70, 103));
        btnSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(51, 70, 103));
        btnRefresh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Birth Date", "Gender", "Email", "Mobile", "Branch", "Program", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelSearchStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchBar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtSearchBar)
                    .addComponent(labelSearchStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void init(){
        tableViewStudent();
        studentList=dataManager.loadStudentData();
        populateTable();
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Clear existing rows

        // Create a custom cell renderer for the date column
        DefaultTableCellRenderer dateRenderer = new DefaultTableCellRenderer() {
            private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (value instanceof Date) {
                    value = dateFormat.format((Date) value);
                }
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        };
        jTable2.getColumnModel().getColumn(2).setCellRenderer(dateRenderer); // Assuming the date column is at index 2

        List<Student> studentList = dataManager.loadStudentData();
        for (Student student : studentList) {
            // Add student data to the table
            model.addRow(new Object[] {
                student.getId(),
                student.getName(),
                student.getBirthdate(),
                student.getGender(),
                student.getEmail(),
                student.getMobile(),
                student.getBranch(),
                student.getProgram(),
                student.getStatus()
            });
        }
    }
    private void tableViewStudent(){
        model=(DefaultTableModel) jTable2.getModel();
        jTable2.setRowHeight(30);
        jTable2.setShowGrid(true);
        jTable2.setGridColor(Color.black);
        jTable2.setBackground(Color.white);
    }
    private void clearStudent(){
    txtID.setText(null);
    txtName.setText(null);
    txtEmail.setText(null);
    txtMobile.setText(null);
    chooseBday.setDate(null);
    selectGender.setSelectedIndex(0);
    selectBranch.setSelectedIndex(0);
    selectProgram.setSelectedIndex(0);
    selectStatus.setSelectedIndex(0);
    jTable2.clearSelection();
    }
    public boolean isEmptyStudent(){
        if(txtID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input Student ID.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(!txtID.getText().matches("^[A-Z0-9]+$")){
            JOptionPane.showMessageDialog(this,"Invalid input. Student ID contains invalid characters.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtID.getText().length()>=7){
            JOptionPane.showMessageDialog(this,"Invalid input. Student ID is too long.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (txtID.getText().length() <6) {
        JOptionPane.showMessageDialog(this, "Invalid input. Student ID is too short.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input Student Name.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(!txtName.getText().matches("^[A-Za-z.\\s]+$")){
            JOptionPane.showMessageDialog(this,"Invalid input. Student Name contains invalid characters.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input Student Email Address.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!txtEmail.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            JOptionPane.showMessageDialog(this, "Invalid input. Student Email Address contains invalid characters.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if(txtMobile.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input Student Mobile Number.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtMobile.getText().length()>=12){
            JOptionPane.showMessageDialog(this,"Invalid input. Student Mobile Number is too long.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (txtMobile.getText().length() <11) {
        JOptionPane.showMessageDialog(this, "Invalid input. Student Mobile Number is too short.","Message",JOptionPane.WARNING_MESSAGE);
         return false;
        }
        if(!txtMobile.getText().matches("^[0-9]+$")){
            JOptionPane.showMessageDialog(this,"Invalid input. Student Mobile Number contains invalid characters.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(chooseBday.getDate()==null){
            JOptionPane.showMessageDialog(this,"Please input Student Birth Date.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (chooseBday.getDate().compareTo(new Date()) > 0) {
        JOptionPane.showMessageDialog(this, "Invalid input. Student Birth Date exceeding current date are not allowed.","Message",JOptionPane.WARNING_MESSAGE);
        return false;
        }
        return true;
    }
    private void selectStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectStatusActionPerformed

    private void txtSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBarActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?","Message",JOptionPane.YES_NO_OPTION);
        if(a==0){
            this.dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i=0.1; i<=1.0; i+=0.1){
            String s=1+"";
            float f=Float.valueOf(s);
            this.setOpacity(f);
            try{
                Thread.sleep(40);
            }catch (InterruptedException ex){
                Logger.getLogger(DisplayFrame.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this,"Are you sure you want to clear all input fields?","Message",JOptionPane.YES_NO_OPTION );
        if(choice==JOptionPane.YES_OPTION){
        clearStudent();
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        // TODO add your handling code here:
        if(isEmptyStudent()){
        String sID=txtID.getText();
        String sName=txtName.getText();
        String sEmail=txtEmail.getText();
        String sMobile=txtMobile.getText();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date sBirthdate=chooseBday.getDate();
        String sGender=selectGender.getSelectedItem().toString();
        String sBranch=selectBranch.getSelectedItem().toString();
        String sProgram=selectProgram.getSelectedItem().toString();
        String sStatus=selectStatus.getSelectedItem().toString();
        
        if(isDuplicateEntry(sID, sName, sEmail, sMobile)){
        JOptionPane.showMessageDialog(this, "The provided Student Information already exists.", "Message",JOptionPane.WARNING_MESSAGE);
        }else{
        Student newStudent = new Student(sID, sName, sEmail, sMobile, sBirthdate, sGender, sBranch, sProgram, sStatus);
        
        model.addRow(new Object[] {
            newStudent.getId(),
            newStudent.getName(),
            dateFormat.format(newStudent.getBirthdate()),
            newStudent.getGender(),
            newStudent.getEmail(),
            newStudent.getMobile(),
            newStudent.getBranch(),
            newStudent.getProgram(),
            newStudent.getStatus()
        });
        clearStudent();
        studentList.add(newStudent);
        dataManager.saveStudentData(studentList);
        JOptionPane.showMessageDialog(this, "Student successfully added!","Message",JOptionPane.INFORMATION_MESSAGE);
        }     
    }//GEN-LAST:event_btnAddNewActionPerformed
 }
    private boolean isDuplicateEntry(String sID, String sName, String sEmail, String sMobile){
        for(Student student:studentList){
            if (sID.equals(student.getId()) || sName.equals(student.getName()) || sEmail.equals(student.getEmail()) || sMobile.equals(student.getMobile())){
            return true;
            }
        }
        return false;
    }
    private void txtMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
    }//GEN-LAST:event_txtMobileKeyTyped
    private int selectRowIndex = -1;
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        selectRowIndex = jTable2.getSelectedRow();

    if (selectRowIndex != -1) { // Check if a row is selected
        // Get data from the selected row and populate input fields
        txtID.setText(jTable2.getValueAt(selectRowIndex, 0).toString());
        txtName.setText(jTable2.getValueAt(selectRowIndex, 1).toString());
        chooseBday.setDate((Date) jTable2.getValueAt(selectRowIndex, 2)); // For date input field
        selectGender.setSelectedItem(jTable2.getValueAt(selectRowIndex, 3)); // For gender input field
        txtEmail.setText(jTable2.getValueAt(selectRowIndex, 4).toString());
        txtMobile.setText(jTable2.getValueAt(selectRowIndex, 5).toString());
        selectBranch.setSelectedItem(jTable2.getValueAt(selectRowIndex, 6)); // For branch input field
        selectProgram.setSelectedItem(jTable2.getValueAt(selectRowIndex, 7)); // For program input field
        selectStatus.setSelectedItem(jTable2.getValueAt(selectRowIndex, 8)); // For status input field
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
            int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1) {
            int confirmDelete = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this student?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (confirmDelete == JOptionPane.YES_OPTION) {
            // Delete the student from your data and table
                studentList.remove(selectedRow);
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.removeRow(selectedRow);

            // Method to save the updated data 
                dataManager.saveStudentData(studentList);

                JOptionPane.showMessageDialog(this, "Student deleted successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (selectRowIndex != -1) { // Check if a row is selected
        // Get the edited data from input fields
        String editedID = txtID.getText();
        String editedName = txtName.getText();
        java.util.Date editedBirthdate = chooseBday.getDate();
        String editedGender = selectGender.getSelectedItem().toString();
        String editedEmail = txtEmail.getText();
        String editedMobile = txtMobile.getText();
        String editedBranch = selectBranch.getSelectedItem().toString();
        String editedProgram = selectProgram.getSelectedItem().toString();
        String editedStatus = selectStatus.getSelectedItem().toString();
       
        if (isDuplicateEntry(selectRowIndex, editedID, editedName, editedEmail, editedMobile)) {
            JOptionPane.showMessageDialog(this, "The provided student information already exists.", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (!isValidInput(editedID, editedName, editedBirthdate, editedEmail, editedMobile)) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please check the inputted data.","Message",JOptionPane.WARNING_MESSAGE);
        } else {
        // Update the data in your studentList with the edited data
        Student editedStudent = studentList.get(selectRowIndex);
        editedStudent.setId(editedID);
        editedStudent.setName(editedName);
        editedStudent.setBirthdate(editedBirthdate);
        editedStudent.setGender(editedGender);
        editedStudent.setEmail(editedEmail);
        editedStudent.setMobile(editedMobile);
        editedStudent.setBranch(editedBranch);
        editedStudent.setProgram(editedProgram);
        editedStudent.setStatus(editedStatus);

        // Update the corresponding row in jTable2
        jTable2.setValueAt(editedID, selectRowIndex, 0);
        jTable2.setValueAt(editedName, selectRowIndex, 1);
        jTable2.setValueAt(editedBirthdate, selectRowIndex, 2);
        jTable2.setValueAt(editedGender, selectRowIndex, 3);
        jTable2.setValueAt(editedEmail, selectRowIndex, 4);
        jTable2.setValueAt(editedMobile, selectRowIndex, 5);
        jTable2.setValueAt(editedBranch, selectRowIndex, 6);
        jTable2.setValueAt(editedProgram, selectRowIndex, 7);
        jTable2.setValueAt(editedStatus, selectRowIndex, 8);

        selectRowIndex = -1;
        clearStudent();
        JOptionPane.showMessageDialog(this, "Changes have been successfully made.", "Messaage",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchText = txtSearchBar.getText(); // Get the search text from the text field

        if (searchText != null && !searchText.isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            jTable2.setRowSorter(sorter);

            // RowFilter to filter the table data
            RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter("(?i)" + searchText);
            sorter.setRowFilter(rf);

            if (jTable2.getRowCount() > 0) {
                JOptionPane.showMessageDialog(this, "Student Information exists.", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Student Information does not exist.", "Message", JOptionPane.WARNING_MESSAGE);
            }
            jTable2.setRowSorter(null);
        }   
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        // Create a comparator to sort rows based on ID
        StudentIdComparator idComparator = new StudentIdComparator(model);

        // Create an array of indices for the rows
        Integer[] indices = new Integer[model.getRowCount()];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }
        // Sort the indices array based on the ID comparator
        Arrays.sort(indices, idComparator);

        // Create a new data array to store the sorted rows
        Object[][] sortedData = new Object[model.getRowCount()][model.getColumnCount()];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                sortedData[i][j] = model.getValueAt(indices[i], j);
            }
        }
        // Remove all rows from the table
        model.setRowCount(0);

        // Add the sorted rows back to the table
        for (Object[] row : sortedData) {
            model.addRow(row);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed
    private boolean isDuplicateEntry(int rowIndex, String editedID, String editedName, String editedEmail, String editedMobile) {
            Student editedStudent = studentList.get(rowIndex); // Get the student you're currently editing

        for (int i = 0; i < studentList.size(); i++) {
            if (i != selectRowIndex) {
                Student student = studentList.get(i);

                // Check if the edited data matches any other student's information
                if (editedID.equals(student.getId()) && !editedID.equals(editedStudent.getId())) {
                    return true;
                }
                if (editedName.equals(student.getName()) && !editedName.equals(editedStudent.getName())) {
                    return true;
                }
                if (editedEmail.equals(student.getEmail()) && !editedEmail.equals(editedStudent.getEmail())) {
                    return true;
                }
                if (editedMobile.equals(student.getMobile()) && !editedMobile.equals(editedStudent.getMobile())) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isValidInput(String editedID, String editedName, java.util.Date editedBirthdate, String editedEmail, String editedMobile) {
        if(editedID.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input Student ID.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(!editedID.matches("^[A-Z0-9]+$")){
            JOptionPane.showMessageDialog(this,"Invalid input. Student ID contains invalid characters.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(editedID.length()>=7){
            JOptionPane.showMessageDialog(this,"Invalid input. Student ID is too long.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (editedID.length() <6) {
        JOptionPane.showMessageDialog(this, "Invalid input. Student ID is too short.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(editedName.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input Student Name.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(!editedName.matches("^[A-Za-z.\\s]+$")){
            JOptionPane.showMessageDialog(this,"Invalid input. Student Name contains invalid characters.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(editedEmail.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input Student Email Address.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!editedEmail.matches("^[A-Za-z0-9._@]+$")) {
            JOptionPane.showMessageDialog(this, "Invalid input. Student Email Address is not valid.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if(editedMobile.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please input Student Mobile Number.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(editedMobile.length()>=12){
            JOptionPane.showMessageDialog(this,"Invalid input. Student Mobile Number is too long.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (editedMobile.length() <11) {
        JOptionPane.showMessageDialog(this, "Invalid input. Student Mobile Number is too short.","Message",JOptionPane.WARNING_MESSAGE);
         return false;
        }
        if(!editedMobile.matches("^[0-9]+$")){
            JOptionPane.showMessageDialog(this,"Invalid input. Student Mobile Number contains invalid characters.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(editedBirthdate==null){
            JOptionPane.showMessageDialog(this,"Please input Student Birth Date.","Message",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (editedBirthdate.compareTo(new java.util.Date()) > 0) {
        JOptionPane.showMessageDialog(this, "Invalid input. Student Birth Date exceeding current date is not allowed.", "Message", JOptionPane.WARNING_MESSAGE);
        return false;
        }
        return true;
}
    

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
            java.util.logging.Logger.getLogger(DisplayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayFrame().setVisible(true);
            }
        });
    }
    private void setIconImage() {
        ImageIcon icon = new ImageIcon(getClass().getResource("resizeRGO_LOGO.png"));
        setIconImage(icon.getImage());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser chooseBday;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelBirthdate;
    private javax.swing.JLabel labelBranch;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelMobile;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelProgram;
    private javax.swing.JLabel labelSearchStudent;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JComboBox<String> selectBranch;
    private javax.swing.JComboBox<String> selectGender;
    private javax.swing.JComboBox<String> selectProgram;
    private javax.swing.JComboBox<String> selectStatus;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables

}
