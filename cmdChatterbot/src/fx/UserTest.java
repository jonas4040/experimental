package fx;

import java.util.Scanner;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User u=new User();
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		u.send(text);
	}

}
