package com.java.design.pattern.structural.proxy;

public class ProxyDesignPatternSolution {

	public static void main(String[] args) {

        // Create lightweight proxies instead of full image objects
        Image image1 = new ImageProxy("photo1.jpg");
        Image image2 = new ImageProxy("photo2.png"); // Never displayed
        Image image3 = new ImageProxy("photo3.gif");
        
        System.out.println("\nGallery initialized. No images actually loaded yet.");
        System.out.println("Image 1 Filename: " + image1.getFileName()); // Does not trigger image load
        
        // User clicks on image1 again
        System.out.println("\nUser requests to display " + image1.getFileName());
        image1.display(); // Lazy loading happens here
        
     // User clicks on image3
        System.out.println("\nUser requests to display " + image3.getFileName());
        image3.display(); // Triggers loading for image3

        System.out.println("\nApplication finished. Note: photo2.png was never loaded.");
	}
}


class ImageProxy implements Image{
	private String fileName;
	private HighResolutionImage realImage;
	
	public ImageProxy(String fileName) {
        this.fileName = fileName;
        System.out.println("ImageProxy: Created for " + fileName + ". Real image not loaded yet.");
    }
	

	@Override
	public String getFileName() {
		return fileName;
	}
	
	
	//1. Adding a Protection Proxy
	private boolean checkAccess(String userRole) {
	    System.out.println("ProtectionProxy: Checking access for role: " + userRole + " on file: " + fileName);
	    // Simulate a basic access control rule
	    return "ADMIN".equals(userRole) || !fileName.contains("secret");
	}
	
	

	@Override
	public void display() {
		if (realImage == null) {
            System.out.println("ImageProxy: display() requested for " + fileName + ". Loading high-resolution image...");
            realImage = new HighResolutionImage(fileName);
        } else {
            System.out.println("ImageProxy: Using cached high-resolution image for " + fileName);
        }

        // Delegate the display call to the real image
        realImage.display();
		
	}
	
}