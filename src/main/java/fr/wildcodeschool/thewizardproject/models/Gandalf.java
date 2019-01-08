package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("GandalfId")
public class Gandalf implements WizardInterface{

	private OutfitInterface colorDress;
	
	@Autowired
		public Gandalf (@Qualifier ("outfitRed")OutfitInterface theColorDress) {
		colorDress= theColorDress;
	}
	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "You look good, but stay humble my friend! ";
	}

	@Override
	public String giveColorDress() {
		// TODO Auto-generated method stub
		return this.colorDress.changeDress();
	}
	
}
