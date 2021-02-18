package week12;

public class Dog {

	//instance variable
		String breed;
		String size;
		String color;
		int age;
		
		//create a constructor
		Dog(String b, String s,String l, int num){
			breed = b;
			size = s;
			color = l;
			age = num;
		}

		public void methodDog1Display() {
			// TODO Auto-generated method stub
			System.out.println("Dog Object 1:\n Breed: " + breed + "\n Size: " + size + "\n Color: "+ color +"\n Age: " + age);
		}
		
		public void methodDog2Display() {
			// TODO Auto-generated method stub
			System.out.println("Dog Object 2:\n Breed: " + breed + "\n Size: " + size + "\n Color: "+ color +"\n Age: " + age);
		}
		public void methodDog3Display() {
			// TODO Auto-generated method stub
			System.out.println("Dog Object 3:\n Breed: " + breed + "\n Size: " + size + "\n Color: "+ color +"\n Age: " + age);
		}

	}

