package main;


import controler.pack.FileControl;
import controler.pack.MusicControl;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class MP3PlayerGUI extends javax.swing.JFrame
{
    
    private FileControl fileControl = new FileControl();
    private MusicControl musicControl = new MusicControl();
    
    int xMouse;
    int yMouse;
    
    int width = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 185;
    int height = Toolkit.getDefaultToolkit().getScreenSize().height - 180;
    
    public MP3PlayerGUI(java.awt.Frame parent, boolean modal) 
    {
        initComponents();
              
        stanPause=true;
        this.setLocation(width, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Stop = new javax.swing.JLabel();
        Pause = new javax.swing.JLabel();
        Play = new javax.swing.JLabel();
        Left = new javax.swing.JLabel();
        Right = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        SelectFile1 = new javax.swing.JLabel();
        SelectFile2 = new javax.swing.JLabel();
        Play1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SelectFile3 = new javax.swing.JLabel();
        SelectFile4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MP3 Player");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StopMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                StopMouseReleased(evt);
            }
        });
        getContentPane().add(Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 43, 70, 68));

        Pause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PauseMouseClicked(evt);
            }
        });
        getContentPane().add(Pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 40, 60, 74));

        Play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PlayMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PlayMouseReleased(evt);
            }
        });
        getContentPane().add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 40, 60, 70));

        Left.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LeftMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LeftMouseReleased(evt);
            }
        });
        getContentPane().add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 40, 70, 70));

        Right.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Right.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RightMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RightMouseReleased(evt);
            }
        });
        getContentPane().add(Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 60, 70));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/AudioWidget.png"))); // NOI18N
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 150));

        SelectFile1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(SelectFile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 60, 70));

        SelectFile2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(SelectFile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 60, 70));

        Play1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Play1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 60, 70));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 60, 70));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 30));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 70, 60));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        SelectFile3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(SelectFile3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 60, 70));

        SelectFile4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(SelectFile4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 60, 70));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 50, 50));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jMenu1.setText("File");

        jMenuItem2.setText("Open File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void PlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMousePressed
       Play.setIcon(new ImageIcon(getClass().getResource("/main/playAction.png")));       
    }//GEN-LAST:event_PlayMousePressed

    private void PlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseReleased
       Play.setIcon(null);
       musicControl.playMusic(fileControl.getPath());
    }//GEN-LAST:event_PlayMouseReleased

    private void PauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseMouseClicked
        if(stanPause==true){
            stanPause=false;
        Pause.setIcon(new ImageIcon(getClass().getResource("/main/pauseAction.png")));
        musicControl.pauseMusic();
        }
        else{
            stanPause=true;
        Pause.setIcon(null);
         musicControl.resumeMusic();
        }
    }//GEN-LAST:event_PauseMouseClicked

    private void LeftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeftMousePressed
         Left.setIcon(new ImageIcon(getClass().getResource("/main/leftAction.png")));
    }//GEN-LAST:event_LeftMousePressed

    private void LeftMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeftMouseReleased
         Left.setIcon(null);
         musicControl.leftScroll(100000);
    }//GEN-LAST:event_LeftMouseReleased

    private void RightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RightMousePressed
         Right.setIcon(new ImageIcon(getClass().getResource("/main/rightAction.png")));
    }//GEN-LAST:event_RightMousePressed

    private void RightMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RightMouseReleased
          Right.setIcon(null);
          musicControl.rightScroll(100000);
    }//GEN-LAST:event_RightMouseReleased

    private void StopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopMousePressed
        Stop.setIcon(new ImageIcon(getClass().getResource("/main/stopAction.png")));
    }//GEN-LAST:event_StopMousePressed

    private void StopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopMouseReleased
        Stop.setIcon(null);
        musicControl.stopMusic();
    }//GEN-LAST:event_StopMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        fileControl.openDialogBox();
                
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MP3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                MP3PlayerGUI dialog = new MP3PlayerGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    private boolean stanPause;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Left;
    private javax.swing.JLabel Pause;
    private javax.swing.JLabel Play;
    private javax.swing.JLabel Play1;
    private javax.swing.JLabel Right;
    private javax.swing.JLabel SelectFile1;
    private javax.swing.JLabel SelectFile2;
    private javax.swing.JLabel SelectFile3;
    private javax.swing.JLabel SelectFile4;
    private javax.swing.JLabel Stop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
