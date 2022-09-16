public class Main {
    String x;
    String y;
    String z;
  
    public Main() {
      x = "farts";
      y = "My";
      z = "stink";
    }
  
    public static void main(String[] args) {
      Main what = new Main();
      System.out.println(what.y + " " + what.x + " " + what.z + ".");
    }
  }