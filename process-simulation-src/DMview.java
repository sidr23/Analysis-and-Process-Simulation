package process_simulation;

import javax.swing.JLabel;

public class DMview extends javax.swing.JFrame { String input;
  private JLabel AC;
  private JLabel AC_cost;
  private JLabel AC_kg;
  private JLabel AD_diameter;
  private JLabel AD_height;
  private JLabel AD_thickness;
  private JLabel AD_weight;
  private JLabel AS_diameter;
  private JLabel AS_thickness;
  private JLabel AS_weight;
  private JLabel Aamount_of_salt;
  private JLabel Anion_total_cost;
  private JLabel Aresin_capacity;
  private JLabel Aresin_height;
  private JLabel Arubber_lining_area;
  private JLabel Avolume_of_resin;
  private javax.swing.JButton Back;
  private JLabel CD_diameter;
  private JLabel CD_height; private JLabel CD_thickness; private JLabel CD_weight; private JLabel CS_diameter; private JLabel CS_thickness; private JLabel CS_weight; private JLabel Camount_of_salt; private JLabel Cation_total_cost; private JLabel Cresin_capacity; private JLabel Cresin_height; private JLabel Crubber_lining_area; private JLabel Cvolume_of_resin;
  public DMview(String value) { initComponents();
    input = value;
    display(input); }
  
  private JLabel Gravel;
  private JLabel Gravel_cost;
  private JLabel Gravel_kg;
  private JLabel Media_cost;
  private JLabel Pebbles;
  private JLabel Pebbles_cost;
  private JLabel Pebbles_kg;
  private JLabel Sand;
  private JLabel Sand_cost;
  private JLabel Sand_kg; private JLabel anion_resin_cost; private JLabel anion_resin_litre; private JLabel cation_resin_cost; private JLabel cation_resin_litre; private JLabel company_name; private JLabel date; private JLabel fabrication_cost; private JLabel fabrication_kg; private JLabel flow_rate; private JLabel jLabel1;
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
    jLabel43 = new JLabel();
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
    company_name = new JLabel();
    product_id = new JLabel();
    date = new JLabel();
    type = new JLabel();
    qty = new JLabel();
    flow_rate = new JLabel();
    operational_hrs = new JLabel();
    Camount_of_salt = new JLabel();
    Cresin_capacity = new JLabel();
    Cvolume_of_resin = new JLabel();
    Cresin_height = new JLabel();
    CD_height = new JLabel();
    CD_diameter = new JLabel();
    CD_thickness = new JLabel();
    CD_weight = new JLabel();
    CS_diameter = new JLabel();
    CS_thickness = new JLabel();
    CS_weight = new JLabel();
    Crubber_lining_area = new JLabel();
    steel_cost_kg = new JLabel();
    Cation_total_cost = new JLabel();
    Anion_total_cost = new JLabel();
    rubber_lining_costm2 = new JLabel();
    total_rubber_lining_cost = new JLabel();
    fabrication_cost = new JLabel();
    Sand = new JLabel();
    Sand_kg = new JLabel();
    Sand_cost = new JLabel();
    Gravel = new JLabel();
    Gravel_kg = new JLabel();
    Gravel_cost = new JLabel();
    Pebbles = new JLabel();
    Pebbles_kg = new JLabel();
    Pebbles_cost = new JLabel();
    AC = new JLabel();
    AC_kg = new JLabel();
    AC_cost = new JLabel();
    Media_cost = new JLabel();
    one_quantity_cost = new JLabel();
    total_dm_cost = new JLabel();
    Aamount_of_salt = new JLabel();
    Aresin_capacity = new JLabel();
    Avolume_of_resin = new JLabel();
    Aresin_height = new JLabel();
    AD_height = new JLabel();
    AD_diameter = new JLabel();
    AD_thickness = new JLabel();
    AD_weight = new JLabel();
    AS_diameter = new JLabel();
    AS_thickness = new JLabel();
    AS_weight = new JLabel();
    Arubber_lining_area = new JLabel();
    jLabel109 = new JLabel();
    Back = new javax.swing.JButton();
    jLabel57 = new JLabel();
    fabrication_kg = new JLabel();
    jLabel58 = new JLabel();
    jLabel59 = new JLabel();
    jLabel60 = new JLabel();
    jLabel61 = new JLabel();
    cation_resin_litre = new JLabel();
    cation_resin_cost = new JLabel();
    anion_resin_litre = new JLabel();
    anion_resin_cost = new JLabel();
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
    jLabel82 = new JLabel();
    jLabel83 = new JLabel();
    jLabel84 = new JLabel();
    jLabel85 = new JLabel();
    jLabel86 = new JLabel();
    jLabel87 = new JLabel();
    jLabel88 = new JLabel();
    jLabel89 = new JLabel();
    jLabel90 = new JLabel();
    jLabel91 = new JLabel();
    jLabel92 = new JLabel();
    jLabel93 = new JLabel();
    jLabel94 = new JLabel();
    jLabel95 = new JLabel();
    jLabel96 = new JLabel();
    jLabel97 = new JLabel();
    jLabel98 = new JLabel();
    jLabel99 = new JLabel();
    jLabel100 = new JLabel();
    jLabel101 = new JLabel();
    jLabel102 = new JLabel();
    jLabel103 = new JLabel();
    jLabel104 = new JLabel();
    jLabel105 = new JLabel();
    
    setDefaultCloseOperation(3);
    setTitle("DE-MINERALIZED PLANT [VIEW]");
    
    jScrollPane1.setVerticalScrollBarPolicy(22);
    jScrollPane1.setPreferredSize(new java.awt.Dimension(700, 1048));
    
    jPanel1.setPreferredSize(new java.awt.Dimension(646, 1600));
    
    jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12));
    jLabel2.setText("DE-MINERALIZED WATER PLANT");
    
    jLabel3.setText("COMPANY NAME");
    
    jLabel4.setText("PRODUCT ID");
    
    jLabel5.setText("DATE");
    
    jLabel6.setText("TYPE");
    
    jLabel7.setText("QUANTITY");
    
    jLabel8.setText("FLOW RATE");
    
    jLabel9.setText("OPERATIONAL HRS");
    
    jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12));
    jLabel10.setText("CATION BED");
    
    jLabel11.setText("AMOUNT OF CATION SALT");
    
    jLabel12.setText("CATION RESIN CAPACITY");
    
    jLabel13.setText("VOLUME OF CATION RESIN");
    
    jLabel14.setText("HEIGHT OF CATION RESIN");
    
    jLabel15.setText("HEIGHT OF DRUM");
    
    jLabel16.setText("DIAMETER OF DRUM");
    
    jLabel17.setText("THICKNESS OF DRUM");
    
    jLabel18.setText("WEIGHT OF DRUM");
    
    jLabel19.setText("DIAMETER OF SHELL");
    
    jLabel20.setText("THICKNESS OF SHELL");
    
    jLabel21.setText("WEIGHT OF SHELL");
    
    jLabel22.setText("RUBBER LINING AREA");
    
    jLabel23.setText("COST OF STEEL/KG");
    
    jLabel24.setText("COST OF CATION TANK");
    
    jLabel25.setText("COST OF ANION TANK");
    
    jLabel26.setText("FABRICATION COST");
    
    jLabel27.setText("RUBBER LINING COST/m2");
    
    jLabel28.setText("RUBBER LINING COST");
    
    jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 12));
    jLabel29.setText("MEDIA");
    
    jLabel30.setText("Sand (kgs)");
    
    jLabel31.setText("Sand Cost (kg)");
    
    jLabel32.setText("Sand Cost");
    
    jLabel33.setText("Gravel (kgs)");
    
    jLabel34.setText("Gravel Cost (kg)");
    
    jLabel35.setText("Gravel Cost");
    
    jLabel36.setText("Pebbles (kgs)");
    
    jLabel37.setText("Pebbles Cost (kg)");
    
    jLabel38.setText("Pebbles Cost");
    
    jLabel39.setText("Activated Carbon");
    
    jLabel40.setText("Activated Carbon Cost (kg)");
    
    jLabel41.setText("Activated Carbon Cost");
    
    jLabel42.setText("Total Media Cost");
    
    jLabel43.setText("COST OF ONE QUANTITY ");
    
    jLabel44.setText("TOTAL COST OF DM PLANT");
    
    jLabel45.setText("AMOUNT OF ANION SALT");
    
    jLabel46.setText("ANION RESIN CAPACITY");
    
    jLabel47.setText("VOLUME OF ANION RESIN");
    
    jLabel48.setText("HEIGHT OF ANION RESIN");
    
    jLabel49.setText("HEIGHT OF DRUM");
    
    jLabel50.setText("DIAMETER OF DRUM");
    
    jLabel51.setText("THICKNESS OF DRUM");
    
    jLabel52.setText("WEIGHT OF DRUM");
    
    jLabel53.setText("DIAMETER OF SHELL");
    
    jLabel54.setText("THICKNESS OF SHELL");
    
    jLabel55.setText("WEIGHT OF SHELL");
    
    jLabel56.setText("RUBBER LINING AREA");
    
    company_name.setText("0");
    
    product_id.setText("0");
    
    date.setText("0");
    
    type.setText("0");
    
    qty.setText("0");
    
    flow_rate.setText("0");
    
    operational_hrs.setText("0");
    
    Camount_of_salt.setText("0");
    
    Cresin_capacity.setText("0");
    
    Cvolume_of_resin.setText("0");
    
    Cresin_height.setText("0");
    
    CD_height.setText("0");
    
    CD_diameter.setText("0");
    
    CD_thickness.setText("0");
    
    CD_weight.setText("0");
    
    CS_diameter.setText("0");
    
    CS_thickness.setText("0");
    
    CS_weight.setText("0");
    
    Crubber_lining_area.setText("0");
    
    steel_cost_kg.setText("0");
    
    Cation_total_cost.setText("0");
    
    Anion_total_cost.setText("0");
    
    rubber_lining_costm2.setText("0");
    
    total_rubber_lining_cost.setText("0");
    
    fabrication_cost.setText("0");
    
    Sand.setText("0");
    
    Sand_kg.setText("0");
    
    Sand_cost.setText("0");
    
    Gravel.setText("0");
    
    Gravel_kg.setText("0");
    
    Gravel_cost.setText("0");
    
    Pebbles.setText("0");
    
    Pebbles_kg.setText("0");
    Pebbles_kg.setToolTipText("");
    
    Pebbles_cost.setText("0");
    
    AC.setText("0");
    
    AC_kg.setText("0");
    AC_kg.setToolTipText("");
    
    AC_cost.setText("0");
    
    Media_cost.setText("0");
    
    one_quantity_cost.setText("0");
    
    total_dm_cost.setText("0");
    
    Aamount_of_salt.setText("0");
    
    Aresin_capacity.setText("0");
    
    Avolume_of_resin.setText("0");
    
    Aresin_height.setText("0");
    Aresin_height.setToolTipText("");
    
    AD_height.setText("0");
    
    AD_diameter.setText("0");
    
    AD_thickness.setText("0");
    
    AD_weight.setText("0");
    
    AS_diameter.setText("0");
    
    AS_thickness.setText("0");
    
    AS_weight.setText("0");
    
    Arubber_lining_area.setText("0");
    
    jLabel109.setFont(new java.awt.Font("Times New Roman", 1, 12));
    jLabel109.setText("ANION BED");
    
    Back.setText("Back");
    Back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        DMview.this.BackActionPerformed(evt);
      }
      
    });
    jLabel57.setText("FABRICATION COST/KG");
    
    fabrication_kg.setText("0");
    
    jLabel58.setText("CATION RESIN COST/LITRE");
    
    jLabel59.setText("TOTAL CATION RESIN COST");
    
    jLabel60.setText("ANION RESIN COST/LITRE");
    
    jLabel61.setText("TOTAL ANION RESIN COST");
    
    cation_resin_litre.setText("0");
    
    cation_resin_cost.setText("0");
    
    anion_resin_litre.setText("0");
    
    anion_resin_cost.setText("0");
    
    jLabel62.setText("cubic metre/hr");
    
    jLabel63.setText("hr");
    
    jLabel64.setText("cubic m");
    
    jLabel65.setText("m");
    
    jLabel66.setText("m");
    
    jLabel67.setText("m");
    
    jLabel68.setText("mm");
    
    jLabel69.setText("kg");
    
    jLabel70.setText("m");
    
    jLabel71.setText("mm");
    
    jLabel72.setText("kg");
    
    jLabel73.setText("square m");
    
    jLabel74.setText("cubic m");
    
    jLabel75.setText("m");
    
    jLabel76.setText("m");
    
    jLabel77.setText("m");
    
    jLabel78.setText("mm");
    
    jLabel79.setText("kg");
    
    jLabel80.setText("m");
    
    jLabel81.setText("mm");
    
    jLabel82.setText("kg");
    
    jLabel83.setText("square m");
    
    jLabel84.setText("Rs");
    
    jLabel85.setText("Rs");
    
    jLabel86.setText("Rs");
    
    jLabel87.setText("Rs");
    
    jLabel88.setText("Rs");
    
    jLabel89.setText("Rs");
    
    jLabel90.setText("Rs");
    
    jLabel91.setText("Rs");
    
    jLabel92.setText("Rs");
    
    jLabel93.setText("Rs");
    
    jLabel94.setText("Rs");
    
    jLabel95.setText("Rs");
    
    jLabel96.setText("Rs");
    
    jLabel97.setText("Rs");
    
    jLabel98.setText("Rs");
    
    jLabel99.setText("Rs");
    
    jLabel100.setText("Rs");
    
    jLabel101.setText("Rs");
    
    jLabel102.setText("Rs");
    
    jLabel103.setText("Rs");
    
    jLabel104.setText("Rs");
    
    jLabel105.setText("Rs");
    
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3).addComponent(jLabel4).addComponent(jLabel5).addComponent(jLabel6).addComponent(jLabel7).addComponent(jLabel8).addComponent(jLabel9)).addGap(80, 80, 80).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(company_name, -1, -1, 32767).addComponent(product_id, -1, -1, 32767).addComponent(date, -1, -1, 32767).addComponent(type, -2, 134, -2).addComponent(qty, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(operational_hrs, javax.swing.GroupLayout.Alignment.LEADING, -1, 82, 32767).addComponent(flow_rate, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel62).addComponent(jLabel63))))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel14).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel11).addComponent(jLabel12).addComponent(jLabel13).addComponent(jLabel15).addComponent(jLabel16).addComponent(jLabel17).addComponent(jLabel18).addComponent(jLabel19).addComponent(jLabel20).addComponent(jLabel21).addComponent(jLabel22)).addGap(41, 41, 41).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(Camount_of_salt, -1, 129, 32767).addComponent(Cresin_capacity, -1, -1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(Crubber_lining_area, javax.swing.GroupLayout.Alignment.LEADING, -1, 98, 32767).addComponent(CS_weight, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(CS_thickness, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(CS_diameter, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(CD_weight, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(CD_thickness, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(CD_diameter, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(CD_height, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Cvolume_of_resin, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Cresin_height, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel64).addComponent(jLabel65).addComponent(jLabel66).addComponent(jLabel67).addComponent(jLabel68).addComponent(jLabel69).addComponent(jLabel70).addComponent(jLabel71).addComponent(jLabel72).addComponent(jLabel73)))))).addGap(28, 28, 28).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel45).addComponent(jLabel46).addComponent(jLabel47).addComponent(jLabel48).addComponent(jLabel49).addComponent(jLabel50).addComponent(jLabel51).addComponent(jLabel52).addComponent(jLabel53).addComponent(jLabel54).addComponent(jLabel55).addComponent(jLabel56)).addGap(26, 26, 26).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(AS_weight, javax.swing.GroupLayout.Alignment.LEADING, -1, 96, 32767).addComponent(AS_thickness, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(AS_diameter, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(AD_weight, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(AD_thickness, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(AD_diameter, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(AD_height, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Aresin_height, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Avolume_of_resin, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Aresin_capacity, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Aamount_of_salt, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Arubber_lining_area, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel75).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel77, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767)).addComponent(jLabel78).addComponent(jLabel79).addComponent(jLabel80).addComponent(jLabel81).addComponent(jLabel82).addComponent(jLabel83))).addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel29).addComponent(Back, -2, 94, -2))).addGroup(jPanel1Layout.createSequentialGroup().addGap(44, 44, 44).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel57).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jLabel24).addComponent(jLabel23).addComponent(jLabel25).addComponent(jLabel26).addComponent(jLabel28).addComponent(jLabel30).addComponent(jLabel31).addComponent(jLabel32).addComponent(jLabel33).addComponent(jLabel34).addComponent(jLabel35).addComponent(jLabel36).addComponent(jLabel37).addComponent(jLabel38).addComponent(jLabel39).addComponent(jLabel40, -1, -1, 32767).addComponent(jLabel41).addComponent(jLabel42).addComponent(jLabel43).addComponent(jLabel44, -1, -1, 32767).addComponent(jLabel27, -2, 131, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel95).addComponent(jLabel96).addComponent(jLabel97).addComponent(jLabel98).addComponent(jLabel99).addComponent(jLabel100).addComponent(jLabel101).addComponent(jLabel102).addComponent(jLabel103).addComponent(jLabel104).addComponent(jLabel105)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(one_quantity_cost, -2, 142, -2).addComponent(total_dm_cost, -2, 135, -2).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(Sand, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Sand_kg, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Sand_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Gravel, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Gravel_kg, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Gravel_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Pebbles, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Pebbles_kg, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Pebbles_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(AC, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(AC_kg, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(AC_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(Media_cost, javax.swing.GroupLayout.Alignment.LEADING, -1, 134, 32767)))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel84).addComponent(jLabel85).addComponent(jLabel86).addComponent(jLabel87).addComponent(jLabel88)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(cation_resin_litre, javax.swing.GroupLayout.Alignment.TRAILING, -1, 96, 32767).addComponent(Anion_total_cost, javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(Cation_total_cost, javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(steel_cost_kg, javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(cation_resin_cost, -2, 88, -2))).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel91).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(rubber_lining_costm2, -2, 88, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel93).addComponent(jLabel94).addComponent(jLabel92)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(fabrication_cost, -1, 88, 32767).addComponent(fabrication_kg, -1, -1, 32767).addComponent(total_rubber_lining_cost, -1, -1, 32767)))).addGap(8, 8, 8)))).addComponent(jLabel58).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel59).addGap(68, 68, 68)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel61).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel90)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel60).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel89))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(anion_resin_cost, -2, 88, -2).addComponent(anion_resin_litre, -2, 88, -2)))))).addContainerGap(-1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addGap(111, 111, 111).addComponent(jLabel10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel109).addGap(184, 184, 184)))).addGroup(jPanel1Layout.createSequentialGroup().addGap(168, 168, 168).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addComponent(jLabel2)).addComponent(jLabel1)).addGap(0, 0, 32767)));
    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(company_name)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(product_id)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(date)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(type)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(qty)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(flow_rate).addComponent(jLabel62)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(operational_hrs).addComponent(jLabel63)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel10).addComponent(jLabel109)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(jLabel45).addComponent(Camount_of_salt).addComponent(Aamount_of_salt)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel12).addComponent(jLabel46).addComponent(Cresin_capacity).addComponent(Aresin_capacity)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(jLabel47).addComponent(Avolume_of_resin).addComponent(jLabel74))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Cvolume_of_resin, -2, 14, -2).addComponent(jLabel64))).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel14).addComponent(jLabel48).addComponent(Cresin_height).addComponent(Aresin_height).addComponent(jLabel65).addComponent(jLabel75)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel15).addComponent(jLabel49).addComponent(CD_height).addComponent(AD_height).addComponent(jLabel66).addComponent(jLabel76)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(jLabel50).addComponent(CD_diameter).addComponent(AD_diameter).addComponent(jLabel67).addComponent(jLabel77)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(jLabel51).addComponent(CD_thickness).addComponent(AD_thickness).addComponent(jLabel68).addComponent(jLabel78)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel18).addComponent(jLabel52).addComponent(CD_weight).addComponent(AD_weight).addComponent(jLabel69).addComponent(jLabel79)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel19).addComponent(jLabel53).addComponent(AS_diameter).addComponent(jLabel80))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(CS_diameter, -2, 14, -2).addComponent(jLabel70))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel20).addComponent(jLabel54).addComponent(CS_thickness).addComponent(AS_thickness).addComponent(jLabel71).addComponent(jLabel81)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel21).addComponent(jLabel55).addComponent(CS_weight).addComponent(AS_weight).addComponent(jLabel72).addComponent(jLabel82)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel22).addComponent(jLabel56).addComponent(Crubber_lining_area).addComponent(Arubber_lining_area).addComponent(jLabel73).addComponent(jLabel83)).addGap(38, 38, 38).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel23).addComponent(steel_cost_kg).addComponent(jLabel84)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel24).addComponent(Cation_total_cost).addComponent(jLabel85)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel25).addComponent(Anion_total_cost).addComponent(jLabel86)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel58).addComponent(cation_resin_litre).addComponent(jLabel87)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel59).addComponent(cation_resin_cost).addComponent(jLabel88)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel60).addComponent(anion_resin_litre).addComponent(jLabel89)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel61).addComponent(anion_resin_cost).addComponent(jLabel90)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel27).addComponent(rubber_lining_costm2).addComponent(jLabel91)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel28).addComponent(total_rubber_lining_cost).addComponent(jLabel92)).addGap(3, 3, 3).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel57).addComponent(fabrication_kg).addComponent(jLabel93)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel26).addComponent(fabrication_cost).addComponent(jLabel94)).addGap(18, 18, 18).addComponent(jLabel29).addGap(26, 26, 26).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel30).addComponent(Sand)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel31).addComponent(Sand_kg).addComponent(jLabel95)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel32).addComponent(Sand_cost).addComponent(jLabel96)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel33).addComponent(Gravel)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel34)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Gravel_kg, -2, 9, -2).addComponent(jLabel97))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel35)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Gravel_cost, -2, 14, -2).addComponent(jLabel98))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel36).addComponent(Pebbles)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel37).addComponent(Pebbles_kg).addComponent(jLabel99)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel38).addComponent(Pebbles_cost).addComponent(jLabel100)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel39)).addComponent(AC, -2, 14, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel40).addComponent(AC_kg).addComponent(jLabel101)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel41).addComponent(AC_cost).addComponent(jLabel102)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel42).addComponent(Media_cost).addComponent(jLabel103)).addGap(28, 28, 28).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel43).addComponent(one_quantity_cost).addComponent(jLabel104)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel44).addComponent(total_dm_cost).addComponent(jLabel105)).addGap(31, 31, 31).addComponent(Back).addContainerGap()));
    
    jScrollPane1.setViewportView(jPanel1);
    
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(jScrollPane1, -2, 679, -2).addContainerGap()));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jScrollPane1, -1, 1121, 32767).addContainerGap()));
    pack(); }
  
  private JLabel jLabel10;
  private JLabel jLabel100; private JLabel jLabel101; private JLabel jLabel102; private JLabel jLabel103;
  private void BackActionPerformed(java.awt.event.ActionEvent evt) { DataRetrival dr = new DataRetrival();
    dr.setVisible(true);
    setVisible(false); }
  
  private JLabel jLabel104;
  private JLabel jLabel105; private JLabel jLabel109; private JLabel jLabel11; private JLabel jLabel12;
  private void display(String input) { java.sql.PreparedStatement ps = null;
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
      String query = "SELECT * FROM `dm-info` WHERE Product_id=?";
      ps = conn.prepareStatement(query);
      ps.setString(1, input);
      
      java.sql.ResultSet rs = ps.executeQuery();
      while (rs.next())
      {
        company_name.setText(rs.getString("Company_name"));
        product_id.setText(rs.getString("Product_id"));
        date.setText(rs.getString("date"));
        type.setText(rs.getString("type"));
        qty.setText(rs.getString("Qty"));
        flow_rate.setText(rs.getString("Flow_rate"));
        total_dm_cost.setText(rs.getString("total_cost"));
      }
      
      String query1 = "SELECT * FROM `cation-bed` WHERE Product_id=?";
      ps = conn.prepareStatement(query1);
      ps.setString(1, input);
      
      java.sql.ResultSet rs1 = ps.executeQuery();
      while (rs1.next())
      {
        operational_hrs.setText(rs1.getString("operational_hrs"));
        Camount_of_salt.setText(rs1.getString("Camount_of_salt"));
        Cresin_capacity.setText(rs1.getString("Cresin_capacity"));
        Cvolume_of_resin.setText(rs1.getString("Cvolume_of_resin"));
      }
      
      String query2 = "SELECT * FROM `cation-drum` WHERE Product_id=?";
      ps = conn.prepareStatement(query2);
      ps.setString(1, input);
      java.sql.ResultSet rs2 = ps.executeQuery();
      while (rs2.next())
      {
        Cresin_height.setText(rs2.getString("Cresin_height"));
        CD_height.setText(rs2.getString("CD_height"));
        CD_diameter.setText(rs2.getString("CD_diameter"));
        CD_thickness.setText(rs2.getString("CD_thickness"));
        CD_weight.setText(rs2.getString("CD_wt"));
      }
      
      String query3 = "SELECT * FROM `cation-shell` WHERE Product_id=?";
      ps = conn.prepareStatement(query3);
      ps.setString(1, input);
      java.sql.ResultSet rs3 = ps.executeQuery();
      while (rs3.next())
      {
        CS_diameter.setText(rs3.getString("CS_diameter"));
        CS_thickness.setText(rs3.getString("CS_thickness"));
        CS_weight.setText(rs3.getString("CS_wt"));
      }
      

      String query4 = "SELECT * FROM `anion-bed` WHERE Product_id=?";
      ps = conn.prepareStatement(query4);
      ps.setString(1, input);
      java.sql.ResultSet rs4 = ps.executeQuery();
      while (rs4.next())
      {
        operational_hrs.setText(rs4.getString("operational_hrs"));
        Aamount_of_salt.setText(rs4.getString("Aamount_of_salt"));
        Aresin_capacity.setText(rs4.getString("Aresin_capacity"));
        Avolume_of_resin.setText(rs4.getString("Avolume_of_resin"));
      }
      
      String query5 = "SELECT * FROM `anion-drum` WHERE Product_id=?";
      ps = conn.prepareStatement(query5);
      ps.setString(1, input);
      java.sql.ResultSet rs5 = ps.executeQuery();
      while (rs5.next())
      {
        Aresin_height.setText(rs5.getString("Aresin_height"));
        AD_height.setText(rs5.getString("AD_height"));
        AD_diameter.setText(rs5.getString("AD_diameter"));
        AD_thickness.setText(rs5.getString("AD_thickness"));
        AD_weight.setText(rs5.getString("AD_wt"));
      }
      
      String query6 = "SELECT * FROM `anion-shell` WHERE Product_id=?";
      ps = conn.prepareStatement(query6);
      ps.setString(1, input);
      java.sql.ResultSet rs6 = ps.executeQuery();
      while (rs6.next())
      {
        AS_diameter.setText(rs6.getString("AS_diameter"));
        AS_thickness.setText(rs6.getString("AS_thickness"));
        AS_weight.setText(rs6.getString("AS_wt"));
      }
      
      String query7 = "SELECT * FROM `dm-cation&anion` WHERE Product_id=?";
      ps = conn.prepareStatement(query7);
      ps.setString(1, input);
      java.sql.ResultSet rs7 = ps.executeQuery();
      while (rs7.next())
      {
        Crubber_lining_area.setText(rs7.getString("Crubber_lining_area"));
        Arubber_lining_area.setText(rs7.getString("Arubber_lining_area"));
        steel_cost_kg.setText(rs7.getString("cost_steel_kg"));
        Cation_total_cost.setText(rs7.getString("cation_cost"));
        Anion_total_cost.setText(rs7.getString("anion_cost"));
        rubber_lining_costm2.setText(rs7.getString("rubber_lining"));
        total_rubber_lining_cost.setText(rs7.getString("rubber_lining_cost"));
        cation_resin_litre.setText(rs7.getString("cation_resin_litre"));
        cation_resin_cost.setText(rs7.getString("cation_resin_cost"));
        anion_resin_litre.setText(rs7.getString("anion_resin_litre"));
        anion_resin_cost.setText(rs7.getString("anion_resin_cost"));
        fabrication_kg.setText(rs7.getString("fabrication_kg"));
        fabrication_cost.setText(rs7.getString("fabrication_cost"));
      }
      
      String query8 = "SELECT * FROM `dm-filter-media` WHERE Product_id=?";
      ps = conn.prepareStatement(query8);
      ps.setString(1, input);
      java.sql.ResultSet rs8 = ps.executeQuery();
      while (rs8.next())
      {
        Sand.setText(rs8.getString("sand"));
        Sand_kg.setText(rs8.getString("sand_kg"));
        Sand_cost.setText(rs8.getString("sand_cost"));
        Gravel.setText(rs8.getString("gravel"));
        Gravel_kg.setText(rs8.getString("gravel_kg"));
        Gravel_cost.setText(rs8.getString("gravel_cost"));
        Pebbles.setText(rs8.getString("pebbles"));
        Pebbles_kg.setText(rs8.getString("pebbles_kg"));
        Pebbles_cost.setText(rs8.getString("pebbles_cost"));
        AC.setText(rs8.getString("ac"));
        AC_kg.setText(rs8.getString("ac_kg"));
        AC_cost.setText(rs8.getString("ac_cost"));
        Media_cost.setText(rs8.getString("media_cost"));
        one_quantity_cost.setText(rs8.getString("one_quantity_cost"));
      }
    }
    catch (ClassNotFoundException|java.sql.SQLException e)
    {
      javax.swing.JOptionPane.showMessageDialog(null, "Error in connection" + e); } }
  
  private JLabel jLabel13;
  private JLabel jLabel14;
  private JLabel jLabel15;
  private JLabel jLabel16;
  private JLabel jLabel17;
  private JLabel jLabel18;
  private JLabel jLabel19;
  private JLabel jLabel2;
  private JLabel jLabel20;
  private JLabel jLabel21;
  private JLabel jLabel22; private JLabel jLabel23; private JLabel jLabel24; private JLabel jLabel25;
  public static void main(String[] args) { try { for (javax.swing.UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(DMview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(DMview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(DMview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DMview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run() {
        new DMview("kl001").setVisible(true);
      }
    });
  }
  
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
  private JLabel jLabel77;
  private JLabel jLabel78;
  private JLabel jLabel79;
  private JLabel jLabel8;
  private JLabel jLabel80;
  private JLabel jLabel81;
  private JLabel jLabel82;
  private JLabel jLabel83;
  private JLabel jLabel84;
  private JLabel jLabel85;
  private JLabel jLabel86;
  private JLabel jLabel87;
  private JLabel jLabel88;
  private JLabel jLabel89;
  private JLabel jLabel9;
  private JLabel jLabel90;
  private JLabel jLabel91;
  private JLabel jLabel92;
  private JLabel jLabel93;
  private JLabel jLabel94;
  private JLabel jLabel95;
  private JLabel jLabel96;
  private JLabel jLabel97;
  private JLabel jLabel98;
  private JLabel jLabel99;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private JLabel one_quantity_cost;
  private JLabel operational_hrs;
  private JLabel product_id;
  private JLabel qty;
  private JLabel rubber_lining_costm2;
  private JLabel steel_cost_kg;
  private JLabel total_dm_cost;
  private JLabel total_rubber_lining_cost;
  private JLabel type;
}
