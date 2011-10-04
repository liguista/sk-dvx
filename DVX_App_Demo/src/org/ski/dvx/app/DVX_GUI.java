/*
	Project:		Windows DVX Player/Editor
	
	File Name:		

	Designer:		Josh Miele

	Author:			Greg Ames

	Contributors:	Owen Edwards
					
	Created:		September 10, 2011
	
	Copyright:	 	The Smith-Kettlewell Eye Research Institute
					© 2011
					All Rights Reserved
					
					http://www.ski.org/
					
					The Smith-Kettlewell Eye Research Institute
					2318 Fillmore Street 
					San Francisco, CA  94115 
					415-345-2000  
				 
	Notice:			Parts of this project are based on Open Source 
					and/or Public Domain Code. Please use good judgment 
					if you include any of this project in your project.
					
	Contact:		Josh Miele
					jam@ski.org
*/

/**
 * 
 */
package org.ski.dvx.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//import org.ski.dvx.app.DVX_Player.MyButtonListener;
import org.ski.dvx.hibernate.Author;
import org.ski.dvx.hibernate.Language;
import org.ski.dvx.hibernate.Movie;

import de.humatic.dsj.DSDvd;

// TODO: Auto-generated Javadoc
/**
 * The Class DVX_GUI.
 *
 * @author Greg
 */
public class DVX_GUI extends DVX_Menus{
	

    // Variables declaration - do not modify                     
//  private javax.swing.JButton jButtonAdd;
//   private javax.swing.JButton jButtonPlay;
  /** The j button record. */
    javax.swing.JButton jButtonRecord;
  
  /** The j button chapter minus. */
  javax.swing.JButton jButtonChapterMinus;
  
  /** The j button chapter plus. */
  javax.swing.JButton jButtonChapterPlus;
  
  /** The j combo box author. */
  javax.swing.JComboBox jComboBoxAuthor;
  
  /** The j combo box chapter. */
  javax.swing.JComboBox jComboBoxChapter;
  
  /** The j combo box title. */
  javax.swing.JComboBox jComboBoxTitle;
  
  /** The j combo box language. */
  javax.swing.JComboBox jComboBoxLanguage;
  
  /** The j label author. */
  javax.swing.JLabel jLabelAuthor;
  
  /** The j label hour. */
  javax.swing.JLabel jLabelHour;
  
  /** The j label dv dvolume. */
  javax.swing.JLabel jLabelDVDvolume;
  
  /** The j label dvx volume. */
  javax.swing.JLabel jLabelDVXVolume;
  
  /** The j label frame. */
  javax.swing.JLabel jLabelFrame;
  
  /** The j label language. */
  javax.swing.JLabel jLabelLanguage;
  
  /** The j label min. */
  javax.swing.JLabel jLabelMin;
  
  /** The j label sec. */
  javax.swing.JLabel jLabelSec;
  
  /** The j label title. */
  javax.swing.JLabel jLabelTitle;
  
  /** The j panel1. */
  javax.swing.JPanel jPanel1;
  
  /** The j panel root. */
  javax.swing.JPanel jPanelRoot;
  
  /** The j separator1. */
  javax.swing.JSeparator jSeparator1;
  
  /** The j separator2. */
  javax.swing.JSeparator jSeparator2;
  
  /** The j slider dvx volume. */
  javax.swing.JSlider jSliderDVXVolume;
  
  /** The j slider dvd volume. */
  javax.swing.JSlider jSliderDVDVolume;
  
  /** The j text chapter. */
  javax.swing.JTextField jTextChapter;
  
  /** The j text frame. */
  javax.swing.JTextField jTextHour;
  
  /** The j text minutes. */
  javax.swing.JTextField jTextMinutes;
  
  /** The j text seconds. */
  javax.swing.JTextField jTextSeconds;
  
  /** The label chapter. */
  javax.swing.JLabel labelChapter;
  
  /** The label language. */
  javax.swing.JLabel labelLanguage;
  
  /** The label language1. */
  javax.swing.JLabel labelLanguage1;
  
  /** The label language2. */
  javax.swing.JLabel labelLanguage2;
  
  /** The label title. */
  javax.swing.JLabel labelTitle;
  // End of variables declaration    

  /** The btn chapter plus. */
  javax.swing.JButton btnChapterPlus;
  
  /** The btn chapter minus. */
  javax.swing.JButton btnChapterMinus;

  /** The btn title plus. */
  javax.swing.JButton btnTitlePlus ;
  
  /** The btn title minus. */
  javax.swing.JButton btnTitleMinus;

  /** The j button shut up. */
  javax.swing.JButton jButtonShutUp;
  
  /** The j button time. */
  javax.swing.JButton jButtonTime ;
  
  /** The j button play. */
  javax.swing.JButton jButtonPlay;
  
  /** The j button pause. */
  javax.swing.JButton jButtonPause ;
  
  /** The j button stop. */
  javax.swing.JButton jButtonStop ;
  
  /** The j button eject. */
  javax.swing.JButton jButtonEject;
  
  /** The j button mount. */
  javax.swing.JButton jButtonMount;

  /**
   * Instantiates a new dV x_ gui.
   */
  DVX_GUI()
  {
	  super();
  }
	
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    /**
     * Inits the gui.
     *
     * @param frame the frame
     * @param thePanel the the panel
     */
    void initGui(javax.swing.JFrame frame, JPanel thePanel) {
    	
    	initMenus(frame);
		btnChapterPlus 	= new JButton("C+",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Add-icon.png"));
		btnChapterMinus = new JButton("C-",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Minus-icon.png"));

		btnTitlePlus 	= new JButton("T+",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Add-icon.png"));
		btnTitleMinus 	= new JButton("T-",	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Minus-icon.png"));


        jPanel1 = new javax.swing.JPanel();
        jPanelRoot = new javax.swing.JPanel();
        jSliderDVDVolume = new javax.swing.JSlider();
        jSliderDVXVolume = new javax.swing.JSlider();
//        jButtonRecord = new javax.swing.JButton();
//        jButtonAdd = new javax.swing.JButton();
        jButtonPlay = new javax.swing.JButton();
        jComboBoxAuthor = new javax.swing.JComboBox();
        jLabelAuthor = new javax.swing.JLabel();
        jComboBoxLanguage = new javax.swing.JComboBox();
        jLabelLanguage = new javax.swing.JLabel();
        jLabelDVDvolume = new javax.swing.JLabel();
        jLabelDVXVolume = new javax.swing.JLabel();
        labelChapter = new javax.swing.JLabel();
        jComboBoxChapter = new javax.swing.JComboBox();
        labelTitle = new javax.swing.JLabel();
        jComboBoxTitle = new javax.swing.JComboBox();
        jButtonChapterPlus = new javax.swing.JButton();
        jButtonChapterMinus = new javax.swing.JButton();
        labelLanguage1 = new javax.swing.JLabel();
        labelLanguage2 = new javax.swing.JLabel();
        jTextSeconds = new javax.swing.JTextField();
        jTextHour = new javax.swing.JTextField();
        labelLanguage = new javax.swing.JLabel();
        jTextChapter = new javax.swing.JTextField();
        jTextMinutes = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelTitle = new javax.swing.JLabel();
        jLabelHour = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelSec = new javax.swing.JLabel();
        jLabelFrame = new javax.swing.JLabel();
        
		jButtonEject = new JButton("Eject", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "cd-eject-icon.png"));
		jButtonEject.addActionListener(new MyButtonListener());
		jButtonEject.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Eject"));

		jButtonMount = new JButton("Mount", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Device-cd-rom-mount-icon.png"));
		jButtonMount.addActionListener(new MyButtonListener());
		jButtonMount.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Mount"));

		jButtonShutUp = new JButton("Shut Up",new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "sound-off-icon.png"));
		jButtonShutUp.addActionListener(new MyButtonListener());
		jButtonShutUp.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ShutUp"));
		
		jButtonTime = new JButton("Time", 	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Time-Machine-icon.png"));
		jButtonTime.addActionListener(new MyButtonListener());
		jButtonTime.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Time"));

		jButtonPlay = new JButton("Play", 	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Button-Play-icon_002.png"));
		jButtonPlay.addActionListener(new MyButtonListener());
		jButtonPlay.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Play"));

		jButtonPause = new JButton("Pause", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Pause-icon.png"));
		jButtonPause.addActionListener(new MyButtonListener());
		jButtonPause.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Pause"));

		jButtonStop = new JButton("Stop", 	new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Stop-Pressed-Blue-icon.png"));
		jButtonStop.addActionListener(new MyButtonListener());
		jButtonStop.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Stop"));

		dvxRecordButton = new DVX_RecordButton(this, "Record", new ImageIcon(DVX_Constants.GLOBAL_IMAGES_PATH_24_X_24 + "Record-Normal-icon.png"));
		//			dvxRecordButton = new dvxRecordButton("Record");
//		dvxRecordButton.setAuthor(getAuthor());
//		dvxRecordButton.setMovie(movie);
//		dvxRecordButton.setLanguage(language);
		dvxRecordButton.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Record"));

//
//

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

 //       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 //       setTitle("Root Panel");

        jSliderDVDVolume.setValue(100);
         jSliderDVDVolume.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
            	sliderDVDVolumeActionPerformed(evt);
            }
        });

        jSliderDVXVolume.setValue(100);
        
        jSliderDVXVolume.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
            	sliderDVXVolumeActionPerformed(evt);
               
            }
        });

/*
        jButtonRecord.setText("Record");
        jButtonRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRecordActionPerformed(evt);
            }
        }); */
/*
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
*/
        jButtonPlay.setText("Play");

        jComboBoxAuthor.setModel(new javax.swing.DefaultComboBoxModel(dvxDBSupport.getAuthorList()));
        jComboBoxAuthor.setToolTipText("User");
        jComboBoxAuthor.setSelectedIndex(1);
        jComboBoxAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAuthorActionPerformed(evt);
            }
        });

        jLabelAuthor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAuthor.setText("Author:");

        jComboBoxLanguage.setModel(new javax.swing.DefaultComboBoxModel(dvxDBSupport.getLanguageList()));
        jComboBoxLanguage.setToolTipText("Language");
        jComboBoxLanguage.setSelectedIndex(1);
        jComboBoxLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLanguageActionPerformed(evt);
            }
        });

        jLabelLanguage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLanguage.setText("Language:");

        jLabelDVDvolume.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDVDvolume.setText("DVD Volume");

        jLabelDVXVolume.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDVXVolume.setText("DVX Volume");

        labelChapter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelChapter.setText("Chapter:");

     // added gca
       String [] chapterList  = new String[dvd.getNumChapters()+1];
       chapterList[0] = "Chapter:";
        for (int i = 0; i < dvd.getNumChapters(); i++) 
        	chapterList[i+1] = "Chapter "+ (i + 1);
        jComboBoxChapter.setModel(new javax.swing.DefaultComboBoxModel(chapterList));
        jComboBoxChapter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jComboBoxChapterActionPerformed(evt);
            }
        });     // end added       	   

        
        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTitle.setText("Title:");
// added gca
        String [] titleList  = new String[dvd.getNumTitles()+1];
        titleList[0] = "Title:";
        for (int  i = 0; i < dvd.getNumTitles(); i++) 
        	titleList[i+1] = "Title "+ (i + 1);
// end added       	   
        jComboBoxTitle.setModel(new javax.swing.DefaultComboBoxModel(titleList));
        jComboBoxTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jComboBoxTitleActionPerformed(evt);
            }
        });     // end added       	   

        jButtonChapterPlus.setText("+");
        jButtonChapterPlus.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ChapterPlus"));

        jButtonChapterPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChapterPlusActionPerformed(evt);
            }
        });

        jButtonChapterMinus.setText("-");
        jButtonChapterMinus.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ChapterMinus"));
        jButtonChapterMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChapterMinusActionPerformed(evt);
            }
        });

        labelLanguage1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLanguage1.setText(":");

        labelLanguage2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextSeconds.setText("00");
        jTextSeconds.setToolTipText("Seconds");
        jTextSeconds.setMargin(new java.awt.Insets(2, 4, 2, 4));

        jTextHour.setText("00");
        jTextHour.setToolTipText("Frame");
        jTextHour.setMargin(new java.awt.Insets(2, 4, 2, 4));
/*        jTextFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFrameActionPerformed(evt);
            }
        }); */

        labelLanguage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelLanguage.setText("-");

        jTextChapter.setText("00");
        jTextChapter.setToolTipText("Chapter");
        jTextChapter.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextChapter.setMinimumSize(new java.awt.Dimension(60, 20));
 /*       jTextChapter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextChapterActionPerformed(evt);
            }
        });*/

        jTextMinutes.setText("00");
        jTextMinutes.setToolTipText("Minutes");
        jTextMinutes.setMargin(new java.awt.Insets(2, 4, 2, 4));
 /*       jTextMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMinutesActionPerformed(evt);
            }
        });*/

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(51, 0, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("DVX- The New Media Player");

        jLabelHour.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelHour.setText("Hour");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMin.setText("Min.");

        jLabelSec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSec.setText("Sec.");

        jLabelFrame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFrame.setText("Frame");
        thePanel.add(btnChapterMinus);			
		btnChapterMinus.addActionListener(new MyButtonListener());
		btnChapterMinus.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ChapterMinus"));
		
		thePanel.add(btnChapterPlus);
		btnChapterPlus.addActionListener(new MyButtonListener());
		btnChapterPlus.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ChapterPlus"));
		
		thePanel.add(jButtonEject);
//		jButtonEject.addActionListener(new MyButtonListener());
//		jButtonEject.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Eject"));
		
		thePanel.add(jButtonMount);
//		jButtonMount.addActionListener(new MyButtonListener());
//		jButtonMount.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Mount"));
   
		thePanel.add(jButtonShutUp);
//		jButtonShutUp.addActionListener(new MyButtonListener());
//		jButtonShutUp.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.ShutUp"));
		
		thePanel.add(jButtonTime);
//		jButtonTime.addActionListener(new MyButtonListener());
//		jButtonTime.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Time"));

		thePanel.add(jButtonPlay);
//		jButtonPlay.addActionListener(new MyButtonListener());
//		jButtonPlay.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Play"));
		
		thePanel.add(jButtonPause);
//		jButtonPause.addActionListener(new MyButtonListener());
//		jButtonPause.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Pause"));

		thePanel.add(jButtonStop);
//		jButtonStop.addActionListener(new MyButtonListener());
//		jButtonStop.setMnemonic(DVX_Messages.getChar("PlayDVD.Keyboard.Stop"));
		
//		dvxRecordButton.setSize(40, 12);
		thePanel.add(dvxRecordButton);

        javax.swing.GroupLayout jPanelRootLayout = new javax.swing.GroupLayout(jPanelRoot);
        jPanelRoot.setLayout(jPanelRootLayout);
        jPanelRootLayout.setHorizontalGroup(
            jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRootLayout.createSequentialGroup()
//                .addContainerGap()
                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                    .addGroup(jPanelRootLayout.createSequentialGroup()
                        .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRootLayout.createSequentialGroup()
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAuthor)
                                    .addComponent(jLabelLanguage))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelRootLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(labelChapter))
                                    .addGroup(jPanelRootLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(labelTitle)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelRootLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonChapterMinus)
                                        .addGap(6, 6, 6)
                                        .addComponent(jButtonChapterPlus)
                                        .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelRootLayout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addComponent(labelLanguage2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelRootLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelHour)
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabelMin)
                                                .addGap(7, 7, 7)
                                                .addComponent(jLabelSec)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelFrame)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRootLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(labelLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelLanguage1)
                                        .addGap(7, 7, 7)
                                        .addComponent(jTextSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(jTextHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)))
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelDVDvolume)
                                    .addComponent(jLabelDVXVolume))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSliderDVDVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSliderDVXVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRootLayout.createSequentialGroup()
                                .addComponent(jButtonEject)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMount)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonShutUp)
                                 .addGap(18, 18, 18)
                                .addComponent(jButtonTime)
                                 .addGap(18, 18, 18)
                                .addComponent(jButtonPlay)
                                 .addGap(18, 18, 18)
                                .addComponent(jButtonPause)
                                 .addGap(18, 18, 18)
                                .addComponent(jButtonStop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dvxRecordButton)))
//                        .addContainerGap()
                                )))
        );
        jPanelRootLayout.setVerticalGroup(
            jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRootLayout.createSequentialGroup()
//                .addContainerGap()
                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAuthor)
                        .addComponent(jComboBoxAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelChapter)
                        .addComponent(jComboBoxChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonChapterPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonChapterMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDVDvolume)
                        .addComponent(labelLanguage2)
                        .addComponent(jLabelHour)
                        .addComponent(jLabelMin)
                        .addComponent(jLabelSec)
                        .addComponent(jLabelFrame))
                    .addComponent(jSliderDVDVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLanguage)
                        .addComponent(jComboBoxLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTitle))
                    .addComponent(jSliderDVXVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDVXVolume)
                        .addComponent(jTextSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelLanguage)
                        .addComponent(labelLanguage1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEject)
                    .addComponent(jButtonMount)
                    .addComponent(jButtonShutUp)
                    .addComponent(jButtonTime)
                    .addComponent(jButtonPlay)
                    .addComponent(jButtonPause)
                    .addComponent(jButtonStop)
                    .addComponent(dvxRecordButton))
                .addGap(18, 18, 18)
//                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jLabelTitle)
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
        );

//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(thePanel);
        thePanel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
                .addComponent(jPanelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addContainerGap()
                )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
               .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(jPanelRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                )
        );

    }
    

    /**
     * Slider dvd volume action performed.
     *
     * @param evt the evt
     */
    private void sliderDVDVolumeActionPerformed(ChangeEvent evt) {                                          
    		System.out.println("sliderDVDVolumeActionPerformed - " + jSliderDVDVolume.getValue());
    		System.out.println("old volume = " + dvd.getVolume());
    		float vol = jSliderDVDVolume.getValue();
    		if (vol!= 0)
    		{	// 20% of Volume + 80%
    			vol = ((vol / 100f) *.2f) + .8f;
//    			vol = vol *.2f;
//    			vol = vol + .8f;
    		}
    		System.out.println("setting to = " + vol );
    		dvd.setVolume( vol);
    		
    	}                                         

    /**
     * Slider dvx volume action performed.
     *
     * @param evt the evt
     */
    private void sliderDVXVolumeActionPerformed(ChangeEvent evt) {                                          
    		System.out.println("sliderDVXVolumeActionPerformed - " + jSliderDVXVolume.getValue());		
    		float f = jSliderDVXVolume.getValue();
    		float vol = f / 100;
    		dvxSpeak.setVolume(vol);
//    		System.out.println("New voume =  " + vol);		
    		
    	}            

    /**
     * J combo box author action performed.
     *
     * @param evt the evt
     */
    private void jComboBoxAuthorActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	String selected = jComboBoxAuthor.getSelectedItem().toString();
    	System.out.println("jComboBoxAuthorActionPerformed - " + jComboBoxAuthor.getSelectedItem());
    	Author newAuthor = dvxDBSupport.getAuthor(jComboBoxAuthor.getSelectedItem().toString());
    	setAuthor(newAuthor);
//    	dvxRecordButton.setAuthor(newAuthor);	
    	dvxSpeak.speak("Author " + selected );
    }                                               

    /**
     * J combo box language action performed.
     *
     * @param evt the evt
     */
    private void jComboBoxLanguageActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	String selected = jComboBoxLanguage.getSelectedItem().toString();
    		System.out.println("jComboBoxLanguageActionPerformed - " + selected);
    		language = dvxDBSupport.getLanguage (selected);
    		setLanguage(language);
//    		dvxRecordButton.setLanguage(language);
    		dvxSpeak.speak("Language " + selected );
    	}                                               
    /*
    private void jTextChapterActionPerformed(java.awt.event.ActionEvent evt) {                                             
    // 
    	System.out.println("jTextChapterActionPerformed - ");
    }   */                                         

    /**
     * J combo box chapter action performed.
     *
     * @param evt the evt
     */
    private void jComboBoxChapterActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    		int chapter = + jComboBoxChapter.getSelectedIndex();
    		dvd.chapterStep(chapter + 1);
    		System.out.println("jComboBoxChapterActionPerformed - " + chapter);
    	}                                                  

    /**
     * J combo box title action performed.
     *
     * @param evt the evt
     */
    private void jComboBoxTitleActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    		System.out.println("jComboBoxTitleActionPerformed - "+ jComboBoxTitle.getSelectedIndex());
    		dvd.gotoTitle(jComboBoxTitle.getSelectedIndex());
    		dvxSpeak.speak("Title " + jComboBoxTitle.getSelectedIndex());		
    	}                                                  

    /**
     * J button chapter plus action performed.
     *
     * @param evt the evt
     */
    private void jButtonChapterPlusActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    		System.out.println("jButtonChapterPlusActionPerformed - ");
    		dvd.chapterStep(1);
    		dvxSpeak.speak("Chapter Plus");
    	}                                                  

    /**
     * J button chapter minus action performed.
     *
     * @param evt the evt
     */
    private void jButtonChapterMinusActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    		System.out.println("jButtonChapterMinusActionPerformed - ");
    		dvd.chapterStep(-1);
    		dvxSpeak.speak("Chapter Minus");
    	}         
    
	/**
	 * The listener interface for receiving myButton events.
	 * The class that is interested in processing a myButton
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addMyButtonListener<code> method. When
	 * the myButton event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see MyButtonEvent
	 */
	public class MyButtonListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton)e.getSource();
			String  menuName = jb.getLabel();
			System.out.println("MyButtonListener - " + menuName);
			
			if (menuName.equals("Shut Up"))
			{
//				dvxSpeak.speak("Shut Up");
				DVX_PlaySound.shutUp();
			}
			if (menuName.equals("Eject"))
			{
				DVX_DVD_Identification.openDvdDrive();
				dvxSpeak.speak("Eject");
			}
			if (menuName.equals("Mount"))
			{
				DVX_DVD_Identification.closeDvdDrive();
				dvxSpeak.speak("Mount");
			}
			if (menuName.equals("Time"))
			{
					
//				int seconds = (dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC;
				dvxSpeak.speak("Chapter " + chapter + ", " +  jTextHour.getText() + " Hour " + jTextMinutes.getText() +" minutes " + jTextSeconds.getText() + " Seconds");
			}
			if (menuName.equals("Play"))
			{
				dvd.play();
				dvxSpeak.speak("Play");
			}
			if (menuName.equals("Pause"))
			{
				dvd.pause();
				dvxSpeak.speak("Pause");
			}
			if (menuName.equals("Stop"))
			{
				dvd.stop();
				dvxSpeak.speak("Stop");
			}
			if (menuName.equals("C+"))
			{
				dvd.chapterStep(1);
				dvxSpeak.speak("Chapter Plus");
			}
			if (menuName.equals("C-"))
			{
				dvd.chapterStep(-1);				
				dvxSpeak.speak("Chapter Minus");
			}
			if (menuName.equals("T+"))
			{
				
			}
			if (menuName.equals("T-"))
			{
				
			}
			
			}
		}
	
}
