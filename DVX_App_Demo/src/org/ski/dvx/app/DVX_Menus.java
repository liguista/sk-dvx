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

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.beans.PropertyChangeEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import org.ski.dvx.app.dialogs.Login;

// TODO: Auto-generated Javadoc
/**
 * The Class DVX_Menus.
 *
 * @author Greg
 */


public class DVX_Menus extends DVX_Base_Class{

// menu bar stuff
	
	DVX_Player dvx_player;
    
    public DVX_Player getDvx_player() {
		return dvx_player;
	}

	public void setDvx_player(DVX_Player dvx_player) {
		this.dvx_player = dvx_player;
	}

	/** The j menu bar dvx. */
private javax.swing.JMenuBar jMenuBarDVX;
    
    /** The j menu bookmarks. */
    private javax.swing.JMenu jMenuBookmarks;
    
    /** The j menu chapter. */
    private javax.swing.JMenu jMenuChapter;
    
    /** The j menu edit. */
    private javax.swing.JMenu jMenuEdit;
    
    /** The j menu file. */
    private javax.swing.JMenu jMenuFile;
    
    /** The j menu debug. */
    private javax.swing.JMenu jMenuDebug;
   
    /** The jMenuItem1. */
    private javax.swing.JMenuItem jMenuItem1;
    
    /** The jMenuItem all. */
    private javax.swing.JMenuItem jMenuItemAll;
    
    /** The jMenuItem bookmark1. */
    private javax.swing.JMenuItem jMenuItemBookmark1;
    
    /** The jMenuItem bookmark3. */
    private javax.swing.JMenuItem jMenuItemBookmark3;
    
    /** The jMenuItem chapter1. */
    private javax.swing.JMenuItem jMenuItemChapter1;
    
    /** The jMenuItem chapter2. */
    private javax.swing.JMenuItem jMenuItemChapter2;
    
    /** The jMenuItem chapter3. */
    private javax.swing.JMenuItem jMenuItemChapter3;
    
    /** The jMenuItem copy. */
    private javax.swing.JMenuItem jMenuItemCopy;
    
    /** The jMenuItem cut. */
    private javax.swing.JMenuItem jMenuItemCut;
    
    /** The jMenuItem delete. */
    private javax.swing.JMenuItem jMenuItemDelete;
    
    /** The jMenuItem eject. */
    private javax.swing.JMenuItem jMenuItemEject;
    
    /** The jMenuItem english. */
    private javax.swing.JMenuItem jMenuItemEnglish;
    
    /** The jMenuItem french. */
    private javax.swing.JMenuItem jMenuItemFrench;
    
    /** The jMenuItem japanese. */
    private javax.swing.JMenuItem jMenuItemJapanese;
    
    /** The jMenuItem minus10 minutes. */
    private javax.swing.JMenuItem jMenuItemMinus10Minutes;
    
    /** The jMenuItem minus10 second. */
    private javax.swing.JMenuItem jMenuItemMinus10Second;
    
    /** The jMenuItem minus1 minute. */
    private javax.swing.JMenuItem jMenuItemMinus1Minute;
    
    /** The jMenuItem mount. */
    private javax.swing.JMenuItem jMenuItemMount;
    
    /** The jMenuItem movie information. */
    private javax.swing.JMenuItem jMenuItemMovieInformation;
    
    /** The jMenuItem next chapter. */
    private javax.swing.JMenuItem jMenuItemNextChapter;
    
    /** The jMenuItem paste. */
    private javax.swing.JMenuItem jMenuItemPaste;
    
    /** The jMenuItem pause. */
    private javax.swing.JMenuItem jMenuItemPause;
    
    /** The jMenuItem play. */
    private javax.swing.JMenuItem jMenuItemPlay;
    
    /** The jMenuItem plus10 minutes. */
    private javax.swing.JMenuItem jMenuItemPlus10Minutes;
    
    /** The jMenuItem plus10 second. */
    private javax.swing.JMenuItem jMenuItemPlus10Second;
    
    /** The jMenuItem plus1 minute. */
    private javax.swing.JMenuItem jMenuItemPlus1Minute;
    
    /** The jMenuItem previous chapter. */
    private javax.swing.JMenuItem jMenuItemPreviousChapter;
    
    /** The jMenuItem redo. */
    private javax.swing.JMenuItem jMenuItemRedo;
    
    /** The jMenuItem remove last description. */
    private javax.swing.JMenuItem jMenuItemRemoveLastDescription;
    
    /** The jMenuItem select description. */
    private javax.swing.JMenuItem jMenuItemSelectDescription;
    
    /** The jMenuItem set bookmark1. */
    private javax.swing.JMenuItem jMenuItemSetBookmark1;
    
    /** The jMenuItem set bookmark2. */
    private javax.swing.JMenuItem jMenuItemSetBookmark2;
    
    /** The jMenuItem set bookmark3. */
    private javax.swing.JMenuItem jMenuItemSetBookmark3;
    
    /** The jMenuItem set movie description. */
    private javax.swing.JMenuItem jMenuItemSetMovieDescription;
    
    /** The jMenuItem set movie login . */
    private javax.swing.JMenuItem jMenuItemLogin;

    /** The jMenuItem set movie logout. */
    private javax.swing.JMenuItem jMenuItemLogout;

    /** The jMenuItem shutup. */
    private javax.swing.JMenuItem jMenuItemShutup;
    
    /** The jMenuItem spanish. */
    private javax.swing.JMenuItem jMenuItemSpanish;
    
    /** The jMenuItem stop. */
    private javax.swing.JMenuItem jMenuItemStop;
    
    /** The jMenuItem title1. */
    private javax.swing.JMenuItem jMenuItemTitle1;
    
    /** The jMenuItem title2. */
    private javax.swing.JMenuItem jMenuItemTitle2;
    
    /** The jMenuItem title3. */
    private javax.swing.JMenuItem jMenuItemTitle3;
    
    /** The jMenuItem undo. */
    private javax.swing.JMenuItem jMenuItemUndo;
    
    /** The jMenuItem bookmark2. */
    private javax.swing.JMenuItem jMenuItemBookmark2;
    
    /** The j menu language. */
    private javax.swing.JMenu jMenuLanguage;
    
    /** The j menu descriptions. */
    private javax.swing.JMenu  jMenuDescriptions;
    
    /** The j menu title. */
    private javax.swing.JMenu jMenuTitle;
    
    /** The j menu transport. */
    private javax.swing.JMenu jMenuTransport;

    /** The jMenuItem debug1. */
    private javax.swing.JMenuItem jMenuItemDebug1;
    
    /** The jMenuItem debug2. */
    private javax.swing.JMenuItem jMenuItemDebug2;
    
    /** The jMenuItem debug3. */
    private javax.swing.JMenuItem jMenuItemDebug3;
    
    /** The jMenuItem debug4. */
    private javax.swing.JMenuItem jMenuItemDebug4;
    
    /** The jMenuItem debug5. */
    private javax.swing.JMenuItem jMenuItemDebug5;

    
    /** The j check box menu item mute dvd. */
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemMuteDVD;
    
    /** The j check box menu item mute dvx. */
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemMuteDVX;
    
    /** The j menu help. */
    private javax.swing.JMenu jMenuHelp;
    
    /** The jMenuItem help contents. */
    private javax.swing.JMenuItem jMenuItemHelpContents;
    
    /** The jMenuItem about dvx. */
    private javax.swing.JMenuItem jMenuItemAboutDVX;
    
    /** The jMenuItem description list. */
    private javax.swing.JMenuItem jMenuItemDescriptionList;
    
    /** The j menu help. */
    private javax.swing.JMenu jMenuClipRating;
    
    /** The jMenuItem help contents. */
    private javax.swing.JMenuItem jMenuItemClipRating_Great;
    
    /** The jMenuItem about dvx. */
    private javax.swing.JMenuItem jMenuItemClipRating_Good;
    
    /** The jMenuItem description list. */
    private javax.swing.JMenuItem jMenuItemClipRating_OK;
    
    /** The jMenuItem description list. */
    private javax.swing.JMenuItem jMenuItemClipRating_SOSO;
    
    /** The jMenuItem description list. */
    private javax.swing.JMenuItem jMenuItemClipRating_Bad;
    
    
    
    /**
     * Instantiates a new dV x_ menus.
     */
    DVX_Menus()
    {
    	super();
    }
        
    /**
     * Inits the menus.
     *
     * @param dvxFrame the dvx frame
     */
    void initMenus(javax.swing.JFrame dvxFrame)
    {
    	jMenuBarDVX = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
 
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemLogout = new javax.swing.JMenuItem();
        
        jMenuItemMovieInformation = new javax.swing.JMenuItem();
        jMenuItemSelectDescription = new javax.swing.JMenuItem();
        jMenuItemMount = new javax.swing.JMenuItem();
        jMenuItemEject = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuLanguage = new javax.swing.JMenu();
        jMenuItemAll = new javax.swing.JMenuItem();
//        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItemEnglish = new javax.swing.JMenuItem();
        jMenuItemSpanish = new javax.swing.JMenuItem();
        jMenuItemFrench = new javax.swing.JMenuItem();
        jMenuItemJapanese = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuItemUndo = new javax.swing.JMenuItem();
        jMenuItemRedo = new javax.swing.JMenuItem();
//        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCut = new javax.swing.JMenuItem();
        jMenuItemCopy = new javax.swing.JMenuItem();
        jMenuItemPaste = new javax.swing.JMenuItem();
        jMenuItemDelete = new javax.swing.JMenuItem();
//        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItemMuteDVD = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemMuteDVX = new javax.swing.JCheckBoxMenuItem();
//        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemShutup = new javax.swing.JMenuItem();
        jMenuTransport = new javax.swing.JMenu();
        jMenuItemPlay = new javax.swing.JMenuItem();
        jMenuItemPause = new javax.swing.JMenuItem();
        jMenuItemStop = new javax.swing.JMenuItem();
//        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItemMinus10Second = new javax.swing.JMenuItem();
        jMenuItemPlus10Second = new javax.swing.JMenuItem();
        jMenuItemMinus1Minute = new javax.swing.JMenuItem();
        jMenuItemPlus1Minute = new javax.swing.JMenuItem();
        jMenuItemMinus10Minutes = new javax.swing.JMenuItem();
        jMenuItemPlus10Minutes = new javax.swing.JMenuItem();
        jMenuDescriptions = new javax.swing.JMenu();
        jMenuItemSetMovieDescription = new javax.swing.JMenuItem();
        jMenuItemRemoveLastDescription = new javax.swing.JMenuItem();
        jMenuChapter = new javax.swing.JMenu();
        jMenuItemNextChapter = new javax.swing.JMenuItem();
        jMenuItemPreviousChapter = new javax.swing.JMenuItem();
//        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItemChapter1 = new javax.swing.JMenuItem();
        jMenuItemChapter2 = new javax.swing.JMenuItem();
        jMenuItemChapter3 = new javax.swing.JMenuItem();
        jMenuTitle = new javax.swing.JMenu();
        jMenuItemTitle1 = new javax.swing.JMenuItem();
        jMenuItemTitle2 = new javax.swing.JMenuItem();
        jMenuItemTitle3 = new javax.swing.JMenuItem();
        jMenuBookmarks = new javax.swing.JMenu();
        jMenuItemSetBookmark1 = new javax.swing.JMenuItem();
        jMenuItemSetBookmark2 = new javax.swing.JMenuItem();
        jMenuItemSetBookmark3 = new javax.swing.JMenuItem();
//        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItemBookmark1 = new javax.swing.JMenuItem();
        jMenuItemBookmark2 = new javax.swing.JMenuItem();
        jMenuItemBookmark3 = new javax.swing.JMenuItem();
        
        jMenuClipRating= new javax.swing.JMenu();
        
        /** The jMenuItem help contents. */
       jMenuItemClipRating_Great = new javax.swing.JMenuItem();
        
        /** The jMenuItem about dvx. */
        jMenuItemClipRating_Good = new javax.swing.JMenuItem();
        
        /** The jMenuItem description list. */
        jMenuItemClipRating_OK = new javax.swing.JMenuItem();
        
        /** The jMenuItem description list. */
        jMenuItemClipRating_SOSO = new javax.swing.JMenuItem();
        
        /** The jMenuItem description list. */
        jMenuItemClipRating_Bad = new javax.swing.JMenuItem();

        
        // *********************************************************************
        jMenuFile.setText("File");

        jMenuItemLogin  = addMenuItem(	jMenuFile, "Login...",	null);
        jMenuItemLogout  = addMenuItem(	jMenuFile, "Logout...",	null);


     jMenuItemMovieInformation.setText("Movie Information...");
     jMenuItemMovieInformation.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
     
     jMenuFile.add(jMenuItemMovieInformation);

     jMenuItemSelectDescription.setText("Select Description...");
     jMenuFile.add(jMenuItemSelectDescription);
     jMenuFile.add(new javax.swing.JSeparator());
     jMenuItemSelectDescription.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
     
     jMenuItemMount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
     jMenuItemMount.setText("Mount");
     jMenuFile.add(jMenuItemMount);
     jMenuItemMount.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemEject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
     jMenuItemEject.setText("Eject");
     jMenuFile.add(jMenuItemEject);
     jMenuFile.add(new javax.swing.JSeparator());
     jMenuItemEject.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
     jMenuItem1.setText("Quit");
     jMenuFile.add(jMenuItem1);
     jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuBarDVX.add(jMenuFile);
     // *********************************************************************

     jMenuLanguage.setText("Language");
     jMenuLanguage.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemAll.setText("All");
     jMenuLanguage.add(jMenuItemAll);
     jMenuLanguage.add(new javax.swing.JSeparator());
     jMenuItemAll.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemEnglish.setText("English");
     jMenuLanguage.add(jMenuItemEnglish);
     jMenuItemEnglish.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemSpanish.setText("Spanish");
     jMenuLanguage.add(jMenuItemSpanish);
     jMenuItemSpanish.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemFrench.setText("French");
     jMenuLanguage.add(jMenuItemFrench);
     jMenuItemFrench.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemJapanese.setText("Japanese");
     jMenuLanguage.add(jMenuItemJapanese);
     jMenuItemJapanese.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuBarDVX.add(jMenuLanguage);
     // *********************************************************************
 
     jMenuEdit.setText("Edit");
    
 
     jMenuItemUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, 0));
     jMenuItemUndo.setText("Undo");
     jMenuEdit.add(jMenuItemUndo);
     jMenuItemUndo.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, 0));
     jMenuItemRedo.setText("Redo");
     jMenuEdit.add(jMenuItemRedo);
     jMenuEdit.add(new javax.swing.JSeparator());
     jMenuItemRedo.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, 0));
     jMenuItemCut.setText("Cut");
     jMenuEdit.add(jMenuItemCut);
     jMenuItemCut.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
     jMenuItemCopy.setText("Copy");
     jMenuEdit.add(jMenuItemCopy);
     jMenuItemCopy.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemPaste.setText("Paste");
     jMenuEdit.add(jMenuItemPaste);
     jMenuItemPaste.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
     jMenuItemDelete.setText("Delete");
     jMenuEdit.add(jMenuItemDelete);
     jMenuEdit.add(new javax.swing.JSeparator());
     jMenuItemDelete.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jCheckBoxMenuItemMuteDVD.setSelected(false);
     jCheckBoxMenuItemMuteDVD.setText("Mute DVD");
     jMenuEdit.add(jCheckBoxMenuItemMuteDVD);
     jCheckBoxMenuItemMuteDVD.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
/*     
     jCheckBoxMenuItemMuteDVX.setSelected(false);
     jCheckBoxMenuItemMuteDVD.setText("Mute DVX");
     jMenuEdit.add(jCheckBoxMenuItemMuteDVX);
     jCheckBoxMenuItemMuteDVX.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 */
//     jCheckBoxMenuItemMuteDVX.setSelected(true);
     jCheckBoxMenuItemMuteDVX.setText("Mute DVX");
     jMenuEdit.add(jCheckBoxMenuItemMuteDVX);
     jCheckBoxMenuItemMuteDVX.setSelected(false);
     jCheckBoxMenuItemMuteDVX.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     }); 

     jMenuEdit.add(new javax.swing.JSeparator());

     jMenuItemShutup.setText("ShutUp");
     jMenuEdit.add(jMenuItemShutup);
     jMenuItemShutup.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuBarDVX.add(jMenuEdit);

     // *********************************************************************

     
     jMenuTransport.setText("Transport");
   
     jMenuItemPlay.setText("Play");
     jMenuItemPlay.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuTransport.add(jMenuItemPlay);

     jMenuItemPause.setText("Pause");
     jMenuTransport.add(jMenuItemPause);
     jMenuItemPause.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemStop.setText("Stop");
     jMenuTransport.add(jMenuItemStop);
     jMenuTransport.add(new javax.swing.JSeparator());
     jMenuItemStop.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemMinus10Second.setText("- 10 Second");
     jMenuTransport.add(jMenuItemMinus10Second);
     jMenuItemMinus10Second.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemPlus10Second.setText("+ 10 Second");
     jMenuTransport.add(jMenuItemPlus10Second);
     jMenuItemPlus10Second.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemMinus1Minute.setText("- 1 minute");
     jMenuTransport.add(jMenuItemMinus1Minute);
     jMenuItemMinus1Minute.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemPlus1Minute.setText("+ 1 Minute");
     jMenuTransport.add(jMenuItemPlus1Minute);
     jMenuItemPlus1Minute.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemMinus10Minutes.setText("- 10 Minute");
     jMenuTransport.add(jMenuItemMinus10Minutes);
     jMenuItemMinus10Minutes.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemPlus10Minutes.setText("+ 10 Minute");
     jMenuTransport.add(jMenuItemPlus10Minutes);
     jMenuItemPlus10Minutes.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuBarDVX.add(jMenuTransport);

     // *********************************************************************

      jMenuDescriptions.setText("Descriptions");
      jMenuDescriptions.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
 
     jMenuItemSetMovieDescription.setText("Set Movie Description...");
     jMenuItemSetMovieDescription.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
      jMenuDescriptions.add(jMenuItemSetMovieDescription);

     jMenuItemRemoveLastDescription.setText("Remove Last Description");
     jMenuDescriptions.add(jMenuItemRemoveLastDescription);
     jMenuItemRemoveLastDescription.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuBarDVX.add( jMenuDescriptions);

     // *********************************************************************

     jMenuChapter.setText("Chapter");

     jMenuItemNextChapter.setText("Next Chapter");
     jMenuItemNextChapter.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
     
     jMenuChapter.add(jMenuItemNextChapter);

     jMenuItemPreviousChapter.setText("Previous Chapter");
     jMenuChapter.add(jMenuItemPreviousChapter);
     jMenuChapter.add(new javax.swing.JSeparator());
     jMenuItemPreviousChapter.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuItemChapter1.setText("Chapter 1");
     jMenuChapter.add(jMenuItemChapter1);
     jMenuItemChapter1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuItemChapter2.setText("Chapter 2");
     jMenuChapter.add(jMenuItemChapter2);
     jMenuItemChapter2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuItemChapter3.setText("Chapter 3");
     jMenuChapter.add(jMenuItemChapter3);
     jMenuItemChapter3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuBarDVX.add(jMenuChapter);

     // *********************************************************************

     jMenuTitle.setText("Title");

     jMenuItemTitle1.setText("Title 1");
     jMenuItemTitle1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
     jMenuTitle.add(jMenuItemTitle1);

     jMenuItemTitle2.setText("Title 2");
     jMenuTitle.add(jMenuItemTitle2);
     jMenuItemTitle2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuItemTitle3.setText("Title 3");
     jMenuTitle.add(jMenuItemTitle3);
     jMenuItemTitle3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuBarDVX.add(jMenuTitle);

     // *********************************************************************

     jMenuBookmarks.setText("Bookmarks");

     jMenuItemSetBookmark1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
     jMenuItemSetBookmark1.setText("Set Bookmark 1");
     jMenuBookmarks.add(jMenuItemSetBookmark1);
     jMenuItemSetBookmark1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
     
     jMenuItemSetBookmark2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
     jMenuItemSetBookmark2.setText("Set Bookmark 2");
     jMenuBookmarks.add(jMenuItemSetBookmark2);
     jMenuItemSetBookmark2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
     
     jMenuItemSetBookmark3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
     jMenuItemSetBookmark3.setText("Set Bookmark 3");
     jMenuBookmarks.add(jMenuItemSetBookmark3);
     jMenuItemSetBookmark3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuBookmarks.add(new javax.swing.JSeparator());

     jMenuItemBookmark1.setText("Bookmark 1");
     jMenuBookmarks.add(jMenuItemBookmark1);
     jMenuItemBookmark1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuItemBookmark2.setText("Bookmark 2");
     jMenuBookmarks.add(jMenuItemBookmark2);
     jMenuItemBookmark2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuItemBookmark3.setText("Bookmark 3");
     jMenuBookmarks.add(jMenuItemBookmark3);
     jMenuItemBookmark3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });

     jMenuBarDVX.add(jMenuBookmarks);
/*
     jCheckBoxMenuItemMuteDVD = new javax.swing.JCheckBoxMenuItem();
     jCheckBoxMenuItemMuteDVD.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             jMenuItemSetMovieDescriptionActionPerformed(evt);
         }
     });

     jCheckBoxMenuItemMuteDVX = new javax.swing.JCheckBoxMenuItem();
     jCheckBoxMenuItemMuteDVX.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             jMenuItemSetMovieDescriptionActionPerformed(evt);
         }
     });
 */    
     // *********************************************************************

     jMenuHelp = new javax.swing.JMenu();
     jMenuItemHelpContents = new javax.swing.JMenuItem();
     jMenuItemHelpContents.setText("DVX Help");
     jMenuItemHelpContents.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
     
     jMenuHelp.add(jMenuItemHelpContents);

     jMenuItemAboutDVX = new javax.swing.JMenuItem();
     jMenuItemAboutDVX.setText("About DVX");
     jMenuItemAboutDVX.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	handleMenuEvent(evt);
        }
    });
     jMenuHelp.add(jMenuItemAboutDVX);
    
     jMenuItemDescriptionList = new javax.swing.JMenuItem();
     
     jMenuItemDescriptionList.setText("Description List");
     jMenuItemDescriptionList.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
     
      jMenuDescriptions.add(jMenuItemDescriptionList);
      
      jMenuHelp.setText("Help");

      jMenuBarDVX.add(jMenuHelp);

      // *********************************************************************
      /** The jMenuItem about dvx. */
      
      /** The jMenuItem description list. */
      jMenuItemClipRating_Great  = addMenuItem(	jMenuClipRating, "Great", 
    		  									javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.ALT_MASK));
      
      jMenuItemClipRating_Good = addMenuItem(	jMenuClipRating, "Good", 
    		  									javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK));
      
      /** The jMenuItem description list. */
      jMenuItemClipRating_OK  = addMenuItem(	jMenuClipRating, "Ok", 
    		  									javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK));
      
      /** The jMenuItem description list. */
      jMenuItemClipRating_SOSO  = addMenuItem(	jMenuClipRating, "So So", 
    		  									javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
      
      /** The jMenuItem description list. */
      jMenuItemClipRating_Bad  = addMenuItem(	jMenuClipRating, "Bad", 
    		  									javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));

      jMenuClipRating.setText("Clip Rating");

      jMenuBarDVX.add(jMenuClipRating);
      
     // *********************************************************************

      
 	 jMenuDebug = new javax.swing.JMenu();
	 jMenuDebug.setText("Debug");
	 
     jMenuItemDebug1 = new javax.swing.JMenuItem();
     jMenuItemDebug1.setText("Toggle Verbose");
     jMenuDebug.add(jMenuItemDebug1);
     jMenuItemDebug1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
     
     jMenuItemDebug2 = new javax.swing.JMenuItem();
     jMenuItemDebug2.setText("Debug 2");
     jMenuDebug.add(jMenuItemDebug2);
     jMenuItemDebug2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
    
     jMenuItemDebug3 = new javax.swing.JMenuItem();
     jMenuItemDebug3.setText("Fullscreen");
     jMenuDebug.add(jMenuItemDebug3);
     jMenuItemDebug3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
          }
     });
     
     jMenuItemDebug4 = new javax.swing.JMenuItem();
     jMenuItemDebug4.setText("Show States");
     jMenuDebug.add(jMenuItemDebug4);
     jMenuItemDebug4.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);
         }
     });
     
     jMenuItemDebug5 = new javax.swing.JMenuItem();
     jMenuItemDebug5.setText("Hide States");
     jMenuDebug.add(jMenuItemDebug5);
     jMenuItemDebug5.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 handleMenuEvent(evt);     
         }
     });
     
     jMenuBarDVX.add(jMenuDebug);

     dvxFrame.setJMenuBar(jMenuBarDVX);    	
    }

	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Handle menu event.
	 *
	 * @param event the event
	 */
	void handleMenuEvent(java.awt.event.ActionEvent event)
	{
		System.out.println("Menu command = " + event.getActionCommand());
		
		String command =  event.getActionCommand();
		
		if (command.equalsIgnoreCase("Set Bookmark 1"))
		{
			try {
				dvd.saveBookmark(DVX_Constants.DVX_BOOKMARK_FILE + "1");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception setting bookmark 1" + e);
			}
		}

		if (command.equalsIgnoreCase("Set Bookmark 2"))
		{
			try {
				dvd.saveBookmark(DVX_Constants.DVX_BOOKMARK_FILE + "2");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception setting bookmark 1" + e);
			}
		}

		if (command.equalsIgnoreCase("Set Bookmark 3"))
		{
			try {
				dvd.saveBookmark(DVX_Constants.DVX_BOOKMARK_FILE + "3");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception setting bookmark 1" + e);
			}
		}

		if (command.equalsIgnoreCase("Bookmark 1"))
		{
			try {
				dvd.restoreBookmark( DVX_Constants.DVX_BOOKMARK_FILE + "1");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception getting bookmark 1" + e);
			}
		}
		if (command.equalsIgnoreCase("Bookmark 2"))
		{
			try {
				dvd.restoreBookmark(DVX_Constants.DVX_BOOKMARK_FILE + "2");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception getting bookmark 1" + e);
			}
		}		
		if (command.equalsIgnoreCase("Bookmark 3"))
		{
			try {
				dvd.restoreBookmark(DVX_Constants.DVX_BOOKMARK_FILE + "3");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception getting bookmark 3" + e);
			}
		}
		
		// ************************
		
		if (command.equalsIgnoreCase("Great"))
		{
			dvxDBSupport.rateDescription(getUser(), getLanguage(), getMovie(), "Great");
			getDvxSpeak().speak("Great");
		}
		if (command.equalsIgnoreCase("Good"))
		{
			dvxDBSupport.rateDescription(getUser(), getLanguage(), getMovie(),"Good");
			getDvxSpeak().speak("Good");
		}
		if (command.equalsIgnoreCase("Ok"))
		{
			dvxDBSupport.rateDescription(getUser(), getLanguage(), getMovie(), "Ok");
			getDvxSpeak().speak("Ok");
		}
		if (command.equalsIgnoreCase("So So"))
		{
			dvxDBSupport.rateDescription(getUser(), getLanguage(), getMovie(), "So So");
			getDvxSpeak().speak("So So");
		}
		if (command.equalsIgnoreCase("Bad"))
		{
			dvxDBSupport.rateDescription(getUser(), getLanguage(), getMovie(),"Bad");
			getDvxSpeak().speak("Bad");
		}
		
		// ************************
		
		if (command.equalsIgnoreCase("DVX Help"))
		{
			System.out.println("DVX Help" );
			
		}
		if (command.equalsIgnoreCase("Toggle Verbose"))
		{
			setVerbose(!isVerbose());
			System.out.println("Verbose set to " + isVerbose() );
			getDvxSpeak().speak("Verbose set to " + isVerbose());
		}
		if (command.equalsIgnoreCase("Debug 2"))
		{
			System.out.println("gotoTitle*****************************" ) ;
			System.out.println("DVD title count = " + dvd.gotoTitle(1) ) ;
			System.out.println("gotoTitle*****************************" ) ;
		}
		if (command.equalsIgnoreCase("Fullscreen"))
		{
//			dvd.goFullScreen(dvd.getGraphics(), 0);
//			System.out.println("showMenu*****************************" ) ;
//			dvd.showMenu(dvd.NAV_TITLE_MENU );
//			System.out.println("showMenu*****************************" ) ;
			 GraphicsEnvironment ge = GraphicsEnvironment.
			   getLocalGraphicsEnvironment();
			   GraphicsDevice[] gs = ge.getScreenDevices();		
			   GraphicsDevice gd = gs[0];
			   dvd.goFullScreen(gd, 0);
		}
		if (command.equalsIgnoreCase("Show States"))
		{
			dvdStates.setVisible(true);
		}
		
		if (command.equalsIgnoreCase("Hide States"))
		{
			dvdStates.setVisible(false);
		}
		
		if (command.equalsIgnoreCase("Login..."))
		{
	        java.awt.EventQueue.invokeLater(new Runnable() {
	
	            public void run() {
	            	Login login = new Login(getDvx_player());
	            	login.setVisible(true);
	            	
	            }
	        });
		}

}
	
	// *******************************************************************
	
	/**
	 * Adds the menu item.
	 *
	 * @param menu the menu
	 * @param text the text
	 * @param keyStroke the key stroke
	 * @return the j menu item
	 */
	JMenuItem addMenuItem(JMenu menu, String text, KeyStroke keyStroke)
	{
		JMenuItem menuItem = new JMenuItem();
		
		menuItem.setText(text);
		menuItem.addActionListener(new java.awt.event.ActionListener() {
	         public void actionPerformed(java.awt.event.ActionEvent evt) {
	        	 handleMenuEvent(evt);
	         }
	     });
		if (keyStroke!=null)
			menuItem.setAccelerator(keyStroke);

		menu.add(menuItem);
		return menuItem;
	}


}
