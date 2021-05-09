package Factory_Java_StartPackage.Player;

import Factory_Java_StartPackage.Iplayer;

// This class about our Player
public class Player implements Iplayer{
	//some player stuff
	String password;
	String name_account;
	
	//constructor
	
public Player(String password, String name_account){
		this.name_account = name_account;
		this.password = password;
	}
	
	
	public void get_call() {
		
		System.out.println("name account : \n"+name_account+" \n password : \n "+password+"*\n Call*");
	}
}
