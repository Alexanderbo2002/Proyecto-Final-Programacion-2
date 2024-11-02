package views;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import org.json.JSONObject;

public class Principal extends javax.swing.JPanel {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombre_eve = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        lbl_ubi = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        txf_nombre_eve = new javax.swing.JTextField();
        txf_ubi = new javax.swing.JTextField();
        txf_hora = new javax.swing.JTextField();
        txf_fecha = new javax.swing.JTextField();
        // En tu método de inicialización
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner(sm);
        lbl_imagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bt_limpiar_eve = new javax.swing.JButton();
        bt_guardar_eve = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 0));
        setPreferredSize(new java.awt.Dimension(627, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        lbl_titulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Crear Evento");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_nombre_eve.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_nombre_eve.setText("Nombre de evento:");

        lbl_fecha.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_fecha.setText("Fecha:");

        lbl_hora.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_hora.setText("Hora:");

        lbl_ubi.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_ubi.setText("Ubicacion:");

        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        txf_nombre_eve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nombre_eveActionPerformed(evt);
            }
        });

        txf_ubi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_ubiActionPerformed(evt);
            }
        });

        txf_hora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txf_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_horaActionPerformed(evt);
            }
        });

        txf_fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1, "HH:mm:ss");
        jSpinner1.setEditor(de);

        // Inicializar el JTextField
        txf_hora = new javax.swing.JTextField(10); // O el tamaño que desees

        // Agregar un ChangeListener para capturar la hora seleccionada
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(javax.swing.event.ChangeEvent e) {
                Date selectedDate = (Date) jSpinner1.getValue();
                String timeString = new JSpinner.DateEditor(jSpinner1, "HH:mm:ss").getFormat().format(selectedDate);
                txf_hora.setText(timeString); // Actualiza el JTextField con la hora
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_nombre_eve)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txf_ubi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txf_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_hora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txf_nombre_eve))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_hora)
                                .addComponent(lbl_fecha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lbl_ubi)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lbl_fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_hora)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_nombre_eve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nombre_eve))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(txf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ubi)
                    .addComponent(txf_ubi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0-PROYECTO FINAL/IguEventos/src/imagenes/imagenp.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        bt_limpiar_eve.setBackground(new java.awt.Color(21, 101, 192));
        bt_limpiar_eve.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bt_limpiar_eve.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpiar_eve.setText("Limpiar");
        bt_limpiar_eve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiar_eveActionPerformed(evt);
            }
        });

        bt_guardar_eve.setBackground(new java.awt.Color(21, 101, 192));
        bt_guardar_eve.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bt_guardar_eve.setForeground(new java.awt.Color(255, 255, 255));
        bt_guardar_eve.setText("Guardar Evento / Siguiente");
        bt_guardar_eve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardar_eveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(bt_limpiar_eve, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_guardar_eve)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(bt_limpiar_eve, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_guardar_eve, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(lbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nombre_eveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nombre_eveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nombre_eveActionPerformed

    private void bt_guardar_eveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardar_eveActionPerformed
        String nombreEvento = txf_nombre_eve.getText();
        String fecha = txf_fecha.getText();
        String hora = txf_hora.getText();
        String ubicacion = txf_ubi.getText();

        if (nombreEvento.isEmpty() || fecha.isEmpty() || hora.isEmpty() || ubicacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos para guardar el evento.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        try {
            URL url = new URL("http://localhost:8080/eventos");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setDoOutput(true);

            String jsonInputString = String.format(
                    "{\"nombreEvento\": \"%s\", \"fecha\": \"%s\", \"hora\": \"%s\", \"ubicacion\": \"%s\"}",
                    nombreEvento, fecha, hora, ubicacion);

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
                JSONObject jsonResponse = new JSONObject(response.toString());
                Long idEvento = jsonResponse.getLong("idEvento"); 

                JOptionPane.showMessageDialog(this, "Evento creado con éxito. La ID del evento es: " + idEvento);
                
                SegundaPrincipal p3 = new SegundaPrincipal();
                p3.setSize(627, 430);
                p3.setLocation(0, 0);

                bg.removeAll();
                bg.add(p3, BorderLayout.CENTER);
                bg.revalidate();
                bg.repaint();

            } else {
                JOptionPane.showMessageDialog(this, "Error al crear el evento: " + responseCode + " - " + response.toString());
            }

            conn.disconnect();

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al conectar con la API: " + ex.getMessage());
        }
    }//GEN-LAST:event_bt_guardar_eveActionPerformed

    private void txf_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_horaActionPerformed

    private void txf_ubiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_ubiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_ubiActionPerformed

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
        if (evt.getOldValue() != null) {
            SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
            txf_fecha.setText(ff.format(jCalendar1.getCalendar().getTime()));
        }
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void bt_limpiar_eveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiar_eveActionPerformed
        txf_fecha.setText("");
        txf_hora.setText("");
        txf_nombre_eve.setText("");
        txf_ubi.setText("");
    }//GEN-LAST:event_bt_limpiar_eveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton bt_guardar_eve;
    private javax.swing.JButton bt_limpiar_eve;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_nombre_eve;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_ubi;
    private javax.swing.JTextField txf_fecha;
    private javax.swing.JTextField txf_hora;
    private javax.swing.JTextField txf_nombre_eve;
    private javax.swing.JTextField txf_ubi;
    // End of variables declaration//GEN-END:variables
}
