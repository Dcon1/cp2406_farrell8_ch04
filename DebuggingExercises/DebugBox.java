public class DebugBox
{
   public static void FixDebugBox() {
      int width;
      int length;
      int height;
         length = 1;
         width = 1;
         height = 1;
      }
   public DebugBox(int width, int length, int height)
   {
      width = width;
      length = length;
      height = height;
   }
   public void showData(int width, int height, int length)
   {
     System.out.println("width: "  + width + "  length: " +
       length + "  Height: " + height);
   }
   public double getVolume(int width, int height, int length)
   { 
     return length * width * height;
   }
}
