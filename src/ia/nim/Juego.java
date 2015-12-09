
package ia.nim;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author GCM-Ataks
 */

public class Juego extends javax.swing.JFrame {
    
    public Juego() {
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

        jPanel1 = new javax.swing.JPanel();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();
        txtVwMov = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnReiniciar = new javax.swing.JButton();
        txtVwTurno = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUno.setText("Pz. Uno");
        btnUno.setMaximumSize(new java.awt.Dimension(350, 600));
        btnUno.setMinimumSize(new java.awt.Dimension(350, 600));
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 83, -1));

        btnDos.setText("Pz. Dos");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 83, -1));

        btnTres.setText("Pz. Tres");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        getContentPane().add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 83, -1));

        btnCuatro.setText("Pz. Cuatro");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, -1, -1));

        btnCinco.setText("Pz. Cinco");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, 83, -1));

        btnSeis.setText("Pz. Seis");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 83, -1));

        btnSiete.setText("Pz. Siete");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 191, 83, -1));

        jLabel2.setText("Movimientos Restantes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 189, -1, -1));

        jLabel3.setText("Turno:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        btnTerminar.setText("TERMINAR TURNO");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 155, 110));

        txtVwMov.setText("0");
        getContentPane().add(txtVwMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 209, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 0, -1, 231));

        btnReiniciar.setText("Reiniciar Juego");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 213, -1, -1));

        txtVwTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVwTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVwTurno.setText("Turno");
        getContentPane().add(txtVwTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 160, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        btnUno.setEnabled(false);
        eliminarJuego();
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        btnDos.setEnabled(false);
        eliminarJuego();
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        btnTres.setEnabled(false);
        eliminarJuego();
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        btnCuatro.setEnabled(false);
        eliminarJuego();
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        btnCinco.setEnabled(false);
        eliminarJuego();
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        btnSeis.setEnabled(false);
        eliminarJuego();
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        btnSiete.setEnabled(false);
        eliminarJuego();
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        if(cantMov!=2)
            terminarTurno(true);
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        new IAFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReiniciarActionPerformed
    
    int cantPz = 7,cantMov = 2,turnoRonda=1;
    boolean jug = false;
    ArrayList<Integer> arbolPila = new ArrayList<>();
        int canPila = 0, valNodo = 1, nivel = 2,//puntero de pila nodo
            apuCanPila = 0, apuValNodo = 1, apuNivel = 2;//puntero de la cima
    
    public void eliminarJuego(){
            if(cantMov>=1){
                cantMov-=1;
                txtVwMov.setText(cantMov+"");
            } else {
                terminarTurno(true);
            }
            cantPz-=1;
            System.out.println(cantPz+"");
        if(cantPz==0){
            btnTerminar.setEnabled(false);
            JOptionPane.showMessageDialog(rootPane, "El jugador " + (jug==false?"MIN":"MAX") + " Pierde");
        }
    }
    
    public void terminarTurno(boolean canMove){
        if(canMove==true){
            turnoRonda++;
            cantMov = 2;
            txtVwMov.setText(cantMov+"");
            estrategiaGanadora(cantPz, turnoRonda);
            jug =!jug;
            txtVwTurno.setText("Jugador " + (jug==false?"MIN":"MAX"));
            System.out.println("Jugador " + (jug==false?"MIN":"MAX")+" turno #: "+turnoRonda);
        }
    }
    
    //FALSE JUGADOR 1==MIN; TRUE JUGADOR 2==MAX;
    //1 si PC; 0 si Humano
    public void iniciarJuego(int canJug){
        double turno = Math.random()*2;
        if(turno<1){
            jug = !jug;
        }
        if(canJug==1){
            try {
               generarArbol(7,0,1); 
            } catch (Exception e) {
            }
        }
        System.out.println("Jugador " + (jug==false?"MIN":"MAX")+" turno #: "+turnoRonda);
        JOptionPane.showMessageDialog(rootPane, "INICIA EL JUGADOR: " + (jug==false?"MIN":"MAX") + "\nJUGADOR DOS ES " + (canJug == 1 ? "COMPUTADOR":"HUMANO"));
    }

    public void generarArbol(int can, int val, int nvl){
        if(arbolPila.isEmpty()){
            arbolPila.add(apuCanPila,can);
            arbolPila.add(apuValNodo,val);
            arbolPila.add(apuNivel,nvl);
        }
        System.out.println("CANTIDAD DE ENTRADA: "+can);
        if(!jug){
            if((nvl==2||nvl==4||nvl==6)&&(can==1)){
                val++;
            }
        }else{ 
            if((nvl==1||nvl==3||nvl==5||nvl==7)&&(can==1)){
            val++;
            }
        }
        System.out.println("PADRE: "+can+", "+val+" EN EL NIVEL: " + nvl);
        System.out.println("Cantidad de nodos: "+(arbolPila.size()/3));
        agregarArbol(can, val, nvl);
        
    }
    
    public void agregarArbol(int can, int val, int nvl){
        nvl++;
        if(arbolPila.get(canPila)>=1){
                //AGEGA LOS NODOS
                if((can-1)>0){
                    arbolPila.add(arbolPila.size(),(can-1));
                    arbolPila.add(arbolPila.size(),val);
                    arbolPila.add(arbolPila.size(),nvl);
                }
                if((can-2)>0){
                    arbolPila.add(arbolPila.size(),(can-2));
                    arbolPila.add(arbolPila.size(),val);
                    arbolPila.add(arbolPila.size(),nvl);
                }if((can-3)>0){
                    arbolPila.add(arbolPila.size(),(can-3));
                    arbolPila.add(arbolPila.size(),val);
                    arbolPila.add(arbolPila.size(),nvl);
                }
                //IMPRIME EL ARBOL
                System.out.println("Nodos generados\n"+((can-1)>0?(can-1):" NO LO GENERO ")+", "+((can-2)>0?(can-2):" NO LO GENERO ")+", "+((can-3)>0?(can-3):" NO LO GENERO "));
                //MUEVE PUNTEROS DE PADRE
                canPila+=3;valNodo+=3;nivel+=3;
                System.out.println("\nMOVIENDO PADRE A: "+arbolPila.get(canPila)+", "+arbolPila.get(valNodo));
                System.out.println("Comenzando con el nuevo padre...\n\n");
                generarArbol(arbolPila.get(canPila), arbolPila.get(valNodo), arbolPila.get(nivel));
        }
    }
    
    public void estrategiaGanadora(int elimino, int turno){
        for(int a =0;a<arbolPila.size();a++){
            //System.out.println(arbolPila.get(a)+", "+arbolPila.get((a+1))+", "+arbolPila.get((a+2)));
        }
    }
    
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtVwMov;
    private javax.swing.JLabel txtVwTurno;
    // End of variables declaration//GEN-END:variables
}
