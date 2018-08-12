package process_simulation;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

public class DMedit
  extends JFrame
{
  String input;
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
  private JTextField Anion_total_cost;
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
  private JTextField Cation_total_cost;
  private JTextField Cresin_capacity;
  private JTextField Cresin_height;
  private JTextField Crubber_lining_area;
  private JTextField Cvolume_of_resin;
  private JButton Delete;
  private JButton Edit;
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
  private JTextField cation_resin_cost;
  private JTextField cation_resin_litre;
  private JTextField company_name;
  private JTextField date;
  private JTextField fabrication_cost;
  private JTextField fabrication_kg;
  private JTextField flow_rate;
  private JLabel jLabel1;
  private JLabel jLabel10;
  private JLabel jLabel100;
  private JLabel jLabel101;
  private JLabel jLabel102;
  
  public DMedit(String value)
  {
    initComponents();
    input = value;
    display(input);
  }
  
  private JLabel jLabel103;
  private JLabel jLabel104;
  private JLabel jLabel105;
  private JLabel jLabel106;
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
  private JLabel jLabel24;
  
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
    company_name = new JTextField();
    product_id = new JTextField();
    date = new JTextField();
    type = new JComboBox();
    qty = new JTextField();
    flow_rate = new JTextField();
    operational_hrs = new JTextField();
    Camount_of_salt = new JTextField();
    Cresin_capacity = new JTextField();
    Cvolume_of_resin = new JTextField();
    Cresin_height = new JTextField();
    CD_height = new JTextField();
    CD_diameter = new JTextField();
    CD_thickness = new JTextField();
    CD_weight = new JTextField();
    CS_diameter = new JTextField();
    CS_thickness = new JTextField();
    CS_weight = new JTextField();
    Crubber_lining_area = new JTextField();
    steel_cost_kg = new JTextField();
    Cation_total_cost = new JTextField();
    Anion_total_cost = new JTextField();
    rubber_lining_costm2 = new JTextField();
    total_rubber_lining_cost = new JTextField();
    fabrication_cost = new JTextField();
    Sand = new JTextField();
    Sand_kg = new JTextField();
    Sand_cost = new JTextField();
    Gravel = new JTextField();
    Gravel_kg = new JTextField();
    Gravel_cost = new JTextField();
    Pebbles = new JTextField();
    Pebbles_kg = new JTextField();
    Pebbles_cost = new JTextField();
    AC = new JTextField();
    AC_kg = new JTextField();
    AC_cost = new JTextField();
    one_quantity_cost = new JTextField();
    total_dm_cost = new JTextField();
    Aamount_of_salt = new JTextField();
    Aresin_capacity = new JTextField();
    Avolume_of_resin = new JTextField();
    Aresin_height = new JTextField();
    AD_height = new JTextField();
    AD_diameter = new JTextField();
    AD_thickness = new JTextField();
    AD_weight = new JTextField();
    AS_diameter = new JTextField();
    AS_thickness = new JTextField();
    AS_weight = new JTextField();
    Arubber_lining_area = new JTextField();
    jLabel56 = new JLabel();
    Edit = new JButton();
    Delete = new JButton();
    jLabel57 = new JLabel();
    Media_cost = new JTextField();
    Back = new JButton();
    jLabel58 = new JLabel();
    fabrication_kg = new JTextField();
    jLabel59 = new JLabel();
    jLabel60 = new JLabel();
    jLabel61 = new JLabel();
    jLabel62 = new JLabel();
    cation_resin_litre = new JTextField();
    cation_resin_cost = new JTextField();
    anion_resin_litre = new JTextField();
    anion_resin_cost = new JTextField();
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
    jLabel106 = new JLabel();
    
    setDefaultCloseOperation(3);
    setPreferredSize(new Dimension(881, 1700));
    setResizable(false);
    
    jScrollPane1.setVerticalScrollBarPolicy(22);
    jScrollPane1.setPreferredSize(new Dimension(830, 1198));
    
    jPanel1.setPreferredSize(new Dimension(781, 3500));
    
    jLabel1.setFont(new Font("Times New Roman", 1, 14));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setText("DE-MINERALIZED PLANT");
    
    jLabel3.setText("COMPANY NAME");
    
    jLabel4.setText("PRODUCT ID");
    
    jLabel5.setText("DATE");
    
    jLabel6.setText("TYPE");
    
    jLabel7.setText("QUANTITY");
    
    jLabel8.setText("FLOW RATE");
    
    jLabel9.setText("OPERATIONAL HRS");
    
    jLabel10.setFont(new Font("Times New Roman", 0, 12));
    jLabel10.setText("CATION BED");
    
    jLabel11.setText("AMOUNT OF CATION SALT");
    
    jLabel12.setText("AMOUNT OF ANION SALT");
    
    jLabel13.setText("CATION RESIN CAPACITY");
    
    jLabel14.setText("ANION RESIN CAPACITY");
    
    jLabel15.setText("VOLUME CAPACITY OF CATION RESIN");
    
    jLabel16.setText("VOLUME CAPACITY OF ANION RESIN");
    
    jLabel17.setText("HEIGHT OF CATION RESIN");
    
    jLabel18.setText("HEIGHT OF ANION RESIN");
    
    jLabel19.setText("HEIGHT OF DRUM");
    
    jLabel20.setText("HEIGHT OF DRUM");
    
    jLabel21.setText("DIAMETER OF DRUM");
    
    jLabel22.setText("DIAMETER OF DRUM");
    
    jLabel23.setText("THICKNESS OF DRUM");
    
    jLabel24.setText("THICKNESS OF DRUM");
    
    jLabel25.setText("WEIGHT OF DRUM");
    
    jLabel26.setText("WEIGHT OF DRUM");
    
    jLabel27.setText("DIAMETER OF SHELL");
    
    jLabel28.setText("DIAMETER OF SHELL");
    
    jLabel29.setText("THICKNESS OF SHELL");
    
    jLabel30.setText("THICKNESS OF SHELL");
    
    jLabel31.setText("WEIGHT OF SHELL");
    
    jLabel32.setText("WEIGHT OF SHELL");
    
    jLabel33.setText("RUBBER LINING AREA");
    
    jLabel34.setText("RUBBER LINING AREA");
    
    jLabel35.setText("COST OF STEEL/KG");
    
    jLabel36.setText("COST OF CATION TANK");
    
    jLabel37.setText("COST OF ANION TANK");
    
    jLabel38.setText("RUBBER LINING COST PER m2");
    
    jLabel39.setText("RUBBER LINING COST");
    
    jLabel40.setText("FABRICATION COST");
    
    jLabel41.setFont(new Font("Times New Roman", 1, 12));
    jLabel41.setText("MEDIA");
    
    jLabel42.setText("Sand (kgs)");
    
    jLabel43.setText("Sand Cost (kg)");
    
    jLabel44.setText("Sand Cost");
    
    jLabel45.setText("Gravel (kgs)");
    
    jLabel46.setText("Gravel Cost (kg)");
    
    jLabel47.setText("Gravel Cost");
    
    jLabel48.setText("Pebbles (kgs)");
    
    jLabel49.setText("Pebbles Cost (kg)");
    
    jLabel50.setText("Pebbles Cost");
    
    jLabel51.setText("Activated Carbon (kgs)");
    
    jLabel52.setText("Activated Carbon Cost (kg)");
    
    jLabel53.setText("Activated Carbon Cost");
    
    jLabel54.setText("COST FOR ONE QUANTITY");
    
    jLabel55.setText("TOTAL COST ");
    
    company_name.setEditable(false);
    company_name.setText("0");
    
    product_id.setEditable(false);
    product_id.setText("0");
    
    date.setEditable(false);
    date.setText("0");
    
    type.setModel(new DefaultComboBoxModel(new String[] { "WITH DEGASER", "WITHOUT DEGASER" }));
    
    qty.setEditable(false);
    qty.setText("1");
    
    flow_rate.setText("0");
    
    operational_hrs.setText("0");
    
    Camount_of_salt.setText("0");
    
    Cresin_capacity.setText("0");
    Cresin_capacity.setToolTipText("");
    
    Cvolume_of_resin.setText("0");
    Cvolume_of_resin.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.Cvolume_of_resinFocusGained(evt);
      }
      
    });
    Cresin_height.setText("0");
    
    CD_height.setText("0");
    
    CD_diameter.setText("0");
    CD_diameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.CD_diameterFocusGained(evt);
      }
      
    });
    CD_thickness.setText("0");
    
    CD_weight.setText("0");
    CD_weight.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.CD_weightFocusGained(evt);
      }
      
    });
    CS_diameter.setText("0");
    CS_diameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.CS_diameterFocusGained(evt);
      }
      
    });
    CS_thickness.setText("0");
    
    CS_weight.setText("0");
    CS_weight.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.CS_weightFocusGained(evt);
      }
      
    });
    Crubber_lining_area.setText("0");
    Crubber_lining_area.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.Crubber_lining_areaFocusGained(evt);
      }
      
    });
    steel_cost_kg.setText("0");
    
    Cation_total_cost.setText("0");
    Cation_total_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.Cation_total_costFocusGained(evt);
      }
      
    });
    Anion_total_cost.setText("0");
    Anion_total_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.Anion_total_costFocusGained(evt);
      }
      
    });
    rubber_lining_costm2.setText("0");
    
    total_rubber_lining_cost.setText("0");
    total_rubber_lining_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.total_rubber_lining_costFocusGained(evt);
      }
      
    });
    fabrication_cost.setText("0");
    fabrication_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.fabrication_costFocusGained(evt);
      }
      
    });
    Sand.setText("0");
    
    Sand_kg.setText("0");
    
    Sand_cost.setText("0");
    Sand_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.Sand_costFocusGained(evt);
      }
      
    });
    Gravel.setText("0");
    
    Gravel_kg.setText("0");
    
    Gravel_cost.setText("0");
    Gravel_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.Gravel_costFocusGained(evt);
      }
      
    });
    Pebbles.setText("0");
    
    Pebbles_kg.setText("0");
    
    Pebbles_cost.setText("0");
    Pebbles_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.Pebbles_costFocusGained(evt);
      }
      
    });
    AC.setText("0");
    
    AC_kg.setText("0");
    
    AC_cost.setText("0");
    AC_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.AC_costFocusGained(evt);
      }
      
    });
    one_quantity_cost.setText("0");
    one_quantity_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.one_quantity_costFocusGained(evt);
      }
      
    });
    total_dm_cost.setText("0");
    total_dm_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.total_dm_costFocusGained(evt);
      }
      
    });
    Aamount_of_salt.setText("0");
    
    Aresin_capacity.setText("0");
    
    Avolume_of_resin.setText("0");
    Avolume_of_resin.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.Avolume_of_resinFocusGained(evt);
      }
      
    });
    Aresin_height.setText("0");
    
    AD_height.setText("0");
    
    AD_diameter.setText("0");
    AD_diameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.AD_diameterFocusGained(evt);
      }
      
    });
    AD_thickness.setText("0");
    
    AD_weight.setText("0");
    AD_weight.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.AD_weightFocusGained(evt);
      }
      
    });
    AS_diameter.setText("0");
    AS_diameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.AS_diameterFocusGained(evt);
      }
      
    });
    AS_thickness.setText("0");
    
    AS_weight.setText("0");
    AS_weight.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.AS_weightFocusGained(evt);
      }
      
    });
    Arubber_lining_area.setText("0");
    Arubber_lining_area.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.Arubber_lining_areaFocusGained(evt);
      }
      
    });
    jLabel56.setText("ANION BED");
    
    Edit.setText("EDIT");
    Edit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DMedit.this.EditActionPerformed(evt);
      }
      
    });
    Delete.setText("DELETE");
    Delete.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DMedit.this.DeleteActionPerformed(evt);
      }
      
    });
    jLabel57.setText("Media Cost");
    
    Media_cost.setText("0");
    Media_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.Media_costFocusGained(evt);
      }
      
    });
    Back.setText("Back");
    Back.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DMedit.this.BackActionPerformed(evt);
      }
      
    });
    jLabel58.setText("FABRICATIOCOST/KG");
    
    jLabel59.setText("CATION RESIN COST/LITRE");
    
    jLabel60.setText("TOTAL CATION RESIN COST");
    
    jLabel61.setText("ANION RESIN COST/KG");
    
    jLabel62.setText("TOTAL ANION RESIN COST");
    
    cation_resin_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.cation_resin_costFocusGained(evt);
      }
      
    });
    anion_resin_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        DMedit.this.anion_resin_costFocusGained(evt);
      }
      
    });
    jLabel63.setText("cubic metre/hr");
    
    jLabel64.setText("hr");
    
    jLabel65.setText("cubic m");
    
    jLabel66.setText("m");
    
    jLabel67.setText("m");
    
    jLabel68.setText("m");
    
    jLabel69.setText("mm");
    
    jLabel70.setText("kg");
    
    jLabel71.setText("m");
    
    jLabel72.setText("mm");
    
    jLabel73.setText("kg");
    
    jLabel74.setText("square m");
    
    jLabel75.setText("cubic m");
    
    jLabel76.setText("m");
    
    jLabel77.setText("m");
    
    jLabel78.setText("m");
    
    jLabel79.setText("mm");
    
    jLabel80.setText("kg");
    
    jLabel81.setText("m");
    
    jLabel82.setText("mm");
    
    jLabel83.setText("kg");
    
    jLabel84.setText("square m");
    
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
    
    jLabel106.setText("Rs");
    
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(236, 236, 236).addComponent(jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(284, 284, 284).addComponent(jLabel2)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(jLabel41, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(84, 84, 84).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel35).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel85)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel36).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel86)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel40).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel95)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel37).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel87)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel59).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel88)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel60).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel89)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel61).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel90)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel62).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel91)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel38).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 92, 32767).addComponent(jLabel92)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel39).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel93)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel58).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel94)))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Back, -2, 88, -2).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(jLabel42).addComponent(jLabel43).addComponent(jLabel44).addComponent(jLabel45).addComponent(jLabel46).addComponent(jLabel47).addComponent(jLabel48).addComponent(jLabel49).addComponent(jLabel50).addComponent(jLabel51).addComponent(jLabel52, -1, -1, 32767).addComponent(jLabel53).addComponent(jLabel57, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel96, GroupLayout.Alignment.TRAILING).addComponent(jLabel97, GroupLayout.Alignment.TRAILING).addComponent(jLabel98, GroupLayout.Alignment.TRAILING).addComponent(jLabel99, GroupLayout.Alignment.TRAILING).addComponent(jLabel100, GroupLayout.Alignment.TRAILING).addComponent(jLabel101, GroupLayout.Alignment.TRAILING).addComponent(jLabel102, GroupLayout.Alignment.TRAILING).addComponent(jLabel103, GroupLayout.Alignment.TRAILING).addComponent(jLabel104, GroupLayout.Alignment.TRAILING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(Sand).addComponent(Sand_kg).addComponent(Sand_cost).addComponent(Gravel).addComponent(Gravel_kg).addComponent(Gravel_cost).addComponent(Pebbles).addComponent(Pebbles_kg).addComponent(Pebbles_cost).addComponent(AC).addComponent(AC_kg).addComponent(AC_cost, -1, 136, 32767).addComponent(Media_cost)))))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(steel_cost_kg).addComponent(Cation_total_cost).addComponent(Anion_total_cost).addComponent(rubber_lining_costm2).addComponent(total_rubber_lining_cost).addComponent(fabrication_cost, -1, 137, 32767).addComponent(fabrication_kg).addComponent(cation_resin_litre).addComponent(cation_resin_cost).addComponent(anion_resin_litre).addComponent(anion_resin_cost))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(128, 128, 128).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel54).addComponent(jLabel55))).addGroup(jPanel1Layout.createSequentialGroup().addGap(141, 141, 141).addComponent(Edit, -2, 100, -2))).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel105).addComponent(jLabel106)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(one_quantity_cost).addComponent(total_dm_cost, -2, 137, -2).addComponent(Delete, -2, 111, -2))).addGroup(jPanel1Layout.createSequentialGroup().addGap(15, 15, 15).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(jLabel4).addComponent(jLabel3).addComponent(jLabel5).addComponent(jLabel6).addComponent(jLabel7).addComponent(jLabel9).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel11).addComponent(jLabel13).addComponent(jLabel15).addComponent(jLabel17).addComponent(jLabel19).addComponent(jLabel21).addComponent(jLabel23).addComponent(jLabel25).addComponent(jLabel27).addComponent(jLabel29).addComponent(jLabel31).addComponent(jLabel33)).addGap(22, 22, 22).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(Camount_of_salt).addComponent(Cresin_capacity).addComponent(Cvolume_of_resin).addComponent(Cresin_height).addComponent(CD_height).addComponent(CD_diameter).addComponent(CD_thickness).addComponent(CD_weight).addComponent(CS_diameter).addComponent(CS_thickness).addComponent(CS_weight).addComponent(Crubber_lining_area, -2, 143, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel65).addComponent(jLabel66).addComponent(jLabel67).addComponent(jLabel68).addComponent(jLabel69).addComponent(jLabel70).addComponent(jLabel71).addComponent(jLabel72).addComponent(jLabel73).addComponent(jLabel74)).addGap(32, 32, 32).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel12).addComponent(jLabel14).addComponent(jLabel16).addComponent(jLabel18).addComponent(jLabel20).addComponent(jLabel22).addComponent(jLabel24).addComponent(jLabel26).addComponent(jLabel28).addComponent(jLabel30).addComponent(jLabel32).addComponent(jLabel34)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(AS_weight, GroupLayout.Alignment.LEADING).addComponent(AS_thickness, GroupLayout.Alignment.LEADING).addComponent(AS_diameter, GroupLayout.Alignment.LEADING).addComponent(AD_weight, GroupLayout.Alignment.LEADING).addComponent(AD_thickness, GroupLayout.Alignment.LEADING).addComponent(AD_diameter, GroupLayout.Alignment.LEADING).addComponent(AD_height, GroupLayout.Alignment.LEADING).addComponent(Aresin_height, GroupLayout.Alignment.LEADING).addComponent(Avolume_of_resin, GroupLayout.Alignment.LEADING).addComponent(Aresin_capacity, GroupLayout.Alignment.LEADING).addComponent(Aamount_of_salt, GroupLayout.Alignment.LEADING).addComponent(Arubber_lining_area, -2, 137, -2))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(136, 136, 136).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(jLabel10).addComponent(company_name, -2, 150, -2).addComponent(product_id, -2, 150, -2).addComponent(date, -2, 150, -2).addComponent(type, -2, 150, -2).addComponent(qty, -2, 150, -2).addComponent(flow_rate, -2, 150, -2).addComponent(operational_hrs, -2, 150, -2))).addComponent(jLabel8)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel56).addGap(143, 143, 143)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel64).addComponent(jLabel63)).addGap(0, 0, 32767))))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel75).addComponent(jLabel76).addComponent(jLabel77).addComponent(jLabel78).addComponent(jLabel79).addComponent(jLabel80).addComponent(jLabel81).addComponent(jLabel82).addComponent(jLabel83).addComponent(jLabel84)))).addContainerGap(55, 32767)));
    



























































































































































































































































    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel2).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(company_name, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(product_id, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(date, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(type, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(qty, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(flow_rate, -2, -1, -2).addComponent(jLabel63)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(operational_hrs, -2, -1, -2).addComponent(jLabel64)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(jLabel56)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(jLabel12).addComponent(Camount_of_salt, -2, -1, -2).addComponent(Aamount_of_salt, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(jLabel14).addComponent(Cresin_capacity, -2, -1, -2).addComponent(Aresin_capacity, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel15).addComponent(jLabel16).addComponent(Cvolume_of_resin, -2, -1, -2).addComponent(Avolume_of_resin, -2, -1, -2).addComponent(jLabel65).addComponent(jLabel75)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(jLabel18).addComponent(Cresin_height, -2, -1, -2).addComponent(Aresin_height, -2, -1, -2).addComponent(jLabel66).addComponent(jLabel76)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel19).addComponent(jLabel20).addComponent(CD_height, -2, -1, -2).addComponent(AD_height, -2, -1, -2).addComponent(jLabel67).addComponent(jLabel77)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel21).addComponent(jLabel22).addComponent(CD_diameter, -2, -1, -2).addComponent(AD_diameter, -2, -1, -2).addComponent(jLabel68).addComponent(jLabel78)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel23).addComponent(jLabel24).addComponent(CD_thickness, -2, -1, -2).addComponent(AD_thickness, -2, -1, -2).addComponent(jLabel69).addComponent(jLabel79)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel25).addComponent(jLabel26).addComponent(CD_weight, -2, -1, -2).addComponent(AD_weight, -2, -1, -2).addComponent(jLabel70).addComponent(jLabel80)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel27).addComponent(jLabel28).addComponent(CS_diameter, -2, -1, -2).addComponent(AS_diameter, -2, -1, -2).addComponent(jLabel71).addComponent(jLabel81)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel29).addComponent(jLabel30).addComponent(CS_thickness, -2, -1, -2).addComponent(AS_thickness, -2, -1, -2).addComponent(jLabel72).addComponent(jLabel82)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel31).addComponent(jLabel32).addComponent(CS_weight, -2, -1, -2).addComponent(AS_weight, -2, -1, -2).addComponent(jLabel73).addComponent(jLabel83)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel33).addComponent(jLabel34).addComponent(Crubber_lining_area, -2, -1, -2).addComponent(Arubber_lining_area, -2, -1, -2).addComponent(jLabel74).addComponent(jLabel84)).addGap(23, 23, 23).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel35).addComponent(steel_cost_kg, -2, -1, -2).addComponent(jLabel85)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel36).addComponent(Cation_total_cost, -2, -1, -2).addComponent(jLabel86)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel37).addComponent(Anion_total_cost, -2, -1, -2).addComponent(jLabel87)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel59).addComponent(cation_resin_litre, -2, -1, -2).addComponent(jLabel88)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel60).addComponent(cation_resin_cost, -2, -1, -2).addComponent(jLabel89)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel61).addComponent(anion_resin_litre, -2, -1, -2).addComponent(jLabel90)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel62).addComponent(anion_resin_cost, -2, -1, -2).addComponent(jLabel91)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel38).addComponent(rubber_lining_costm2, -2, -1, -2).addComponent(jLabel92)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel39).addComponent(total_rubber_lining_cost, -2, -1, -2).addComponent(jLabel93)).addGap(3, 3, 3).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel58).addComponent(fabrication_kg, -2, -1, -2).addComponent(jLabel94)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel40).addComponent(fabrication_cost, -2, -1, -2).addComponent(jLabel95)).addGap(18, 18, 18).addComponent(jLabel41).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel42).addComponent(Sand, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel43).addComponent(Sand_kg, -2, -1, -2).addComponent(jLabel96)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel44).addComponent(Sand_cost, -2, -1, -2).addComponent(jLabel97)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel45).addComponent(Gravel, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel46).addComponent(Gravel_kg, -2, -1, -2).addComponent(jLabel98)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel47).addComponent(Gravel_cost, -2, -1, -2).addComponent(jLabel99)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel48).addComponent(Pebbles, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel49).addComponent(Pebbles_kg, -2, -1, -2).addComponent(jLabel100)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel50).addComponent(Pebbles_cost, -2, -1, -2).addComponent(jLabel101)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel51).addComponent(AC, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel52).addComponent(AC_kg, -2, -1, -2).addComponent(jLabel102)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel53).addComponent(AC_cost, -2, -1, -2).addComponent(jLabel103)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel57).addComponent(Media_cost, -2, -1, -2).addComponent(jLabel104)).addGap(14, 14, 14).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel54).addComponent(one_quantity_cost, -2, -1, -2).addComponent(jLabel105)).addGap(6, 6, 6).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel55).addComponent(total_dm_cost, -2, -1, -2).addComponent(jLabel106)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Edit).addComponent(Delete).addComponent(Back)).addContainerGap()));
    











































































































































































































































































    jScrollPane1.setViewportView(jPanel1);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, -1, 907, 32767).addContainerGap()));
    





    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, -2, 1921, -2).addContainerGap(-1, 32767)));
    






    pack();
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
  
  private void Cvolume_of_resinFocusGained(FocusEvent evt)
  {
    double fr = Double.parseDouble(flow_rate.getText());
    int oh = Integer.parseInt(operational_hrs.getText());
    int Camountsalt = Integer.parseInt(Camount_of_salt.getText());
    int Cresin_cap = Integer.parseInt(Cresin_capacity.getText());
    double Cvolume = fr * oh * Camountsalt / (Cresin_cap * 1000);
    String Cvol = Double.toString(Math.round(Cvolume * 100.0D) / 100.0D);
    Cvolume_of_resin.setText(Cvol);
  }
  
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
  
  private JLabel jLabel43;
  private JLabel jLabel44;
  private JLabel jLabel45;
  private JLabel jLabel46;
  private JLabel jLabel47;
  private JLabel jLabel48;
  private JLabel jLabel49;
  private JLabel jLabel5;
  
  private void CD_diameterFocusGained(FocusEvent evt)
  {
    double Cvolume = Double.parseDouble(Cvolume_of_resin.getText());
    double CDdia = Math.sqrt(Cvolume * 4.0D / 3.14D);
    String CDdiameter = Double.toString(Math.round(CDdia * 100.0D) / 100.0D);
    CD_diameter.setText(CDdiameter);
  }
  
  private JLabel jLabel50;
  private JLabel jLabel51;
  private JLabel jLabel52;
  private JLabel jLabel53;
  private JLabel jLabel54;
  private JLabel jLabel55;
  private JLabel jLabel56;
  private JLabel jLabel57;
  
  private void AD_diameterFocusGained(FocusEvent evt)
  {
    double Avolume = Double.parseDouble(Avolume_of_resin.getText());
    double ADdia = Math.sqrt(Avolume * 4.0D / 3.14D);
    String ADdiameter = Double.toString(Math.round(ADdia * 100.0D) / 100.0D);
    AD_diameter.setText(ADdiameter);
  }
  
  private JLabel jLabel58;
  private JLabel jLabel59;
  private JLabel jLabel6;
  private JLabel jLabel60;
  private JLabel jLabel61;
  private JLabel jLabel62;
  private JLabel jLabel63;
  
  private void CD_weightFocusGained(FocusEvent evt)
  {
    double CDdiameter = Double.parseDouble(CD_diameter.getText());
    double CDheight = Double.parseDouble(CD_height.getText());
    double CDthickness = Double.parseDouble(CD_thickness.getText());
    double CDweight = 3.14D * CDdiameter * CDheight * CDthickness * 7.85D;
    String CDweight1 = Double.toString(Math.round(CDweight * 100.0D) / 100.0D);
    CD_weight.setText(CDweight1);
  }
  
  private JLabel jLabel64;
  private JLabel jLabel65;
  private JLabel jLabel66;
  private JLabel jLabel67;
  private JLabel jLabel68;
  private JLabel jLabel69;
  private JLabel jLabel7;
  private void AD_weightFocusGained(FocusEvent evt)
  {
    double ADdiameter = Double.parseDouble(AD_diameter.getText());
    double ADheight = Double.parseDouble(AD_height.getText());
    double ADthickness = Double.parseDouble(AD_thickness.getText());
    double ADweight = 3.14D * ADdiameter * ADheight * ADthickness * 7.85D;
    String ADweight1 = Double.toString(Math.round(ADweight * 100.0D) / 100.0D);
    AD_weight.setText(ADweight1);
  }
  
  private void CS_diameterFocusGained(FocusEvent evt)
  {
    double CDdiameter = Double.parseDouble(CD_diameter.getText());
    double CSdia = 1.3D * CDdiameter;
    String CSdiameter = Double.toString(Math.round(CSdia * 100.0D) / 100.0D);
    CS_diameter.setText(CSdiameter);
  }
  
  private void AS_diameterFocusGained(FocusEvent evt)
  {
    double ADdiameter = Double.parseDouble(AD_diameter.getText());
    double ASdia = 1.3D * ADdiameter;
    String ASdiameter = Double.toString(Math.round(ASdia * 100.0D) / 100.0D);
    AS_diameter.setText(ASdiameter);
  }
  
  private void CS_weightFocusGained(FocusEvent evt)
  {
    double CSdiameter = Double.parseDouble(CS_diameter.getText());
    double CSthickness = Double.parseDouble(CS_thickness.getText());
    double CSweight = 6.28D * CSdiameter * CSdiameter * CSthickness * 7.85D / 4.0D;
    String CSweight1 = Double.toString(Math.round(CSweight * 100.0D) / 100.0D);
    CS_weight.setText(CSweight1);
  }
  
  private void AS_weightFocusGained(FocusEvent evt)
  {
    double ASdiameter = Double.parseDouble(AS_diameter.getText());
    double ASthickness = Double.parseDouble(AS_thickness.getText());
    double ASweight = 6.28D * ASdiameter * ASdiameter * ASthickness * 7.85D / 4.0D;
    String ASweight1 = Double.toString(Math.round(ASweight * 100.0D) / 100.0D);
    AS_weight.setText(ASweight1);
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
  
  private void Arubber_lining_areaFocusGained(FocusEvent evt)
  {
    double ADdiameter = Double.parseDouble(AD_diameter.getText());
    double ADheight = Double.parseDouble(AD_height.getText());
    double ASdiameter = Double.parseDouble(AS_diameter.getText());
    double Arubber_lining = 3.14D * ADdiameter * ADheight + 6.28D * ASdiameter * ASdiameter / 4.0D;
    String Arubber_lining1 = Double.toString(Math.round(Arubber_lining * 100.0D) / 100.0D);
    Arubber_lining_area.setText(Arubber_lining1);
  }
  
  private void Cation_total_costFocusGained(FocusEvent evt)
  {
    double CDweight = Double.parseDouble(CD_weight.getText());
    double CSweight = Double.parseDouble(CS_weight.getText());
    double steel_cost = Double.parseDouble(steel_cost_kg.getText());
    double Cweight = CDweight + CSweight;
    double Cation_cost = Cweight * steel_cost;
    String Cation_cost1 = Double.toString(Math.round(Cation_cost * 100.0D) / 100.0D);
    Cation_total_cost.setText(Cation_cost1);
  }
  
  private void Anion_total_costFocusGained(FocusEvent evt)
  {
    double ADweight = Double.parseDouble(AD_weight.getText());
    double ASweight = Double.parseDouble(AS_weight.getText());
    double steel_cost = Double.parseDouble(steel_cost_kg.getText());
    double Aweight = ADweight + ASweight;
    double Anion_cost = Aweight * steel_cost;
    String Anion_cost1 = Double.toString(Math.round(Anion_cost * 100.0D) / 100.0D);
    Anion_total_cost.setText(Anion_cost1);
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
  
  private void total_rubber_lining_costFocusGained(FocusEvent evt)
  {
    double Crubber_lining = Double.parseDouble(Crubber_lining_area.getText());
    double Arubber_lining = Double.parseDouble(Arubber_lining_area.getText());
    double rubber_lining_cost = Double.parseDouble(rubber_lining_costm2.getText());
    double rubber_lining = (Crubber_lining + Arubber_lining) * rubber_lining_cost;
    String rubber_lining1 = Double.toString(Math.round(rubber_lining * 100.0D) / 100.0D);
    total_rubber_lining_cost.setText(rubber_lining1);
  }
  
  private void Sand_costFocusGained(FocusEvent evt)
  {
    double sand_wt = Double.parseDouble(Sand.getText());
    double sc_kg = Double.parseDouble(Sand_kg.getText());
    double Sandcost = sand_wt * sc_kg;
    String Sandcost1 = Double.toString(Math.round(Sandcost * 100.0D) / 100.0D);
    Sand_cost.setText(Sandcost1);
  }
  
  private void Gravel_costFocusGained(FocusEvent evt)
  {
    double Gravel_wt = Double.parseDouble(Gravel.getText());
    double gc_kg = Double.parseDouble(Gravel_kg.getText());
    double Gravelcost = Gravel_wt * gc_kg;
    String Gravelcost1 = Double.toString(Math.round(Gravelcost * 100.0D) / 100.0D);
    Gravel_cost.setText(Gravelcost1);
  }
  
  private void Pebbles_costFocusGained(FocusEvent evt)
  {
    double Pebble_wt = Double.parseDouble(Pebbles.getText());
    double pc_kg = Double.parseDouble(Pebbles_kg.getText());
    double Pebblecost = Pebble_wt * pc_kg;
    String Pebblecost1 = Double.toString(Math.round(Pebblecost * 100.0D) / 100.0D);
    Pebbles_cost.setText(Pebblecost1);
  }
  
  private void AC_costFocusGained(FocusEvent evt)
  {
    double AC_wt = Double.parseDouble(AC.getText());
    double ACcost_kg = Double.parseDouble(AC_kg.getText());
    double ACcost = AC_wt * ACcost_kg;
    String ACcost1 = Double.toString(Math.round(ACcost * 100.0D) / 100.0D);
    AC_cost.setText(ACcost1);
  }
  
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
  
  private void one_quantity_costFocusGained(FocusEvent evt)
  {
    double Cation_cost = Double.parseDouble(Cation_total_cost.getText());
    double Anion_cost = Double.parseDouble(Anion_total_cost.getText());
    double fab_cost = Double.parseDouble(fabrication_cost.getText());
    double rubber_lining_cost = Double.parseDouble(total_rubber_lining_cost.getText());
    double CR_cost = Double.parseDouble(cation_resin_cost.getText());
    double AR_cost = Double.parseDouble(anion_resin_cost.getText());
    double mediacost = Double.parseDouble(Media_cost.getText());
    double total_cost = Cation_cost + Anion_cost + fab_cost + rubber_lining_cost + mediacost + CR_cost + AR_cost;
    String total_cost1 = Double.toString(Math.round(total_cost * 100.0D) / 100.0D);
    one_quantity_cost.setText(total_cost1);
  }
  
  private void total_dm_costFocusGained(FocusEvent evt)
  {
    double q = Double.parseDouble(one_quantity_cost.getText());
    int qt = Integer.parseInt(qty.getText());
    double q1 = q * qt;
    String totalcost = Double.toString(q1);
    total_dm_cost.setText(totalcost);
  }
  
  private void BackActionPerformed(ActionEvent evt)
  {
    DataRetrival dr = new DataRetrival();
    dr.setVisible(true);
    setVisible(false);
  }
  
  private void EditActionPerformed(ActionEvent evt)
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
    } else if ("".equals(Cvolume_of_resin.getText())) {
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
    } else if ("".equals(Cation_total_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Cation Bed Cost");
    } else if ("".equals(Anion_total_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Anion Bed Cost");
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
        
        String query1 = "UPDATE `dm-info` SET `Type`=?,`Qty`=?,`Flow_rate`=?,`total_cost`=? WHERE Product_id=?;";
        PreparedStatement stmt1 = conn.prepareStatement(query1);
        
        stmt1.setString(1, String.valueOf(type.getSelectedItem()));
        stmt1.setInt(2, Integer.parseInt(qty.getText()));
        stmt1.setDouble(3, Double.parseDouble(flow_rate.getText()));
        stmt1.setDouble(4, Double.parseDouble(total_dm_cost.getText()));
        stmt1.setString(5, product_id.getText());
        stmt1.executeUpdate();
        
        String query2 = "UPDATE `cation-bed` SET `flow_rate`=?,`operational_hrs`?,`Camount_of_salt`=?,`Cresin_capacity`=?,`Cvolume_of_resin`=? WHERE Product_id=?;";
        PreparedStatement stmt2 = conn.prepareStatement(query2);
        
        stmt2.setDouble(1, Double.parseDouble(flow_rate.getText()));
        stmt2.setInt(2, Integer.parseInt(operational_hrs.getText()));
        stmt2.setInt(3, Integer.parseInt(Camount_of_salt.getText()));
        stmt2.setInt(4, Integer.parseInt(Cresin_capacity.getText()));
        stmt2.setDouble(5, Double.parseDouble(Cvolume_of_resin.getText()));
        stmt2.setString(6, product_id.getText());
        stmt2.executeUpdate();
        
        String query3 = "UPDATE `anion-bed` SET `flow_rate`=?,`operational_hrs`=?,`Aamount_of_salt`=?,`Aresin_capacity`=?,`Avolume_of_resin`=? WHERE Product_id=?;";
        PreparedStatement stmt3 = conn.prepareStatement(query3);
        
        stmt3.setDouble(1, Double.parseDouble(flow_rate.getText()));
        stmt3.setInt(2, Integer.parseInt(operational_hrs.getText()));
        stmt3.setInt(3, Integer.parseInt(Aamount_of_salt.getText()));
        stmt3.setInt(4, Integer.parseInt(Aresin_capacity.getText()));
        stmt3.setDouble(5, Double.parseDouble(Avolume_of_resin.getText()));
        stmt3.setString(6, product_id.getText());
        stmt3.executeUpdate();
        
        String query4 = "UPDATE `cation-drum` SET `Cresin_height`=?,`CD_height`=?,`CD_diameter`=?,`CD_thickness`=?,`CD_wt`=? WHERE Product_id=?;";
        PreparedStatement stmt4 = conn.prepareStatement(query4);
        
        stmt4.setDouble(1, Double.parseDouble(Cresin_height.getText()));
        stmt4.setDouble(2, Double.parseDouble(CD_height.getText()));
        stmt4.setDouble(3, Double.parseDouble(CD_diameter.getText()));
        stmt4.setDouble(4, Double.parseDouble(CD_thickness.getText()));
        stmt4.setDouble(5, Double.parseDouble(CD_weight.getText()));
        stmt4.setString(6, product_id.getText());
        stmt4.executeUpdate();
        
        String query5 = "UPDATE `cation-shell` SET `CS_diameter`=?,`CS_thickness`=?,`CS_wt`=? WHERE Product_id=?;";
        PreparedStatement stmt5 = conn.prepareStatement(query5);
        
        stmt5.setDouble(1, Double.parseDouble(CS_diameter.getText()));
        stmt5.setDouble(2, Double.parseDouble(CS_thickness.getText()));
        stmt5.setDouble(3, Double.parseDouble(CS_weight.getText()));
        stmt5.setString(4, product_id.getText());
        stmt5.executeUpdate();
        
        String query6 = "UPDATE `anion-drum` SET `Aresin_height`=?,`AD_height`=?,`AD_diameter`=?,`AD_thickness`=?,`AD_wt`=? WHERE Product_id=?;";
        PreparedStatement stmt6 = conn.prepareStatement(query6);
        
        stmt6.setDouble(1, Double.parseDouble(Aresin_height.getText()));
        stmt6.setDouble(2, Double.parseDouble(AD_height.getText()));
        stmt6.setDouble(3, Double.parseDouble(AD_diameter.getText()));
        stmt6.setDouble(4, Double.parseDouble(AD_thickness.getText()));
        stmt6.setDouble(5, Double.parseDouble(AD_weight.getText()));
        stmt6.setString(6, product_id.getText());
        stmt6.executeUpdate();
        
        String query7 = "UPDATE `anion-shell` SET `AS_diameter`=?,`AS_thickness`=?,`AS_wt`=? WHERE Product_id=?;";
        PreparedStatement stmt7 = conn.prepareStatement(query7);
        
        stmt7.setDouble(1, Double.parseDouble(AS_diameter.getText()));
        stmt7.setDouble(2, Double.parseDouble(AS_thickness.getText()));
        stmt7.setDouble(3, Double.parseDouble(AS_weight.getText()));
        stmt7.setString(4, product_id.getText());
        stmt7.executeUpdate();
        
        String query8 = "UPDATE `dm-cation&anion` SET `Crubber_lining_area`=?,`Arubber_lining_area`=?,`cost_steel_kg`=?,`cation_cost`=?,`anion_cost`=?,`cation_resin_litre`=?,`cation_resin_cost`=?,`anion_resin_litre`=?,`anion_resin_cost`=?,`fabrication_kg`=?,`fabrication_cost`=?,`rubber_lining`=?,`rubber_lining_cost`=? WHERE Product_id=?;";
        PreparedStatement stmt8 = conn.prepareStatement(query8);
        
        stmt8.setDouble(1, Double.parseDouble(Crubber_lining_area.getText()));
        stmt8.setDouble(2, Double.parseDouble(Arubber_lining_area.getText()));
        stmt8.setDouble(3, Double.parseDouble(steel_cost_kg.getText()));
        stmt8.setDouble(4, Double.parseDouble(Cation_total_cost.getText()));
        stmt8.setDouble(5, Double.parseDouble(Anion_total_cost.getText()));
        stmt8.setDouble(6, Double.parseDouble(cation_resin_litre.getText()));
        stmt8.setDouble(7, Double.parseDouble(cation_resin_cost.getText()));
        stmt8.setDouble(8, Double.parseDouble(anion_resin_litre.getText()));
        stmt8.setDouble(9, Double.parseDouble(anion_resin_cost.getText()));
        stmt8.setDouble(10, Double.parseDouble(fabrication_kg.getText()));
        stmt8.setDouble(11, Double.parseDouble(fabrication_cost.getText()));
        stmt8.setDouble(12, Double.parseDouble(rubber_lining_costm2.getText()));
        stmt8.setDouble(13, Double.parseDouble(total_rubber_lining_cost.getText()));
        stmt8.setString(14, product_id.getText());
        stmt8.executeUpdate();
        
        String query9 = "UPDATE `dm-filter-media` SET `sand`=?,`sand_kg`=?,`sand_cost`=?,`gravel`=?,`gravel_kg`=?,`gravel_cost`=?,`pebbles`=?,`pebbles_kg`=?,`pebbles_cost`=?,`ac`=?,`ac_kg`=?,`ac_cost`=?,`media_cost`=?,`one_quantity_cost`=? WHERE Product_id=?;";
        PreparedStatement stmt9 = conn.prepareStatement(query9);
        
        stmt9.setDouble(1, Double.parseDouble(Sand.getText()));
        stmt9.setDouble(2, Double.parseDouble(Sand_kg.getText()));
        stmt9.setDouble(3, Double.parseDouble(Sand_cost.getText()));
        stmt9.setDouble(4, Double.parseDouble(Gravel.getText()));
        stmt9.setDouble(5, Double.parseDouble(Gravel_kg.getText()));
        stmt9.setDouble(6, Double.parseDouble(Gravel_cost.getText()));
        stmt9.setDouble(7, Double.parseDouble(Pebbles.getText()));
        stmt9.setDouble(8, Double.parseDouble(Pebbles_kg.getText()));
        stmt9.setDouble(9, Double.parseDouble(Pebbles_cost.getText()));
        stmt9.setDouble(10, Double.parseDouble(AC.getText()));
        stmt9.setDouble(11, Double.parseDouble(AC_kg.getText()));
        stmt9.setDouble(12, Double.parseDouble(AC_cost.getText()));
        stmt9.setDouble(13, Double.parseDouble(Media_cost.getText()));
        stmt9.setDouble(14, Double.parseDouble(one_quantity_cost.getText()));
        stmt9.setString(15, product_id.getText());
        stmt9.executeUpdate();
        JOptionPane.showMessageDialog(null, "Updated the data successfully");
      }
      catch (ClassNotFoundException|SQLException e)
      {
        JOptionPane.showMessageDialog(null, "Error in connection" + e);
      }
    }
  }
  
  private void DeleteActionPerformed(ActionEvent evt)
  {
    int p = JOptionPane.showConfirmDialog(null, "Do ou really want to delete", "Delete", 0);
    if (p == 0) {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
        
        String query1 = "DELETE FROM `dm-info` WHERE Product_id=?;";
        PreparedStatement stmt1 = conn.prepareStatement(query1);
        stmt1.setString(1, product_id.getText());
        stmt1.executeUpdate();
        

        String query2 = "DELETE FROM `cation-bed` WHERE Product_id=?;";
        PreparedStatement stmt2 = conn.prepareStatement(query2);
        stmt2.setString(1, product_id.getText());
        stmt2.executeUpdate();
        

        String query3 = "DELETE FROM `cation-drum` WHERE Product_id=?;";
        PreparedStatement stmt3 = conn.prepareStatement(query3);
        stmt3.setString(1, product_id.getText());
        stmt3.executeUpdate();
        

        String query4 = "DELETE FROM `anion-drum` WHERE Product_id=?;";
        PreparedStatement stmt4 = conn.prepareStatement(query4);
        stmt4.setString(1, product_id.getText());
        stmt4.executeUpdate();
        

        String query5 = "DELETE FROM `cation-shell` WHERE Product_id=?;";
        PreparedStatement stmt5 = conn.prepareStatement(query5);
        stmt5.setString(1, product_id.getText());
        stmt5.executeUpdate();
        

        String query6 = "DELETE FROM `anion-shell` WHERE Product_id=?;";
        PreparedStatement stmt6 = conn.prepareStatement(query6);
        stmt6.setString(1, product_id.getText());
        stmt6.executeUpdate();
        

        String query7 = "DELETE FROM `dm-cation&anion` WHERE Product_id=?;";
        PreparedStatement stmt7 = conn.prepareStatement(query7);
        stmt7.setString(1, product_id.getText());
        stmt7.executeUpdate();
        

        String query8 = "DELETE FROM `dm-filter-media` WHERE Product_id=?;";
        PreparedStatement stmt8 = conn.prepareStatement(query8);
        stmt8.setString(1, product_id.getText());
        stmt8.executeUpdate();
        

        String query9 = "DELETE FROM `anion-bed` WHERE Product_id=?;";
        PreparedStatement stmt9 = conn.prepareStatement(query9);
        stmt9.setString(1, product_id.getText());
        stmt9.executeUpdate();
        JOptionPane.showMessageDialog(null, "Successfully deleted");
        setVisible(false);
      }
      catch (ClassNotFoundException|SQLException e)
      {
        JOptionPane.showMessageDialog(null, "Error in connection" + e);
      }
    }
  }
  private JLabel jLabel70;
  private JLabel jLabel71;
  private JLabel jLabel72;
  private JLabel jLabel73;
  private JLabel jLabel74;
  
  private void cation_resin_costFocusGained(FocusEvent evt)
  {
    double CR_cost = Double.parseDouble(cation_resin_litre.getText());
    double CR_volume = Double.parseDouble(Cvolume_of_resin.getText());
    double CRCost = CR_cost * CR_volume * 1000.0D;
    String CRCost1 = Double.toString(Math.round(CRCost * 100.0D) / 100.0D);
    cation_resin_cost.setText(CRCost1);
  }
  
  private JLabel jLabel75;
  
  private void anion_resin_costFocusGained(FocusEvent evt)
  {
    double AR_cost = Double.parseDouble(anion_resin_litre.getText());
    double AR_volume = Double.parseDouble(Avolume_of_resin.getText());
    double ARCost = AR_cost * AR_volume * 1000.0D;
    String ARCost1 = Double.toString(Math.round(ARCost * 100.0D) / 100.0D);
    anion_resin_cost.setText(ARCost1);
  }
  
  private JLabel jLabel76;
  private JLabel jLabel77;
  private JLabel jLabel78;
  private JLabel jLabel79;
  private JLabel jLabel8;
  
  private void display(String input)
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
      String query = "SELECT * FROM `dm-info` WHERE Product_id=?";
      PreparedStatement ps = conn.prepareStatement(query);
      ps.setString(1, input);
      
      ResultSet rs = ps.executeQuery();
      while (rs.next())
      {
        company_name.setText(rs.getString("Company_name"));
        product_id.setText(rs.getString("Product_id"));
        date.setText(rs.getString("date"));
        type.setSelectedItem(rs.getString("type"));
        qty.setText(rs.getString("Qty"));
        flow_rate.setText(rs.getString("Flow_rate"));
        total_dm_cost.setText(rs.getString("total_cost"));
      }
      
      String query1 = "SELECT * FROM `cation-bed` WHERE Product_id=?";
      ps = conn.prepareStatement(query1);
      ps.setString(1, input);
      
      ResultSet rs1 = ps.executeQuery();
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
      ResultSet rs2 = ps.executeQuery();
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
      ResultSet rs3 = ps.executeQuery();
      while (rs3.next())
      {
        CS_diameter.setText(rs3.getString("CS_diameter"));
        CS_thickness.setText(rs3.getString("CS_thickness"));
        CS_weight.setText(rs3.getString("CS_wt"));
      }
      

      String query4 = "SELECT * FROM `anion-bed` WHERE Product_id=?";
      ps = conn.prepareStatement(query4);
      ps.setString(1, input);
      ResultSet rs4 = ps.executeQuery();
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
      ResultSet rs5 = ps.executeQuery();
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
      ResultSet rs6 = ps.executeQuery();
      while (rs6.next())
      {
        AS_diameter.setText(rs6.getString("AS_diameter"));
        AS_thickness.setText(rs6.getString("AS_thickness"));
        AS_weight.setText(rs6.getString("AS_wt"));
      }
      
      String query7 = "SELECT * FROM `dm-cation&anion` WHERE Product_id=?";
      ps = conn.prepareStatement(query7);
      ps.setString(1, input);
      ResultSet rs7 = ps.executeQuery();
      while (rs7.next())
      {
        Crubber_lining_area.setText(rs7.getString("Crubber_lining_area"));
        Arubber_lining_area.setText(rs7.getString("Arubber_lining_area"));
        steel_cost_kg.setText(rs7.getString("cost_steel_kg"));
        Cation_total_cost.setText(rs7.getString("cation_cost"));
        Anion_total_cost.setText(rs7.getString("anion_cost"));
        rubber_lining_costm2.setText(rs7.getString("rubber_lining"));
        total_rubber_lining_cost.setText(rs7.getString("rubber_lining_cost"));
        fabrication_cost.setText(rs7.getString("fabrication_cost"));
      }
      
      String query8 = "SELECT * FROM `dm-filter-media` WHERE Product_id=?";
      ps = conn.prepareStatement(query8);
      ps.setString(1, input);
      ResultSet rs8 = ps.executeQuery();
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
    catch (ClassNotFoundException|SQLException e)
    {
      JOptionPane.showMessageDialog(null, "Error in connection" + e);
    }
  }
  
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
      Logger.getLogger(DMedit.class.getName()).log(Level.SEVERE, null, ex);
    }
    


    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new DMedit("kl001").setVisible(true);
      }
    });
  }
  
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
