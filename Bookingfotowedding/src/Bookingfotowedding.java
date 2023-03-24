/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ktyudha
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Bookingfotowedding extends javax.swing.JFrame {

    /**
     * Creates new form Bookingfotowedding
     */
    DefaultTableModel model; 
    public Bookingfotowedding() {
        initComponents();
        String [] judul = {"ID","Nama", "Alamat", "Detail Alamat", "Waktu", "Acara", "Paket"};
        model = new DefaultTableModel(judul,0);
        listBooking.setModel(model);
        tampilkan();
        valuePaket();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        dhagrafis = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelDetailAlamat = new javax.swing.JLabel();
        labelAcara = new javax.swing.JLabel();
        labelWaktu = new javax.swing.JLabel();
        labelPaket = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        location_id = new javax.swing.JTextField();
        waktu = new javax.swing.JTextField();
        detailalamat = new javax.swing.JTextField();
        category_id = new javax.swing.JTextField();
        pesan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listBooking = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        paket_id = new javax.swing.JComboBox<>();
        acara2 = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jColorChooser1.setBackground(new java.awt.Color(255, 153, 153));

        jColorChooser2.setBackground(new java.awt.Color(255, 51, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dhagrafis.setFont(new java.awt.Font("Jost", 1, 18)); // NOI18N
        dhagrafis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dhagrafis.setText("DHAGRAFIS");
        dhagrafis.setToolTipText("");
        dhagrafis.setAlignmentY(0.0F);

        labelName.setText("Nama");

        labelAlamat.setText("Alamat");

        labelDetailAlamat.setText("Detail Alamat");

        labelAcara.setText("Acara");

        labelWaktu.setText("Waktu");

        labelPaket.setText("Paket");

        pesan.setText("Pesan");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });

        listBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Alamat", "Detail Alamat", "Waktu", "Acara", "Paket"
            }
        ));
        jScrollPane2.setViewportView(listBooking);

        jLabel2.setText("List Booking");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        acara2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        acara2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acara2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jLabel2)
                            .addGap(962, 962, 962)
                            .addComponent(pesan))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAlamat)
                                    .addComponent(labelName)
                                    .addComponent(labelDetailAlamat)
                                    .addComponent(labelWaktu)
                                    .addComponent(labelAcara)
                                    .addComponent(labelPaket))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(category_id, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                    .addComponent(waktu)
                                    .addComponent(detailalamat)
                                    .addComponent(location_id)
                                    .addComponent(nama)
                                    .addComponent(paket_id, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acara2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(616, 616, 616)
                        .addComponent(dhagrafis)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(dhagrafis)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlamat)
                    .addComponent(location_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDetailAlamat)
                    .addComponent(detailalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWaktu)
                    .addComponent(waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAcara)
                    .addComponent(category_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acara2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPaket)
                    .addComponent(paket_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesan))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
       String namain = nama.getText();
       String locin = location_id.getText();
       String detin = detailalamat.getText();
       String waktuin = waktu.getText();
       String categin = category_id.getText();
       String paketin = (String) paket_id.getSelectedItem();
       int userin  = 1;
       int total   = 50000;
       
        try {
            // TODO add your handling code here:
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhagrafis","root","calonmertua2002");
          Statement s = conn.createStatement();
          
           String sql = "insert into pesanan (nama, location_id, detailalamat, waktu, category_id, paket_id, user_id, total)" + " values('"+namain+"','"+locin+"','"+detin+"','"+waktuin+"','"+categin+"','"+paketin+"','"+userin+"','"+total+"')";
           s.executeUpdate(sql);
           s.close();
           nama.setText("");
           location_id.setText("");
           detailalamat.setText("");
           waktu.setText("");
           category_id.setText("");
           paket_id.setSelectedItem("");
            ;
//            PreparedStatement preparedStmt = conn.prepareStatement(sql);
////                String isi = (String) paket_id.getSelectedItem();
//                preparedStmt.setString (1, nama.getText());
//                preparedStmt.setString (2, location_id.getText());
//                preparedStmt.setString (3, detailalamat.getText());
//                preparedStmt.setString (4, waktu.getText());
//                preparedStmt.setString (5, category_id.getText());
////                preparedStmt.setSelectedItem (""+ );
  
//  preparedStmt.execute();
  conn.close();
            tampilkan();
            valuePaket();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data belum diisi");
        }
    }//GEN-LAST:event_pesanActionPerformed

    private void acara2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acara2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acara2ActionPerformed

    public void valuePaket() {
        try {
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhagrafis","root","calonmertua2002");
            String sql = "Select * from pakets";
            Statement stat = conn.createStatement();
            ResultSet res=stat.executeQuery(sql);
              paket_id.addItem("-- Pilih Paket --");
            while (res.next()) {
                paket_id.addItem(res.getString("id"));
            }

        } catch (Exception e) {
        }
    }
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
            java.util.logging.Logger.getLogger(Bookingfotowedding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookingfotowedding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookingfotowedding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookingfotowedding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookingfotowedding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acara2;
    private javax.swing.JTextField category_id;
    private javax.swing.JTextField detailalamat;
    private javax.swing.JLabel dhagrafis;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAcara;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelDetailAlamat;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPaket;
    private javax.swing.JLabel labelWaktu;
    private javax.swing.JTable listBooking;
    private javax.swing.JTextField location_id;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> paket_id;
    private javax.swing.JButton pesan;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables

    public void koneksi() {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhagrafis","root","calonmertua2002");
            
        } catch (SQLException ex) {
            Logger.getLogger(Bookingfotowedding.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void tampilkan() {
        int row = listBooking.getRowCount();
        for (int i = 0; i < row; i++) {
            model.removeRow(0);
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhagrafis","root","calonmertua2002");

            Statement s = conn.createStatement();
           
            ResultSet rs = s.executeQuery(" SELECT *  FROM orders INNER JOIN users ON orders.user_id = users.id INNER JOIN categories ON orders.category_id = categories.id INNER JOIN pakets ON orders.paket_id = pakets.id INNER JOIN locations ON orders.location_id = locations.id");
            while(rs.next()){
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(23), rs.getString(3), rs.getString(4), rs.getString(16), rs.getString(18)};
                model.addRow(data);
//System.out.println(rs.getString(1));
            }
        } catch (SQLException ex) {
//            System.out.println("data kosong");
            Logger.getLogger(Bookingfotowedding.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
