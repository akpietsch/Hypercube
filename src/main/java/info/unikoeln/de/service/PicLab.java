package info.unikoeln.de.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;
import org.springframework.stereotype.Service;

@Service
public class PicLab {

	public String filename="src/main/java/info/unikoeln/de/service/ocrBib0001.tiff";
	
	@Test
	public void cleanImage () {
		
		Mat im = Highgui.imread(filename, Highgui.CV_LOAD_IMAGE_GRAYSCALE);
		 System.out.println(im);
		
	}
		// apply Otsu threshold
//		
//		Mat bw = new Mat(im.size(), CvType.CV_8U);
//		Imgproc.threshold(im, bw, 0, 255, Imgproc.THRESH_BINARY_INV | Imgproc.THRESH_OTSU);
//		
//		// take the distance transform
//		Mat dist = new Mat(im.size(), CvType.CV_32F);
//		Imgproc.distanceTransform(bw, dist, Imgproc.CV_DIST_L2, Imgproc.CV_DIST_MASK_PRECISE);
//		
//		// threshold the distance transform
//		Mat dibw32f = new Mat(im.size(), CvType.CV_32F);
//		final double SWTHRESH = 8.0;    
//		
//		// stroke width threshold
//		Imgproc.threshold(dist, dibw32f, SWTHRESH/2.0, 255, Imgproc.THRESH_BINARY);
//		Mat dibw8u = new Mat(im.size(), CvType.CV_8U);
//		dibw32f.convertTo(dibw8u, CvType.CV_8U);
//		Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(3, 3));
//		
//		// open to remove connections to stray elements
//		Mat cont = new Mat(im.size(), CvType.CV_8U);
//		Imgproc.morphologyEx(dibw8u, cont, Imgproc.MORPH_OPEN, kernel);
//	
//		// find contours and filter based on bounding-box height
//		final double HTHRESH = im.rows() * 0.5; 
//		
//		// bounding-box height threshold
//		List<MatOfPoint> contours = new ArrayList<MatOfPoint>();
//		List<Point> digits = new ArrayList<Point>();    // contours of the possible digits
//		Imgproc.findContours(cont, contours, new Mat(), Imgproc.RETR_CCOMP, Imgproc.CHAIN_APPROX_SIMPLE);
//		for (int i = 0; i < contours.size(); i++)
//		{
//		    if (Imgproc.boundingRect(contours.get(i)).height > HTHRESH)
//		    {
//		        // this contour passed the bounding-box height threshold. add it to digits
//		        digits.addAll(contours.get(i).toList());
//		    }   
//		}
//		
//		// find the convexhull of the digit contours
//		MatOfInt digitsHullIdx = new MatOfInt();
//		MatOfPoint hullPoints = new MatOfPoint();
//		hullPoints.fromList(digits);
//		Imgproc.convexHull(hullPoints, digitsHullIdx);
//		
//		// convert hull index to hull points
//		List<Point> digitsHullPointsList = new ArrayList<Point>();
//		List<Point> points = hullPoints.toList();
//		for (Integer i: digitsHullIdx.toList())
//		{
//		    digitsHullPointsList.add(points.get(i));
//		}
//		MatOfPoint digitsHullPoints = new MatOfPoint();
//		digitsHullPoints.fromList(digitsHullPointsList);
//		
//		// create the mask for digits
//		List<MatOfPoint> digitRegions = new ArrayList<MatOfPoint>();
//		digitRegions.add(digitsHullPoints);
//		Mat digitsMask = Mat.zeros(im.size(), CvType.CV_8U);
//		Imgproc.drawContours(digitsMask, digitRegions, 0, new Scalar(255, 255, 255), -1);
//		
//		// dilate the mask to capture any info we lost in earlier opening
//		Imgproc.morphologyEx(digitsMask, digitsMask, Imgproc.MORPH_DILATE, kernel);
//		
//		// cleaned image ready for OCR
//		Mat cleaned = Mat.zeros(im.size(), CvType.CV_8U);
//		dibw8u.copyTo(cleaned, digitsMask);
//		
//	
//	}
}
