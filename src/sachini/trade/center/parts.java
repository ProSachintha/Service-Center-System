/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sachini.trade.center;

import javax.swing.JFrame;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sandakelum
 */
public class parts extends javax.swing.JFrame {

    /**
     * Creates new form veh
     */
    public parts() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        goextable();
    }
public ArrayList<extable>ss(){
        ArrayList<extable>ss =new ArrayList<>();
        
        try{
             Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachini_trade_center","root","");
            String extab="SELECT * from parts";
            Statement st=con.createStatement();
            ResultSet show=st.executeQuery(extab);
            extable sach;
            while (show.next()){
                sach=new extable(show.getString("vmodel"),show.getString("part_no"),show.getString("part_name"),show.getInt("qu"),show.getInt("item_price"),show.getString("side"),show.getString("status"));
                ss.add(sach);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return ss;
        
        
        
    }
    
    public void goextable(){
    ArrayList<extable>list=ss();
    DefaultTableModel exmod=(DefaultTableModel)parttab.getModel();
    Object[] line=new Object[7];
        int l;
    for(l=0;l<list.size();l++){
        line[0]=list.get(l).getvmodel();
        line[1]=list.get(l).getpart_no();
        line[2]=list.get(l).getpart_name();
        line[3]=list.get(l).getqu();
        line[4]=list.get(l).getitem_price();
        line[5]=list.get(l).getside();
        line[6]=list.get(l).getstats();
        exmod.addRow(line);
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        save = new javax.swing.JButton();
        vmodel = new javax.swing.JComboBox<>();
        side = new javax.swing.JComboBox<>();
        partno = new javax.swing.JTextField();
        iprice = new javax.swing.JTextField();
        qu = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        part_name = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        parttab = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sachini/trade/center/home.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1265, 30, 60, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SACHINI TRADE CENTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("V MODEL");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("SIDE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Part No");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Quontity");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Item Price");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("STATUS");

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        vmodel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "MAXI", "MAXI BIG", "MAXIMO", "THREE VEELS", "CAR", "OTHER" }));

        side.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOTH", "LEFT", "RIGHT", " " }));

        partno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partnoActionPerformed(evt);
            }
        });

        iprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipriceActionPerformed(evt);
            }
        });

        qu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("NEW PARTS");
        jPanel2.add(jLabel10);

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Part Name");

        part_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                part_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iprice)
                    .addComponent(qu)
                    .addComponent(side, 0, 135, Short.MAX_VALUE)
                    .addComponent(status)
                    .addComponent(part_name)
                    .addComponent(partno)
                    .addComponent(vmodel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(partno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(part_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(qu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(iprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel9))
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(save)
                    .addComponent(delete))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 390, 580));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        parttab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "V_MODEL", "PART No", "PART NAME", "QUONTITY", "ITEM PRICE", "SIDE", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        parttab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parttabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(parttab);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("SEARCH");

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(193, 468, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 830, 580));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sachini/trade/center/,,.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachini_trade_center","root","");

            int line=parttab.getSelectedRow();
            String val=(parttab.getModel().getValueAt(line,0).toString());

            String upd="UPDATE parts SET vmodel=?,part_name=?,qu=?,item_price=?,side=?,status=? WHERE part_no=?";
            PreparedStatement bvg = con.prepareStatement(upd);
            String vmod;
            String sd;
            
            vmod=vmodel.getSelectedItem().toString();
            bvg.setString(1,vmod);
            bvg.setString(7, partno.getText());
            bvg.setString(2, part_name.getText());
            bvg.setString(4,iprice.getText());
            bvg.setString(3,qu.getText());
            sd=side.getSelectedItem().toString();
            bvg.setString(5,sd);
            bvg.setString(6,status.getText());
            bvg.executeUpdate();

            JOptionPane.showMessageDialog(null,"success");
            vmodel.setSelectedIndex(0);
            side.setSelectedIndex(0);
            
            partno.setText("");
            part_name.setText("");
            iprice.setText("");
            qu.setText("");
            status.setText("");
            DefaultTableModel mod1=(DefaultTableModel)parttab.getModel();
            mod1.setRowCount(0);
            goextable();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachini_trade_center","root","");
            String partin = "insert into parts(vmodel,part_no,part_name,qu,item_price,side,status)values(?,?,?,?,?,?,?)";
            PreparedStatement bvg = con.prepareStatement(partin);
            String vmod;
            String sd;
            
            vmod=vmodel.getSelectedItem().toString();
            bvg.setString(1,vmod);
            bvg.setString(2, partno.getText());
            bvg.setString(3, part_name.getText());
            bvg.setString(4,iprice.getText());
            bvg.setString(5,qu.getText());
            sd=side.getSelectedItem().toString();
            bvg.setString(6,side.getSelectedItem().toString());
            bvg.setString(7,status.getText());
            bvg.executeUpdate();
            JOptionPane.showMessageDialog(null,"success");
            vmodel.setSelectedIndex(0);
            side.setSelectedIndex(0);
            part_name.setText("");
            partno.setText("");
            iprice.setText("");
            qu.setText("");
            status.setText("");
            DefaultTableModel mod1=(DefaultTableModel)parttab.getModel();
            mod1.setRowCount(0);
            goextable();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"error");

        }
    }//GEN-LAST:event_saveActionPerformed

    private void ipriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipriceActionPerformed

    private void quActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int mas=JOptionPane.showConfirmDialog(null,"Are Your Shure.You Wan't Delete This", "DELETE", JOptionPane.YES_NO_OPTION);
        if(mas==0){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachini_trade_center","root","");

            int line=parttab.getSelectedRow();
           

            String upd="DELETE FROM parts WHERE part_no=?";
            PreparedStatement bvg = con.prepareStatement(upd);
            

            bvg.setString(1,partno.getText());

            bvg.executeUpdate();

            JOptionPane.showMessageDialog(null,"success");
            vmodel.setSelectedIndex(0);
            side.setSelectedIndex(0);
            partno.setText("");
            part_name.setText("");
            iprice.setText("");
            qu.setText("");
            status.setText("");
            DefaultTableModel mod1=(DefaultTableModel)parttab.getModel();
            mod1.setRowCount(0);
            goextable();
    }//GEN-LAST:event_deleteActionPerformed
        catch(Exception e){
            
        }
    }}
    private void parttabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parttabMouseClicked
        int s=parttab.getSelectedRow();
        TableModel mod=parttab.getModel();
        try{
            String mod1=mod.getValueAt(s,0).toString();
            switch(mod1){
                case "MAXI":
                vmodel.setSelectedIndex(1);
                break;
                case "MAXI BIG":
                vmodel.setSelectedIndex(2);
                break;
                case "MAXIMO":
                vmodel.setSelectedIndex(3);
                break;
                case "THREE VEELS":
                vmodel.setSelectedIndex(4);
                break;
                case "CAR":
                vmodel.setSelectedIndex(5);
                break;
                case "OTHER":
                vmodel.setSelectedIndex(6);
                break;
            }
            String side1=mod.getValueAt(s,5).toString();

            switch(side1){
                case "BOTH":
                side.setSelectedIndex(0);
                break;
                case "LEFT":
                side.setSelectedIndex(1);
                break;
                case "RIGHT":
                side.setSelectedIndex(2);
                break;
                

            }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            
            
            

            partno.setText(mod.getValueAt(s,1).toString());
            part_name.setText(mod.getValueAt(s,2).toString());
            iprice.setText(mod.getValueAt(s,4).toString());
            qu.setText(mod.getValueAt(s,3).toString());
            status.setText(mod.getValueAt(s,6).toString());
    }//GEN-LAST:event_parttabMouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
       DefaultTableModel mod1=(DefaultTableModel)parttab.getModel();
        String src=search.getText().toString();
        TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(mod1);
        parttab.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(src));
    }//GEN-LAST:event_searchKeyReleased
            
        
    
    private void partnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partnoActionPerformed

    private void part_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_part_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_part_nameActionPerformed
        
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
            java.util.logging.Logger.getLogger(parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTextField iprice;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField part_name;
    private javax.swing.JTextField partno;
    private javax.swing.JTable parttab;
    private javax.swing.JTextField qu;
    private javax.swing.JButton save;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox<String> side;
    private javax.swing.JTextField status;
    private javax.swing.JButton update;
    private javax.swing.JComboBox<String> vmodel;
    // End of variables declaration//GEN-END:variables
}
