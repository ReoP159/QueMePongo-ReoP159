package ar.edu.utn.frba.dds;

public class Color extends Object {
  private int red;
  private int green;
  private int blue;

  public Color(int r, int g, int b) {
    this.red = r;
    this.green = g;
    this.blue = b;
  }

  @Override
  public boolean equals(Object obj) {

    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }

    Color col = (Color) obj;
    return this.red == col.red && this.green == col.green && this.blue == col.blue;
  }

  @Override
  public int hashCode() {
    return Integer.valueOf(red).hashCode()
        + Integer.valueOf(green).hashCode()
        + Integer.valueOf(blue).hashCode();
  }
}
