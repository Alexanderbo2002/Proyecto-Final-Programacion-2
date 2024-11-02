package views;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

public class Unirse extends javax.swing.JPanel {

    public Unirse() {
        initComponents();
    }

    private void cargarEventos() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0); 

        try {
            URL url = new URL("http://localhost:8080/eventos");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            int responseCode = conn.getResponseCode();
            StringBuilder response = new StringBuilder();

            if (responseCode == HttpURLConnection.HTTP_OK) { 
                try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                    String responseLine;
                    while ((responseLine = in.readLine()) != null) {
                        response.append(responseLine.trim());
                    }
                }

                JSONArray eventosArray = new JSONArray(response.toString());

                for (int i = 0; i < eventosArray.length(); i++) {
                    JSONObject evento = eventosArray.getJSONObject(i);
                    Object[] row = new Object[5]; 
                    row[0] = evento.getLong("idEvento"); 
                    row[1] = evento.getString("nombreEvento");
                    row[2] = evento.getString("hora");
                    row[3] = evento.getString("fecha");
                    row[4] = evento.getString("ubicacion");

                    model.addRow(row);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Error al obtener los eventos: " + responseCode);
            }

            conn.disconnect();

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al conectar con la API: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bt_actu = new javax.swing.JButton();
        bt_eli = new javax.swing.JButton();
        bt_uni = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 0));
        setPreferredSize(new java.awt.Dimension(627, 430));

        bg3.setBackground(new java.awt.Color(255, 255, 255));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Evento", "Nombre Evento", "Hora", "Fecha", "Ubicacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista De Eventos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bt_actu.setBackground(new java.awt.Color(21, 101, 192));
        bt_actu.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bt_actu.setForeground(new java.awt.Color(255, 255, 255));
        bt_actu.setText("Actualizar Tabla");
        bt_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_actuActionPerformed(evt);
            }
        });

        bt_eli.setBackground(new java.awt.Color(21, 101, 192));
        bt_eli.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bt_eli.setForeground(new java.awt.Color(255, 255, 255));
        bt_eli.setText("Eliminar Evento");
        bt_eli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliActionPerformed(evt);
            }
        });

        bt_uni.setBackground(new java.awt.Color(21, 101, 192));
        bt_uni.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        bt_uni.setForeground(new java.awt.Color(255, 255, 255));
        bt_uni.setText("Unirme Evento");
        bt_uni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_uniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(bt_actu)
                .addGap(18, 18, 18)
                .addComponent(bt_eli)
                .addGap(18, 18, 18)
                .addComponent(bt_uni)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_uni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_eli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_actu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout bg3Layout = new javax.swing.GroupLayout(bg3);
        bg3.setLayout(bg3Layout);
        bg3Layout.setHorizontalGroup(
            bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg3Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bg3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bg3Layout.setVerticalGroup(
            bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_actuActionPerformed
        cargarEventos();
    }//GEN-LAST:event_bt_actuActionPerformed

    private void bt_uniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_uniActionPerformed
        DatosUnirse p2 = new DatosUnirse();
        p2.setSize(627, 430);
        p2.setLocation(0,0);
        
        bg3.removeAll();
        bg3.add(p2, BorderLayout.CENTER);
        bg3.revalidate();
        bg3.repaint();
    }//GEN-LAST:event_bt_uniActionPerformed

    private void bt_eliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliActionPerformed
        Eliminar p3 = new Eliminar();
        p3.setSize(627, 430);
        p3.setLocation(0,0);
        
        bg3.removeAll();
        bg3.add(p3, BorderLayout.CENTER);
        bg3.revalidate();
        bg3.repaint();
    }//GEN-LAST:event_bt_eliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg3;
    private javax.swing.JButton bt_actu;
    private javax.swing.JButton bt_eli;
    private javax.swing.JButton bt_uni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
