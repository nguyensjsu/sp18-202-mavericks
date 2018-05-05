/**
 * Write a description of class UserWorldAdapter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserWorldAdapter implements IUserSwapWorld 
{
    // instance variables - replace the example below with your own
    IWorldSwapWorld swapWorld;

    /**
     * Constructor for objects of class UserWorldAdapter
     */
    public UserWorldAdapter(){
      swapWorld = new MyWorld();
    };

    public void changeWorld(String str,int position){
        swapWorld.worldSwapWorld(str,position);
    }
    
}
