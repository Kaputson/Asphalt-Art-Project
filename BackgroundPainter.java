import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus{
  // Painter paints one side of the background using a pattern 
  public void paintSideBack1() {
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
  // Painter paints one side of the background using a pattern like before but on the other side
  public void paintSideBack2() {
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
  // Painter paints the bottom of the background
  public void paintBotBack () {
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
  //Painter paints the bottom of the background
  public void paintTopBack() {
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
 
  
  

  
 