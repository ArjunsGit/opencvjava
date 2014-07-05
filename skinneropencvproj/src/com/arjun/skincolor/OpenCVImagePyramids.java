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
public class OpenCVImagePyramids {
	public static String path = "resources/lena.png";

	public void downsample() {
		//read the image
		Mat image = Highgui.imread(path);
		//mat out
		Mat out = new Mat();
		
		if(image.empty()) {
			System.out.println("Image not found !!");
			return;
		}
		
		//Show the Image before down sampling
		ImageUtils.displayImage(ImageUtils.toBufferedImage(image), "Before Downsampling");
		//Down sample the image by factor of 2
		Imgproc.pyrDown(image, out);
		//show the image after down sampling
		ImageUtils.displayImage(ImageUtils.toBufferedImage(out), "Down sampled Image");



		
	}
	
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		OpenCVImagePyramids pyramids = new OpenCVImagePyramids();
		pyramids.downsample();

	}

}
