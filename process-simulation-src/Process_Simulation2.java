package process_simulation;

import java.awt.event.ActionEvent;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Process_Simulation2 extends javax.swing.JFrame
{
  XYSeries series1 = new XYSeries("CA value");
  XYSeries series2 = new XYSeries("CB value");
  XYSeries series3 = new XYSeries("xs value");
  XYSeries series4 = new XYSeries("xw value");
  XYSeries series5 = new XYSeries("Temperature");
  XYSeries series6 = new XYSeries("TM value");
  XYSeries series7 = new XYSeries("TJ value");
  XYSeries series8 = new XYSeries("QJ value");
  XYSeries series9 = new XYSeries("QM value");
  
  double a1;
  
  double a2;
  
  double AVP = -8744.4D;
  double BVP = 15.7D;
  double delta = 0.002D;
  int kc = 2;
  double CA;
  double CB = 0.0D;
  double time = 0.0D;
  double qm = 0.0D;
  double T = 80.0D;
  double TM = 80.0D;
  double TJ = 259.0D;
  double Pj = 34.4D;
  double dens = 18.0D * Pj * 144.0D / (1545.0D * (TJ + 460.0D));
  double pset = 12.6D;
  int start = 1;
  double fwo = 0.0D;
  int full = -1;
  double vj = 0.0D;
  double vjtj = 0.0D;
  int tflag = 0;
  int flagp; int flagm; int cam = -1;
  double ramp = 0.005D;
  int tprint = 1;
  int loop;
  double k1;
  
  public Process_Simulation2() { initComponents(); }
  
  double k2;
  double ptt;
  double pc;
  double xs;
  double xw;
  double ws;
  double wc;
  double a0;
  double qj;
  double CADOT;
  
  private void initComponents() { jLabel1 = new JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    CA1 = new JTextField();
    a11 = new JTextField();
    a22 = new JTextField();
    Enter = new JButton();
    Back = new JButton();
    Image = new JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    output = new JTextArea();
    
    setDefaultCloseOperation(3);
    
    jLabel1.setText("BATCH REACTOR");
    
    jLabel2.setText("CA VALUE");
    
    jLabel3.setText("VALUE OF A1");
    
    jLabel4.setText("VALUE OF A2");
    
    Enter.setText("Enter");
    Enter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Process_Simulation2.this.EnterActionPerformed(evt);
      }
      
    });
    Back.setText("Back");
    Back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Process_Simulation2.this.BackActionPerformed(evt);
      }
      
    });
    Image.setText("Image");
    Image.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Process_Simulation2.this.ImageActionPerformed(evt);
      }
      
    });
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel4)).addGap(29, 29, 29).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(CA1).addComponent(a11).addComponent(a22, -2, 75, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(Enter, -1, 73, 32767).addComponent(Back, -1, -1, 32767).addComponent(Image, -1, -1, 32767)).addContainerGap(85, 32767)));
    


















    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(CA1, -2, -1, -2).addComponent(Enter)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(a11, -2, -1, -2).addComponent(Image)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(a22, -2, -1, -2).addComponent(Back)).addGap(38, 38, 38)));
    



















    output.setColumns(20);
    output.setRows(5);
    jScrollPane1.setViewportView(output);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(191, 191, 191).addComponent(jLabel1)).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jScrollPane1, -2, 419, -2).addComponent(jPanel1, -2, -1, -2)))).addContainerGap(21, 32767)));
    












    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addComponent(jLabel1).addGap(18, 18, 18).addComponent(jPanel1, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane1, -1, 199, 32767).addContainerGap()));
    










    pack();
  }
  
  private void EnterActionPerformed(ActionEvent evt)
  {
    CA = Double.parseDouble(CA1.getText());
    a1 = Double.parseDouble(a11.getText());
    a2 = Double.parseDouble(a22.getText());
    output.setText("");
    String a = "time\tCA\tCB\txs\txw\tT\tTM\tTJ\tfwo\tqj\tqm\n";
    output.append(a);
    initials();
  }
  
  private void BackActionPerformed(ActionEvent evt) {
    setVisible(false);
    Homepage h = new Homepage();
    h.setVisible(true);
  }
  
  private void ImageActionPerformed(ActionEvent evt) {
    BatchReactor br = new BatchReactor();
    br.setVisible(true);
  }
  
  public void initials()
  {
    for (int i = 0; i < 10000; i++)
    {
      k1 = (a1 * Math.exp(-15000.0D / (1.99D * (T + 460.0D))));
      k2 = (a2 * Math.exp(-20000.0D / (1.99D * (T + 460.0D))));
      
      ptt = (3.0D + (T - 50.0D) * 12.0D / 200.0D);
      
      pc = (7.0D + kc * (pset - ptt));
      if (pc > 15.0D) {
        pc = 15.0D;
      } else if (pc < 3.0D) {
        pc = 3.0D;
      }
      xs = ((pc - 9.0D) / 6.0D);
      xw = ((9.0D - pc) / 6.0D);
      if (xs > 1.0D) {
        xs = 1.0D;
      } else if (xs < 0.0D)
        xs = 0.0D;
      if (xw > 1.0D) {
        xw = 1.0D;
      } else if (xw < 0.0D)
        xw = 0.0D;
      boolean x;
      boolean x; if (start < 0) {
        x = jacketTest(); } else { boolean x;
        if (Pj > 35.0D)
        {
          ws = 0.0D;
          x = temPre();
        }
        else
        {
          ws = (xs * 112.0D * Math.sqrt(35.0D - Pj));
          x = temPre();
        } }
      if (x != true) {
        break;
      }
    }
  }
  

  public boolean jacketTest()
  {
    fwo = (100.0D * Math.sqrt(20.0D) * 8.33D * xw / 62.3D);
    ws = 0.0D;wc = 0.0D;dens = 0.0D;Pj = 0.0D;xs = 0.0D;
    boolean x; boolean x; if (full > 0)
    {
      x = jacketFull();

    }
    else
    {

      a0 = (vj * 56.5D / 18.83D);
      vj += delta * fwo;
      if (vj >= 18.83D)
        full = 1;
      qj = (400.0D * a0 * (TM - TJ) / 60.0D);
      vjtj += delta * (fwo * 80.0D + qj);
      boolean x; if (vj <= 0.0D)
      {
        TJ = 80.0D;
        x = derivateValue();

      }
      else
      {
        TJ = (vjtj / vj);
        x = derivateValue();
      }
    }
    
    return x;
  }
  
  public boolean derivateValue()
  {
    boolean x = true;
    CADOT = (-k1 * CA);
    CBDOT = (k1 * CA - k2 * CB);
    qm = (9040.0D * (T - TM) / 60.0D);
    
    TDOT = ((k1 * CA * 40000.0D + k2 * CB * 50000.0D) / 50.0D - qm / 2120.0D);
    TMDOT = ((qm - qj) / 578.7647999999999D);
    


    time += delta;
    CA += CADOT * delta;
    CB += CBDOT * delta;
    T += TDOT * delta;
    TM += TMDOT * delta;
    if (T > 300.0D)
    {
      x = endProgram();
    }
    
    if (T > 200.0D)
      start = -1;
    if (T > 200.0D)
      cam = 1;
    if (cam > 0)
      pset -= delta * ramp;
    if (time > 100.0D)
    {
      x = endProgram();
    }
    

    if (time >= tflag)
    {


      x = display();
    }
    
    return x;
  }
  

  public boolean jacketFull()
  {
    qj = (22600.0D * (TM - TJ) / 60.0D);
    tprint = 2;
    delta = 0.05D;
    TJDOT = (fwo * (80.0D - TJ) / 18.83D + qj / 1173.109D);
    TJ += delta * TJDOT;
    boolean x = derivateValue();
    return x;
  }
  

  public boolean temPre()
  {
    qj = (-56500.0D * (TJ - TM) / 60.0D);
    wc = (-qj / 939.0D);
    DENDOT = ((ws - wc) / 18.83D);
    dens += delta * DENDOT;
    
    flagm = -1;
    flagp = -1;
    DTJ = 1.0D;
    loop = 0;
    boolean x = pressureCalc();
    return x;
  }
  

  public boolean pressureCalc()
  {
    Pj = Math.exp(BVP + AVP / (TJ + 460.0D));
    loop += 1;
    boolean x; boolean x; if (loop > 50)
    {
      x = display();

    }
    else
    {
      DCALC = (18.0D * Pj * 144.0D / (1545.0D * (TJ + 460.0D)));
      boolean x;
      if (Math.abs(dens - DCALC) < 0.0011D)
      {
        x = derivateValue();
      }
      else {
        boolean x;
        if (dens > DCALC)
        {
          x = calc1718();
        }
        else {
          boolean x;
          if (flagm < 0)
          {
            TJ -= DTJ;
            flagp = 1;
            x = pressureCalc();

          }
          else
          {
            DTJ /= 2.0D;
            TJ -= DTJ;
            flagp = 1;
            x = pressureCalc();
          }
        }
      } }
    return x;
  }
  
  public boolean calc1718()
  {
    if (flagp >= 0)
    {



      DTJ /= 2.0D;
    }
    TJ += DTJ;
    flagm = 1;
    boolean x = pressureCalc();
    return x;
  }
  

  public boolean display()
  {
    try
    {
      time = (Math.round(time * 1000.0D) / 1000.0D);
      CA = (Math.round(CA * 1000.0D) / 1000.0D);
      CB = (Math.round(CB * 1000.0D) / 1000.0D);
      xs = (Math.round(xs * 1000.0D) / 1000.0D);
      xw = (Math.round(xw * 1000.0D) / 1000.0D);
      T = (Math.round(T * 1000.0D) / 1000.0D);
      TM = (Math.round(TM * 1000.0D) / 1000.0D);
      TJ = (Math.round(TJ * 1000.0D) / 1000.0D);
      fwo = (Math.round(fwo * 1000.0D) / 1000.0D);
      qj = (Math.round(qj * 1000.0D) / 1000.0D);
      qm = (Math.round(qm * 1000.0D) / 1000.0D);
      if (time < 100.05D)
      {

        String b = time + "\t" + CA + "\t" + CB + "\t" + xs + "\t" + xw + "\t" + T + "\t" + TM + "\t" + TJ + "\t" + fwo + "\t" + qj + "\t" + qm + "\n";
        output.append(b);
        series1.add(time, CA);
        series2.add(time, CB);
        series3.add(time, xs);
        series4.add(time, xw);
        series5.add(time, T);
        series6.add(time, TM);
        series7.add(time, TJ);
        series8.add(time, qj);
        series9.add(time, qm);
      }
      

    }
    catch (Exception e)
    {
      System.out.println(e);
    }
    tflag += tprint;
    return true; }
  
  double CBDOT;
  double TDOT;
  double TMDOT;
  double TJDOT;
  
  public boolean endProgram() { XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series1);
    JFreeChart chart = ChartFactory.createXYLineChart("CA-CB value", "Time", "CA-CB", dataset, PlotOrientation.VERTICAL, true, false, false);
    chart.getXYPlot().setRenderer(new XYSplineRenderer());
    dataset.addSeries(series2);
    chart.getXYPlot().setRenderer(new XYSplineRenderer());
    ChartFrame frame = new ChartFrame("Line chart", chart);
    frame.setVisible(true);
    frame.setSize(500, 500);
    

    XYSeriesCollection dataset1 = new XYSeriesCollection();
    dataset1.addSeries(series3);
    JFreeChart chart1 = ChartFactory.createXYLineChart("XS-XW value", "Time", "XS-XW", dataset1, PlotOrientation.VERTICAL, true, false, false);
    chart1.getXYPlot().setRenderer(new XYSplineRenderer());
    dataset1.addSeries(series4);
    chart1.getXYPlot().setRenderer(new XYSplineRenderer());
    ChartFrame frame1 = new ChartFrame("Line chart", chart1);
    frame1.setVisible(true);
    frame1.setSize(500, 500);
    


    XYSeriesCollection dataset2 = new XYSeriesCollection();
    dataset2.addSeries(series5);
    JFreeChart chart2 = ChartFactory.createXYLineChart("T-TM-TJ value", "Time", "T-TM-TJ", dataset2, PlotOrientation.VERTICAL, true, false, false);
    chart2.getXYPlot().setRenderer(new XYSplineRenderer());
    dataset2.addSeries(series6);
    chart2.getXYPlot().setRenderer(new XYSplineRenderer());
    dataset2.addSeries(series7);
    chart2.getXYPlot().setRenderer(new XYSplineRenderer());
    ChartFrame frame2 = new ChartFrame("Line chart", chart2);
    frame2.setVisible(true);
    frame2.setSize(500, 500);
    

    XYSeriesCollection dataset3 = new XYSeriesCollection();
    dataset3.addSeries(series8);
    JFreeChart chart3 = ChartFactory.createXYLineChart("Qj value", "Time", "Qj", dataset3, PlotOrientation.VERTICAL, true, false, false);
    chart3.getXYPlot().setRenderer(new XYSplineRenderer());
    ChartFrame frame3 = new ChartFrame("Line chart", chart3);
    frame3.setVisible(true);
    frame3.setSize(500, 500);
    

    XYSeriesCollection dataset4 = new XYSeriesCollection();
    dataset4.addSeries(series9);
    JFreeChart chart4 = ChartFactory.createXYLineChart("Qm value", "Time", "Qm", dataset4, PlotOrientation.VERTICAL, true, false, false);
    chart4.getXYPlot().setRenderer(new XYSplineRenderer());
    ChartFrame frame4 = new ChartFrame("Line chart", chart4);
    frame4.setVisible(true);
    frame4.setSize(500, 500);
    

    return false;
  }
  
  double DENDOT;
  double DTJ;
  double DCALC;
  private JButton Back;
  private JTextField CA1;
  private JButton Enter;
  private JButton Image;
  private JTextField a11;
  
  public static void main(String[] args) {
    try { for (javax.swing.UIManager.LookAndFeelInfo info : ) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(Process_Simulation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      Logger.getLogger(Process_Simulation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      Logger.getLogger(Process_Simulation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      Logger.getLogger(Process_Simulation2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Process_Simulation2().setVisible(true);
      }
    });
  }
  
  private JTextField a22;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private JTextArea output;
}
