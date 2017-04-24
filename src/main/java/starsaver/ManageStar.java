package starsaver;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import com.mongodb.*;
import com.mongodb.client.*;
import org.bson.*;
import javax.swing.JOptionPane;

/**
 *
 * @author t00119587
 */
public class ManageStar extends javax.swing.JFrame {

    //SETTING UP CLIENT, DATABASE, AND COLLECTION
    MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
    MongoDatabase db = mongoClient.getDatabase("starSaver");
    MongoCollection starColl = db.getCollection("stars");
    
    
    public ManageStar() {
        initComponents();
        
        rad_amend.setSelected(true);//DEFAULT FOR AMEND TO BE CHOSEN
        btn_delete.setVisible(false);//ONLY VISIBLE WHEN DELETE RADIO BUTTON IS CHOSEN
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - William Moriarty
    private void initComponents() {
        lbl_viewBy = new JLabel();
        btn_viewAll = new JButton();
        btn_search = new JButton();
        jScrollPane1 = new JScrollPane();
        txtArea = new JTextArea();
        jPanel1 = new JPanel();
        txt_id = new JTextField();
        lbl_lum = new JLabel();
        lbl_choose = new JLabel();
        btn_confirm = new JButton();
        btn_delete = new JButton();
        btn_reset = new JButton();
        txt_name = new JTextField();
        txt_const = new JTextField();
        txt_dist = new JTextField();
        cbo_type = new JComboBox<>();
        txt_mag = new JTextField();
        lbl_id = new JLabel();
        lbl_name = new JLabel();
        lbl_type = new JLabel();
        lbl_const = new JLabel();
        lbl_dist = new JLabel();
        lbl_mag = new JLabel();
        lbl_mass = new JLabel();
        txt_mass = new JTextField();
        lbl_temp = new JLabel();
        txt_temp = new JTextField();
        txt_lum = new JTextField();
        rad_amend = new JRadioButton();
        rad_del = new JRadioButton();
        txt_radius = new JTextField();
        lbl_rad = new JLabel();
        lbl_lightyears = new JLabel();
        lbl_Km = new JLabel();
        lbl_L = new JLabel();
        lbl_KG = new JLabel();
        lbl_K = new JLabel();
        lbl_M = new JLabel();
        jLabel1 = new JLabel();
        cbo_viewBy = new JComboBox<>();
        txt_viewBy = new JTextField();
        lbl_criteria = new JLabel();
        btn_reset2 = new JButton();
        lbl_header = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- lbl_viewBy ----
        lbl_viewBy.setText("View By");

        //---- btn_viewAll ----
        btn_viewAll.setText("View All");
        btn_viewAll.addActionListener(e -> btn_viewAllActionPerformed(e));

        //---- btn_search ----
        btn_search.setText("Search");
        btn_search.addActionListener(e -> btn_searchActionPerformed(e));

        //======== jScrollPane1 ========
        {

            //---- txtArea ----
            txtArea.setColumns(20);
            txtArea.setRows(5);
            jScrollPane1.setViewportView(txtArea);
        }

        //======== jPanel1 ========
        {

            // JFormDesigner evaluation mark
            jPanel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), jPanel1.getBorder())); jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- lbl_lum ----
            lbl_lum.setText("Luminosity*");

            //---- lbl_choose ----
            lbl_choose.setText("Choose record ID to amend/delete");

            //---- btn_confirm ----
            btn_confirm.setText("Confirm");
            btn_confirm.addActionListener(e -> btn_confirmActionPerformed(e));

            //---- btn_delete ----
            btn_delete.setText("Delete");
            btn_delete.addActionListener(e -> btn_deleteActionPerformed(e));

            //---- btn_reset ----
            btn_reset.setText("Reset");
            btn_reset.addActionListener(e -> btn_resetActionPerformed(e));

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

            //---- lbl_id ----
            lbl_id.setText("ID");

            //---- lbl_name ----
            lbl_name.setText("Name");

            //---- lbl_type ----
            lbl_type.setText("Type");

            //---- lbl_const ----
            lbl_const.setText("Constellation");

            //---- lbl_dist ----
            lbl_dist.setText("Distance*");

            //---- lbl_mag ----
            lbl_mag.setText("Magnitude*");

            //---- lbl_mass ----
            lbl_mass.setText("Mass*");

            //---- lbl_temp ----
            lbl_temp.setText("Temperature*");

            //---- rad_amend ----
            rad_amend.setText("Amend");
            rad_amend.addActionListener(e -> rad_amendActionPerformed(e));

            //---- rad_del ----
            rad_del.setText("Delete");
            rad_del.addActionListener(e -> rad_delActionPerformed(e));

            //---- lbl_rad ----
            lbl_rad.setText("Radius*");

            //---- lbl_lightyears ----
            lbl_lightyears.setText("Lightyears from Earth");

            //---- lbl_Km ----
            lbl_Km.setText("R");

            //---- lbl_L ----
            lbl_L.setText("L");

            //---- lbl_KG ----
            lbl_KG.setText("M");

            //---- lbl_K ----
            lbl_K.setText("K");

            //---- lbl_M ----
            lbl_M.setText("Ma");

            //---- jLabel1 ----
            jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 10));
            jLabel1.setText("* will only accept decimal or numeric values");

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_id)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_id, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup()
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_mass)
                                    .addComponent(lbl_mag)
                                    .addComponent(lbl_temp)
                                    .addComponent(lbl_dist)
                                    .addComponent(lbl_const)
                                    .addComponent(lbl_name)
                                    .addComponent(lbl_type)
                                    .addComponent(lbl_rad)
                                    .addComponent(lbl_lum))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup()
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup()
                                            .addComponent(lbl_choose)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(rad_amend)
                                                            .addGap(55, 55, 55)
                                                            .addComponent(rad_del))
                                                        .addGroup(jPanel1Layout.createParallelGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(txt_const, GroupLayout.Alignment.LEADING)
                                                                .addComponent(cbo_type, GroupLayout.Alignment.LEADING)
                                                                .addComponent(txt_name, GroupLayout.Alignment.LEADING)
                                                                .addComponent(txt_dist, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(txt_lum, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                                                .addComponent(txt_temp, GroupLayout.Alignment.LEADING)
                                                                .addComponent(txt_mass, GroupLayout.Alignment.LEADING)
                                                                .addComponent(txt_mag, GroupLayout.Alignment.LEADING))))
                                                    .addComponent(txt_radius, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup()
                                                    .addComponent(lbl_L)
                                                    .addComponent(lbl_KG)
                                                    .addComponent(lbl_Km)
                                                    .addComponent(lbl_lightyears)
                                                    .addComponent(lbl_M)
                                                    .addComponent(lbl_K, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))))
                                        .addContainerGap(28, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(btn_delete)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_confirm)
                                .addGap(18, 18, 18)
                                .addComponent(btn_reset)
                                .addContainerGap())))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(rad_del)
                            .addComponent(rad_amend))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(lbl_choose)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_id))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_name))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_type))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_const, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_const))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dist, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_dist)
                            .addComponent(lbl_lightyears))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_radius, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_rad)
                            .addComponent(lbl_Km))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_mag, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_mag)
                            .addComponent(lbl_M))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_mass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_mass)
                            .addComponent(lbl_KG))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_temp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_temp)
                            .addComponent(lbl_K))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_lum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_lum)
                            .addComponent(lbl_L))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup()
                            .addComponent(btn_reset, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_confirm, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_delete, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))
            );
        }

        //---- cbo_viewBy ----
        cbo_viewBy.setModel(new DefaultComboBoxModel<>(new String[] {
            "ID",
            "Name",
            "Constellation",
            "Distance",
            "Mass",
            "Brightness"
        }));
        cbo_viewBy.addActionListener(e -> cbo_viewByActionPerformed(e));

        //---- lbl_criteria ----
        lbl_criteria.setText("Enter ID");

        //---- btn_reset2 ----
        btn_reset2.setText("Reset");
        btn_reset2.addActionListener(e -> btn_reset2ActionPerformed(e));

        //---- lbl_header ----
        lbl_header.setFont(new Font("Tahoma", Font.BOLD, 24));
        lbl_header.setText("Manage Star Properties");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(lbl_viewBy)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbo_viewBy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(btn_search)
                                    .addGap(33, 33, 33)
                                    .addComponent(btn_viewAll)
                                    .addGap(31, 31, 31)
                                    .addComponent(btn_reset2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jScrollPane1))
                            .addGap(18, 18, 18))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(txt_viewBy, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_criteria))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_header)
                    .addGap(485, 485, 485))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(lbl_header)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_reset2)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_search, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_viewAll, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbo_viewBy, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_viewBy))))
                            .addGap(11, 11, 11)
                            .addComponent(lbl_criteria)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_viewBy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    //BUTTON USED FOR SEARCHES AND MAP REDUCE FUNCTIONS
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
             
    //DECIDED TO US ITERABLE AND CURSOR OBJECTS FOR DIFFERENT OBJECTIVES
    //MAINLY BECAUSE PROJECTION WOULD NOT WORK WITH CURSOR
    FindIterable<Document> iterableStars =null;
    MongoCursor starCursor = null;
    String result;
    System.out.println("Test");
    txtArea.setText("");//SETS TEXT AREA EMPTY WHEN SEARCH BUTTON CLICKED TO MAKE ROOM FOR INCOMING TEXT
    
    //DEPENDING ON WHAT INDEX IS SELECTED FOR MENU DROPDOWN YOU CAN VIEW BY...
    
    //ID
    if (cbo_viewBy.getSelectedIndex() == 0 && !(txt_viewBy.getText().equals(""))){
    
      String id = txt_viewBy.getText();
      txtArea.setText("");
        iterableStars = db.getCollection("stars").find(new Document("_id", id ));
            
    }
    //BY NAME
    else if (cbo_viewBy.getSelectedIndex() == 1 && !(txt_viewBy.getText().equals(""))){
    
      String name = txt_viewBy.getText();
      txtArea.setText("");
        iterableStars = db.getCollection("stars").find(new Document("Name", name ));
    }
    //CONSTELLATION
    else if (cbo_viewBy.getSelectedIndex() == 2 && !(txt_viewBy.getText().equals(""))){
    
      String con = txt_viewBy.getText();
      txtArea.setText("");
        iterableStars = db.getCollection("stars").find(new Document("Constellation", con ));
    }
    //MAP REDUCTION FUNCTIONS - USING INTERATORS
    //FINDING STARS FARTHER (AND CLOSER) THAN <INPUT>
    else if (cbo_viewBy.getSelectedIndex() == 3 && !(txt_viewBy.getText().equals("")) && !(txt_viewBy.getText().matches(("^[a-zA-Z]+$")))){
    String dist = txt_viewBy.getText();
    String map = "function() { "+ 
             "var category; " +  
             "if ( this.Distance >= " + dist + " ) "+  
             "category = 'Stars further than " + dist + " Lightyears from Earth'; " +
             "else " +
             "category = 'Stars closer than " + dist + " Lightyears from Earth'; "+  
             "emit(category, {Name: this.Name});}";
   
   String reduce = "function(key, values) { " +
                            "var sum = 0; " +
                            "values.forEach(function(doc) { " +
                            "sum += 1; "+
                            "}); " +
                            "return {Amount: sum};} ";
   
   starCursor = starColl.mapReduce(map, reduce).iterator();
   }
   //FINDING STARS LARGER (AND SMALLER) THAN <INPUT> 
   else if (cbo_viewBy.getSelectedIndex() == 4 && !txt_viewBy.getText().equals("") && !(txt_viewBy.getText().matches(("^[a-zA-Z]+$")))){
    String mass = txt_viewBy.getText();
    String map = "function() { "+ 
             "var category; " +  
             "if ( this.Mass >= " + mass + " ) "+  
             "category = 'Stars greater than " + mass + " M'; " +
             "else " +
             "category = 'Stars smaller than " + mass + " M'; "+  
             "emit(category, {Name: this.Name});}";
   
   String reduce = "function(key, values) { " +
                            "var sum = 0; " +
                            "values.forEach(function(doc) { " +
                            "sum += 1; "+
                            "}); " +
                            "return {Amount: sum};} ";
 
   starCursor = starColl.mapReduce(map, reduce).iterator();
   }
    //FINDING STARS BRIGHTER (OR NOT AS BRIGHT) THAN <INPUT> 
   else if (cbo_viewBy.getSelectedIndex() == 5 && !txt_viewBy.getText().equals("") && !(txt_viewBy.getText().matches(("^[a-zA-Z]+$")))){
    String bright = txt_viewBy.getText();
    String map = "function() { "+ 
             "var category; " +  
             "if ( this.Brightness >= " + bright + " ) "+  
             "category = 'Stars brighter than " + bright + " B'; " +
             "else " +
             "category = 'Stars not as bright than " + bright + " B'; "+  
             "emit(category, {Name: this.Name});}";
   
   String reduce = "function(key, values) { " +
                            "var sum = 0; " +
                            "values.forEach(function(doc) { " +
                            "sum += 1; "+
                            "}); " +
                            "return {Amount: sum};} ";
   
   //MapReduceIterable documents = starColl.mapReduce(map, reduce);
   starCursor = starColl.mapReduce(map, reduce).iterator();
   }
   else{         
        JOptionPane.showMessageDialog(null, "Please enter a value for search criteria", "Error", JOptionPane.ERROR_MESSAGE);
        }
  txt_viewBy.setText("");
   
   //MAY APPEAR ODD USING A WHILE ABOVE A FOR EACH LOOP WITH AN ELSE IF, BUT BOTH ARE USED FOR DIFFERENT TYPES OF SEARCHES
   if (starCursor != null){
   while (starCursor.hasNext()){
   result = starCursor.next().toString() + "\n";
   System.out.println(result);
   txtArea.append(result);
    }
   }
   else if (iterableStars != null){
       iterableStars.forEach(new Block<Document>() {
            //@Override
             public void apply(final Document document) {
                 txtArea.setLineWrap(true);                
                 txtArea.append(document.toString() + "\n\n");
                 System.out.println(document);
          }
        });
   }   
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_viewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewAllActionPerformed
        //VIEW ALL DOCUMENTS
        txtArea.setText("");
        FindIterable<Document> iterableStars = db.getCollection("stars").find();
            iterableStars.forEach(new Block<Document>() {
            //@Override
             public void apply(final Document document) {
                 txtArea.setLineWrap(true);                
                 txtArea.append(document.toString() + "\n\n");
                 System.out.println(document);
          }
        });
    }//GEN-LAST:event_btn_viewAllActionPerformed

    private void btn_reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset2ActionPerformed
        //RESET FOR TEXT AREA
        txtArea.setText("");
        txt_viewBy.setText("");
    }//GEN-LAST:event_btn_reset2ActionPerformed

    private void cbo_viewByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_viewByActionPerformed
       //CODE FOR CHANGING SEARCH CRITERA LABEL FOR "VIEW BY" COMBO BOX
        if (cbo_viewBy.getSelectedIndex() == 0){
            lbl_criteria.setText("Enter ID");
        }
         if (cbo_viewBy.getSelectedIndex() == 1){
            lbl_criteria.setText("Enter Name");
        }
         if (cbo_viewBy.getSelectedIndex() == 2){
            lbl_criteria.setText("Enter Constellation");
        }
         if (cbo_viewBy.getSelectedIndex() == 3){
            lbl_criteria.setText("Enter Distance GREATER OR EQUAL THAN");
        }
          if (cbo_viewBy.getSelectedIndex() == 4){
            lbl_criteria.setText("Enter Mass GREATER OR EQUAL THAN");
        }
           if (cbo_viewBy.getSelectedIndex() == 5){
            lbl_criteria.setText("Enter Brightness BRIGHTER OR EQUAL THAN");
        }
    }//GEN-LAST:event_cbo_viewByActionPerformed

    private void rad_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_delActionPerformed
        //CODE FOR RADIO BUTTON DELETE WHEN SELECTED, DISABLES EDITABLE TEXTBOXES AND MAKES DELETE BUTTON APPEAR
        rad_del.setSelected(true);
        rad_amend.setSelected(false);
        btn_delete.setVisible(true);
        btn_confirm.setVisible(false);
        toogle(false);
    }//GEN-LAST:event_rad_delActionPerformed

    private void rad_amendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_amendActionPerformed
        //CODE FOR RADIO BUTTON AMEND WHEN SELECTED, MAKES EDIT BUTTON (CONFIRM) VISIBLE AS WELL AS TEXT BOXES FOR INPUTS
        rad_del.setSelected(false);
        rad_amend.setSelected(true);
        btn_delete.setVisible(false);
        btn_confirm.setVisible(true);
        toogle(true);
    }//GEN-LAST:event_rad_amendActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        //DELETE BY ID
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "DELETE?", JOptionPane.YES_NO_OPTION);
        if(confirm ==JOptionPane.YES_OPTION){
            starColl.deleteOne(new Document("_id", txt_id.getText()));
            JOptionPane.showMessageDialog(null, "Star " + txt_id.getText() + " has been deleted", "Success", JOptionPane.PLAIN_MESSAGE);
            reset();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    //UPDATE BUTTON
    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed

        //NOTE - DID NOT INCLUDE ANY FUNCTIONS FOR UPDATING NAMES OF PLANETS OR MOONS

        //SIMPLE VALIDATION LIKE THE RECORD FORM
        if( !(txt_id.getText().equals(""))
            &&  !(txt_dist.getText().matches(("^[a-zA-Z]+$"))) && !(txt_radius.getText().matches(("^[a-zA-Z]+$"))) && !(txt_mass.getText().matches(("^[a-zA-Z]+$")))
            &&  !(txt_mag.getText().matches(("^[a-zA-Z]+$"))) && !(txt_temp.getText().matches(("^[a-zA-Z]+$"))) && !(txt_lum.getText().matches(("^[a-zA-Z]+$")))
        ){
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this document?", "UPDATE?", JOptionPane.YES_NO_OPTION);

            if(confirm ==JOptionPane.YES_OPTION){

                String id = txt_id.getText();
                BasicDBObject updateFields = new BasicDBObject();
                BasicDBObject updateObject = new BasicDBObject();
                BasicDBObject setID = new BasicDBObject("_id", id);

                //NOTE - THE DOCUMENT AND DOUBLE VALUES ARE DECLARED AND INITIALIZED HERE TO SETUP THE BRIGHTNESS FIELD TO BE EDITED WHENEVER LUMINOSITY AND BRIGHTNESS ARE
                //WILL COME BACK TO THIS LATER BUT IF NOT THEN IT MEANS I RAN OUT OF TIME!!
                FindIterable<Document> iterableLum;
                double lum=0;
                double dist=0;
                double bright=0;

                //JUST USING IF STATEMENTS SO NOT EVERY ITEM HAS TO BE UPDATED IF THE USER DOESNT WANT TO
                if( !(txt_id.getText().equals(""))){
                    updateFields.append("Name", txt_name.getText());}

                if( !(cbo_type.getSelectedIndex()==0)){
                    updateFields.append("Type", cbo_type.getSelectedItem().toString());}

                if( !(txt_const.getText().equals(""))){
                    updateFields.append("Constellation", txt_const.getText());}

                if( !(txt_dist.getText().equals(""))){
                    dist = Double.parseDouble(txt_dist.getText());
                    updateFields.append("Distance", dist);}

                if( !(txt_radius.getText().equals(""))){
                    double rad = Double.parseDouble(txt_radius.getText());
                    updateFields.append("Radius", rad);}

                if( !(txt_mag.getText().equals(""))){
                    double mag = Double.parseDouble(txt_mag.getText());
                    updateFields.append("Magnitude", mag);}

                if( !(txt_mass.getText().equals(""))){
                    double mass = Double.parseDouble(txt_mass.getText());
                    updateFields.append("Mass", mass);}

                if( !(txt_temp.getText().equals(""))){
                    double temp = Double.parseDouble(txt_temp.getText());
                    updateFields.append("Temperature", temp);}

                if( !(txt_lum.getText().equals(""))){
                    lum = Double.parseDouble(txt_lum.getText());
                    updateFields.append("Luminosity", lum);}

                // = lum/(4 * 3.14 * (dist * dist));

                updateObject.append("$set", updateFields);
                starColl.updateOne(setID, updateObject);
                reset();//METHOD FOR RESETING TEXTBOXES
                JOptionPane.showMessageDialog(null, "Star properties have been updated", "Success", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter the specified fields correctly", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_confirmActionPerformed
    
    private void toogle(boolean t){
    //METHOD FOR TOOGLE TEXTBOXES TO BE ENABLED OR DISABLED DEPENDING ON RADIO BUTTON SELECTED
    txt_name.setEnabled(t);
    txt_const.setEnabled(t);
    txt_dist.setEnabled(t);
    txt_radius.setEnabled(t);
    txt_mag.setEnabled(t);
    txt_mass.setEnabled(t);
    txt_temp.setEnabled(t);
    txt_lum.setEnabled(t);
    cbo_type.setEnabled(t);  
    }
    
    private void reset(){        
    //METHOD FOR MAKING TEXT BOXES BLANK AFTER DATA IS UPDATED
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
            java.util.logging.Logger.getLogger(ManageStar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - William Moriarty
    private JLabel lbl_viewBy;
    private JButton btn_viewAll;
    private JButton btn_search;
    private JScrollPane jScrollPane1;
    private JTextArea txtArea;
    private JPanel jPanel1;
    private JTextField txt_id;
    private JLabel lbl_lum;
    private JLabel lbl_choose;
    private JButton btn_confirm;
    private JButton btn_delete;
    private JButton btn_reset;
    private JTextField txt_name;
    private JTextField txt_const;
    private JTextField txt_dist;
    private JComboBox<String> cbo_type;
    private JTextField txt_mag;
    private JLabel lbl_id;
    private JLabel lbl_name;
    private JLabel lbl_type;
    private JLabel lbl_const;
    private JLabel lbl_dist;
    private JLabel lbl_mag;
    private JLabel lbl_mass;
    private JTextField txt_mass;
    private JLabel lbl_temp;
    private JTextField txt_temp;
    private JTextField txt_lum;
    private JRadioButton rad_amend;
    private JRadioButton rad_del;
    private JTextField txt_radius;
    private JLabel lbl_rad;
    private JLabel lbl_lightyears;
    private JLabel lbl_Km;
    private JLabel lbl_L;
    private JLabel lbl_KG;
    private JLabel lbl_K;
    private JLabel lbl_M;
    private JLabel jLabel1;
    private JComboBox<String> cbo_viewBy;
    private JTextField txt_viewBy;
    private JLabel lbl_criteria;
    private JButton btn_reset2;
    private JLabel lbl_header;
    // End of variables declaration//GEN-END:variables
}
