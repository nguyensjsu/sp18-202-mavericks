import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthNormal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthNormal extends Actor implements IState
{
    /**
     * Act - do whatever the HealthNormal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    
    
    
    public void healthControl(Actor bulletEnemy,Actor enemy,Actor enemy_touch,Player player){
    //    Actor bulletEnemy = getOneIntersectingObject(BulletEnemy.class);
              
    //    Actor enemy = getOneIntersectingObject(Enemy.class);
        
        if(enemy!=null){
            Scenario sc1 =(Scenario) player.getWorld();
            sc1.playerDie();
            player.getWorld().removeObject(player);
        }
         
        if (bulletEnemy != null)
            {
                player.getWorld().removeObject(bulletEnemy);
//                if ((health -= 10) <= 0) getWorld().removeObject(this);
            }
    }
}
