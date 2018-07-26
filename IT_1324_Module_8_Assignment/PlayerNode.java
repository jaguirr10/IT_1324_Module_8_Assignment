import java.util.*;
public class PlayerNode
{
private Player player;
private PlayerNode next;

public PlayerNode()
{
player=null;
next=null;
}  //end PlayerNode Constructor

public PlayerNode(Player p)
{
setPlayer(p);

next=null;
}

public Player getPlayer()
{
return player;
}

public PlayerNode getNext()
{
return next;
}
public void setPlayer(Player p)
{
player = p;
}
public void setNext(PlayerNode pn)
{
next = pn;
}


}
