package interfes;
 
interface Animal{    
       void makeSound();   
  } 
 
public class Interface
{

	public static void main(String[] args) {
	    
    Dog dog = new Dog();
    Fish fish = new Fish();
    Lion lion = new Lion();
	 
	  dog.eat();
    dog.jump();
    dog.run();
    dog.walk();


    fish.swim();
    fish.eat();

    lion.eat();
    lion.run();
    lion.jump();
    lion.walk();


 	}
}