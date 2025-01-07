package week1;

import java.util.StringTokenizer;
import java.util.HashMap;

public class LetterAndCharacterCount {
    private String str;
    
    public LetterAndCharacterCount(String str) {
        this.str = str;
    }
    
    void wordCount() {
        StringTokenizer tempStr = new StringTokenizer(str);
        HashMap<String, Integer> word = new HashMap<>();
        while (tempStr.hasMoreTokens()){
            String tempWord = tempStr.nextToken();
            if (word.containsKey(tempWord))
                word.put(tempWord, word.get(tempWord) + 1);
            else 
                word.put(tempWord, 1);
        }
        System.out.println(word);
    }

    void characterCount() {
        HashMap<String, Integer> character = new HashMap<>();
        for (char c: str.toCharArray()){
            if (c == ' ') continue;
            if (character.containsKey(c+ ""))  
                character.put(c + "", character.get(c + "") + 1);
            else character.put(c+ "", 1);
        }
        System.out.println(character);
    }

    
}
