package Factory_Java_StartPackage.Enemies_main;
import Factory_Java_StartPackage.Characteristics_Enemies.*;;


///This class is create enemy "BOOZER"

public class Boozer {
	
//	//characteristics 

	public void get_characteristics() {
		Characteristics.get_health(90);
		Characteristics.get_aggression(40);
		Characteristics.get_height(50);
		Characteristics.get_weight(70);
		Characteristics.get_magic(10);
		Characteristics.get_tricks(10);
		Characteristics.get_inteligence(0);
	}
	

///Here we will create some functional for our friend
	public void Battle_Roar() {
		System.out.println("Give me some money bro! \n I swear it for a bus ticket! \n Please give some money!");
	}
	public void Greatings() {
		System.out.println("Hello Father!");
	}
	
	public void Say_Goodbye() {
		System.out.println("Good bye Father!");
	}
	
	public void Get_Drunk() {
		System.out.println("Im so drunk...");
		
	}
	
	public void PlaySong() {
		System.out.println("Opa opa opa pa pa pa ha ha ha");
		
	}
	
	public String ToString() {
		return "Boozer";
	}
	
	
}
