/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicewebclient;

import java.util.ArrayList;

/**
 *
 * @author jana
 */
public class InvoiceGUI extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceGUI
     */
    public InvoiceGUI() {
        initComponents();
        proxy = (new InvoiceWebService_Service()).getInvoiceWebServicePort();
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
        itemName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        unitCost = new javax.swing.JTextField();
        sgst = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cgst = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cess = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        count = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invoice Generator");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Item Name");

        itemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Quantity");

        quantity.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Unit Cost");

        unitCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitCostActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("SGST");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CGST");

        cgst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cgstActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cess");

        cess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cessActionPerformed(evt);
            }
        });

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Count:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(sgst, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(unitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cgst, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cess)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jButton1)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(count)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cgst, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sgst, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cess, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(jButton1)
                    .addComponent(jLabel7)
                    .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cessActionPerformed

    private void unitCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitCostActionPerformed

    private void cgstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cgstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cgstActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        
        new Recipt().setVisible(true);
       //result.setText(itemName1 + "\n" + getsubTotal + "\n" + getcgst + "\n" + getsgst + "\n" + getcess + "\n" + gettotalCost);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemNameActionPerformed

    void compute(){
    }
    
    void clear(){
        itemName.setText("");
        unitCost.setText("");
        cgst.setText("");
        sgst.setText("");
        cess.setText("");
        quantity.setText("");
    }
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        itemName1 = itemName.getText();
        quantity1 = Double.parseDouble(quantity.getText());
        unitcost1 = Double.parseDouble(unitCost.getText());
        cgstpercent = Double.parseDouble(cgst.getText());
        sgstpercent = Double.parseDouble(sgst.getText());
        cesspercent = Double.parseDouble(cess.getText());
        
        getsubTotal = Double.parseDouble(proxy.subTotal(quantity1, unitcost1));
        getcgst = Double.parseDouble(proxy.cgst(cgstpercent));
        getsgst = Double.parseDouble(proxy.sgst(sgstpercent));
        getcess = Double.parseDouble(proxy.cess(cesspercent));
        gettotalCost += Double.parseDouble(proxy.totalCost());
        
        itemNamelist.add(itemName1);
        quanttitylist.add(quantity1);
        unitcostlist.add(unitcost1);
        cgstpercentlist.add(cgstpercent);
        sgstpercentlist.add( sgstpercent);
        cesspercent1ist.add(cesspercent);
        getsubTotallist.add(getsubTotal);
        getcgstlist.add(getcgst);
        getsgstlist.add(getsgst);
        getcesslist.add(getcess);
        
        for (int i = 0; i < itemNamelist.size(); i++)
           System.out.print(itemNamelist.get(i) + " "); 
        count.setText("" + ++con);
        clear();
    }//GEN-LAST:event_addbtnActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField cess;
    private javax.swing.JTextField cgst;
    private javax.swing.JTextField count;
    private javax.swing.JTextField itemName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField sgst;
    private javax.swing.JTextField unitCost;
    // End of variables declaration//GEN-END:variables

    int con = 0;
    static String itemName1;
    static double quantity1, unitcost1, cgstpercent, sgstpercent, cesspercent;
    static double getsubTotal, getcgst, getsgst, getcess;
    static Double gettotalCost = 0.0;
    InvoiceWebService proxy;
    InvoiceWebService webSerive;
    static ArrayList<String> itemNamelist = new ArrayList<>();
    static ArrayList<Double> quanttitylist = new ArrayList<>();
    static ArrayList<Double> unitcostlist = new ArrayList<>();
    static ArrayList<Double> cgstpercentlist = new ArrayList<>();
    static ArrayList<Double> sgstpercentlist = new ArrayList<>();
    static ArrayList<Double> cesspercent1ist = new ArrayList<>();
    static ArrayList<Double> getsubTotallist = new ArrayList<>();
    static ArrayList<Double> getcgstlist = new ArrayList<>();
    static ArrayList<Double> getsgstlist = new ArrayList<>();
    static ArrayList<Double> getcesslist = new ArrayList<>();
    static ArrayList<Double> gettotalCost1ist = new ArrayList<>();
}

