import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
    /** 
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public boolean live;
    //private boolean leftright=true;
    //private Scenario1 sce;
    //private double lastShot;
    int HP;
    int speed = 1;
    int left ;
    int right;
    
    public Enemy(){
    }
    
    public Enemy(int left,int right)
    {
        //this.live = live;
        //this.sce=sce;
        this.left = left;
        this.right = right;
    }
    
    public void act()
    {
        // Add your action code here.
        
    }    
    
    public abstract Enemy clone();
    
}
