
package Interfaz;

import static Interfaz.JFrame.jdpEscritorio;


public class jtfVentana1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form jtfVentana1
     */
    public jtfVentana1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbnAbrirVentana2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("VENTANA 1");

        jbnAbrirVentana2.setText("Abrir Ventana 2");
        jbnAbrirVentana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAbrirVentana2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jbnAbrirVentana2))
                .addGap(305, 305, 305))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(jbnAbrirVentana2)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnAbrirVentana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAbrirVentana2ActionPerformed
        // TODO add your handling code here:
        //Instancia de JInternalFrame Ventana2
        jtfVentana2 v2 = new jtfVentana2();
        //se incorpora la ventana al escritorio (tiene acces public)
        jdpEscritorio.add(v2);
        //Se trae al frente la ventana
        v2.toFront();
        //Se muestra la ventana dentro del escritorio
        v2.setVisible(true);
        
    }//GEN-LAST:event_jbnAbrirVentana2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbnAbrirVentana2;
    // End of variables declaration//GEN-END:variables
}
