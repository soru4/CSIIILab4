import mayflower.*;
/**
 * Write a description of class MyWorld here.
 *
 * @author Sohum Tambe
 * @version (a version number or a date)
 * Period 3
 */
public class MyWorld extends World
{

   
    public MyWorld()
    {
        setBackground("img/bluebonnets.jpg");

        Cat a = new Cat();
        addObject(a, 400, 300);
        showText("Score: " + a.getScore() + " Lives: " + a.getlives(), 10, 30, Color.BLACK);
        
        
        Dog d = new Dog();
        
        addObject(d, 200, 150);
        
        Yarn y1 = new Yarn();
        addObject(y1, 600, 150);
        Yarn y2 = new Yarn();
        addObject(y2, 200, 450);
         Yarn y3 = new Yarn();
        addObject(y3, 600, 450);
    }
    public void act(){
    
    }

    
}
