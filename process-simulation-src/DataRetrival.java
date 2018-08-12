package process_simulation;

import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class DataRetrival extends javax.swing.JFrame
{
  private JButton Back;
  private javax.swing.JTable DRtable;
  private javax.swing.JTextField EData;
  private JButton Edit;
  private JComboBox Element;
  private JButton Enter;
  private JComboBox Module;
  private JButton View;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane2;
  
  public DataRetrival()
  {
    initComponents();
    jPanel2.setVisible(false);
  }
  







  private void initComponents()
  {
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    Module = new JComboBox();
    Element = new JComboBox();
    EData = new javax.swing.JTextField();
    Enter = new JButton();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    DRtable = new javax.swing.JTable();
    View = new JButton();
    Edit = new JButton();
    Back = new JButton();
    
    setDefaultCloseOperation(3);
    setResizable(false);
    
    jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    Module.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Pressure Filter", "DM Plant", "Softening Plant" }));
    Module.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DataRetrival.this.ModuleActionPerformed(evt);
      }
      
    });
    Enter.setText("Enter");
    Enter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DataRetrival.this.EnterActionPerformed(evt);
      }
      
    });
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(129, 129, 129).addComponent(jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(28, 28, 28).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(Enter).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(Module, 0, 143, 32767).addComponent(Element, 0, -1, 32767).addComponent(EData))))).addContainerGap(184, 32767)));
    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, -2, 30, -2).addGap(28, 28, 28).addComponent(Module, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(Element, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(EData, -2, -1, -2).addGap(18, 18, 18).addComponent(Enter).addContainerGap(-1, 32767)));
    DRtable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
    jScrollPane2.setViewportView(DRtable);    
    View.setText("View");
    View.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DataRetrival.this.ViewActionPerformed(evt);
      }      
    });
    Edit.setText("Edit");
    Edit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DataRetrival.this.EditActionPerformed(evt);
      }      
    });
    GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(18, 32767).addComponent(jScrollPane2, -2, -1, -2).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGap(73, 73, 73).addComponent(View, -2, 112, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(Edit, -2, 122, -2).addGap(50, 50, 50)));
    jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(jScrollPane2, -2, 85, -2).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(View).addComponent(Edit)).addContainerGap(24, 32767)));
    Back.setText("Back");
    Back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DataRetrival.this.BackActionPerformed(evt);
      }      
    });
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1, -2, -1, -2).addComponent(jPanel2, -2, -1, -2).addComponent(Back, -2, 88, -2)).addContainerGap(-1, 32767)));
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jPanel1, -2, -1, -2).addGap(18, 18, 18).addComponent(jPanel2, -1, -1, 32767).addGap(18, 18, 18).addComponent(Back).addContainerGap(27, 32767)));
    pack();
  }
  
  private void ModuleActionPerformed(ActionEvent evt)
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
      
      String item = Module.getSelectedItem().toString();
      java.sql.ResultSet rs;
      switch (item) {
      case "Pressure Filter": 
        Element.removeAllItems();
        String query1 = "SELECT * FROM data";
        java.sql.Statement stmt = conn.createStatement();
        rs = stmt.executeQuery(query1);
      case "DM Plant": case "Softening Plant":  while (rs.next())
        {
          String s = rs.getString("pf");
          Element.addItem(s); continue;          
          Element.removeAllItems();
          String query2 = "SELECT * FROM data";
          java.sql.Statement stmt2 = conn.createStatement();
          java.sql.ResultSet rs2 = stmt2.executeQuery(query2);
          while (rs2.next())
          {
            s = rs2.getString("DM_plant");
            Element.addItem(s); continue;
            Element.removeAllItems();
            String query3 = "SELECT * FROM data";
            java.sql.Statement stmt3 = conn.createStatement();
            java.sql.ResultSet rs3 = stmt3.executeQuery(query3);
            while (rs3.next())
            {
              s = rs3.getString("Softening_plant");
              Element.addItem(s);
            }
          }
        }
      }
    }
    catch (ClassNotFoundException|java.sql.SQLException e) {
      javax.swing.JOptionPane.showMessageDialog(null, "Error in connection" + e);
    }
  }
  
  private void EnterActionPerformed(ActionEvent evt) {
    jPanel2.setVisible(true);
    String item = Module.getSelectedItem().toString();
    String ele = Element.getSelectedItem().toString();    
    String in = EData.getText();
    java.sql.PreparedStatement ps = null;
    if ("".equals(item))
    {
      javax.swing.JOptionPane.showMessageDialog(null, "Please enter the Module");
    }
    else
    {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
        String query;
        String query; switch (item)
        {
        case "Pressure Filter": 
          if ("".equals(in))
          {
            String query = "SELECT * FROM `pf_info`";
            ps = conn.prepareStatement(query);

          }
          else
          {
            query = "SELECT * FROM `pf_info` WHERE $column=?";
            query = query.replace("$column", ele);
            ps = conn.prepareStatement(query);
            ps.setString(1, in);
          }
          break;
        

        case "DM Plant": 
          if ("".equals(in))
          {
            query = "SELECT * FROM `dm-info`";
            ps = conn.prepareStatement(query);

          }
          else
          {
            query = "SELECT * FROM `dm-info` WHERE $column=?";
            query = query.replace("$column", ele);
            ps = conn.prepareStatement(query);
            ps.setString(1, in);
          }
          break;
        
        case "Softening Plant": 
          if ("".equals(in))
          {
            query = "SELECT * FROM `sp-info`";
            ps = conn.prepareStatement(query);

          }
          else
          {
            String query = "SELECT * FROM dm WHERE $column=?";
            query = query.replace("$column", ele);
            ps = conn.prepareStatement(query);
            ps.setString(1, in);
          }
          
          break;
        }
        
        
        java.sql.ResultSet rs = ps.executeQuery();
        java.sql.ResultSetMetaData rsmd = rs.getMetaData();
        int columns = rsmd.getColumnCount();
        
        javax.swing.table.DefaultTableModel dtm = new javax.swing.table.DefaultTableModel();
        java.util.Vector column_name = new java.util.Vector();
        java.util.Vector data_rows = new java.util.Vector();
        
        for (int i = 1; i <= columns; i++)
        {
          column_name.addElement(rsmd.getColumnName(i));
        }
        dtm.setColumnIdentifiers(column_name);
        
        while (rs.next())
        {
          data_rows = new java.util.Vector();
          
          for (int j = 1; j <= columns; j++)
          {
            data_rows.addElement(rs.getString(j));
          }
          dtm.addRow(data_rows);
        }
        DRtable.setModel(dtm);
      }
      catch (ClassNotFoundException|java.sql.SQLException e)
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Error in connection" + e);
      }
    }
  }
  
  private void ViewActionPerformed(ActionEvent evt) {
    int selRow = DRtable.getSelectedRow();
    String item = Module.getSelectedItem().toString();
    String value = String.valueOf(DRtable.getModel().getValueAt(selRow, 1));
    if (selRow == -1)
    {
      javax.swing.JOptionPane.showMessageDialog(null, "Select a Row");
    }
    else
    {
      switch (item) {
      case "Pressure Filter": 
        setVisible(false);
        Pf_view n = new Pf_view(value);
        n.setVisible(true);
        break;
      
      case "DM Plant": 
        setVisible(false);
        DMview d = new DMview(value);
        d.setVisible(true);
        break;
      
      case "Softening Plant": 
        setVisible(false);
        SPview s = new SPview(value);
        s.setVisible(true);
      }
    }
  }
  
  private void EditActionPerformed(ActionEvent evt)
  {
    int selRow = DRtable.getSelectedRow();
    String item = Module.getSelectedItem().toString();
    String value = String.valueOf(DRtable.getModel().getValueAt(selRow, 1));
    if (selRow == -1)
    {
      javax.swing.JOptionPane.showMessageDialog(null, "Select a Row");

    }
    else
    {
      switch (item) {
      case "Pressure Filter": 
        setVisible(false);
        Pf_edit pe = new Pf_edit(value);
        pe.setVisible(true);
        break;
      case "DM Plant": 
        setVisible(false);
        DMedit de = new DMedit(value);
        de.setVisible(true);
        break;      
      case "Softening Plant": 
        setVisible(false);
        SP_edit sp = new SP_edit(value);
        sp.setVisible(true);
      }
    }
  }
  
  private void BackActionPerformed(ActionEvent evt)
  {
    Homepage h = new Homepage();
    h.setVisible(true);
    setVisible(false);
  }
  
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
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DataRetrival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run() {
        new DataRetrival().setVisible(true);
      }
    });
  }
}
