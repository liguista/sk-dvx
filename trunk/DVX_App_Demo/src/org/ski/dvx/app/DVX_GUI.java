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

/**
 * @author Greg
 *
 */
public class DVX_GUI extends DVX_Menus{
	

    // Variables declaration - do not modify                     
//  private javax.swing.JButton jButtonAdd;
//   private javax.swing.JButton jButtonPlay;
  javax.swing.JButton jButtonRecord;
  javax.swing.JButton jButtonChapterMinus;
  javax.swing.JButton jButtonChapterPlus;
  javax.swing.JComboBox jComboBoxAuthor;
  javax.swing.JComboBox jComboBoxChapter;
  javax.swing.JComboBox jComboBoxTitle;
  javax.swing.JComboBox jComboBoxLanguage;
  javax.swing.JLabel jLabelAuthor;
  javax.swing.JLabel jLabelHour;
  javax.swing.JLabel jLabelDVDvolume;
  javax.swing.JLabel jLabelDVXVolume;
  javax.swing.JLabel jLabelFrame;
  javax.swing.JLabel jLabelLanguage;
  javax.swing.JLabel jLabelMin;
  javax.swing.JLabel jLabelSec;
  javax.swing.JLabel jLabelTitle;
  javax.swing.JPanel jPanel1;
  javax.swing.JPanel jPanelRoot;
  javax.swing.JSeparator jSeparator1;
  javax.swing.JSeparator jSeparator2;
  javax.swing.JSlider jSliderDVXVolume;
  javax.swing.JSlider jSliderDVDVolume;
  javax.swing.JTextField jTextChapter;
  javax.swing.JTextField jTextFrame;
  javax.swing.JTextField jTextMinutes;
  javax.swing.JTextField jTextSeconds;
  javax.swing.JLabel labelChapter;
  javax.swing.JLabel labelLanguage;
  javax.swing.JLabel labelLanguage1;
  javax.swing.JLabel labelLanguage2;
  javax.swing.JLabel labelTitle;
  // End of variables declaration    

  javax.swing.JButton btnChapterPlus;
  javax.swing.JButton btnChapterMinus;

  javax.swing.JButton btnTitlePlus ;
  javax.swing.JButton btnTitleMinus;

  javax.swing.JButton jButtonShutUp;
  javax.swing.JButton jButtonTime ;
  javax.swing.JButton jButtonPlay;
  javax.swing.JButton jButtonPause ;
  javax.swing.JButton jButtonStop ;
  javax.swing.JButton jButtonEject;
  javax.swing.JButton jButtonMount;

  DVX_GUI()
  {
	  super();
  }
	
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        jTextFrame = new javax.swing.JTextField();
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
        jComboBoxAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAuthorActionPerformed(evt);
            }
        });

        jLabelAuthor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAuthor.setText("Author:");

        jComboBoxLanguage.setModel(new javax.swing.DefaultComboBoxModel(dvxDBSupport.getLanguageList()));
        jComboBoxLanguage.setToolTipText("Language");
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

        jTextFrame.setText("00");
        jTextFrame.setToolTipText("Frame");
        jTextFrame.setMargin(new java.awt.Insets(2, 4, 2, 4));
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
                                        .addComponent(jTextFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jTextFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
     * @param evt
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
     * @param evt
     */
    private void sliderDVXVolumeActionPerformed(ChangeEvent evt) {                                          
    		System.out.println("sliderDVXVolumeActionPerformed - " + jSliderDVXVolume.getValue());		
    		float f = jSliderDVXVolume.getValue();
    		float vol = f / 100;
    		dvxSpeak.setVolume(vol);
//    		System.out.println("New voume =  " + vol);		
    		
    	}            

    private void jComboBoxAuthorActionPerformed(java.awt.event.ActionEvent evt) {                                                
    	String selected = jComboBoxAuthor.getSelectedItem().toString();
    	System.out.println("jComboBoxAuthorActionPerformed - " + jComboBoxAuthor.getSelectedItem());
    	Author newAuthor = dvxDBSupport.getAuthor(jComboBoxAuthor.getSelectedItem().toString());
    	setAuthor(newAuthor);
//    	dvxRecordButton.setAuthor(newAuthor);	
    	dvxSpeak.speak("Author " + selected );
    }                                               

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

    private void jComboBoxChapterActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    		int chapter = + jComboBoxChapter.getSelectedIndex();
    		dvd.chapterStep(chapter + 1);
    		dvxSpeak.speak("Chapter " + chapter );
    		System.out.println("jComboBoxChapterActionPerformed - " + chapter);
    	}                                                  

    private void jComboBoxTitleActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    		System.out.println("jComboBoxTitleActionPerformed - "+ jComboBoxTitle.getSelectedIndex());
    		dvd.gotoTitle(jComboBoxTitle.getSelectedIndex());
    		dvxSpeak.speak("Title " + jComboBoxTitle.getSelectedIndex());		
    	}                                                  

    private void jButtonChapterPlusActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    		System.out.println("jButtonChapterPlusActionPerformed - ");
    		dvd.chapterStep(1);
    		dvxSpeak.speak("Chapter Plus");
    	}                                                  

    private void jButtonChapterMinusActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    		System.out.println("jButtonChapterMinusActionPerformed - ");
    		dvd.chapterStep(-1);
    		dvxSpeak.speak("Chapter Minus");
    	}         
    
	public class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton)e.getSource();
			String  menuName = jb.getLabel();
			System.out.println("MyButtonListener - " + menuName);
			
			if (menuName.equals("Shut Up"))
			{
				dvxSpeak.speak("Shut Up");
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
				int seconds = (dvd.getTime() - baseTime) / DVX_Constants.MS_PER_SEC;
				dvxSpeak.speak("Chapter " + chapter + ", " + seconds / 60 +" minutes " + seconds % 60 + " Seconds");
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
