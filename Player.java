package GuessingGame;
import java.util.Scanner;
public class Player {
	static Scanner in=new Scanner(System.in);
	int number;
	//static int count=0;
	public void guess(){
		//number=(int)(Math.random()*10);      is for auto playing for computer itself
		System.out.print("I'm guessing number...");
		number=in.nextInt();
	}
}
