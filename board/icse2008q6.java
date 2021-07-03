package board;

/*
Question 6:
Define a class and store the given city names in a single dimensional array. 
Sort these names in alphabetical order using the Bubble Sort technique only.
INPUT : Delhi, Bangalore, Agra, Mumbai, Calcutta
OUTPUT : Agra, Bangalore, Calcutta, Delhi, Mumbai 
*/

public class icse2008q6 {
    public static void main(String[] args) {
        String cities[] = {"Delhi", "Bangalore", "Agra", "Mumbai", "Calcutta"};
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities.length-1; j++) {
                if(cities[j].compareTo(cities[j+1])>0)
                {
                    String temp = cities[j];
                    cities[j] = cities[j+1];
                    cities[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting cities in alphabetical order are: ");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
    }    
}
