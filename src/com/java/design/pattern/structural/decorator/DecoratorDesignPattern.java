package com.java.design.pattern.structural.decorator;

public class DecoratorDesignPattern {
	
	public static void main(String[] args) {
		System.out.print("Plain Text : ");
		TextView text = new PlainTextView("Hello World");
		text.render();
		System.out.println();
		System.out.print("Bold Text : ");
		TextView boldText = new BoldTextViewDecorator(text);
		boldText.render();
		////
		System.out.println();
		System.out.print("Bold + Italic + UnderLine : ");
		new BoldTextViewDecorator(new ItalicTextViewDecorator(new UnderLineTextViewDecorator(text))).render();
		
	}
	
}

interface TextView{
	void render();
}

class PlainTextView implements TextView{
	private String text;
	PlainTextView(String text){
		this.text = text;
	}
	
	@Override
	public void render() {
		System.out.print(text);
	}
}

abstract class TextViewDecorator implements TextView{
	
	TextView view;
	
}

class BoldTextViewDecorator extends TextViewDecorator{
	TextView textView;
	public BoldTextViewDecorator(TextView textView) {
		this.textView = textView;
	}
	
	@Override
	public void render() {
		System.out.print("<b>");
		textView.render();
		System.out.print("</b>");
	}
	
}
	
class ItalicTextViewDecorator extends TextViewDecorator{
	
	private TextView textView;
	
	public ItalicTextViewDecorator(TextView textView) {
		this.textView = textView;
	}
	
	@Override
	public void render() {
		System.out.print("<i>");
		 textView.render();
		System.out.print("</i>");
		
	}
}
	
class UnderLineTextViewDecorator extends TextViewDecorator{
	
	private TextView textView;
     public UnderLineTextViewDecorator(TextView textView) {
    	 this.textView = textView;
	}
	@Override
	public void render() {
		System.out.print("<u>");
		 textView.render();
		System.out.print("</u>");
		
	}
	
}