import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        HashMap<String, Integer> hmMagazine = new HashMap<String, Integer>();
        HashMap<String, Integer> hmRansome = new HashMap<String, Integer>();
        Boolean checkKey = true;
        for(int i =0; i<m; i++){
            if(hmMagazine.containsKey(magazine[i])){
                hmMagazine.put(magazine[i],hmMagazine.get(magazine[i])+1);
            }
            else
            {
                hmMagazine.put(magazine[i], 1);
            }
        }
        
        for(int i =0; i<n; i++){
            if(hmRansome.containsKey(ransom[i])){
                hmRansome.put(ransom[i],hmRansome.get(ransom[i])+1);
            }
            else
            {
                hmRansome.put(ransom[i], 1);
            }
        }
        for (String mkey :hmMagazine.keySet())
        {
            if(hmRansome.containsKey(mkey)){
                if(hmMagazine.get(mkey)<hmRansome.get(mkey)){
                    checkKey = false;
                    break;
                }
                
            }
        }
        if(checkKey){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
}
}
