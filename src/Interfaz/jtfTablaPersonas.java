
package Interfaz;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HECTOR MAURICIO
 */
public class jtfTablaPersonas extends javax.swing.JInternalFrame {

    /**
     * Creates new form jtfTablaPersonas
     */
     
    public jtfTablaPersonas() {
        initComponents();
        
        //Lista
        Lista l = new Lista();
        l.agregar(3);
        l.agregar(56);
        l.agregar(03);
        l.agregar(38);
        l.agregar(21);
        l.agregar(1);
        l.agregar(54);
        l.agregar(32);
        l.agregar(66);
        l.agregar(76);
        l.agregar(96);
        
        
        
       
        //Arreglo donde se guardan los nodos
       int arregloNodos[] = new int[l.getCantNodos()];
       //El arreglo anterior se llena con informacion de la lista
       arregloNodos = l.imprimirLista2();
       //Se crea un modelo para el JTable
        DefaultTableModel modelo = new DefaultTableModel();
       //Define un arreglo con los encabezados de la tabla
      String[] cabecera = {"Nodos","Alfa","Beta"};
       //Al modelo se agrega los titulos del encabezado
       modelo.setColumnIdentifiers(cabecera);
       //Crear un arreglo de Objetos para vaciar el arreglo de 
      Object[] datos = new Object[l.getCantNodos()];
       //Coloca la informacion del arreglo numerico dentro de a
       for(int i=0 ; i < l.getCantNodos() ; i++ )
       {
           datos[0] = arregloNodos[i];
           datos[1] = "a";
           datos[2] = "b";
           modelo.addRow(datos);  
       }
       //Se asigna el modelo al JTable
       jtListado.setModel(modelo);
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbPersonas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();
        jbnListadoPersonas = new javax.swing.JButton();

        jlbPersonas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlbPersonas.setText("Listado de Personas");

        jtListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtListado);

        jbnListadoPersonas.setText("Listado Personas");
        jbnListadoPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnListadoPersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbPersonas)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbnListadoPersonas)
                        .addGap(290, 290, 290))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlbPersonas)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbnListadoPersonas)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnListadoPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnListadoPersonasActionPerformed
        // TODO add your handling code here:
       Persona[] arregloP = new Persona[5];
        for(int i=0; i<5 ; i++)
        {
           arregloP[i]  =  new Persona(null,null,0);
        }
        //Inicializar el arreglo de la clase Persona 
        arregloP[0] = new Persona("Ana","Jimenez",18);
        arregloP[1] = new Persona("Laaro","Estrada",19);
        arregloP[2] = new Persona("Samuel","Rico",18);
        arregloP[3] = new Persona("Jonathan","Perez",20);
        arregloP[4] = new Persona("Isai","Otero",19);
        
        //Se crea un modelo para el JTable
        DefaultTableModel modeloPersona = new DefaultTableModel();
        //Define un arreglo con los encabezados de la tabla
        String[] encabezado = {"No","Nombre","Apellidos","Edad"};
        //Al modelo se agrega los titulos del encebezado
        modeloPersona.setColumnIdentifiers(encabezado);
        //Crear un arreglo de objetos para vaciar el arreglo de entrada
        Object[] datosPersona = new Object[arregloP.length];
        //Coloca la informacion del arrego numerico dentro de arreglo
        for(int i=0; i<arregloP.length; i++)
        {
            datosPersona[0] = i+1;
            datosPersona[1] = arregloP[i].getNombre();
            datosPersona[2] = arregloP[i].getApellidos();
            datosPersona[3] = arregloP[i].getEdad();
            modeloPersona.addRow(datosPersona);
        }
        jtListado.setModel(modeloPersona);
    }//GEN-LAST:event_jbnListadoPersonasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnListadoPersonas;
    private javax.swing.JLabel jlbPersonas;
    private javax.swing.JTable jtListado;
    // End of variables declaration//GEN-END:variables
}
