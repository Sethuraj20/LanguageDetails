package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("Chennai");

	}
	public void northIndia() {
		System.out.println("Delhi");

	}
	public static void main(String[] args) {
		StateDetails b=new StateDetails();
		b.southIndia();
		b.northIndia();
		LanguageInfo a=new LanguageInfo();
		a.tamilLanguage();
		a.englishLanguage();
		a.hindiLanguage();
 
	}

}
