package views;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class Eliminar extends javax.swing.JPanel {

    public Eliminar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg5 = new javax.swing.JPanel();
        lbl_imageneli = new javax.swing.JLabel();
        lbl_eliminar = new javax.swing.JLabel();
        txf_id = new javax.swing.JTextField();
        bt_eliminar = new javax.swing.JButton();

        bg5.setBackground(new java.awt.Color(255, 255, 255));

        lbl_imageneli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N

        lbl_eliminar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbl_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_eliminar.setText("INGRESAR ID DEL EVENTO");

        txf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_idActionPerformed(evt);
            }
        });

        bt_eliminar.setBackground(new java.awt.Color(255, 0, 0));
        bt_eliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bt_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg5Layout = new javax.swing.GroupLayout(bg5);
        bg5.setLayout(bg5Layout);
        bg5Layout.setHorizontalGroup(
            bg5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg5Layout.createSequentialGroup()
                .addGroup(bg5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg5Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(bg5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txf_id)
                            .addComponent(lbl_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_imageneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bg5Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(bt_eliminar)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        bg5Layout.setVerticalGroup(
            bg5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_imageneli, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
    String idEvento = txf_id.getText();

    if (idEvento.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el ID del evento que desea eliminar.", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        URL url = new URL("http://localhost:8080/eventos/" + idEvento);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Content-Type", "application/json; utf-8");

        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_NO_CONTENT || responseCode == HttpURLConnection.HTTP_OK) { 
            JOptionPane.showMessageDialog(this, "Evento eliminado con éxito.");
        } else if (responseCode == HttpURLConnection.HTTP_NOT_FOUND) {
            JOptionPane.showMessageDialog(this, "La ID del evento no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el evento: " + responseCode, "Error", JOptionPane.ERROR_MESSAGE);
        }

        conn.disconnect();

    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al conectar con la API: " + ex.getMessage());
    }
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void txf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg5;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JLabel lbl_eliminar;
    private javax.swing.JLabel lbl_imageneli;
    private javax.swing.JTextField txf_id;
    // End of variables declaration//GEN-END:variables
}
