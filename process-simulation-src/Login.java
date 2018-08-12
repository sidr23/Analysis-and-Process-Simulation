package process_simulation;

import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;

public class Login extends javax.swing.JFrame implements java.awt.event.ActionListener
{
  private javax.swing.JButton Login;
  private javax.swing.JButton Register;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private javax.swing.JPasswordField password;
  private javax.swing.JTextField username;
  
  public Login()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    password = new javax.swing.JPasswordField();
    username = new javax.swing.JTextField();
    Login = new javax.swing.JButton();
    Register = new javax.swing.JButton();
    
    setDefaultCloseOperation(3);
    setCursor(new java.awt.Cursor(0));
    setResizable(false);
    
    jLabel1.setFont(new java.awt.Font("Courier New", 0, 18));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
    jLabel2.setText("USER NAME");
    
    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
    jLabel3.setText("PASSWORD");
    
    password.setToolTipText("please enter the passord");
    
    username.setToolTipText("please enter the user name");
    
    Login.setText("Login");
    Login.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Login.this.LoginActionPerformed(evt);
      }
      
    });
    Register.setText("Register");
    Register.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Login.this.RegisterActionPerformed(evt);
      }      
    });
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(jLabel1, -2, 334, -2).addGap(36, 36, 36)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel3, -2, 86, -2).addComponent(jLabel2, -2, 86, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(password, -1, 134, 32767).addComponent(username))).addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addComponent(Register).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, 32767).addComponent(Login, -2, 73, -2))).addGap(146, 146, 146)))));    
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(31, 31, 31).addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2, -2, 28, -2).addComponent(username, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3, -2, 26, -2).addComponent(password, -2, -1, -2)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Login).addComponent(Register)).addContainerGap(187, 32767)));    
    pack();
  }
  
  private void LoginActionPerformed(ActionEvent evt)
  {
    boolean present = false;
    
    String user = username.getText();
    String pass = new String(password.getPassword());
    
    if (user.equals("")) {
      javax.swing.JOptionPane.showMessageDialog(null, "enter the user name");
    } else if (pass.equals("")) {
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
        java.sql.ResultSet rs = stmt.executeQuery(query1);
        while (rs.next())
        {
          String user1 = rs.getString("username");
          String pass1 = rs.getString("password");
          if ((user.equals(user1)) && (pass.equals(pass1)))
          {
            present = true;
          }
        }
        if (present)
        {
          javax.swing.JOptionPane.showMessageDialog(null, "Success!");
          if (user.equals("admin"))
          {
            setVisible(false);
            SetData sd = new SetData();
            sd.setVisible(true);
          }
          else
          {
            setVisible(false);
            Homepage menu = new Homepage();
            menu.setVisible(true);
          }
        }
        else
        {
          javax.swing.JOptionPane.showMessageDialog(null, "Incorrect userid or password");
        }        
      }
      catch (ClassNotFoundException|java.sql.SQLException e)
      {
        javax.swing.JOptionPane.showMessageDialog(null, "Error in connection");
      }
    }
  }
  
  private void RegisterActionPerformed(ActionEvent evt)
  {
    Register r = new Register();
    r.setVisible(true);
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
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run() {
        new Login().setVisible(true);
      }
    });
  }
  
  public void actionPerformed(ActionEvent e)
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
