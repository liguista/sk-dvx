package org.ski.dvx.app;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
// import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class DVX_Slider extends JFrame {

    private JSlider slider;
    private JLabel label;
    
    private JSlider slider1;
    private JLabel label1;

//    ImageIcon mute = new ImageIcon(getClass().getResource("mute.png"));
  //  ImageIcon min = new ImageIcon(getClass().getResource("min.png"));
    //ImageIcon med = new ImageIcon(getClass().getResource("med.png"));
    //ImageIcon max = new ImageIcon(getClass().getResource("max.png"));

    public DVX_Slider() {
        initUI();
    }

    public final void initUI() {
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        setLayout(new BorderLayout());

        panel.add(Box.createHorizontalGlue());
        slider = new JSlider(0, 150, 150);

        slider.setPreferredSize(new Dimension(150, 20));

        slider1 = new JSlider(0, 150, 150);

        slider1.setPreferredSize(new Dimension(150, 20));


        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                int value = slider.getValue();
                
                label.setText(""+value);
                if (value == 0) {
                    //label.setIcon(mute);
                } else if (value > 0 && value <= 30) {
                    //label.setIcon(min);
                } else if (value > 30 && value < 80) {
                    //label.setIcon(med);
                } else {
                    //label.setIcon(max);
                }
            }
        });
        slider1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                int value = slider1.getValue();
                
                label1.setText(""+value);
                if (value == 0) {
                    //label.setIcon(mute);
                } else if (value > 0 && value <= 30) {
                    //label.setIcon(min);
                } else if (value > 30 && value < 80) {
                    //label.setIcon(med);
                } else {
                    //label.setIcon(max);
                }
            }
        });
        panel.add(slider);
        panel.add(Box.createRigidArea(new Dimension(5, 0)));
 

        label = new JLabel(""+slider.getValue(), JLabel.CENTER);
        panel.add(label);
 
        label1 = new JLabel(""+slider1.getValue(), JLabel.CENTER);
 
        panel.add(Box.createHorizontalGlue());
        add(panel, BorderLayout.CENTER);
        panel.add(slider1);
        panel.add(label1);

        pack();
        
        setTitle("JSlider");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
            	DVX_Slider ex = new DVX_Slider();
                ex.setVisible(true);
            }
        });
    }
}