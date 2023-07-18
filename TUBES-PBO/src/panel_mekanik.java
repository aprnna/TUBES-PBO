/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Leily
 */
public class panel_mekanik extends javax.swing.JPanel {
    koneksi dbsetting;
    String driver,database,user,pass;
    Object tabel;
    /**
     * Creates new form panel_mekanik
     */
    public panel_mekanik() {
        initComponents();
        dbsetting = new koneksi();
        driver = dbsetting.SettingPanel("DBDriver");
        database = dbsetting.SettingPanel("DBDatabase");
        user = dbsetting.SettingPanel("DBUsername");
        pass = dbsetting.SettingPanel("DBPassword");
        tabel_mekanik.setModel(tableModel);
        settableload();
    }
    private javax.swing.table.DefaultTableModel tableModel = getDefaultTableModel();
    private javax.swing.table.DefaultTableModel getDefaultTableModel(){
        return new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"NAMA", "NO TELP", "ALAMAT"}
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
        dataMekanik = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_mekanik = new javax.swing.JTable();
        txt_search_mekanik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_hapus = new rojerusan.RSMaterialButtonRectangle();
        btn_edit = new rojerusan.RSMaterialButtonRectangle();
        btn_tambah = new rojerusan.RSMaterialButtonRectangle();
        addMekanik = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_batal = new rojerusan.RSMaterialButtonRectangle();
        btn_simpan = new rojerusan.RSMaterialButtonRectangle();
        jLabel5 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_notelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();

        setLayout(new java.awt.CardLayout());

        mainPanel.setPreferredSize(new java.awt.Dimension(750, 750));
        mainPanel.setLayout(new java.awt.CardLayout());

        dataMekanik.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DATA MEKANIK");

        tabel_mekanik.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabel_mekanik.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_mekanik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_mekanikMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_mekanik);

        txt_search_mekanik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_mekanikKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_search_1.png"))); // NOI18N

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

        btn_tambah.setText("Tambah ");
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataMekanikLayout = new javax.swing.GroupLayout(dataMekanik);
        dataMekanik.setLayout(dataMekanikLayout);
        dataMekanikLayout.setHorizontalGroup(
            dataMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataMekanikLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dataMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataMekanikLayout.createSequentialGroup()
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dataMekanikLayout.createSequentialGroup()
                        .addGroup(dataMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataMekanikLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataMekanikLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txt_search_mekanik, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        dataMekanikLayout.setVerticalGroup(
            dataMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataMekanikLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(dataMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(dataMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_search_mekanik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(dataMekanik, "card2");

        addMekanik.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("DATA MEKANIK");

        btn_batal.setBackground(new java.awt.Color(255, 153, 0));
        btn_batal.setText("Batal");
        btn_batal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_simpan.setText("Simpan");
        btn_simpan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nama");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("No Telp");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Alamat");

        txt_alamat.setColumns(20);
        txt_alamat.setRows(5);
        jScrollPane.setViewportView(txt_alamat);

        javax.swing.GroupLayout addMekanikLayout = new javax.swing.GroupLayout(addMekanik);
        addMekanik.setLayout(addMekanikLayout);
        addMekanikLayout.setHorizontalGroup(
            addMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMekanikLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(addMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addMekanikLayout.createSequentialGroup()
                        .addGroup(addMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addMekanikLayout.createSequentialGroup()
                                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addContainerGap(585, Short.MAX_VALUE))
                    .addGroup(addMekanikLayout.createSequentialGroup()
                        .addGroup(addMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(txt_nama)
                            .addComponent(txt_notelp, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        addMekanikLayout.setVerticalGroup(
            addMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMekanikLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(addMekanikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_notelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        mainPanel.add(addMekanik, "card2");

        add(mainPanel, "card4");
    }// </editor-fold>//GEN-END:initComponents
    int row = 0;
    private void txt_search_mekanikKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_mekanikKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tabel_mekanik.getModel();
        String search = txt_search_mekanik.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        tabel_mekanik.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
        if(search.length()>=0){
            btn_hapus.setVisible(false);
            btn_edit.setVisible(false);
        }
    }//GEN-LAST:event_txt_search_mekanikKeyReleased
    public void membersihkan_text(){
        txt_nama.setText("");
        txt_alamat.setText("");
        txt_notelp.setText("");
    }
    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:1
        mainPanel.removeAll();
        mainPanel.add(addMekanik);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void tabel_mekanikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_mekanikMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==1) {
            btn_hapus.setVisible(true);
            btn_edit.setVisible(true);
            if (tabel_mekanik.getRowSorter() != null) {
                row = tabel_mekanik.convertRowIndexToModel(tabel_mekanik.getSelectedRow());
            } else {
                row = tabel_mekanik.getSelectedRow();
            }
        }
    }//GEN-LAST:event_tabel_mekanikMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(dataMekanik);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String data[]=new String[3];
        if((txt_nama.getText().isEmpty()) || (txt_alamat.getText().isEmpty())){ 
            JOptionPane.showMessageDialog(null,"Data tidak boleh kosong");
            txt_nama.requestFocus();
        }else{
            try {
                Class.forName(driver);
                Connection kon = DriverManager.getConnection(database,user,pass);
                Statement stt = kon.createStatement();
                String SQL = "INSERT INTO users(NAMA,UMUR,ALAMAT,NO_TELP,USERNAME,PASSWORD) VALUES('"+txt_nama.getText()
                                                                                    +"','"+txt_alamat.getText()
                                                                                    +"','"+txt_notelp.getText()+"')";
                stt.executeUpdate(SQL);
                data[0] = txt_nama.getText();                
                data[1] = txt_alamat.getText();
                data[2] = txt_notelp.getText();  
                tableModel.insertRow(0, data);
                stt.close();
                kon.close();
                mainPanel.removeAll();
                mainPanel.add(dataMekanik);
                mainPanel.repaint();
                mainPanel.revalidate();
                membersihkan_text();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() ,"ERROR",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_simpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addMekanik;
    private rojerusan.RSMaterialButtonRectangle btn_batal;
    private rojerusan.RSMaterialButtonRectangle btn_edit;
    private rojerusan.RSMaterialButtonRectangle btn_hapus;
    private rojerusan.RSMaterialButtonRectangle btn_simpan;
    private rojerusan.RSMaterialButtonRectangle btn_tambah;
    private javax.swing.JPanel dataMekanik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tabel_mekanik;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_notelp;
    private javax.swing.JTextField txt_search_mekanik;
    // End of variables declaration//GEN-END:variables
    String data[] = new String[3];
    private void settableload() {
        String stat = "";
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database,user,pass);
            Statement stt = kon.createStatement();
            String SQL = "SELECT * from mekanik";
            ResultSet res = stt.executeQuery(SQL);
            while(res.next()){
                data[0] = res.getString(2);                
                data[1] = res.getString(3);
                data[2] = res.getString(4);
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