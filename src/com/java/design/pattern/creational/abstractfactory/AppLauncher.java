package com.java.design.pattern.creational.abstractfactory;

public class AppLauncher {

	public static void main(String[] args) {
		String os = System.getProperty("os.name");
		GUIFactory factory;
		if(os.contains("Windows")) {
			factory = new WindowsFactory();
		}else {
			factory = new MacOSFactory();
		}
		
		Application app = new Application(factory);
		app.renderUI();
	}

}
