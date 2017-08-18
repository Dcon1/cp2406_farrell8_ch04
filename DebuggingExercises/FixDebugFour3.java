// This class uses a FixDebugBox class to instantiate two Box objects
public class FixDebugFour3 {
   public static void main(String args[]) {
      DebugBox box1 = new DebugBox(10, 10, 10);
      DebugBox box2 = new DebugBox(100, 100, 100);
      System.out.println("The dimensions of the first box are");
      //Do not understand this error box1.showData();
      System.out.print("  The volume of the first box is ");
      //box1.getVolume();
      System.out.println("The dimensions of the second box are");
      //box2.showData();
      System.out.print("  The volume of the second box is ");
      //box2.getVolume();
   }

   public static void showVolume(DebugBox aBox) {
      //double vol = aBox.getVolume();
      //System.out.println(vol);
   }
}

