package process_simulation;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Dmwater
  extends JFrame
{
  private JTextField AC;
  private JTextField AC_cost;
  private JTextField AC_kg;
  private JTextField AD_diameter;
  private JTextField AD_height;
  private JTextField AD_thickness;
  private JTextField AD_weight;
  private JTextField AS_diameter;
  private JTextField AS_thickness;
  private JTextField AS_weight;
  private JTextField Aamount_of_salt;
  private JTextField Aresin_capacity;
  private JTextField Aresin_height;
  private JTextField Arubber_lining_area;
  private JTextField Avolume_of_resin;
  private JButton Back;
  private JTextField CD_diameter;
  private JTextField CD_height;
  private JTextField CD_thickness;
  private JTextField CD_weight;
  private JTextField CS_diameter;
  private JTextField CS_thickness;
  private JTextField CS_weight;
  private JTextField Camount_of_salt;
  private JTextField Cresin_capacity;
  private JTextField Cresin_height;
  private JTextField Crubber_lining_area;
  private JTextField Cvolume_ofresin;
  private JTextField Gravel;
  private JTextField Gravel_cost;
  private JTextField Gravel_kg;
  private JTextField Media_cost;
  private JTextField Pebbles;
  private JTextField Pebbles_cost;
  private JTextField Pebbles_kg;
  private JTextField Sand;
  private JTextField Sand_cost;
  private JTextField Sand_kg;
  private JTextField anion_resin_cost;
  private JTextField anion_resin_litre;
  private JTextField anion_total_cost;
  private JTextField cation_resin_cost;
  private JTextField cation_resin_litre;
  private JTextField cation_total_cost;
  private JTextField company_name;
  private JTextField date;
  private JTextField fabrication_cost;
  private JTextField fabrication_kg;
  private JTextField flow_rate;
  private JButton jButton1;
  private JLabel jLabel1;
  private JLabel jLabel10;
  private JLabel jLabel100;
  private JLabel jLabel101;
  private JLabel jLabel102;
  private JLabel jLabel103;
  
  public Dmwater()
  {
    initComponents();
  }
  
  private JLabel jLabel104;
  private JLabel jLabel105;
  private JLabel jLabel106;
  private JLabel jLabel107;
  private JLabel jLabel11;
  private JLabel jLabel12;
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
  private JLabel jLabel22;
  private JLabel jLabel23;
  
  private void initComponents()
  {
    jScrollPane1 = new JScrollPane();
    jPanel1 = new JPanel();
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
    jButton1 = new JButton();
    company_name = new JTextField();
    product_id = new JTextField();
    date = new JTextField();
    flow_rate = new JTextField();
    operational_hrs = new JTextField();
    Camount_of_salt = new JTextField();
    Cresin_capacity = new JTextField();
    Cvolume_ofresin = new JTextField();
    Cresin_height = new JTextField();
    CD_height = new JTextField();
    CD_diameter = new JTextField();
    CD_thickness = new JTextField();
    CD_weight = new JTextField();
    Crubber_lining_area = new JTextField();
    CS_diameter = new JTextField();
    CS_thickness = new JTextField();
    CS_weight = new JTextField();
    cation_total_cost = new JTextField();
    rubber_lining_costm2 = new JTextField();
    Aamount_of_salt = new JTextField();
    Aresin_capacity = new JTextField();
    Avolume_of_resin = new JTextField();
    Aresin_height = new JTextField();
    AD_height = new JTextField();
    AD_diameter = new JTextField();
    AD_thickness = new JTextField();
    AD_weight = new JTextField();
    Arubber_lining_area = new JTextField();
    AS_diameter = new JTextField();
    AS_thickness = new JTextField();
    AS_weight = new JTextField();
    anion_total_cost = new JTextField();
    fabrication_cost = new JTextField();
    total_rubber_lining_cost = new JTextField();
    total_dm_cost = new JTextField();
    jLabel40 = new JLabel();
    steel_cost_kg = new JTextField();
    jLabel41 = new JLabel();
    jLabel42 = new JLabel();
    Sand = new JTextField();
    jLabel43 = new JLabel();
    Sand_kg = new JTextField();
    jLabel44 = new JLabel();
    Sand_cost = new JTextField();
    jLabel45 = new JLabel();
    Gravel = new JTextField();
    jLabel46 = new JLabel();
    Gravel_kg = new JTextField();
    jLabel47 = new JLabel();
    Gravel_cost = new JTextField();
    jLabel48 = new JLabel();
    jLabel49 = new JLabel();
    jLabel50 = new JLabel();
    Pebbles = new JTextField();
    Pebbles_kg = new JTextField();
    Pebbles_cost = new JTextField();
    jLabel51 = new JLabel();
    AC = new JTextField();
    jLabel52 = new JLabel();
    AC_kg = new JTextField();
    jLabel53 = new JLabel();
    AC_cost = new JTextField();
    jLabel54 = new JLabel();
    Media_cost = new JTextField();
    jLabel55 = new JLabel();
    qty = new JTextField();
    jLabel56 = new JLabel();
    type = new JComboBox();
    jLabel57 = new JLabel();
    one_quantity_cost = new JTextField();
    Back = new JButton();
    jLabel58 = new JLabel();
    fabrication_kg = new JTextField();
    jLabel62 = new JLabel();
    jLabel59 = new JLabel();
    jLabel60 = new JLabel();
    jLabel61 = new JLabel();
    jLabel63 = new JLabel();
    cation_resin_litre = new JTextField();
    cation_resin_cost = new JTextField();
    anion_resin_litre = new JTextField();
    anion_resin_cost = new JTextField();
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
    jLabel106 = new JLabel();
    jLabel107 = new JLabel();
    
    setDefaultCloseOperation(3);
    setResizable(false);
    
    jScrollPane1.setVerticalScrollBarPolicy(22);
    
    jLabel1.setFont(new Font("Times New Roman", 0, 18));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setText("DEMINERALIZED WATER PLANT");
    
    jLabel3.setText("COMPANY NAME");
    
    jLabel4.setText("PRODUCT ID");
    
    jLabel5.setText("DATE");
    
    jLabel6.setText("FLOW RATE");
    
    jLabel7.setText("OPERATIONAL HRS");
    
    jLabel8.setFont(new Font("Times New Roman", 0, 14));
    jLabel8.setText("CATION BED");
    
    jLabel9.setFont(new Font("Times New Roman", 0, 14));
    jLabel9.setText("ANION BED");
    
    jLabel10.setText("AMOUNT OF CATION SALT");
    
    jLabel11.setText("AMOUNT OF ANION SALT");
    
    jLabel12.setText("CATION RESIN CAPACITY");
    
    jLabel13.setText("ANION RESIN CAPACITY");
    
    jLabel14.setText("VOLUME OF CATION RESIN");
    
    jLabel15.setText("VOLUME OF ANION RESIN");
    
    jLabel16.setText("HEIGHT OF CATION RESIN");
    
    jLabel17.setText("HEIGHT OF ANION RESIN");
    
    jLabel18.setText("HEIGHT OF DRUM");
    
    jLabel19.setText("HEIGHT OF DRUM");
    
    jLabel20.setText("DIAMETER OF DRUM");
    
    jLabel21.setText("DIAMETER OF DRUM");
    
    jLabel22.setText("THICKNESS OF DRUM");
    
    jLabel23.setText("THICKNESS OF DRUM");
    
    jLabel24.setText("WEIGHT OF DRUM");
    
    jLabel25.setText("WEIGHT OF DRUM");
    
    jLabel26.setText("RUBBER LINING AREA");
    
    jLabel27.setText("RUBBER LINING AREA");
    
    jLabel28.setText("DIAMETER OF SHELL");
    
    jLabel29.setText("DIAMETER OF SHELL");
    
    jLabel30.setText("THICKNESS OF SHELL");
    
    jLabel31.setText("THICKNESS OF SHELL");
    
    jLabel32.setText("WEIGHT OF SHELL");
    
    jLabel33.setText("WEIGHT OF SHELL");
    
    jLabel34.setText("RUBBER LINING COST PER m2");
    
    jLabel35.setText("FABRICATION COST");
    
    jLabel36.setText("COST OF CATION TANK");
    
    jLabel37.setText("COST OF ANION TANK");
    
    jLabel38.setText("RUBBER LINING COST");
    
    jLabel39.setText("TOTAL COST OF DM PLANT");
    
    jButton1.setText("ENTER");
    jButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Dmwater.this.jButton1ActionPerformed(evt);
      }
      
    });
    Camount_of_salt.setText("0");
    
    Cresin_capacity.setText("0");
    
    Cvolume_ofresin.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent evt) {
        Dmwater.this.Cvolume_ofresinMouseClicked(evt);
      }
    });
    Cvolume_ofresin.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.Cvolume_ofresinFocusGained(evt);
      }
      
    });
    Cresin_height.setText("1");
    
    CD_height.setText("2");
    
    CD_diameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.CD_diameterFocusGained(evt);
      }
      
    });
    CD_thickness.setText("8");
    
    CD_weight.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.CD_weightFocusGained(evt);
      }
      
    });
    Crubber_lining_area.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.Crubber_lining_areaFocusGained(evt);
      }
      
    });
    CS_diameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.CS_diameterFocusGained(evt);
      }
      
    });
    CS_thickness.setText("10");
    
    CS_weight.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.CS_weightFocusGained(evt);
      }
      
    });
    cation_total_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.cation_total_costFocusGained(evt);
      }
      
    });
    Aamount_of_salt.setText("0");
    
    Aresin_capacity.setText("0");
    
    Avolume_of_resin.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.Avolume_of_resinFocusGained(evt);
      }
      
    });
    Aresin_height.setText("1");
    
    AD_height.setText("2");
    
    AD_diameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.AD_diameterFocusGained(evt);
      }
      
    });
    AD_thickness.setText("8");
    
    AD_weight.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.AD_weightFocusGained(evt);
      }
      
    });
    Arubber_lining_area.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.Arubber_lining_areaFocusGained(evt);
      }
      
    });
    AS_diameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.AS_diameterFocusGained(evt);
      }
      
    });
    AS_thickness.setText("10");
    
    AS_weight.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.AS_weightFocusGained(evt);
      }
      
    });
    anion_total_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.anion_total_costFocusGained(evt);
      }
      
    });
    fabrication_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.fabrication_costFocusGained(evt);
      }
      
    });
    total_rubber_lining_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.total_rubber_lining_costFocusGained(evt);
      }
      
    });
    total_dm_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.total_dm_costFocusGained(evt);
      }
      
    });
    jLabel40.setText("COST OF STEEL/KG");
    
    jLabel41.setFont(new Font("Times New Roman", 1, 14));
    jLabel41.setText("MEDIA");
    
    jLabel42.setText("Sand (kgs)");
    
    jLabel43.setText("Sand cost (kg)");
    
    jLabel44.setText("Sand Cost");
    
    Sand_cost.setText("0");
    Sand_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.Sand_costFocusGained(evt);
      }
      
    });
    jLabel45.setText("Gravel (kgs)");
    
    jLabel46.setText("Gravel Cost (kgs)");
    
    jLabel47.setText("Gravel Cost");
    
    Gravel_cost.setText("0");
    Gravel_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.Gravel_costFocusGained(evt);
      }
      
    });
    jLabel48.setText("Pebbles (kgs)");
    
    jLabel49.setText("Pebbles Cost (kgs)");
    
    jLabel50.setText("Pebbles Cost");
    
    Pebbles_cost.setText("0");
    Pebbles_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.Pebbles_costFocusGained(evt);
      }
      
    });
    jLabel51.setText("Activated Carbon (kgs)");
    
    jLabel52.setText("Activated Carbon Cost (kgs)");
    
    jLabel53.setText("Activated Carbon Cost");
    
    AC_cost.setText("0");
    AC_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.AC_costFocusGained(evt);
      }
      
    });
    jLabel54.setText("TOTAL MEDIA COST");
    
    Media_cost.setText("0");
    Media_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.Media_costFocusGained(evt);
      }
      
    });
    jLabel55.setText("QUANTITY");
    
    qty.setText("0");
    
    jLabel56.setText("TYPE");
    
    type.setModel(new DefaultComboBoxModel(new String[] { "WITH DEGASER", "WITHOUT DEGASER" }));
    
    jLabel57.setText("COST FOR ONE QUANTITY");
    
    one_quantity_cost.setText("0");
    one_quantity_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.one_quantity_costFocusGained(evt);
      }
      
    });
    Back.setText("Back");
    Back.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Dmwater.this.BackActionPerformed(evt);
      }
      
    });
    jLabel58.setText("FABRICATION COST/KG");
    
    jLabel59.setText("CATION RESIN COST/LITRE");
    
    jLabel60.setText("TOTAL CATION RESIN COST");
    
    jLabel61.setText("ANION RESIN COST/LITRE");
    
    jLabel63.setText("TOTAL ANION RESIN COST ");
    
    cation_resin_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.cation_resin_costFocusGained(evt);
      }
      
    });
    anion_resin_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Dmwater.this.anion_resin_costFocusGained(evt);
      }
      
    });
    jLabel64.setText("cubic m");
    
    jLabel65.setText("hr");
    
    jLabel66.setText("cubic m");
    
    jLabel67.setText("m");
    
    jLabel68.setText("m");
    
    jLabel69.setText("m");
    
    jLabel70.setText("mm");
    
    jLabel71.setText("kg");
    
    jLabel72.setText("mm");
    
    jLabel73.setText("kg");
    
    jLabel74.setText("square m");
    
    jLabel75.setText("m");
    
    jLabel76.setText("cubic m");
    
    jLabel77.setText("m");
    
    jLabel78.setText("m");
    
    jLabel79.setText("m");
    
    jLabel80.setText("mm");
    
    jLabel81.setText("kg");
    
    jLabel82.setText("m");
    
    jLabel83.setText("mm");
    
    jLabel84.setText("kg");
    
    jLabel85.setText("square m");
    
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
    
    jLabel106.setText("Rs");
    
    jLabel107.setText("Rs");
    
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(113, 113, 113).addComponent(jLabel8, -2, 86, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel9).addGap(274, 274, 274)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(103, 103, 103).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel45).addComponent(jLabel51).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel54).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel105)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel53).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel104)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel52).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel103)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel49).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel101)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel50).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel102)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel44).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel98)).addComponent(jLabel42, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel43).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel97)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel57).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel106)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel58).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel93)).addComponent(jLabel62, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel59).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel89)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel60).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel90)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel61).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel91)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel63).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel92)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel46).addComponent(jLabel47).addComponent(jLabel48)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(jLabel100, -1, -1, 32767).addComponent(jLabel99, -1, -1, 32767))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(jLabel39, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel38, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel34, GroupLayout.Alignment.LEADING, -1, 162, 32767).addComponent(jLabel35, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel37, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 69, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel88, GroupLayout.Alignment.TRAILING).addComponent(jLabel94, GroupLayout.Alignment.TRAILING).addComponent(jLabel95, GroupLayout.Alignment.TRAILING).addComponent(jLabel96, GroupLayout.Alignment.TRAILING).addComponent(jLabel107, GroupLayout.Alignment.TRAILING)))))).addGroup(jPanel1Layout.createSequentialGroup().addGap(32, 32, 32).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel41).addComponent(Back, -2, 85, -2))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel36, -2, 162, -2).addComponent(jLabel40, -2, 162, -2)).addGap(33, 33, 33).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel86).addComponent(jLabel87)))).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(anion_total_cost).addComponent(rubber_lining_costm2, GroupLayout.Alignment.TRAILING).addComponent(fabrication_cost, GroupLayout.Alignment.TRAILING).addComponent(total_dm_cost, GroupLayout.Alignment.TRAILING).addComponent(cation_total_cost).addComponent(total_rubber_lining_cost).addComponent(steel_cost_kg, -1, 104, 32767).addComponent(Sand).addComponent(Sand_kg).addComponent(Sand_cost).addComponent(Gravel).addComponent(Gravel_kg).addComponent(Gravel_cost).addComponent(Pebbles).addComponent(Pebbles_kg).addComponent(Pebbles_cost).addComponent(AC).addComponent(AC_kg).addComponent(AC_cost).addComponent(Media_cost).addComponent(jButton1, GroupLayout.Alignment.TRAILING).addComponent(one_quantity_cost).addComponent(fabrication_kg).addComponent(cation_resin_litre).addComponent(cation_resin_cost).addComponent(anion_resin_litre).addComponent(anion_resin_cost))).addGroup(jPanel1Layout.createSequentialGroup().addGap(220, 220, 220).addComponent(jLabel2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(161, 161, 161).addComponent(jLabel1))).addContainerGap(-1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addGap(24, 24, 24).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel12, -1, -1, 32767).addComponent(jLabel10, -1, -1, 32767).addComponent(jLabel16, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel18, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel20, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel22, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel24, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel26, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel28, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel30, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel32, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel14, GroupLayout.Alignment.LEADING, -1, 222, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(Cresin_capacity, GroupLayout.Alignment.LEADING, -1, 104, 32767).addComponent(Camount_of_salt, GroupLayout.Alignment.LEADING).addComponent(Cvolume_ofresin, GroupLayout.Alignment.LEADING).addComponent(Cresin_height, GroupLayout.Alignment.LEADING).addComponent(CD_height, GroupLayout.Alignment.LEADING).addComponent(CD_diameter, GroupLayout.Alignment.LEADING).addComponent(CD_thickness, GroupLayout.Alignment.LEADING).addComponent(CD_weight, GroupLayout.Alignment.LEADING).addComponent(Crubber_lining_area, GroupLayout.Alignment.LEADING).addComponent(CS_diameter, GroupLayout.Alignment.LEADING).addComponent(CS_thickness, GroupLayout.Alignment.LEADING).addComponent(CS_weight, GroupLayout.Alignment.LEADING)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel66).addGap(49, 49, 49).addComponent(jLabel15, -2, 174, -2)).addComponent(jLabel11, GroupLayout.Alignment.TRAILING, -2, 174, -2).addComponent(jLabel13, GroupLayout.Alignment.TRAILING, -2, 174, -2))).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel67).addComponent(jLabel68).addComponent(jLabel69).addComponent(jLabel70).addComponent(jLabel71).addComponent(jLabel72).addComponent(jLabel73).addComponent(jLabel74).addComponent(jLabel75, -2, 28, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel27, -2, 163, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel17, -2, 174, -2).addComponent(jLabel19, -2, 174, -2).addComponent(jLabel21, -2, 174, -2).addComponent(jLabel23, -2, 174, -2).addComponent(jLabel25, -2, 174, -2).addComponent(jLabel29, -2, 174, -2).addComponent(jLabel31, -2, 174, -2).addComponent(jLabel33, -2, 174, -2)))))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel55, -2, 94, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(qty)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(jLabel6, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel5, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel4, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel3, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel7, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(company_name, -1, 156, 32767).addComponent(product_id).addComponent(date).addComponent(flow_rate).addComponent(operational_hrs))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel56, -2, 94, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(type, 0, 156, 32767))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel64).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel65).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767))))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(Arubber_lining_area, -2, 104, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel85)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(Aamount_of_salt, -1, 104, 32767).addComponent(Aresin_capacity).addComponent(Avolume_of_resin).addComponent(Aresin_height).addComponent(AD_height).addComponent(AD_diameter).addComponent(AD_thickness).addComponent(AD_weight).addComponent(AS_diameter).addComponent(AS_thickness).addComponent(AS_weight)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel76).addComponent(jLabel77).addComponent(jLabel78).addComponent(jLabel79).addComponent(jLabel80).addComponent(jLabel81).addComponent(jLabel82).addComponent(jLabel83).addComponent(jLabel84))))));
    













































































































































































































































































    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(company_name, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(product_id, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(date, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel56).addComponent(type, -2, -1, -2)).addGap(5, 5, 5).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel55).addComponent(qty, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(flow_rate, -2, -1, -2).addComponent(jLabel64)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(operational_hrs, -2, -1, -2).addComponent(jLabel65)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel8, -2, 17, -2).addComponent(jLabel9)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(jLabel11).addComponent(Camount_of_salt, -2, -1, -2).addComponent(Aamount_of_salt, -2, -1, -2)).addGap(6, 6, 6).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel12).addComponent(jLabel13).addComponent(Cresin_capacity, -2, -1, -2).addComponent(Aresin_capacity, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel14).addComponent(jLabel15).addComponent(Cvolume_ofresin, -2, -1, -2).addComponent(Avolume_of_resin, -2, -1, -2).addComponent(jLabel66).addComponent(jLabel76)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(jLabel17).addComponent(Cresin_height, -2, -1, -2).addComponent(Aresin_height, -2, -1, -2).addComponent(jLabel67).addComponent(jLabel77)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel18).addComponent(jLabel19).addComponent(CD_height, -2, -1, -2).addComponent(AD_height, -2, -1, -2).addComponent(jLabel68).addComponent(jLabel78)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel20).addComponent(jLabel21).addComponent(CD_diameter, -2, -1, -2).addComponent(AD_diameter, -2, -1, -2).addComponent(jLabel69).addComponent(jLabel79)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel22).addComponent(jLabel23).addComponent(CD_thickness, -2, -1, -2).addComponent(AD_thickness, -2, -1, -2).addComponent(jLabel70).addComponent(jLabel80)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel24).addComponent(jLabel25).addComponent(CD_weight, -2, -1, -2).addComponent(AD_weight, -2, -1, -2).addComponent(jLabel71).addComponent(jLabel81)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel29).addComponent(AS_diameter, -2, -1, -2).addComponent(jLabel82)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(CS_diameter, -2, -1, -2).addComponent(jLabel75)).addComponent(jLabel28))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel30).addComponent(jLabel31).addComponent(CS_thickness, -2, -1, -2).addComponent(AS_thickness, -2, -1, -2).addComponent(jLabel72).addComponent(jLabel83)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel32).addComponent(jLabel33).addComponent(CS_weight, -2, -1, -2).addComponent(AS_weight, -2, -1, -2).addComponent(jLabel73).addComponent(jLabel84)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel26).addComponent(Crubber_lining_area, -2, -1, -2).addComponent(jLabel27).addComponent(Arubber_lining_area, -2, -1, -2).addComponent(jLabel74).addComponent(jLabel85)).addGap(1, 1, 1).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel40).addComponent(steel_cost_kg, -2, -1, -2).addComponent(jLabel86)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel36).addComponent(cation_total_cost, -2, -1, -2).addComponent(jLabel87)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel37).addComponent(anion_total_cost, -2, -1, -2).addComponent(jLabel88)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel59).addComponent(cation_resin_litre, -2, -1, -2).addComponent(jLabel89)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel60).addComponent(cation_resin_cost, -2, -1, -2).addComponent(jLabel90)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel61).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(anion_resin_litre, -2, -1, -2).addComponent(jLabel91))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel63).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel58).addComponent(fabrication_kg, -2, -1, -2).addComponent(jLabel93)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(fabrication_cost, -2, -1, -2).addComponent(jLabel35, -2, 9, -2).addComponent(jLabel94)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel34).addComponent(rubber_lining_costm2, -2, -1, -2).addComponent(jLabel95)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel38).addComponent(total_rubber_lining_cost, -2, -1, -2).addComponent(jLabel96)).addGap(19, 19, 19).addComponent(jLabel41).addGap(17, 17, 17).addComponent(jLabel62).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel42).addComponent(Sand, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel43).addComponent(Sand_kg, -2, -1, -2).addComponent(jLabel97)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel44).addComponent(Sand_cost, -2, -1, -2).addComponent(jLabel98)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel45).addComponent(Gravel, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel46).addComponent(Gravel_kg, -2, -1, -2).addComponent(jLabel99)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel47).addComponent(Gravel_cost, -2, -1, -2).addComponent(jLabel100)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel48).addComponent(Pebbles, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel49).addComponent(Pebbles_kg, -2, -1, -2).addComponent(jLabel101)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel50).addComponent(Pebbles_cost, -2, -1, -2).addComponent(jLabel102)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel51).addComponent(AC, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel52).addComponent(AC_kg, -2, -1, -2).addComponent(jLabel103)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel53).addComponent(AC_cost, -2, -1, -2).addComponent(jLabel104)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel54).addComponent(Media_cost, -2, -1, -2).addComponent(jLabel105)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 87, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel57).addComponent(one_quantity_cost, -2, -1, -2).addComponent(jLabel106)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel39).addComponent(total_dm_cost, -2, -1, -2).addComponent(jLabel107)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jButton1).addComponent(Back)).addGap(167, 167, 167)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(anion_resin_cost, -2, -1, -2).addComponent(jLabel92)).addContainerGap(-1, 32767)))));
    



















































































































































































































































































    jScrollPane1.setViewportView(jPanel1);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(48, 32767).addComponent(jScrollPane1, -2, 802, -2).addGap(43, 43, 43)));
    





    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, -1, 1556, 32767).addContainerGap()));
    






    pack();
  }
  
  private JLabel jLabel24;
  private JLabel jLabel25;
  private JLabel jLabel26;
  private JLabel jLabel27;
  private JLabel jLabel28;
  private JLabel jLabel29;
  private JLabel jLabel3;
  private JLabel jLabel30;
  private JLabel jLabel31;
  private JLabel jLabel32;
  
  private void BackActionPerformed(ActionEvent evt)
  {
    Homepage h = new Homepage();
    h.setVisible(true);
    setVisible(false);
  }
  
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
  
  private void one_quantity_costFocusGained(FocusEvent evt)
  {
    double Cation_cost = Double.parseDouble(cation_total_cost.getText());
    double Anion_cost = Double.parseDouble(anion_total_cost.getText());
    double fab_cost = Double.parseDouble(fabrication_cost.getText());
    double rubber_lining_cost = Double.parseDouble(total_rubber_lining_cost.getText());
    double CR_cost = Double.parseDouble(cation_resin_cost.getText());
    double AR_cost = Double.parseDouble(anion_total_cost.getText());
    double mediacost = Double.parseDouble(Media_cost.getText());
    double total_cost = Cation_cost + Anion_cost + fab_cost + rubber_lining_cost + mediacost + CR_cost + AR_cost;
    String total_cost1 = Double.toString(Math.round(total_cost * 100.0D) / 100.0D);
    one_quantity_cost.setText(total_cost1);
  }
  
  private JLabel jLabel42;
  private JLabel jLabel43;
  private JLabel jLabel44;
  private JLabel jLabel45;
  private JLabel jLabel46;
  private JLabel jLabel47;
  private JLabel jLabel48;
  private JLabel jLabel49;
  private JLabel jLabel5;
  
  private void Media_costFocusGained(FocusEvent evt)
  {
    double sandcost = Double.parseDouble(Sand_cost.getText());
    double gravelcost = Double.parseDouble(Gravel_cost.getText());
    double pebblecost = Double.parseDouble(Pebbles_cost.getText());
    double ACcost = Double.parseDouble(AC_cost.getText());
    double Mediacost = sandcost + gravelcost + pebblecost + ACcost;
    String Mediacost1 = Double.toString(Math.round(Mediacost * 100.0D) / 100.0D);
    Media_cost.setText(Mediacost1);
  }
  
  private JLabel jLabel50;
  private JLabel jLabel51;
  private JLabel jLabel52;
  private JLabel jLabel53;
  private JLabel jLabel54;
  private JLabel jLabel55;
  private JLabel jLabel56;
  private JLabel jLabel57;
  private JLabel jLabel58;
  
  private void AC_costFocusGained(FocusEvent evt)
  {
    double AC_wt = Double.parseDouble(AC.getText());
    double ACcost_kg = Double.parseDouble(AC_kg.getText());
    double ACcost = AC_wt * ACcost_kg;
    String ACcost1 = Double.toString(Math.round(ACcost * 100.0D) / 100.0D);
    AC_cost.setText(ACcost1);
  }
  
  private JLabel jLabel59;
  private JLabel jLabel6;
  private JLabel jLabel60;
  private JLabel jLabel61;
  private JLabel jLabel62;
  private JLabel jLabel63;
  private JLabel jLabel64;
  
  private void Pebbles_costFocusGained(FocusEvent evt)
  {
    double Pebble_wt = Double.parseDouble(Pebbles.getText());
    double pc_kg = Double.parseDouble(Pebbles_kg.getText());
    double Pebblecost = Pebble_wt * pc_kg;
    String Pebblecost1 = Double.toString(Math.round(Pebblecost * 100.0D) / 100.0D);
    Pebbles_cost.setText(Pebblecost1);
  }
  
  private JLabel jLabel65;
  private JLabel jLabel66;
  private JLabel jLabel67;
  private JLabel jLabel68;
  private JLabel jLabel69;
  private JLabel jLabel7;
  private JLabel jLabel70;
  private void Gravel_costFocusGained(FocusEvent evt)
  {
    double Gravel_wt = Double.parseDouble(Gravel.getText());
    double gc_kg = Double.parseDouble(Gravel_kg.getText());
    double Gravelcost = Gravel_wt * gc_kg;
    String Gravelcost1 = Double.toString(Math.round(Gravelcost * 100.0D) / 100.0D);
    Gravel_cost.setText(Gravelcost1);
  }
  
  private void Sand_costFocusGained(FocusEvent evt)
  {
    double sand_wt = Double.parseDouble(Sand.getText());
    double sc_kg = Double.parseDouble(Sand_kg.getText());
    double Sandcost = sand_wt * sc_kg;
    String Sandcost1 = Double.toString(Math.round(Sandcost * 100.0D) / 100.0D);
    Sand_cost.setText(Sandcost1);
  }
  
  private void total_dm_costFocusGained(FocusEvent evt)
  {
    double q = Double.parseDouble(one_quantity_cost.getText());
    int qt = Integer.parseInt(qty.getText());
    double q1 = q * qt;
    String totalcost = Double.toString(q1);
    total_dm_cost.setText(totalcost);
  }
  
  private void total_rubber_lining_costFocusGained(FocusEvent evt)
  {
    double Crubber_lining = Double.parseDouble(Crubber_lining_area.getText());
    double Arubber_lining = Double.parseDouble(Arubber_lining_area.getText());
    double rubber_lining_cost = Double.parseDouble(rubber_lining_costm2.getText());
    double rubber_lining = (Crubber_lining + Arubber_lining) * rubber_lining_cost;
    String rubber_lining1 = Double.toString(Math.round(rubber_lining * 100.0D) / 100.0D);
    total_rubber_lining_cost.setText(rubber_lining1);
  }
  
  private void fabrication_costFocusGained(FocusEvent evt)
  {
    double ADweight = Double.parseDouble(AD_weight.getText());
    double ASweight = Double.parseDouble(AS_weight.getText());
    double CDweight = Double.parseDouble(CD_weight.getText());
    double CSweight = Double.parseDouble(CS_weight.getText());
    double fab_kg = Double.parseDouble(fabrication_kg.getText());
    double fab_cost = (CDweight + ASweight + CSweight + CSweight) * fab_kg;
    String fab_cost1 = Double.toString(Math.round(fab_cost * 100.0D) / 100.0D);
    fabrication_cost.setText(fab_cost1);
  }
  
  private void anion_total_costFocusGained(FocusEvent evt)
  {
    double ADweight = Double.parseDouble(AD_weight.getText());
    double ASweight = Double.parseDouble(AS_weight.getText());
    double steel_cost = Double.parseDouble(steel_cost_kg.getText());
    double Aweight = ADweight + ASweight;
    double Anion_cost = Aweight * steel_cost;
    String Anion_cost1 = Double.toString(Math.round(Anion_cost * 100.0D) / 100.0D);
    anion_total_cost.setText(Anion_cost1);
  }
  
  private void AS_weightFocusGained(FocusEvent evt)
  {
    double ASdiameter = Double.parseDouble(AS_diameter.getText());
    double ASthickness = Double.parseDouble(AS_thickness.getText());
    double ASweight = 6.28D * ASdiameter * ASdiameter * ASthickness * 7.85D / 4.0D;
    String ASweight1 = Double.toString(Math.round(ASweight * 100.0D) / 100.0D);
    AS_weight.setText(ASweight1);
  }
  
  private void AS_diameterFocusGained(FocusEvent evt)
  {
    double ADdiameter = Double.parseDouble(AD_diameter.getText());
    double ASdia = 1.3D * ADdiameter;
    String ASdiameter = Double.toString(Math.round(ASdia * 100.0D) / 100.0D);
    AS_diameter.setText(ASdiameter);
  }
  
  private void Arubber_lining_areaFocusGained(FocusEvent evt)
  {
    double ADdiameter = Double.parseDouble(AD_diameter.getText());
    double ADheight = Double.parseDouble(AD_height.getText());
    double ASdiameter = Double.parseDouble(AS_diameter.getText());
    double Arubber_lining = 3.14D * ADdiameter * ADheight + 6.28D * ASdiameter * ASdiameter / 4.0D;
    String Arubber_lining1 = Double.toString(Math.round(Arubber_lining * 100.0D) / 100.0D);
    Arubber_lining_area.setText(Arubber_lining1);
  }
  
  private void AD_weightFocusGained(FocusEvent evt)
  {
    double ADdiameter = Double.parseDouble(AD_diameter.getText());
    double ADheight = Double.parseDouble(AD_height.getText());
    double ADthickness = Double.parseDouble(AD_thickness.getText());
    double ADweight = 3.14D * ADdiameter * ADheight * ADthickness * 7.85D;
    String ADweight1 = Double.toString(Math.round(ADweight * 100.0D) / 100.0D);
    AD_weight.setText(ADweight1);
  }
  
  private void AD_diameterFocusGained(FocusEvent evt)
  {
    double Avolume = Double.parseDouble(Avolume_of_resin.getText());
    double ADdia = Math.sqrt(Avolume * 4.0D / 3.14D);
    String ADdiameter = Double.toString(Math.round(ADdia * 100.0D) / 100.0D);
    AD_diameter.setText(ADdiameter);
  }
  
  private void Avolume_of_resinFocusGained(FocusEvent evt)
  {
    double fr = Double.parseDouble(flow_rate.getText());
    int oh = Integer.parseInt(operational_hrs.getText());
    int Aamountsalt = Integer.parseInt(Aamount_of_salt.getText());
    int Aresin_cap = Integer.parseInt(Aresin_capacity.getText());
    double Avolume = fr * oh * Aamountsalt / (Aresin_cap * 1000);
    String Avol = Double.toString(Math.round(Avolume * 100.0D) / 100.0D);
    Avolume_of_resin.setText(Avol);
  }
  
  private void cation_total_costFocusGained(FocusEvent evt)
  {
    double CDweight = Double.parseDouble(CD_weight.getText());
    double CSweight = Double.parseDouble(CS_weight.getText());
    double steel_cost = Double.parseDouble(steel_cost_kg.getText());
    double Cweight = CDweight + CSweight;
    double Cation_cost = Cweight * steel_cost;
    String Cation_cost1 = Double.toString(Math.round(Cation_cost * 100.0D) / 100.0D);
    cation_total_cost.setText(Cation_cost1);
  }
  
  private void CS_weightFocusGained(FocusEvent evt)
  {
    double CSdiameter = Double.parseDouble(CS_diameter.getText());
    double CSthickness = Double.parseDouble(CS_thickness.getText());
    double CSweight = 6.28D * CSdiameter * CSdiameter * CSthickness * 7.85D / 4.0D;
    String CSweight1 = Double.toString(Math.round(CSweight * 100.0D) / 100.0D);
    CS_weight.setText(CSweight1);
  }
  
  private void CS_diameterFocusGained(FocusEvent evt)
  {
    double CDdiameter = Double.parseDouble(CD_diameter.getText());
    double CSdia = 1.3D * CDdiameter;
    String CSdiameter = Double.toString(Math.round(CSdia * 100.0D) / 100.0D);
    CS_diameter.setText(CSdiameter);
  }
  
  private void Crubber_lining_areaFocusGained(FocusEvent evt)
  {
    double CDdiameter = Double.parseDouble(CD_diameter.getText());
    double CDheight = Double.parseDouble(CD_height.getText());
    double CSdiameter = Double.parseDouble(CS_diameter.getText());
    double Crubber_lining = 3.14D * CDdiameter * CDheight + 6.28D * CSdiameter * CSdiameter / 4.0D;
    String Crubber_lining1 = Double.toString(Math.round(Crubber_lining * 100.0D) / 100.0D);
    Crubber_lining_area.setText(Crubber_lining1);
  }
  
  private void CD_weightFocusGained(FocusEvent evt)
  {
    double CDdiameter = Double.parseDouble(CD_diameter.getText());
    double CDheight = Double.parseDouble(CD_height.getText());
    double CDthickness = Double.parseDouble(CD_thickness.getText());
    double CDweight = 3.14D * CDdiameter * CDheight * CDthickness * 7.85D;
    String CDweight1 = Double.toString(Math.round(CDweight * 100.0D) / 100.0D);
    CD_weight.setText(CDweight1);
  }
  
  private void CD_diameterFocusGained(FocusEvent evt)
  {
    double Cvolume = Double.parseDouble(Cvolume_ofresin.getText());
    double CDdia = Math.sqrt(Cvolume * 4.0D / 3.14D);
    String CDdiameter = Double.toString(Math.round(CDdia * 100.0D) / 100.0D);
    CD_diameter.setText(CDdiameter);
  }
  private JLabel jLabel71;
  private JLabel jLabel72;
  
  private void Cvolume_ofresinFocusGained(FocusEvent evt)
  {
    double fr = Double.parseDouble(flow_rate.getText());
    int oh = Integer.parseInt(operational_hrs.getText());
    int Camountsalt = Integer.parseInt(Camount_of_salt.getText());
    int Cresin_cap = Integer.parseInt(Cresin_capacity.getText());
    double Cvolume = fr * oh * Camountsalt / (Cresin_cap * 1000);
    String Cvol = Double.toString(Math.round(Cvolume * 100.0D) / 100.0D);
    Cvolume_ofresin.setText(Cvol);
  }
  
  private JLabel jLabel73;
  
  private void Cvolume_ofresinMouseClicked(MouseEvent evt)
  {
    double fr = Double.parseDouble(flow_rate.getText());
    int oh = Integer.parseInt(operational_hrs.getText());
    int Camountsalt = Integer.parseInt(Camount_of_salt.getText());
    int Cresin_cap = Integer.parseInt(Cresin_capacity.getText());
    double Cvolume = fr * oh * Camountsalt / (Cresin_cap * 1000);
    String Cvol = Double.toString(Math.round(Cvolume * 100.0D) / 100.0D);
    Cvolume_ofresin.setText(Cvol);
  }
  
  private JLabel jLabel74;
  private JLabel jLabel75;
  
  private void jButton1ActionPerformed(ActionEvent evt)
  {
    if ("".equals(product_id.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Company Name");
    } else if ("".equals(company_name.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Company Name");
    } else if ("".equals(qty.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Quantity");
    } else if ("".equals(flow_rate.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Flow Rate");
    } else if ("".equals(date.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Date");
    } else if ("".equals(type.getSelectedItem())) {
      JOptionPane.showMessageDialog(null, "enter the Type");
    } else if ("".equals(operational_hrs.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Operational hrs");
    } else if ("".equals(Camount_of_salt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Amount of Cation Salt");
    } else if ("".equals(Cresin_capacity.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Resin Capacity");
    } else if ("".equals(Cvolume_ofresin.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Volume of Cation Resin");
    } else if ("".equals(Aamount_of_salt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Amount of Anion Salt");
    } else if ("".equals(Aresin_capacity.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Anion Resin Capacity");
    } else if ("".equals(Avolume_of_resin.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Volume of Anion Resin");
    }
    else if ("".equals(Cresin_height.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Resin Height");
    } else if ("".equals(CD_height.getText())) {
      JOptionPane.showMessageDialog(null, "enter Cation Drum Height");
    } else if ("".equals(CD_diameter.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Drum Diameter");
    } else if ("".equals(CD_thickness.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Drum Thickness");
    } else if ("".equals(CD_weight.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Drum Weight");
    } else if ("".equals(CS_diameter.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Shell Diameter");
    } else if ("".equals(CS_thickness.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Shell Thickness");
    } else if ("".equals(CS_weight.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Shell Weight");
    }
    else if ("".equals(Aresin_height.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Resin Height for Anion");
    } else if ("".equals(AD_height.getText())) {
      JOptionPane.showMessageDialog(null, "enter Anion Drum Height");
    } else if ("".equals(AD_diameter.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Anion Drum Diameter");
    } else if ("".equals(AD_thickness.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Anion Drum Thickness");
    } else if ("".equals(AD_weight.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Anion Drum Weight");
    } else if ("".equals(AS_diameter.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Anion Shell Diameter");
    } else if ("".equals(AS_thickness.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Anion Shell Thickness");
    } else if ("".equals(AS_weight.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Anion Shell Weight");
    }
    else if ("".equals(steel_cost_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cost of Steel per kg");
    } else if ("".equals(cation_total_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Cation Tank Cost");
    } else if ("".equals(anion_total_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Anion Tank Cost");
    }
    else if ("".equals(cation_resin_litre.getText())) {
      JOptionPane.showMessageDialog(null, "enter Cation Resin Cost/kg");
    } else if ("".equals(cation_resin_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Cation Resin Cost");
    } else if ("".equals(anion_resin_litre.getText())) {
      JOptionPane.showMessageDialog(null, "enter Anion Resin Cost/kg");
    } else if ("".equals(anion_resin_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter  Anion Resin Cost");
    }
    else if ("".equals(fabrication_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Fabrication Cost per kg");
    } else if ("".equals(fabrication_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Fabrication Cost");
    } else if ("".equals(rubber_lining_costm2.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Rubber Lining Costper square metre");
    } else if ("".equals(total_rubber_lining_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Rubber Lining Cost");
    }
    else if ("".equals(Sand.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Sand Weight");
    } else if ("".equals(Sand_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter Cost of Sand/kg");
    } else if ("".equals(Sand_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Sand Cost");
    } else if ("".equals(Gravel.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Gravel Weight");
    } else if ("".equals(Gravel_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cost of Gravel/kg");
    } else if ("".equals(Gravel_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Gravel Cost");
    } else if ("".equals(Pebbles.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Pebbles Weight");
    } else if ("".equals(Pebbles_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter Cost of Pebbles/kg");
    } else if ("".equals(Pebbles_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Pebbles Cost");
    } else if ("".equals(AC.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Activated Carbon Weight");
    } else if ("".equals(AC_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cost of Activated Carbo/kg");
    } else if ("".equals(AC_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Activated Carbo Cost");
    } else if ("".equals(Media_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Filter Media Cost");
    } else if ("".equals(one_quantity_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cost of Cost of One Quantity");
    } else if ("".equals(total_dm_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total DM Plant Cost");
    } else {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
        String query1 = "INSERT INTO `dm-info`(`Company_name`, `Product_id`, `Date`, `Type`, `Qty`, `Flow_rate`, `total_cost`) VALUES (?,?,?,?,?,?,?);";
        PreparedStatement stmt1 = conn.prepareStatement(query1);
        stmt1.setString(1, company_name.getText());
        stmt1.setString(2, product_id.getText());
        stmt1.setString(3, date.getText());
        stmt1.setString(4, String.valueOf(type.getSelectedItem()));
        stmt1.setInt(5, Integer.parseInt(qty.getText()));
        stmt1.setDouble(6, Double.parseDouble(flow_rate.getText()));
        stmt1.setDouble(7, Double.parseDouble(total_dm_cost.getText()));
        stmt1.executeUpdate();
        
        String query2 = "INSERT INTO `cation-bed`(`Product_id`, `flow_rate`, `operational_hrs`, `Camount_of_salt`, `Cresin_capacity`, `Cvolume_of_resin`) VALUES (?,?,?,?,?,?);";
        PreparedStatement stmt2 = conn.prepareStatement(query2);
        stmt2.setString(1, product_id.getText());
        stmt2.setDouble(2, Double.parseDouble(flow_rate.getText()));
        stmt2.setInt(3, Integer.parseInt(operational_hrs.getText()));
        stmt2.setInt(4, Integer.parseInt(Camount_of_salt.getText()));
        stmt2.setInt(5, Integer.parseInt(Cresin_capacity.getText()));
        stmt2.setDouble(6, Double.parseDouble(Cvolume_ofresin.getText()));
        stmt2.executeUpdate();
        
        String query3 = "INSERT INTO `anion-bed`(`Product_id`, `flow_rate`, `operational_hrs`, `Aamount_of_salt`, `Aresin_capacity`, `Avolume_of_resin`) VALUES (?,?,?,?,?,?);";
        PreparedStatement stmt3 = conn.prepareStatement(query3);
        stmt3.setString(1, product_id.getText());
        stmt3.setDouble(2, Double.parseDouble(flow_rate.getText()));
        stmt3.setInt(3, Integer.parseInt(operational_hrs.getText()));
        stmt3.setInt(4, Integer.parseInt(Aamount_of_salt.getText()));
        stmt3.setInt(5, Integer.parseInt(Aresin_capacity.getText()));
        stmt3.setDouble(6, Double.parseDouble(Avolume_of_resin.getText()));
        stmt3.executeUpdate();
        
        String query4 = "INSERT INTO `cation-drum`(`Product_id`, `Cresin_height`, `CD_height`, `CD_diameter`, `CD_thickness`, `CD_wt`) VALUES (?,?,?,?,?,?);";
        PreparedStatement stmt4 = conn.prepareStatement(query4);
        stmt4.setString(1, product_id.getText());
        stmt4.setDouble(2, Double.parseDouble(Cresin_height.getText()));
        stmt4.setDouble(3, Double.parseDouble(CD_height.getText()));
        stmt4.setDouble(4, Double.parseDouble(CD_diameter.getText()));
        stmt4.setDouble(5, Double.parseDouble(CD_thickness.getText()));
        stmt4.setDouble(6, Double.parseDouble(CD_weight.getText()));
        stmt4.executeUpdate();
        
        String query5 = "INSERT INTO `cation-shell`(`Product_id`, `CS_diameter`, `CS_thickness`, `CS_wt`) VALUES (?,?,?,?);";
        PreparedStatement stmt5 = conn.prepareStatement(query5);
        stmt5.setString(1, product_id.getText());
        stmt5.setDouble(2, Double.parseDouble(CS_diameter.getText()));
        stmt5.setDouble(3, Double.parseDouble(CS_thickness.getText()));
        stmt5.setDouble(4, Double.parseDouble(CS_weight.getText()));
        stmt5.executeUpdate();
        
        String query6 = "INSERT INTO `anion-drum`(`Product_id`, `Aresin_height`, `AD_height`, `AD_diameter`, `AD_thickness`, `AD_wt`) VALUES (?,?,?,?,?,?);";
        PreparedStatement stmt6 = conn.prepareStatement(query6);
        stmt6.setString(1, product_id.getText());
        stmt6.setDouble(2, Double.parseDouble(Aresin_height.getText()));
        stmt6.setDouble(3, Double.parseDouble(AD_height.getText()));
        stmt6.setDouble(4, Double.parseDouble(AD_diameter.getText()));
        stmt6.setDouble(5, Double.parseDouble(AD_thickness.getText()));
        stmt6.setDouble(6, Double.parseDouble(AD_weight.getText()));
        stmt6.executeUpdate();
        
        String query7 = "INSERT INTO `anion-shell`(`Product_id`, `AS_diameter`, `AS_thickness`, `AS_wt`) VALUES (?,?,?,?);";
        PreparedStatement stmt7 = conn.prepareStatement(query7);
        stmt7.setString(1, product_id.getText());
        stmt7.setDouble(2, Double.parseDouble(AS_diameter.getText()));
        stmt7.setDouble(3, Double.parseDouble(AS_thickness.getText()));
        stmt7.setDouble(4, Double.parseDouble(AS_weight.getText()));
        stmt7.executeUpdate();
        
        String query8 = "INSERT INTO `dm-cation&anion`(`Product_id`, `Crubber_lining_area`, `Arubber_lining_area`, `cost_steel_kg`, `cation_cost`, `anion_cost`, `cation_resin_litre`, `cation_resin_cost`, `anion_resin_litre`, `anion_resin_cost`, `fabrication_kg`, `fabrication_cost`, `rubber_lining`, `rubber_lining_cost`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement stmt8 = conn.prepareStatement(query8);
        stmt8.setString(1, product_id.getText());
        stmt8.setDouble(2, Double.parseDouble(Crubber_lining_area.getText()));
        stmt8.setDouble(3, Double.parseDouble(Arubber_lining_area.getText()));
        stmt8.setDouble(4, Double.parseDouble(steel_cost_kg.getText()));
        stmt8.setDouble(5, Double.parseDouble(cation_total_cost.getText()));
        stmt8.setDouble(6, Double.parseDouble(anion_total_cost.getText()));
        stmt8.setDouble(7, Double.parseDouble(cation_resin_litre.getText()));
        stmt8.setDouble(8, Double.parseDouble(cation_resin_cost.getText()));
        stmt8.setDouble(9, Double.parseDouble(anion_resin_litre.getText()));
        stmt8.setDouble(10, Double.parseDouble(anion_resin_cost.getText()));
        stmt8.setDouble(11, Double.parseDouble(fabrication_kg.getText()));
        stmt8.setDouble(12, Double.parseDouble(fabrication_cost.getText()));
        stmt8.setDouble(13, Double.parseDouble(rubber_lining_costm2.getText()));
        stmt8.setDouble(14, Double.parseDouble(total_rubber_lining_cost.getText()));
        stmt8.executeUpdate();
        
        String query9 = "INSERT INTO `dm-filter-media`(`Product_id`, `sand`, `sand_kg`, `sand_cost`, `gravel`, `gravel_kg`, `gravel_cost`, `pebbles`, `pebbles_kg`, `pebbles_cost`, `ac`, `ac_kg`, `ac_cost`, `media_cost`, `one_quantity_cost`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement stmt9 = conn.prepareStatement(query9);
        stmt9.setString(1, product_id.getText());
        stmt9.setDouble(2, Double.parseDouble(Sand.getText()));
        stmt9.setDouble(3, Double.parseDouble(Sand_kg.getText()));
        stmt9.setDouble(4, Double.parseDouble(Sand_cost.getText()));
        stmt9.setDouble(5, Double.parseDouble(Gravel.getText()));
        stmt9.setDouble(6, Double.parseDouble(Gravel_kg.getText()));
        stmt9.setDouble(7, Double.parseDouble(Gravel_cost.getText()));
        stmt9.setDouble(8, Double.parseDouble(Pebbles.getText()));
        stmt9.setDouble(9, Double.parseDouble(Pebbles_kg.getText()));
        stmt9.setDouble(10, Double.parseDouble(Pebbles_cost.getText()));
        stmt9.setDouble(11, Double.parseDouble(AC.getText()));
        stmt9.setDouble(12, Double.parseDouble(AC_kg.getText()));
        stmt9.setDouble(13, Double.parseDouble(AC_cost.getText()));
        stmt9.setDouble(14, Double.parseDouble(Media_cost.getText()));
        stmt9.setDouble(15, Double.parseDouble(one_quantity_cost.getText()));
        stmt9.executeUpdate();
        JOptionPane.showMessageDialog(null, "Entered the data successfully");
      }
      catch (ClassNotFoundException|SQLException e)
      {
        JOptionPane.showMessageDialog(null, "Error in connection" + e);
      }
    }
  }
  
  private JLabel jLabel76;
  private JLabel jLabel77;
  private JLabel jLabel78;
  private JLabel jLabel79;
  
  private void cation_resin_costFocusGained(FocusEvent evt)
  {
    double CR_cost = Double.parseDouble(cation_resin_litre.getText());
    double CR_volume = Double.parseDouble(Cvolume_ofresin.getText());
    double CRCost = CR_cost * CR_volume * 1000.0D;
    String CRCost1 = Double.toString(Math.round(CRCost * 100.0D) / 100.0D);
    cation_resin_cost.setText(CRCost1);
  }
  
  private JLabel jLabel8;
  private JLabel jLabel80;
  
  private void anion_resin_costFocusGained(FocusEvent evt)
  {
    double AR_cost = Double.parseDouble(anion_resin_litre.getText());
    double AR_volume = Double.parseDouble(Avolume_of_resin.getText());
    double ARCost = AR_cost * AR_volume * 1000.0D;
    String ARCost1 = Double.toString(Math.round(ARCost * 100.0D) / 100.0D);
    anion_resin_cost.setText(ARCost1);
  }
  
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
  
  public static void main(String[] args)
  {
    try
    {
      for (UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName()))
        {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException|InstantiationException|IllegalAccessException|UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Dmwater.class.getName()).log(Level.SEVERE, null, ex);
    }
    


    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Dmwater().setVisible(true);
      }
    });
  }
  
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
  private JPanel jPanel1;
  private JScrollPane jScrollPane1;
  private JTextField one_quantity_cost;
  private JTextField operational_hrs;
  private JTextField product_id;
  private JTextField qty;
  private JTextField rubber_lining_costm2;
  private JTextField steel_cost_kg;
  private JTextField total_dm_cost;
  private JTextField total_rubber_lining_cost;
  private JComboBox type;
}
