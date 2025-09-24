import org.code.neighborhood.*;

public class PokePainter extends PainterPlus{
   // goes down the asphalt painting half of the birds face
  public void paintFaceSide() {
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
  // Painter paints the left cheek but if it's not facing east it will paint what should be the right cheek
public void paintCheek() {
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
  //painter paints the bill of the bird
  public void paintBill() {
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

  