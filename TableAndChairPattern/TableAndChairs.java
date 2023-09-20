
package TableAndChairPattern;

class TableAndChairs{

      public static void main(String[] args) {
             
            

            int row = 6;
            int column = 32;
     
            int interval = (column/4) + 1;
            for (int i = 1; i <=row; i++) {
                  for (int j = 1; j <=column; j++) {                          
                         if(  i <3   &&    (  j <2 || j > column-1 )){
                             System.out.print("X");
                         }else if(i == 3 &&  ( (j<2 || j>interval )  && (j<column-(column/4) || j>column-1   )  )  ){
                                System.out.print("X");                        
                         }else if(i == 4 && ( (j<=interval-2 )  ||  j == interval+1   ||  j == (column-(column/4))-1 || ( j >(column-(column/4))+1 )  )){
                               System.out.print("X"); 
                        }else if(i >= 5 && (  j<2 || j == interval-2 || j ==   )){

                        }else
                            System.out.print(" ");  
                         
                  }            // 1 ,5 8
              System.out.println();         
            }
            
         



      //  int row = 6;
      //  int column =24;

     
      //  for (int i = 1; i <=row; i++) {
      //        for (int j = 1; j <=column; j++) {                          
      //               if(  i <3   &&    (  j == 1 || j == column )){
      //                   System.out.print("X");
      //               }else if(i == 3 &&  ( j<2 || j>7 ) &&  ( j< 18 || j>=24  )  ){
      //                        System.out.print("X");                        
      //               }else if(i == 4 && (j<=5 || j==8 || j == 17 || j >=20 )   ){
      //                       System.out.print("X");   
      //               }else if(i >= 5 && ( j<2 ||  (j>4&&j<6)  || (j>7 && j<9) || (j>16 && j<18)  || (j>19 && j<21) || (j>23) ) ) {
      //                      System.out.print("X");   
      //             }else
      //                  System.out.print(" ");  
                    
      //        }            // 1 ,5 8
      //    System.out.println();         
      //  }
       
      }

}









