package PrincipalPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
        this.setResizable(false);
        BarraProgreso= new Hilo(this.BarradeProgreso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jl_horaactual = new javax.swing.JLabel();
        jl_BoroaCloud = new javax.swing.JLabel();
        bt_subirArchivo = new javax.swing.JButton();
        jl_SubiendoArchivo = new javax.swing.JLabel();
        BarradeProgreso = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_unica = new javax.swing.JTextArea();
        bt_Guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido mirrey");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de hoy:");

        jl_horaactual.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jl_horaactual.setForeground(new java.awt.Color(255, 255, 255));
        jl_horaactual.setText("00:00:00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jl_horaactual))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_horaactual)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 430));

        jl_BoroaCloud.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jl_BoroaCloud.setForeground(new java.awt.Color(0, 0, 0));
        jl_BoroaCloud.setText("Boroa Cloud");
        jPanel1.add(jl_BoroaCloud, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        bt_subirArchivo.setBackground(new java.awt.Color(204, 204, 0));
        bt_subirArchivo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        bt_subirArchivo.setForeground(new java.awt.Color(255, 255, 255));
        bt_subirArchivo.setText("Subir");
        bt_subirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_subirArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(bt_subirArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jl_SubiendoArchivo.setForeground(new java.awt.Color(0, 0, 0));
        jl_SubiendoArchivo.setText("SubiendoArchivo");
        jPanel1.add(jl_SubiendoArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));
        jPanel1.add(BarradeProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 280, 20));

        ta_unica.setColumns(20);
        ta_unica.setRows(5);
        jScrollPane1.setViewportView(ta_unica);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 420, 220));

        bt_Guardar.setBackground(new java.awt.Color(204, 204, 0));
        bt_Guardar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        bt_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        bt_Guardar.setText("Guardar");
        jPanel1.add(bt_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_subirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_subirArchivoActionPerformed
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        ta_unica.setText("");
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter("Archivos de Texto", "txt");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                ta_unica.setText("");
                while ((linea = br.readLine()) != null) {
                    ta_unica.append(linea);
                    ta_unica.append("\n");
                }
            } //fin if

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_bt_subirArchivoActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarradeProgreso;
    private javax.swing.JButton bt_Guardar;
    private javax.swing.JButton bt_subirArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_BoroaCloud;
    private javax.swing.JLabel jl_SubiendoArchivo;
    private javax.swing.JLabel jl_horaactual;
    private javax.swing.JTextArea ta_unica;
    // End of variables declaration//GEN-END:variables
    Hilo BarraProgreso;
}
