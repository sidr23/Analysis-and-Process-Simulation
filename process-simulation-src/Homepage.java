package process_simulation;

import javax.swing.JMenuItem;

public class Homepage extends javax.swing.JFrame
{
  private javax.swing.JTree MENU;
  private JMenuItem Select_All;
  private JMenuItem copy;
  private JMenuItem cut;
  private javax.swing.JMenu file;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenuBar jMenuBar1;
  private JMenuItem jMenuItem1;
  private JMenuItem jMenuItem10;
  private JMenuItem jMenuItem11;
  
  public Homepage() {
    initComponents();
  }
  
  private JMenuItem jMenuItem2;
  private JMenuItem jMenuItem3;
  private JMenuItem jMenuItem5;
  private JMenuItem jMenuItem8;
  private JMenuItem jMenuItem9;
  private javax.swing.JScrollPane jScrollPane1;
  
  private void initComponents()
  {
    jMenuItem1 = new JMenuItem();
    jMenuItem2 = new JMenuItem();
    jMenuItem3 = new JMenuItem();
    jMenuItem5 = new JMenuItem();
    jMenuItem8 = new JMenuItem();
    jMenuItem9 = new JMenuItem();
    jMenuItem10 = new JMenuItem();
    jMenuItem11 = new JMenuItem();
    jSplitPane1 = new javax.swing.JSplitPane();
    jToggleButton1 = new javax.swing.JToggleButton();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    MENU = new javax.swing.JTree();
    jMenuBar1 = new javax.swing.JMenuBar();
    file = new javax.swing.JMenu();
    save = new JMenuItem();
    print = new JMenuItem();
    signout = new JMenuItem();
    jMenu1 = new javax.swing.JMenu();
    cut = new JMenuItem();
    copy = new JMenuItem();
    Select_All = new JMenuItem();
    
    jMenuItem1.setText("jMenuItem1");
    
    jMenuItem2.setText("jMenuItem2");
    
    jMenuItem3.setText("jMenuItem3");
    
    jMenuItem5.setText("jMenuItem5");
    
    jMenuItem8.setText("jMenuItem8");
    
    jMenuItem9.setText("jMenuItem9");
    
    jMenuItem10.setText("jMenuItem10");
    
    jMenuItem11.setText("jMenuItem11");
    
    jToggleButton1.setText("jToggleButton1");
    
    setDefaultCloseOperation(3);
    
    jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18));
    jLabel1.setText("  FACTOR ENGINEERING PVT LTD");
    
    javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("MENU");
    javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("DATA ENTRY AND ANALYSIS");
    javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("PRESSURE FILTER");
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("DE-MINERALIZED WATER PLANT");
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("SOFTENING PLANT");
    treeNode2.add(treeNode3);
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("DATA VIEW");
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("PROCESS SIMULATION");
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("BATCH REACTOR");
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("GRAVITY FLOW TANK");
    treeNode2.add(treeNode3);
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("PDF");
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("BASIC DM MODEL");
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("FSII-MODEL");
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("FSIII-MODEL");
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("FSIV-MODEL");
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("FSV-MODEL");
    treeNode2.add(treeNode3);
    treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("FSVI-MODEL");
    treeNode2.add(treeNode3);
    treeNode1.add(treeNode2);
    MENU.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
    MENU.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        Homepage.this.MENUMousePressed(evt);
      }
    });
    jScrollPane1.setViewportView(MENU);
    
    file.setText("File");
    
    save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(83, 2));
    save.setText("Save");
    file.add(save);
    
    print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(80, 11));
    print.setText("Print");
    file.add(print);
    
    signout.setText("Sign Out");
    signout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Homepage.this.signoutActionPerformed(evt);
      }
    });
    file.add(signout);
    
    jMenuBar1.add(file);
    
    jMenu1.setText("Edit");
    
    cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(88, 2));
    cut.setText("Cut");
    jMenu1.add(cut);
    
    copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(67, 2));
    copy.setText("Copy");
    jMenu1.add(copy);
    
    Select_All.setAccelerator(javax.swing.KeyStroke.getKeyStroke(65, 2));
    Select_All.setText("Select All");
    jMenu1.add(Select_All);
    
    jMenuBar1.add(jMenu1);
    
    setJMenuBar(jMenuBar1);
    
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(43, 43, 43).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1, -2, 310, -2).addComponent(jScrollPane1, -2, 288, -2)).addContainerGap(19, 32767)));
    







    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, -2, 60, -2).addGap(12, 12, 12).addComponent(jScrollPane1, -2, 250, -2).addContainerGap(22, 32767)));
    








    pack();
  }
  
  private void signoutActionPerformed(java.awt.event.ActionEvent evt) {
    System.exit(0);
  }
  
  private void MENUMousePressed(java.awt.event.MouseEvent evt) {
    javax.swing.tree.TreePath tp = MENU.getPathForLocation(evt.getX(), evt.getY());
    String s = tp.toString();
    if (s.contains("DATA ENTRY AND ANALYSIS"))
    {
      if (s.contains("PRESSURE FILTER"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to PRESSURE FILTER section!");
        setVisible(false);
        Pressure_filter pf = new Pressure_filter();
        pf.setVisible(true);
      }
      else if (s.contains("DE-MINERALIZED WATER PLANT"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to DE-MINERALIZED WATER PLANT section!");
        setVisible(false);
        Dmwater dw = new Dmwater();
        dw.setVisible(true);
      }
      else if (s.contains("SOFTENING PLANT"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to SOFTENING PLANT section!");
        setVisible(false);
        Softening_plant sp = new Softening_plant();
        sp.setVisible(true);
      }
    }
    else if (s.contains("DATA VIEW"))
    {

      Check_password cp = new Check_password();
      cp.setVisible(true);
    }
    else if (s.contains("PROCESS SIMULATION"))
    {
      if (s.contains("BATCH REACTOR"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to PROCESS SIMULATION:BATCH REACTOR");
        setVisible(false);
        Process_Simulation2 ps2 = new Process_Simulation2();
        ps2.setVisible(true);

      }
      else if (s.contains("GRAVITY FLOW TANK"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to PROCESS SIMULATION:GRAVITY FLOW TANK");
        setVisible(false);
        Process_Simulation1 ps1 = new Process_Simulation1();
        ps1.setVisible(true);
      }
      
    }
    else if (s.contains("PDF"))
    {
      if (s.contains("BASIC DM MODEL"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to PDF:BASIC DM MODEL");
        try
        {
          Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler BASIC DM-Model.pdf");
        }
        catch (Exception e)
        {
          javax.swing.JOptionPane.showMessageDialog(null, "Error");
        }
      }
      else if (s.contains("FSII-MODEL"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to PDF:FSII-MODEL");
        try
        {
          Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler FSII-Model.pdf");
        }
        catch (Exception e)
        {
          javax.swing.JOptionPane.showMessageDialog(null, "Error");
        }
      }
      else if (s.contains("FSIII-MODEL"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to PDF:FSIII-MODEL");
        try
        {
          Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler FSIII-Model.pdf");
        }
        catch (Exception e)
        {
          javax.swing.JOptionPane.showMessageDialog(null, "Error");
        }
      }
      else if (s.contains("FSIV-MODEL"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to PDF:FSIV-MODEL");
        try
        {
          Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler FSIV-Model.pdf");
        }
        catch (Exception e)
        {
          javax.swing.JOptionPane.showMessageDialog(null, "Error");
        }
      }
      else if (s.contains("FSV-MODEL"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to PDF:FSV-MODEL");
        try
        {
          Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler FSV-Model.pdf");
        }
        catch (Exception e)
        {
          javax.swing.JOptionPane.showMessageDialog(null, "Error");
        }
      }
      else if (s.contains("FSVI-MODEL"))
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Welcome to PDF:FSVI-MODEL");
        try
        {
          Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler FSVI-Model.pdf");
        }
        catch (Exception e)
        {
          javax.swing.JOptionPane.showMessageDialog(null, "Error");
        }
      }
    }
  }
  

  private javax.swing.JSplitPane jSplitPane1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JToggleButton jToggleButton1;
  private JMenuItem print;
  private JMenuItem save;
  private JMenuItem signout;
  public static void main(String[] args)
  {
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    


    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run() {
        new Homepage().setVisible(true);
      }
    });
  }
}
