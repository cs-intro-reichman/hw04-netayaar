public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String myStr = "Neta yaar is amazing";
        char n = 'a';
        System.out.println(allIndexOf(myStr, n));
        
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
        char character ; 
        for (int i = 0; i < string.length(); i++) {
            character = string.charAt(i);
            // convert vowel to uppercase
            if (isVowel(character)) {
                // #feedback - if with nothing in it is not needed, you can just have "if(!isUpperCase...".
                if (isUpperCase(character)) {   
                }else {
                    character = (char)(character - 'a' +'A');
                }
            } else if (isUpperCase(character) && !isVowel(character)) { // #feedback - no need to check isVowel, we know that this char is not vowel because we are in the "else".
                character = (char)(character + 'a' - 'A');
            } newString += character;
                
            }return newString;
                
            }
    public static boolean isUpperCase (char character) {
        return 'A' <= character && character <= 'Z'; 

    }

    public static boolean isLowerCase (char character) {
        return  'a' <= character && character <= 'z';
    }
        
         
    
    public static boolean isVowel (char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
         character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            return true;
            
        } 
        return false;
    }
    public static String camelCase(String string) {
        String changeToLowerCase = "";
        char character;
    
        // a loop that changes all of the letters to lowercase
        for (int i = 0; i < string.length(); i++) {
            character = string.charAt(i);
            if (isUpperCase(character)) {
                character = (char) (character + ('a' - 'A'));
            }
            changeToLowerCase += character;
        }
    
        String firstLetterUpperCase = "";
    
        for (int i = 0; i < changeToLowerCase.length(); i++) {
            character = changeToLowerCase.charAt(i);
            if (i==0) {
                firstLetterUpperCase += changeToLowerCase.charAt(i);
                
            }
            else if((character == ' ' && i + 1 < string.length() && isLowerCase(string.charAt(i + 1)))) {
                firstLetterUpperCase += (char) (changeToLowerCase.charAt(i + 1) - 32);
                i++;
            } else {
                firstLetterUpperCase += character;
            }
        }
    
        String noSpace = "";
    
        for (int i = 0; i < firstLetterUpperCase.length(); i++) {
            if (firstLetterUpperCase.charAt(i) != ' ') {
                noSpace += firstLetterUpperCase.charAt(i);
            }
        }
    
        // a loop that deletes the spaces
        String resultString = "";
        for (int i = 0; i < noSpace.length(); i++) {
            character = noSpace.charAt(i);
            if (character != ' ') {
                resultString += character;
            }
        }
    
        return resultString;
    }
     

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == chr) {
            count += 1;          
        }
       }
       int index = 0;
       int[] arrayOfIndex = new int [count];
       for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i)== chr) {
            arrayOfIndex[index] = i;  
            index ++;
        }
       }
        return arrayOfIndex;
    }
}
