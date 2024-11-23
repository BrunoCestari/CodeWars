/*

https://www.codewars.com/kata/513e08acc600c94f01000001/train/java

The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

Examples (input --> output):
255, 255, 255 --> "FFFFFF"
255, 255, 300 --> "FFFFFF"
0, 0, 0       --> "000000"
148, 0, 211   --> "9400D3"


*/


import java.util.HashMap;


class RgbToHex {

     public static String rgb(int r, int g, int b) {
        //Round values that fall out of the range [0, 255]

         if(r < 0) r = 0;
         if(g < 0) g = 0;
         if(b < 0) b = 0;

         if(r > 255) r = 255;
         if(g > 255) g = 255;
         if(b > 255) b = 255;


         //Create a map to hexadecimal values
         HashMap<Integer, String> map = new HashMap<>();
         map.put(0, "0");
         map.put(1, "1");
         map.put(2, "2");
         map.put(3, "3");
         map.put(4, "4");
         map.put(5, "5");
         map.put(6, "6");
         map.put(7, "7");
         map.put(8, "8");
         map.put(9, "9");
         map.put(10,"A");
         map.put(11,"B");
         map.put(12,"C");
         map.put(13,"D");
         map.put(14,"E");
         map.put(15,"F");

         String redHexecimal = map.get(r/16) + map.get(r%16);
         String greenHexecimal = map.get(g/16) + map.get(g%16);
         String blueHexecimal = map.get(b/16) + map.get(b%16);

         return redHexecimal + greenHexecimal + blueHexecimal;
     }
}

