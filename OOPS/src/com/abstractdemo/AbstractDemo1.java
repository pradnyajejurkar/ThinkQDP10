package com.abstractdemo;

abstract class Language{
	
	//can hav both abstract and concrete methods
	abstract void details();
	
	void show() {
		System.out.println("Languages");
	}
	
}

class ProgLanguage extends Language
{
	
	void details() {
		System.out.println("java,.det,python");
	}
	
	void display(String name) 
	{
		System.out.println("Institute:"+name);
	}
}



class SpeakingLanguage extends Language
{
	void details() {
		System.out.println("English,french,spanish");
	}
}

public class AbstractDemo1 {
  public static void main(String[] args) {
	//we cannot create object of abstract class
	  //Language l=new Language()
	  
	  Language l;
	  l=new ProgLanguage();
	  l.details();
	  l.show();
	  
	  l=new SpeakingLanguage();
	  l.details();
  }
}
