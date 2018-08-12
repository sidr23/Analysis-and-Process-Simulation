package process_simulation;

import javax.swing.JLabel;

public class Pf_edit extends javax.swing.JFrame { private javax.swing.JButton Back;
  private javax.swing.JTextField Construction_cost;
  private javax.swing.JButton Delete;
  private javax.swing.JButton Edit;
  private javax.swing.JTextField Steel_cost;
  private javax.swing.JTextField ac_cost_kg;
  private javax.swing.JTextField ac_wt;
  private javax.swing.JTextField anthracite_cost_kg;
  private javax.swing.JTextField anthracite_wt;
  private javax.swing.JTextField carbon_steel_cost;
  private javax.swing.JTextField carbon_steel_percent;
  private javax.swing.JTextField carbon_steel_perkg;
  private javax.swing.JTextField company_name;
  private javax.swing.JTextField date;
  private javax.swing.JTextField diameter;
  private javax.swing.JTextField drum_thickness;
  private javax.swing.JTextField drum_weight;
  private javax.swing.JTextField flow_rate;
  private javax.swing.JTextField fm_cost;
  private javax.swing.JTextField gravel_cost_kg; private javax.swing.JTextField gravel_wt; private javax.swing.JTextField height; private JLabel jLabel1; private JLabel jLabel10; private JLabel jLabel11; private JLabel jLabel12; private JLabel jLabel13; private JLabel jLabel14; private JLabel jLabel15; private JLabel jLabel16; private JLabel jLabel17; private JLabel jLabel18; private JLabel jLabel19; private JLabel jLabel2; private JLabel jLabel20; private JLabel jLabel21; private JLabel jLabel22; private JLabel jLabel23; private JLabel jLabel24; private JLabel jLabel25; private JLabel jLabel26; private JLabel jLabel27; private JLabel jLabel28; private JLabel jLabel29; private JLabel jLabel3;
  public Pf_edit(String value) { initComponents();
    
    display(); }
  
  private JLabel jLabel30;
  private JLabel jLabel31;
  private JLabel jLabel32;
  private JLabel jLabel33;
  private JLabel jLabel34;
  private JLabel jLabel35;
  private JLabel jLabel36;
  private JLabel jLabel37;
  private JLabel jLabel38;
  private JLabel jLabel39; private JLabel jLabel4; private JLabel jLabel40; private JLabel jLabel41; private JLabel jLabel42; private JLabel jLabel43; private JLabel jLabel44; private JLabel jLabel45; private JLabel jLabel46; private JLabel jLabel47; private JLabel jLabel48; private JLabel jLabel49; private JLabel jLabel5; private JLabel jLabel50; private JLabel jLabel51;
  private void initComponents() { jScrollPane1 = new javax.swing.JScrollPane();
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
    jLabel43 = new JLabel();
    jLabel44 = new JLabel();
    jLabel45 = new JLabel();
    company_name = new javax.swing.JTextField();
    p_id = new javax.swing.JTextField();
    date = new javax.swing.JTextField();
    qty = new javax.swing.JTextField();
    flow_rate = new javax.swing.JTextField();
    msc_type = new javax.swing.JTextField();
    total_weight = new javax.swing.JTextField();
    carbon_steel_percent = new javax.swing.JTextField();
    carbon_steel_perkg = new javax.swing.JTextField();
    carbon_steel_cost = new javax.swing.JTextField();
    stainless_steel_percent = new javax.swing.JTextField();
    ss_perkg = new javax.swing.JTextField();
    ss_cost = new javax.swing.JTextField();
    moc_cost = new javax.swing.JTextField();
    diameter = new javax.swing.JTextField();
    height = new javax.swing.JTextField();
    drum_thickness = new javax.swing.JTextField();
    shell_thickness = new javax.swing.JTextField();
    shell_weight = new javax.swing.JTextField();
    sand_wt = new javax.swing.JTextField();
    sand_cost_kg = new javax.swing.JTextField();
    total_sand_cost = new javax.swing.JTextField();
    gravel_wt = new javax.swing.JTextField();
    gravel_cost_kg = new javax.swing.JTextField();
    total_gravel_cost = new javax.swing.JTextField();
    pebbles_wt = new javax.swing.JTextField();
    pebbles_cost_kg = new javax.swing.JTextField();
    total_pebbles_cost = new javax.swing.JTextField();
    ac_wt = new javax.swing.JTextField();
    ac_cost_kg = new javax.swing.JTextField();
    total_ac_cost = new javax.swing.JTextField();
    anthracite_wt = new javax.swing.JTextField();
    anthracite_cost_kg = new javax.swing.JTextField();
    total_anthracite_cost = new javax.swing.JTextField();
    fm_cost = new javax.swing.JTextField();
    one_quantity_cost = new javax.swing.JTextField();
    total_cost = new javax.swing.JTextField();
    Edit = new javax.swing.JButton();
    Delete = new javax.swing.JButton();
    Back = new javax.swing.JButton();
    jLabel46 = new JLabel();
    pf_type = new javax.swing.JTextField();
    jLabel47 = new JLabel();
    jLabel48 = new JLabel();
    jLabel49 = new JLabel();
    jLabel50 = new JLabel();
    drum_weight = new javax.swing.JTextField();
    shell_diameter = new javax.swing.JTextField();
    Steel_cost = new javax.swing.JTextField();
    Construction_cost = new javax.swing.JTextField();
    jLabel10 = new JLabel();
    jLabel11 = new JLabel();
    jLabel12 = new JLabel();
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
    jLabel71 = new JLabel();
    jLabel72 = new JLabel();
    jLabel73 = new JLabel();
    jLabel74 = new JLabel();
    jLabel75 = new JLabel();
    jLabel76 = new JLabel();
    jLabel77 = new JLabel();
    jLabel78 = new JLabel();
    jLabel79 = new JLabel();
    jLabel80 = new JLabel();
    jLabel81 = new JLabel();
    
    setDefaultCloseOperation(3);
    setResizable(false);
    
    jScrollPane1.setVerticalScrollBarPolicy(22);
    
    jPanel1.setPreferredSize(new java.awt.Dimension(464, 1667));
    
    jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12));
    jLabel2.setText("PRESSURE FILTER");
    
    jLabel3.setText("COMPANY NAME");
    
    jLabel4.setText("PRODUCT ID");
    
    jLabel5.setText("QUANTITY");
    
    jLabel6.setText("DATE");
    
    jLabel7.setText("FLOW RATE");
    
    jLabel8.setText("MATERIAL OF CONSTRUCTION");
    
    jLabel9.setText("TOTAL WEIGHT");
    
    jLabel13.setText("CARBON STEEL %");
    
    jLabel14.setText("CARBON STEEL COST/KG");
    
    jLabel15.setText("CARBON STEEL COST");
    
    jLabel16.setText("STAINLESS STEEL %");
    
    jLabel17.setText("STAINLESS STEEL COST/KG");
    
    jLabel18.setText("STAINLESS STEEL COST");
    
    jLabel19.setText("TOTAL CONSTRUCTION COST");
    
    jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12));
    jLabel20.setText("SIZE OF FILTER");
    
    jLabel21.setText("DIAMETER");
    
    jLabel22.setText("HEIGHT");
    
    jLabel23.setText("DRUM THICKNESS");
    
    jLabel24.setText("SHELL THICKNESS");
    
    jLabel25.setText("SHELL WEIGHT");
    
    jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 12));
    jLabel26.setText("FILTER MEDIA");
    
    jLabel27.setText("SAND WT");
    
    jLabel28.setText("SAND COST/KG");
    
    jLabel29.setText("TOTAL SAND COST");
    
    jLabel30.setText("GRAVEL WT");
    
    jLabel31.setText("GRAVEL COST/KG");
    
    jLabel32.setText("TOTAL GRAVEL COST");
    
    jLabel33.setText("PEBBLES WT");
    
    jLabel34.setText("PEBBLES COST/KG");
    
    jLabel35.setText("TOTAL PEBBLES COST");
    
    jLabel36.setText("AC WT");
    
    jLabel37.setText("AC COST/KG");
    
    jLabel38.setText("TOTAL AC COST");
    
    jLabel39.setText("ANTHRACITE WT");
    
    jLabel40.setText("ANTHRACITE COST/KG");
    
    jLabel41.setText("TOTAL ANTHRACITE COST");
    
    jLabel42.setText("FILTER MEDIA COST");
    
    jLabel43.setText("MSC TYPE");
    
    jLabel44.setText("COST FOR ONE QUANTITY");
    
    jLabel45.setText("TOTAL COST");
    
    company_name.setEditable(false);
    company_name.setText("0");
    
    p_id.setEditable(false);
    p_id.setText("0");
    
    date.setText("0");
    
    qty.setText("0");
    qty.setToolTipText("");
    
    flow_rate.setText("0");
    
    msc_type.setText("0");
    
    total_weight.setText("0");
    
    carbon_steel_percent.setText("0");
    
    carbon_steel_perkg.setText("0");
    
    carbon_steel_cost.setText("0");
    
    stainless_steel_percent.setText("0");
    
    ss_perkg.setText("0");
    
    ss_cost.setText("0");
    
    moc_cost.setText("0");
    
    diameter.setText("0");
    
    height.setText("0");
    
    drum_thickness.setText("0");
    
    shell_thickness.setText("0");
    
    shell_weight.setText("0");
    
    sand_wt.setText("0");
    
    sand_cost_kg.setText("0");
    
    total_sand_cost.setText("0");
    
    gravel_wt.setText("0");
    
    gravel_cost_kg.setText("0");
    
    total_gravel_cost.setText("0");
    
    pebbles_wt.setText("0");
    
    pebbles_cost_kg.setText("0");
    
    total_pebbles_cost.setText("0");
    
    ac_wt.setText("0");
    
    ac_cost_kg.setText("0");
    
    total_ac_cost.setText("0");
    
    anthracite_wt.setText("0");
    
    anthracite_cost_kg.setText("0");
    
    total_anthracite_cost.setText("0");
    
    fm_cost.setText("0");
    
    one_quantity_cost.setText("0");
    
    total_cost.setText("0");
    
    Edit.setText("Edit");
    Edit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Pf_edit.this.EditActionPerformed(evt);
      }
      
    });
    Delete.setText("Delete");
    Delete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Pf_edit.this.DeleteActionPerformed(evt);
      }
      
    });
    Back.setText("Back");
    Back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Pf_edit.this.BackActionPerformed(evt);
      }
      
    });
    jLabel46.setText("TYPE");
    
    jLabel47.setText("DRUM WEIGHT");
    
    jLabel48.setText("SHELL DIAMETER");
    
    jLabel49.setText("COST OF STEEL");
    
    jLabel50.setText("CONSTRUCTION COST");
    
    jLabel10.setText("cubic m/hr");
    
    jLabel11.setText("kg");
    
    jLabel12.setText("Rs");
    
    jLabel51.setText("Rs");
    
    jLabel52.setText("Rs");
    
    jLabel53.setText("Rs");
    
    jLabel54.setText("Rs");
    
    jLabel55.setText("m");
    
    jLabel56.setText("m");
    
    jLabel57.setText("mm");
    
    jLabel58.setText("kg");
    
    jLabel59.setText("m");
    
    jLabel60.setText("mm");
    
    jLabel61.setText("kg");
    
    jLabel62.setText("Rs");
    
    jLabel63.setText("Rs");
    
    jLabel64.setText("Rs");
    
    jLabel65.setText("Rs");
    
    jLabel66.setText("Rs");
    
    jLabel67.setText("Rs");
    
    jLabel68.setText("Rs");
    
    jLabel69.setText("Rs");
    
    jLabel70.setText("Rs");
    
    jLabel71.setText("Rs");
    
    jLabel72.setText("Rs");
    
    jLabel73.setText("Rs");
    
    jLabel74.setText("Rs");
    
    jLabel75.setText("Rs");
    
    jLabel76.setText("Rs");
    
    jLabel77.setText("kg");
    
    jLabel78.setText("kg");
    
    jLabel79.setText("kg");
    
    jLabel80.setText("kg");
    
    jLabel81.setText("kg");
    
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(104, 104, 104).addComponent(jLabel8)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(Back, -2, 88, -2).addGap(27, 27, 27).addComponent(Edit, -2, 110, -2))).addContainerGap(-1, 32767)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel31).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel74)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel44).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, 32767).addComponent(jLabel64)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel45).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel65)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel42).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel66)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel41).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel67)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel40).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel68)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel38).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel69)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel37).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel70)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel35).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel71)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel34).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel72))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel73))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(total_gravel_cost, -2, 140, -2).addGap(77, 77, 77)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(Delete, -2, 115, -2).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(gravel_cost_kg, -2, 140, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(gravel_wt, -2, 140, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel78)).addComponent(total_sand_cost, -2, 140, -2).addComponent(sand_cost_kg, -2, 140, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(sand_wt, -2, 140, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel77)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(pebbles_wt, -2, 140, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel79)).addComponent(pebbles_cost_kg, -2, 140, -2).addComponent(total_pebbles_cost, -2, 140, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(ac_wt, -2, 140, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel80)).addComponent(ac_cost_kg, -2, 140, -2).addComponent(total_ac_cost, -2, 140, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(anthracite_wt, -2, 140, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel81)).addComponent(anthracite_cost_kg, -2, 140, -2).addComponent(total_anthracite_cost, -2, 140, -2).addComponent(fm_cost, -2, 140, -2).addComponent(one_quantity_cost, -2, 140, -2).addComponent(total_cost, -2, 140, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(diameter, -2, 132, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel55)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(height, -2, 132, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel56)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(shell_thickness, -2, 132, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel60)).addComponent(moc_cost, -2, 132, -2).addComponent(ss_cost, -2, 132, -2).addComponent(ss_perkg, -2, 132, -2).addComponent(stainless_steel_percent, -2, 132, -2).addComponent(carbon_steel_cost, -2, 132, -2).addComponent(carbon_steel_perkg, -2, 132, -2).addComponent(carbon_steel_percent, -2, 132, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(total_weight, -2, 132, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel11)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(pf_type, javax.swing.GroupLayout.Alignment.LEADING).addComponent(flow_rate, javax.swing.GroupLayout.Alignment.LEADING, -1, 132, 32767).addComponent(msc_type, javax.swing.GroupLayout.Alignment.LEADING, -1, 132, 32767).addComponent(qty, javax.swing.GroupLayout.Alignment.LEADING, -1, 132, 32767).addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, -1, 132, 32767).addComponent(p_id, javax.swing.GroupLayout.Alignment.LEADING, -1, 132, 32767).addComponent(company_name, javax.swing.GroupLayout.Alignment.LEADING, -1, 132, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel10)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(shell_diameter, javax.swing.GroupLayout.Alignment.LEADING).addComponent(drum_weight, javax.swing.GroupLayout.Alignment.LEADING).addComponent(drum_thickness, javax.swing.GroupLayout.Alignment.LEADING, -1, 132, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel57).addComponent(jLabel58).addComponent(jLabel59))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(Construction_cost, javax.swing.GroupLayout.Alignment.LEADING).addComponent(Steel_cost, javax.swing.GroupLayout.Alignment.LEADING).addComponent(shell_weight, javax.swing.GroupLayout.Alignment.LEADING, -1, 132, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel61)))).addContainerGap()))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel25).addComponent(jLabel24).addComponent(jLabel23).addComponent(jLabel22).addComponent(jLabel21).addComponent(jLabel16).addComponent(jLabel13).addComponent(jLabel9).addComponent(jLabel43).addComponent(jLabel3).addComponent(jLabel4).addComponent(jLabel6).addComponent(jLabel5).addComponent(jLabel7).addGroup(jPanel1Layout.createSequentialGroup().addGap(72, 72, 72).addComponent(jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(132, 132, 132).addComponent(jLabel2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(122, 122, 122).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel20).addComponent(jLabel26))).addComponent(jLabel46).addComponent(jLabel47).addComponent(jLabel48).addComponent(jLabel27).addComponent(jLabel30).addComponent(jLabel32).addComponent(jLabel33).addComponent(jLabel36).addComponent(jLabel39).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel28).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel76)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel50).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel63)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel49).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel62)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel19).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel54)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel18).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel53)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel17).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel52)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel15).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel51)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel14).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel12)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel29).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel75))).addGap(54, 54, 54))).addGap(0, 0, 32767)))));    
    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(company_name, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(p_id, -2, -1, -2).addComponent(jLabel4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel46).addComponent(pf_type, -2, -1, -2)).addGap(9, 9, 9).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(date, -2, -1, -2).addComponent(jLabel6)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(qty, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(flow_rate, -2, -1, -2).addComponent(jLabel10)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel8).addGap(9, 9, 9).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel43).addComponent(msc_type, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(total_weight, -2, -1, -2).addComponent(jLabel11)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(carbon_steel_percent, -2, -1, -2).addComponent(jLabel13)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(carbon_steel_perkg, -2, -1, -2).addComponent(jLabel14).addComponent(jLabel12)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel15, -2, 14, -2).addComponent(carbon_steel_cost, -2, -1, -2).addComponent(jLabel51)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(stainless_steel_percent, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(ss_perkg, -2, -1, -2).addComponent(jLabel52)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel18).addComponent(ss_cost, -2, -1, -2).addComponent(jLabel53)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel19).addComponent(moc_cost, -2, -1, -2).addComponent(jLabel54)).addGap(18, 18, 18).addComponent(jLabel20).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel21).addComponent(diameter, -2, -1, -2).addComponent(jLabel55)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel22).addComponent(height, -2, -1, -2).addComponent(jLabel56)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel23).addComponent(drum_thickness, -2, -1, -2).addComponent(jLabel57)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel47).addComponent(drum_weight, -2, -1, -2).addComponent(jLabel58)).addGap(3, 3, 3).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel48).addComponent(shell_diameter, -2, -1, -2).addComponent(jLabel59)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel24).addComponent(shell_thickness, -2, -1, -2).addComponent(jLabel60)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel25).addComponent(shell_weight, -2, -1, -2).addComponent(jLabel61)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel49).addComponent(Steel_cost, -2, -1, -2).addComponent(jLabel62)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel50).addComponent(Construction_cost, -2, -1, -2).addComponent(jLabel63)).addGap(9, 9, 9).addComponent(jLabel26).addGap(13, 13, 13).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel27).addComponent(sand_wt, -2, -1, -2).addComponent(jLabel77)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel28).addComponent(sand_cost_kg, -2, -1, -2).addComponent(jLabel76)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel29).addComponent(total_sand_cost, -2, -1, -2).addComponent(jLabel75)).addGap(6, 6, 6).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel30).addComponent(gravel_wt, -2, -1, -2).addComponent(jLabel78)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel31).addComponent(gravel_cost_kg, -2, -1, -2).addComponent(jLabel74)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel32).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(total_gravel_cost, -2, -1, -2).addComponent(jLabel73))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel33).addComponent(pebbles_wt, -2, -1, -2).addComponent(jLabel79)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel34).addComponent(pebbles_cost_kg, -2, -1, -2).addComponent(jLabel72)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel35).addComponent(total_pebbles_cost, -2, -1, -2).addComponent(jLabel71)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel36).addComponent(ac_wt, -2, -1, -2).addComponent(jLabel80)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel37).addComponent(ac_cost_kg, -2, -1, -2).addComponent(jLabel70)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel38).addComponent(total_ac_cost, -2, -1, -2).addComponent(jLabel69)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel39).addComponent(anthracite_wt, -2, -1, -2).addComponent(jLabel81)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel40).addComponent(anthracite_cost_kg, -2, 20, -2).addComponent(jLabel68)).addGap(12, 12, 12).addComponent(jLabel41)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(total_anthracite_cost, -2, -1, -2).addComponent(jLabel67))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel42).addComponent(fm_cost, -2, -1, -2).addComponent(jLabel66)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(one_quantity_cost, -2, -1, -2).addComponent(jLabel44).addComponent(jLabel64)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel45).addComponent(total_cost, -2, -1, -2).addComponent(jLabel65)).addGap(29, 29, 29).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Edit).addComponent(Delete).addComponent(Back)).addContainerGap(358, 32767)));    
    jScrollPane1.setViewportView(jPanel1);    
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, -1, 449, 32767));    
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(35, 35, 35).addComponent(jScrollPane1, -1, 1279, 32767).addContainerGap()));   
    pack(); 
  }  
  private JLabel jLabel52;
  private JLabel jLabel53; private JLabel jLabel54; private JLabel jLabel55; private JLabel jLabel56; private JLabel jLabel57;
  private void BackActionPerformed(java.awt.event.ActionEvent evt) { DataRetrival dr = new DataRetrival();
    dr.setVisible(true);
    setVisible(false); }
  
  private JLabel jLabel58;
  private JLabel jLabel59; private JLabel jLabel6; private JLabel jLabel60; private JLabel jLabel61;
  private void DeleteActionPerformed(java.awt.event.ActionEvent evt) { int p = javax.swing.JOptionPane.showConfirmDialog(null, "Do ou really want to delete", "Delete", 0);
    if (p == 0)
    {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
        String query1 = "DELETE FROM `pf_info` WHERE Product_id=?;";
        java.sql.PreparedStatement stmt1 = conn.prepareStatement(query1);
        stmt1.setString(1, p_id.getText());
        stmt1.executeUpdate();
        String query2 = "DELETE FROM `moc` WHERE Product_id=?;";
        java.sql.PreparedStatement stmt2 = conn.prepareStatement(query2);
        stmt2.setString(1, p_id.getText());
        stmt2.executeUpdate();
        String query3 = "DELETE FROM `filter_size` WHERE Product_id=?;";
        java.sql.PreparedStatement stmt3 = conn.prepareStatement(query3);
        stmt3.setString(1, p_id.getText());
        stmt3.executeUpdate();
        String query4 = "DELETE FROM `pf-filter-media` WHERE Product_id=?;";
        java.sql.PreparedStatement stmt4 = conn.prepareStatement(query4);
        stmt4.setString(1, p_id.getText());
        stmt4.executeUpdate();
        javax.swing.JOptionPane.showMessageDialog(null, "Successfully Deleted");
      }
      catch (ClassNotFoundException|java.sql.SQLException e)
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Error in connection"); } } }
  
  private JLabel jLabel62;
  private JLabel jLabel63;
  private JLabel jLabel64;
  private JLabel jLabel65;
  private JLabel jLabel66;
  private JLabel jLabel67; private JLabel jLabel68; private JLabel jLabel69; private JLabel jLabel7;
  private void EditActionPerformed(java.awt.event.ActionEvent evt) { try { Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
      

      String query5 = "UPDATE `pf_info` SET `TYPE`=?,`date`=?,`Qty`=?,`Flow_rate`=?,`total_cost`=? WHERE Product_id=?;";
      java.sql.PreparedStatement stmt5 = conn.prepareStatement(query5);
      
      stmt5.setString(1, pf_type.getText());
      stmt5.setString(2, date.getText());
      stmt5.setInt(3, Integer.parseInt(qty.getText()));
      stmt5.setDouble(4, Double.parseDouble(flow_rate.getText()));
      stmt5.setDouble(5, Double.parseDouble(total_cost.getText()));
      stmt5.setString(6, p_id.getText());
      stmt5.executeUpdate();
      
      String query6 = "UPDATE `moc` SET `msc_type`=?,`total_wt`=?,`cs_percent`=?,`cs_kg`=?,`cs_cost`=?,`ss_percent`=?,`ss_kg`=?,`ss_cost`=?,`moc_cost`=? WHERE Product_id=?;";
      java.sql.PreparedStatement stmt6 = conn.prepareStatement(query6);
      
      stmt6.setString(1, msc_type.getText());
      stmt6.setDouble(2, Double.parseDouble(total_weight.getText()));
      stmt6.setDouble(3, Double.parseDouble(carbon_steel_percent.getText()));
      stmt6.setDouble(4, Double.parseDouble(carbon_steel_perkg.getText()));
      stmt6.setDouble(5, Double.parseDouble(carbon_steel_cost.getText()));
      stmt6.setDouble(6, Double.parseDouble(stainless_steel_percent.getText()));
      stmt6.setDouble(7, Double.parseDouble(ss_perkg.getText()));
      stmt6.setDouble(8, Double.parseDouble(ss_cost.getText()));
      stmt6.setDouble(9, Double.parseDouble(moc_cost.getText()));
      stmt6.setString(10, p_id.getText());
      stmt6.executeUpdate();
      
      String query7 = "UPDATE `filter_size` SET `diameter`=?,`height`=?,`drum_thickness`=?,`DRUM_WT`=?,`SHELL_DIAMETER`=?,`shell_thickness`=?,`SHELL_WT`=?,`STEEL_COST`=?,`area`=? WHERE Product_id=?;";
      java.sql.PreparedStatement stmt7 = conn.prepareStatement(query7);
      
      stmt7.setDouble(1, Double.parseDouble(diameter.getText()));
      stmt7.setDouble(2, Double.parseDouble(height.getText()));
      stmt7.setDouble(3, Double.parseDouble(drum_thickness.getText()));
      stmt7.setDouble(4, Double.parseDouble(drum_weight.getText()));
      stmt7.setDouble(5, Double.parseDouble(shell_diameter.getText()));
      stmt7.setDouble(6, Double.parseDouble(shell_thickness.getText()));
      stmt7.setDouble(7, Double.parseDouble(shell_weight.getText()));
      stmt7.setDouble(8, Double.parseDouble(Steel_cost.getText()));
      stmt7.setDouble(9, Double.parseDouble(Construction_cost.getText()));
      stmt7.setString(10, p_id.getText());
      stmt7.executeUpdate();
      
      String query8 = "UPDATE `pf-filter-media` SET `sand_wt`=?,`sand_kg`=?,`sand_cost`=?,`gravel_wt`=?,`gravel_kg`=?,`gravel_cost`=?,`pebbles_wt`=?,`pebbles_kg`=?,`pebbles_cost`=?,`ac_wt`=?,`ac_kg`=?,`ac_cost`=?,`anthracite_wt`=?,`anthracite_kg`=?,`anthracite_cost`=?,`fm_cost`=?,`one_qty_cost`=? WHERE Product_id=?;";
      java.sql.PreparedStatement stmt8 = conn.prepareStatement(query8);
      
      stmt8.setDouble(1, Double.parseDouble(sand_wt.getText()));
      stmt8.setDouble(2, Double.parseDouble(sand_cost_kg.getText()));
      stmt8.setDouble(3, Double.parseDouble(total_sand_cost.getText()));
      stmt8.setDouble(4, Double.parseDouble(ac_wt.getText()));
      stmt8.setDouble(5, Double.parseDouble(ac_cost_kg.getText()));
      stmt8.setDouble(6, Double.parseDouble(total_ac_cost.getText()));
      stmt8.setDouble(7, Double.parseDouble(gravel_wt.getText()));
      stmt8.setDouble(8, Double.parseDouble(gravel_cost_kg.getText()));
      stmt8.setDouble(9, Double.parseDouble(total_gravel_cost.getText()));
      stmt8.setDouble(10, Double.parseDouble(pebbles_wt.getText()));
      stmt8.setDouble(11, Double.parseDouble(pebbles_cost_kg.getText()));
      stmt8.setDouble(12, Double.parseDouble(total_pebbles_cost.getText()));
      stmt8.setDouble(13, Double.parseDouble(anthracite_wt.getText()));
      stmt8.setDouble(14, Double.parseDouble(anthracite_cost_kg.getText()));
      stmt8.setDouble(15, Double.parseDouble(total_anthracite_cost.getText()));
      stmt8.setDouble(16, Double.parseDouble(fm_cost.getText()));
      stmt8.setDouble(17, Double.parseDouble(one_quantity_cost.getText()));
      stmt8.setString(18, p_id.getText());
      stmt8.executeUpdate();
      javax.swing.JOptionPane.showMessageDialog(null, "Successfully Updated");
    }
    catch (ClassNotFoundException|java.sql.SQLException e)
    {
      javax.swing.JOptionPane.showMessageDialog(null, "Error in connection" + e);
    } }
  
  private JLabel jLabel70;
  private JLabel jLabel71;
  private JLabel jLabel72;
  
  private void display() { try { Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
      String query = "SELECT * FROM Pf_info";
      java.sql.Statement stmt = conn.createStatement();
      java.sql.ResultSet rs = stmt.executeQuery(query);
      while (rs.next())
      {
        company_name.setText(rs.getString("Company_name"));
        p_id.setText(rs.getString("Product_id"));
        pf_type.setText(rs.getString("TYPE"));
        date.setText(rs.getString("date"));
        qty.setText(rs.getString("Qty"));
        flow_rate.setText(rs.getString("Flow_rate"));
        total_cost.setText(rs.getString("total_cost"));
      }
      
      String query1 = "SELECT * FROM moc";
      java.sql.Statement stmt1 = conn.createStatement();
      java.sql.ResultSet rs1 = stmt1.executeQuery(query1);
      while (rs1.next())
      {
        msc_type.setText(rs1.getString("msc_type"));
        total_weight.setText(rs1.getString("total_wt"));
        carbon_steel_percent.setText(rs1.getString("cs_percent"));
        carbon_steel_perkg.setText(rs1.getString("cs_kg"));
        carbon_steel_cost.setText(rs1.getString("cs_cost"));
        stainless_steel_percent.setText(rs1.getString("ss_percent"));
        ss_perkg.setText(rs1.getString("ss_kg"));
        ss_cost.setText(rs1.getString("ss_cost"));
        moc_cost.setText(rs1.getString("moc_cost"));
      }
      
      String query2 = "SELECT * FROM filter_size";
      java.sql.Statement stmt2 = conn.createStatement();
      java.sql.ResultSet rs2 = stmt2.executeQuery(query2);
      while (rs2.next())
      {
        diameter.setText(rs2.getString("diameter"));
        height.setText(rs2.getString("height"));
        drum_thickness.setText(rs2.getString("drum_thickness"));
        drum_weight.setText(rs2.getString("DRUM_WT"));
        shell_diameter.setText(rs2.getString("SHELL_DIAMETER"));
        shell_thickness.setText(rs2.getString("shell_thickness"));
        shell_weight.setText(rs2.getString("SHELL_WT"));
        Steel_cost.setText(rs2.getString("STEEL_COST"));
        Construction_cost.setText(rs2.getString("area"));
      }
      
      String query3 = "SELECT * FROM `pf-filter-media`";
      java.sql.Statement stmt3 = conn.createStatement();
      java.sql.ResultSet rs3 = stmt3.executeQuery(query3);
      while (rs3.next())
      {
        sand_wt.setText(rs3.getString("sand_wt"));
        sand_cost_kg.setText(rs3.getString("sand_kg"));
        total_sand_cost.setText(rs3.getString("sand_cost"));
        gravel_wt.setText(rs3.getString("gravel_wt"));
        gravel_cost_kg.setText(rs3.getString("gravel_kg"));
        total_gravel_cost.setText(rs3.getString("gravel_cost"));
        pebbles_wt.setText(rs3.getString("pebbles_wt"));
        pebbles_cost_kg.setText(rs3.getString("pebbles_kg"));
        total_pebbles_cost.setText(rs3.getString("pebbles_cost"));
        ac_wt.setText(rs3.getString("ac_wt"));
        ac_cost_kg.setText(rs3.getString("ac_kg"));
        total_ac_cost.setText(rs3.getString("ac_cost"));
        anthracite_wt.setText(rs3.getString("anthracite_wt"));
        anthracite_cost_kg.setText(rs3.getString("anthracite_kg"));
        total_anthracite_cost.setText(rs3.getString("anthracite_cost"));
        fm_cost.setText(rs3.getString("fm_cost"));
        one_quantity_cost.setText(rs3.getString("one_qty_cost"));
      }
    }
    catch (ClassNotFoundException|java.sql.SQLException e)
    {
      javax.swing.JOptionPane.showMessageDialog(null, "Error in connection" + e);
    }
  }
  
  private JLabel jLabel73;
  private JLabel jLabel74;
  private JLabel jLabel75;
  private JLabel jLabel76;
  private JLabel jLabel77;
  private JLabel jLabel78;
  
  public static void main(String[] args) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Pf_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Pf_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Pf_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Pf_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    


    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run() {
        new Pf_edit("pf001").setVisible(true);
      }
    });
  }
  
  private JLabel jLabel79;
  private JLabel jLabel8;
  private JLabel jLabel80;
  private JLabel jLabel81;
  private JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField moc_cost;
  private javax.swing.JTextField msc_type;
  private javax.swing.JTextField one_quantity_cost;
  private javax.swing.JTextField p_id;
  private javax.swing.JTextField pebbles_cost_kg;
  private javax.swing.JTextField pebbles_wt;
  private javax.swing.JTextField pf_type;
  private javax.swing.JTextField qty;
  private javax.swing.JTextField sand_cost_kg;
  private javax.swing.JTextField sand_wt;
  private javax.swing.JTextField shell_diameter;
  private javax.swing.JTextField shell_thickness;
  private javax.swing.JTextField shell_weight;
  private javax.swing.JTextField ss_cost;
  private javax.swing.JTextField ss_perkg;
  private javax.swing.JTextField stainless_steel_percent;
  private javax.swing.JTextField total_ac_cost;
  private javax.swing.JTextField total_anthracite_cost;
  private javax.swing.JTextField total_cost;
  private javax.swing.JTextField total_gravel_cost;
  private javax.swing.JTextField total_pebbles_cost;
  private javax.swing.JTextField total_sand_cost;
  private javax.swing.JTextField total_weight;
}
