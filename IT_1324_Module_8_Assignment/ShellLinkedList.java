public abstract class ShellLinkedList
{
protected PlayerNode head;
protected int numberOfItems;

public void ShellLinkLists()
{
head = null;
numberOfItems=0;
}

public int getNumberOfItems()
{
return numberOfItems;
}
public boolean isEmpty()
{
return (numberOfItems==0);
}
public String toString()
{
String listString = "";
PlayerNode current = head;
for(int i=0; i<numberOfItems; i++)
{
listString+=current.getPlayer().toString()+"\n";
current = current.getNext();
}
return listString;
}//end toString
}//end class