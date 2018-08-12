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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
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

public class Pressure_filter
  extends JFrame
{
  private JButton Back;
  private JTextField Construction_cost;
  private JTextField Shell_weight;
  private JTextField Steel_cost;
  private JTextField ac_cost;
  private JTextField ac_cost_kg;
  private JTextField ac_wt;
  private JTextField anthracite_cost;
  private JTextField anthracite_cost_kg;
  private JTextField anthracite_wt;
  private JTextField carbon_steel_cost;
  private JTextField carbon_steel_percent;
  private JTextField carbon_steel_perkg;
  private JTextField company_name;
  private JTextField date;
  private JTextField diameter;
  private JTextField drum_weight;
  private JButton enter;
  private JTextField flow_rate;
  private JTextField fm_cost;
  private JTextField gravel_cost;
  private JTextField gravel_cost_kg;
  private JTextField gravel_wt;
  private JTextField height;
  private JLabel jLabel1;
  private JLabel jLabel10;
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
  
  public Pressure_filter()
  {
    initComponents();
  }
  
  private JLabel jLabel20;
  private JLabel jLabel21;
  private JLabel jLabel22;
  private JLabel jLabel23;
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
  private JLabel jLabel33;
  private JLabel jLabel34;
  private JLabel jLabel35;
  private JLabel jLabel36;
  private JLabel jLabel37;
  
  private void initComponents()
  {
    jScrollPane1 = new JScrollPane();
    jPanel1 = new JPanel();
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    p_id = new JTextField();
    jLabel3 = new JLabel();
    company_name = new JTextField();
    jLabel4 = new JLabel();
    flow_rate = new JTextField();
    jLabel5 = new JLabel();
    date = new JTextField();
    jLabel6 = new JLabel();
    jLabel7 = new JLabel();
    total_weight = new JTextField();
    jLabel12 = new JLabel();
    carbon_steel_percent = new JTextField();
    jLabel13 = new JLabel();
    carbon_steel_perkg = new JTextField();
    jLabel14 = new JLabel();
    carbon_steel_cost = new JTextField();
    jLabel15 = new JLabel();
    stainless_steel_percent = new JTextField();
    jLabel16 = new JLabel();
    ss_perkg = new JTextField();
    jLabel17 = new JLabel();
    ss_cost = new JTextField();
    jLabel18 = new JLabel();
    moc_cost = new JTextField();
    jLabel19 = new JLabel();
    jLabel11 = new JLabel();
    diameter = new JTextField();
    jLabel20 = new JLabel();
    height = new JTextField();
    jLabel21 = new JLabel();
    thickness = new JTextField();
    jLabel22 = new JLabel();
    drum_weight = new JTextField();
    jLabel23 = new JLabel();
    jLabel24 = new JLabel();
    sand_wt = new JTextField();
    jLabel25 = new JLabel();
    sand_cost_kg = new JTextField();
    jLabel26 = new JLabel();
    sand_cost = new JTextField();
    jLabel27 = new JLabel();
    ac_wt = new JTextField();
    jLabel28 = new JLabel();
    ac_cost_kg = new JTextField();
    jLabel29 = new JLabel();
    ac_cost = new JTextField();
    jLabel30 = new JLabel();
    anthracite_wt = new JTextField();
    jLabel31 = new JLabel();
    anthracite_cost_kg = new JTextField();
    jLabel32 = new JLabel();
    anthracite_cost = new JTextField();
    jLabel33 = new JLabel();
    fm_cost = new JTextField();
    jLabel34 = new JLabel();
    total_cost = new JTextField();
    enter = new JButton();
    jLabel35 = new JLabel();
    jLabel36 = new JLabel();
    shell_thickness = new JTextField();
    jLabel37 = new JLabel();
    jLabel38 = new JLabel();
    jLabel39 = new JLabel();
    jLabel40 = new JLabel();
    jLabel41 = new JLabel();
    jLabel42 = new JLabel();
    gravel_wt = new JTextField();
    gravel_cost_kg = new JTextField();
    gravel_cost = new JTextField();
    pebbles_wt = new JTextField();
    pebbles_cost_kg = new JTextField();
    pebbles_cost = new JTextField();
    jLabel43 = new JLabel();
    qty = new JTextField();
    jLabel44 = new JLabel();
    one_quantity_cost = new JTextField();
    jLabel45 = new JLabel();
    msc_type = new JTextField();
    Back = new JButton();
    jLabel46 = new JLabel();
    shell_diameter = new JTextField();
    jLabel47 = new JLabel();
    Shell_weight = new JTextField();
    jLabel48 = new JLabel();
    pf_type = new JTextField();
    jLabel8 = new JLabel();
    jLabel9 = new JLabel();
    Steel_cost = new JTextField();
    Construction_cost = new JTextField();
    jLabel10 = new JLabel();
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
    
    jScrollPane1.setHorizontalScrollBarPolicy(32);
    jScrollPane1.setVerticalScrollBarPolicy(22);
    jScrollPane1.setPreferredSize(new Dimension(500, 1202));
    
    jPanel1.setPreferredSize(new Dimension(500, 2600));
    
    jLabel1.setFont(new Font("Times New Roman", 0, 18));
    jLabel1.setText("   FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setText("PRODUCT_ID");
    
    jLabel3.setText("COMPANY NAME");
    
    jLabel4.setText("FLOW RATE");
    
    jLabel5.setText("DATE ");
    
    jLabel6.setFont(new Font("Times New Roman", 0, 14));
    jLabel6.setText("MATERIAL OF CONSTRUCTION");
    
    jLabel7.setText("TOATAL WEIGHT");
    
    total_weight.setText("0");
    
    jLabel12.setText("CARBON STEEL %");
    
    carbon_steel_percent.setText("0");
    
    jLabel13.setText("CARBON STEEL COST/KG");
    
    jLabel14.setText("CARBON STEEL COST");
    
    carbon_steel_cost.setText("0");
    carbon_steel_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.carbon_steel_costFocusGained(evt);
      }
      
    });
    jLabel15.setText("STAINLESS STEEL %");
    
    stainless_steel_percent.setText("0");
    stainless_steel_percent.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.stainless_steel_percentFocusGained(evt);
      }
      
    });
    jLabel16.setText("STAINLESS STEEL COST/KG");
    
    jLabel17.setText("STAINLESS STEEL COST");
    
    ss_cost.setText("0");
    ss_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.ss_costFocusGained(evt);
      }
      
    });
    jLabel18.setText("TOTAL CONSTRUCTION COST");
    
    moc_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.moc_costFocusGained(evt);
      }
      
    });
    jLabel19.setFont(new Font("Times New Roman", 0, 14));
    jLabel19.setText("SIZE OF FILTER");
    
    jLabel11.setText("DRUM DIAMETER");
    
    jLabel20.setText("DRUM HEIGHT");
    
    jLabel21.setText("DRUM THICKNESS");
    
    jLabel22.setText("WEIGHT OF DRUM");
    
    drum_weight.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.drum_weightFocusGained(evt);
      }
      
    });
    jLabel23.setFont(new Font("Times New Roman", 0, 14));
    jLabel23.setText("FILTER MEDIA");
    
    jLabel24.setText("SAND WT");
    
    jLabel25.setText("SAND COST/KG");
    
    jLabel26.setText("TOTAL SAND COST");
    
    sand_cost.setText("0");
    sand_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.sand_costFocusGained(evt);
      }
      
    });
    jLabel27.setText("AC WT");
    
    jLabel28.setText("AC COST/KG");
    
    jLabel29.setText("TOTAL AC COST");
    
    ac_cost.setText("0");
    ac_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.ac_costFocusGained(evt);
      }
      
    });
    jLabel30.setText("ANTHRACITE WT");
    
    jLabel31.setText("ANTHRACITE COST/KG");
    
    jLabel32.setText("TOTAL ANTHRACITE COST");
    
    anthracite_cost.setText("0");
    anthracite_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.anthracite_costFocusGained(evt);
      }
      
    });
    jLabel33.setText("FILTER MEDIUM COST");
    
    fm_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.fm_costFocusGained(evt);
      }
      
    });
    jLabel34.setText("TOTAL COST");
    
    total_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.total_costFocusGained(evt);
      }
      
    });
    enter.setText("ENTER");
    enter.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Pressure_filter.this.enterActionPerformed(evt);
      }
      
    });
    jLabel35.setFont(new Font("Times New Roman", 0, 14));
    jLabel35.setText("PRESSURE FILTER");
    
    jLabel36.setText("SHELL THICKNESS");
    
    jLabel37.setText("GRAVEL WT");
    
    jLabel38.setText("GRAVEL COST/KG");
    
    jLabel39.setText("TOTAL GRAVEL COST");
    
    jLabel40.setText("PEBBLES WT");
    
    jLabel41.setText("PEBBLES COST/KG");
    
    jLabel42.setText("TOTAL PEBBLES COST ");
    
    gravel_cost.setText("0");
    gravel_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.gravel_costFocusGained(evt);
      }
      
    });
    pebbles_cost.setText("0");
    pebbles_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.pebbles_costFocusGained(evt);
      }
      
    });
    jLabel43.setText("QUANTITY");
    
    qty.setText("1");
    
    jLabel44.setText("COST OF ONE QUANTITY ");
    
    one_quantity_cost.setText("0");
    one_quantity_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.one_quantity_costFocusGained(evt);
      }
      
    });
    jLabel45.setText("MSC TYPE");
    
    Back.setText("Back");
    Back.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Pressure_filter.this.BackActionPerformed(evt);
      }
      
    });
    jLabel46.setText("SHELL DIAMETER");
    
    shell_diameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.shell_diameterFocusGained(evt);
      }
      
    });
    jLabel47.setText("WEIGHT OF SHELL");
    
    Shell_weight.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.Shell_weightFocusGained(evt);
      }
      
    });
    jLabel48.setText("TYPE");
    
    jLabel8.setText("COST OF STEEL");
    
    jLabel9.setText("COST OF CONSTRUCTION");
    
    Construction_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Pressure_filter.this.Construction_costFocusGained(evt);
      }
      
    });
    jLabel10.setText("cubic m/hr");
    
    jLabel49.setText("kg");
    
    jLabel50.setText("Rs");
    
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
    
    jLabel64.setText("kg");
    
    jLabel65.setText("Rs");
    
    jLabel66.setText("Rs");
    
    jLabel67.setText("Rs");
    
    jLabel68.setText("kg");
    
    jLabel69.setText("Rs");
    
    jLabel70.setText("kg");
    
    jLabel71.setText("Rs");
    
    jLabel72.setText("Rs");
    
    jLabel73.setText("kg");
    
    jLabel74.setText("Rs");
    
    jLabel75.setText("Rs");
    
    jLabel76.setText("kg");
    
    jLabel77.setText("Rs");
    
    jLabel78.setText("Rs");
    
    jLabel79.setText("Rs");
    
    jLabel80.setText("Rs");
    
    jLabel81.setText("Rs");
    
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(88, 88, 88).addComponent(jLabel19)).addGroup(jPanel1Layout.createSequentialGroup().addGap(90, 90, 90).addComponent(jLabel23)).addComponent(jLabel1, -2, 320, -2).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(7, 7, 7).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(jLabel12, -1, 165, 32767).addComponent(jLabel7, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(total_weight, -2, 70, -2).addComponent(carbon_steel_percent, -2, 70, -2))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel13, -2, 152, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel50)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel14, -2, 152, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel51)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel15, -2, 142, -2).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel16, -2, 165, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel52)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel17).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel53)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel18).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel54))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(carbon_steel_perkg, -2, 70, -2).addComponent(carbon_steel_cost, -2, 70, -2).addComponent(stainless_steel_percent, -2, 70, -2).addComponent(ss_perkg, -2, 70, -2).addComponent(ss_cost, -2, 70, -2).addComponent(moc_cost, -2, 70, -2))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel45).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(msc_type, -2, 70, -2)))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel33, -2, 134, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel79)).addGroup(jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(jLabel44).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel80))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(fm_cost, GroupLayout.Alignment.TRAILING, -2, 72, -2).addComponent(one_quantity_cost, GroupLayout.Alignment.TRAILING, -2, 72, -2))).addComponent(jLabel6, -2, 212, -2).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(jLabel5, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel4, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel2, GroupLayout.Alignment.LEADING, -2, 80, -2).addComponent(jLabel3)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(jLabel35).addComponent(p_id).addComponent(flow_rate).addComponent(date, -1, 143, 32767).addComponent(company_name, -1, 143, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel10)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel24).addComponent(jLabel20).addComponent(jLabel21).addComponent(jLabel22).addComponent(jLabel36).addComponent(jLabel46).addComponent(jLabel11, -2, 98, -2).addComponent(jLabel25).addComponent(jLabel26).addComponent(jLabel27).addComponent(jLabel28).addComponent(jLabel29).addComponent(jLabel30).addComponent(jLabel31).addComponent(jLabel32).addComponent(jLabel37).addComponent(jLabel38).addComponent(jLabel39).addComponent(jLabel40).addComponent(jLabel41).addComponent(jLabel42).addComponent(Back, -2, 81, -2).addComponent(jLabel8).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(jLabel9, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel47, GroupLayout.Alignment.LEADING, -1, -1, 32767))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel34).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel81).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(total_cost, -2, 72, -2)).addComponent(enter, GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel62).addComponent(jLabel63).addComponent(jLabel65).addComponent(jLabel66).addComponent(jLabel67).addComponent(jLabel69).addComponent(jLabel71).addComponent(jLabel72).addComponent(jLabel74).addComponent(jLabel75).addComponent(jLabel77).addComponent(jLabel78)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(drum_weight, GroupLayout.Alignment.LEADING, -1, 72, 32767).addComponent(diameter, GroupLayout.Alignment.LEADING).addComponent(height, GroupLayout.Alignment.LEADING).addComponent(thickness, GroupLayout.Alignment.LEADING).addComponent(sand_wt, GroupLayout.Alignment.LEADING).addComponent(sand_cost_kg, GroupLayout.Alignment.LEADING).addComponent(sand_cost, GroupLayout.Alignment.LEADING).addComponent(ac_wt, GroupLayout.Alignment.LEADING).addComponent(ac_cost_kg, GroupLayout.Alignment.LEADING).addComponent(ac_cost, GroupLayout.Alignment.LEADING).addComponent(anthracite_wt, GroupLayout.Alignment.LEADING).addComponent(anthracite_cost_kg, GroupLayout.Alignment.LEADING).addComponent(anthracite_cost, GroupLayout.Alignment.LEADING, -1, 72, 32767).addComponent(shell_thickness, GroupLayout.Alignment.LEADING).addComponent(gravel_wt, GroupLayout.Alignment.LEADING).addComponent(gravel_cost_kg, GroupLayout.Alignment.LEADING).addComponent(gravel_cost, GroupLayout.Alignment.LEADING).addComponent(pebbles_wt, GroupLayout.Alignment.LEADING).addComponent(pebbles_cost_kg, GroupLayout.Alignment.LEADING).addComponent(pebbles_cost, GroupLayout.Alignment.LEADING).addComponent(shell_diameter, GroupLayout.Alignment.LEADING).addComponent(Shell_weight).addComponent(Steel_cost).addComponent(Construction_cost)).addGap(1, 1, 1))))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel49).addComponent(jLabel55).addComponent(jLabel56).addComponent(jLabel57).addComponent(jLabel58).addComponent(jLabel59).addComponent(jLabel60).addComponent(jLabel61).addComponent(jLabel64).addComponent(jLabel68).addComponent(jLabel70).addComponent(jLabel73).addComponent(jLabel76))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel43, -2, 80, -2).addComponent(jLabel48)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(qty, -1, 143, 32767).addComponent(pf_type)))).addContainerGap(170, 32767)));
    




































































































































































































    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, -2, 38, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel35).addGap(38, 38, 38).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(company_name, -2, -1, -2).addComponent(jLabel3)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(p_id, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel48).addComponent(pf_type, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel43).addComponent(qty, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(date, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(flow_rate, -2, -1, -2).addComponent(jLabel10)).addGap(27, 27, 27).addComponent(jLabel6).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel45).addComponent(msc_type, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(total_weight, -2, -1, -2).addComponent(jLabel49)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel12).addComponent(carbon_steel_percent, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(carbon_steel_perkg, -2, -1, -2).addComponent(jLabel50)).addGap(8, 8, 8).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel14).addComponent(carbon_steel_cost, -2, -1, -2).addComponent(jLabel51)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel15).addComponent(stainless_steel_percent, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(ss_perkg, -2, -1, -2).addComponent(jLabel52)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(ss_cost, -2, -1, -2).addComponent(jLabel53)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel18).addComponent(moc_cost, -2, -1, -2).addComponent(jLabel54)).addGap(18, 18, 18).addComponent(jLabel19).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(diameter, -2, -1, -2).addComponent(jLabel55)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel20).addComponent(height, -2, -1, -2).addComponent(jLabel56)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel21).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(thickness, -2, -1, -2).addComponent(jLabel57))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(drum_weight, -2, -1, -2).addComponent(jLabel58)).addComponent(jLabel22)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel46).addComponent(shell_diameter, -2, -1, -2).addComponent(jLabel59)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel36, GroupLayout.Alignment.TRAILING, -2, 18, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(shell_thickness, -2, -1, -2).addComponent(jLabel60))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel47).addComponent(Shell_weight, -2, -1, -2).addComponent(jLabel61)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(Steel_cost, -2, -1, -2).addComponent(jLabel62)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(Construction_cost, -2, -1, -2).addComponent(jLabel63)).addGap(15, 15, 15).addComponent(jLabel23).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(sand_wt, -2, -1, -2).addComponent(jLabel24).addComponent(jLabel64)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel25).addComponent(sand_cost_kg, -2, -1, -2).addComponent(jLabel65)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel26).addComponent(sand_cost, -2, -1, -2).addComponent(jLabel66)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel37).addComponent(gravel_wt, -2, -1, -2).addComponent(jLabel68)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel38).addComponent(gravel_cost_kg, -2, -1, -2).addComponent(jLabel67)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel39).addComponent(gravel_cost, -2, -1, -2).addComponent(jLabel69)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel40).addComponent(pebbles_wt, -2, -1, -2).addComponent(jLabel70)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel41).addComponent(pebbles_cost_kg, -2, -1, -2).addComponent(jLabel71)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel42).addComponent(pebbles_cost, -2, -1, -2).addComponent(jLabel72)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel27).addComponent(ac_wt, -2, -1, -2).addComponent(jLabel73)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel28).addComponent(ac_cost_kg, -2, -1, -2).addComponent(jLabel74)).addGap(8, 8, 8).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel29).addComponent(ac_cost, -2, -1, -2).addComponent(jLabel75)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel30).addComponent(anthracite_wt, -2, -1, -2).addComponent(jLabel76)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel31).addComponent(anthracite_cost_kg, -2, -1, -2).addComponent(jLabel77)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel32).addComponent(anthracite_cost, -2, -1, -2).addComponent(jLabel78)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel33).addComponent(fm_cost, -2, -1, -2).addComponent(jLabel79)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel44).addComponent(one_quantity_cost, -2, -1, -2).addComponent(jLabel80)).addGap(13, 13, 13).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel34).addComponent(total_cost, -2, -1, -2).addComponent(jLabel81)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(enter).addComponent(Back)).addContainerGap(1219, 32767)));
    































































































































































































































    jScrollPane1.setViewportView(jPanel1);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(47, 32767).addComponent(jScrollPane1, -1, -1, -2).addContainerGap()));
    





    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jScrollPane1, -2, 1467, -2).addGap(0, 48, 32767)));
    





    pack();
  }
  
  private JLabel jLabel38;
  private JLabel jLabel39;
  private JLabel jLabel4;
  private JLabel jLabel40;
  
  private void BackActionPerformed(ActionEvent evt)
  {
    Homepage h = new Homepage();
    h.setVisible(true);
    setVisible(false);
  }
  
  private JLabel jLabel41;
  private JLabel jLabel42;
  private JLabel jLabel43;
  private JLabel jLabel44;
  
  private void one_quantity_costFocusGained(FocusEvent evt)
  {
    double moc = Double.parseDouble(moc_cost.getText());
    double a = Double.parseDouble(drum_weight.getText());
    double fm = Double.parseDouble(fm_cost.getText());
    double con = Double.parseDouble(moc_cost.getText());
    double oq = moc + a + fm + moc;
    String oq_cost = Double.toString(oq);
    one_quantity_cost.setText(oq_cost);
  }
  
  private JLabel jLabel45;
  private JLabel jLabel46;
  private JLabel jLabel47;
  private JLabel jLabel48;
  private JLabel jLabel49;
  
  private void pebbles_costFocusGained(FocusEvent evt)
  {
    double p_wt = Double.parseDouble(pebbles_wt.getText());
    double p_kg = Double.parseDouble(pebbles_cost_kg.getText());
    double tpebbles = p_wt * p_kg;
    String pebbles = Double.toString(tpebbles);
    pebbles_cost.setText(pebbles);
  }
  
  private JLabel jLabel5;
  private JLabel jLabel50;
  private JLabel jLabel51;
  
  private void gravel_costFocusGained(FocusEvent evt)
  {
    double g_wt = Double.parseDouble(gravel_wt.getText());
    double g_kg = Double.parseDouble(gravel_cost_kg.getText());
    double tgravel = g_wt * g_kg;
    String gravel = Double.toString(tgravel);
    gravel_cost.setText(gravel);
  }
  
  private JLabel jLabel52;
  private JLabel jLabel53;
  private JLabel jLabel54;
  private JLabel jLabel55;
  private JLabel jLabel56;
  private JLabel jLabel57;
  
  private void enterActionPerformed(ActionEvent evt)
  {
    if ("".equals(p_id.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Product ID");
    } else if ("".equals(company_name.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Compant Name");
    } else if ("".equals(pf_type.getText())) {
      JOptionPane.showMessageDialog(null, "enter the name of filter");
    } else if ("".equals(qty.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Quantity");
    } else if ("".equals(flow_rate.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Flow Rate");
    } else if ("".equals(date.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Date");
    } else if ("".equals(msc_type.getText())) {
      JOptionPane.showMessageDialog(null, "enter the MSC Type");
    } else if ("".equals(total_weight.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Total Weight");
    } else if ("".equals(carbon_steel_percent.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Carbon Steel %");
    } else if ("".equals(carbon_steel_perkg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Carbon Steel Cost/kg");
    } else if ("".equals(carbon_steel_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Carbon Steel Cost");
    } else if ("".equals(stainless_steel_percent.getText())) {
      JOptionPane.showMessageDialog(null, "enter the SS %");
    } else if ("".equals(ss_perkg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the SS kg");
    } else if ("".equals(ss_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the SS Cost");
    } else if ("".equals(diameter.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Diameter");
    } else if ("".equals(height.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Height");
    } else if ("".equals(thickness.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Drum Thickness");
    } else if ("".equals(shell_thickness.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Shell Thickness");
    } else if ("".equals(drum_weight.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Drum Weight");
    } else if ("".equals(shell_diameter.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Shell Diameter");
    } else if ("".equals(Shell_weight.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Shell Weight");
    } else if ("".equals(Construction_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cost of Construction");
    } else if ("".equals(sand_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Sand Weight");
    } else if ("".equals(sand_cost_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Sand Cost/kg");
    } else if ("".equals(sand_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Total Sand Cost");
    } else if ("".equals(gravel_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Gravel Weight");
    } else if ("".equals(gravel_cost_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Gravel Cost/kg");
    } else if ("".equals(gravel_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Total Gravel Cost");
    } else if ("".equals(pebbles_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Pebbles Weight");
    } else if ("".equals(pebbles_cost_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Pebbles Cost/kg");
    } else if ("".equals(pebbles_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Total Pebbles Cost");
    } else if ("".equals(ac_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Activated Carbon Weight");
    } else if ("".equals(ac_cost_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Activated Carbon  Cost/kg");
    } else if ("".equals(ac_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the TotalActivated Carbon Cost");
    } else if ("".equals(anthracite_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Anthracite Weight");
    } else if ("".equals(anthracite_cost_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Anthracite Cost/kg");
    } else if ("".equals(anthracite_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Total Anthracite Cost");
    } else if ("".equals(fm_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Filter Media Cost");
    } else if ("".equals(one_quantity_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cost of One Quantity");
    } else if ("".equals(total_cost.getText()))
    {
      JOptionPane.showMessageDialog(null, "enter the Total Cost");
    }
    else
    {
      String product_id = p_id.getText();
      String companyname = company_name.getText();
      double flowrate = Double.parseDouble(flow_rate.getText());
      String date1 = date.getText();
      

      double gravelwt = Double.parseDouble(gravel_wt.getText());
      double gravelkg = Double.parseDouble(gravel_cost_kg.getText());
      double gravelcost = Double.parseDouble(gravel_cost.getText());
      double pebbleswt = Double.parseDouble(pebbles_wt.getText());
      double pebbleskg = Double.parseDouble(pebbles_cost_kg.getText());
      double pebblescost = Double.parseDouble(pebbles_cost.getText());
      double one_qty = Double.parseDouble(one_quantity_cost.getText());
      double totalweight = Double.parseDouble(total_weight.getText());
      double carbonsteel = Double.parseDouble(carbon_steel_percent.getText());
      double carbonsteelkg = Double.parseDouble(carbon_steel_perkg.getText());
      double carbonsteelcost = Double.parseDouble(carbon_steel_cost.getText());
      double stainlesssteel = Double.parseDouble(stainless_steel_percent.getText());
      double sskg = Double.parseDouble(ss_perkg.getText());
      double sscost = Double.parseDouble(ss_cost.getText());
      double moccost = Double.parseDouble(moc_cost.getText());
      double d = Double.parseDouble(diameter.getText());
      double h = Double.parseDouble(height.getText());
      double t = Double.parseDouble(thickness.getText());
      double st = Double.parseDouble(shell_thickness.getText());
      double wt1 = Double.parseDouble(drum_weight.getText());
      double sandwt = Double.parseDouble(sand_wt.getText());
      double sandcostkg = Double.parseDouble(sand_cost_kg.getText());
      double sandcost = Double.parseDouble(sand_cost.getText());
      double acwt = Double.parseDouble(ac_wt.getText());
      double accostkg = Double.parseDouble(ac_cost_kg.getText());
      double accost = Double.parseDouble(ac_cost.getText());
      double anthrawt = Double.parseDouble(anthracite_wt.getText());
      double anthracostkg = Double.parseDouble(anthracite_cost_kg.getText());
      double anthracost = Double.parseDouble(anthracite_cost.getText());
      double fmcost = Double.parseDouble(fm_cost.getText());
      double totalcost = Double.parseDouble(total_cost.getText());
      int quantity = Integer.parseInt(qty.getText());
      String msc = msc_type.getText();
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
        
        String query1 = "INSERT INTO `pf_info`(`Company_name`, `Product_id`, `TYPE`, `date`, `Qty`, `Flow_rate`, `total_cost`) VALUES (?,?,?,?,?,?,?);";
        PreparedStatement stmt1 = conn.prepareStatement(query1);
        
        stmt1.setString(1, companyname);
        stmt1.setString(2, product_id);
        stmt1.setString(3, pf_type.getText());
        stmt1.setString(4, date1);
        stmt1.setInt(5, quantity);
        stmt1.setDouble(6, flowrate);
        stmt1.setDouble(7, totalcost);
        int x = stmt1.executeUpdate();
        
        String query2 = "INSERT INTO `moc`(`Product_id`, `msc_type`, `total_wt`, `cs_percent`, `cs_kg`, `cs_cost`, `ss_percent`, `ss_kg`, `ss_cost`, `moc_cost`) VALUES (?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement stmt2 = conn.prepareStatement(query2);
        stmt2.setString(1, product_id);
        stmt2.setString(2, msc);
        stmt2.setDouble(3, totalweight);
        stmt2.setDouble(4, carbonsteel);
        stmt2.setDouble(5, carbonsteelkg);
        stmt2.setDouble(6, carbonsteelcost);
        stmt2.setDouble(7, stainlesssteel);
        stmt2.setDouble(8, sskg);
        stmt2.setDouble(9, sscost);
        stmt2.setDouble(10, moccost);
        stmt2.executeUpdate();
        
        String query3 = "INSERT INTO `filter_size`(`Product_id`, `diameter`, `height`, `drum_thickness`, `DRUM_WT`, `SHELL_DIAMETER`, `shell_thickness`, `SHELL_WT`, `STEEL_COST`, `area`) VALUES (?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement stmt3 = conn.prepareStatement(query3);
        stmt3.setString(1, product_id);
        stmt3.setDouble(2, d);
        stmt3.setDouble(3, h);
        stmt3.setDouble(4, t);
        stmt3.setDouble(5, wt1);
        stmt3.setDouble(6, Double.parseDouble(shell_diameter.getText()));
        stmt3.setDouble(7, st);
        stmt3.setDouble(8, Double.parseDouble(Shell_weight.getText()));
        stmt3.setDouble(9, Double.parseDouble(Steel_cost.getText()));
        stmt3.setDouble(10, Double.parseDouble(Construction_cost.getText()));
        stmt3.executeUpdate();
        
        String query4 = "INSERT INTO `pf-filter-media`(`Product_id`, `sand_wt`, `sand_kg`, `sand_cost`, `gravel_wt`, `gravel_kg`, `gravel_cost`, `pebbles_wt`, `pebbles_kg`, `pebbles_cost`, `ac_wt`, `ac_kg`, `ac_cost`, `anthracite_wt`, `anthracite_kg`, `anthracite_cost`, `fm_cost`, `one_qty_cost`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement stmt4 = conn.prepareStatement(query4);
        stmt4.setString(1, product_id);
        stmt4.setDouble(2, sandwt);
        stmt4.setDouble(3, sandcostkg);
        stmt4.setDouble(4, sandcost);
        stmt4.setDouble(5, acwt);
        stmt4.setDouble(6, accostkg);
        stmt4.setDouble(7, accost);
        stmt4.setDouble(8, gravelwt);
        stmt4.setDouble(9, gravelkg);
        stmt4.setDouble(10, gravelcost);
        stmt4.setDouble(11, pebbleswt);
        stmt4.setDouble(12, pebbleskg);
        stmt4.setDouble(13, pebblescost);
        stmt4.setDouble(14, anthrawt);
        stmt4.setDouble(15, anthracostkg);
        stmt4.setDouble(16, anthracost);
        stmt4.setDouble(17, fmcost);
        stmt4.setDouble(18, one_qty);
        stmt4.executeUpdate();
        JOptionPane.showMessageDialog(null, "Entered Successfully");
      }
      catch (ClassNotFoundException|SQLException e)
      {
        JOptionPane.showMessageDialog(null, "Error in connection" + e);
      }
    }
  }
  
  private JLabel jLabel58;
  private JLabel jLabel59;
  private JLabel jLabel6;
  private JLabel jLabel60;
  private JLabel jLabel61;
  private JLabel jLabel62;
  
  private void total_costFocusGained(FocusEvent evt)
  {
    double fpcost = Double.parseDouble(one_quantity_cost.getText());
    int q = Integer.parseInt(qty.getText());
    double q1 = fpcost * q;
    String totalcost = Double.toString(q1);
    total_cost.setText(totalcost);
  }
  
  private JLabel jLabel63;
  private JLabel jLabel64;
  private JLabel jLabel65;
  private JLabel jLabel66;
  private JLabel jLabel67;
  private JLabel jLabel68;
  private JLabel jLabel69;
  private JLabel jLabel7;
  
  private void fm_costFocusGained(FocusEvent evt)
  {
    double sc = Double.parseDouble(sand_cost.getText());
    double ac = Double.parseDouble(ac_cost.getText());
    double gravel = Double.parseDouble(gravel_cost.getText());
    double pebbles = Double.parseDouble(pebbles_cost.getText());
    double anthracite = Double.parseDouble(anthracite_cost.getText());
    double fm = sc + ac + gravel + pebbles + anthracite;
    String fmc = Double.toString(fm);
    fm_cost.setText(fmc);
  }
  
  private JLabel jLabel70;
  private JLabel jLabel71;
  private JLabel jLabel72;
  private JLabel jLabel73;
  private void anthracite_costFocusGained(FocusEvent evt)
  {
    double anthra_wt = Double.parseDouble(anthracite_wt.getText());
    double anthra_kg = Double.parseDouble(anthracite_cost_kg.getText());
    double tanthra = anthra_wt * anthra_kg;
    String anthra = Double.toString(tanthra);
    anthracite_cost.setText(anthra);
  }
  
  private void ac_costFocusGained(FocusEvent evt)
  {
    double act_wt = Double.parseDouble(ac_wt.getText());
    double ac_kg = Double.parseDouble(ac_cost_kg.getText());
    double tac = act_wt * ac_kg;
    String ac = Double.toString(tac);
    ac_cost.setText(ac);
  }
  
  private void sand_costFocusGained(FocusEvent evt)
  {
    double s_wt = Double.parseDouble(sand_wt.getText());
    double s_kg = Double.parseDouble(sand_cost_kg.getText());
    double tsc = s_wt * s_kg;
    String sc = Double.toString(tsc);
    sand_cost.setText(sc);
  }
  
  private void moc_costFocusGained(FocusEvent evt)
  {
    double cs = Double.parseDouble(carbon_steel_cost.getText());
    double ss = Double.parseDouble(ss_cost.getText());
    double tcc = cs + ss;
    String tc = Double.toString(tcc);
    moc_cost.setText(tc);
  }
  
  private void ss_costFocusGained(FocusEvent evt)
  {
    double tw = Double.parseDouble(total_weight.getText());
    double sspk = Double.parseDouble(ss_perkg.getText());
    double ssp = Double.parseDouble(stainless_steel_percent.getText());
    double ssc = tw * sspk * ssp / 100.0D;
    String ss = Double.toString(ssc);
    ss_cost.setText(ss);
  }
  
  private void stainless_steel_percentFocusGained(FocusEvent evt)
  {
    double csp = Double.parseDouble(carbon_steel_percent.getText());
    double ssp = 100.0D - csp;
    String tssp = Double.toString(ssp);
    stainless_steel_percent.setText(tssp);
  }
  
  private void carbon_steel_costFocusGained(FocusEvent evt)
  {
    double tw = Double.parseDouble(total_weight.getText());
    double cspk = Double.parseDouble(carbon_steel_perkg.getText());
    double csp = Double.parseDouble(carbon_steel_percent.getText());
    double csc = tw * cspk * csp / 100.0D;
    String cs = Double.toString(csc);
    carbon_steel_cost.setText(cs);
  }
  
  private void drum_weightFocusGained(FocusEvent evt)
  {
    double ddiameter = Double.parseDouble(diameter.getText());
    double dheight = Double.parseDouble(height.getText());
    double dthickness = Double.parseDouble(thickness.getText());
    double dweight = 3.14D * ddiameter * dheight * dthickness * 7.85D;
    String weight1 = Double.toString(Math.round(dweight * 100.0D) / 100.0D);
    drum_weight.setText(weight1);
  }
  
  private void shell_diameterFocusGained(FocusEvent evt)
  {
    double ddiameter = Double.parseDouble(diameter.getText());
    double Sdia = 1.3D * ddiameter;
    String Sdiameter = Double.toString(Math.round(Sdia * 100.0D) / 100.0D);
    shell_diameter.setText(Sdiameter);
  }
  
  private void Shell_weightFocusGained(FocusEvent evt)
  {
    double Sdiameter = Double.parseDouble(shell_diameter.getText());
    double Sthickness = Double.parseDouble(shell_thickness.getText());
    double Sweight = 6.28D * Sdiameter * Sdiameter * Sthickness * 7.85D / 4.0D;
    String Sweight1 = Double.toString(Math.round(Sweight * 100.0D) / 100.0D);
    Shell_weight.setText(Sweight1);
  }
  
  private void Construction_costFocusGained(FocusEvent evt)
  {
    double shell_wt = Double.parseDouble(Shell_weight.getText());
    double drum_wt = Double.parseDouble(drum_weight.getText());
    double steelcost = Double.parseDouble(Steel_cost.getText());
    double cons_cost = (shell_wt + drum_wt) * steelcost;
    String cons_cost1 = Double.toString(Math.round(cons_cost * 100.0D) / 100.0D);
    Construction_cost.setText(cons_cost1);
  }
  
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
  private JPanel jPanel1;
  private JScrollPane jScrollPane1;
  private JTextField moc_cost;
  private JTextField msc_type;
  private JTextField one_quantity_cost;
  private JTextField p_id;
  
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
      Logger.getLogger(Pressure_filter.class.getName()).log(Level.SEVERE, null, ex);
    }
    


    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Pressure_filter().setVisible(true);
      }
    });
  }
  
  private JTextField pebbles_cost;
  private JTextField pebbles_cost_kg;
  private JTextField pebbles_wt;
  private JTextField pf_type;
  private JTextField qty;
  private JTextField sand_cost;
  private JTextField sand_cost_kg;
  private JTextField sand_wt;
  private JTextField shell_diameter;
  private JTextField shell_thickness;
  private JTextField ss_cost;
  private JTextField ss_perkg;
  private JTextField stainless_steel_percent;
  private JTextField thickness;
  private JTextField total_cost;
  private JTextField total_weight;
}
