package com.stackroute.javape3;
//program to set up an array of places, Loop round and remove the vowels. Display the new
//words in console
    public class VowelReplace {
        public String[] getVowelReplace(String[] words)
        {
            if(words == null)
            {
                return null;
            }

            String[] result = new String[words.length];

            int i=0;

            for(String word : words)
            {
                if(word == null)
                {
                    result[i++] = null;
                }
                else {
                    result[i++] = word.replaceAll("[aeiou]", "");
                }
            }
            return result;
        }
}
