package kadai04;

import java.awt.Color;

public class CurrentColor {
  private int red = 0;
  private int green = 0;
  private int blue = 0;
  
  public Color changeRed() {
    red = nextBright(red);
    return new Color(red, green, blue);
  }
  
  public Color changeGreen() {
    green = nextBright(green);
    return new Color(red, green, blue);
  }
  
  public Color changeBlue() {
    blue = nextBright(blue);
    return new Color(red, green, blue);
  }
  
  private int nextBright(int b) {
    int res = -1;
    if (b == 0) res = 128;
    if (b == 128) res = 255;
    if (b == 255) res = 0;
    
    return res;
  }
}
