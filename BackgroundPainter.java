import org.code.neighborhood.*;
  /* Paints the background of the grid black 
  Uses multiple methods to do so */
public class BackgroundPainter extends PainterPlus{
 
  public void paintSideBack1() {    // paints the left side in black dashes 
  paint("black");
  move();
  move();
  paint("black");
  move();
  move();
  paint("black");
  move();
  move();
  paint("black");
  move();
  paint("black");
  }
  
  public void paintSideBack2() { // paints the right side in black dashes 
  paint("black");
  move();
  paint("black");
  move();
  move();
  paint("black");
  move();
  move();
  paint("black");
  move();
  move();
  paint("black");
  }
  
  public void paintBotBack () { //paints the bottom of the frame black
    move();
    paint("black");
    move();
    paint("black");
    move();
    move();
    move();
    paint("black");
    move();
    paint("black");
    move();
  }
 
  public void paintTopBack() { //paints the top of the frame black
    move();
    paint("black");
    move();
    move();
    paint("black");
    move();
    paint("black");
    move();
    move();
    paint("black");
  }
  
  
}
 
  
  

  
 