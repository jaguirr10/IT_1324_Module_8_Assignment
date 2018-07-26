public class PlayerLinkedListClient
{
public static void main (String [] args)

{  
   Player p1 = new Player(3, "Mark","Checkers" );
   Player p2 = new Player(4, "Cindy","Scramble" );
   Player p3 = new Player(1, "Mandy","Trouble" );
   
   
   PlayerLinkedList Players = new PlayerLinkedList();
   System.out.println(" The number of items on the list are: " + Players.getNumberOfItems() + "\n" + Players.toString());
   
   Players.insert(p1);
   System.out.println(" The number of items on the list are: " + Players.getNumberOfItems() + "\n" + Players.toString());
   
   
   Players.insert(p2);
   System.out.println(" The number of items on the list are: " + Players.getNumberOfItems() + "\n" +Players.toString());
   
   Players.insert(p3);
    System.out.println(" The number of items on the list are: " + Players.getNumberOfItems() + "\n" +Players.toString());
    
    System.out.println("Coded by Juan Aguirre");
 
   }
  }