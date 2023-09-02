 
  interface Bicycle{
      
      void applyBrake(int decrement);
      void speedUp(int increment);
      
  }
  
  
  class MountainBike implements Bicycle{
      
      
        private int gear;
        private int speed;
        private int seatHeigth;
        
     public MountainBike(int gear, int speed, int seatHeigth){
         this.gear= gear;
         this.speed = speed;
         this.seatHeigth = seatHeigth;
     }
     
     public int getGear(){
         return gear;
     }
     
     public int getSpeed(){
         return speed;
     }
     public int getSeatheigth(){
         return seatHeigth;
     }
     
     
      
      
      public void applyBrake(int decrement){
          speed-=decrement;
      }
      
       public void speedUp(int incrementn){
          speed+=incrementn;
      }
      
      
      
  }
 
 
 
public class Main
{

	public static void main(String[] args) {
	    
	  
	  MountainBike m = new MountainBike(20,10,1);
	  
	  System.out.println(m.getGear());
	  System.out.println(m.getSpeed());
	  System.out.println(m.getSeatheigth());
	  
	  m.applyBrake(1);
	  m.speedUp(10);
	  System.out.println(m.getSpeed());
	  
	  
	  
	  

 	}
}
