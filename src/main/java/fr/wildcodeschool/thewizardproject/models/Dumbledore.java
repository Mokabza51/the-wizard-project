package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
	private Outfit myOutfit;
	
	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "You've got the swag, but are you a good gentleman ? ";
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
