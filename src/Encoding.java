
import java.util.*;

public class Encoding
{
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
      
      StringBuilder firstString = new StringBuilder("");
      String combination = "";
      //Making a string to use as parameter in backtrack using m and n
      for(int i=0; i<m;i++){
         firstString.append('.');
      }
      for(int i=0; i<n;i++){
         firstString.append('-');
      }
      
      String finalString = firstString.toString();

      //in order to keep count of dashes and dots in combination string
      int dot=0;
      int dashes=0;
      
      backtrack( m,  n, finalString, combination, result,dot, dashes);
      
     return result;
   }
   
public static void backtrack(int m, int n,String s,String combination, Set<String> result, int dot, int dashes )
   {
	//add when length of combination is same as number or dashes and dots sum string.
      if(combination.length()==s.length()){
         result.add(combination);
         return;
      }


      
      for (int i = 0; i < s.length(); i++) {
        char cat = s.charAt(i);
        String copy=Character.toString(cat);
        if(cat=='.' && dot<m){
           combination+=copy;
            dot++;
        }
        else if(cat=='-' && dashes<n){
           combination+=copy;
           dashes++;
        }
        else
        continue; // in order to increment the loop when none of above executes
          backtrack(m,n,s,combination,result,dot, dashes);
      //this for manipulating the combination as it was in the upper level of recursion tree.
      if(combination.charAt(combination.length()-1)=='-'){
         combination= combination.substring(0,combination.length()-1);
         dashes--;
      }
      else if(combination.charAt(combination.length()-1)=='.'){
        combination= combination.substring(0,combination.length()-1);
         dot--;
      }
      }
    
      
   }
}