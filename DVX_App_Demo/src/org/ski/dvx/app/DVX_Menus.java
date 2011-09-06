/**
 * 
 */
package org.ski.dvx.app;

import java.beans.PropertyChangeEvent;

/**
 * @author Greg
 *
 */


public class DVX_Menus extends DVX_Base_Class{

// menu bar stuff
    
    private javax.swing.JMenuBar jMenuBarDVX;
    private javax.swing.JMenu jMenuBookmarks;
    private javax.swing.JMenu jMenuChapter;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAll;
    private javax.swing.JMenuItem jMenuItemBookmark1;
    private javax.swing.JMenuItem jMenuItemBookmark3;
    private javax.swing.JMenuItem jMenuItemChapter1;
    private javax.swing.JMenuItem jMenuItemChapter2;
    private javax.swing.JMenuItem jMenuItemChapter3;
    private javax.swing.JMenuItem jMenuItemCopy;
    private javax.swing.JMenuItem jMenuItemCut;
    private javax.swing.JMenuItem jMenuItemDelete;
    private javax.swing.JMenuItem jMenuItemEject;
    private javax.swing.JMenuItem jMenuItemEnglish;
    private javax.swing.JMenuItem jMenuItemFrench;
    private javax.swing.JMenuItem jMenuItemJapanese;
    private javax.swing.JMenuItem jMenuItemMinus10Minutes;
    private javax.swing.JMenuItem jMenuItemMinus10Second;
    private javax.swing.JMenuItem jMenuItemMinus1Minute;
    private javax.swing.JMenuItem jMenuItemMount;
    private javax.swing.JMenuItem jMenuItemMovieInformation;
    private javax.swing.JMenuItem jMenuItemNextChapter;
    private javax.swing.JMenuItem jMenuItemPaste;
    private javax.swing.JMenuItem jMenuItemPause;
    private javax.swing.JMenuItem jMenuItemPlay;
    private javax.swing.JMenuItem jMenuItemPlus10Minutes;
    private javax.swing.JMenuItem jMenuItemPlus10Second;
    private javax.swing.JMenuItem jMenuItemPlus1Minute;
    private javax.swing.JMenuItem jMenuItemPreviousChapter;
    private javax.swing.JMenuItem jMenuItemRedo;
    private javax.swing.JMenuItem jMenuItemRemoveLastDescription;
    private javax.swing.JMenuItem jMenuItemSelectDescription;
    private javax.swing.JMenuItem jMenuItemSetBookmark1;
    private javax.swing.JMenuItem jMenuItemSetBookmark2;
    private javax.swing.JMenuItem jMenuItemSetBookmark3;
    private javax.swing.JMenuItem jMenuItemSetMovieDescription;
    private javax.swing.JMenuItem jMenuItemShutup;
    private javax.swing.JMenuItem jMenuItemSpanish;
    private javax.swing.JMenuItem jMenuItemStop;
    private javax.swing.JMenuItem jMenuItemTitle1;
    private javax.swing.JMenuItem jMenuItemTitle2;
    private javax.swing.JMenuItem jMenuItemTitle3;
    private javax.swing.JMenuItem jMenuItemUndo;
    private javax.swing.JMenuItem jMenuItemookmark2;
    private javax.swing.JMenu jMenuLanguage;
    private javax.swing.JMenu  jMenuDescriptions;
    private javax.swing.JMenu jMenuTitle;
    private javax.swing.JMenu jMenuTransport;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemMuteDVD;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemMuteDVX;
    
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemHelpContents;
    private javax.swing.JMenuItem jMenuItemAboutDVX;
    private javax.swing.JMenuItem jMenuItemDescriptionList;
    
    DVX_Menus()
    {
    	super();
    }
        
    void initMenus(javax.swing.JFrame dvxFrame)
    {
    	jMenuBarDVX = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
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
        jMenuItemookmark2 = new javax.swing.JMenuItem();
        jMenuItemBookmark3 = new javax.swing.JMenuItem();
	 jMenuFile.setText("File");

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

     jMenuItemookmark2.setText("Bookmark 2");
     jMenuBookmarks.add(jMenuItemookmark2);
     jMenuItemookmark2.addActionListener(new java.awt.event.ActionListener() {
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


     dvxFrame.setJMenuBar(jMenuBarDVX);    	
    }

	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
	
		
	}
	

	private void jMenuItemMovieInformatioActionPerformed(java.awt.event.ActionEvent evt) {
	// TODO add your handling code here:
	}

	private void jMenuItemPlayActionPerformed(java.awt.event.ActionEvent evt) {
	// TODO add your handling code here:
	}

	private void jMenuItemSetMovieDescriptionActionPerformed(java.awt.event.ActionEvent evt) {
	// TODO add your handling code here:
	}

	private void jMenuItemNextChapterActionPerformed(java.awt.event.ActionEvent evt) {
	// TODO add your handling code here:
	}

	private void jMenuItemTitle1ActionPerformed(java.awt.event.ActionEvent evt) {
	// TODO add your handling code here:
	}
	private void jMenuItemDescriptionListActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		}
	
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
		if (command.equalsIgnoreCase("DVX Help"))
		{
			System.out.println("DVX Help" );
			
		}
	}
	
	/**
		String num2StringFmt(int number)
		 * @param number to be formatted
		 * @return String with leading 0 if < 10
	 */


}
