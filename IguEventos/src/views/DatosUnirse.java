package views;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class DatosUnirse extends javax.swing.JPanel {

    public DatosUnirse() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        txf_nombre = new javax.swing.JTextField();
        lbl_correo = new javax.swing.JLabel();
        txf_correo = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txf_telefono = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txf_apellido = new javax.swing.JTextField();
        lbl_id = new javax.swing.JLabel();
        txf_id = new javax.swing.JTextField();
        lbl_titulo2 = new javax.swing.JLabel();
        lbl_imagenuni = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bt_volver = new javax.swing.JButton();
        bt_limpiar = new javax.swing.JButton();
        bt_unirme = new javax.swing.JButton();

        bg4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_nombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");

        txf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nombreActionPerformed(evt);
            }
        });

        lbl_correo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_correo.setText("Correo Electronico:");

        lbl_telefono.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_telefono.setText("Teléfono:");

        lbl_apellido.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_apellido.setText("Apellido:");

        lbl_id.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_id.setText("Ingresa el ID del evento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_id)
                            .addGap(10, 10, 10))
                        .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_apellido)
                    .addComponent(lbl_correo)
                    .addComponent(lbl_telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txf_nombre)
                    .addComponent(txf_apellido)
                    .addComponent(txf_correo)
                    .addComponent(txf_telefono)
                    .addComponent(txf_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(txf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido)
                    .addComponent(txf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_correo)
                    .addComponent(txf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        lbl_titulo2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbl_titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo2.setText("Añadir Datos Del Organizador");

        lbl_imagenuni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/datos.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        bt_volver.setBackground(new java.awt.Color(21, 101, 192));
        bt_volver.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bt_volver.setForeground(new java.awt.Color(255, 255, 255));
        bt_volver.setText("Volver");
        bt_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_volverActionPerformed(evt);
            }
        });

        bt_limpiar.setBackground(new java.awt.Color(21, 101, 192));
        bt_limpiar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bt_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpiar.setText("Limpiar");
        bt_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiarActionPerformed(evt);
            }
        });

        bt_unirme.setBackground(new java.awt.Color(21, 101, 192));
        bt_unirme.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bt_unirme.setForeground(new java.awt.Color(255, 255, 255));
        bt_unirme.setText("Unirme");
        bt_unirme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_unirmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(bt_volver)
                .addGap(18, 18, 18)
                .addComponent(bt_limpiar)
                .addGap(18, 18, 18)
                .addComponent(bt_unirme, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_unirme, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(bt_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout bg4Layout = new javax.swing.GroupLayout(bg4);
        bg4.setLayout(bg4Layout);
        bg4Layout.setHorizontalGroup(
            bg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg4Layout.createSequentialGroup()
                .addGroup(bg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg4Layout.createSequentialGroup()
                        .addGroup(bg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg4Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lbl_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bg4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_imagenuni, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bg4Layout.setVerticalGroup(
            bg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_titulo2)
                .addGap(18, 18, 18)
                .addGroup(bg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_imagenuni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nombreActionPerformed

    private void bt_unirmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_unirmeActionPerformed
        String nombre = txf_nombre.getText();
        String apellido = txf_apellido.getText();
        String correo = txf_correo.getText();
        String telefono = txf_telefono.getText();
        int idEvento = Integer.parseInt(txf_id.getText());

        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || telefono.isEmpty() || txf_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos para unirse al evento.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            URL url = new URL("http://localhost:8080/invitados");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setDoOutput(true);

            String jsonInputString = String.format(
                    "{\"nombre\": \"%s\", \"apellido\": \"%s\", \"correo\": \"%s\", \"telefono\": \"%s\", \"evento\": {\"idEvento\": %d}}",
                    nombre, apellido, correo, telefono, idEvento);

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = conn.getResponseCode();
            StringBuilder response = new StringBuilder();

            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                String responseLine;
                while ((responseLine = in.readLine()) != null) {
                    response.append(responseLine.trim());
                }
            }

            if (responseCode == HttpURLConnection.HTTP_CREATED) {
                JOptionPane.showMessageDialog(this, "Te has unido al evento con éxito.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al unirte al evento: " + responseCode + " - " + response.toString());
            }

            conn.disconnect();

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al conectar con la API: " + ex.getMessage());
        }
    }//GEN-LAST:event_bt_unirmeActionPerformed

    private void bt_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiarActionPerformed
        txf_apellido.setText("");
        txf_correo.setText("");
        txf_id.setText("");
        txf_nombre.setText("");
        txf_telefono.setText("");
    }//GEN-LAST:event_bt_limpiarActionPerformed

    private void bt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_volverActionPerformed
        Unirse p2 = new Unirse();
        p2.setSize(627, 430);
        p2.setLocation(0, 0);

        bg4.removeAll();
        bg4.add(p2, BorderLayout.CENTER);
        bg4.revalidate();
        bg4.repaint();
    }//GEN-LAST:event_bt_volverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg4;
    private javax.swing.JButton bt_limpiar;
    private javax.swing.JButton bt_unirme;
    private javax.swing.JButton bt_volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_imagenuni;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo2;
    private javax.swing.JTextField txf_apellido;
    private javax.swing.JTextField txf_correo;
    private javax.swing.JTextField txf_id;
    private javax.swing.JTextField txf_nombre;
    private javax.swing.JTextField txf_telefono;
    // End of variables declaration//GEN-END:variables
}
