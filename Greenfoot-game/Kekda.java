import greenfoot.*; 
/**
 * Write a description of class SmallEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kekda extends Enemy
{
    
    int left2 = this.getRandomNumber(0,800);
    int right2 = this.getRandomNumber(left2+1,1024);
    int HP = getRandomNumber(20,60);
    public Kekda(int left,int right)
    {
        //todo 
        this.left = left;
        this.right = right;
    }
    
    public void act()
    {
        mover();
        judge(HP);
        
    }
    
    public void mover()
    {
        if(speed > 0 && getX() < right)
        {
            //speed = randomSpeed;
            move(speed);
            
        }
        else if(speed > 0 && getX() == right)
        {
            //speed = -randomSpeed;
            speed = -1;
            move(speed);
        }
        else if(speed < 0 && getX() > left)
        {
            //speed = -number;
            move(speed);
            
        }
        else if(speed < 0 && getX() == left)
        {
            //speed = randomSpeed;
            speed = 1;
            move(speed);
        }
        if(isTouching(Bullet.class))
        {
            getWorld().removeObject(getOneIntersectingObject(Bullet.class));
            HP = HP - 10;
            
        }
       
    }
    
    public Enemy clone()
    {
        
            Enemy enemy = new Kekda(left2,right2);
            return enemy;
   
    }
    
    public void judge(int HP)
    {
        World w = getWorld();
        if(HP<=0)
        {
          w.removeObject(this);
          int x = this.getRandomNumber(left2,right2);
          int y = this.getRandomNumber(0,489);
          w.addObject(this.clone(),x,y);
        }
    }
    
    public int getRandomNumber(int start,int end)
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
}
