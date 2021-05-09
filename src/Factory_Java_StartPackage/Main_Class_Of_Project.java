/**
 * 
 */
package Factory_Java_StartPackage;


import Factory_Java_StartPackage.Enemies_main.Boozer;
import Factory_Java_StartPackage.Player.Player;


/**
 * @author Andre
 *
 */
public class Main_Class_Of_Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boozer boozer = new Boozer();
		boozer.Greatings();
		
		Player player = new Player("peps","1996");
		player.get_call();
		
	}

}
