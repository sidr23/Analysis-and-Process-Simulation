package process_simulation;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;

public class SetData extends javax.swing.JFrame
{
  private javax.swing.JPasswordField confirm;
  private javax.swing.JButton enter;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPasswordField new_pass;
  private javax.swing.JPasswordField old_pass;
  private javax.swing.JButton skip;
  
  public SetData()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    jLabel5 = new JLabel();
    old_pass = new javax.swing.JPasswordField();
    new_pass = new javax.swing.JPasswordField();
    confirm = new javax.swing.JPasswordField();
    enter = new javax.swing.JButton();
    skip = new javax.swing.JButton();
    
    setDefaultCloseOperation(3);
    setResizable(false);
    
    jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setText("DATA RETRIEVAL PASSWORD");
    
    jLabel3.setText("OLD PASSWORD");
    
    jLabel4.setText("NEW PASSWORD");
    
    jLabel5.setText("CONFIRM NEW PASSWORD");
    
    enter.setText("Enter");
    enter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SetData.this.enterActionPerformed(evt);
      }
      
    });
    skip.setText("Skip");
    skip.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SetData.this.skipActionPerformed(evt);
      }
      
    });
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(jLabel5, GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel3).addComponent(jLabel4)).addGap(68, 68, 68).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(new_pass).addComponent(old_pass).addComponent(confirm, -2, 115, -2))).addGroup(jPanel1Layout.createSequentialGroup().addGap(66, 66, 66).addComponent(skip, -2, 76, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(enter, -2, 76, -2))).addGroup(jPanel1Layout.createSequentialGroup().addGap(66, 66, 66).addComponent(jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(106, 106, 106).addComponent(jLabel2))).addContainerGap(80, 32767)));
    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2, -2, 14, -2).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(old_pass, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(new_pass, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(confirm, -2, -1, -2)).addGap(26, 26, 26).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(enter).addComponent(skip)).addContainerGap(67, 32767)));   
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addComponent(jPanel1, -1, -1, 32767).addContainerGap()));
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addComponent(jPanel1, -1, -1, 32767).addContainerGap()));
    pack();
  }
  
  private void enterActionPerformed(java.awt.event.ActionEvent evt) {
    boolean present = false;
    
    String old = new String(old_pass.getPassword());
    String pass = new String(new_pass.getPassword());
    String con = new String(confirm.getPassword());
    if (old.equals("")) {
      javax.swing.JOptionPane.showMessageDialog(null, "enter the old password");
    } else if (pass.equals("")) {
      javax.swing.JOptionPane.showMessageDialog(null, "enter the new password");
    } else if (con.equals("")) {
      javax.swing.JOptionPane.showMessageDialog(null, "enter the confirm password");
    }
    else if (pass.equals(con))
    {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");
        
        String query1 = "SELECT * FROM register;";
        java.sql.Statement stmt = conn.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery(query1);
        while (rs.next())
        {
          String user1 = rs.getString("username");
          String pass1 = rs.getString("password");
          if ((user1.equals("data_retrival")) && (pass1.equals(old)))
          {
            present = true;
          }
        }
        if (present)
        {
          String query2 = "UPDATE `register` SET `password`=? WHERE username=?;";
          java.sql.PreparedStatement stmt1 = conn.prepareStatement(query2);
          stmt1.setString(1, pass);
          stmt1.setString(2, "data_retrival");
          stmt1.executeUpdate();
          javax.swing.JOptionPane.showMessageDialog(null, "Successfully updated!");
          setVisible(false);
          Homepage menu = new Homepage();
          menu.setVisible(true);
        }
        else
        {
          javax.swing.JOptionPane.showMessageDialog(null, "Incorrect password");
        }
      }
      catch (ClassNotFoundException|java.sql.SQLException e)
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Error in connection");
      }      
    }
    else {
      javax.swing.JOptionPane.showMessageDialog(null, "the new password and confirm password doesnot matches");
    }
  }
  
  private void skipActionPerformed(java.awt.event.ActionEvent evt)
  {
    setVisible(false);
    Homepage menu = new Homepage();
    menu.setVisible(true);
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
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(SetData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SetData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SetData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SetData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new SetData().setVisible(true);
      }
    });
  }
}
