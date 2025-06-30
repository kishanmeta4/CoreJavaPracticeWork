package myFirstPackage;

interface Engine{
	
	void start(); //abstract method
	void stop();
	
	
}

class PetrolEngine implements Engine{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("petrol Engine Implemention for start Feature");

		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("petrol Engine Implemention for stop Feature");

		
	}
	
class DieselEngine implements Engine{

		@Override
		public void start() {
			// TODO Auto-generated method stub
			System.out.println("Diesle Engine Implemention for start Feature");
			
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("Diesle Engine Implemention for stop Feature");

			
		}	
	}
	
class Car2{
		
		Engine engine;
		
		Car2(Engine engine){
			this.engine=engine;
			
		}
		void drive() {
			engine.start();
		}
	}
	
	


public class OneMoreInterfaceExample {
	
	public static void main(String[] args) {
		
		
		Engine e1= new PetrolEngine();
		e1.stop();
		
		Engine E2 = new PetrolEngine();
		Car2 C1 = new Car2(E2);
		C1.drive();
		
	}

}
}
