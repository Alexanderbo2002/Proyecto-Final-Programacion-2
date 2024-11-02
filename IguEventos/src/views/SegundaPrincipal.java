package views;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class SegundaPrincipal extends javax.swing.JPanel {

    public SegundaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg2 = new javax.swing.JPanel();
        lbl_titulo2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombre_organizador = new javax.swing.JLabel();
        txf_nom_org = new javax.swing.JTextField();
        lbl_correo = new javax.swing.JLabel();
        txf_correo = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txf_telefono = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txf_apellido = new javax.swing.JTextField();
        lbl_id = new javax.swing.JLabel();
        txf_id = new javax.swing.JTextField();
        lbl_imagen2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bt_guardard = new javax.swing.JButton();

        bg2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_titulo2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbl_titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo2.setText("Añadir Datos Del Organizador");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_nombre_organizador.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_nombre_organizador.setText("Nombre del organizador:");

        txf_nom_org.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nom_orgActionPerformed(evt);
            }
        });

        lbl_correo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_correo.setText("Correo Electronico:");

        lbl_telefono.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_telefono.setText("Teléfono:");

        lbl_apellido.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_apellido.setText("Apellido:");

        lbl_id.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_id.setText("ingresa tu ID:");

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
                            .addGap(91, 91, 91))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_nombre_organizador, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_apellido)
                            .addComponent(lbl_correo)
                            .addComponent(lbl_telefono))
                        .addGap(53, 53, 53)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txf_nom_org, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(txf_apellido)
                    .addComponent(txf_correo)
                    .addComponent(txf_telefono)
                    .addComponent(txf_id, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(lbl_nombre_organizador)
                    .addComponent(txf_nom_org, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(51, Short.MAX_VALUE))
        );

        lbl_imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        bt_guardard.setBackground(new java.awt.Color(21, 101, 192));
        bt_guardard.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bt_guardard.setForeground(new java.awt.Color(255, 255, 255));
        bt_guardard.setText("Guardar Datos / Finalizar");
        bt_guardard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_guardard, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_guardard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(lbl_titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nom_orgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nom_orgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nom_orgActionPerformed

    private void bt_guardardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardardActionPerformed
    String idEvento = txf_id.getText();
    String nombreOrganizador = txf_nom_org.getText();
    String apellidoOrganizador = txf_apellido.getText();
    String correo = txf_correo.getText();
    String telefono = txf_telefono.getText();

    if (idEvento.isEmpty() || nombreOrganizador.isEmpty() || apellidoOrganizador.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos para actualizar el evento.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        return;
    }

    
    try {
        URL url = new URL("http://localhost:8080/eventos/" + idEvento);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("PUT");
        conn.setRequestProperty("Content-Type", "application/json; utf-8");
        conn.setDoOutput(true);

        String jsonInputString = String.format(
                "{\"nombreOrganizador\": \"%s\", \"apellidoOrganizador\": \"%s\", \"correo\": \"%s\", \"telefono\": \"%s\"}",
                nombreOrganizador, apellidoOrganizador, correo, telefono);

        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            JOptionPane.showMessageDialog(this, "Evento actualizado con éxito.");
        } else if (responseCode == HttpURLConnection.HTTP_NOT_FOUND) {
            JOptionPane.showMessageDialog(this, "La ID del evento no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar el evento: " + responseCode, "Error", JOptionPane.ERROR_MESSAGE);
        }

        conn.disconnect();

    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al conectar con la API: " + ex.getMessage());
    }
    }//GEN-LAST:event_bt_guardardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg2;
    private javax.swing.JButton bt_guardard;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_imagen2;
    private javax.swing.JLabel lbl_nombre_organizador;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo2;
    private javax.swing.JTextField txf_apellido;
    private javax.swing.JTextField txf_correo;
    private javax.swing.JTextField txf_id;
    private javax.swing.JTextField txf_nom_org;
    private javax.swing.JTextField txf_telefono;
    // End of variables declaration//GEN-END:variables
}
