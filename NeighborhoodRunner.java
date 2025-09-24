import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    BackgroundPainter Layla = new BackgroundPainter();
    //gives painter 18 paint
    Layla.setPaint(18);
    // sets painter ready in position
    Layla.turnRight();
    //painter paints the left side and turns
    Layla.paintSideBack1();
    Layla.turnLeft();
    //painter paints bottom of the background and turns
    Layla.paintBotBack();
    Layla.turnLeft();
    //painter paints the right side and turns
    Layla.paintSideBack2();
    Layla.turnLeft();
    //painter paints the top of the background
    Layla.paintTopBack();
    //makes painter to paint the rest
    PokePainter Layl = new PokePainter();
    //gives painter 100 paint turns and paints the top of the face
    Layl.setPaint(100);
    Layl.turnRight();
    Layl.paintFaceSide();
    // locates itself to the bottom left and paints the left cheek
    Layl.move();
    Layl.turnLeft();
    Layl.move();
    Layl.turnLeft();
    Layl.paintCheek();
    //relocates and paints the bill of the pokemon
    Layl.turnLeft();
    Layl.move();
    Layl.turnLeft();
    Layl.move();
    Layl.move();
    Layl.paintBill();
    //moves to the other side to paint the right cheek
    Layl.moveFast();
    Layl.turnAround();
    Layl.paintCheek();
    //moves up and finishes filling in the open spots
    Layl.moveFast();
    Layl.paint("yellow");
    Layl.turnLeft();
    Layl.move();
    Layl.move();
    Layl.move();
    Layl.paint("yellow");
    //painter finished painting
  }
  }