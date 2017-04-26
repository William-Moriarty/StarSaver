package starsaver;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;


/**
 *
 * @author t00119587
 */
public class RecordStarForm extends javax.swing.JFrame {

    MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
    MongoDatabase db = mongoClient.getDatabase("starSaver");
    MongoCollection starColl = db.getCollection("stars");
       
    DefaultTreeModel model;
    DefaultMutableTreeNode  selectedNode;
    
    public RecordStarForm() {
        initComponents();
        model =(DefaultTreeModel)tree_planets.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - William Moriarty
    private void initComponents() {
        lbl_header = new JLabel();
        btn_add = new JButton();
        jPanel1 = new JPanel();
        txt_id = new JTextField();
        lbl_id = new JLabel();
        txt_name = new JTextField();
        lbl_name = new JLabel();
        cbo_type = new JComboBox<>();
        lbl_type = new JLabel();
        txt_const = new JTextField();
        lbl_constellation = new JLabel();
        txt_dist = new JTextField();
        lbl_distance = new JLabel();
        txt_radius = new JTextField();
        lbl_lightyears = new JLabel();
        lbl_radius = new JLabel();
        lbl_Km = new JLabel();
        lbl_mag = new JLabel();
        txt_mag = new JTextField();
        lbl_M = new JLabel();
        txt_mass = new JTextField();
        lbl_mass = new JLabel();
        lbl_KG = new JLabel();
        lbl_temp = new JLabel();
        txt_temp = new JTextField();
        lbl_K = new JLabel();
        lbl_lum = new JLabel();
        txt_lum = new JTextField();
        lbl_L = new JLabel();
        jLabel3 = new JLabel();
        jPanel2 = new JPanel();
        jScrollPane3 = new JScrollPane();
        tree_planets = new JTree();
        btn_del = new JButton();
        btn_addBody = new JButton();
        txt_body = new JTextField();
        lbl_name_sat = new JLabel();
        jLabel1 = new JLabel();
        lbl_hier = new JLabel();
        lbl_sat = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contentPane = getContentPane();

        //---- lbl_header ----
        lbl_header.setFont(new Font("Tahoma", Font.BOLD, 24));
        lbl_header.setText("Record Star Properties");

        //---- btn_add ----
        btn_add.setText("Add Record");
        btn_add.addActionListener(e -> btn_addActionPerformed(e));

        //======== jPanel1 ========
        {

            // JFormDesigner evaluation mark
            jPanel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), jPanel1.getBorder())); jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- lbl_id ----
            lbl_id.setText("ID");

            //---- lbl_name ----
            lbl_name.setText("Name");

            //---- cbo_type ----
            cbo_type.setModel(new DefaultComboBoxModel<>(new String[] {
                "-",
                "O",
                "B",
                "A",
                "F",
                "G ",
                "K",
                "M"
            }));

            //---- lbl_type ----
            lbl_type.setText("Type");

            //---- lbl_constellation ----
            lbl_constellation.setText("Constellation");

            //---- lbl_distance ----
            lbl_distance.setText("Distance*");

            //---- lbl_lightyears ----
            lbl_lightyears.setText("Lightyears from Earth");

            //---- lbl_radius ----
            lbl_radius.setText("Radius*");

            //---- lbl_Km ----
            lbl_Km.setText("R");

            //---- lbl_mag ----
            lbl_mag.setText("Magnitude*");

            //---- lbl_M ----
            lbl_M.setText("Ma");

            //---- lbl_mass ----
            lbl_mass.setText("Mass*");

            //---- lbl_KG ----
            lbl_KG.setText("M");

            //---- lbl_temp ----
            lbl_temp.setText("Surface Temperature*");

            //---- lbl_K ----
            lbl_K.setText("K");

            //---- lbl_lum ----
            lbl_lum.setText("Luminosity*");

            //---- lbl_L ----
            lbl_L.setText("L");

            //---- jLabel3 ----
            jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 10));
            jLabel3.setText("* will only accept decimal or numeric values");

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(109, 109, 109)
                                            .addComponent(lbl_id, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                                        .addComponent(lbl_constellation)
                                        .addComponent(lbl_type))
                                    .addComponent(lbl_name)
                                    .addComponent(lbl_distance)
                                    .addComponent(lbl_radius)
                                    .addComponent(lbl_mag)
                                    .addComponent(lbl_mass)
                                    .addComponent(lbl_temp)
                                    .addComponent(lbl_lum))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup()
                                    .addComponent(txt_id, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_name, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_type, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_const, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dist, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_radius, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mag, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mass, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_temp, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_lum, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup()
                            .addComponent(lbl_M)
                            .addComponent(lbl_L)
                            .addComponent(lbl_K, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_KG)
                            .addComponent(lbl_Km)
                            .addComponent(lbl_lightyears))
                        .addGap(0, 10, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_id))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_name))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_type))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_const, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_constellation))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_dist, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_lightyears)
                                    .addComponent(lbl_distance))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_radius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_Km))
                                    .addComponent(lbl_radius))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_mag, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_mag)
                                    .addComponent(lbl_M))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_mass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_mass)
                                    .addComponent(lbl_KG))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_temp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_temp)))
                            .addComponent(lbl_K))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_lum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_lum)
                            .addComponent(lbl_L))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== jPanel2 ========
        {

            //======== jScrollPane3 ========
            {

                //---- tree_planets ----
                tree_planets.setModel(new DefaultTreeModel(
                    new DefaultMutableTreeNode("Planets") {
                        {
                        }
                    }));
                jScrollPane3.setViewportView(tree_planets);
            }

            //---- btn_del ----
            btn_del.setText("Delete");
            btn_del.addActionListener(e -> btn_delActionPerformed(e));

            //---- btn_addBody ----
            btn_addBody.setText("Add");
            btn_addBody.addActionListener(e -> btn_addBodyActionPerformed(e));

            //---- lbl_name_sat ----
            lbl_name_sat.setText("Name of Satellite");

            //---- jLabel1 ----
            jLabel1.setText("Select Item, then enter name and press add");

            //---- lbl_hier ----
            lbl_hier.setText("Enter data in hierarchical format");

            GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(96, Short.MAX_VALUE)
                        .addComponent(lbl_hier)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup()
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup()
                                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup()
                                            .addComponent(txt_body, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(btn_addBody)
                                                .addGap(35, 35, 35)
                                                .addComponent(btn_del)
                                                .addGap(46, 46, 46))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(lbl_name_sat)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup()
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_hier)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_name_sat)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_body, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_del, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_addBody, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))
            );
        }

        //---- lbl_sat ----
        lbl_sat.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl_sat.setText("Satellites (Planets and Moons)");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_sat)
                            .addGap(104, 104, 104))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 40, Short.MAX_VALUE))))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbl_header)
                    .addGap(285, 285, 285))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(btn_add, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(lbl_header)
                    .addGap(28, 28, 28)
                    .addComponent(lbl_sat)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addBodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addBodyActionPerformed
           
//CODE FOR ADDING A NODE TO THE CURRENT SELECTED NODE IN THE GUI
               selectedNode = (DefaultMutableTreeNode)tree_planets.getLastSelectedPathComponent();//GETS THE NODE YOU CLICKED ON

               if(selectedNode != null && !txt_body.getText().isEmpty()){
                         if(selectedNode.getLevel() < 2){//MAKING SURE ONLY 2 TIERS CAN BE ENTERED (PLANETS AND THEIR MOONS)
                            selectedNode.insert(new DefaultMutableTreeNode(txt_body.getText()),0);
                             model.reload(selectedNode);
                             txt_body.setText("");
                            }
                         else{
                           JOptionPane.showMessageDialog(null,"Please only enter Satellites for planets","CORRECT HEIRARCHY",JOptionPane.PLAIN_MESSAGE);
                             }
              }                
              else{
                   JOptionPane.showMessageDialog(null,"Please select or enter a name for the Satellite","ENTER NAME",JOptionPane.PLAIN_MESSAGE);
                  }
            
    }//GEN-LAST:event_btn_addBodyActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        //REMOVING A NODE FROM THE GUI - CANT REMOVE ROOT
        selectedNode = (DefaultMutableTreeNode)tree_planets.getLastSelectedPathComponent();
        if (selectedNode.getParent() == null){
            JOptionPane.showMessageDialog(null,"You can't delete that","CANNOT DELETE",JOptionPane.PLAIN_MESSAGE);
        }
        else if(selectedNode != null){
            DefaultMutableTreeNode parent=(DefaultMutableTreeNode)selectedNode.getParent();
            parent.remove(selectedNode);
            model.reload(parent);
        }
        txt_body.setText("");
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
          
        String id = txt_id.getText();
          
        //SIMPLE VALIDATION FOR CHECKBOXES - SOME BOXES WILL ONLY TAKE NUMBERS AND DECIMALS
        if( !(id.equals(""))   && !(txt_name.getText().equals(""))  && !(txt_const.getText().equals(""))
        &&  !(txt_dist.getText().equals("")) && !(txt_radius.getText().equals(""))&& !(txt_mass.getText().equals(""))
        &&  !(txt_mag.getText().equals(""))  && !(txt_temp.getText().equals(""))  && !(txt_lum.getText().equals("")) 
        &&  !(cbo_type.getSelectedIndex()==0)
        &&  !(txt_dist.getText().matches(("^[a-zA-Z]+$"))) && !(txt_radius.getText().matches(("^[a-zA-Z]+$"))) && !(txt_mass.getText().matches(("^[a-zA-Z]+$")))
        &&  !(txt_mag.getText().matches(("^[a-zA-Z]+$"))) && !(txt_temp.getText().matches(("^[a-zA-Z]+$"))) && !(txt_lum.getText().matches(("^[a-zA-Z]+$")))
                ){
       if (exists(id)){//CHECKING IF A DOCUMENT WITH THE ENTERED ID ALREADY EXISTS
           JOptionPane.showMessageDialog(null, "A Document with that ID already exists!", "DUPLICATE ID", JOptionPane.ERROR_MESSAGE);
            System.out.println("Already exists");
        }
        else{
       
       int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to record this document?", "RECORD?", JOptionPane.YES_NO_OPTION);
           
        if(confirm ==JOptionPane.YES_OPTION){
            
        double mag  = Double.parseDouble(txt_mag.getText());
        double dist = Double.parseDouble(txt_dist.getText());
        double rad  = Double.parseDouble(txt_radius.getText());
        double mass = Double.parseDouble(txt_mass.getText());
        double temp = Double.parseDouble(txt_temp.getText());
        double lum = Double.parseDouble(txt_lum.getText());
        double bright = findBrightness(dist,lum);//BRIGHTNESS OF A STAR IS DETERMINED BY ITS LUMINOSITY AND ITS DISTANCE -FORMULA IS NOT ENTIRELY ACCURATE, JUST A ROUGH ESTIMATION
        
        //NEW TREE NODE ITEM TO ADD/EXTRACT DATA
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode planet = null;
        DefaultMutableTreeNode moon = null;
        
        
        int planet_amount = model.getChildCount(root); // CODE ONLY GETS CHILDREN OF ROOT WHICH ARE THE PLANETS - WILL GET THE AMOUNT OF PLANETS ENTERED
        int moon_amount = 0; //NUMBER WILL BE GATHER BELOW
        int i = 0;
            
        Document doc = new Document("_id", txt_id.getText()).
            append("Name", txt_name.getText()).
            append("Type", getStarType()).
               // append("Type", cbo_type.getSelectedItem().toString()).
            append("Constellation", txt_const.getText()).
            append("Distance", dist).
            append("Radius", rad).
            append("Magnitude", mag).         
            append("Mass", mass). 
            append("Temperature", temp). 
            append("Luminosity", lum).
            append("Brightness", String.format("%.8f", bright)) 
            ;  
           
        BasicDBObject planetObject =new BasicDBObject();//MAKING AN OBJECT TO STORE PLANETS IN
        if(planet_amount != 0){//CHECKING IF ANY PLANETS WERE ENTERED OR NOT
         while(i < planet_amount){//USING A LOOP TO PROCESS AMOUNT OF PLANETS AND EACH MOON IT HAS
          
          
          planet = (DefaultMutableTreeNode) root.getChildAt(i);
          moon_amount= model.getChildCount(planet); //FINDING THE AMOUNT OF MOONS AT PLANET i 
          System.out.println(planet);
          System.out.println("Moon Amount is " + moon_amount);
          if (planet != null){
                
          int y =0;
          
          BasicDBObject moonObject = new BasicDBObject();//OBJECT FOR STORING MOONS
            while(y < moon_amount){
                
                if(planet.getChildAt(y) != null){
                moon = (DefaultMutableTreeNode) planet.getChildAt(y);
                moonObject.append("Moon " + (y +1), moon.toString());
               }
                y++;             
                System.out.println(moon);
                
            }
         planetObject.append(planet.toString(), moonObject);//APPENDING MOONS TO PARENT PLANETS
        }//END NULL IF
        i++;
        }
        System.out.println("Planet Amount is " + planet_amount);
        
        doc.put("Planets", planetObject);
        }
        
        starColl.insertOne(doc);//INSERTING EVERYTHING FROM THE DOC
        
        JOptionPane.showMessageDialog(null, "The Star " + txt_name.getText() + " has been logged", "Success", JOptionPane.PLAIN_MESSAGE);
        reset();
        resetRoot();   
        }//END CONFIRM
        }//END ELSE CHECK ID
        }//END IF
        
        else{         
                JOptionPane.showMessageDialog(null, "Please enter specified fields correctly", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        
    }//GEN-LAST:event_btn_addActionPerformed

    public boolean exists(String id) {//METHOD FOR CHICKING IF DOCUMENT WITH ENTERED ID ALREADY EXISTS
    FindIterable<Document> iterable = starColl.find(new Document("_id", id));
    return iterable.first() != null;
}

    public double findBrightness(double distance, double luminosity){

        double sphereSurface = 4;

        double brightness =
        luminosity/(sphereSurface * Math.PI * (distance * distance));
        return brightness;
    }

    public String getStarType(){
        String starType = cbo_type.getSelectedItem().toString();
        return starType;
    }
    
    private void resetRoot(){
    DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
    root.removeAllChildren();
    model.reload(root);      
    }    
    private void reset(){        
    txt_id.setText("");
    txt_name.setText("");
    txt_const.setText("");
    txt_dist.setText("");
    txt_radius.setText("");
    txt_mag.setText("");
    txt_mass.setText("");
    txt_temp.setText("");
    txt_lum.setText("");
    cbo_type.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(RecordStarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordStarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordStarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordStarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            			      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordStarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - William Moriarty
    private JLabel lbl_header;
    private JButton btn_add;
    private JPanel jPanel1;
    private JTextField txt_id;
    private JLabel lbl_id;
    private JTextField txt_name;
    private JLabel lbl_name;
    private JComboBox<String> cbo_type;
    private JLabel lbl_type;
    private JTextField txt_const;
    private JLabel lbl_constellation;
    private JTextField txt_dist;
    private JLabel lbl_distance;
    private JTextField txt_radius;
    private JLabel lbl_lightyears;
    private JLabel lbl_radius;
    private JLabel lbl_Km;
    private JLabel lbl_mag;
    private JTextField txt_mag;
    private JLabel lbl_M;
    private JTextField txt_mass;
    private JLabel lbl_mass;
    private JLabel lbl_KG;
    private JLabel lbl_temp;
    private JTextField txt_temp;
    private JLabel lbl_K;
    private JLabel lbl_lum;
    private JTextField txt_lum;
    private JLabel lbl_L;
    private JLabel jLabel3;
    private JPanel jPanel2;
    private JScrollPane jScrollPane3;
    private JTree tree_planets;
    private JButton btn_del;
    private JButton btn_addBody;
    private JTextField txt_body;
    private JLabel lbl_name_sat;
    private JLabel jLabel1;
    private JLabel lbl_hier;
    private JLabel lbl_sat;
    // End of variables declaration//GEN-END:variables
}
