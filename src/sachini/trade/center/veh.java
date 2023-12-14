/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sachini.trade.center;

import com.sun.jndi.ldap.Connection;
import static java.lang.Class.forName;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.management.Query.value;
import static javax.management.Query.value;
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
public class veh extends javax.swing.JFrame {

    /**
     * Creates new form veh
     */
    public veh() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        gotable();
        
    }
    public ArrayList<showtable>ssg(){
        ArrayList<showtable>ssg =new ArrayList<>();
        
        try{
             Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachini_trade_center","root","");
            String vehtab="SELECT * from new_veh";
            Statement st=con.createStatement();
            ResultSet show=st.executeQuery(vehtab);
            showtable sach;
            while (show.next()){
                sach=new showtable(show.getString("model"),show.getString("spec"),show.getString("color"),show.getString("chessy"),show.getString("engin"),show.getInt("year"),show.getString("status"));
                ssg.add(sach);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return ssg;
        
        
        
    }
    
    public void gotable(){
    ArrayList<showtable>list=ssg();
    DefaultTableModel mod=(DefaultTableModel)vehtable.getModel();
    Object[] line=new Object[7];
        int i;
    for(i=0;i<list.size();i++){
        line[0]=list.get(i).getmodel();
        line[1]=list.get(i).getspec();
        line[2]=list.get(i).getcolor();
        line[3]=list.get(i).getchessy();
        line[4]=list.get(i).getengin();
        line[5]=list.get(i).getyear();
        line[6]=list.get(i).getstats();
        mod.addRow(line);
    }
    coun();
}
    public void coun(){
    try{
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachini_trade_center","root","");
        String tot="Select count(engin) from new_veh";
        PreparedStatement bvg = con.prepareStatement(tot);
        ResultSet show=bvg.executeQuery();
        if(show.next()){
            String sum=show.getString("count(engin)");
            cou.setText(sum);
        }
        
    }
    catch(Exception e){
       JOptionPane.showMessageDialog(null,e); 
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        save = new javax.swing.JButton();
        model = new javax.swing.JComboBox<>();
        spec = new javax.swing.JComboBox<>();
        color = new javax.swing.JComboBox<>();
        chessy = new javax.swing.JTextField();
        engin = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehtable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        cou = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("MODEL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("SPECIFIC");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("COLOURS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CHESSY NO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ENGIN NO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("YEAR");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("STATUS");

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

        model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "MAXI", "MAXI BIG", "MAXIMO", "THREE VEELS", "CAR", "OTHER" }));

        spec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "NORMAL", "P/S", "A/C", "SPORT", "" }));

        color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "BLACK", "WHITE", "RED", "BLUE", "DARK BLUE", "GRAY" }));

        engin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enginActionPerformed(evt);
            }
        });

        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("NEW VEHICLES");
        jPanel2.add(jLabel9);

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(model, 0, 135, Short.MAX_VALUE)
                            .addComponent(spec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(color, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chessy)
                            .addComponent(engin)
                            .addComponent(year)
                            .addComponent(status)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete)))
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(51, 51, 51)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(spec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(color, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel5))
                                            .addComponent(chessy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel6))
                                    .addComponent(engin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addComponent(jLabel7))
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8))
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(save)
                    .addComponent(delete))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 390, 580));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        vehtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MODEL", "SPESIFICS", "COLOURE", "CHESSY_NO", "ENGIN_NO", "YEAR", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        vehtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vehtable);

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 830, 580));

        cou.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cou.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cou, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, 120, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sachini/trade/center/,,.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void enginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enginActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       try{
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachini_trade_center","root","");
        String vehin = "insert into new_veh(model,spec,color,chessy,engin,year,status,rno)values(?,?,?,?,?,?,?,?)";
        PreparedStatement bvg = con.prepareStatement(vehin);
        String mod;
        String sp;
        String col;
        mod=model.getSelectedItem().toString();
        bvg.setString(1,mod); 
        sp=spec.getSelectedItem().toString();
        bvg.setString(2,sp);
        col=color.getSelectedItem().toString();
        bvg.setString(3,col);
        bvg.setString(4, chessy.getText());
        bvg.setString(5,engin.getText());
        bvg.setString(6,year.getText());
        bvg.setString(7,status.getText());
        int n = Integer.parseInt(cou.getText());
        int w=n+1;
        bvg.setInt(8,w);
        bvg.executeUpdate();
        JOptionPane.showMessageDialog(null,"success");
        model.setSelectedIndex(0);
        spec.setSelectedIndex(0);
        color.setSelectedIndex(0);
        chessy.setText("");
        engin.setText("");
        year.setText("");
        status.setText("");
        DefaultTableModel mod1=(DefaultTableModel)vehtable.getModel();
        mod1.setRowCount(0);
        gotable();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
           
       }
    }//GEN-LAST:event_saveActionPerformed

    private void vehtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehtableMouseClicked
        int s=vehtable.getSelectedRow();
        TableModel mod=vehtable.getModel();
        try{
        String mod1=mod.getValueAt(s,0).toString();
        switch(mod1){
            case "MAXI":
                model.setSelectedIndex(1);
                break;
            case "MAXI BIG":
                model.setSelectedIndex(2);
                break;
            case "MAXIMO":
                model.setSelectedIndex(3);
                break;
            case "THREE VEELS":
                model.setSelectedIndex(4);
                break;
            case "CAR":
                model.setSelectedIndex(5);
                break;
            case "OTHER":
                model.setSelectedIndex(6);
                break;
        }}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String spec1=mod.getValueAt(s,1).toString();
        
        switch(spec1){
            case "NORMAL":
                spec.setSelectedIndex(1);
                break;
            case "P/S":
                spec.setSelectedIndex(2);
                break;
            case "A/C":
                spec.setSelectedIndex(3);
                break;
            case "SPORT":
                spec.setSelectedIndex(4);
                break;
            
        }
        String color1=mod.getValueAt(s,2).toString();
        switch(color1){
            case "BLACK":
                color.setSelectedIndex(1);
                break;
            case "WHITE":
                color.setSelectedIndex(2);
                break;
            case "RED":
                color.setSelectedIndex(3);
                break;
            case "BLUE":
                color.setSelectedIndex(4);
                break;
            case "DARK BLUE":
                color.setSelectedIndex(5);
                break;
            case "GRAY":
                color.setSelectedIndex(6);
                break;
        }
        
        chessy.setText(mod.getValueAt(s,3).toString());
        engin.setText(mod.getValueAt(s,4).toString());
        year.setText(mod.getValueAt(s,5).toString());
        status.setText(mod.getValueAt(s,6).toString());
    }//GEN-LAST:event_vehtableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachini_trade_center","root","");
        
        int line=vehtable.getSelectedRow();
        String val=(vehtable.getModel().getValueAt(line,0).toString());
        
        
        String upd="UPDATE new_veh SET model=?,spec=?,color=?,chessy=?,year=?,status=? WHERE engin=?";
        PreparedStatement bvg = con.prepareStatement(upd);
        String mod;
        String sp;
        String col;
        mod=model.getSelectedItem().toString();
        bvg.setString(1,mod); 
        sp=spec.getSelectedItem().toString();
        bvg.setString(2,sp);
        col=color.getSelectedItem().toString();
        bvg.setString(3,col);
        bvg.setString(4, chessy.getText());
        bvg.setString(7,engin.getText());
        bvg.setString(5,year.getText());
        bvg.setString(6,status.getText());
        bvg.executeUpdate();
       
        JOptionPane.showMessageDialog(null,"success");
        model.setSelectedIndex(0);
        spec.setSelectedIndex(0);
        color.setSelectedIndex(0);
        chessy.setText("");
        engin.setText("");
        year.setText("");
        status.setText("");
        DefaultTableModel mod1=(DefaultTableModel)vehtable.getModel();
        mod1.setRowCount(0);
        gotable();
        
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int mas=JOptionPane.showConfirmDialog(null,"Are Your Shure.You Wan't Delete This", "DELETE", JOptionPane.YES_NO_OPTION);
        if(mas==0){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sachini_trade_center","root","");
        
        int line=vehtable.getSelectedRow();
        String val=(vehtable.getModel().getValueAt(line,0).toString());
        
        
        String upd="DELETE FROM new_veh WHERE engin=?";
        PreparedStatement bvg = con.prepareStatement(upd);
        String mod;
        String sp;
        String col;
        
        bvg.setString(1,engin.getText());
       
        bvg.executeUpdate();
       
        JOptionPane.showMessageDialog(null,"success");
        model.setSelectedIndex(0);
        spec.setSelectedIndex(0);
        color.setSelectedIndex(0);
        chessy.setText("");
        engin.setText("");
        year.setText("");
        status.setText("");
        DefaultTableModel mod1=(DefaultTableModel)vehtable.getModel();
        mod1.setRowCount(0);
        gotable();
    }//GEN-LAST:event_deleteActionPerformed
 catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }}

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
         
        DefaultTableModel mod1=(DefaultTableModel)vehtable.getModel();
        String src=search.getText().toString();
        TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(mod1);
        vehtable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(src));
    }//GEN-LAST:event_searchKeyReleased

    


     
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
            java.util.logging.Logger.getLogger(veh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(veh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(veh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(veh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new veh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chessy;
    private javax.swing.JComboBox<String> color;
    private javax.swing.JLabel cou;
    private javax.swing.JButton delete;
    private javax.swing.JTextField engin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JComboBox<String> model;
    private javax.swing.JButton save;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox<String> spec;
    private javax.swing.JTextField status;
    private javax.swing.JButton update;
    private javax.swing.JTable vehtable;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
