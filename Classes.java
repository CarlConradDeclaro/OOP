 
 class Student{
     
     String name;
     int age;
     String address;
     Student(String name,int age,String address){
         this.name = name;
         this.age = age;
         this.address = address;
     }
     
     public void setName(String name){
         this.name = name;
     }
     
     public void setAge(int age){
         this.age = age;
     }
     
     public void setAddress(String address){
         this.address = address;
     }
     
     public String getName(){
         return name;
     }
     
      public int getAge(){
         return age;
     }
      public String getAddress(){
         return address;
     }
     
     
     public String toString(){
         return this.getName() +" "+ this.getAge() + " " + getAddress();
     }
     
     
     
 }
 
 
public class Classes
{

	public static void main(String[] args) {
	    
	    
	    
	    Student st = new Student("carl",19,"Balangiga");
	    
	    st.setName("conrad");
	    System.out.println(st.toString());
	    

 	}
}
