package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface{

	private Outfit myOutfit;

	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "You look good, but stay humble my friend! ";
	}

	public void setMyOutfit(Outfit theOutfit) {
		this.myOutfit = theOutfit;
	}
	
	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return this.myOutfit.theDressColor();
	}
	
}
