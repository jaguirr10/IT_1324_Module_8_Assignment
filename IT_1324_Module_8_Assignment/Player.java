public class Player
{
private int  id;
private String name;
private String game;

public Player(int i, String n, String g)
{
   id=i;
   name = n;
   game = g;
}
public int getID()
{
return id;
}
public String getName()
{
return name;
}
public String getGame()
{
return game;
}
public void setID(int i)
{
id=i;
}
public void setName(String n)
{
name=n;
}
public void setGame(String g)
{
game=g;
}
public boolean equals(Object p)
{
   if(!(p instanceof Player))
   return false;
   else
   {
   Player objPlayer = (Player) p;
   return (id ==objPlayer.id && name.equals(objPlayer.name) && game.equals(objPlayer.game));
   }//end else
   }
public String toString()
{
      
   return ("id "+id+"\tname: "+name+"\tgame: "+game);
}
}


