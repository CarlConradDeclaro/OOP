 
 class Bicycle{
     
     
     protected int gear;
     protected int speed;
     
     public Bicycle(int gear, int speed){
         this.gear= gear;
         this.speed = speed;
     }
     
     public void setGear(int newGear){
         gear = newGear;
     }
     
     public void applyBrake(int decreement){
         speed-=decreement;
     }
     
     public void speedUp(int increment){
         speed+=increment;
     }
    
 }
 
 class MountainBike extends Bicycle{
     
     
     public int seatHeigth;
     
     MountainBike(int startHeight,int startSpeed,int startGear){
         super(startGear,startSpeed);
         this.seatHeigth = startHeight;
     }
     
     
     
      public void seatHeigth(int newVal){
          seatHeigth = newVal;
      }
     
     
     
     
     
 }
 
 
 
 
public class Main
{

	public static void main(String[] args) {
	    
	    MountainBike m =  new MountainBike(20,10,1);
	    
	     System.out.println(m.speed);
	     System.out.println(m.gear);
	     System.out.println(m.seatHeigth);
	    
	     m.speedUp(2);
	     System.out.println(m.speed);
	     
	    

 	}
}
