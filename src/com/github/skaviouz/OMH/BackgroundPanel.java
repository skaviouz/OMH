/*
 * 
 DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
 Version 2, December 2004 

 Copyright (C) 2004 Sam Hocevar <sam@hocevar.net> 

 Everyone is permitted to copy and distribute verbatim or modified 
 copies of this license document, and changing it is allowed as long 
 as the name is changed. 

 DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
 TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION 

 0. You just DO WHAT THE FUCK YOU WANT TO.
 */
package com.github.skaviouz.OMH;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author skaviouz
 */
public class BackgroundPanel extends JPanel {

    JLabel contentPane;
    Image originalImage;

    public BackgroundPanel() {
        //this("C:/Users/Eric/Documents/NetBeansProjects/OMH/src/com/github/skaviouz/OMH/test.png");
        this("./src/assets/omh/textures/gui/regrowth-cover.png");
    }

    public BackgroundPanel(String str) {
        try {
            originalImage = ImageIO.read(new File(str));
        } catch (IOException ex) {
            Logger.getLogger(BackgroundPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(originalImage, 0, 0, this.getWidth(), this.getHeight(), null);
    }

}
