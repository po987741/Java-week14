package week12;

public class TestDog {
	public static void main(String[]args) {
		//create object here
		Dog Dog1 = new Dog();
		Dog Dog2 = new Dog();
		Dog Dog3 = new Dog();
		
		//Data input for dog object1
		Dog1.breed = "Buldog";
		Dog1.size = "larg";
		Dog1.color = "light gray";
		Dog1.age = 5;
		
		Dog2.breed = "geagle";
		Dog2.size = "larg";
		Dog2.color = "orange";
		Dog2.age = 6;
		
		Dog3.breed = "German Shepher";
		Dog3.size = "larg";
		Dog3.color = "White and orange";
		Dog3.age = 6;
		
		//print all data from object
		System.out.println("Dog Object 1:\n Breed: " + Dog1.breed +"\n Size: " + Dog1.size + "\n Color: " + Dog1.color + "\n Age: " + Dog1.age);
		System.out.println("Dog Object 2:\n Breed: " + Dog2.breed +"\n Size: " + Dog2.size + "\n Color: " + Dog2.color + "\n Age: " + Dog2.age);
		System.out.println("Dog Object 3:\n Breed: " + Dog3.breed +"\n Size: " + Dog3.size + "\n Color: " + Dog3.color + "\n Age: " + Dog3.age);
	}
}