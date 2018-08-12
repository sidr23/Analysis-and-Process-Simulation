package process_simulation;

import javax.swing.JLabel;

public class SPview extends javax.swing.JFrame { String input;
  private JLabel AC_cost;
  private JLabel AC_cost_kg;
  private JLabel AC_wt;
  private JLabel Amt_of_salt;
  private javax.swing.JButton Back;
  private JLabel Company_name;
  private JLabel Cost_of_resinbed;
  private JLabel Fabrication_cost;
  private JLabel Flow_rate;
  private JLabel Gravel_cost;
  private JLabel Gravel_cost_kg;
  private JLabel Gravel_wt;
  private JLabel Operational_hrs;
  private JLabel Pebbles_cost;
  private JLabel Pebbles_cost_kg;
  private JLabel Pebbles_wt;
  private JLabel Product_id;
  private JLabel Qty; private JLabel Resin_capacity; private JLabel Rheight; private JLabel Rubber_lining_area; private JLabel Rubber_lining_cost; private JLabel Rubber_lining_costm2; private JLabel SD_wt; private JLabel SDdiameter; private JLabel SDheight; private JLabel SDthickness; private JLabel SS_wt; private JLabel SSdiameter; private JLabel SSthickness; private JLabel Sand_cost;
  public SPview(String value) { initComponents();
    input = value;
    display(input); }
  
  private JLabel Sand_cost_kg;
  private JLabel Sand_wt;
  private JLabel Steel_cost;
  private JLabel Volume_of_resin;
  private JLabel date;
  private JLabel fabrication_kg;
  private JLabel fmcost;
  private JLabel jLabel1;
  private JLabel jLabel10;
  private JLabel jLabel11; private JLabel jLabel12; private JLabel jLabel13;
  private void initComponents() { jLabel43 = new JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    jLabel5 = new JLabel();
    jLabel6 = new JLabel();
    jLabel7 = new JLabel();
    jLabel8 = new JLabel();
    jLabel9 = new JLabel();
    jLabel10 = new JLabel();
    jLabel11 = new JLabel();
    jLabel12 = new JLabel();
    jLabel13 = new JLabel();
    jLabel14 = new JLabel();
    jLabel15 = new JLabel();
    jLabel16 = new JLabel();
    jLabel17 = new JLabel();
    jLabel18 = new JLabel();
    jLabel19 = new JLabel();
    jLabel20 = new JLabel();
    jLabel21 = new JLabel();
    jLabel22 = new JLabel();
    jLabel23 = new JLabel();
    jLabel24 = new JLabel();
    jLabel25 = new JLabel();
    jLabel26 = new JLabel();
    jLabel27 = new JLabel();
    jLabel28 = new JLabel();
    jLabel29 = new JLabel();
    jLabel30 = new JLabel();
    jLabel31 = new JLabel();
    jLabel32 = new JLabel();
    jLabel33 = new JLabel();
    jLabel34 = new JLabel();
    jLabel35 = new JLabel();
    jLabel36 = new JLabel();
    jLabel37 = new JLabel();
    jLabel38 = new JLabel();
    jLabel39 = new JLabel();
    jLabel40 = new JLabel();
    jLabel41 = new JLabel();
    jLabel42 = new JLabel();
    Company_name = new JLabel();
    Product_id = new JLabel();
    date = new JLabel();
    Qty = new JLabel();
    Flow_rate = new JLabel();
    Operational_hrs = new JLabel();
    Amt_of_salt = new JLabel();
    Resin_capacity = new JLabel();
    Volume_of_resin = new JLabel();
    Rheight = new JLabel();
    SDheight = new JLabel();
    SDdiameter = new JLabel();
    SDthickness = new JLabel();
    SD_wt = new JLabel();
    SSdiameter = new JLabel();
    SSthickness = new JLabel();
    SS_wt = new JLabel();
    Rubber_lining_area = new JLabel();
    Rubber_lining_costm2 = new JLabel();
    Rubber_lining_cost = new JLabel();
    Steel_cost = new JLabel();
    Cost_of_resinbed = new JLabel();
    Fabrication_cost = new JLabel();
    Sand_wt = new JLabel();
    Sand_cost_kg = new JLabel();
    Sand_cost = new JLabel();
    Gravel_wt = new JLabel();
    Gravel_cost_kg = new JLabel();
    Gravel_cost = new JLabel();
    Pebbles_wt = new JLabel();
    Pebbles_cost_kg = new JLabel();
    Pebbles_cost = new JLabel();
    AC_wt = new JLabel();
    AC_cost_kg = new JLabel();
    AC_cost = new JLabel();
    fmcost = new JLabel();
    one_qty_cost = new JLabel();
    total_cost = new JLabel();
    jLabel44 = new JLabel();
    jLabel45 = new JLabel();
    jLabel46 = new JLabel();
    jLabel47 = new JLabel();
    jLabel48 = new JLabel();
    jLabel49 = new JLabel();
    jLabel50 = new JLabel();
    jLabel51 = new JLabel();
    jLabel52 = new JLabel();
    jLabel53 = new JLabel();
    jLabel54 = new JLabel();
    jLabel55 = new JLabel();
    jLabel56 = new JLabel();
    jLabel57 = new JLabel();
    jLabel58 = new JLabel();
    jLabel59 = new JLabel();
    jLabel60 = new JLabel();
    jLabel61 = new JLabel();
    jLabel62 = new JLabel();
    jLabel63 = new JLabel();
    jLabel64 = new JLabel();
    jLabel65 = new JLabel();
    jLabel66 = new JLabel();
    jLabel67 = new JLabel();
    jLabel68 = new JLabel();
    jLabel69 = new JLabel();
    jLabel70 = new JLabel();
    Back = new javax.swing.JButton();
    jLabel71 = new JLabel();
    jLabel72 = new JLabel();
    jLabel73 = new JLabel();
    jLabel74 = new JLabel();
    jLabel75 = new JLabel();
    jLabel76 = new JLabel();
    resin_litre = new JLabel();
    resin_cost = new JLabel();
    fabrication_kg = new JLabel();
    
    jLabel43.setText("jLabel43");
    
    setDefaultCloseOperation(3);
    
    jScrollPane1.setVerticalScrollBarPolicy(22);
    
    jPanel1.setPreferredSize(new java.awt.Dimension(381, 2000));
    
    jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
    jLabel2.setText("SOFTENING PLANT");
    
    jLabel3.setText("Company Name");
    
    jLabel4.setText("Product Id");
    
    jLabel5.setText("Date");
    
    jLabel6.setText("Quantity");
    
    jLabel7.setText("Flow Rate");
    
    jLabel8.setText("Operational hrs");
    
    jLabel9.setText("Amount of Salt");
    
    jLabel10.setText("Resin Capacity");
    
    jLabel11.setText("Volume of Resin");
    
    jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14));
    jLabel12.setText("RESIN BED");
    
    jLabel13.setText("Height of Resin");
    
    jLabel14.setText("Height of Drum");
    
    jLabel15.setText("Diameter of Drum");
    
    jLabel16.setText("Thickness of Drum");
    
    jLabel17.setText("Weight of Drum");
    
    jLabel18.setText("Diameter of Shell");
    
    jLabel19.setText("Thickness of Shell");
    
    jLabel20.setText("Weight of Shell");
    
    jLabel21.setText("Rubber Lining Area");
    
    jLabel22.setText("Rubber Lining Cost/square metre");
    
    jLabel23.setText("Rubber Lining Cost");
    
    jLabel24.setText("Cost of Steel");
    
    jLabel25.setText("Cost of Resin Tank");
    
    jLabel26.setText("Fabrication Cost");
    
    jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14));
    jLabel27.setText("FILTER MEDIA");
    
    jLabel28.setText("Sand");
    
    jLabel29.setText("Sand cost/kg");
    
    jLabel30.setText("Sand Cost");
    
    jLabel31.setText("Gravel");
    
    jLabel32.setText("Gravel Cost/kg");
    
    jLabel33.setText("Gravel Cost");
    
    jLabel34.setText("Pebbles");
    
    jLabel35.setText("Pebbles Cost/kg");
    
    jLabel36.setText("Pebbles Cost");
    
    jLabel37.setText("Actvated Carbon");
    
    jLabel38.setText("Activated Carbon Cost/kg");
    
    jLabel39.setText("Activated Carbon Cost");
    
    jLabel40.setText("Filter Media Cost");
    
    jLabel41.setText("Cost of One Quantity");
    
    jLabel42.setText("Total Cost");
    
    Company_name.setText("1");
    
    Product_id.setText("1");
    
    date.setText("jLabel43");
    
    Qty.setText("jLabel43");
    
    Flow_rate.setText("jLabel43");
    
    Operational_hrs.setText("jLabel43");
    
    Amt_of_salt.setText("jLabel43");
    
    Resin_capacity.setText("jLabel43");
    
    Volume_of_resin.setText("jLabel43");
    
    Rheight.setText("jLabel43");
    
    SDheight.setText("jLabel43");
    
    SDdiameter.setText("jLabel43");
    
    SDthickness.setText("jLabel43");
    
    SD_wt.setText("jLabel43");
    
    SSdiameter.setText("jLabel43");
    
    SSthickness.setText("jLabel43");
    
    SS_wt.setText("jLabel43");
    
    Rubber_lining_area.setText("jLabel43");
    
    Rubber_lining_costm2.setText("jLabel43");
    
    Rubber_lining_cost.setText("jLabel44");
    
    Steel_cost.setText("jLabel44");
    
    Cost_of_resinbed.setText("jLabel44");
    
    Fabrication_cost.setText("jLabel44");
    
    Sand_wt.setText("jLabel44");
    
    Sand_cost_kg.setText("jLabel44");
    
    Sand_cost.setText("jLabel44");
    
    Gravel_wt.setText("jLabel44");
    
    Gravel_cost_kg.setText("jLabel44");
    
    Gravel_cost.setText("jLabel44");
    
    Pebbles_wt.setText("jLabel44");
    
    Pebbles_cost_kg.setText("jLabel44");
    
    Pebbles_cost.setText("jLabel44");
    
    AC_wt.setText("jLabel44");
    
    AC_cost_kg.setText("jLabel44");
    
    AC_cost.setText("jLabel44");
    
    fmcost.setText("jLabel44");
    
    one_qty_cost.setText("jLabel44");
    
    total_cost.setText("jLabel44");
    
    jLabel44.setText("cubic metre/hr");
    
    jLabel45.setText("metre");
    
    jLabel46.setText("metre");
    
    jLabel47.setText("kg");
    
    jLabel48.setText("cubic metre");
    
    jLabel49.setText("kg");
    
    jLabel50.setText("square metre");
    
    jLabel51.setText("Rs");
    
    jLabel52.setText("Rs");
    
    jLabel53.setText("Rs");
    
    jLabel54.setText("Rs");
    
    jLabel55.setText("Rs");
    
    jLabel56.setText("kg");
    
    jLabel57.setText("Rs");
    
    jLabel58.setText("Rs");
    
    jLabel59.setText("Rs");
    
    jLabel60.setText("Rs");
    
    jLabel61.setText("Rs");
    
    jLabel62.setText("Rs");
    
    jLabel63.setText("Rs");
    
    jLabel64.setText("Rs");
    
    jLabel65.setText("Rs");
    
    jLabel66.setText("Rs");
    
    jLabel67.setText("Rs");
    
    jLabel68.setText("kg");
    
    jLabel69.setText("kg");
    
    jLabel70.setText("kg");
    
    Back.setText("Back");
    Back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SPview.this.BackActionPerformed(evt);
      }
      
    });
    jLabel71.setText("Resin Cost/litre");
    
    jLabel72.setText("Total Resin Cost");
    
    jLabel73.setText("Fabrication Cost/kg");
    
    jLabel74.setText("Rs");
    
    jLabel75.setText("Rs");
    
    jLabel76.setText("Rs");
    
    resin_litre.setText("jLabel77");
    
    resin_cost.setText("jLabel78");
    
    fabrication_kg.setText("jLabel79");
    
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel22).addComponent(jLabel24).addComponent(jLabel25).addComponent(jLabel26).addComponent(jLabel23).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3).addComponent(jLabel4).addComponent(jLabel5).addComponent(jLabel6).addComponent(jLabel7).addComponent(jLabel8).addComponent(jLabel9).addComponent(jLabel10).addComponent(jLabel11).addComponent(jLabel13).addComponent(jLabel14).addComponent(jLabel15).addComponent(jLabel16).addComponent(jLabel17).addComponent(jLabel18).addComponent(jLabel19).addComponent(jLabel20).addComponent(jLabel21)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(38, 38, 38).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(Company_name, -1, -1, 32767).addComponent(Product_id, -1, -1, 32767).addComponent(date, -1, -1, 32767).addComponent(Qty, -1, -1, 32767).addComponent(Flow_rate, -1, -1, 32767).addComponent(Operational_hrs, -1, -1, 32767).addComponent(Amt_of_salt, -1, -1, 32767).addComponent(Resin_capacity, -1, -1, 32767).addComponent(Volume_of_resin, -2, 77, -2).addComponent(SDdiameter, -2, 53, -2).addComponent(SDthickness, -2, 53, -2).addComponent(SSdiameter, -2, 53, -2).addComponent(SSthickness, -2, 53, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel44).addComponent(jLabel48))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(Rheight, -2, 53, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel45)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(SDheight, -2, 53, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel46)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(SD_wt, -2, 53, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel47)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(SS_wt, -2, 53, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel49)))).addGroup(jPanel1Layout.createSequentialGroup().addGap(85, 85, 85).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel76).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(fabrication_kg, -1, -1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel75).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(resin_cost, -1, -1, 32767)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel74).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(resin_litre, -1, -1, 32767)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel51).addComponent(jLabel52).addComponent(jLabel53).addComponent(jLabel54).addComponent(jLabel55)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(Fabrication_cost, -1, -1, 32767).addComponent(Cost_of_resinbed, -1, -1, 32767).addComponent(Steel_cost, -1, -1, 32767).addComponent(Rubber_lining_cost, -1, -1, 32767).addComponent(Rubber_lining_costm2, -1, -1, 32767).addComponent(Rubber_lining_area, -2, 53, -2)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel50)))).addComponent(jLabel71).addComponent(jLabel72).addComponent(jLabel73)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel29).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel57)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel30).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel58)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel28).addComponent(jLabel31).addComponent(jLabel34).addComponent(jLabel37)).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel32).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel59)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel33).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel60)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel35).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel61)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel36).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel62)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel38).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel63)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel39).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel64)).addGroup(jPanel1Layout.createSequentialGroup().addGap(23, 23, 23).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel41).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel66)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel40).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel65)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel42).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel67))))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(Sand_wt, -1, -1, 32767).addComponent(Sand_cost_kg, -1, -1, 32767).addComponent(Sand_cost, -1, -1, 32767).addComponent(Gravel_wt, -1, -1, 32767).addComponent(Gravel_cost_kg, -1, -1, 32767).addComponent(Gravel_cost, -1, -1, 32767).addComponent(Pebbles_wt, -1, -1, 32767).addComponent(Pebbles_cost_kg, -1, -1, 32767).addComponent(Pebbles_cost, -1, -1, 32767).addComponent(AC_wt, -1, -1, 32767).addComponent(AC_cost_kg, -1, -1, 32767).addComponent(AC_cost, -1, -1, 32767).addComponent(fmcost, -1, -1, 32767).addComponent(one_qty_cost, -1, -1, 32767).addComponent(total_cost, -2, 54, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel56).addComponent(jLabel68).addComponent(jLabel69).addComponent(jLabel70))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(53, 53, 53).addComponent(jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(139, 139, 139).addComponent(jLabel2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(52, 52, 52).addComponent(jLabel12)).addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44).addComponent(jLabel27)).addComponent(Back, -2, 82, -2)).addGap(0, 21, 32767))).addContainerGap()));    
    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel2).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(Company_name)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(Product_id)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(date)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(Qty)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(Flow_rate).addComponent(jLabel44)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(Operational_hrs)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(Amt_of_salt)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(Resin_capacity)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(Volume_of_resin).addComponent(jLabel48)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel12).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(Rheight).addComponent(jLabel45)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel14).addComponent(SDheight).addComponent(jLabel46)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel15).addComponent(SDdiameter)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(SDthickness)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(SD_wt).addComponent(jLabel47)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel18).addComponent(SSdiameter)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel19).addComponent(SSthickness)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel20).addComponent(SS_wt).addComponent(jLabel49)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel21).addComponent(Rubber_lining_area).addComponent(jLabel50)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel22).addComponent(Rubber_lining_costm2).addComponent(jLabel51)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel23).addComponent(Rubber_lining_cost).addComponent(jLabel52)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel24).addComponent(Steel_cost).addComponent(jLabel53)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel25).addComponent(Cost_of_resinbed).addComponent(jLabel54)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel71).addComponent(jLabel74).addComponent(resin_litre)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel72).addComponent(jLabel75).addComponent(resin_cost)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel73).addComponent(jLabel76).addComponent(fabrication_kg)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel26).addComponent(Fabrication_cost).addComponent(jLabel55)).addGap(18, 18, 18).addComponent(jLabel27).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel28).addComponent(Sand_wt).addComponent(jLabel56)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel29).addComponent(Sand_cost_kg).addComponent(jLabel57)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel30).addComponent(Sand_cost).addComponent(jLabel58)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel31).addComponent(Gravel_wt).addComponent(jLabel68)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel32).addComponent(Gravel_cost_kg).addComponent(jLabel59)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel33).addComponent(Gravel_cost).addComponent(jLabel60)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel34).addComponent(Pebbles_wt).addComponent(jLabel69)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel35).addComponent(Pebbles_cost_kg).addComponent(jLabel61)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel36).addComponent(Pebbles_cost).addComponent(jLabel62)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel37).addComponent(AC_wt).addComponent(jLabel70)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel38).addComponent(AC_cost_kg).addComponent(jLabel63)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel39).addComponent(AC_cost).addComponent(jLabel64)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel40).addComponent(fmcost).addComponent(jLabel65)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel41).addComponent(one_qty_cost).addComponent(jLabel66)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel42).addComponent(total_cost).addComponent(jLabel67)).addGap(18, 18, 18).addComponent(Back).addContainerGap()));
    jScrollPane1.setViewportView(jPanel1);
    
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(32, 32, 32).addComponent(jScrollPane1, -1, 383, 32767).addGap(20, 20, 20)));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, -2, 1000, -2).addGap(20, 20, 20)));
   
    pack(); }
  
  private JLabel jLabel14;
  private JLabel jLabel15; private JLabel jLabel16;
  private void BackActionPerformed(java.awt.event.ActionEvent evt) { DataRetrival dr = new DataRetrival();
    dr.setVisible(true);
    setVisible(false); }
  
  private JLabel jLabel17;
  private JLabel jLabel18;
  private void display(String input) { java.sql.PreparedStatement ps = null;
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
      String query = "SELECT * FROM `sp-info` WHERE Product_id=?";
      ps = conn.prepareStatement(query);
      ps.setString(1, input);
      
      java.sql.ResultSet rs = ps.executeQuery();
      while (rs.next())
      {
        Company_name.setText(rs.getString("Company_name"));
        Product_id.setText(rs.getString("Product_id"));
        date.setText(rs.getString("date"));
        Qty.setText(rs.getString("Qty"));
        Flow_rate.setText(rs.getString("Flow_rate"));
        total_cost.setText(rs.getString("Total_cost"));
      }
      
      String query1 = "SELECT * FROM `sp-bed` WHERE Product_id=?";
      ps = conn.prepareStatement(query1);
      ps.setString(1, input);
      
      java.sql.ResultSet rs1 = ps.executeQuery();
      while (rs1.next())
      {
        Operational_hrs.setText(rs1.getString("Operational_hrs"));
        Amt_of_salt.setText(rs1.getString("Amt_of_salt"));
        Resin_capacity.setText(rs1.getString("Resin_capacity"));
        Volume_of_resin.setText(rs1.getString("Volume_of_resin"));
      }
      
      String query2 = "SELECT * FROM `sp-drum` WHERE Product_id=?";
      ps = conn.prepareStatement(query2);
      ps.setString(1, input);
      java.sql.ResultSet rs2 = ps.executeQuery();
      while (rs2.next())
      {
        Rheight.setText(rs2.getString("Rheight"));
        SDheight.setText(rs2.getString("SDheight"));
        SDdiameter.setText(rs2.getString("SDdiameter"));
        SDthickness.setText(rs2.getString("SDthickness"));
        SD_wt.setText(rs2.getString("SDweight"));
      }
      
      String query3 = "SELECT * FROM `sp-shell` WHERE Product_id=?";
      ps = conn.prepareStatement(query3);
      ps.setString(1, input);
      java.sql.ResultSet rs3 = ps.executeQuery();
      while (rs3.next())
      {
        SSdiameter.setText(rs3.getString("SSdiameter"));
        SSthickness.setText(rs3.getString("SSthickness"));
        SS_wt.setText(rs3.getString("SSweight"));
      }
  
      String query7 = "SELECT * FROM `sp-common` WHERE Product_id=?";
      ps = conn.prepareStatement(query7);
      ps.setString(1, input);
      java.sql.ResultSet rs7 = ps.executeQuery();
      while (rs7.next())
      {
        Rubber_lining_area.setText(rs7.getString("Rubber_lining_area"));
        Rubber_lining_costm2.setText(rs7.getString("Rubber_lining_costm2"));
        Rubber_lining_cost.setText(rs7.getString("Rubber_lining_cost"));
        Steel_cost.setText(rs7.getString("Steel_cost"));
        Cost_of_resinbed.setText(rs7.getString("Cost_of_resinbed"));
        resin_litre.setText(rs7.getString("resin_litre"));
        resin_cost.setText(rs7.getString("resin_cost"));
        fabrication_kg.setText(rs7.getString("fabrication_kg"));
        Fabrication_cost.setText(rs7.getString("Fabrication_cost"));
      }
      
      String query8 = "SELECT * FROM `sp-filter-media` WHERE Product_id=?";
      ps = conn.prepareStatement(query8);
      ps.setString(1, input);
      java.sql.ResultSet rs8 = ps.executeQuery();
      while (rs8.next())
      {
        Sand_wt.setText(rs8.getString("Sand_wt"));
        Sand_cost_kg.setText(rs8.getString("Sand_cost_kg"));
        Sand_cost.setText(rs8.getString("Sand_cost"));
        Gravel_wt.setText(rs8.getString("Gravel_wt"));
        Gravel_cost_kg.setText(rs8.getString("Gravel_cost_kg"));
        Gravel_cost.setText(rs8.getString("Gravel_cost"));
        Pebbles_wt.setText(rs8.getString("Pebbles_wt"));
        Pebbles_cost_kg.setText(rs8.getString("Pebbles_cost_kg"));
        Pebbles_cost.setText(rs8.getString("Pebbles_cost"));
        AC_wt.setText(rs8.getString("AC_wt"));
        AC_cost_kg.setText(rs8.getString("AC_cost_kg"));
        AC_cost.setText(rs8.getString("AC_cost"));
        fmcost.setText(rs8.getString("fmcost"));
        one_qty_cost.setText(rs8.getString("one_qty_cost"));
      }
    }
    catch (ClassNotFoundException|java.sql.SQLException e)
    {
      javax.swing.JOptionPane.showMessageDialog(null, "Error in connection" + e);
    }
  }
  
  private JLabel jLabel19;
  private JLabel jLabel2;
  private JLabel jLabel20;
  private JLabel jLabel21;
  private JLabel jLabel22;
  private JLabel jLabel23;
  private JLabel jLabel24;
  
  public static void main(String[] args) {
    try { for (javax.swing.UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(SPview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SPview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SPview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SPview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new SPview("L&T1").setVisible(true);
      }
    });
  }
  
  private JLabel jLabel25;
  private JLabel jLabel26;
  private JLabel jLabel27;
  private JLabel jLabel28;
  private JLabel jLabel29;
  private JLabel jLabel3;
  private JLabel jLabel30;
  private JLabel jLabel31;
  private JLabel jLabel32;
  private JLabel jLabel33;
  private JLabel jLabel34;
  private JLabel jLabel35;
  private JLabel jLabel36;
  private JLabel jLabel37;
  private JLabel jLabel38;
  private JLabel jLabel39;
  private JLabel jLabel4;
  private JLabel jLabel40;
  private JLabel jLabel41;
  private JLabel jLabel42;
  private JLabel jLabel43;
  private JLabel jLabel44;
  private JLabel jLabel45;
  private JLabel jLabel46;
  private JLabel jLabel47;
  private JLabel jLabel48;
  private JLabel jLabel49;
  private JLabel jLabel5;
  private JLabel jLabel50;
  private JLabel jLabel51;
  private JLabel jLabel52;
  private JLabel jLabel53;
  private JLabel jLabel54;
  private JLabel jLabel55;
  private JLabel jLabel56;
  private JLabel jLabel57;
  private JLabel jLabel58;
  private JLabel jLabel59;
  private JLabel jLabel6;
  private JLabel jLabel60;
  private JLabel jLabel61;
  private JLabel jLabel62;
  private JLabel jLabel63;
  private JLabel jLabel64;
  private JLabel jLabel65;
  private JLabel jLabel66;
  private JLabel jLabel67;
  private JLabel jLabel68;
  private JLabel jLabel69;
  private JLabel jLabel7;
  private JLabel jLabel70;
  private JLabel jLabel71;
  private JLabel jLabel72;
  private JLabel jLabel73;
  private JLabel jLabel74;
  private JLabel jLabel75;
  private JLabel jLabel76;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private JLabel one_qty_cost;
  private JLabel resin_cost;
  private JLabel resin_litre;
  private JLabel total_cost;
}
