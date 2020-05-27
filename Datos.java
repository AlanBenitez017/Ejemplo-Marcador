import java.util.Scanner;

public class Datos {

	String name;
	String lastName;
	
	public Datos() {
		
	}
	
	public Datos(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		
		return "You entered " + this.name + " " + this.lastName;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String name;
		String lastName;
		System.out.println("Please enter your name");
		name = scnr.next();
		lastName = scnr.next();
		
		Datos d1 = new Datos();
		d1.setName(name);
		d1.setLastName(lastName);
		System.out.println(d1.toString());
	}
	
}
