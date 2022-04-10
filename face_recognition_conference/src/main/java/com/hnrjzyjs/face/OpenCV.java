package com.hnrjzyjs.face;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class OpenCV {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        Mat image1 = Imgcodecs.imread("Pictures/pyy2.jpg");
        Mat image2 = new Mat();
        Imgproc.cvtColor(image1, image2, Imgproc.COLOR_BGR2GRAY);

        HighGui.imshow("人脸识别", image1);
        HighGui.waitKey(0);
    }
}
