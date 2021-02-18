package week12;

public class Dog2 {	
		public static void main(String[]args) {
			//create object here
			Dog Dog1 = new Dog();
			Dog Dog2 = new Dog();
			Dog Dog3 = new Dog();
			
			//print all data from object1
			Dog1.methodDog1("Bulldog","larg","light gray",5);
			Dog2.methodDog2("beagle","larg","orage",6);
			Dog3.methodDog3("German shepher","larg","white and orange",6);
			
			System.out.println("Dog Object 1:\n Breed: " + Dog1.breed +"\n Size: " + Dog1.size + "\n Color: " + Dog1.color + "\n Age: " + Dog1.age);
			System.out.println("Dog Object 2:\n Breed: " + Dog2.breed +"\n Size: " + Dog2.size + "\n Color: " + Dog2.color + "\n Age: " + Dog2.age);
			System.out.println("Dog Object 3:\n Breed: " + Dog3.breed +"\n Size: " + Dog3.size + "\n Color: " + Dog3.color + "\n Age: " + Dog3.age);
			
			
		}
	}

