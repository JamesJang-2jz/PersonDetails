package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }
    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    public String whileLoop() {
        String result = "";
        int count = 0;
        while (count < personArray.length) {
            result += personArray[count];
            count++;
        }
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        return result;
    }
    public String forLoop() {
        String result = "";
        StringBuilder str = new StringBuilder();
        // String current = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0; i < personArray.length; i++) {
            str.append(personArray[i]);
            result = str.toString();
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        return result;
    }
    public String forEachLoop() {
        String result = "";
        StringBuilder str = new StringBuilder();
        for (Person person : personArray) {
            result += person;
        }
        System.out.println(result);
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
