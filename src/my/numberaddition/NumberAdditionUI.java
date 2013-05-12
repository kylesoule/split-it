package my.numberaddition;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class NumberAdditionUI extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	public int LOG_LINE_NUM = 0;           // Debugging, iterates with each call to log()
   public double lastScale = 1.0;         // Holds the last set value on the scale
   public boolean scaleUserReset = true;  // Detects if user reset scale 
	ArrayList<US_VOL> volumes = new ArrayList<US_VOL>();   

   public NumberAdditionUI() throws HeadlessException {      
      initComponents();
      initMeasures();      
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
      tbspTextField = new javax.swing.JTextField();
      jLabel3 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      litTextField = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      tspTextField = new javax.swing.JTextField();
      jSeparator1 = new javax.swing.JSeparator();
      cupTextField = new javax.swing.JTextField();
      jLabel1 = new javax.swing.JLabel();
      pinTextField = new javax.swing.JTextField();
      qtsTextField = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      galTextField = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      fozTextField = new javax.swing.JTextField();
      jLabel7 = new javax.swing.JLabel();
      jPanel3 = new javax.swing.JPanel();
      scaleSlider = new javax.swing.JSlider();
      jLabel9 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      jPanel4 = new javax.swing.JPanel();
      jLabel12 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Split It!");
      setIconImages(null);

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Volume"));

      tbspTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            tbspTextFieldFocusGained(evt);
         }
      });

      jLabel3.setText("Teaspoon");

      jLabel8.setText("Liter");

      litTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            litTextFieldFocusGained(evt);
         }
      });

      jLabel2.setText("Tablespoon");

      tspTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            tspTextFieldFocusGained(evt);
         }
      });

      cupTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            cupTextFieldFocusGained(evt);
         }
      });

      jLabel1.setText("Cup");

      pinTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            pinTextFieldFocusGained(evt);
         }
      });

      qtsTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            qtsTextFieldFocusGained(evt);
         }
      });

      jLabel5.setText("Quart");

      galTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            galTextFieldFocusGained(evt);
         }
      });

      jLabel6.setText("Pint");

      jLabel4.setText("Gallon");

      fozTextField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            fozTextFieldFocusGained(evt);
         }
      });

      jLabel7.setText("Fluid Ounces");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(tspTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                     .addComponent(tbspTextField))
                  .addGap(36, 36, 36)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel3)
                     .addComponent(jLabel2)))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(litTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(36, 36, 36)
                  .addComponent(jLabel8))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(fozTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(36, 36, 36)
                  .addComponent(jLabel7))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(cupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(36, 36, 36)
                  .addComponent(jLabel1))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                     .addComponent(qtsTextField)
                     .addComponent(galTextField, javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(pinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(36, 36, 36)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel4)
                     .addComponent(jLabel5)
                     .addComponent(jLabel6))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
               .addComponent(fozTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel7))
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
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jLabel10)
                        .addGap(87, 87, 87))))
               .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

   /* Clear fields when focused */
   private void tspTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tspTextFieldFocusGained
      tspTextField.setText("");
      resetScale();
   }//GEN-LAST:event_tspTextFieldFocusGained
   private void tbspTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbspTextFieldFocusGained
      tbspTextField.setText("");
      resetScale();
   }//GEN-LAST:event_tbspTextFieldFocusGained
   private void cupTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cupTextFieldFocusGained
      cupTextField.setText("");
      resetScale();
   }//GEN-LAST:event_cupTextFieldFocusGained
   private void pinTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinTextFieldFocusGained
      pinTextField.setText("");
      resetScale();
   }//GEN-LAST:event_pinTextFieldFocusGained
   private void qtsTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qtsTextFieldFocusGained
      qtsTextField.setText("");
      resetScale();
   }//GEN-LAST:event_qtsTextFieldFocusGained
   private void galTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_galTextFieldFocusGained
      galTextField.setText("");
      resetScale();
   }//GEN-LAST:event_galTextFieldFocusGained
   private void fozTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fozTextFieldFocusGained
      fozTextField.setText("");
      resetScale();
   }//GEN-LAST:event_fozTextFieldFocusGained
   private void litTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_litTextFieldFocusGained
      litTextField.setText("");
      resetScale();
   }//GEN-LAST:event_litTextFieldFocusGained
   
   /* Set source in measurement element of volume collection */
   private void cupTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
	   final int source = 1; // CUP 
	   for(US_VOL measure: volumes) {
		   if(measure.getIndex() == source) {
			   measure.setSource(true);
		   } else {
			   measure.setSource(false);
		   }
	   }
   }
   private void tspTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
	   final int source = 2; // TSP 
	   for(US_VOL measure: volumes) {
		   if(measure.getIndex() == source) {
			   measure.setSource(true);
		   } else {
			   measure.setSource(false);
		   }
	   }
   }
   private void litTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
	   final int source = 8; // LIT ER
	   for(US_VOL measure: volumes) {
		   if(measure.getIndex() == source) {
			   measure.setSource(true);
		   } else {
			   measure.setSource(false);
		   }
	   }
   }
   private void fozTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
	   final int source = 4; // FLUID OUNCE 
	   for(US_VOL measure: volumes) {
		   if(measure.getIndex() == source) {
			   measure.setSource(true);
		   } else {
			   measure.setSource(false);
		   }
	   }
   }
   private void galTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
	   final int source = 7; // GALLON 
	   for(US_VOL measure: volumes) {
		   if(measure.getIndex() == source) {
			   measure.setSource(true);
		   } else {
			   measure.setSource(false);
		   }
	   }
   }
   private void qtsTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
	   final int source = 6; // QUART 
	   for(US_VOL measure: volumes) {
		   if(measure.getIndex() == source) {
			   measure.setSource(true);
		   } else {
			   measure.setSource(false);
		   }
	   }
   }
   private void pinTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
	   final int source = 5; // PINT 
	   for(US_VOL measure: volumes) {
		   if(measure.getIndex() == source) {
			   measure.setSource(true);
		   } else {
			   measure.setSource(false);
		   }
	   }
   }
   private void tbspTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
	   final int source = 3; // TBSP 
	   for(US_VOL measure: volumes) {
		   if(measure.getIndex() == source) {
			   measure.setSource(true);
		   } else {
			   measure.setSource(false);
		   }
	   }
   }
   
   private void initMeasures() {
	   // Volume is initialized at start so as to be global
	   volumes.add(new US_VOL(1, "CUP", 1.0, "", 0.0, 1, false, cupTextField));					// Cup = Base Unit
	   volumes.add(new US_VOL(2, "TSP", 48.0, "", 0.0, 1, false, tspTextField));					// Teaspoon
	   volumes.add(new US_VOL(3, "TBSP", 16.0, "", 0.0, 1, false, tbspTextField));			// Tablespoon
	   volumes.add(new US_VOL(4, "FOZ", 8.0, "", 0.0, 1, false, fozTextField));					// Fluid ounce
	   volumes.add(new US_VOL(5, "PIN", 0.5, "", 0.0, 1, false, pinTextField));					// Pint
	   volumes.add(new US_VOL(6, "QTS", 0.25, "", 0.0, 1, false, qtsTextField));				// Quart
	   volumes.add(new US_VOL(7, "GAL", (1.0 / 16.0), "", 0.0, 1, false, galTextField));		// Gallon
	   volumes.add(new US_VOL(8, "LIT", 0.23659, "", 0.0, 1, false, litTextField));				// Liter
   }
   private void initListeners() {
      /* Set icon, default if fails */
      try {
         Image i = ImageIO.read(getClass().getResource("/my/numberaddition/arrow_split_right.png"));
         setIconImage(i);
      } catch (IOException e) { }
      // Initialize DocumentListener before KeyListener
      cupTextField.getDocument().addDocumentListener(new customDocListener());
      tspTextField.getDocument().addDocumentListener(new customDocListener());
      tbspTextField.getDocument().addDocumentListener(new customDocListener());
      qtsTextField.getDocument().addDocumentListener(new customDocListener());
      galTextField.getDocument().addDocumentListener(new customDocListener());
      pinTextField.getDocument().addDocumentListener(new customDocListener());
      fozTextField.getDocument().addDocumentListener(new customDocListener());
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
      fozTextField.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            fozTextFieldKeyPressed(evt);
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
   
   private class customDocListener implements DocumentListener {
      public void changedUpdate(DocumentEvent e) { update(e); }
      public void removeUpdate(DocumentEvent e) { update(e); }
      public void insertUpdate(DocumentEvent e) { update(e); }
      public void update(DocumentEvent e) {
        Document doc = e.getDocument();
    	  /* Only allow changes if KeyEvent is registered and source is active */
    	  boolean proceed = false;        
    	  for(US_VOL measure: volumes) {
    		  if(measure.isSource() && measure.getDoc() == doc)
              proceed = true;
    	  }
    	  if(proceed) {
           resetScale();           
    		  String val = "0.0";
    		  double input;
           /* Tidy up the received input */
    		  try {
              /* Determine if fractional */
              if(doc.getText(0, doc.getLength()).contains("/")) {
                 val = fromFraction(doc.getText(0, doc.getLength()));
              } else {
                 if(doc.getLength() > 0)
                    val = doc.getText(0, doc.getLength());
       			  if(doc.getLength() == 1)
       				  if(".".equals(doc.getText(0, 1)))
                       val = "0.0";
              }
    		  } catch (BadLocationException ex) { }
    		  input = purifyString(val);
    		  /* Convert to base */
    		  for(US_VOL measure: volumes) {
    			  if(measure.getDoc() == doc) {
    				  volumes.get(0).setAccurate(input / measure.getConversion());	// Convert to base
    			  }
    		  }
    		  /* Convert all units from base */
    		  for(US_VOL measure: volumes) {
    			  measure.setAccurate(volumes.get(0).getAccurate() * measure.getConversion());
    			  measure.setReadable(makeReadable(measure.getAccurate()));
    		  }
    		  SwingUtilities.invokeLater(setTextFields);
    	  }
      }
   }
   private class SliderListener implements ChangeListener {      
      @Override
      public void stateChanged(ChangeEvent e) {
         if(scaleUserReset) {
            JSlider source = (JSlider) e.getSource();
            if (!source.getValueIsAdjusting()) {
               int val = (int) source.getValue();
               scaleValues(val);
            }
         } else {
            scaleUserReset = true;
         }
      }
   }
   
   /**
    * Holds elements of volume collection
    * 
    * @param int index
    * @param String type
    * @param double conversion
    * @param String readable
    * @param double accurate
    * @param double scale
    * @param boolean source
    * @param JTextField textField
    */
   public class US_VOL {
      private int index;
      private String type;
      private double conversion;
      private String readable;
      private double accurate;
      private double scale;
      private boolean source;
      private JTextField textField;
      public US_VOL(int index, String type, double conversion, String readable, double accurate, double scale, boolean source, JTextField textField) {
    	  this.index = index;
    	  this.type = type;
    	  this.conversion = conversion;
    	  this.readable = readable;
    	  this.accurate = accurate;
    	  this.scale = scale;
    	  this.source = source;
    	  this.textField = textField;
      }
      /* Nothing below this point but getters/setters */      
      public int getIndex() {
   		return index;
   	}
   	public void setIndex(int index) {
   		this.index = index;
   	}
   	public String getType() {
   		return type;
   	}
   	public void setType(String type) {
   		this.type = type;
   	}
   	public double getConversion() {
   		return conversion;
   	}
   	public void setConversion(double conversion) {
   		this.conversion = conversion;
   	}
   	public String getReadable() {
   		return readable;
   	}
   	public void setReadable(String readable) {
   		this.readable = readable;
   	}
   	public double getAccurate() {
   		return accurate;
   	}
   	public void setAccurate(double accurate) {
   		this.accurate = accurate;
   	}
   	public double getScale() {
   		return scale;
   	}
   	public void setScale(double scale) {
   		this.scale = scale;
   	}
   	public boolean isSource() {
   		return source;
   	}
   	public void setSource(boolean source) {
   		this.source = source;
   	}
   	public JTextField getTextField() {
   		return textField;
   	}
   	public void setDoc(JTextField textField) {
   		this.textField = textField;
   	}
   	public Document getDoc() {
   		return textField.getDocument();
   	}
   }
   /**
    * Rounds input to specified accuracy.
    * 
    * @param String input
    * @return int output (via getOutput())
    */
   public class ROUND {
      int input;
      int output = 1;
      int scale = 125; // 125 = 1/8 scale increments

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
      public void setInput(int input) {
         this.input = input;
      }
      public int getOutput() {
         return output;
      }

   }

   /**
    * Attempts to parseDouble(input).
    * If Exception is caught, sets value to 0.0; effectively sets the value of input to 0.0 if input contains characters.
    * 
    * @param String input
    * @return double val
    */
   private double purifyString(String input) {
      Double val = 0.0;
      try {
         val = Double.parseDouble(input);
      } catch (NumberFormatException nfe) { }
      return val;
   }
   private void scaleValues(int value) {
      // Scale is reset on new entries and new field focus
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
      for(US_VOL measure: volumes) {
         measure.setAccurate((measure.getAccurate() / lastScale) * scaleBy);
         measure.setReadable(makeReadable(measure.getAccurate()));
      }
    	SwingUtilities.invokeLater(setTextFields);
      lastScale = scaleBy;
      
      //scaleSlider.setValue(7);
   }
   /**
    * Provides debugging output.
    * 
    * @param Object... args
    * @return System.out.println
    */
   private void log(Object... args) {
      LOG_LINE_NUM++;
      System.out.println("L#" + LOG_LINE_NUM + ": " + args[0]);
   }
   private String toFraction(int input) {
      String output = "";
      switch(input) {
         case 125:   output = "1/8";
                     break;
         case 250:   output = "1/4";
                     break;
         case 375:   output = "3/8";
                     break;
         case 500:   output = "1/2";
                     break;
         case 625:   output = "5/8";
                     break;
         case 750:   output = "3/4";
                     break;
         case 875:   output = "7/8";
                     break;
      }
      return output;
   }
   private String fromFraction(String input) {
      String output = input;
      String intPart = "";
      double num = 1.0;
      double den = 1.0;
      String fractionalPart;
      if(input.indexOf(" ") >= 0) {
         intPart = input.substring(0, input.indexOf(" "));
         fractionalPart = input.substring(input.indexOf(" ") + 1);
      } else {
         fractionalPart = input;
      }
      num = Double.parseDouble(fractionalPart.substring(0, fractionalPart.indexOf("/")) + ".0");
      den = Double.parseDouble(fractionalPart.substring(fractionalPart.indexOf("/") + 1) + ".0");
      if(den == 0.0) {
         fractionalPart = "0";
      } else {
         fractionalPart = Double.toString(num / den).substring(2);
      }
      output = intPart + "." + fractionalPart;
      return output;
   }
   /**
    * Receives a double and turns it into something reader-friendly
    * 
    * @param double d
    * @return String preparedString
    */
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
            if (roundedInt == 1000) {
               integerPlaces = Integer.parseInt(preparedString.substring(0, integerPlaces)) + 1;
               preparedString = Integer.toString(integerPlaces);               
            } else {
               integerPlaces = Integer.parseInt(preparedString.substring(0, integerPlaces));
               //preparedString = (Integer.toString(integerPlaces) + '.' + Integer.toString(roundedInt));
               preparedString = (Integer.toString(integerPlaces) + ' ' + toFraction(roundedInt));
            }
         }
      } else {
         preparedString = String.valueOf(d);
      }
      /* Remove trailing zeros and periods */
      while ("0".equals(preparedString.substring(preparedString.length() - 1))) {
         preparedString = preparedString.substring(0, preparedString.length() - 1);
      }
      if(".".equals(preparedString.substring(preparedString.length() - 1))) {
         preparedString = preparedString.substring(0, preparedString.length() - 1);
      }
      if("0".equals(preparedString) || "0 ".equals(preparedString)) {
         preparedString = "Tiny";
      }
      if(preparedString.length() > 2 && "0 ".equals(preparedString.substring(0, 2))) {
         preparedString = preparedString.substring(2);
      }

      return preparedString;
   }
   private void resetScale() {
      scaleUserReset = false;
      scaleSlider.setValue(7);
      lastScale = 1.0;      
   }
   
   /**
    * Procedure must be called in this way
    * because swing doesn't allow updates
    * to listeners in listeners
    */
   Runnable setTextFields = new Runnable() {
	   public void run() {
		   for(US_VOL measure: volumes) {
			   if(!measure.isSource()) {
				   measure.getTextField().setText(measure.getReadable());
			   } else {
				   measure.setSource(false);
			   }
		   }		   
	   }
   };
   
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
   private javax.swing.JTextField fozTextField;
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
   private javax.swing.JTextField pinTextField;
   private javax.swing.JTextField qtsTextField;
   private javax.swing.JSlider scaleSlider;
   private javax.swing.JTextField tbspTextField;
   private javax.swing.JTextField tspTextField;
   // End of variables declaration//GEN-END:variables
}