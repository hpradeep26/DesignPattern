package com.java.design.pattern.abstractfactory;

public class Application {
	
	private Button button;
	private Checkbox checkbox;
	
	public Application(GUIFactory factory) {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckBox();
	}
	
	public void renderUI() {
		button.paint();
		checkbox.paint();
	}
}
