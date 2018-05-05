import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class user1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User1 extends PickRoles implements IUserSwapWorld
{
    /**
     * Act - do whatever the user1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   UserWorldAdapter userCallWorld;
   public User1(){
        GreenfootImage image = getImage();  
        image.scale(30, 30); 
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
        if ( Greenfoot.isKeyDown("left") ){
            move(-18);
        }
        if ( Greenfoot.isKeyDown("right") ){
            move(18);
        }
        if ( Greenfoot.isKeyDown("down") ){
            if(isTouching(Mac.class)){
                removeTouching(Mac.class);
               
                getWorld().removeObject(this);
                changeWorld("M",0);
            }
            else{
              if(isTouching(Pina.class)){
                  removeTouching(Pina.class);
                  
                  getWorld().removeObject(this);
                  changeWorld("P",0);
              }
              else{
                if(isTouching(Sierra.class)){
                    removeTouching(Sierra.class);
                   getWorld().removeObject(this);
                   changeWorld("S",0);
                }
              }
            }
        }
           // if (isTouching(items.class))
            //{
                //items item = (items)getOneIntersectingObject(items.class);
                //Bag.add(item);
                //Bag.print_lists();
               // removeTouching(items.class);
             //   getWorld().removeObject(item);    
           // } 
            
   
        }
}
