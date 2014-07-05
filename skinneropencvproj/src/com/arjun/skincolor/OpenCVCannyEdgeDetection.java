/**
 * 
 */
package com.arjun.skincolor;

import java.awt.image.ImageProducer;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

import com.arjun.skincolor.imageutils.ImageUtils;

/**
 * @author arjunflex
 *
 */
public class OpenCVCannyEdgeDetection {
	public static String path = "resources/lena.png";

	
	public void detectEdges() {
		//read the RGB image
		 Mat rgbImage = Highgui.imread(path);
	    
		//mat gray image holder
		Mat imageGray = new Mat();
		
		//mat canny image
		Mat imageCny = new Mat();
		
		//Show the RGB Image
		ImageUtils.displayImage(ImageUtils.toBufferedImage(rgbImage), "RGB Image");

		
		//Convert the image in to gray image
		Imgproc.cvtColor(rgbImage, imageGray, Imgproc.COLOR_BGR2GRAY);
		
		//Show the gray image
		ImageUtils.displayImage(ImageUtils.toBufferedImage(imageGray), "Gray Image");

		//Canny Edge Detection
		Imgproc.Canny(imageGray, imageCny, 10, 100, 3, true);
		
		//Show the Canny Edge detector image
	    ImageUtils.displayImage(ImageUtils.toBufferedImage(imageCny), "Canny Edge Detection Image");
		
	}
	
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		OpenCVCannyEdgeDetection edgeDetection = new OpenCVCannyEdgeDetection();
		edgeDetection.detectEdges();
	}

}
