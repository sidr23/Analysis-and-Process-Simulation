package process_simulation;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Check_password extends javax.swing.JFrame
{
  private JButton enter;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPasswordField password;
  
  public Check_password()
  {
    initComponents();
    setDefaultCloseOperation(2);
  }
  







  private void initComponents()
  {
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    password = new javax.swing.JPasswordField();
    enter = new JButton();
    
    setDefaultCloseOperation(3);
    setResizable(false);
    
    jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setText("PASSWORD FOR DATA RETRIEVAL");
    
    jLabel3.setText("ENTER PASSWORD");
    
    enter.setText("Enter");
    enter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Check_password.this.enterActionPerformed(evt);
      }
      
    });
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(42, 42, 42).addComponent(jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(67, 67, 67).addComponent(jLabel2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(password, -2, 155, -2).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(enter, -2, 77, -2).addGap(41, 41, 41))))).addContainerGap(28, 32767)));
    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel2).addGap(25, 25, 25).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(password, -2, -1, -2)).addGap(18, 18, 18).addComponent(enter).addContainerGap()));
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -1, -1, 32767).addContainerGap()));
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
    pack();
  }
  
  private void enterActionPerformed(java.awt.event.ActionEvent evt) {
    boolean present = false;    
    String pass = new String(password.getPassword());    
    if (pass.equals("")) {
      javax.swing.JOptionPane.showMessageDialog(null, "enter the password");
    }
    else
    {
      try
      {
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/project", "factorengg", "thane");        
        String query1 = "SELECT * FROM register;";
        java.sql.Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query1);
        while (rs.next())
        {
          String user1 = rs.getString("username");
          String pass1 = rs.getString("password");
          if ((user1.equals("data_retrival")) && (pass.equals(pass1)))
          {
            present = true;
          }
        }
        if (present)
        {
          javax.swing.JOptionPane.showMessageDialog(null, "Welcome to DATA VIEW section!");
          setVisible(false);
          DataRetrival dr = new DataRetrival();
          dr.setVisible(true);
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
      Logger.getLogger(Check_password.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      Logger.getLogger(Check_password.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      Logger.getLogger(Check_password.class.getName()).log(Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      Logger.getLogger(Check_password.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Check_password().setVisible(true);
      }
    });
  }
}
