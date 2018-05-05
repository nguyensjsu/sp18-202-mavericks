import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class user2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User2 extends PickRoles implements IUserSwapWorld
{
    /**
     * Act - do whatever the user2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    UserWorldAdapter userCallWorld;
    public User2(){
        
       GreenfootImage image = getImage();  
        image.scale(30,30); 
        setImage(image);
    }
    
     // implement the userSwapWorld
    public void changeWorld(String str,int position){
      userCallWorld = new UserWorldAdapter();
      userCallWorld.changeWorld(str,position);
    }
    
    
    public void act() 
    {
        // Add your action code here.
         if ( Greenfoot.isKeyDown("A") ){
            move(-18);
        }
        if ( Greenfoot.isKeyDown("D") ){
            move(18);
        }
        if ( Greenfoot.isKeyDown("E")){
           
                
               
            if(isTouching(Mac.class)){
                removeTouching(Mac.class); 
                getWorld().removeObject(this);
                // use the adapter to call world change world methods
                changeWorld("M",1);
            }
            else{
              if(isTouching(Pina.class)){
                removeTouching(Pina.class);
                 getWorld().removeObject(this);
                 // use the adapter to call world change world methods
                 changeWorld("P",1);
            }
             else{
                if(isTouching(Sierra.class)){
                removeTouching(Sierra.class);
                 getWorld().removeObject(this);
                 // use the adapter to call world change world methods
                 changeWorld("S",1);
            }    
                }
            }
           
            
        }
           // if (isTouching(items.class))
            //{
             //   items item = (items)getOneIntersectingObject(items.class);
              //  Bag.add(item);
               // Bag.print_lists();
                //removeTouching(items.class);
                //getWorld().removeObject(item);    
            //} 
     
    }    
}
