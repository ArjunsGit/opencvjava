/**
 * 
 */
package com.arjun.skincolor.imageutils;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

/**
 * @author arjunflex
 *
 */
class ImagePanel extends JPanel {

	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		Dimension dim = new Dimension(img.getWidth(null),
				img.getHeight(null));
		setPreferredSize(dim);
		setMinimumSize(dim);
		setMaximumSize(dim);
		setSize(dim);
		setLayout(null);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, null);
	}
}

