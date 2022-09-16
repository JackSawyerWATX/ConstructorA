public class Main {
    String x;
    String y;
    String z;
    String a;
    String b;
    String c;
  
    public Main() {
      x = "so";
      y = "I'm";
      z = "exahusted";
      a = "must";
      b = "I";
      c = "go on";
    }
  
    public static void main(String[] args) {
      Main what = new Main();
      System.out.println(what.y + " " + what.x + " " + what.z + ".");
      System.out.println(what.b + " " + what.a + " " + what.c + ".");
    }
  }