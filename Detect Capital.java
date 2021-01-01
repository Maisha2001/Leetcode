class Solution {
        public boolean detectCapitalUse(String word){
            boolean trueORfalse = false;
            
            //Check case 3: Only the first letter in this word is capital, like "Google".
            for (int i=0; i<word.length(); i++){
                if (i == 0){
                    if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                        trueORfalse = true;
                    }
                }
                else{
                    if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                        trueORfalse = false;
                    }
                }
            }
            
            //Check case 1: All letters in this word are capitals, like "USA".
            //Check case 2: All letters in this word are not capitals, like "leetcode".
            if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())){
                trueORfalse = true;
            }
             
            return trueORfalse; 
        }
}
