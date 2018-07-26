public class PlayerLinkedList extends ShellLinkedList
{
public PlayerLinkedList()
{
super();
}//end constructor

public void insert(Player p)
{
PlayerNode pn = new PlayerNode(p);
pn.setNext(head);
head=pn;
numberOfItems++;
}


public Player delete(int searchID)throws DataStructureException
{
PlayerNode current = head;
PlayerNode previous=null;
while (current!=null && current.getPlayer().getID()!=searchID)
{
previous = current;
current=current.getNext();
}
if (current == null)
throw new DataStructureException(searchID +"Not Found: Cannot Be Found ");
else
{
if (current == head)
   head =head.getNext();
else
previous.setNext(current.getNext());
numberOfItems--;
return current.getPlayer();
}
}

//declare Third player insertion
public void ThirdPosition (Player thirdPlace)
{

   if(head == null)

      head = new PlayerNode(thirdPlace);
      PlayerNode pn = head;
   while(pn != null)
      pn = pn.getNext();
    pn = new PlayerNode(thirdPlace);
    
    
    
   
   PlayerNode current = new PlayerNode();
   PlayerNode previous = new PlayerNode();
   pn.setNext(current);
   
   if(head==null)
   {
      head = pn;
      return;
   }
   
   if(numberOfItems >= 3)
   {
      current = head;
      
      
      for(int i=0; i<=2;i++)
      {
         while(current !=null)
         {
          current = current.getNext();
         }
         }
          
          current = pn;
          current.setNext(previous);
          return;
        }
        
        previous.setNext(head);
        head = pn;
        numberOfItems++;
}
}//eend class