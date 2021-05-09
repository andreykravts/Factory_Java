package Factory_Java_StartPackage.Enemies_main;

import Factory_Java_StartPackage.Characteristics_Enemies.Characteristics;

public class BadGuy {
//	characteristics 

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
		System.out.println("You look crazy bro! \n I swear it will be end one day! \n Beware of bears!");
	}
	public void Greatings() {
		System.out.println("Hello Chicken!");
	}
	
	public void PlaySong() {
		System.out.println("tony boil, oooo tony boil , boil by yourself!");
		
	}
	
	public void Check_these_muscles() {
		System.out.println("*Start to play with the muscles*");
	}
	
	public void Bear_fight(){
		System.out.println("*Start to fight with someone...*");
	}
	
	public String ToString() {
		return "BadGuy";
	}
}
