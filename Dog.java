import mayflower.*;
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Actor
{
   
    public Dog()
    {
       setImage("img/dog.png");
    }
    public void act(){
         if(isTouching(Cat.class)){
            Object a  = getOneIntersectingObject(Cat.class);
            Cat c = (Cat) a; 
            World w = getWorld();
                
            c.increaselives(-1);
            c.setLocation(400, 300);
            if(c.getlives() <= 0){
              w.removeObject(c);
            }
        }
    }

   
}
