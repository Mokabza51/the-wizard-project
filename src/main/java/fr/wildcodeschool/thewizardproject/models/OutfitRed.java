package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component; 

@Component
public class OutfitRed implements OutfitInterface {

	@Override
	public String changeDress() {
		return "The wizard's dress is Red";
	}
}
