
/*
 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.androidcontroller.main;

import com.android.chimpchat.adb.AdbBackend;
import com.android.chimpchat.core.IChimpDevice;
import com.android.chimpchat.core.PhysicalButton;
import com.android.chimpchat.core.TouchPressType;
import com.androidcontroller.events.KeyConverter;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class DeviceScreen extends javax.swing.JFrame {

    /**
     * Creates new form DeviceScreen
     */
    private Image img;
    private final Timer timer;
    IChimpDevice device;
    AdbBackend adb;
    private final int INITIALDELAY = 200;
    private final int INTERVAL = 5;
    double scaleRatio;
    private static String strDeviceID;

    public DeviceScreen(String strDevive) {
        initComponents();
        setTitle("Android Controller");
        scaleRatio = 1;
        timer = new Timer();
        //adb = new AdbBackend("adb path", false);
        adb = new AdbBackend();
        device = adb.waitForConnection(5000, strDevive);
        fetchImages();
        pnlImage.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlImage = new javax.swing.JPanel()
        {
            public void paintComponent(Graphics g){
                ((Graphics2D)g).scale(scaleRatio,scaleRatio);
                ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                if(img!=null){
                    g.drawImage(img, 0, 0, null);
                    super.paintComponent(g);
                }
            }
        }
        ;
        toolBar = new javax.swing.JToolBar();
        backButton = new javax.swing.JButton();
        dummy1Button = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        dummy2Button = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        dummy3Button = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        dummy4Button = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        dummy5Button = new javax.swing.JButton();
        btnInstall = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlImage.setOpaque(false);
        pnlImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlImageMouseReleased(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlImageMousePressed(evt);
            }
        });
        pnlImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlImageMouseDragged(evt);
            }
        });
        pnlImage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnlImageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnlImageKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnlImageKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlImageLayout = new javax.swing.GroupLayout(pnlImage);
        pnlImage.setLayout(pnlImageLayout);
        pnlImageLayout.setHorizontalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        pnlImageLayout.setVerticalGroup(
            pnlImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        toolBar.setBorder(null);
        toolBar.setFloatable(false);
        toolBar.setRollover(true);

        backButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/androidcontroller/images/back.png"))); // NOI18N
        backButton.setToolTipText("Back");
        backButton.setFocusable(false);
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        toolBar.add(backButton);

        dummy1Button.setEnabled(false);
        dummy1Button.setFocusable(false);
        dummy1Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dummy1Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(dummy1Button);

        homeButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/androidcontroller/images/home.png"))); // NOI18N
        homeButton.setToolTipText("Home");
        homeButton.setFocusable(false);
        homeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        toolBar.add(homeButton);

        dummy2Button.setEnabled(false);
        dummy2Button.setFocusable(false);
        dummy2Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dummy2Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(dummy2Button);

        menuButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/androidcontroller/images/menu.png"))); // NOI18N
        menuButton.setToolTipText("Menu");
        menuButton.setFocusable(false);
        menuButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        toolBar.add(menuButton);

        dummy3Button.setEnabled(false);
        dummy3Button.setFocusable(false);
        dummy3Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dummy3Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(dummy3Button);

        plusButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        plusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/androidcontroller/images/plus.png"))); // NOI18N
        plusButton.setToolTipText("Zoom In");
        plusButton.setFocusable(false);
        plusButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plusButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });
        toolBar.add(plusButton);

        dummy4Button.setEnabled(false);
        dummy4Button.setFocusable(false);
        dummy4Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dummy4Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(dummy4Button);

        minusButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 11)); // NOI18N
        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/androidcontroller/images/minus.png"))); // NOI18N
        minusButton.setToolTipText("Zoom Out");
        minusButton.setFocusable(false);
        minusButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minusButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });
        toolBar.add(minusButton);

        dummy5Button.setFocusable(false);
        dummy5Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dummy5Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(dummy5Button);

        btnInstall.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btnInstall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/androidcontroller/images/install.png"))); // NOI18N
        btnInstall.setToolTipText("Install");
        btnInstall.setFocusable(false);
        btnInstall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInstall.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInstall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstallActionPerformed(evt);
            }
        });
        toolBar.add(btnInstall);

        lblStatus.setMaximumSize(new java.awt.Dimension(50, 14));
        lblStatus.setMinimumSize(new java.awt.Dimension(50, 14));
        lblStatus.setPreferredSize(new java.awt.Dimension(50, 14));
        toolBar.add(lblStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlImageMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlImageMouseDragged
        try {
            device.getManager().touchMove((int) (evt.getX() / scaleRatio), (int) (evt.getY() / scaleRatio));
        } catch (IOException ex) {
            Logger.getLogger(DeviceScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlImageMouseDragged

    private void pnlImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlImageMousePressed
        device.touch((int) (evt.getX() / scaleRatio), (int) (evt.getY() / scaleRatio), TouchPressType.DOWN);
    }//GEN-LAST:event_pnlImageMousePressed

    private void pnlImageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlImageMouseReleased
        device.touch((int) (evt.getX() / scaleRatio), (int) (evt.getY() / scaleRatio), TouchPressType.UP);
    }//GEN-LAST:event_pnlImageMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        adb.shutdown();
        device = null;
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void pnlImageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlImageKeyTyped
        try {
            device.getManager().type(evt.getKeyChar());
        } catch (IOException ex) {
            Logger.getLogger(DeviceScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_pnlImageKeyTyped

    private void pnlImageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlImageKeyReleased
        try {
            String code = KeyConverter.getKeyCodeString(evt);
            device.getManager().keyUp(code);
        } catch (IOException ex) {
            Logger.getLogger(DeviceScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlImageKeyReleased

    private void pnlImageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlImageKeyPressed
        try {
            String code = KeyConverter.getKeyCodeString(evt);
            device.getManager().keyDown(code);
        } catch (IOException ex) {
            Logger.getLogger(DeviceScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlImageKeyPressed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        device.press(PhysicalButton.BACK, TouchPressType.DOWN_AND_UP);
    }//GEN-LAST:event_backButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        device.press(PhysicalButton.HOME, TouchPressType.DOWN_AND_UP);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        device.press(PhysicalButton.MENU, TouchPressType.DOWN_AND_UP);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        scaleRatio = scaleRatio + 0.1;
        reSize();
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        scaleRatio = scaleRatio - 0.1;
        reSize();
    }//GEN-LAST:event_minusButtonActionPerformed

    private void btnInstallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstallActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new Filefilter(".apk", "APK Files"));

        chooser.setAcceptAllFileFilterUsed(false);
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        if (file != null) {
            device.installPackage(file.getAbsolutePath());
        }
    }//GEN-LAST:event_btnInstallActionPerformed

    class Filefilter extends javax.swing.filechooser.FileFilter {

        String strExtension;
        String strDescription;

        private Filefilter(String extension, String description) {
            this.strDescription = description;
            this.strExtension = extension;
        }

        @Override
        public boolean accept(File f) {
            return f.isDirectory() || f.getName().toLowerCase().endsWith(strExtension);
        }

        @Override
        public String getDescription() {
            return strDescription;
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DeviceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeviceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeviceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeviceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        if (args.length == 0) {
            strDeviceID = ".*";
        } else if (args.length == 1) {
            strDeviceID = args[0];
        } else {
            JOptionPane.showMessageDialog(null, "Invalid parameters.\n"
                    + "Usage : java -jar AndroidController <device ID>");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeviceScreen(strDeviceID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnInstall;
    private javax.swing.JButton dummy1Button;
    private javax.swing.JButton dummy2Button;
    private javax.swing.JButton dummy3Button;
    private javax.swing.JButton dummy4Button;
    private javax.swing.JButton dummy5Button;
    private javax.swing.JButton homeButton;
    public javax.swing.JLabel lblStatus;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JPanel pnlImage;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

    private void fetchImages() {
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                img = device.takeSnapshot().createBufferedImage();
                reSize();
            }
        }, INITIALDELAY, INTERVAL);
    }

    private void reSize() {
        pnlImage.setPreferredSize(new Dimension((int) (img.getWidth(null) * scaleRatio), (int) (img.getHeight(null) * scaleRatio)));
        pnlImage.repaint();
        this.setSize(((int) (img.getWidth(null) * scaleRatio) + 23), ((int) (img.getHeight(null) * scaleRatio) + 68));
    }

}
