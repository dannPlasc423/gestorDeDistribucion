package practica9gestordedistribucion;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JfCalculadora extends javax.swing.JFrame {

    float numero1;
    float numero2;
    String operador;
    boolean igualar = false;
    
    public JfCalculadora() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSuma = new javax.swing.JButton();
        jbResta = new javax.swing.JButton();
        jbMultiplicacion = new javax.swing.JButton();
        jbDivision = new javax.swing.JButton();
        jbModulo = new javax.swing.JButton();
        jbPotencia = new javax.swing.JButton();
        jbIgual = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jtfOperaciones = new javax.swing.JTextField();
        jlbTitulo = new javax.swing.JLabel();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(310, 450));
        getContentPane().setLayout(null);

        jbSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Suma.jpg"))); // NOI18N
        jbSuma.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        jbSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSumaActionPerformed(evt);
            }
        });
        getContentPane().add(jbSuma);
        jbSuma.setBounds(20, 120, 52, 38);

        jbResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Resta.jpg"))); // NOI18N
        jbResta.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        jbResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRestaActionPerformed(evt);
            }
        });
        getContentPane().add(jbResta);
        jbResta.setBounds(80, 120, 52, 38);

        jbMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Multiplicacion.png"))); // NOI18N
        jbMultiplicacion.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        jbMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(jbMultiplicacion);
        jbMultiplicacion.setBounds(140, 120, 55, 38);

        jbDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Division.png"))); // NOI18N
        jbDivision.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        jbDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(jbDivision);
        jbDivision.setBounds(220, 120, 53, 38);

        jbModulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Modulo.png"))); // NOI18N
        jbModulo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        jbModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModuloActionPerformed(evt);
            }
        });
        getContentPane().add(jbModulo);
        jbModulo.setBounds(220, 180, 53, 38);

        jbPotencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Potencia.jpg"))); // NOI18N
        jbPotencia.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        jbPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPotenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jbPotencia);
        jbPotencia.setBounds(220, 240, 51, 37);

        jbIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Igual.png"))); // NOI18N
        jbIgual.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        jbIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIgualActionPerformed(evt);
            }
        });
        getContentPane().add(jbIgual);
        jbIgual.setBounds(220, 350, 52, 38);

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.png"))); // NOI18N
        jbEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 255)));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar);
        jbEliminar.setBounds(220, 300, 52, 37);

        jtfOperaciones.setBackground(new java.awt.Color(0, 0, 0));
        jtfOperaciones.setFont(new java.awt.Font("Harlow Solid Italic", 1, 18)); // NOI18N
        jtfOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        jtfOperaciones.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfOperaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 3, true));
        jtfOperaciones.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfOperacionesActionPerformed(evt);
            }
        });
        getContentPane().add(jtfOperaciones);
        jtfOperaciones.setBounds(20, 70, 254, 30);

        jlbTitulo.setBackground(new java.awt.Color(0, 0, 0));
        jlbTitulo.setFont(new java.awt.Font("Harlow Solid Italic", 1, 30)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(0, 255, 255));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Titulo.jpg"))); // NOI18N
        jlbTitulo.setText("Alien Calculator");
        jlbTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jlbTitulo);
        jlbTitulo.setBounds(10, 10, 260, 39);

        jb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/1.jpg"))); // NOI18N
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1);
        jb1.setBounds(20, 180, 50, 38);

        jb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/2.jpg"))); // NOI18N
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jb2);
        jb2.setBounds(80, 180, 52, 41);

        jb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/3.jpg"))); // NOI18N
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        getContentPane().add(jb3);
        jb3.setBounds(140, 178, 50, 38);

        jb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/4.jpg"))); // NOI18N
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jb4);
        jb4.setBounds(18, 237, 48, 38);

        jb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/5.jpg"))); // NOI18N
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });
        getContentPane().add(jb5);
        jb5.setBounds(78, 237, 50, 38);

        jb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/6.jpg"))); // NOI18N
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });
        getContentPane().add(jb6);
        jb6.setBounds(140, 237, 40, 38);

        jb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/7.jpg"))); // NOI18N
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });
        getContentPane().add(jb7);
        jb7.setBounds(20, 300, 47, 38);

        jb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/8.jpg"))); // NOI18N
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
        getContentPane().add(jb8);
        jb8.setBounds(77, 296, 50, 38);

        jb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/9.jpg"))); // NOI18N
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });
        getContentPane().add(jb9);
        jb9.setBounds(140, 300, 40, 38);

        jb0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/0.jpg"))); // NOI18N
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });
        getContentPane().add(jb0);
        jb0.setBounds(80, 350, 53, 38);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSumaActionPerformed
        numero1 = Float.parseFloat(jtfOperaciones.getText());
        operador = "+";
        jtfOperaciones.setText("");
    }//GEN-LAST:event_jbSumaActionPerformed

    private void jtfOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfOperacionesActionPerformed
        
    }//GEN-LAST:event_jtfOperacionesActionPerformed

    private void jbDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDivisionActionPerformed
        numero1 = Float.parseFloat(jtfOperaciones.getText());
        operador = "/";
        jtfOperaciones.setText("");
    }//GEN-LAST:event_jbDivisionActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        if(igualar == true)
            jtfOperaciones.setText("");
        jtfOperaciones.setText(jtfOperaciones.getText() + "5");
        igualar = false; 
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        if(igualar == true)
            jtfOperaciones.setText("");
        jtfOperaciones.setText(jtfOperaciones.getText() + "1");
        igualar = false; 
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        if(igualar == true)
            jtfOperaciones.setText("");
        jtfOperaciones.setText(jtfOperaciones.getText() + "2");
        igualar = false; 
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        if(igualar == true)
            jtfOperaciones.setText("");
        jtfOperaciones.setText(jtfOperaciones.getText() + "3");
        igualar = false; 
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        if(igualar == true)
            jtfOperaciones.setText("");
        jtfOperaciones.setText(jtfOperaciones.getText() + "4");
        igualar = false; 
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        if(igualar == true)
            jtfOperaciones.setText("");
        jtfOperaciones.setText(jtfOperaciones.getText() + "6");
        igualar = false; 
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        if(igualar == true)
            jtfOperaciones.setText("");
        jtfOperaciones.setText(jtfOperaciones.getText() + "7");
        igualar = false; 
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        if(igualar == true)
            jtfOperaciones.setText("");
        jtfOperaciones.setText(jtfOperaciones.getText() + "8");
        igualar = false; 
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        if(igualar == true)
            jtfOperaciones.setText("");
        jtfOperaciones.setText(jtfOperaciones.getText() + "9");
        igualar = false; 
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        if(igualar == true)
            jtfOperaciones.setText("");
        jtfOperaciones.setText(jtfOperaciones.getText() + "0");
        igualar = false; 
    }//GEN-LAST:event_jb0ActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        jtfOperaciones.setText("");
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRestaActionPerformed
        numero1 = Float.parseFloat(jtfOperaciones.getText());
        operador = "-";
        jtfOperaciones.setText("");
    }//GEN-LAST:event_jbRestaActionPerformed

    private void jbMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiplicacionActionPerformed
        numero1 = Float.parseFloat(jtfOperaciones.getText());
        operador = "x";
        jtfOperaciones.setText("");
    }//GEN-LAST:event_jbMultiplicacionActionPerformed

    private void jbModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModuloActionPerformed
        numero1 = Float.parseFloat(jtfOperaciones.getText());
        operador = "%";
        jtfOperaciones.setText("");
    }//GEN-LAST:event_jbModuloActionPerformed

    private void jbIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIgualActionPerformed
        numero2 = Float.parseFloat(jtfOperaciones.getText());
        switch(operador){
            case "+":
                jtfOperaciones.setText(Float.toString(numero1 + numero2));
                break;
            case "-":
                jtfOperaciones.setText(Float.toString(numero1 - numero2));
                break;
            case "x":
                jtfOperaciones.setText(Float.toString(numero1 * numero2));
                break;
            case "/":
                jtfOperaciones.setText(Float.toString(numero1 / numero2));
                break;
            case "%":
                jtfOperaciones.setText(Float.toString(numero1 % numero2));
                break;
            case "^":
                jtfOperaciones.setText(Double.toString(Math.pow(numero1, numero2)));
                break;
        }
        igualar = true;
    }//GEN-LAST:event_jbIgualActionPerformed

    private void jbPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPotenciaActionPerformed
        numero1 = Float.parseFloat(jtfOperaciones.getText());
        operador = "^";
        jtfOperaciones.setText("");
    }//GEN-LAST:event_jbPotenciaActionPerformed

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
            java.util.logging.Logger.getLogger(JfCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbDivision;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbIgual;
    private javax.swing.JButton jbModulo;
    private javax.swing.JButton jbMultiplicacion;
    private javax.swing.JButton jbPotencia;
    private javax.swing.JButton jbResta;
    private javax.swing.JButton jbSuma;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JTextField jtfOperaciones;
    // End of variables declaration//GEN-END:variables
public class ImagenFondo extends JPanel{
    
    }
}
