package clientes.vista;

import clientes.controlador.Pedidos;
import administracion.controlador.ProcesosRepetidos;
import administracion.controlador.UsuarioAplicacion;
import clientes.modelo.PedidosDAO;
import administracion.modelo.UsuarioAplicacionDAO;
import administracion.vista.FuncionesBitacora;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prcs_Pedidos extends javax.swing.JInternalFrame {

    ProcesosRepetidos procesosr = new ProcesosRepetidos();
    FuncionesBitacora funcBitacora = new FuncionesBitacora();
    Pedidos pedidos = new Pedidos();
    PedidosDAO pedidosDAO = new PedidosDAO();
    String idApp = "0100";
    
    public Prcs_Pedidos() {
        initComponents();
        cargarAcciones();
        diseño();
        fecha_actual();
    }

    public void diseño() {
        setTitle("Proceso Pedido");
        procesosr.cursorMano(Btn_ayuda, Btn_cancelar, Btn_guardar);
    }

    private void limpiar() {
        procesosr.limpiarTxf(Txt_Id, Txt_DireR, Txt_DireD, Txt_ZonaD, Txt_NombreD, Txt_TelD, Txt_TamP);
    }
    
    public void fecha_actual() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Txt_Fecha.setDate(date);
    }
    
    void cargarAcciones() {

        Btn_guardar.setVisible(false);

        UsuarioAplicacion permisos = new UsuarioAplicacion();
        UsuarioAplicacionDAO permisosDAO = new UsuarioAplicacionDAO();

        permisos.setIdUsuario(LOGIN_Clientes.idCliente);
        permisos.setIdAplicacion(idApp);

        permisos = permisosDAO.selectV(permisos);
        
        if (permisos.getGuardar().equals("1")) {
            Btn_guardar.setVisible(true);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg_estados = new javax.swing.ButtonGroup();
        Pnl_ingresoDatos = new javax.swing.JPanel();
        Lbl_nombre1 = new javax.swing.JLabel();
        Lbl_Id = new javax.swing.JLabel();
        Txt_Id = new javax.swing.JTextField();
        Lbl_Fecha = new javax.swing.JLabel();
        Txt_Fecha = new com.toedter.calendar.JDateChooser();
        Lbl_DireR = new javax.swing.JLabel();
        Txt_DireR = new javax.swing.JTextField();
        Lbl_DireD = new javax.swing.JLabel();
        Txt_DireD = new javax.swing.JTextField();
        Lbl_ZonaD = new javax.swing.JLabel();
        Txt_ZonaD = new javax.swing.JTextField();
        Lbl_NomD = new javax.swing.JLabel();
        Txt_NombreD = new javax.swing.JTextField();
        Lbl_TelD = new javax.swing.JLabel();
        Txt_TelD = new javax.swing.JTextField();
        Lbl_TamP = new javax.swing.JLabel();
        Txt_TamP = new javax.swing.JTextField();
        Btn_fondoGuardar = new javax.swing.JPanel();
        Btn_guardar = new javax.swing.JLabel();
        Btn_fondoAyuda = new javax.swing.JPanel();
        Btn_ayuda = new javax.swing.JLabel();
        Btn_fondoCancelar = new javax.swing.JPanel();
        Btn_cancelar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(163, 177, 138));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        Pnl_ingresoDatos.setBackground(new java.awt.Color(252, 239, 180));
        Pnl_ingresoDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 78, 65), 1, true));

        Lbl_nombre1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_nombre1.setText("DATOS DEL PEDIDO:");

        Lbl_Id.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_Id.setText("ID:");

        Txt_Id.setEditable(false);
        Txt_Id.setBackground(new java.awt.Color(252, 239, 180));
        Txt_Id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));

        Lbl_Fecha.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_Fecha.setText("FECHA:");

        Txt_Fecha.setBackground(new java.awt.Color(252, 239, 180));
        Txt_Fecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Txt_Fecha.setEnabled(false);

        Lbl_DireR.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_DireR.setText("DIRECCION REMITENTE:");

        Txt_DireR.setBackground(new java.awt.Color(252, 239, 180));
        Txt_DireR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_DireR.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));
        Txt_DireR.setDoubleBuffered(true);

        Lbl_DireD.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_DireD.setText("DIRECCION DESTINATARIO:");

        Txt_DireD.setBackground(new java.awt.Color(252, 239, 180));
        Txt_DireD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_DireD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));
        Txt_DireD.setDoubleBuffered(true);

        Lbl_ZonaD.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_ZonaD.setText("ZONA DESTINATARIO:");

        Txt_ZonaD.setBackground(new java.awt.Color(252, 239, 180));
        Txt_ZonaD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_ZonaD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));
        Txt_ZonaD.setDoubleBuffered(true);

        Lbl_NomD.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_NomD.setText("NOMBRE DESTINATARIO:");

        Txt_NombreD.setBackground(new java.awt.Color(252, 239, 180));
        Txt_NombreD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_NombreD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));
        Txt_NombreD.setDoubleBuffered(true);

        Lbl_TelD.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_TelD.setText("TEL DESTINATARIO:");

        Txt_TelD.setBackground(new java.awt.Color(252, 239, 180));
        Txt_TelD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_TelD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));
        Txt_TelD.setDoubleBuffered(true);

        Lbl_TamP.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_TamP.setText("TAMAÑO PEDIDO (LB):");

        Txt_TamP.setBackground(new java.awt.Color(252, 239, 180));
        Txt_TamP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_TamP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));
        Txt_TamP.setDoubleBuffered(true);

        Btn_fondoGuardar.setBackground(new java.awt.Color(97, 212, 195));
        Btn_fondoGuardar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_fondoGuardar.setMinimumSize(new java.awt.Dimension(104, 40));

        Btn_guardar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Btn_guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_guardar.setText("Pedido");
        Btn_guardar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_guardar.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_guardar.setPreferredSize(new java.awt.Dimension(104, 40));
        Btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_guardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_fondoGuardarLayout = new javax.swing.GroupLayout(Btn_fondoGuardar);
        Btn_fondoGuardar.setLayout(Btn_fondoGuardarLayout);
        Btn_fondoGuardarLayout.setHorizontalGroup(
            Btn_fondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
            .addGroup(Btn_fondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
        );
        Btn_fondoGuardarLayout.setVerticalGroup(
            Btn_fondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(Btn_fondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Btn_guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        Btn_fondoAyuda.setBackground(new java.awt.Color(253, 255, 182));
        Btn_fondoAyuda.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_fondoAyuda.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_fondoAyuda.setPreferredSize(new java.awt.Dimension(104, 40));

        Btn_ayuda.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Btn_ayuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_ayuda.setText("Ayuda");
        Btn_ayuda.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_ayuda.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_ayuda.setPreferredSize(new java.awt.Dimension(104, 40));
        Btn_ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ayudaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_ayudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_ayudaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_fondoAyudaLayout = new javax.swing.GroupLayout(Btn_fondoAyuda);
        Btn_fondoAyuda.setLayout(Btn_fondoAyudaLayout);
        Btn_fondoAyudaLayout.setHorizontalGroup(
            Btn_fondoAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_ayuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Btn_fondoAyudaLayout.setVerticalGroup(
            Btn_fondoAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_ayuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Btn_fondoCancelar.setBackground(new java.awt.Color(255, 128, 115));
        Btn_fondoCancelar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_fondoCancelar.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_fondoCancelar.setPreferredSize(new java.awt.Dimension(104, 40));

        Btn_cancelar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Btn_cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_cancelar.setText("Cancelar");
        Btn_cancelar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_cancelar.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_cancelar.setPreferredSize(new java.awt.Dimension(104, 40));
        Btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_cancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_cancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_fondoCancelarLayout = new javax.swing.GroupLayout(Btn_fondoCancelar);
        Btn_fondoCancelar.setLayout(Btn_fondoCancelarLayout);
        Btn_fondoCancelarLayout.setHorizontalGroup(
            Btn_fondoCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Btn_fondoCancelarLayout.setVerticalGroup(
            Btn_fondoCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Pnl_ingresoDatosLayout = new javax.swing.GroupLayout(Pnl_ingresoDatos);
        Pnl_ingresoDatos.setLayout(Pnl_ingresoDatosLayout);
        Pnl_ingresoDatosLayout.setHorizontalGroup(
            Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                        .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_Id)
                            .addComponent(Lbl_Fecha)
                            .addComponent(Lbl_DireR)
                            .addComponent(Lbl_DireD)
                            .addComponent(Lbl_ZonaD)
                            .addComponent(Lbl_NomD))
                        .addGap(21, 21, 21)
                        .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_DireR, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_ZonaD)
                            .addComponent(Txt_NombreD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Txt_DireD)
                            .addComponent(Txt_TelD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                                .addComponent(Txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Txt_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(Txt_TamP))
                    .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                        .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbl_TelD)
                            .addComponent(Lbl_TamP))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(532, 532, 532))
            .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Lbl_nombre1))
                    .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(Btn_fondoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_fondoAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_fondoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnl_ingresoDatosLayout.setVerticalGroup(
            Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_nombre1)
                .addGap(35, 35, 35)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Id)
                    .addComponent(Txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Fecha)
                    .addComponent(Txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_DireR)
                    .addComponent(Txt_DireR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_DireD)
                    .addComponent(Txt_DireD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_ZonaD)
                    .addComponent(Txt_ZonaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_NombreD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_NomD))
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_TelD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_TelD))
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_TamP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_TamP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_fondoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Btn_fondoAyuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_fondoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_ingresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_ingresoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_cancelarMouseExited
        procesosr.pintarComponente("dsRojo", Btn_fondoCancelar);
    }//GEN-LAST:event_Btn_cancelarMouseExited

    private void Btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_cancelarMouseEntered
        procesosr.pintarComponente("sRojo", Btn_fondoCancelar);
    }//GEN-LAST:event_Btn_cancelarMouseEntered

    private void Btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_cancelarMouseClicked
        limpiar();
    }//GEN-LAST:event_Btn_cancelarMouseClicked

    private void Btn_ayudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ayudaMouseExited
        procesosr.pintarComponente("dsAmarillo", Btn_fondoAyuda);
    }//GEN-LAST:event_Btn_ayudaMouseExited

    private void Btn_ayudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ayudaMouseEntered
        procesosr.pintarComponente("sAmarillo", Btn_fondoAyuda);
    }//GEN-LAST:event_Btn_ayudaMouseEntered

    private void Btn_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_guardarMouseExited
        procesosr.pintarComponente("dsVerde", Btn_fondoGuardar);
    }//GEN-LAST:event_Btn_guardarMouseExited

    private void Btn_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_guardarMouseEntered
        procesosr.pintarComponente("sVerde", Btn_fondoGuardar);
    }//GEN-LAST:event_Btn_guardarMouseEntered

    private void Btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_guardarMouseClicked
        if (procesosr.isEmptyTxf(Txt_Id, Txt_DireR, Txt_DireD, Txt_ZonaD)) {
            if (procesosr.isNumeric(Txt_TelD,Txt_TamP)) {
                        pedidos.setId(Txt_Id.getText());
                        String fechaP = new SimpleDateFormat("yyyy-MM-dd").format(Txt_Fecha.getDate());
                        pedidos.setFecha(fechaP);
                        pedidos.setDireR(Txt_DireR.getText());
                        pedidos.setDireD(Txt_DireD.getText());
                        pedidos.setZonaD(Txt_ZonaD.getText());
                        pedidos.setNomD(Txt_NombreD.getText());
                        pedidos.setTelD(Txt_TelD.getText());
                        pedidos.setTamP(Txt_TamP.getText());
                        pedidosDAO.insert(pedidos);
                        funcBitacora.GuardarBitacora("GUARDAR", idApp);
                        procesosr.accionExitosa("Registro Exitoso", "Se ha registrado su pedido: \"" + Txt_Id.getText() + " " + "\" correctamente");
                        limpiar();
            }
        }
    }//GEN-LAST:event_Btn_guardarMouseClicked

    private void Btn_ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ayudaMouseClicked
        System.out.println("ayuda");
    }//GEN-LAST:event_Btn_ayudaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Bg_estados;
    private javax.swing.JLabel Btn_ayuda;
    private javax.swing.JLabel Btn_cancelar;
    private javax.swing.JPanel Btn_fondoAyuda;
    private javax.swing.JPanel Btn_fondoCancelar;
    private javax.swing.JPanel Btn_fondoGuardar;
    private javax.swing.JLabel Btn_guardar;
    private javax.swing.JLabel Lbl_DireD;
    private javax.swing.JLabel Lbl_DireR;
    private javax.swing.JLabel Lbl_Fecha;
    private javax.swing.JLabel Lbl_Id;
    private javax.swing.JLabel Lbl_NomD;
    private javax.swing.JLabel Lbl_TamP;
    private javax.swing.JLabel Lbl_TelD;
    private javax.swing.JLabel Lbl_ZonaD;
    private javax.swing.JLabel Lbl_nombre1;
    private javax.swing.JPanel Pnl_ingresoDatos;
    private javax.swing.JTextField Txt_DireD;
    private javax.swing.JTextField Txt_DireR;
    private com.toedter.calendar.JDateChooser Txt_Fecha;
    private javax.swing.JTextField Txt_Id;
    private javax.swing.JTextField Txt_NombreD;
    private javax.swing.JTextField Txt_TamP;
    private javax.swing.JTextField Txt_TelD;
    private javax.swing.JTextField Txt_ZonaD;
    // End of variables declaration//GEN-END:variables
}
