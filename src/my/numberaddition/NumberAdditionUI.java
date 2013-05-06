package my.numberaddition;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class NumberAdditionUI extends javax.swing.JFrame {
   /* TODO: Store original value for scale accuracy improvement
    * TODO: This would benefit scaling as the slider could be made
    * TODO: in a more natural way. */
   public int LOG_LINE_NUM = 0;
   /* Readability enhancers */
   private final int CUP = 1;
   private final int TSP = 2;
   private final int TBSP = 3;
   private final int QTS = 4;
   private final int GAL = 5;
   private final int PIN = 6;
   private final int MIL = 7;
   private final int LIT = 8;
   /* Conversion units */
   private final double CUP_TO_TSP = 48.0;
   private final double CUP_TO_TBSP = 16.0;
   private final double CUP_TO_QTS = 0.25;
   private final double CUP_TO_PIN = 0.5;
   private final double CUP_TO_GAL = 0.0625;
   private final double CUP_TO_MIL = 236.5882;
   private final double CUP_TO_LIT = 0.2366;
   /* Track field in which key event is registered */
   private boolean CUP_FIELD = false;
   private boolean TSP_FIELD = false;
   private boolean TBSP_FIELD = false;
   private boolean QTS_FIELD = false;
   private boolean GAL_FIELD = false;
   private boolean PIN_FIELD = false;
   private boolean MIL_FIELD = false;
   private boolean LIT_FIELD = false;

   public NumberAdditionUI() throws HeadlessException {      
      initComponents();
      initListeners();
   }

   /**
    * This
    * method
    * is
    * called
    * from
    * within
    * the
    * constructor
    * to
    * initialize
    * the
    * form.
    * WARNING:
    * Do
    * NOT
    * modify
    * this
    * code.
    * The
    * content
    * of
    * this
    * method
    * is
    * always
    * regenerated
    * by
    * the
    * Form
    * Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      qtsTextField = new javax.swing.JTextField();
      cupTextField = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      pinTextField = new javax.swing.JTextField();
      jLabel1 = new javax.swing.JLabel();
      tbspTextField = new javax.swing.JTextField();
      jLabel3 = new javax.swing.JLabel();
      milTextField = new javax.swing.JTextField();
      galTextField = new javax.swing.JTextField();
      jLabel8 = new javax.swing.JLabel();
      litTextField = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      tspTextField = new javax.swing.JTextField();
      jSeparator1 = new javax.swing.JSeparator();
      jPanel3 = new javax.swing.JPanel();
      scaleSlider = new javax.swing.JSlider();
      jLabel9 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      jPanel4 = new javax.swing.JPanel();
      jLabel12 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Split It!");

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Volume"));

      qtsTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            qtsTextFieldFocusGained(evt);
         }
      });

      cupTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            cupTextFieldFocusGained(evt);
         }
      });

      jLabel6.setText("Pint");

      pinTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            pinTextFieldFocusGained(evt);
         }
      });

      jLabel1.setText("Cup");

      tbspTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            tbspTextFieldFocusGained(evt);
         }
      });

      jLabel3.setText("Teaspoon");

      milTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            milTextFieldFocusGained(evt);
         }
      });

      galTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            galTextFieldFocusGained(evt);
         }
      });

      jLabel8.setText("Liter");

      litTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            litTextFieldFocusGained(evt);
         }
      });

      jLabel4.setText("Gallon");

      jLabel2.setText("Tablespoon");

      jLabel7.setText("Milliliter");

      jLabel5.setText("Quart");

      tspTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            tspTextFieldFocusGained(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(tspTextField)
                     .addComponent(tbspTextField)
                     .addComponent(cupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(36, 36, 36)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel3)
                     .addComponent(jLabel1)
                     .addComponent(jLabel2)))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                     .addComponent(qtsTextField)
                     .addComponent(galTextField, javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(pinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(36, 36, 36)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel4)
                     .addComponent(jLabel5)
                     .addComponent(jLabel6)))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(milTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(36, 36, 36)
                  .addComponent(jLabel7))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(litTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(36, 36, 36)
                  .addComponent(jLabel8)))
            .addContainerGap())
         .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(tspTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(tbspTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(cupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(pinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(qtsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(galTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(milTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(litTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel8))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Scale"));

      scaleSlider.setMajorTickSpacing(1);
      scaleSlider.setMaximum(7);
      scaleSlider.setMinimum(1);
      scaleSlider.setMinorTickSpacing(1);
      scaleSlider.setPaintTicks(true);
      scaleSlider.setSnapToTicks(true);

      jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/numberaddition/percent bar.png"))); // NOI18N

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel9)
         .addComponent(scaleSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(scaleSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel9))
      );

      scaleSlider.addChangeListener(new SliderListener());

      jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/numberaddition/common_conv.png"))); // NOI18N

      jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
      jLabel12.setText("Split It!");

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel12))
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel12)
      );

      jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/numberaddition/graph2.png"))); // NOI18N

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10)))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel11))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel10)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void tspTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tspTextFieldFocusGained
      tspTextField.setText("");
   }//GEN-LAST:event_tspTextFieldFocusGained
   private void tbspTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbspTextFieldFocusGained
      tbspTextField.setText("");
   }//GEN-LAST:event_tbspTextFieldFocusGained
   private void cupTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cupTextFieldFocusGained
      cupTextField.setText("");
   }//GEN-LAST:event_cupTextFieldFocusGained
   private void pinTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinTextFieldFocusGained
      pinTextField.setText("");
   }//GEN-LAST:event_pinTextFieldFocusGained
   private void qtsTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qtsTextFieldFocusGained
      qtsTextField.setText("");
   }//GEN-LAST:event_qtsTextFieldFocusGained
   private void galTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_galTextFieldFocusGained
      galTextField.setText("");
   }//GEN-LAST:event_galTextFieldFocusGained
   private void milTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_milTextFieldFocusGained
      milTextField.setText("");
   }//GEN-LAST:event_milTextFieldFocusGained
   private void litTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_litTextFieldFocusGained
      litTextField.setText("");
   }//GEN-LAST:event_litTextFieldFocusGained
   
   private void cupTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                        
      //textFieldKeyPressed(evt, CUP, cupTextField.getText());
      CUP_FIELD = true;
      TSP_FIELD = false;
      TBSP_FIELD = false;
      QTS_FIELD = false;
      GAL_FIELD = false;
      PIN_FIELD = false;
      MIL_FIELD = false;
      LIT_FIELD = false;
   }
   private void tspTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                        
      //textFieldKeyPressed(evt, TSP, tspTextField.getText());
      CUP_FIELD = false;
      TSP_FIELD = true;
      TBSP_FIELD = false;
      QTS_FIELD = false;
      GAL_FIELD = false;
      PIN_FIELD = false;
      MIL_FIELD = false;
      LIT_FIELD = false;
   }
   private void litTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                        
      //textFieldKeyPressed(evt, LIT, litTextField.getText());
      CUP_FIELD = false;
      TSP_FIELD = false;
      TBSP_FIELD = false;
      QTS_FIELD = false;
      GAL_FIELD = false;
      PIN_FIELD = false;
      MIL_FIELD = false;
      LIT_FIELD = true;
   }
   private void milTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                        
      //textFieldKeyPressed(evt, MIL, milTextField.getText());
      CUP_FIELD = false;
      TSP_FIELD = false;
      TBSP_FIELD = false;
      QTS_FIELD = false;
      GAL_FIELD = false;
      PIN_FIELD = false;
      MIL_FIELD = true;
      LIT_FIELD = false;
   }
   private void galTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                        
      //textFieldKeyPressed(evt, GAL, galTextField.getText());
      CUP_FIELD = false;
      TSP_FIELD = false;
      TBSP_FIELD = false;
      QTS_FIELD = false;
      GAL_FIELD = true;
      PIN_FIELD = false;
      MIL_FIELD = false;
      LIT_FIELD = false;
   }
   private void qtsTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                        
      //textFieldKeyPressed(evt, QTS, qtsTextField.getText());
      CUP_FIELD = false;
      TSP_FIELD = false;
      TBSP_FIELD = false;
      QTS_FIELD = true;
      GAL_FIELD = false;
      PIN_FIELD = false;
      MIL_FIELD = false;
      LIT_FIELD = false;
   }
   private void pinTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                        
      //textFieldKeyPressed(evt, PIN, pinTextField.getText());
      CUP_FIELD = false;
      TSP_FIELD = false;
      TBSP_FIELD = false;
      QTS_FIELD = false;
      GAL_FIELD = false;
      PIN_FIELD = true;
      MIL_FIELD = false;
      LIT_FIELD = false;
   }
   private void tbspTextFieldKeyPressed(java.awt.event.KeyEvent evt) {                                         
      //textFieldKeyPressed(evt, TBSP, tbspTextField.getText());
      CUP_FIELD = false;
      TSP_FIELD = false;
      TBSP_FIELD = true;
      QTS_FIELD = false;
      GAL_FIELD = false;
      PIN_FIELD = false;
      MIL_FIELD = false;
      LIT_FIELD = false;
   }
   
   private class customDocListener implements DocumentListener {
      Document CUP_DOC = cupTextField.getDocument();
      Document TSP_DOC = tspTextField.getDocument();
      Document TBSP_DOC = tbspTextField.getDocument();
      Document QTS_DOC = qtsTextField.getDocument();
      Document GAL_DOC = galTextField.getDocument();
      Document PIN_DOC = pinTextField.getDocument();
      Document MIL_DOC = milTextField.getDocument();
      Document LIT_DOC = litTextField.getDocument();
      int source = 0;
      
      public void changedUpdate(DocumentEvent e) { update(e); }
      public void removeUpdate(DocumentEvent e) { update(e); }
      public void insertUpdate(DocumentEvent e) { update(e); }      
      public void update(DocumentEvent e) {
         Document doc = (Document)e.getDocument();
         if(doc == CUP_DOC) source = 1;
         if(doc == TSP_DOC) source = 2;
         if(doc == TBSP_DOC) source = 3;
         if(doc == QTS_DOC) source = 4;
         if(doc == GAL_DOC) source = 5;
         if(doc == PIN_DOC) source = 6;
         if(doc == MIL_DOC) source = 7;
         if(doc == LIT_DOC) source = 8;
         String val = "0.0";
         try {
            if(doc.getLength() > 0)
               val = doc.getText(0, doc.getLength());
            if(doc.getLength() == 1)
               if(".".equals(doc.getText(0, 1)))
                  val = "0.0";
         } catch (BadLocationException ex) { }            
         // Call will only matter if event is triggered by user input
         switch(source) {
            case 1:  if(CUP_FIELD) setConvertVal(CUP, new US_VOL(Double.parseDouble(val), CUP));
                     break;
            case 2:  if(TSP_FIELD) setConvertVal(TSP, new US_VOL(Double.parseDouble(val), TSP));
                     break;
            case 3:  if(TBSP_FIELD) setConvertVal(TBSP, new US_VOL(Double.parseDouble(val), TBSP));
                     break;
            case 4:  if(QTS_FIELD) setConvertVal(QTS, new US_VOL(Double.parseDouble(val), QTS));
                     break;
            case 5:  if(GAL_FIELD) setConvertVal(GAL, new US_VOL(Double.parseDouble(val), GAL));
                     break;
            case 6:  if(PIN_FIELD) setConvertVal(PIN, new US_VOL(Double.parseDouble(val), PIN));
                     break;
            case 7:  if(MIL_FIELD) setConvertVal(MIL, new US_VOL(Double.parseDouble(val), MIL));
                     break;
            case 8:  if(LIT_FIELD) setConvertVal(LIT, new US_VOL(Double.parseDouble(val), LIT));
                     break;
         }
      }
   }
   private class SliderListener implements ChangeListener {

      @Override
      public void stateChanged(ChangeEvent e) {
         JSlider source = (JSlider) e.getSource();
         if (!source.getValueIsAdjusting()) {
            int val = (int) source.getValue();
            scaleValues(val);
         }
      }
   }
   public class US_VOL {
      // TODO: Make this a collection?

      double cup; // Conversion unit
      double tsp;
      double tbsp;
      double qts;
      double gal;
      double pin;
      double lit;
      double mil;
      int source;

      public US_VOL(double cup, int source) {
         // Convert cup from whatever source it is into a cup...[continued below]
         switch (source) {
            case CUP:
               this.cup = cup;
               break;
            case TSP:
               this.cup = cup / CUP_TO_TSP;
               break;
            case TBSP:
               this.cup = cup / CUP_TO_TBSP;
               break;
            case QTS:
               this.cup = cup / CUP_TO_QTS;
               break;
            case GAL:
               this.cup = cup / CUP_TO_GAL;
               break;
            case PIN:
               this.cup = cup / CUP_TO_PIN;
               break;
            case MIL:
               this.cup = cup / CUP_TO_MIL;
               break;
            case LIT:
               this.cup = cup / CUP_TO_LIT;
               break;
            default:
               this.cup = cup;
               break;
         }
         // ...then convert from cup to all other units.
         this.tsp = CUP_TO_TSP * this.cup;
         this.tbsp = CUP_TO_TBSP * this.cup;
         this.qts = CUP_TO_QTS * this.cup;
         this.gal = CUP_TO_GAL * this.cup;
         this.pin = CUP_TO_PIN * this.cup;
         this.mil = CUP_TO_MIL * this.cup;
         this.lit = CUP_TO_LIT * this.cup;
      }

      public double getCup() {
         return cup;
      }

      public void setCup(double cup) {
         this.cup = cup;
      }

      public double getTsp() {
         return tsp;
      }

      public void setTsp(double tsp) {
         this.tsp = tsp;
      }

      public double getTbsp() {
         return tbsp;
      }

      public void setTbsp(double tbsp) {
         this.tbsp = tbsp;
      }

      public double getQts() {
         return qts;
      }

      public void setQts(double qts) {
         this.qts = qts;
      }

      public double getGal() {
         return gal;
      }

      public void setGal(double gal) {
         this.gal = gal;
      }

      public double getPin() {
         return pin;
      }

      public void setPin(double pin) {
         this.pin = pin;
      }

      public double getLit() {
         return lit;
      }

      public void setLit(double lit) {
         this.lit = lit;
      }

      public double getMil() {
         return mil;
      }

      public void setMil(double mil) {
         this.mil = mil;
      }
   }
   public class ROUND {

      int input;
      int output = 1;
      int scale = 125; // 1000 % scale must equal 0

      public ROUND(String input) {
         if (1000 % scale != 0) {
            log("scale isn't properly set");
         }
         while (input.length() < 3) {
            input = input + '0';
         }
         while (input.length() > 3) {
            input = input.substring(0, 3);
         }
         int previous = 0;
         int intInput = Integer.parseInt(input);
         for (int i = scale; i <= 1000; i += scale) {
            if (intInput > previous && intInput <= i) {
               if (intInput * 2 <= i) {
                  // Round down
                  output = previous;
               } else {
                  // Round up
                  output = i;
               }
            }
            previous = i;
         }
      }

      public int getInput() {
         return input;
      }

      public void setInput(int input) {
         this.input = input;
      }

      public int getOutput() {
         return output;
      }

      public void setOutput(int output) {
         this.output = output;
      }
   }

   private void initListeners() {
      // Initialize DocumentListener before KeyListener
      cupTextField.getDocument().addDocumentListener(new customDocListener());
      tspTextField.getDocument().addDocumentListener(new customDocListener());
      tbspTextField.getDocument().addDocumentListener(new customDocListener());
      qtsTextField.getDocument().addDocumentListener(new customDocListener());
      galTextField.getDocument().addDocumentListener(new customDocListener());
      pinTextField.getDocument().addDocumentListener(new customDocListener());
      milTextField.getDocument().addDocumentListener(new customDocListener());
      litTextField.getDocument().addDocumentListener(new customDocListener());      
      
      qtsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            qtsTextFieldKeyPressed(evt);
         }
      });
      cupTextField.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            cupTextFieldKeyPressed(evt);
         }
      });
      pinTextField.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            pinTextFieldKeyPressed(evt);
         }
      });
      tbspTextField.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            tbspTextFieldKeyPressed(evt);
         }
      });
      milTextField.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            milTextFieldKeyPressed(evt);
         }
      });
      galTextField.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            galTextFieldKeyPressed(evt);
         }
      });
      litTextField.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            litTextFieldKeyPressed(evt);
         }
      });
      tspTextField.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            tspTextFieldKeyPressed(evt);
         }
      });
   }
   private void scaleValues(int value) {
      double scaleBy = 1.0;
      switch (value) {
         case 1:
            scaleBy = 1.0 / 8.0;
            break;
         case 2:
            scaleBy = 1.0 / 4.0;
            break;
         case 3:
            scaleBy = 1.0 / 3.0;
            break;
         case 4:
            scaleBy = 1.0 / 2.0;
            break;
         case 5:
            scaleBy = 2.0 / 3.0;
            break;
         case 6:
            scaleBy = 3.0 / 4.0;
            break;
         default:
            scaleBy = 1.0;
            break;
      }
      scaleSlider.setValue(7);
      setConvertVal(0, new US_VOL(Double.parseDouble(cupTextField.getText()) * scaleBy, 0));
   }
   private void setConvertVal(int source, US_VOL vol) {
      // TODO: Reduce IFs if possible
      log("Have we failed?");
      if (source != CUP) {
         cupTextField.setText(makeReadable(vol.getCup()));
      }
      if (source != TSP) {
         tspTextField.setText(makeReadable(vol.getTsp()));
      }
      if (source != TBSP) {
         tbspTextField.setText(makeReadable(vol.getTbsp()));
      }
      if (source != QTS) {
         qtsTextField.setText(makeReadable(vol.getQts()));
      }
      if (source != GAL) {
         galTextField.setText(makeReadable(vol.getGal()));
      }
      if (source != PIN) {
         pinTextField.setText(makeReadable(vol.getPin()));
      }
      if (source != MIL) {
         milTextField.setText(makeReadable(vol.getMil()));
      }
      if (source != LIT) {
         litTextField.setText(makeReadable(vol.getLit()));
      }
   }
   private void log(Object... args) {
      // WARNING: I'm not sure what will be inside Object at any given time.
      LOG_LINE_NUM++;
      System.out.println("L#" + LOG_LINE_NUM + ": " + args[0]);
   }   
   private String makeReadable(double d) {
      String preparedString;
      if (d > 100) {
         preparedString = "Many";
      } else if (Double.toString(d).indexOf('.') != -1) {
         // Has decimal place
         preparedString = Double.toString(d);
         int integerPlaces = preparedString.indexOf('.');
         int decimalPlaces = preparedString.length() - integerPlaces;

         if (d % 1.0 == 0) { // Whole number            
            preparedString = preparedString.substring(0, preparedString.length() - 1);
            decimalPlaces = 0;
         } else {
            int roundedInt = new ROUND(preparedString.substring(integerPlaces + 1)).getOutput();
            if (roundedInt == 1) {
               integerPlaces = Integer.parseInt(preparedString.substring(0, integerPlaces)) + 1;
               preparedString = Integer.toString(integerPlaces);
            } else {
               integerPlaces = Integer.parseInt(preparedString.substring(0, integerPlaces));
               preparedString = (Integer.toString(integerPlaces) + '.' + Integer.toString(roundedInt));
            }
         }
      } else {
         preparedString = String.valueOf(d);
      }
      /* Remove trailing zeros and periods */
      while ("0".equals(preparedString.substring(preparedString.length() - 1))) {
         preparedString = preparedString.substring(0, preparedString.length() - 1);
      }
      if (".".equals(preparedString.substring(preparedString.length() - 1))) {
         preparedString = preparedString.substring(0, preparedString.length() - 1);
      }
      if ("0".equals(preparedString)) {
         preparedString = "Tiny";
      }

      return preparedString;
   }
   
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
       * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */      
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(NumberAdditionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(NumberAdditionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(NumberAdditionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(NumberAdditionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new NumberAdditionUI().setVisible(true);
         }
      });
   }
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextField cupTextField;
   private javax.swing.JTextField galTextField;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JTextField litTextField;
   private javax.swing.JTextField milTextField;
   private javax.swing.JTextField pinTextField;
   private javax.swing.JTextField qtsTextField;
   private javax.swing.JSlider scaleSlider;
   private javax.swing.JTextField tbspTextField;
   private javax.swing.JTextField tspTextField;
   // End of variables declaration//GEN-END:variables
}