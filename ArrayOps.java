public class ArrayOps {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,3,3,4};
        int [] anotherArray = {2,8,3,7,8};
        System.out.println(containsTheSameElements(anotherArray, myArray));

        
    }
    
    public static int findMissingInt (int [] array) {
        String arrayToString = "";
        int missingInteger = 0;
        for ( int i = 0; i < array.length; i++) {
            arrayToString += array[i];     
            }
        for ( int j = 0; j <= arrayToString.length(); j++) {
            if (arrayToString.indexOf(Integer.toString(j)) == -1) {
                missingInteger = j;
                break;
            }
        }
        return missingInteger;
        }
    

    public static int secondMaxValue(int [] array) {
        int i = 0;
        int [] newArray =  new int [array.length-countMaxChar(array)];
        for(int j = 0; j < array.length; j++) {
            if (array[j] != findMax(array)) {
                newArray[i++] = array [j];   
            }
        }
        return findMax(newArray);
    }
    public static int countMaxChar(int [] array) {
        // a function that finds the max number of the array and counts how many times it apears
        int max = array[0];
        int count = 0;
        // finds the max number
        for (int i = 1; i < array.length; i++){
            max = Math.max(max,array[i]);
        }
        //counts how many times it apears
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                count++;   
            }
        }
        return count;
    }
    public static int findMax(int [] array) {
        // a function that finds the max number of an array 
        int max = 0;
        for(int i = 0; i < array.length; i++ ) {
            max = Math.max(max,array[i]);
        }
        return max;
        }
    public static boolean contains(int[] arr, int value, int index) {
        // a function that checks if a certain number is in the array
        for (int i = 0; i < index; i++) {
            if (arr[i] == value) {
                return true;
            }
          } 
        return false;
        }
    public static boolean contains( int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }return false;
    }
    public static int countUniqe(int [] array) {
        int count = 0; 
        for ( int i = 0; i < array.length; i++) {
            count += contains(array, array[i], i) ? 0 : 1;
        }
        return count;
    }
    
    
    public static boolean containsTheSameElements(int [] array1,int [] array2) { 
            if (countUniqe(array1)!= countUniqe(array2)) {
                return false;
            }
            if ((intersection(array1, array2)).length == countUniqe(array2)) {
                return true;
            }
            else {return false;}
            }
    
    public static int [] intersection(int [] set1, int[] set2) {
        // a function that returns the intersection of two sets
        int [] newArray = new int [Math.min(set1.length, set2.length)];
            int [] smallSet = set1.length < set2.length ? set1 :set2;
            int [] bigSet = set1.length <set2.length ? set2 : set1;
        int size = 0;
        for (int i = 0; i < smallSet.length; i++) {
            if (contains(bigSet, smallSet[i])) {
                newArray[size++] = smallSet [i]; 
            }
        }
        int [] finalArray = new int [size];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = newArray[i];
        }
        return finalArray;

    }

    

    public static boolean isSorted(int [] array) {
        // for increasing order
        boolean isIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isIncreasing = false;
                    break;
                }
            }
        if (isIncreasing) {
            return true;
            }
        // for decreasing order
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] < array[j + 1]) {
                return false;
                }
            }
        return true;
        }
        
    }


