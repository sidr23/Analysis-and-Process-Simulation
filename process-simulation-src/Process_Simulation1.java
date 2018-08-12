package process_simulation;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.SequentialGroup;

public class Process_Simulation1 extends javax.swing.JFrame
{
  private javax.swing.JButton Back;
  private javax.swing.JButton Enter;
  private javax.swing.JButton Image;
  private javax.swing.JTextField height;
  private javax.swing.JTextField ih;
  private javax.swing.JTextField iv;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea output;
  private javax.swing.JPanel p2;
  
  public Process_Simulation1()
  {
    initComponents();
  }
  







  private void initComponents()
  {
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    iv = new javax.swing.JTextField();
    ih = new javax.swing.JTextField();
    height = new javax.swing.JTextField();
    Enter = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    output = new javax.swing.JTextArea();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    Back = new javax.swing.JButton();
    Image = new javax.swing.JButton();
    p2 = new javax.swing.JPanel();
    
    setDefaultCloseOperation(3);
    
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input", 0, 0, null, new java.awt.Color(255, 0, 51)));
    
    jLabel1.setText("Initial Velocity(O)");
    
    jLabel2.setText("Initial Height");
    
    jLabel3.setText("Height of Tank");
    
    Enter.setText("Enter");
    Enter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Process_Simulation1.this.EnterActionPerformed(evt);
      }
      
    });
    output.setColumns(20);
    output.setRows(5);
    jScrollPane1.setViewportView(output);
    
    jLabel4.setText("m");
    
    jLabel5.setText("m");
    
    Back.setText("Back");
    Back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Process_Simulation1.this.BackActionPerformed(evt);
      }
      
    });
    Image.setText("Image");
    Image.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Process_Simulation1.this.ImageActionPerformed(evt);
      }
      
    });
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jScrollPane1).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel1).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(Back, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, -1, -1, 32767))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(iv, -2, 81, -2).addComponent(ih, -2, 81, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel4)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(height, -2, 81, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5))).addGap(0, 0, 32767)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, 32767).addComponent(Image).addGap(18, 18, 18).addComponent(Enter, -2, 72, -2))))).addContainerGap()));
    

































    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(iv, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(ih, -2, -1, -2).addComponent(jLabel4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(height, -2, -1, -2).addComponent(jLabel5)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Enter).addComponent(Back).addComponent(Image)).addGap(18, 18, 18).addComponent(jScrollPane1, -1, 227, 32767).addContainerGap()));
    

























    p2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output", 0, 0, null, new java.awt.Color(0, 0, 204)));
    
    GroupLayout p2Layout = new GroupLayout(p2);
    p2.setLayout(p2Layout);
    p2Layout.setHorizontalGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 380, 32767));
    


    p2Layout.setVerticalGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
    



    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(p2, -1, -1, 32767).addContainerGap()));
    







    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(p2, -1, -1, 32767).addComponent(jPanel1, -1, -1, 32767)).addContainerGap()));
    








    pack();
  }
  
  private void EnterActionPerformed(java.awt.event.ActionEvent evt) {
    output.setText("");
    p2.removeAll();
    double[] h = new double['É'];
    double[] v = new double['É'];
    double[] hdot = new double['È'];
    double[] vdot = new double['È'];
    
    h[0] = Double.parseDouble(ih.getText());
    v[0] = Double.parseDouble(iv.getText());
    int t = Integer.parseInt(height.getText());
    
    boolean x = false;
    int delta = 1;
    int[] time = new int['É'];
    time[0] = 0;
    for (int i = 1; i < 201; i++)
    {
      vdot[(i - 1)] = (0.0107D * h[(i - 1)] - 0.00205D * v[(i - 1)] * v[(i - 1)]);
      hdot[(i - 1)] = (0.311D - 0.0624D * v[(i - 1)]);
      h[i] = (h[(i - 1)] + hdot[(i - 1)] * delta);
      h[i] = (Math.round(h[i] * 1000.0D) / 1000.0D);
      v[i] = (v[(i - 1)] + vdot[(i - 1)] * delta);
      v[i] = (Math.round(v[i] * 1000.0D) / 1000.0D);
      time[i] = (time[(i - 1)] + delta);
      if ((h[i] > t) && (x != true))
      {
        x = true;
      }
    }
    String a1 = "Time\tVelocity\tHeight\n";
    output.append(a1);
    for (int i = 0; i < 201; i += 20)
    {
      String a2 = time[i] + "\t" + v[i] + "\t" + h[i] + "\n";
      output.append(a2);
    }
    if (x) {
      output.append("Tank overflow occurs");
    } else {
      output.append("Tank overflow does not occur");
    }
    
    org.jfree.data.xy.XYSeries series = new org.jfree.data.xy.XYSeries("Gravity Flow Tank");
    for (int i = 0; i < 201; i++)
    {
      int t1 = time[i];
      double h1 = h[i];
      series.add(t1, h1);
    }
    org.jfree.data.xy.XYSeriesCollection dataset = new org.jfree.data.xy.XYSeriesCollection();
    dataset.addSeries(series);
    org.jfree.chart.JFreeChart chart = org.jfree.chart.ChartFactory.createXYLineChart("Gravity Flow Tank", "Time", "Height", dataset, org.jfree.chart.plot.PlotOrientation.VERTICAL, true, false, false);
    chart.getXYPlot().setRenderer(new org.jfree.chart.renderer.xy.XYSplineRenderer());
    



    p2.setLayout(new java.awt.BorderLayout());
    org.jfree.chart.ChartPanel cp = new org.jfree.chart.ChartPanel(chart);
    p2.add(cp, "Center");
    p2.validate();
  }
  
  private void BackActionPerformed(java.awt.event.ActionEvent evt) {
    setVisible(false);
    Homepage h = new Homepage();
    h.setVisible(true);
  }
  
  private void ImageActionPerformed(java.awt.event.ActionEvent evt) {
    GFTank gf = new GFTank();
    gf.setVisible(true);
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
      java.util.logging.Logger.getLogger(Process_Simulation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Process_Simulation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Process_Simulation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Process_Simulation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Process_Simulation1().setVisible(true);
      }
    });
  }
}
