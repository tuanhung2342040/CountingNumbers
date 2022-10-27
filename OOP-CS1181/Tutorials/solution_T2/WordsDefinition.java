
/**
 * transtaltes a given line based on the difinition of each word in file core-wordnet.txt
 *
 * @author jmadar 
 * @author hdarbandi
*/
 

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class WordsDefinition {
    
    private ArrayList<EachWord> dictionary;
    
    public WordsDefinition() {        
        try {
            getWords("core-wordnet.txt");
        } catch (IOException ex) {
            System.out.println("Error: Cannot read file. "+ex);
        }       
    }
    
    /**
    * Returns the definition of a word
    * @return 
    */
    public String getDefinition(String line) {
        String[] arr = line.split(" ");
        String tmp="",definition;
        int i;
        
        for (i=0; i<arr.length; i++){
            definition = searchDefinition(arr[i]);
            if(definition != null)
                tmp +="["+definition+"] ";
            else
                tmp +=arr[i] + " ";
        }   
        return tmp;
    } 
    
    /**
    * Search ArrayList for word meaning and returns it.
    * @return meaning in case of success 
    *           otherwise returns null
    */
    private String searchDefinition(String theWord) {
        for(EachWord e : dictionary){
            if(theWord.equals(e.getWord()))
                return e.getMeaning();
        }
        return null;
    }   
    
    
            
    /**
     * Given a file, return all the lines in an array for easy processing
     */
    private void getWords(String dictionaryFile) throws IOException {
        dictionary = new ArrayList<EachWord>();

        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(dictionaryFile)));
        while (true) {
            String line = in.readLine();
            if (line == null) 
                break;
            line = line.trim();
            if(line.length()==0)
                continue;
            dictionary.add(new EachWord(line));        
        }
     
    
    }
   
}

