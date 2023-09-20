package interfes;

class Dog  implements Animal , landAnimal {
      public void makeSound(){
               System.out.println("Barking.....");
      }     

       public void eat(){
            System.out.println("The dog can eat.....");
       }
       public void walk(){
                System.out.println("The dog can walk.....");
       }
       public void run(){
               System.out.println("The dog can run.....");
       }
       public void jump(){
               System.out.println("The dog can jump.....");
       }

}
