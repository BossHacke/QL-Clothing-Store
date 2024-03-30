package View;

/**
 *
 * @author ACER
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnQLSP = new javax.swing.JButton();
        btnTK = new javax.swing.JButton();
        btnNV = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnQLsanpham = new javax.swing.JButton();
        btnDK = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnQLSP.setBackground(new java.awt.Color(0, 102, 102));
        btnQLSP.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnQLSP.setForeground(new java.awt.Color(255, 255, 255));
        btnQLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/list.png"))); // NOI18N
        btnQLSP.setText("QUẢN LÝ ĐƠN HÀNG");
        btnQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSPActionPerformed(evt);
            }
        });

        btnTK.setBackground(new java.awt.Color(0, 102, 102));
        btnTK.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnTK.setForeground(new java.awt.Color(255, 255, 255));
        btnTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/view report.png"))); // NOI18N
        btnTK.setText("THỐNG KÊ DOANH THU");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        btnNV.setBackground(new java.awt.Color(0, 102, 102));
        btnNV.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnNV.setForeground(new java.awt.Color(255, 255, 255));
        btnNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nv.png"))); // NOI18N
        btnNV.setText("QUẢN LÝ NHÂN VIÊN");
        btnNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(0, 102, 102));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnQLsanpham.setBackground(new java.awt.Color(0, 102, 102));
        btnQLsanpham.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnQLsanpham.setForeground(new java.awt.Color(255, 255, 255));
        btnQLsanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hanghoa (1).png"))); // NOI18N
        btnQLsanpham.setText("QUẢN LÝ SẢN PHẨM");
        btnQLsanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLsanphamActionPerformed(evt);
            }
        });

        btnDK.setBackground(new java.awt.Color(0, 102, 102));
        btnDK.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        btnDK.setForeground(new java.awt.Color(255, 255, 255));
        btnDK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/accout.png"))); // NOI18N
        btnDK.setText("QUẢN LÝ TÀI KHOẢN");
        btnDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDKActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ca.png"))); // NOI18N
        jButton1.setText("QUẢN LÝ CA LÀM NHÂN VIÊN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQLSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQLsanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQLsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNV, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDK, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        jLabel1.setText("HOME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(425, 425, 425))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        Thongke tk = new Thongke();
        tk.show();
        dispose();
    }//GEN-LAST:event_btnTKActionPerformed

    private void btnQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSPActionPerformed
        try {
            Capnhatdonhang capnhatdonhang = new Capnhatdonhang();
            capnhatdonhang.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        dispose();
    }//GEN-LAST:event_btnQLSPActionPerformed

    private void btnNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVActionPerformed
        try {
            QLnhanvien qLnhanvien = new QLnhanvien();
            qLnhanvien.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        dispose();
    }//GEN-LAST:event_btnNVActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        Login l = new Login();
        l.show();
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnQLsanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLsanphamActionPerformed
        try {
            Quanlysanpham sp = new Quanlysanpham();
            sp.show();
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnQLsanphamActionPerformed

    private void btnDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDKActionPerformed
        try {
            Quanlytaikhoan tk = new Quanlytaikhoan();
            tk.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        dispose();
    }//GEN-LAST:event_btnDKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Quanlycalamviec ca = new Quanlycalamviec();
            ca.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Home h = new Home();
        h.setLocationRelativeTo(null);
        h.setVisible(true);
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Home().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDK;
    private javax.swing.JButton btnNV;
    private javax.swing.JButton btnQLSP;
    private javax.swing.JButton btnQLsanpham;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
