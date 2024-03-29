package py.edu.facitec.mec.view.forms;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import py.edu.facitec.mec.controller.ServiciosController;
import py.edu.facitec.mec.controller.ServiciosControllerImp;
import py.edu.facitec.mec.model.Servicio;
import py.edu.facitec.mec.util.SoloMayusculas;
import py.edu.facitec.mec.util.Utilidad;
import static py.edu.facitec.mec.view.forms.FormCiudad.soloNumeros;

public class FormServicios extends javax.swing.JFrame {

    /**
     * Creates new form FormCliente1
     */
    
    ServiciosController servicioController;
    
    boolean estadoModificacion;
    
    public FormServicios(java.awt.Frame parent, boolean modal) {
        initComponents();
        
        this.servicioController = new ServiciosControllerImp();
        
        estadoModificacion = false;
        
        estadoInicial();
        this.setLocationRelativeTo(null);
        
        //Validar solo numeros
        soloNumeros(tfCodigo);
        soloNumeros(tfVarlorUnitario);
        
        //Validar solo mayusculas
        tfNombre.setDocument(new SoloMayusculas());
        tfDescripcion.setDocument(new SoloMayusculas());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfDescripcion = new javax.swing.JTextField();
        tfVarlorUnitario = new javax.swing.JTextField();
        cbEstado = new javax.swing.JCheckBox();
        btnNuevo = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Servicios");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarKeyPressed(evt);
            }
        });
        jPanel1.add(btnGuardar);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        btnModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnModificarKeyPressed(evt);
            }
        });
        jPanel1.add(btnModificar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        btnEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEliminarKeyPressed(evt);
            }
        });
        jPanel1.add(btnEliminar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });
        jPanel1.add(btnCancelar);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalirKeyPressed(evt);
            }
        });
        jPanel1.add(btnSalir);

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Valor Unitario:");

        jLabel8.setText("Estado:");

        tfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodigoFocusLost(evt);
            }
        });
        tfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCodigoKeyPressed(evt);
            }
        });

        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreFocusGained(evt);
            }
        });
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });

        tfDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDescripcionFocusGained(evt);
            }
        });
        tfDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDescripcionKeyTyped(evt);
            }
        });

        tfVarlorUnitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfVarlorUnitarioFocusGained(evt);
            }
        });
        tfVarlorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfVarlorUnitarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfVarlorUnitarioKeyTyped(evt);
            }
        });

        cbEstado.setText("Inactivo");
        cbEstado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbEstadoStateChanged(evt);
            }
        });
        cbEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbEstadoKeyPressed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        btnNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNuevoKeyPressed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        btnConsultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConsultarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombre)
                            .addComponent(tfDescripcion)
                            .addComponent(tfVarlorUnitario)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbEstado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNuevo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnConsultar)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfVarlorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodigoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoFocusGained

    private void tfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreFocusGained

    private void tfDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDescripcionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescripcionFocusGained

    private void tfVarlorUnitarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfVarlorUnitarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVarlorUnitarioFocusGained

    private void tfCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyPressed
        if(tfCodigo.getText().isEmpty()){
            moverConEnter(evt, btnNuevo);
        }else{
            moverConEnter(evt, btnConsultar);
        }
    }//GEN-LAST:event_tfCodigoKeyPressed

    private void tfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyPressed
        moverConEnter(evt, tfDescripcion);
    }//GEN-LAST:event_tfNombreKeyPressed

    private void tfDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescripcionKeyPressed
        moverConEnter(evt, tfVarlorUnitario);
    }//GEN-LAST:event_tfDescripcionKeyPressed

    private void tfVarlorUnitarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfVarlorUnitarioKeyPressed
        moverConEnter(evt, cbEstado);
    }//GEN-LAST:event_tfVarlorUnitarioKeyPressed

    private void cbEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbEstadoKeyPressed
        if (estadoModificacion) {
            moverConEnter(evt, btnModificar);
        }else{
            moverConEnter(evt, btnGuardar);
        }
    }//GEN-LAST:event_cbEstadoKeyPressed

    private void btnConsultarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConsultarKeyPressed
        hacerClicConEnter(evt, btnConsultar);
    }//GEN-LAST:event_btnConsultarKeyPressed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed
        hacerClicConEnter(evt, btnGuardar);
    }//GEN-LAST:event_btnGuardarKeyPressed

    private void btnModificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnModificarKeyPressed
        hacerClicConEnter(evt, btnModificar);
    }//GEN-LAST:event_btnModificarKeyPressed

    private void btnEliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEliminarKeyPressed
        hacerClicConEnter(evt, btnEliminar);
    }//GEN-LAST:event_btnEliminarKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        hacerClicConEnter(evt, btnCancelar);
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void btnSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirKeyPressed
        hacerClicConEnter(evt, btnSalir);
    }//GEN-LAST:event_btnSalirKeyPressed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if(tfCodigo.getText().isEmpty()){
            btnNuevo.setEnabled(false);
            FormServiciosConsulta consulta = new FormServiciosConsulta(this, estadoModificacion);
            consulta.setVisible(true);
        }else{
            estadoModificar();
            consultarClientePorCodito(Integer.parseInt(tfCodigo.getText()));
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean validar = validarCampos();
        if(validar){
            guardar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        boolean validar = validarCampos();
        if(validar){
            modificar();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea salir?", "Aviso", 2);
        if (opcion == JOptionPane.YES_OPTION) {
            dispose();
        }else{
            btnSalir.requestFocus();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbEstadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbEstadoStateChanged
        if (cbEstado.isSelected()) {
            cbEstado.setLabel("Activo");
        }else{
            cbEstado.setLabel("Inactivo");
        }
    }//GEN-LAST:event_cbEstadoStateChanged

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        estadoInsertar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnNuevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNuevoKeyPressed
        hacerClicConEnter(evt, btnNuevo);
    }//GEN-LAST:event_btnNuevoKeyPressed

    private void tfCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodigoFocusLost
        if(tfCodigo.getText().isEmpty()){
            
        }else{
            btnConsultar.doClick();
        }
    }//GEN-LAST:event_tfCodigoFocusLost

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
        int limite  = 60;
        if (tfNombre.getText().length()== limite){
            evt.consume();
        }
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescripcionKeyTyped
        int limite  = 120;
        if (tfDescripcion.getText().length()== limite){
            evt.consume();
        }
    }//GEN-LAST:event_tfDescripcionKeyTyped

    private void tfVarlorUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfVarlorUnitarioKeyTyped
        int limite  = 15;
        if (tfVarlorUnitario.getText().length()== limite){
            evt.consume();
        }
    }//GEN-LAST:event_tfVarlorUnitarioKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormServicios dialog = new FormServicios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfVarlorUnitario;
    // End of variables declaration//GEN-END:variables

private void consultarClientePorCodito(int codigo) {
        
        if (codigo != 0 ) {
            
            Servicio servicio = servicioController.recuperarPorCodigo(codigo);
            
            if (servicio != null) {
                tfNombre.setText(servicio.getNombre());
                tfDescripcion.setText(servicio.getDescripcion());
                tfVarlorUnitario.setText(Utilidad.formatoValorS(servicio.getValor_unitario()));
                if (servicio.isEstado()) {
                    cbEstado.setSelected(servicio.isEstado());
                    cbEstado.setLabel("Activo");
                }else{
                    cbEstado.setSelected(servicio.isEstado());
                    cbEstado.setLabel("Inactivo");
                }
                estadoModificar();
                estadoModificacion = true;
            }else{
                JOptionPane.showMessageDialog(this, "No existe servicio con este codigo", "Aviso", 1);
                estadoInsertar();
                estadoModificacion = false;
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debes digitar un numero", "Aviso", 2);
        }
    }

    private void guardar() {
        Servicio serv = new Servicio(
                tfNombre.getText(), 
                tfDescripcion.getText(), 
                Utilidad.formatoValorD(tfVarlorUnitario.getText()), 
                cbEstado.isSelected());
        servicioController.insertar(serv);
        JOptionPane.showMessageDialog(this, "Servicio nuevo guardado con exito", "Aviso", 2);
        limpiar();
    }

    private void modificar() {
        
        Servicio serv = new Servicio(
                Integer.parseInt(tfCodigo.getText()), 
                tfNombre.getText(), tfDescripcion.getText(), 
                Utilidad.formatoValorD(tfVarlorUnitario.getText()), 
                cbEstado.isSelected());
        
        servicioController.modificar(serv);
        
        JOptionPane.showMessageDialog(this, "Servicio actualizado con exito", "Aviso", 1);
        
        limpiar();
    }

    private void eliminar() {
        
        int opcion = JOptionPane.showConfirmDialog(this, "Eliminar?", "Aviso", JOptionPane.YES_NO_OPTION);
        
        if (opcion == JOptionPane.YES_OPTION) {
            
            servicioController.eliminar( Integer.parseInt( tfCodigo.getText() ) );
            
        }
        limpiar();
    }

    private void limpiar() {
        tfCodigo.requestFocus();
        tfCodigo.setText("");
        tfNombre.setText("");
        tfDescripcion.setText("");
        tfVarlorUnitario.setText("");
        cbEstado.setSelected(false);
        estadoModificacion = false;
        estadoInicial();
    }

    private void moverConEnter(java.awt.event.KeyEvent evt, JComponent source) {
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            source.requestFocus();
        }
    }
    
    private void hacerClicConEnter(java.awt.event.KeyEvent evt, JButton buttom){
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            buttom.doClick();
        }
    }
    
    private void estadoInicial() {
        tfCodigo.setEnabled(true);
        tfNombre.setEnabled(false);
        tfDescripcion.setEnabled(false);
        tfVarlorUnitario.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnConsultar.setEnabled(true);
        cbEstado.setEnabled(false);
    }

    private void estadoInsertar(){
        tfCodigo.setText("");
        tfCodigo.setEnabled(false);
        tfNombre.requestFocus();
        tfNombre.setEnabled(true);
        tfDescripcion.setEnabled(true);
        tfVarlorUnitario.setEnabled(true);
        btnConsultar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnConsultar.setEnabled(false);
        cbEstado.setEnabled(true);
    }
    
    private void estadoModificar(){
        tfCodigo.setEnabled(false);
        tfNombre.requestFocus();
        tfNombre.setEnabled(true);
        tfDescripcion.setEnabled(true);
        tfVarlorUnitario.setEnabled(true);
        btnConsultar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNuevo.setEnabled(false);
        cbEstado.setEnabled(true);
    }
    
    private boolean validarCampos(){
        boolean valido = false;
        if(tfNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo Nombre es obligatorio", "Aviso", 1);
            tfNombre.requestFocus();
        }else if(tfDescripcion.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo Descripcion es obligatorio", "Aviso", 1);
            tfDescripcion.requestFocus();
        }else if(tfVarlorUnitario.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo Valor Unitario es obligatorio", "Aviso", 1);
            tfVarlorUnitario.requestFocus();
        }else{
            valido = true;
        }
        return valido;
    }
    
    public final void soloLetras(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(Character.isDigit(c)){
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }
    
    public static final void soloNumeros(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(Character.isLetter(c)){
//                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }
}
