package process_simulation;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Register extends javax.swing.JFrame
{
  private javax.swing.JButton Register;
  private JPasswordField confirm_password;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JPasswordField password;
  private javax.swing.JTextField username;
  
  public Register()
  {
    initComponents();
  }
  







  private void initComponents()
  {
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    username = new javax.swing.JTextField();
    Register = new javax.swing.JButton();
    password = new JPasswordField();
    confirm_password = new JPasswordField();
    
    setDefaultCloseOperation(3);
    setResizable(false);
    
    jLabel1.setFont(new Font("Courier New", 0, 18));
    jLabel1.setText("FACTOR ENGINEERING PVT LTD");
    
    jLabel2.setFont(new Font("Tahoma", 0, 12));
    jLabel2.setText("USER NAME");
    
    jLabel3.setText("PASSWORD");
    
    jLabel4.setFont(new Font("Tahoma", 0, 12));
    jLabel4.setText("CONFIRM PASSWORD");
    
    username.setFont(new Font("Tahoma", 0, 12));
    
    Register.setFont(new Font("Tahoma", 0, 12));
    Register.setText("Register");
    Register.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Register.this.RegisterActionPerformed(evt);
      }
      
    });
    password.setFont(new Font("Tahoma", 0, 12));
    
    confirm_password.setFont(new Font("Tahoma", 0, 12));
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(39, 39, 39).addComponent(jLabel1, -2, 328, -2)).addGroup(layout.createSequentialGroup().addGap(30, 30, 30).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(Register).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel4).addComponent(jLabel3).addComponent(jLabel2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(username).addComponent(password).addComponent(confirm_password, -1, 134, 32767)))))).addContainerGap(33, 32767)));    
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, -2, 35, -2).addGap(38, 38, 38).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2, -2, 29, -2).addComponent(username, -2, 29, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(jLabel3, -1, -1, 32767).addComponent(password, -1, 32, 32767)).addGap(1, 1, 1).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel4, -2, 38, -2).addGroup(layout.createSequentialGroup().addGap(4, 4, 4).addComponent(confirm_password, -2, 34, -2))).addGap(18, 18, 18).addComponent(Register).addContainerGap(71, 32767)));   
    pack();
  }
  
  private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {
    boolean present = false;    
    String user = username.getText();
    String pass = new String(password.getPassword());
    String confirm = new String(confirm_password.getPassword());
    if (user.equals("")) {
      JOptionPane.showMessageDialog(null, "enter the user name");
    } else if (pass.equals("")) {
      JOptionPane.showMessageDialog(null, "enter the password");
    } else if (confirm.equals("")) {
      JOptionPane.showMessageDialog(null, "enter the confirm password");
    }
    else if (pass.equals(confirm))
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
          if (user.equals(user1))
          {
            present = true;
          }
        }
        if (present)
        {
          JOptionPane.showMessageDialog(null, "User already present");
        }
        else
        {
          String query2 = "INSERT INTO register(`username`, `password`) VALUES (?,?);";
          java.sql.PreparedStatement stmt1 = conn.prepareStatement(query2);
          stmt1.setString(1, user);
          stmt1.setString(2, pass);
          stmt1.executeUpdate();
          JOptionPane.showMessageDialog(null, "Success!");
          setVisible(false);
          Homepage menu = new Homepage();
          menu.setVisible(true);
        }
      }
      catch (ClassNotFoundException|java.sql.SQLException e)
      {
        JOptionPane.showMessageDialog(null, "Error in connection");
      }      
    }
    else {
      JOptionPane.showMessageDialog(null, "Password does not match");
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
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run() {
        new Register().setVisible(true);
      }
    });
  }
}
