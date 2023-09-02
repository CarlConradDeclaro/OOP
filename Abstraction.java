 
  abstract class GraphObject{
     
     abstract void draw();
     abstract void resize();
     
 } 
 
 
 class circle extends GraphObject{
     
     
     void draw(){
         System.out.println("Drawing a circle");
     }
     
     void resize(){
         System.out.println("Resizing the circle");
     }
 }
 
 class recatangle extends GraphObject{
     
     
     void draw(){
         System.out.println("Drawing a recatangle");
     }
     
     void resize(){
         System.out.println("Resizing the recatangle");
     }
     
     
 }
 
 
 
 
 
 
public class Main
{

	public static void main(String[] args) {
	    
	    
	    GraphObject circle  =  new circle();
	    GraphObject recatangle = new recatangle();
	    
	    
	    circle.draw();
	    circle.resize();
	    
	    
	    recatangle.draw();
	    recatangle.resize();

 	}
}
