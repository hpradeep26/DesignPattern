package com.java.design.pattern.abstractfactory;

public class MacOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckBox() {
		return new MacOSCheckbox();
	}

}
