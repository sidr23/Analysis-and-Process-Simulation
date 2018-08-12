package process_simulation;

import javax.swing.JLabel;

public class Pf_view extends javax.swing.JFrame { String input;
  private javax.swing.JButton Back;
  private JLabel Construction_cost;
  private JLabel Steel_cost;
  private JLabel ac_cost_kg;
  private JLabel ac_wt;
  private JLabel anthracite_cost_kg;
  private JLabel anthracite_wt;
  private JLabel carbon_steel_cost;
  private JLabel carbon_steel_percent;
  private JLabel carbon_steel_perkg;
  private JLabel company_name;
  private JLabel date;
  private JLabel diameter;
  private JLabel drum_thickness;
  private JLabel drum_weight;
  private JLabel flow_rate;
  private JLabel fm_cost;
  private JLabel gravel_cost_kg;
  private JLabel gravel_wt; private JLabel height; private JLabel jLabel1; private JLabel jLabel10; private JLabel jLabel11; private JLabel jLabel12; private JLabel jLabel13; private JLabel jLabel14; private JLabel jLabel15; private JLabel jLabel16; private JLabel jLabel17; private JLabel jLabel18; private JLabel jLabel19; private JLabel jLabel2; private JLabel jLabel20; private JLabel jLabel21; private JLabel jLabel22;
  public Pf_view(String value) { initComponents();
    input = value;
    display(input); }
  
  private JLabel jLabel23;
  private JLabel jLabel24;
  private JLabel jLabel25;
  private JLabel jLabel26;
  private JLabel jLabel27;
  private JLabel jLabel28;
  private JLabel jLabel29;
  private JLabel jLabel3;
  private JLabel jLabel30;
  private JLabel jLabel31; private JLabel jLabel32; private JLabel jLabel33; private JLabel jLabel34; private JLabel jLabel35; private JLabel jLabel36;
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
    company_name = new JLabel();
    p_id = new JLabel();
    date = new JLabel();
    qty = new JLabel();
    flow_rate = new JLabel();
    total_weight = new JLabel();
    carbon_steel_percent = new JLabel();
    carbon_steel_perkg = new JLabel();
    carbon_steel_cost = new JLabel();
    stainless_steel_percent = new JLabel();
    ss_perkg = new JLabel();
    ss_cost = new JLabel();
    moc_cost = new JLabel();
    diameter = new JLabel();
    height = new JLabel();
    drum_thickness = new JLabel();
    shell_thickness = new JLabel();
    shell_weight = new JLabel();
    sand_wt = new JLabel();
    sand_cost_kg = new JLabel();
    total_sand_cost = new JLabel();
    gravel_wt = new JLabel();
    gravel_cost_kg = new JLabel();
    total_gravel_cost = new JLabel();
    pebbles_wt = new JLabel();
    pebbles_cost_kg = new JLabel();
    total_pebbles_cost = new JLabel();
    ac_wt = new JLabel();
    ac_cost_kg = new JLabel();
    total_ac_cost = new JLabel();
    anthracite_wt = new JLabel();
    anthracite_cost_kg = new JLabel();
    total_anthracite_cost = new JLabel();
    fm_cost = new JLabel();
    one_quantity_cost = new JLabel();
    total_cost = new JLabel();
    jLabel45 = new JLabel();
    msc_type = new JLabel();
    Back = new javax.swing.JButton();
    jLabel46 = new JLabel();
    pf_type = new JLabel();
    jLabel47 = new JLabel();
    jLabel48 = new JLabel();
    jLabel49 = new JLabel();
    jLabel50 = new JLabel();
    shell_diameter = new JLabel();
    Steel_cost = new JLabel();
    Construction_cost = new JLabel();
    drum_weight = new JLabel();
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
    setTitle("Pressure Filter");
    setResizable(false);
    
    jScrollPane1.setVerticalScrollBarPolicy(22);
    jScrollPane1.setPreferredSize(new java.awt.Dimension(308, 1000));
    
    jPanel1.setPreferredSize(new java.awt.Dimension(308, 2000));
    
    jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
    jLabel1.setText("  FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12));
    jLabel2.setText("PRESSURE FILTER");
    
    jLabel3.setText("PRODUCT ID");
    
    jLabel4.setText("COMPANY NAME");
    
    jLabel5.setText("FLOW RATE");
    
    jLabel6.setText("DATE");
    
    jLabel7.setText("QUANTITY");
    
    jLabel8.setText("MATERIAL OF CONSTRUCTION");
    
    jLabel9.setText("TOTAL WEIGHT");
    
    jLabel13.setText("CARBON STEEL %");
    
    jLabel14.setText("CARBON STEEL COST/KG");
    
    jLabel15.setText("CARBON STEEL COST");
    
    jLabel16.setText("STAINLESS STEEL %");
    
    jLabel17.setText("STAINLESS STEEL COST/KG");
    
    jLabel18.setText("STAINLESS STEEL COST");
    
    jLabel19.setText("TOTAL MOC COST");
    
    jLabel20.setText("SIZE OF FILTER");
    
    jLabel21.setText("DIAMETER");
    
    jLabel22.setText("HEIGHT");
    
    jLabel23.setText("DRUM THICKNESS");
    
    jLabel24.setText("SHELL THCKNESS");
    
    jLabel25.setText("WEIGHT OF SHELL");
    
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
    
    jLabel42.setText("FILTER MEDIUM COST");
    
    jLabel43.setText("TOTAL COST FOR ONE QUANTITY");
    
    jLabel44.setText("TOTAL COST");
    
    company_name.setText("0");
    
    p_id.setText("0");
    
    date.setText("0");
    
    qty.setText("0");
    
    flow_rate.setText("0");
    
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
    
    jLabel45.setText("MSC TYPE");
    
    msc_type.setText("0");
    
    Back.setText("Back");
    Back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Pf_view.this.BackActionPerformed(evt);
      }
      
    });
    jLabel46.setText("TYPE");
    
    pf_type.setText("0");
    
    jLabel47.setText("WEIGHT OF DRUM");
    
    jLabel48.setText("SHELL DIAMETER");
    
    jLabel49.setText("COST OF STEEL");
    
    jLabel50.setText("COST OF CONSTRUCTION");
    
    shell_diameter.setText("0");
    
    Steel_cost.setText("0");
    
    Construction_cost.setText("0");
    
    drum_weight.setText("0");
    
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
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGap(51, 51, 51).addComponent(jLabel1, -2, 237, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(112, 112, 112).addComponent(jLabel2, -2, 114, -2)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel28).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel64)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel29).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel65)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel42).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel74)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel31).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel66)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel32).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel67)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel34).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel68)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel35).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel69)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel37).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel70)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel38).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel71)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel40).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel72)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel27).addComponent(jLabel30).addComponent(jLabel33).addComponent(jLabel36).addComponent(jLabel39)).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel41).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel73)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel43).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, 32767).addComponent(jLabel75)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel44).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel76))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(ac_cost_kg, -2, 163, -2).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(ac_wt, javax.swing.GroupLayout.Alignment.LEADING, -1, 141, 32767).addComponent(total_pebbles_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(pebbles_cost_kg, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(pebbles_wt, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(total_gravel_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(gravel_cost_kg, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(gravel_wt, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(total_sand_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(sand_cost_kg, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(sand_wt, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel77).addComponent(jLabel78).addComponent(jLabel79).addComponent(jLabel80))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(total_anthracite_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, 140, 32767).addComponent(anthracite_cost_kg, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(anthracite_wt, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(total_ac_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel81)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(total_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, 140, 32767).addComponent(one_quantity_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(fm_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767)))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel15).addComponent(jLabel14).addComponent(jLabel9).addComponent(jLabel13).addComponent(jLabel16).addComponent(jLabel17).addComponent(jLabel18).addComponent(jLabel19).addComponent(jLabel45)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(msc_type, -2, 163, -2).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(moc_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, 100, 32767).addComponent(ss_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(ss_perkg, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(stainless_steel_percent, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(carbon_steel_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(carbon_steel_perkg, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(carbon_steel_percent, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(total_weight, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel11)))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4).addComponent(jLabel3).addComponent(jLabel6).addComponent(jLabel7).addComponent(jLabel5).addComponent(jLabel46)).addGap(112, 112, 112).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(p_id, -1, 163, 32767).addComponent(date, -1, -1, 32767).addComponent(qty, -1, -1, 32767).addComponent(company_name, -1, -1, 32767).addComponent(pf_type, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(flow_rate, -2, 94, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel10)))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel50).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel63)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel21).addComponent(jLabel22).addComponent(jLabel23).addComponent(jLabel24).addComponent(jLabel25).addComponent(jLabel47).addComponent(jLabel48).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel49).addGap(39, 39, 39).addComponent(jLabel62)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Construction_cost, -2, 106, -2).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(Steel_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, 96, 32767).addComponent(shell_weight, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(shell_thickness, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(shell_diameter, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(drum_weight, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(height, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(diameter, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767)).addComponent(drum_thickness, -2, 106, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel57).addComponent(jLabel55).addComponent(jLabel56).addComponent(jLabel58).addComponent(jLabel59).addComponent(jLabel60).addComponent(jLabel61))))))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel26).addComponent(jLabel20))).addGroup(jPanel1Layout.createSequentialGroup().addGap(103, 103, 103).addComponent(jLabel8)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(Back, -2, 80, -2))).addContainerGap(50, 32767)));
    




















































































































































































































    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, -2, 25, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel2, -2, 25, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(company_name)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(p_id)).addGap(5, 5, 5).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel46).addComponent(pf_type)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(date)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(qty)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(flow_rate).addComponent(jLabel10)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel8).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel45).addComponent(msc_type)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(total_weight).addComponent(jLabel11)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(carbon_steel_percent)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel14).addComponent(carbon_steel_perkg).addComponent(jLabel12)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel15).addComponent(carbon_steel_cost).addComponent(jLabel51)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(stainless_steel_percent)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel17).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(ss_perkg, -2, 14, -2).addComponent(jLabel52))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel18).addComponent(ss_cost).addComponent(jLabel53)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel19).addComponent(moc_cost).addComponent(jLabel54)).addGap(18, 18, 18).addComponent(jLabel20).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel21).addComponent(diameter).addComponent(jLabel55)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel22).addComponent(height).addComponent(jLabel56)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel23).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(drum_thickness, -2, 14, -2).addComponent(jLabel57))).addGap(4, 4, 4).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel47).addComponent(drum_weight).addComponent(jLabel58)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel48).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(shell_diameter, -2, 16, -2).addComponent(jLabel59))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel24).addComponent(shell_thickness).addComponent(jLabel60)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel25).addComponent(shell_weight).addComponent(jLabel61)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel49).addComponent(Steel_cost).addComponent(jLabel62)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel50).addComponent(Construction_cost).addComponent(jLabel63)).addGap(20, 20, 20).addComponent(jLabel26).addGap(13, 13, 13).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel27).addComponent(sand_wt).addComponent(jLabel77)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel28).addComponent(sand_cost_kg).addComponent(jLabel64)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel29).addComponent(total_sand_cost).addComponent(jLabel65)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel30).addComponent(gravel_wt).addComponent(jLabel78)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel31, -2, 14, -2).addComponent(gravel_cost_kg).addComponent(jLabel66)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel32).addComponent(total_gravel_cost).addComponent(jLabel67)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel33).addComponent(pebbles_wt).addComponent(jLabel79)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel34).addComponent(pebbles_cost_kg).addComponent(jLabel68)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel35).addComponent(total_pebbles_cost).addComponent(jLabel69)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel36).addComponent(ac_wt).addComponent(jLabel80)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel37).addComponent(ac_cost_kg).addComponent(jLabel70)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel38).addComponent(total_ac_cost).addComponent(jLabel71)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel39).addComponent(anthracite_wt).addComponent(jLabel81)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel40).addComponent(anthracite_cost_kg).addComponent(jLabel72)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel41).addComponent(total_anthracite_cost).addComponent(jLabel73)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel42).addComponent(jLabel74))).addComponent(fm_cost, -2, 14, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel43).addComponent(one_quantity_cost).addComponent(jLabel75)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel44).addComponent(total_cost).addComponent(jLabel76)).addGap(18, 18, 18).addComponent(Back).addContainerGap()));
    































































































































































































































    jScrollPane1.setViewportView(jPanel1);
    
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, -2, 434, -2).addContainerGap()));
    





    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(20, 32767).addComponent(jScrollPane1, -2, 1041, -2).addContainerGap()));
    






    pack(); }
  
  private JLabel jLabel37;
  private JLabel jLabel38;
  private void BackActionPerformed(java.awt.event.ActionEvent evt) { DataRetrival dr = new DataRetrival();
    dr.setVisible(true);
    setVisible(false); }
  
  private JLabel jLabel39;
  private JLabel jLabel4;
  private void display(String input) { java.sql.PreparedStatement ps = null;
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
      
      String query = "SELECT * FROM `pf_info` WHERE Product_id=?";
      ps = conn.prepareStatement(query);
      ps.setString(1, input);
      
      java.sql.ResultSet rs = ps.executeQuery();
      while (rs.next())
      {
        company_name.setText(rs.getString("Company_name"));
        p_id.setText(rs.getString("Product_id"));
        date.setText(rs.getString("date"));
        qty.setText(rs.getString("Qty"));
        flow_rate.setText(rs.getString("Flow_rate"));
        total_cost.setText(rs.getString("total_cost"));
      }
      String query1 = "SELECT * FROM `moc`WHERE Product_id=?";
      ps = conn.prepareStatement(query1);
      ps.setString(1, input);
      java.sql.ResultSet rs1 = ps.executeQuery();
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
      String query2 = "SELECT * FROM `filter_size`WHERE Product_id=?";
      ps = conn.prepareStatement(query2);
      ps.setString(1, input);
      java.sql.ResultSet rs2 = ps.executeQuery();
      
      while (rs2.next())
      {
        diameter.setText(rs2.getString("diameter"));
        height.setText(rs2.getString("height"));
        drum_thickness.setText(rs2.getString("drum_thickness"));
        shell_thickness.setText(rs2.getString("shell_thickness"));
        shell_weight.setText(rs2.getString("area"));
      }
      
      String query3 = "SELECT * FROM `pf-filter-media`WHERE Product_id=?";
      ps = conn.prepareStatement(query3);
      ps.setString(1, input);
      java.sql.ResultSet rs3 = ps.executeQuery();
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
    } }
  
  private JLabel jLabel40;
  private JLabel jLabel41;
  private JLabel jLabel42;
  private JLabel jLabel43;
  private JLabel jLabel44;
  private JLabel jLabel45;
  private JLabel jLabel46;
  private JLabel jLabel47;
  private JLabel jLabel48;
  
  public static void main(String[] args) { try { for (javax.swing.UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Pf_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Pf_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Pf_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Pf_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    


    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run() {
        new Pf_view("lt001").setVisible(true);
      }
    });
  }
  
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
  private JLabel jLabel77;
  private JLabel jLabel78;
  private JLabel jLabel79;
  private JLabel jLabel8;
  private JLabel jLabel80;
  private JLabel jLabel81;
  private JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private JLabel moc_cost;
  private JLabel msc_type;
  private JLabel one_quantity_cost;
  private JLabel p_id;
  private JLabel pebbles_cost_kg;
  private JLabel pebbles_wt;
  private JLabel pf_type;
  private JLabel qty;
  private JLabel sand_cost_kg;
  private JLabel sand_wt;
  private JLabel shell_diameter;
  private JLabel shell_thickness;
  private JLabel shell_weight;
  private JLabel ss_cost;
  private JLabel ss_perkg;
  private JLabel stainless_steel_percent;
  private JLabel total_ac_cost;
  private JLabel total_anthracite_cost;
  private JLabel total_cost;
  private JLabel total_gravel_cost;
  private JLabel total_pebbles_cost;
  private JLabel total_sand_cost;
  private JLabel total_weight;
}
