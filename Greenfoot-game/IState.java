import greenfoot.*;
/**
 * Write a description of class State here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IState 
{
    public void healthControl(Actor bulletEnemy,Actor enemy,Actor enemy_touch,Player player);
}
