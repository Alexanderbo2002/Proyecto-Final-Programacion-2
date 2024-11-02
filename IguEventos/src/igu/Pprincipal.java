package igu;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import views.Principal;
import views.Unirse;

public class Pprincipal extends javax.swing.JFrame {

    public Pprincipal() {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
    }

    private void InitStyles() {
        mensaje.putClientProperty("FlatLaf.style", "font: 14 $light.font");
        mensaje.setForeground(Color.black);
        titulo.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        titulo.setForeground(Color.white);
        dateText.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        dateText.setForeground(Color.white);
        appName.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        appName.setForeground(Color.white);
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre",
             "Octubre", "Noviembre", "Diciemrbre"};
        dateText.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
    }
 private void InitContent(){
        Principal p1 = new Principal();
        p1.setSize(627, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        appName = new javax.swing.JLabel();
        bt_prin = new javax.swing.JButton();
        bt_uni = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(0, 0, 102));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName.setText("Ale 亗 Event");

        bt_prin.setBackground(new java.awt.Color(21, 101, 192));
        bt_prin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_prin.setForeground(new java.awt.Color(255, 255, 255));
        bt_prin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/principal.png"))); // NOI18N
        bt_prin.setText("Principal");
        bt_prin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        bt_prin.setBorderPainted(false);
        bt_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_prin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bt_prin.setIconTextGap(10);
        bt_prin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_prinActionPerformed(evt);
            }
        });

        bt_uni.setBackground(new java.awt.Color(21, 101, 192));
        bt_uni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_uni.setForeground(new java.awt.Color(255, 255, 255));
        bt_uni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prin2.png"))); // NOI18N
        bt_uni.setText("Eventos ");
        bt_uni.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        bt_uni.setBorderPainted(false);
        bt_uni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_uni.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bt_uni.setIconTextGap(10);
        bt_uni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_uniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appName, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addComponent(bt_prin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_uni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(appName)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_prin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_uni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(0, 51, 204));

        titulo.setText("Gestion de eventos");

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mensaje.setText("By: Eric Alexander Barillas Orozco ❤");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_prinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_prinActionPerformed
        Principal p1 = new Principal();
        p1.setSize(627, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_bt_prinActionPerformed

    private void bt_uniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_uniActionPerformed
        Unirse p2 = new Unirse();
        p2.setSize(627, 430);
        p2.setLocation(0,0);
        
        content.removeAll();
        content.add(p2, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_bt_uniActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatMaterialLighterIJTheme.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.JPanel bg;
    private javax.swing.JButton bt_prin;
    private javax.swing.JButton bt_uni;
    private javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
