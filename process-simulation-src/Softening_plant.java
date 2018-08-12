package process_simulation;

import java.awt.Container;
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

public class Softening_plant
  extends JFrame
{
  private JTextField AC_cost;
  private JTextField AC_cost_kg;
  private JTextField AC_wt;
  private JTextField Amt_of_salt;
  private JButton Back;
  private JTextField Company_name;
  private JTextField Cost_of_resinbed;
  private JButton Enter;
  private JTextField Fabrication_cost;
  private JTextField Flow_rate;
  private JTextField Gravel_cost;
  private JTextField Gravel_cost_kg;
  private JTextField Gravel_wt;
  private JTextField Operational_hrs;
  private JTextField Pebbles_cost;
  private JTextField Pebbles_cost_kg;
  private JTextField Pebbles_wt;
  private JTextField Product_id;
  private JTextField Qty;
  private JTextField Resin_capacity;
  private JTextField Rheight;
  private JTextField Rubber_lining_area;
  private JTextField Rubber_lining_cost;
  private JTextField Rubber_lining_costm2;
  private JTextField SD_wt;
  private JTextField SDdiameter;
  private JTextField SDheight;
  private JTextField SDthickness;
  private JTextField SS_wt;
  private JTextField SSdiameter;
  private JTextField SSthickness;
  private JTextField Sand_cost;
  private JTextField Sand_cost_kg;
  private JTextField Sand_wt;
  private JTextField Steel_cost;
  private JTextField Volume_of_resin;
  private JTextField date;
  private JTextField fabrication_kg;
  private JTextField fmcost;
  private JLabel jLabel1;
  
  public Softening_plant()
  {
    initComponents();
  }
  
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
    Company_name = new JTextField();
    Product_id = new JTextField();
    date = new JTextField();
    Qty = new JTextField();
    Flow_rate = new JTextField();
    jLabel43 = new JLabel();
    Operational_hrs = new JTextField();
    jLabel44 = new JLabel();
    Amt_of_salt = new JTextField();
    Resin_capacity = new JTextField();
    Volume_of_resin = new JTextField();
    Rheight = new JTextField();
    jLabel45 = new JLabel();
    SDheight = new JTextField();
    jLabel46 = new JLabel();
    SDdiameter = new JTextField();
    SDthickness = new JTextField();
    SD_wt = new JTextField();
    jLabel47 = new JLabel();
    SSdiameter = new JTextField();
    SSthickness = new JTextField();
    SS_wt = new JTextField();
    jLabel48 = new JLabel();
    Rubber_lining_area = new JTextField();
    jLabel49 = new JLabel();
    Rubber_lining_costm2 = new JTextField();
    jLabel50 = new JLabel();
    jLabel51 = new JLabel();
    Rubber_lining_cost = new JTextField();
    jLabel52 = new JLabel();
    Steel_cost = new JTextField();
    jLabel53 = new JLabel();
    Cost_of_resinbed = new JTextField();
    jLabel54 = new JLabel();
    Fabrication_cost = new JTextField();
    Sand_wt = new JTextField();
    Sand_cost_kg = new JTextField();
    jLabel55 = new JLabel();
    jLabel56 = new JLabel();
    jLabel57 = new JLabel();
    Sand_cost = new JTextField();
    jLabel58 = new JLabel();
    Gravel_wt = new JTextField();
    jLabel59 = new JLabel();
    Gravel_cost_kg = new JTextField();
    jLabel60 = new JLabel();
    Gravel_cost = new JTextField();
    Pebbles_wt = new JTextField();
    jLabel61 = new JLabel();
    jLabel62 = new JLabel();
    Pebbles_cost_kg = new JTextField();
    jLabel63 = new JLabel();
    Pebbles_cost = new JTextField();
    AC_wt = new JTextField();
    jLabel64 = new JLabel();
    AC_cost_kg = new JTextField();
    jLabel65 = new JLabel();
    jLabel66 = new JLabel();
    AC_cost = new JTextField();
    jLabel67 = new JLabel();
    fmcost = new JTextField();
    jLabel68 = new JLabel();
    one_qty_cost = new JTextField();
    jLabel69 = new JLabel();
    total_cost = new JTextField();
    Enter = new JButton();
    Back = new JButton();
    jLabel70 = new JLabel();
    jLabel71 = new JLabel();
    jLabel72 = new JLabel();
    resin_litre = new JTextField();
    resin_cost = new JTextField();
    fabrication_kg = new JTextField();
    jLabel73 = new JLabel();
    jLabel74 = new JLabel();
    jLabel75 = new JLabel();
    
    setDefaultCloseOperation(3);
    setResizable(false);
    
    jLabel1.setFont(new Font("Times New Roman", 1, 18));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setFont(new Font("Times New Roman", 1, 14));
    jLabel2.setText("SOFTENING PLANT");
    
    jLabel3.setText("Company Name");
    
    jLabel4.setText("Product Id");
    
    jLabel5.setText("Date");
    
    jLabel6.setText("Quantity");
    
    jLabel7.setText("Flow Rate");
    
    jLabel8.setText("Operational Hrs");
    
    jLabel9.setText("Amount of Salt");
    
    jLabel10.setText("Resin Capacity");
    
    jLabel11.setText("Volume of Resin");
    
    jLabel12.setFont(new Font("Times New Roman", 1, 14));
    jLabel12.setText("RESIN BED");
    
    jLabel13.setText("Height of Resin ");
    
    jLabel14.setText("Height of Drum");
    
    jLabel15.setText("Diameter of Drum");
    
    jLabel16.setText("Thickness of Drum");
    
    jLabel17.setText("Weight of Drum");
    
    jLabel18.setText("Diameter of Shell ");
    
    jLabel19.setText("Thickness of Shell");
    
    jLabel20.setText("Weight of Shell");
    
    jLabel21.setText("Rubber Lining Area");
    
    jLabel22.setText("Rubber Lining Cost/square m");
    
    jLabel23.setText("Rubber Lining Cost");
    
    jLabel24.setText("Cost of Steel/kg");
    
    jLabel25.setText("Cost of Resin Tank");
    
    jLabel26.setText("Fabrication Cost");
    
    jLabel27.setFont(new Font("Times New Roman", 1, 14));
    jLabel27.setText("FILTER MEDIA");
    
    jLabel28.setText("Sand (kg)");
    
    jLabel29.setText("Sand Cost/kg");
    
    jLabel30.setText("Sand Cost");
    
    jLabel31.setText("Gravel (kg)");
    
    jLabel32.setText("Gravel Cost/kg");
    
    jLabel33.setText("Gravel Cost");
    
    jLabel34.setText("Pebbles (kg)");
    
    jLabel35.setText("Pebbles Cost/kg");
    
    jLabel36.setText("Pebbles Cost");
    
    jLabel37.setText("Activated Carbon (kg)");
    
    jLabel38.setText("Activated Carbon Cost/kg");
    
    jLabel39.setText("Activated Carbon Cost");
    
    jLabel40.setText("Filter Media Cost");
    
    jLabel41.setText("Cost of One Quantity");
    
    jLabel42.setText("Total Cost");
    
    jLabel43.setText("cubic metre/hr");
    
    jLabel44.setText("hr");
    
    Volume_of_resin.setText("0");
    Volume_of_resin.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.Volume_of_resinFocusGained(evt);
      }
      
    });
    Rheight.setText("1");
    
    jLabel45.setText("metre");
    
    SDheight.setText("2");
    
    jLabel46.setText("metre");
    
    SDdiameter.setText("0");
    SDdiameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.SDdiameterFocusGained(evt);
      }
      
    });
    SDthickness.setText("8");
    
    SD_wt.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.SD_wtFocusGained(evt);
      }
      
    });
    jLabel47.setText("kgs");
    
    SSdiameter.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.SSdiameterFocusGained(evt);
      }
      
    });
    SSthickness.setText("10");
    
    SS_wt.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.SS_wtFocusGained(evt);
      }
      
    });
    jLabel48.setText("kgs");
    
    Rubber_lining_area.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.Rubber_lining_areaFocusGained(evt);
      }
      
    });
    jLabel49.setText("square metre");
    
    jLabel50.setText("Rs");
    
    jLabel51.setText("Rs");
    
    Rubber_lining_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.Rubber_lining_costFocusGained(evt);
      }
      
    });
    jLabel52.setText("Rs");
    
    jLabel53.setText("Rs");
    
    Cost_of_resinbed.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.Cost_of_resinbedFocusGained(evt);
      }
      
    });
    jLabel54.setText("Rs");
    
    Fabrication_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.Fabrication_costFocusGained(evt);
      }
      
    });
    jLabel55.setText("kgs");
    
    jLabel56.setText("Rs");
    
    jLabel57.setText("Rs");
    
    Sand_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.Sand_costFocusGained(evt);
      }
      
    });
    jLabel58.setText("kgs");
    
    jLabel59.setText("Rs");
    
    jLabel60.setText("Rs");
    
    Gravel_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.Gravel_costFocusGained(evt);
      }
      
    });
    jLabel61.setText("kgs");
    
    jLabel62.setText("Rs");
    
    jLabel63.setText("Rs");
    
    Pebbles_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.Pebbles_costFocusGained(evt);
      }
      
    });
    jLabel64.setText("kgs");
    
    jLabel65.setText("Rs");
    
    jLabel66.setText("Rs");
    
    AC_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.AC_costFocusGained(evt);
      }
      
    });
    jLabel67.setText("Rs");
    
    fmcost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.fmcostFocusGained(evt);
      }
      
    });
    jLabel68.setText("Rs");
    
    one_qty_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.one_qty_costFocusGained(evt);
      }
      
    });
    jLabel69.setText("Rs");
    
    total_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.total_costFocusGained(evt);
      }
      
    });
    Enter.setText("Enter");
    Enter.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Softening_plant.this.EnterActionPerformed(evt);
      }
      
    });
    Back.setText("Back");
    Back.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Softening_plant.this.BackActionPerformed(evt);
      }
      
    });
    jLabel70.setText("Resin Cost/litre");
    
    jLabel71.setText("Total Resin Cost");
    
    jLabel72.setText("Fabrication Cost/kg");
    
    resin_cost.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) {
        Softening_plant.this.resin_costFocusGained(evt);
      }
      
    });
    jLabel73.setText("Rs");
    
    jLabel74.setText("Rs");
    
    jLabel75.setText("Rs");
    
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(jLabel2).addGap(116, 116, 116)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel26).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(jLabel27, -2, 109, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(79, 79, 79).addComponent(jLabel54).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(Fabrication_cost, -2, 76, -2)))).addComponent(jLabel40).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(jLabel21).addGap(18, 18, 18).addComponent(Rubber_lining_area, -2, 69, -2)).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel3).addComponent(jLabel4).addComponent(jLabel5).addComponent(jLabel6).addComponent(jLabel7).addComponent(jLabel8).addComponent(jLabel9).addComponent(jLabel10).addComponent(jLabel11).addComponent(jLabel13).addComponent(jLabel14).addComponent(jLabel15)).addGap(22, 22, 22).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(jLabel12, -1, -1, 32767).addComponent(Company_name).addComponent(Product_id).addComponent(date).addComponent(Qty).addComponent(Flow_rate).addComponent(Operational_hrs).addComponent(Amt_of_salt).addComponent(Resin_capacity).addComponent(Volume_of_resin).addComponent(Rheight).addComponent(SDheight).addComponent(SDdiameter, -2, 72, -2))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel16).addComponent(jLabel17).addComponent(jLabel18).addComponent(jLabel19).addComponent(jLabel20)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(SSthickness).addComponent(SSdiameter).addComponent(SDthickness).addComponent(SD_wt).addComponent(SS_wt, -2, 73, -2)))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel43).addComponent(jLabel44).addComponent(jLabel45).addComponent(jLabel46).addComponent(jLabel47).addComponent(jLabel48).addComponent(jLabel49))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel22).addComponent(jLabel23).addComponent(jLabel24).addComponent(jLabel25)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel50).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(Rubber_lining_costm2, -2, 76, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel51).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(Rubber_lining_cost, -2, 76, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel53).addComponent(jLabel52)).addComponent(jLabel73).addComponent(jLabel74).addComponent(jLabel75)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(fabrication_kg).addComponent(resin_cost).addComponent(resin_litre).addComponent(Steel_cost).addComponent(Cost_of_resinbed))))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(jLabel28, GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel29).addComponent(jLabel30).addComponent(jLabel32).addComponent(jLabel33).addComponent(jLabel35).addComponent(jLabel36)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel62).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(Pebbles_cost_kg)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel59).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(Gravel_cost_kg)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel57).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Gravel_wt).addComponent(Sand_cost))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel60).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Pebbles_wt).addComponent(Gravel_cost))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel63).addComponent(jLabel65, GroupLayout.Alignment.TRAILING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(AC_cost_kg).addComponent(AC_wt).addComponent(Pebbles_cost))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel56).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Sand_wt, -2, 71, -2).addComponent(Sand_cost_kg, -2, 71, -2)))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel66).addComponent(jLabel67, GroupLayout.Alignment.TRAILING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(fmcost, -2, 73, -2).addComponent(AC_cost, -2, 73, -2))))).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel38).addComponent(jLabel39).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel42).addComponent(jLabel41).addComponent(Back, -2, 68, -2)))).addGap(28, 28, 28).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel69).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(total_cost)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel68).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(one_qty_cost, -2, 76, -2)))).addComponent(Enter)).addComponent(jLabel31).addComponent(jLabel34).addComponent(jLabel37)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel58).addComponent(jLabel55).addComponent(jLabel61).addComponent(jLabel64))))).addGroup(jPanel1Layout.createSequentialGroup().addGap(46, 46, 46).addComponent(jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel70)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel72)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel71))).addContainerGap(-1, 32767)));
    




















































































































































































































    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(Company_name, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(Product_id, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(date, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(Qty, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(Flow_rate, -2, -1, -2).addComponent(jLabel43)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(Operational_hrs, -2, -1, -2).addComponent(jLabel44)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel9).addComponent(Amt_of_salt, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(Resin_capacity, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(Volume_of_resin, -2, -1, -2)).addGap(7, 7, 7).addComponent(jLabel12).addGap(9, 9, 9).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(Rheight, -2, -1, -2).addComponent(jLabel45)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel14).addComponent(SDheight, -2, -1, -2).addComponent(jLabel46)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel15).addComponent(SDdiameter, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel16).addComponent(SDthickness, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel17).addComponent(SD_wt, -2, -1, -2).addComponent(jLabel47)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel18).addComponent(SSdiameter, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel19).addComponent(SSthickness, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel20).addComponent(SS_wt, -2, -1, -2).addComponent(jLabel48)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel21).addComponent(Rubber_lining_area, -2, -1, -2).addComponent(jLabel49)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel22).addComponent(Rubber_lining_costm2, -2, -1, -2).addComponent(jLabel50)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel23).addComponent(jLabel51).addComponent(Rubber_lining_cost, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel24).addComponent(jLabel52).addComponent(Steel_cost, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel25).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Cost_of_resinbed, -2, -1, -2).addComponent(jLabel53))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel70).addComponent(resin_litre, -2, -1, -2).addComponent(jLabel73)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel71).addComponent(resin_cost, -2, -1, -2).addComponent(jLabel74)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel72).addComponent(fabrication_kg, -2, -1, -2).addComponent(jLabel75)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel26).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel54).addComponent(Fabrication_cost, -2, -1, -2)).addGap(14, 14, 14).addComponent(jLabel27))).addGap(9, 9, 9).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel28).addComponent(Sand_wt, -2, -1, -2).addComponent(jLabel55)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel29).addComponent(Sand_cost_kg, -2, -1, -2).addComponent(jLabel56)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel30).addComponent(jLabel57).addComponent(Sand_cost, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel31).addComponent(jLabel58).addComponent(Gravel_wt, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel32).addComponent(jLabel59).addComponent(Gravel_cost_kg, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel33).addComponent(jLabel60).addComponent(Gravel_cost, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel34).addComponent(Pebbles_wt, -2, -1, -2).addComponent(jLabel61)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel35).addComponent(jLabel62).addComponent(Pebbles_cost_kg, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel36).addComponent(jLabel63).addComponent(Pebbles_cost, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel37).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(AC_wt, -2, -1, -2).addComponent(jLabel64))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel38).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(AC_cost_kg, -2, -1, -2).addComponent(jLabel65))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel39).addComponent(jLabel66).addComponent(AC_cost, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel40).addComponent(jLabel67).addComponent(fmcost, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel41).addComponent(jLabel68).addComponent(one_qty_cost, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel42).addComponent(jLabel69).addComponent(total_cost, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Enter).addComponent(Back)).addContainerGap()));
    























































































































































































































    jScrollPane1.setViewportView(jPanel1);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, -2, -1, -2).addContainerGap(58, 32767)));
    





    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1, -1, 1211, 32767).addGap(38, 38, 38)));
    






    pack();
  }
  
  private JLabel jLabel32;
  private JLabel jLabel33;
  private JLabel jLabel34;
  private JLabel jLabel35;
  private JLabel jLabel36;
  private JLabel jLabel37;
  
  private void Volume_of_resinFocusGained(FocusEvent evt)
  {
    double fr = Double.parseDouble(Flow_rate.getText());
    int oh = Integer.parseInt(Operational_hrs.getText());
    int amountsalt = Integer.parseInt(Amt_of_salt.getText());
    int resin_cap = Integer.parseInt(Resin_capacity.getText());
    double volume = fr * oh * amountsalt / (resin_cap * 1000);
    String vol = Double.toString(Math.round(volume * 100.0D) / 100.0D);
    Volume_of_resin.setText(vol);
  }
  
  private JLabel jLabel38;
  private JLabel jLabel39;
  private JLabel jLabel4;
  private JLabel jLabel40;
  private JLabel jLabel41;
  
  private void SDdiameterFocusGained(FocusEvent evt)
  {
    double volume = Double.parseDouble(Volume_of_resin.getText());
    double SDdia = Math.sqrt(volume * 4.0D / 3.14D);
    String SD_diameter = Double.toString(Math.round(SDdia * 100.0D) / 100.0D);
    SDdiameter.setText(SD_diameter);
  }
  
  private JLabel jLabel42;
  private JLabel jLabel43;
  private JLabel jLabel44;
  private JLabel jLabel45;
  private JLabel jLabel46;
  
  private void SD_wtFocusGained(FocusEvent evt)
  {
    double SD_diameter = Double.parseDouble(SDdiameter.getText());
    double SD_height = Double.parseDouble(SDheight.getText());
    double SD_thickness = Double.parseDouble(SDthickness.getText());
    double SDweight = 3.14D * SD_diameter * SD_height * SD_thickness * 7.85D;
    String SDweight1 = Double.toString(Math.round(SDweight * 100.0D) / 100.0D);
    SD_wt.setText(SDweight1);
  }
  
  private JLabel jLabel47;
  private JLabel jLabel48;
  private JLabel jLabel49;
  private JLabel jLabel5;
  private JLabel jLabel50;
  
  private void SSdiameterFocusGained(FocusEvent evt)
  {
    double SD_diameter = Double.parseDouble(SDdiameter.getText());
    double SSdia = 1.3D * SD_diameter;
    String SS_diameter = Double.toString(Math.round(SSdia * 100.0D) / 100.0D);
    SSdiameter.setText(SS_diameter);
  }
  
  private JLabel jLabel51;
  private JLabel jLabel52;
  private JLabel jLabel53;
  private JLabel jLabel54;
  private JLabel jLabel55;
  private void SS_wtFocusGained(FocusEvent evt)
  {
    double SS_diameter = Double.parseDouble(SSdiameter.getText());
    double SS_thickness = Double.parseDouble(SSthickness.getText());
    double SSweight = 6.28D * SS_diameter * SS_diameter * SS_thickness * 7.85D / 4.0D;
    String SSweight1 = Double.toString(Math.round(SSweight * 100.0D) / 100.0D);
    SS_wt.setText(SSweight1);
  }
  
  private void Rubber_lining_areaFocusGained(FocusEvent evt)
  {
    double SD_diameter = Double.parseDouble(SDdiameter.getText());
    double SD_height = Double.parseDouble(SDheight.getText());
    double SS_diameter = Double.parseDouble(SSdiameter.getText());
    double rubber_lining = 3.14D * SD_diameter * SD_height + 6.28D * SS_diameter * SS_diameter / 4.0D;
    String rubber_lining1 = Double.toString(Math.round(rubber_lining * 100.0D) / 100.0D);
    Rubber_lining_area.setText(rubber_lining1);
  }
  
  private void Rubber_lining_costFocusGained(FocusEvent evt)
  {
    double rubber_liningarea = Double.parseDouble(Rubber_lining_area.getText());
    
    double rubber_lining_cost = Double.parseDouble(Rubber_lining_costm2.getText());
    double rubber_lining = rubber_liningarea * rubber_lining_cost;
    String rubber_lining1 = Double.toString(Math.round(rubber_lining * 100.0D) / 100.0D);
    Rubber_lining_cost.setText(rubber_lining1);
  }
  
  private void Cost_of_resinbedFocusGained(FocusEvent evt)
  {
    double SD_weight = Double.parseDouble(SD_wt.getText());
    double SS_weight = Double.parseDouble(SS_wt.getText());
    double steel_cost_kg = Double.parseDouble(Steel_cost.getText());
    double Rweight = SD_weight + SS_weight;
    double Resin_cost = Rweight * steel_cost_kg;
    String Anion_cost1 = Double.toString(Math.round(Resin_cost * 100.0D) / 100.0D);
    Cost_of_resinbed.setText(Anion_cost1);
  }
  
  private void Fabrication_costFocusGained(FocusEvent evt)
  {
    double SD_weight = Double.parseDouble(SD_wt.getText());
    double SS_weight = Double.parseDouble(SS_wt.getText());
    double resin_cost = Double.parseDouble(fabrication_kg.getText());
    double fab_cost = (SD_weight + SS_weight) * resin_cost;
    String fab_cost1 = Double.toString(Math.round(fab_cost * 100.0D) / 100.0D);
    Fabrication_cost.setText(fab_cost1);
  }
  
  private void Sand_costFocusGained(FocusEvent evt)
  {
    double sand = Double.parseDouble(Sand_wt.getText());
    double sc_kg = Double.parseDouble(Sand_cost_kg.getText());
    double Sandcost = sand * sc_kg;
    String Sandcost1 = Double.toString(Math.round(Sandcost * 100.0D) / 100.0D);
    Sand_cost.setText(Sandcost1);
  }
  
  private void Gravel_costFocusGained(FocusEvent evt)
  {
    double Gravel = Double.parseDouble(Gravel_wt.getText());
    double gc_kg = Double.parseDouble(Gravel_cost_kg.getText());
    double Gravelcost = Gravel * gc_kg;
    String Gravelcost1 = Double.toString(Math.round(Gravelcost * 100.0D) / 100.0D);
    Gravel_cost.setText(Gravelcost1);
  }
  
  private void Pebbles_costFocusGained(FocusEvent evt)
  {
    double Pebble = Double.parseDouble(Pebbles_wt.getText());
    double pc_kg = Double.parseDouble(Pebbles_cost_kg.getText());
    double Pebblecost = Pebble * pc_kg;
    String Pebblecost1 = Double.toString(Math.round(Pebblecost * 100.0D) / 100.0D);
    Pebbles_cost.setText(Pebblecost1);
  }
  
  private void AC_costFocusGained(FocusEvent evt)
  {
    double AC = Double.parseDouble(AC_wt.getText());
    double ACcost_kg = Double.parseDouble(AC_cost_kg.getText());
    double ACcost = AC * ACcost_kg;
    String ACcost1 = Double.toString(Math.round(ACcost * 100.0D) / 100.0D);
    AC_cost.setText(ACcost1);
  }
  
  private void fmcostFocusGained(FocusEvent evt)
  {
    double sandcost = Double.parseDouble(Sand_cost.getText());
    double gravelcost = Double.parseDouble(Gravel_cost.getText());
    double pebblecost = Double.parseDouble(Pebbles_cost.getText());
    double ACcost = Double.parseDouble(AC_cost.getText());
    double Mediacost = sandcost + gravelcost + pebblecost + ACcost;
    String Mediacost1 = Double.toString(Math.round(Mediacost * 100.0D) / 100.0D);
    fmcost.setText(Mediacost1);
  }
  
  private void one_qty_costFocusGained(FocusEvent evt)
  {
    double resin_cost = Double.parseDouble(Cost_of_resinbed.getText());
    
    double fab_cost = Double.parseDouble(Fabrication_cost.getText());
    double rubber_lining_cost = Double.parseDouble(Rubber_lining_cost.getText());
    double mediacost = Double.parseDouble(fmcost.getText());
    double totalcost = resin_cost + fab_cost + rubber_lining_cost + mediacost;
    String total_cost1 = Double.toString(Math.round(totalcost * 100.0D) / 100.0D);
    one_qty_cost.setText(total_cost1);
  }
  
  private void total_costFocusGained(FocusEvent evt)
  {
    double q = Double.parseDouble(one_qty_cost.getText());
    int qt = Integer.parseInt(Qty.getText());
    double q1 = q * qt;
    String totalcost = Double.toString(q1);
    total_cost.setText(totalcost);
  }
  
  private void EnterActionPerformed(ActionEvent evt)
  {
    if ("".equals(Product_id.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Company Name");
    } else if ("".equals(Company_name.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Company Name");
    } else if ("".equals(Qty.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Quantity");
    } else if ("".equals(Flow_rate.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Flow Rate");
    } else if ("".equals(date.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Date");
    } else if ("".equals(Operational_hrs.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Operational hrs");
    } else if ("".equals(Amt_of_salt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Amount of Cation Salt");
    } else if ("".equals(Resin_capacity.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Resin Capacity");
    } else if ("".equals(Volume_of_resin.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Volume of Cation Resin");
    }
    else if ("".equals(Rheight.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Resin Height");
    } else if ("".equals(SDheight.getText())) {
      JOptionPane.showMessageDialog(null, "enter Cation Drum Height");
    } else if ("".equals(SDdiameter.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Drum Diameter");
    } else if ("".equals(SDthickness.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Drum Thickness");
    } else if ("".equals(SD_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Drum Weight");
    } else if ("".equals(SSdiameter.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Shell Diameter");
    } else if ("".equals(SSthickness.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Shell Thickness");
    } else if ("".equals(SS_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cation Shell Weight");
    }
    else if ("".equals(Steel_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cost of Steel per kg");
    } else if ("".equals(Cost_of_resinbed.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Cation Bed Cost");
    } else if ("".equals(Fabrication_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Fabrication Cost");
    } else if ("".equals(fabrication_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Fabrication Cost/kg");
    } else if ("".equals(resin_litre.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Resin Cost/litre");
    } else if ("".equals(resin_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Resin Cost");
    } else if ("".equals(Rubber_lining_area.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Rubber Lining Area");
    } else if ("".equals(Rubber_lining_costm2.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Rubber Lining Costper square metre");
    } else if ("".equals(Rubber_lining_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Rubber Lining Cost");

    }
    else if ("".equals(Sand_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Sand Weight");
    } else if ("".equals(Sand_cost_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter Cost of Sand/kg");
    } else if ("".equals(Sand_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Sand Cost");
    } else if ("".equals(Gravel_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Gravel Weight");
    } else if ("".equals(Gravel_cost_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cost of Gravel/kg");
    } else if ("".equals(Gravel_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Gravel Cost");
    } else if ("".equals(Pebbles_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Pebbles Weight");
    } else if ("".equals(Pebbles_cost_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter Cost of Pebbles/kg");
    } else if ("".equals(Pebbles_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Pebbles Cost");
    } else if ("".equals(AC_wt.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Activated Carbon Weight");
    } else if ("".equals(AC_cost_kg.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cost of Activated Carbo/kg");
    } else if ("".equals(AC_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total Activated Carbo Cost");
    } else if ("".equals(fmcost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Filter Media Cost");
    } else if ("".equals(one_qty_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter the Cost of Cost of One Quantity");
    } else if ("".equals(total_cost.getText())) {
      JOptionPane.showMessageDialog(null, "enter Total DM Plant Cost");
    } else {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
        String query1 = "INSERT INTO `sp-info`(`Company_name`, `Product_id`, `date`, `qty`, `Flow_rate`, `Total_cost`) VALUES (?,?,?,?,?,?);";
        PreparedStatement stmt1 = conn.prepareStatement(query1);
        stmt1.setString(1, Company_name.getText());
        stmt1.setString(2, Product_id.getText());
        stmt1.setString(3, date.getText());stmt1.setInt(4, Integer.parseInt(Qty.getText()));
        stmt1.setDouble(5, Double.parseDouble(Flow_rate.getText()));
        stmt1.setDouble(6, Double.parseDouble(total_cost.getText()));
        stmt1.executeUpdate();
        
        String query2 = "INSERT INTO `sp-bed`(`Product_id`, `Flow_rate`, `Operational_hrs`, `Amt_of_salt`, `Resin_capacity`, `Volume_of_resin`) VALUES (?,?,?,?,?,?);";
        PreparedStatement stmt2 = conn.prepareStatement(query2);
        stmt2.setString(1, Product_id.getText());
        stmt2.setDouble(2, Double.parseDouble(Flow_rate.getText()));
        stmt2.setInt(3, Integer.parseInt(Operational_hrs.getText()));
        stmt2.setInt(4, Integer.parseInt(Amt_of_salt.getText()));
        stmt2.setInt(5, Integer.parseInt(Resin_capacity.getText()));
        stmt2.setDouble(6, Double.parseDouble(Volume_of_resin.getText()));
        stmt2.executeUpdate();
        
        String query3 = "INSERT INTO `sp-drum`(`Product_id`, `Rheight`, `SDheight`, `SDdiameter`, `SDthickness`, `SDweight`) VALUES (?,?,?,?,?,?);";
        PreparedStatement stmt3 = conn.prepareStatement(query3);
        stmt3.setString(1, Product_id.getText());
        stmt3.setDouble(2, Double.parseDouble(Rheight.getText()));
        stmt3.setDouble(3, Double.parseDouble(SDheight.getText()));
        stmt3.setDouble(4, Double.parseDouble(SDdiameter.getText()));
        stmt3.setDouble(5, Double.parseDouble(SDthickness.getText()));
        stmt3.setDouble(6, Double.parseDouble(SD_wt.getText()));
        stmt3.executeUpdate();
        
        String query4 = "INSERT INTO `sp-shell`(`Product_id`, `SSdiameter`, `SSthickness`, `SSweight`) VALUES (?,?,?,?);";
        PreparedStatement stmt4 = conn.prepareStatement(query4);
        stmt4.setString(1, Product_id.getText());
        stmt4.setDouble(2, Double.parseDouble(SSdiameter.getText()));
        stmt4.setDouble(3, Double.parseDouble(SSthickness.getText()));
        stmt4.setDouble(4, Double.parseDouble(SS_wt.getText()));
        stmt4.executeUpdate();
        
        String query5 = "INSERT INTO `sp-common`(`Product_id`, `Rubber_lining_area`, `Rubber_lining_costm2`, `Rubber_lining_cost`, `Steel_cost`, `Cost_of_resinbed`, `resin_litre`, `resin_cost`, `fabrication_kg`, `Fabrication_cost`) VALUES (?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement stmt5 = conn.prepareStatement(query5);
        stmt5.setString(1, Product_id.getText());
        stmt5.setDouble(2, Double.parseDouble(Rubber_lining_area.getText()));
        stmt5.setDouble(3, Double.parseDouble(Rubber_lining_costm2.getText()));
        stmt5.setDouble(4, Double.parseDouble(Rubber_lining_cost.getText()));
        stmt5.setDouble(5, Double.parseDouble(Steel_cost.getText()));
        stmt5.setDouble(6, Double.parseDouble(Cost_of_resinbed.getText()));
        stmt5.setDouble(7, Double.parseDouble(resin_litre.getText()));
        stmt5.setDouble(8, Double.parseDouble(resin_cost.getText()));
        stmt5.setDouble(9, Double.parseDouble(fabrication_kg.getText()));
        stmt5.setDouble(10, Double.parseDouble(Fabrication_cost.getText()));
        
        stmt5.executeUpdate();
        
        String query6 = "INSERT INTO `sp-filter-media`(`Product_id`, `Sand_wt`, `Sand_cost_kg`, `Sand_cost`, `Gravel_wt`, `Gravel_cost_kg`, `Gravel_cost`, `Pebbles_wt`, `Pebbles_cost_kg`, `Pebbles_cost`, `AC_wt`, `AC_cost_kg`, `AC_cost`, `fmcost`, `one_qty_cost`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement stmt6 = conn.prepareStatement(query6);
        stmt6.setString(1, Product_id.getText());
        stmt6.setDouble(2, Double.parseDouble(Sand_wt.getText()));
        stmt6.setDouble(3, Double.parseDouble(Sand_cost_kg.getText()));
        stmt6.setDouble(4, Double.parseDouble(Sand_cost.getText()));
        stmt6.setDouble(5, Double.parseDouble(Gravel_wt.getText()));
        stmt6.setDouble(6, Double.parseDouble(Gravel_cost_kg.getText()));
        stmt6.setDouble(7, Double.parseDouble(Gravel_cost.getText()));
        stmt6.setDouble(8, Double.parseDouble(Pebbles_wt.getText()));
        stmt6.setDouble(9, Double.parseDouble(Pebbles_cost_kg.getText()));
        stmt6.setDouble(10, Double.parseDouble(Pebbles_cost.getText()));
        stmt6.setDouble(11, Double.parseDouble(AC_wt.getText()));
        stmt6.setDouble(12, Double.parseDouble(AC_cost_kg.getText()));
        stmt6.setDouble(13, Double.parseDouble(AC_cost.getText()));
        stmt6.setDouble(14, Double.parseDouble(fmcost.getText()));
        stmt6.setDouble(15, Double.parseDouble(one_qty_cost.getText()));
        stmt6.executeUpdate();
        JOptionPane.showMessageDialog(null, "Entered the data successfully");
      }
      catch (ClassNotFoundException|SQLException e)
      {
        JOptionPane.showMessageDialog(null, "Error in connection" + e);
      }
    }
  }
  
  private void BackActionPerformed(ActionEvent evt)
  {
    Homepage h = new Homepage();
    h.setVisible(true);
    setVisible(false);
  }
  private JLabel jLabel56;
  private JLabel jLabel57;
  private JLabel jLabel58;
  private JLabel jLabel59;
  private JLabel jLabel6;
  private JLabel jLabel60;
  private JLabel jLabel61;
  private JLabel jLabel62;
  
  private void resin_costFocusGained(FocusEvent evt)
  {
    double volume = Double.parseDouble(Volume_of_resin.getText());
    double Rcost = Double.parseDouble(resin_litre.getText());
    double RCost1 = Math.sqrt(Rcost * volume * 1000.0D);
    String RCost2 = Double.toString(Math.round(RCost1 * 1000.0D) / 1000.0D);
    resin_cost.setText(RCost2);
  }
  
  private JLabel jLabel63;
  private JLabel jLabel64;
  private JLabel jLabel65;
  private JLabel jLabel66;
  private JLabel jLabel67;
  private JLabel jLabel68;
  private JLabel jLabel69;
  
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
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Softening_plant.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      Logger.getLogger(Softening_plant.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      Logger.getLogger(Softening_plant.class.getName()).log(Level.SEVERE, null, ex);
    } catch (UnsupportedLookAndFeelException ex) {
      Logger.getLogger(Softening_plant.class.getName()).log(Level.SEVERE, null, ex);
    }
    


    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Softening_plant().setVisible(true);
      }
    });
  }
  
  private JLabel jLabel7;
  private JLabel jLabel70;
  private JLabel jLabel71;
  private JLabel jLabel72;
  private JLabel jLabel73;
  private JLabel jLabel74;
  private JLabel jLabel75;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private JPanel jPanel1;
  private JScrollPane jScrollPane1;
  private JTextField one_qty_cost;
  private JTextField resin_cost;
  private JTextField resin_litre;
  private JTextField total_cost;
}
