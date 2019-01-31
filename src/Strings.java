import java.util.HashMap;
public class Strings
{
   public static String uniqueLetters(String str)
   {
      HashMap<Character, Integer> hash = new HashMap<>();
      String result="";
      // counting the number of each letter
      for(int i=0; i<str.length();i++){
         char s= str.charAt(i);
         
         if(hash.get(s)==null){
            hash.put(s,1);
         }
         else{
            int key= hash.get(s);
            hash.put(s,key+1);
         }
      }
      //picking the ones which appear only once
      for(int j=0;j<str.length();j++){
         char b= str.charAt(j);
         if(hash.get(b)==1){
            String con= Character.toString(b);
            result+=con;
         }
      }
      return result;
   }
}