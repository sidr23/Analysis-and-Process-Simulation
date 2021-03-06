package process_simulation;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;
import javax.swing.UIManager.LookAndFeelInfo;

public class BatchReactor extends javax.swing.JFrame
{
  private JLabel jLabel1;
  
  public BatchReactor()
  {
    initComponents();
    setDefaultCloseOperation(2);
  }
  
  private void initComponents()
  {
    jLabel1 = new JLabel();
    
    setDefaultCloseOperation(3);
    setResizable(false);
    
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/process_simulation/batch-reactor.JPG")));
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addContainerGap(-1, 32767)));
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addContainerGap(-1, 32767)));
    pack();
  }

  public static void main(String[] args)
  {
    try
    {
      for (UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(BatchReactor.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      Logger.getLogger(BatchReactor.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      Logger.getLogger(BatchReactor.class.getName()).log(Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      Logger.getLogger(BatchReactor.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new BatchReactor().setVisible(true);
      }
    });
  }
}
