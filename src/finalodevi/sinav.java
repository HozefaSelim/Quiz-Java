package finalodevi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class sinav extends javax.swing.JFrame {

    File f = new File("sonuclar.txt");
    PrintWriter pr;
    static int puan = 0;
    static int i = 0;
    static int count = 1;
    ImageIcon img = new ImageIcon("icon.png");

    public sinav() throws FileNotFoundException {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(img.getImage());
        new soru();
        setdate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jb1 = new javax.swing.JRadioButton();
        jb2 = new javax.swing.JRadioButton();
        jb3 = new javax.swing.JRadioButton();
        jb4 = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUİZZO");
        setBackground(new java.awt.Color(0, 51, 51));
        setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 700));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));

        jPanel3.setBackground(new java.awt.Color(90, 98, 228));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel3.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 246, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1. SORU");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("1. soru");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jb1.setBackground(new java.awt.Color(90, 98, 228));
        buttonGroup1.add(jb1);
        jb1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jb1.setForeground(new java.awt.Color(255, 255, 255));
        jb1.setText("1");
        jb1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jb1.setFocusPainted(false);
        jb1.setIconTextGap(5);

        jb2.setBackground(new java.awt.Color(90, 98, 228));
        buttonGroup1.add(jb2);
        jb2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jb2.setForeground(new java.awt.Color(255, 255, 255));
        jb2.setText("2");
        jb2.setFocusPainted(false);
        jb2.setIconTextGap(5);

        jb3.setBackground(new java.awt.Color(90, 98, 228));
        buttonGroup1.add(jb3);
        jb3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jb3.setForeground(new java.awt.Color(255, 255, 255));
        jb3.setText("3");
        jb3.setFocusPainted(false);
        jb3.setIconTextGap(5);

        jb4.setBackground(new java.awt.Color(90, 98, 228));
        buttonGroup1.add(jb4);
        jb4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jb4.setForeground(new java.awt.Color(255, 255, 255));
        jb4.setText("2");
        jb4.setFocusPainted(false);
        jb4.setIconTextGap(5);

        next.setBackground(new java.awt.Color(255, 246, 0));
        next.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        next.setForeground(new java.awt.Color(0, 0, 0));
        next.setText("SONRAKİ SORU");
        next.setBorder(null);
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.setFocusPainted(false);
        next.setFocusable(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 204, 204));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("All Rights Reserved © 2022");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb3)
                            .addComponent(jb4)
                            .addComponent(jb1)
                            .addComponent(jb2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jb1)
                .addGap(28, 28, 28)
                .addComponent(jb2)
                .addGap(26, 26, 26)
                .addComponent(jb3)
                .addGap(30, 30, 30)
                .addComponent(jb4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // cevap doğru olup olmadığını kontrol edilir
        if (jb1.isSelected() || jb2.isSelected() || jb3.isSelected() || jb4.isSelected()) {
            if (soru.sorular.get(i).equals("A") && jb1.isSelected()) {
                puan += 10;
            }
            if (soru.sorular.get(i).equals("B") && jb2.isSelected()) {
                puan += 10;
            }
            if (soru.sorular.get(i).equals("C") && jb3.isSelected()) {
                puan += 10;
            }
            if (soru.sorular.get(i).equals("D") && jb4.isSelected()) {
                puan += 10;
            }

        } else {
            this.jLabel3.setText("LÜTFEN BİR ŞIK SEŞİNİZ !!");
            return;

        }
        if (soru.sorular.size() > (i + 1)) {
            i++;
            buttonGroup1.clearSelection();
            this.jLabel3.setText("");
            setdate();

        } else {
            jLabel1.setText("QUİZ BİTİ");
            next.setEnabled(false);
            next.setText("BİTİ");
            jb1.setVisible(false);
            jb2.setVisible(false);
            jb3.setVisible(false);
            jb4.setVisible(false);
            jTextArea1.setText("Quiz Gönderildi.......\nBaşarlar");
            try {
                yazmak();
            } catch (IOException ex) {
            }

        }
    }//GEN-LAST:event_nextActionPerformed
// sorular guncellenmek    

    public void setdate() {
        jLabel1.setText(Integer.toString(count) + ". SORU");
        count++;
        jTextArea1.setText(soru.sorular.get(i));
        i++;
        jb1.setText(soru.sorular.get(i));
        i++;
        jb2.setText(soru.sorular.get(i));
        i++;
        jb3.setText(soru.sorular.get(i));
        i++;
        jb4.setText(soru.sorular.get(i));
        i++;
    }

//  dosyaya ogrenclerin puanleri yazmak
    public void yazmak() throws IOException {
        if (!f.exists()) {
            f.createNewFile();
        }
        pr = new PrintWriter(new FileOutputStream(f, true));
        pr.println(ogrenci.ogrenciAdi + " " + ogrenci.ogrenciSoyadi + " " + ogrenci.ogrenciNum + " " + puan);
        pr.close();
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
            java.util.logging.Logger.getLogger(sinav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sinav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sinav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sinav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new sinav().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(sinav.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton jb1;
    private javax.swing.JRadioButton jb2;
    private javax.swing.JRadioButton jb3;
    private javax.swing.JRadioButton jb4;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
