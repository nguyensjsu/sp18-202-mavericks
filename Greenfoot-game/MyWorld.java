import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World implements IWorldSwapWorld
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public static int roleChoice = 0;
    public static String choiceList[]= new String[2];
    public MyWorld()
    {    
        // Create a new world with 600x350 cells with a cell size of 1x1 pixels.
        super(1024, 489, 1);
        setBackground("background1.jpg");
        prepare();
    }
    public void worldSwapWorld(String str,int position ){
      
      this.choiceList[position]=str;
      this.roleChoice+=1;
      if(this.roleChoice==2){
        this.roleChoice=0;
        List objects = getObjects(null);
        removeObjects(objects);
        Greenfoot.setWorld(new Scenario(choiceList));
        
        }
    }
    

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Mac monkey = new Mac();
        addObject(monkey,172,290);
        Pina pig = new Pina();
        addObject(pig,298,290);
        Sierra sandy = new Sierra();
        addObject(sandy,422,291);
        User1 user1 = new User1();
        addObject(user1,72,280);
        User2 user2 = new User2();
        addObject(user2,72,306);
        // Set the position of the Role choice

        sandy.setLocation(690,393);
        pig.setLocation(472,402);
        monkey.setLocation(310,400);
        sandy.setLocation(631,394);
        user1.setLocation(190,383);
        user2.setLocation(192,413);
        introduction introduction = new introduction();
        addObject(introduction,848,352);
    }
}
