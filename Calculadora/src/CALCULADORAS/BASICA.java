package CALCULADORAS;
import MENU.MENU_PRINC;
import javax.swing.JOptionPane;
/**
 *
 * @author Mauricio Pelaez
 */
public class BASICA extends javax.swing.JFrame {

    public BASICA() {
        initComponents();
        this.setLocation(290, 80);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Titulo = new javax.swing.JLabel();
        btn_Cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_Operacion = new javax.swing.JLabel();
        lbl_Resultado = new javax.swing.JLabel();
        lbl_Signo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_Cancelar = new javax.swing.JButton();
        btn_Raiz = new javax.swing.JButton();
        btn_Potencia = new javax.swing.JButton();
        btn_Divicion = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_Multiplicacion = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_Suma = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_Resta = new javax.swing.JButton();
        btn_Igual = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_Punto = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 153), new java.awt.Color(0, 255, 153)));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo.setText("CALCULADORA BASICA");
        jPanel1.add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, -1));

        btn_Cerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Cerrar.setText("CERRAR");
        btn_Cerrar.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 80, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(0, 255, 153), new java.awt.Color(0, 255, 153)));

        lbl_Operacion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_Operacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lbl_Resultado.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_Resultado.setForeground(new java.awt.Color(255, 204, 51));
        lbl_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Resultado.setText("0");

        lbl_Signo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_Signo.setForeground(new java.awt.Color(102, 255, 255));
        lbl_Signo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_Operacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Signo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Signo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 150));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Cancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Cancelar.setText("C");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 23, 70, 50));

        btn_Raiz.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_Raiz.setText("√");
        btn_Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RaizActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 23, 70, 50));

        btn_Potencia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Potencia.setText("^");
        btn_Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PotenciaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 23, 70, 50));

        btn_Divicion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Divicion.setText("/");
        btn_Divicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivicionActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Divicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 84, 70, 50));

        btn_8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 84, 70, 50));

        btn_7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 84, 70, 50));

        btn_9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 84, 70, 50));

        btn_Multiplicacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Multiplicacion.setText("x");
        btn_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplicacionActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 145, 70, 50));

        btn_4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 145, 70, 50));

        btn_5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 145, 70, 50));

        btn_6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 145, 70, 50));

        btn_Suma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Suma.setText("+");
        btn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 267, 70, 50));

        btn_1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 206, 70, 50));

        btn_0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 267, 70, 50));

        btn_Resta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Resta.setText("-");
        btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 206, 70, 50));

        btn_Igual.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_Igual.setText("=");
        btn_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IgualActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 267, 70, 50));

        btn_2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 206, 70, 50));

        btn_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 206, 70, 50));

        btn_Punto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Punto.setText(".");
        btn_Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PuntoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 267, 70, 50));

        btn_Limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Limpiar.setText("←");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 23, 70, 50));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 320, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 380, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        this.setVisible(false);
        MENU_PRINC.ventana = false;
    }//GEN-LAST:event_btn_CerrarActionPerformed

    // VARIABLES GLOBALES
    String Valor1 = "0";
    String Valor2 = "0";
    String Signo = "+";
    
    
    //INGRESO DE NÚMEROS
    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=15){
            if(cadena.equals("0")){
                lbl_Resultado.setText("0");
            }else{
                lbl_Resultado.setText(lbl_Resultado.getText()+"0");
            } 
        }  
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=15){
            if(cadena.equals("0")){
                lbl_Resultado.setText("1");
            }else{
                lbl_Resultado.setText(lbl_Resultado.getText()+"1");
            }   
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=15){
            if(cadena.equals("0")){
                lbl_Resultado.setText("2");
            }else{
                lbl_Resultado.setText(lbl_Resultado.getText()+"2");
            }   
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=15){
            if(cadena.equals("0")){
                lbl_Resultado.setText("3");
            }else{
                lbl_Resultado.setText(lbl_Resultado.getText()+"3");
            }   
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=15){
            if(cadena.equals("0")){
                lbl_Resultado.setText("4");
            }else{
                lbl_Resultado.setText(lbl_Resultado.getText()+"4");
            }   
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=15){
            if(cadena.equals("0")){
                lbl_Resultado.setText("5");
            }else{
                lbl_Resultado.setText(lbl_Resultado.getText()+"5");
            }   
        }
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=15){
            if(cadena.equals("0")){
                lbl_Resultado.setText("6");
            }else{
                lbl_Resultado.setText(lbl_Resultado.getText()+"6");
            }   
        }
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=15){
            if(cadena.equals("0")){
                lbl_Resultado.setText("7");
            }else{
                lbl_Resultado.setText(lbl_Resultado.getText()+"7");
            }   
        }
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=15){
            if(cadena.equals("0")){
                lbl_Resultado.setText("8");
            }else{
                lbl_Resultado.setText(lbl_Resultado.getText()+"8");
            }   
        }
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=15){
            if(cadena.equals("0")){
                lbl_Resultado.setText("9");
            }else{
                lbl_Resultado.setText(lbl_Resultado.getText()+"9");
            }   
        }
    }//GEN-LAST:event_btn_9ActionPerformed

    //VALIDAR SI YA SE INGRESO EL PUNTO "DECIAL"
    public static boolean existepunto (String cadena){
        boolean resp;
        resp = false;
        
        for(int i=0; i<cadena.length(); i++){
            if(cadena.substring(i, i+1).equals(".")){
                resp = true;
                break;
            }
        }
        return resp;
    }
    
    //INGRESO DEL PUNTO
    private void btn_PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PuntoActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()<=0){
            lbl_Resultado.setText("0.");
        }else{
            if(!existepunto(lbl_Resultado.getText())){
                lbl_Resultado.setText(lbl_Resultado.getText()+".");
            }
        }
    }//GEN-LAST:event_btn_PuntoActionPerformed

    // LIMPIAR O BORRAR SOLO UN NÚMERO A LA VEZ
    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        String cadena;
        cadena = lbl_Resultado.getText();
        
        if(cadena.length()>0){
            cadena = cadena.substring(0, cadena.length()-1);
            lbl_Resultado.setText(cadena);
        }
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    
    //CALCELAR LA ACCION O LIMPÍAR TODO
    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        lbl_Operacion.setText("");
        lbl_Resultado.setText("0");
    }//GEN-LAST:event_btn_CancelarActionPerformed


    //ACCIÓN DEL BOTÓN 'IGUAL'
    private void btn_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IgualActionPerformed

        String resultado;
        Valor2 = lbl_Resultado.getText();
        if(!Valor2.equals("")){
            resultado = Calculadora(Valor1, Valor2, Signo);
            lbl_Operacion.setText("");
            lbl_Signo.setText("");
            lbl_Resultado.setText(resultado);
        }
        
        if(lbl_Resultado.getText().equals("Infinity")){
            lbl_Resultado.setText("0");
        }
        
        if(lbl_Resultado.getText().equals("0.0")){
            lbl_Resultado.setText("0");
        }
    }//GEN-LAST:event_btn_IgualActionPerformed

    //ACCIÓN DEL BOTÓN 'SUMA'
    private void btn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumaActionPerformed

        if(!lbl_Resultado.getText().equals("")){
            Valor1 = lbl_Resultado.getText();
            Signo = "+";
            lbl_Signo.setText(Signo);
            lbl_Operacion.setText(Valor1);
            lbl_Resultado.setText("0"); 
        } 
    }//GEN-LAST:event_btn_SumaActionPerformed

    //ACCIÓN DEL BOTÓN 'RESTA'
    private void btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestaActionPerformed
        
        if(!lbl_Resultado.getText().equals("")){
            Valor1 = lbl_Resultado.getText();
            Signo = "-";
            lbl_Signo.setText(Signo);
            lbl_Operacion.setText(Valor1);
            lbl_Resultado.setText("0"); 
        } 
    }//GEN-LAST:event_btn_RestaActionPerformed

    //ACCIÓN DEL BOTÓN 'MULTIPLICACIÓN'
    private void btn_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplicacionActionPerformed
       
        if(!lbl_Resultado.getText().equals("")){
            Valor1 = lbl_Resultado.getText();
            Signo = "x";
            lbl_Signo.setText(Signo);
            lbl_Operacion.setText(Valor1);
            lbl_Resultado.setText("0"); 
        }
    }//GEN-LAST:event_btn_MultiplicacionActionPerformed

    //ACCIÓN DEL BOTÓN 'DIVICIÓN'
    private void btn_DivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivicionActionPerformed
        
        if(!lbl_Resultado.getText().equals("")){
            Valor1 = lbl_Resultado.getText();
            Signo = "/";
            lbl_Signo.setText(Signo);
            lbl_Operacion.setText(Valor1);
            lbl_Resultado.setText("0"); 
        }
    }//GEN-LAST:event_btn_DivicionActionPerformed

    //ACCIÓN DEL BOTÓN 'RAIZ'
    private void btn_RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RaizActionPerformed
        if(!lbl_Resultado.getText().equals("")){
            Valor1 = lbl_Resultado.getText();
            Signo = "√";
            lbl_Signo.setText(Signo);
            
            String resultado;
            resultado = Calculadora(Valor1, Valor2, Signo);
            lbl_Operacion.setText(resultado);
        }
    }//GEN-LAST:event_btn_RaizActionPerformed

    //ACCIÓN DEL BOTÓN 'POTENCIA'
    private void btn_PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PotenciaActionPerformed
        if(!lbl_Resultado.getText().equals("")){
            Valor1 = lbl_Resultado.getText();
            Signo = "^";
            lbl_Signo.setText(Signo);
            lbl_Operacion.setText(Valor1);
            lbl_Resultado.setText("0"); 
        }
    }//GEN-LAST:event_btn_PotenciaActionPerformed

    
    // FUNCIONES DE LA CALCULADORA BASICA
    public static String Calculadora(String valor1, String valor2, String signo){
        Double resultado = 0.0;
        String result;
        try {
            
            if(signo.equals("-")){
                resultado = Double.parseDouble(valor1) - Double.parseDouble(valor2);
            }
        
            if(signo.equals("+")){
                resultado = Double.parseDouble(valor1) + Double.parseDouble(valor2);      
            }   
       
            if(signo.equals("x")){       
                resultado = Double.parseDouble(valor1) * Double.parseDouble(valor2);    
            }
               
            if(signo.equals("/")){              
                resultado = Double.parseDouble(valor1) / Double.parseDouble(valor2);
                   
                if(valor2.equals("0")){
                    JOptionPane.showMessageDialog(null, "¡No se puede divir entre cero(0)!", "ERROR...(-_-)", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
            if(signo.equals("√")){       
                resultado = Math.sqrt(Double.parseDouble(valor1));
            }
            
            if(signo.equals("^")){       
                resultado = Math.pow(Double.parseDouble(valor1), Double.parseDouble(valor2));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡No ingreso valores validos!", "ERROR...(-_-)", JOptionPane.ERROR_MESSAGE);
        }
        result = resultado.toString();
        return result;
    }
    
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
            java.util.logging.Logger.getLogger(BASICA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BASICA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BASICA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BASICA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BASICA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Divicion;
    private javax.swing.JButton btn_Igual;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Multiplicacion;
    private javax.swing.JButton btn_Potencia;
    private javax.swing.JButton btn_Punto;
    private javax.swing.JButton btn_Raiz;
    private javax.swing.JButton btn_Resta;
    private javax.swing.JButton btn_Suma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_Operacion;
    private javax.swing.JLabel lbl_Resultado;
    private javax.swing.JLabel lbl_Signo;
    private javax.swing.JLabel lbl_Titulo;
    // End of variables declaration//GEN-END:variables

}
