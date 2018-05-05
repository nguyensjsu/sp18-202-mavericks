import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Factory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factory
{
    public Enemy createEnemy(int type,int left,int right)
    {
        switch(type)
        {
            case 0:
                return new Kekda(left,right);
            
            case 1:
                return new Teddy(left,right);
            case 2:
                return new Alligator(left,right);
                
            default:
                break;
        }
        return null;
    }
}
