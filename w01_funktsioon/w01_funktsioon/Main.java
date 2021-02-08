package w01_funktsioon.w01_funktsioon;
public class Main {
    public static void main(String [] args ) {

       float fileSize = 100;
       float internetSpeed = 2.048f;
       float overHeadInput = 13;
       float overHead = overHeadInput / 100;

       float fullTime = ((fileSize / internetSpeed) * overHead);
       float timeInMinutes = fullTime / 60;
    
       
      
       System.out.println(Math.round(fullTime));
       System.out.println(timeInMinutes);
     
        
    }

  /*   public static int calc(int fileSize, int internetSpeed, int overHead) {
        
        int fullTime = ((fileSize / internetSpeed) * overHead) ;
        //int resultInMinutes = fullTime * 60 ;
        return fullTime; 
        
    } 
    
    */
}

