public class Arrays {

    public static void main(String[] args) {

        int[] myArray; // array declaration 

        /* myArray = new int[4]; //array creation
        myArray[0] = 2;
        myArray[1] = 4;
        myArray[2] = 6;
        myArray[3] = 8; */

        myArray = new int[]{2,4,6,8}; //array creation in a easier way

        for (int j = 0; j < myArray.length; j ++){
            System.out.println(myArray[j]);
        }

        for (int elemento: myArray){
            System.out.println(elemento);
        }

    }
    
}
