package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.Dumbledore;
import fr.wildcodeschool.thewizardproject.models.Gandalf;
import fr.wildcodeschool.thewizardproject.models.Outfit;

public class App {
	
	public void start() {
		Dumbledore wizard = new Dumbledore();
		System.out.println("");
        System.out.println("******************");
		System.out.println(wizard.giveAdvice());
        System.out.println("******************");
        Outfit myOutfit = new Outfit();
        wizard.setMyOutfit(myOutfit);
        System.out.println(wizard.changeDress());
	}
}