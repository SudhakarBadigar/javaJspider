package exceptionHanling;


	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;
	import javax.imageio.ImageIO;

		public class ReadImage {
	    public static void main(String[] args) throws IOException {
	        try {
	            // Specify the path to the JPG file
	            String filePath = "C:\\Users\\DELL\\Desktop\\Collections-in-Java.jpg";

	            // Read the JPG file into a BufferedImage
	            File file = new File(filePath);
	            BufferedImage image = ImageIO.read(file);

	            // Display some information about the image
	            int width = image.getWidth();
	            int height = image.getHeight();
	            int type = image.getType();
	            System.out.println("Image width: " + width);
	            System.out.println("Image height: " + height);
	            System.out.println("Image type: " + type);

	            // You can now work with the BufferedImage object as needed
	            // For example, you can process the image or display it using GUI libraries

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


