import java.rmi.dgc.VMID;

public class Interfaces {
     public static void main(String[] args) {
          queen q = new queen();
          q.move();
     }
}

interface chessplayer{
     public void move();
}

class queen implements chessplayer{
     public void move(){
          System.out.println("Queen moves");
     }
}
class king implements chessplayer{
     public void move(){
          System.out.println("King moves");  
     }
}
class pauda implements chessplayer{
     public void move(){
          System.out.println("Paud moves");
     }
}
