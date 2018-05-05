import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkeyrole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Macrole extends Player
{
    /**
     * Act - do whatever the Monkeyrole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private Boolean role;
  
    private boolean upIsDown;
    private boolean enterIsDown;
    
    private boolean wIsDown;
    
    private Scenario sce;
    public int health;
    
    //无敌的时间
//    private SimpleTimer timer = new SimpleTimer();
//    private int LiveTime = 1000;
    private int timer = 10000;
    
    //角色的状态
    private boolean status=true;
    private int num=1;
    
    
    public Macrole(Boolean dicision,Scenario sce,int health)
    {
        this.role = dicision;
        this.sce=sce;
        this.health=health;
        
    }
    
    
    public void act() 
    {
        // Add you
        super.act();
        if(isTouching(EnemyBullet.class)){
            getWorld().removeObject(getOneIntersectingObject(EnemyBullet.class)); 
            health = health - 10;
        
        } 
        
        
        if(Greenfoot.isKeyDown("1") ){
           num=1;
        }            
        if(Greenfoot.isKeyDown("2") ){
           num=2;
        }
        
        if(Greenfoot.isKeyDown("3") ){
           num=3;
        }
        
        if(role){            

            if(Greenfoot.isKeyDown("Left") ){
               move(-4);
               leftright=false;
               setImage("monkeyStandL1.png");
            }
        
            if( Greenfoot.isKeyDown("Right")){
                move(4);
                leftright=true;
                setImage("monkeyStandR1.png");
            }
            
             if (!upIsDown && Greenfoot.isKeyDown("Up")){
            
               upIsDown = true;
             }
             if (upIsDown && !Greenfoot.isKeyDown("Up")){
           
                upIsDown = false;
                if(isTouching(Floor.class)){
                     setLocation(getX(),getY()-40);
                }
                
             } 
             
             
             if (!enterIsDown && Greenfoot.isKeyDown("Enter")){
            // do whatever when escape key is down
                  enterIsDown = true;
             }
             if (enterIsDown && !Greenfoot.isKeyDown("Enter")){
            // do whatever when escape key is released
              enterIsDown = false;
              if(num==1){
                   Context context= new Context(new FireOnce());
                   context.operation(this);
               }
               if(num==2){
                   Context context= new Context(new FireTwice());
                   context.operation(this);
               }
               if(num==3){
                   Context context= new Context(new FireAll());
                   context.operation(this);
               }

             } 
        }
        
        
        
        //第二种状态
        if(!role){
             if(Greenfoot.isKeyDown("A") ){
                move(-4);
                leftright=false;
                setImage("monkeyStandL1.png");
             }
        
            if( Greenfoot.isKeyDown("D")){
                move(4);
                leftright=true;
                setImage("monkeyStandR1.png");
            }
            
            if (!wIsDown && Greenfoot.isKeyDown("W")){
            
               wIsDown = true;
             }
             if (wIsDown && !Greenfoot.isKeyDown("W")){
           
                wIsDown = false;
                 if(isTouching(Floor.class)){
                     setLocation(getX(),getY()-40);
                }
             } 
             
             if (!enterIsDown && Greenfoot.isKeyDown("T")){
            // do whatever when escape key is down
                  enterIsDown = true;
             }
             if (enterIsDown && !Greenfoot.isKeyDown("T")){
           
               enterIsDown = false;
               //fire();
               if(num==1){
                   Context context= new Context(new FireOnce());
                   context.operation(this);
               }
               if(num==2){
                   Context context= new Context(new FireTwice());
                   context.operation(this);
               }
               if(num==3){
                   Context context= new Context(new FireAll());
                   context.operation(this);
               }
             }                          
        }
        

        
        if(this!=null){
            //status();
               if(this.health<20&&this.health>0){
                   if(this.status==false){//无敌状态
                      if (timer>0){
                       timer=timer-60;
                       
                       if(timer<=0){
                           this.status=true;
                           return;
                       }
                    }
                    }
                   else{//普通状态
                       if(timer==10000){
                           this.status=false;
                        }
                    }
             
                 
               }
            //   else{
              //     this.status=true;
              // }           
        }
        
        Actor bulletEnemy = getOneIntersectingObject(BulletFromEnemy.class);
              
        Actor enemy = getOneIntersectingObject(Enemy.class);
        
        Actor enemy_touch = getOneIntersectingObject(Enemy.class);
        
        StateContext sc=new StateContext(health,status,bulletEnemy,enemy,enemy_touch,this);
        sc.healthControl();
        
        if(health <=0){
            
            Scenario world = (Scenario) getWorld();
            world.playerDie();
            getWorld().removeObject(this);
        }
        if(isAtEdge()&&getY()>=470){
           Scenario scn =(Scenario) getWorld();
           scn.playerDie();
           getWorld().removeObject(this);
        }
        
        
       
        
    }    
      
}
