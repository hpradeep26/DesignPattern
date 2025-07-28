package com.java.design.pattern.creational.abstractfactory;

public class WindowsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckBox() {
		return new WindowsCheckbox();
	}

}
