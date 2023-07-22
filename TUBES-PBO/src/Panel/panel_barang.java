package Panel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import Koneksi.koneksi;
import javax.swing.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Leily
 */
public class panel_barang extends javax.swing.JPanel {
    koneksi dbsetting;
    String driver,database,user,pass;
    Object tabel;
    /**
     * Creates new form frm_barang
     */
    public panel_barang() {
        initComponents();
        dbsetting = new koneksi();
        driver = dbsetting.SettingPanel("DBDriver");
        database = dbsetting.SettingPanel("DBDatabase");
        user = dbsetting.SettingPanel("DBUsername");
        pass = dbsetting.SettingPanel("DBPassword");
        
        tabel_barang.setModel(tableModel);
        btn_hapus.setVisible(false);
        btn_edit.setVisible(false);
        
        settableload();
    }
    private javax.swing.table.DefaultTableModel tableModel = getDefaultTableModel();
    private javax.swing.table.DefaultTableModel getDefaultTableModel(){
        return new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"ID","NAMA BARANG", "JUMLAH BARANG","LOKASI","HARGA"}
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
        dataBarang = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_barang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new rojerusan.RSMaterialButtonRectangle();
        btn_hapus = new rojerusan.RSMaterialButtonRectangle();
        btn_edit = new rojerusan.RSMaterialButtonRectangle();
        txt_search_barang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addBarang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_simpan = new rojerusan.RSMaterialButtonRectangle();
        btn_batal = new rojerusan.RSMaterialButtonRectangle();
        jtextfield = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_nama1 = new javax.swing.JLabel();
        txt_nama2 = new javax.swing.JLabel();
        txt_lokasi = new javax.swing.JTextField();
        editBarang = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_simpan_edit = new rojerusan.RSMaterialButtonRectangle();
        btn_batal_edit = new rojerusan.RSMaterialButtonRectangle();
        jtextfield1 = new javax.swing.JLabel();
        txt_nama_edit = new javax.swing.JTextField();
        txt_harga_edit = new javax.swing.JTextField();
        txt_nama4 = new javax.swing.JLabel();
        txt_nama5 = new javax.swing.JLabel();
        txt_lokasi_edit = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataBarang.setBackground(new java.awt.Color(255, 255, 255));

        tabel_barang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabel_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_barang);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DATA BARANG");

        btn_tambah.setText("Tambah ");
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(255, 0, 51));
        btn_hapus.setText("HAPUS");
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(255, 153, 0));
        btn_edit.setText("Edit");
        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        txt_search_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_barangKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_search_1.png"))); // NOI18N

        javax.swing.GroupLayout dataBarangLayout = new javax.swing.GroupLayout(dataBarang);
        dataBarang.setLayout(dataBarangLayout);
        dataBarangLayout.setHorizontalGroup(
            dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBarangLayout.createSequentialGroup()
                .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataBarangLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_search_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(dataBarangLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                            .addGroup(dataBarangLayout.createSequentialGroup()
                                .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(dataBarangLayout.createSequentialGroup()
                                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        dataBarangLayout.setVerticalGroup(
            dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBarangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_search_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(48, 48, 48))
        );

        mainPanel.add(dataBarang, "card9");

        addBarang.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("TAMBAH BARANG");

        btn_simpan.setText("Tambah");
        btn_simpan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 153, 0));
        btn_batal.setText("Batal");
        btn_batal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jtextfield.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtextfield.setText("NAMA BARANG");

        txt_harga.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txt_nama1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_nama1.setText("HARGA");

        txt_nama2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_nama2.setText("LOKASI BARANG");

        txt_lokasi.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        javax.swing.GroupLayout addBarangLayout = new javax.swing.GroupLayout(addBarang);
        addBarang.setLayout(addBarangLayout);
        addBarangLayout.setHorizontalGroup(
            addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBarangLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nama1)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextfield)
                    .addComponent(jLabel3)
                    .addGroup(addBarangLayout.createSequentialGroup()
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nama2)
                    .addComponent(txt_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(695, Short.MAX_VALUE))
        );
        addBarangLayout.setVerticalGroup(
            addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBarangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addGroup(addBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jtextfield)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nama1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nama2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        mainPanel.add(addBarang, "card9");

        editBarang.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("EDIT BARANG");

        btn_simpan_edit.setText("Simpan");
        btn_simpan_edit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_simpan_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpan_editActionPerformed(evt);
            }
        });

        btn_batal_edit.setBackground(new java.awt.Color(255, 153, 0));
        btn_batal_edit.setText("Batal");
        btn_batal_edit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_batal_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal_editActionPerformed(evt);
            }
        });

        jtextfield1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtextfield1.setText("NAMA BARANG");

        txt_harga_edit.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txt_nama4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_nama4.setText("HARGA");

        txt_nama5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_nama5.setText("LOKASI BARANG");

        txt_lokasi_edit.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        javax.swing.GroupLayout editBarangLayout = new javax.swing.GroupLayout(editBarang);
        editBarang.setLayout(editBarangLayout);
        editBarangLayout.setHorizontalGroup(
            editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBarangLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nama4)
                    .addComponent(txt_harga_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextfield1)
                    .addComponent(jLabel4)
                    .addGroup(editBarangLayout.createSequentialGroup()
                        .addComponent(btn_simpan_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batal_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_nama_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nama5)
                    .addComponent(txt_lokasi_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(695, Short.MAX_VALUE))
        );
        editBarangLayout.setVerticalGroup(
            editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editBarangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addGroup(editBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jtextfield1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nama_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nama4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_harga_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nama5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_lokasi_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        mainPanel.add(editBarang, "card9");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(addBarang);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database,user,pass);
            Statement stt = kon.createStatement();
            String SQL = "UPDATE `barang` SET"
            +"`status`= 0 WHERE ID='"+tableModel.getValueAt(row, 0).toString()+"';";
            String message = "Are you sure you want to delete this data?";
            Object options[] = {"Yes, delete it!","No, don't delete"};
            int choice = JOptionPane.showOptionDialog(null, message, "Delete data", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            if (choice == JOptionPane.YES_OPTION) {
                stt.executeUpdate(SQL);
                tableModel.removeRow(row);
                stt.close();
                kon.close();
                JOptionPane.showMessageDialog(null, "Data berhasil di Delete!");
                btn_hapus.setVisible(false);
                btn_edit.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Canceled");
            }
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        txt_nama_edit.setText(tableModel.getValueAt(row, 1).toString());
        txt_lokasi_edit.setText(tableModel.getValueAt(row, 3).toString());
        txt_harga_edit.setText(tableModel.getValueAt(row, 4).toString());
        mainPanel.removeAll();
        mainPanel.add(editBarang);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btn_editActionPerformed

    private void txt_search_barangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_barangKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tabel_barang.getModel();
        String search = txt_search_barang.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tabel_barang.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
        if(search.length()>=0){
            btn_hapus.setVisible(false);
            btn_edit.setVisible(false);
        }
    }//GEN-LAST:event_txt_search_barangKeyReleased
    int row = 0;
    private void tabel_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_barangMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==1) {
            btn_hapus.setVisible(true);
            btn_edit.setVisible(true);
            if (tabel_barang.getRowSorter() != null) {
                row = tabel_barang.convertRowIndexToModel(tabel_barang.getSelectedRow());
            } else {
                row = tabel_barang.getSelectedRow();
            }
        }
    }//GEN-LAST:event_tabel_barangMouseClicked

    public void membersihkan_text(){
        jtextfield.setText("");
        txt_harga.setText("");
    }
    
    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
         String data[]=new String[5];
        if((txt_nama.getText().isEmpty()) || (txt_harga.getText().isEmpty()) || (txt_lokasi.getText().isEmpty())){ 
            JOptionPane.showMessageDialog(null,"Data tidak boleh kosong");
            txt_nama.requestFocus();
        }else{
            try {
                Class.forName(driver);
                Connection kon = DriverManager.getConnection(database,user,pass);
                Statement stt = kon.createStatement();
                String message = "Are you sure you want to Add this data?";
                Object[] options = {"Yes, Add it","No, don't Add"};
                String SQL2 = "SELECT COUNT(*) FROM barang";
                ResultSet countrs = stt.executeQuery(SQL2);
                countrs.next();
                int rowCount = countrs.getInt(1);
                countrs.close();
                // Generate the ID with leading zeros
                DecimalFormat idFormat = new DecimalFormat("000");
                String newID = "BR" + idFormat.format(rowCount + 1);
                String SQL = "INSERT INTO barang(ID,NAMA,LOKASI,HARGA) VALUES('"+newID+"','"+txt_nama.getText()
                                                                        +"','"+txt_lokasi.getText()
                                                                        +"','"+txt_harga.getText()+"')";
                int choice = JOptionPane.showOptionDialog(null, message, "Adding data", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                if (choice == JOptionPane.YES_OPTION) {
                    stt.executeUpdate(SQL);
                    data[0] = newID;
                    data[1] = txt_nama.getText();  
                    data[2] = String.valueOf(0); 
                    data[3] = txt_lokasi.getText();
                    data[4] = txt_harga.getText();
                    int tableRowLast = tableModel.getRowCount();
                    tableModel.insertRow(tableRowLast, data);
                    stt.close();
                    kon.close();
                    JOptionPane.showMessageDialog(null, "Data berhasil ditambah");
                    mainPanel.removeAll();
                    mainPanel.add(dataBarang);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    membersihkan_text();     
                } else {
                    JOptionPane.showMessageDialog(null, "Canceled");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() ,"ERROR",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(dataBarang);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_simpan_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpan_editActionPerformed
        // TODO add your handling code here:
        String id = tableModel.getValueAt(row, 0).toString();
        String nama = txt_nama_edit.getText();
        String jumlah = tableModel.getValueAt(row, 2).toString();
        String lokasi = txt_lokasi_edit.getText();
        String harga = txt_harga_edit.getText();
        
        if((nama.isEmpty()) || (harga.isEmpty())){ 
            JOptionPane.showMessageDialog(null,"Data tidak boleh kosong");
            txt_nama_edit.requestFocus();
        }else{
            try {
                Class.forName(driver);
                Connection kon = DriverManager.getConnection(database,user,pass);
                Statement stt = kon.createStatement();
                String SQL = "UPDATE `barang` SET"
                                    +"`NAMA`='"+nama+"',"
                                    +"`LOKASI`='"+lokasi+"',"
                                    +"`HARGA`='"+harga+"'"
                                    +"WHERE `ID`='"+tableModel.getValueAt(row, 0).toString()+"';";
                String message = "Are you sure you want to change this data?";
                Object options [] = {"Yes. change it!","No, don't change"};
                int choice = JOptionPane.showOptionDialog(null , message, "Editing data",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                if (choice == JOptionPane.YES_OPTION) {
                    stt.executeUpdate(SQL);
                    data[0] = id;                
                    data[1] = nama;                
                    data[2] = jumlah;
                    data[3] = lokasi;  
                    data[4] = harga;
                    tableModel.removeRow(row);
                    tableModel.insertRow(row, data);
                    stt.close();
                    kon.close();
                    membersihkan_text();
                    JOptionPane.showMessageDialog(null, "Data berhasil di updtae");
                    mainPanel.removeAll();
                    mainPanel.add(dataBarang);
                    mainPanel.repaint();
                    mainPanel.revalidate();
                } else {
                    JOptionPane.showMessageDialog(null, "Canceled");
                }
            }catch(Exception ex){
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_simpan_editActionPerformed

    private void btn_batal_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal_editActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(dataBarang);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btn_batal_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBarang;
    private rojerusan.RSMaterialButtonRectangle btn_batal;
    private rojerusan.RSMaterialButtonRectangle btn_batal_edit;
    private rojerusan.RSMaterialButtonRectangle btn_edit;
    private rojerusan.RSMaterialButtonRectangle btn_hapus;
    private rojerusan.RSMaterialButtonRectangle btn_simpan;
    private rojerusan.RSMaterialButtonRectangle btn_simpan_edit;
    private rojerusan.RSMaterialButtonRectangle btn_tambah;
    private javax.swing.JPanel dataBarang;
    private javax.swing.JPanel editBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jtextfield;
    private javax.swing.JLabel jtextfield1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tabel_barang;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_harga_edit;
    private javax.swing.JTextField txt_lokasi;
    private javax.swing.JTextField txt_lokasi_edit;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JLabel txt_nama1;
    private javax.swing.JLabel txt_nama2;
    private javax.swing.JLabel txt_nama4;
    private javax.swing.JLabel txt_nama5;
    private javax.swing.JTextField txt_nama_edit;
    private javax.swing.JTextField txt_search_barang;
    // End of variables declaration//GEN-END:variables

    String data[] = new String[5];
    private void settableload() {
        String stat = "";
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database,user,pass);
            Statement stt = kon.createStatement();
            String SQL = "SELECT * from barang WHERE STATUS=1";
            ResultSet res = stt.executeQuery(SQL);
            while(res.next()){
                data[0] = res.getString(1);                
                data[1] = res.getString(2);
                data[2] = res.getString(3);
                data[3] = res.getString(4);
                data[4] = res.getString(5);
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
