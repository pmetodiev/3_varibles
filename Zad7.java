import java.util.Scanner;

public class Zad7 {
	public static void main(String[] args) {
		int time;
		double money;
		boolean health;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter time:");
		time = sc.nextInt();
		
		System.out.println("Enter money:");
		money = sc.nextDouble();
		
		System.out.println("Are you ok?");
		health = sc.nextBoolean();
		
		if(health == false) {
			System.out.println("I am ill and won't go to disco");
			if (money > 0) {
				System.out.println("I will buy pills.");
			} else {
				System.out.println("I will drink tea at home :)");
			}
		} else  {
			if (money > 0 && money < 10) {
				System.out.println("I will go to the cafe");
			} else {
				if(time < 22) {
					System.out.println("I will go to the restaurant");
				} else {
					System.out.println("I will go to the the disco club");
				}
			}
		}
	}
}
