package Panel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
import Koneksi.koneksi;
import Utama.frm_utama;
import javax.swing.*;
import java.sql.*;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author zabdu
 */
public class panel_client extends javax.swing.JPanel {
    koneksi dbsetting;
    String driver,database,user,pass,role;
    Object tabel;
    /**
     * Creates new form pn_client
     */
    public panel_client() {
        initComponents();
        dbsetting = new koneksi();
        driver = dbsetting.SettingPanel("DBDriver");
        database = dbsetting.SettingPanel("DBDatabase");
        user = dbsetting.SettingPanel("DBUsername");
        pass = dbsetting.SettingPanel("DBPassword");
        tabel_client.setModel(tableModel);
        btn_hapus.setVisible(false);
        btn_edit.setVisible(false);
        settableload();
    }
    private javax.swing.table.DefaultTableModel tableModel = getDefaultTableModel();
    private javax.swing.table.DefaultTableModel getDefaultTableModel(){
        return new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"ID","NAMA","NO_TELP", "ALAMAT"}
        )
        {
            boolean[] canEdit = new boolean[]{
                false,false,false,false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit[columnIndex];
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        dataClient = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_client = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new rojerusan.RSMaterialButtonRectangle();
        btn_hapus = new rojerusan.RSMaterialButtonRectangle();
        btn_edit = new rojerusan.RSMaterialButtonRectangle();
        txt_cari_client = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        addClient = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_tambah_client = new rojerusan.RSMaterialButtonRectangle();
        btn_batal_client = new rojerusan.RSMaterialButtonRectangle();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_nama_client = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_alamat_client = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txt_notelpon_client = new javax.swing.JTextField();
        editClient = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_simpan_client_edit = new rojerusan.RSMaterialButtonRectangle();
        btn_batal_client_edit = new rojerusan.RSMaterialButtonRectangle();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_nama_client_edit = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_alamat_client_edit = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_notelpon_client_edit = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(909, 581));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataClient.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(453, 403));

        tabel_client.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_clientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_client);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DATA CLIENT");

        btn_tambah.setText("TAMBAH");
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(255, 51, 51));
        btn_hapus.setText("Hapus");
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(255, 153, 51));
        btn_edit.setText("Edit");
        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        txt_cari_client.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cari_clientKeyReleased(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_search_1.png"))); // NOI18N

        javax.swing.GroupLayout dataClientLayout = new javax.swing.GroupLayout(dataClient);
        dataClient.setLayout(dataClientLayout);
        dataClientLayout.setHorizontalGroup(
            dataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataClientLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataClientLayout.createSequentialGroup()
                        .addGroup(dataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dataClientLayout.createSequentialGroup()
                                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(dataClientLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(73, 725, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataClientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_cari_client, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        dataClientLayout.setVerticalGroup(
            dataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataClientLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(dataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(dataClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_cari_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        mainPanel.add(dataClient, "card2");

        addClient.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("TAMBAH CLIENT");

        btn_tambah_client.setText("Tambah");
        btn_tambah_client.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_tambah_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_clientActionPerformed(evt);
            }
        });

        btn_batal_client.setBackground(new java.awt.Color(255, 153, 51));
        btn_batal_client.setText("Batal");
        btn_batal_client.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_batal_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal_clientActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nama Lengkap");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Alamat");

        txt_alamat_client.setColumns(20);
        txt_alamat_client.setRows(5);
        jScrollPane2.setViewportView(txt_alamat_client);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("No Telpon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2)
                    .addComponent(txt_notelpon_client, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addComponent(txt_nama_client))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nama_client, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_notelpon_client, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addClientLayout = new javax.swing.GroupLayout(addClient);
        addClient.setLayout(addClientLayout);
        addClientLayout.setHorizontalGroup(
            addClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addClientLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(addClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(addClientLayout.createSequentialGroup()
                        .addComponent(btn_tambah_client, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_batal_client, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        addClientLayout.setVerticalGroup(
            addClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addClientLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(addClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah_client, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal_client, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        mainPanel.add(addClient, "card3");

        editClient.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("EDIT DATA CLIENT");

        btn_simpan_client_edit.setText("Simpan");
        btn_simpan_client_edit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_simpan_client_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpan_client_editActionPerformed(evt);
            }
        });

        btn_batal_client_edit.setBackground(new java.awt.Color(255, 153, 51));
        btn_batal_client_edit.setText("Batal");
        btn_batal_client_edit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_batal_client_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal_client_editActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Nama Lengkap");

        txt_alamat_client_edit.setColumns(20);
        txt_alamat_client_edit.setRows(5);
        jScrollPane3.setViewportView(txt_alamat_client_edit);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Alamat");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("No Telpon");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(txt_notelpon_client_edit)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(363, 363, 363))
                    .addComponent(txt_nama_client_edit))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nama_client_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_notelpon_client_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editClientLayout = new javax.swing.GroupLayout(editClient);
        editClient.setLayout(editClientLayout);
        editClientLayout.setHorizontalGroup(
            editClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editClientLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(editClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editClientLayout.createSequentialGroup()
                        .addComponent(btn_simpan_client_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batal_client_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        editClientLayout.setVerticalGroup(
            editClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editClientLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addGroup(editClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan_client_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal_client_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        mainPanel.add(editClient, "card4");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    public void membersihkan_teks(){
        txt_nama_client.setText("");
        txt_alamat_client.setText("");
        txt_notelpon_client.setText("");
    }
    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(addClient);
        mainPanel.repaint();
        mainPanel.revalidate();
        
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        try {
            // Custom message and button text
            String message = "Are you sure you want to take Delete this Client?";
            Object[] options = {"Yes, Delete it", "No, Don't Delete"};
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database,user,pass);
            Statement stt = kon.createStatement();
            String SQL = "UPDATE `client` SET `STATUS` = 0 WHERE ID = '"+tableModel.getValueAt(row, 0).toString()+"';";
            int choice = JOptionPane.showOptionDialog(null, message, "Delete Action", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            if (choice == JOptionPane.YES_OPTION) {
                stt.executeUpdate(SQL);
                tableModel.removeRow(row);
                stt.close();
                kon.close();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                btn_hapus.setVisible(false);
                btn_edit.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Canceled");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        txt_nama_client_edit.setText(tableModel.getValueAt(row, 1).toString());
        txt_notelpon_client_edit.setText(tableModel.getValueAt(row, 2).toString());
        txt_alamat_client_edit.setText(tableModel.getValueAt(row, 3).toString());
        mainPanel.removeAll();
        mainPanel.add(editClient);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_tambah_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_clientActionPerformed
        // TODO add your handling code here:
        String data[] = new String[4];
        if ((txt_nama_client.getText().isEmpty()) || txt_notelpon_client.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            txt_nama_client.requestFocus();
        } else {
            try {
                Class.forName(driver);
                Connection kon = DriverManager.getConnection(database,user,pass);
                Statement stt = kon.createStatement();
                String SQL1 = "SELECT * FROM client WHERE NAMA = '"+txt_nama_client.getText()+"' AND STATUS = '1'";
                String message = "Are you sure yo want to add Client data?";
                Object[] options = {"Yes, add Client Data","No, don't add client data"};
                int choice = JOptionPane.showOptionDialog(null, message, "Add Client Action", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                if (choice == JOptionPane.YES_OPTION) {
                    ResultSet rs1 = stt.executeQuery(SQL1);
                    if (rs1.next()){
                        JOptionPane.showConfirmDialog(null, "Nama sudah terdaftar");
                    } else {
                        String SQL2 = "SELECT COUNT(*) FROM client";
                        ResultSet countrs = stt.executeQuery(SQL2);
                        countrs.next();
                        int rowCount = countrs.getInt(1);
                        countrs.close();
                        // Generate the ID with leading zeros
                        DecimalFormat idFormat = new DecimalFormat("000");
                        String newID = "CL" + idFormat.format(rowCount + 1);
                        String SQL = "INSERT INTO client(ID,NAMA,NO_TELP,ALAMAT) VALUES('"
                                +newID+"','"
                                +txt_nama_client.getText()+"','"
                                +txt_notelpon_client.getText()+"','"
                                +txt_alamat_client.getText()+"')";
                        stt.executeUpdate(SQL);
                        data[0] = newID;
                        data[1] = txt_nama_client.getText();
                        data[2] = txt_notelpon_client.getText();
                        data[3] = txt_alamat_client.getText();
                        int tableRowLast = tableModel.getRowCount();
                        tableModel.insertRow(tableRowLast, data);
                        JOptionPane.showMessageDialog(null, "Data Client Berhasil dimasukan");
                        stt.close();
                        kon.close();
                        mainPanel.removeAll();
                        mainPanel.add(dataClient);
                        mainPanel.repaint();
                        mainPanel.revalidate();
                        membersihkan_teks();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Canceled");
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_tambah_clientActionPerformed

    private void btn_batal_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal_clientActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(dataClient);
        mainPanel.repaint();
        mainPanel.revalidate();
        membersihkan_teks();
    }//GEN-LAST:event_btn_batal_clientActionPerformed

    private void tabel_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_clientMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==1 && "ADMIN".equals(frm_utama.role)) {
            btn_hapus.setVisible(true);
            btn_edit.setVisible(true);
            if (tabel_client.getRowSorter() != null) {
                row = tabel_client.convertRowIndexToModel(tabel_client.getSelectedRow());
            } else {
                row = tabel_client.getSelectedRow();
            }
        }
    }//GEN-LAST:event_tabel_clientMouseClicked

    private void btn_simpan_client_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpan_client_editActionPerformed
        // TODO add your handling code here:
        String id = tableModel.getValueAt(row, 0).toString();
        String nama = txt_nama_client_edit.getText();
        String alamat = txt_alamat_client_edit.getText();
        String notelp = txt_notelpon_client_edit.getText();
        if ((txt_nama_client_edit.getText().isEmpty()) || (txt_notelpon_client_edit.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
            txt_nama_client_edit.requestFocus();
        } else {
            try {
                String message = "Are you sure you want to change this data?";
                Object[] options = {"Yes, change it","No, don't change"};
                Class.forName(driver);
                Connection kon = DriverManager.getConnection(database,user,pass);
                Statement stt = kon.createStatement();
                String SQL = "UPDATE client SET "
                        +"NAMA = '"+nama+"',"
                        +"NO_TELP = '"+notelp+"',"
                        +"ALAMAT = '"+alamat+"' "
                        +"WHERE `ID` = '"+id+"'";
                int choice = JOptionPane.showOptionDialog(null, message, "Change Data", JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                if (choice == JOptionPane.YES_OPTION) {
                    stt.executeUpdate(SQL);
                    data[0] = id;
                    data[1] = nama;                
                    data[2] = notelp;  
                    data[3] = alamat;
                    tableModel.removeRow(row);
                    tableModel.insertRow(row, data);
                    stt.close();
                    kon.close();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
                    membersihkan_teks();
                    mainPanel.removeAll();
                    mainPanel.add(dataClient);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                } else {
                    JOptionPane.showMessageDialog(null, "Canceled");
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_simpan_client_editActionPerformed

    private void btn_batal_client_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal_client_editActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(dataClient);
        mainPanel.repaint();
        mainPanel.revalidate();
        membersihkan_teks();
    }//GEN-LAST:event_btn_batal_client_editActionPerformed

    private void txt_cari_clientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cari_clientKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tabel_client.getModel();
        String search = txt_cari_client.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tabel_client.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
    }//GEN-LAST:event_txt_cari_clientKeyReleased

    int row = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addClient;
    private rojerusan.RSMaterialButtonRectangle btn_batal_client;
    private rojerusan.RSMaterialButtonRectangle btn_batal_client_edit;
    private rojerusan.RSMaterialButtonRectangle btn_edit;
    private rojerusan.RSMaterialButtonRectangle btn_hapus;
    private rojerusan.RSMaterialButtonRectangle btn_simpan_client_edit;
    private rojerusan.RSMaterialButtonRectangle btn_tambah;
    private rojerusan.RSMaterialButtonRectangle btn_tambah_client;
    private javax.swing.JPanel dataClient;
    private javax.swing.JPanel editClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tabel_client;
    private javax.swing.JTextArea txt_alamat_client;
    private javax.swing.JTextArea txt_alamat_client_edit;
    private javax.swing.JTextField txt_cari_client;
    private javax.swing.JTextField txt_nama_client;
    private javax.swing.JTextField txt_nama_client_edit;
    private javax.swing.JTextField txt_notelpon_client;
    private javax.swing.JTextField txt_notelpon_client_edit;
    // End of variables declaration//GEN-END:variables
    String data[] = new String[4];
    private void settableload() {
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database,user,pass);
            Statement stt = kon.createStatement();
            String SQL = "SELECT * from client WHERE STATUS=1";
            ResultSet res = stt.executeQuery(SQL);
            while(res.next()){
                data[0] = res.getString(1);                
                data[1] = res.getString(2);
                data[2] = res.getString(3);              
                data[3] = res.getString(4);
                tableModel.addRow(data);
            }
            res.close();
            stt.close();
            kon.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}
