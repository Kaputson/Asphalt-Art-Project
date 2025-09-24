import org.code.neighborhood.*;

public class PokePainter extends PainterPlus{
   /*
  Paints the face of the pokemon
  The color selected is yellow
  As well as paints the beak orange
  Finally, it paints the eyes black (two eyes)
  */
  public void paintFaceSide() { // Paints the first half of the face including the eyes
     move();
     turnLeft();
     paint("yellow");
     while (canMove()){
      move();
      paint("yellow");
     }
     turnRight();
     move();
     turnRight();
     move();
     while(canMove()){
       paint("yellow");
       move();
     }
     turnLeft();
     move();
     turnLeft();
     paint("yellow");
     while (canMove()){
      move();
      paint("yellow");
     }
     turnRight();
     move();
     turnRight();
     move();
     paint("yellow");
     move();
     paint("black");
     move();
     paint("yellow");
     move();
     paint("yellow");
     move();
     paint("black");
     move();
     paint("yellow");
     
     
   }
 
public void paintCheek() {//Painter paints the left cheek but if it's not facing east it will paint what should be the right cheek
  if (isFacingEast()){
    paint("yellow");
    move();
    paint("yellow");
    move();
    paint("yellow");
    turnRight();
    move();
    paint("yellow");
    turnRight();
    move();
    paint("yellow");
  } 
  else {
    paint("yellow");
    move();
    paint("yellow");
    turnLeft();
    move();
    paint("yellow");
    turnRight();
    move();
    paint("yellow");
    turnRight();
    move();
    paint("yellow");
  }
  
}
 
  public void paintBill() {//painter paints the bill of the bird
    paint("orange");
    move();
    paint("orange");
    turnLeft();
    move();
    paint("orange");
    turnLeft();
    move();
    paint("orange");
    turnRight();
    move();
    paint("orange");
    turnRight();
    move();
    paint("orange");
  }
}

  