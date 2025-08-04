package com.java.design.pattern.structural.proxy;

public class ProxyDesignPattern_Problem {

	public static void main(String[] args) {
		System.out.println("Application Started. Initializing images for gallery...");

        // Images are created eagerly – loaded even if not viewed!
        Image image1 = new HighResolutionImage("photo1.jpg");
        Image image2 = new HighResolutionImage("photo2.png");
        Image image3 = new HighResolutionImage("photo3.gif");
        
        System.out.println("\nGallery initialized. User might view an image now.");

        // User clicks on image1
        System.out.println("User requests to display " + image1.getFileName());
        image1.display();

        // User clicks on image3
        System.out.println("\nUser requests to display " + image3.getFileName());
        image3.display();

        System.out.println("\nApplication finished.");

	}
	

}

interface Image{
	
	void display();
	String getFileName();
}

//Eager loading
class HighResolutionImage implements Image{
	String fileName;
	private byte[] imageData;	
	public HighResolutionImage(String fileName) {
		this.fileName = fileName;
		loadImageFromDisk(); // Expensive operation!
	}

	private void loadImageFromDisk() {
		 System.out.println("Image " + fileName + " loaded successfully.");
		 this.imageData = new byte[10 * 1024 * 1024]; // Simulate 10MB memory usage
	}

	@Override
	public void display() {
		System.out.println("Displaying image: " + fileName);
		
	}

	@Override
	public String getFileName() {
		return fileName;
	}
	
}

