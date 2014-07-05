/**
 * 
 */
package com.arjun.skincolor;

import java.awt.image.ImageProducer;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.*;

import com.arjun.skincolor.imageutils.ImageUtils;



/**
 * @author arjunflex
 *
 */
public class GetMeTheSkin {
	
	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		String path = "resources/lena.png";
		
		Mat image = Highgui.imread(path);
		Mat out = new Mat();
		
		if(image.empty()) {
			System.out.println("Image not found !!");
			return;
		}
		
		ImageUtils.displayImage(ImageUtils.toBufferedImage(image), "Before Smoothing");
		
		Imgproc.GaussianBlur(image, out, new Size(5,5), 3,3);
		
		ImageUtils.displayImage(ImageUtils.toBufferedImage(out),"After Smoothing -- Gaussian Blur");
				
		Imgproc.GaussianBlur(image, out, new Size(5,5), 3,3);
		
		ImageUtils.displayImage(ImageUtils.toBufferedImage(out),"After double Smoothing -- Gaussian Blur");


	}

}
