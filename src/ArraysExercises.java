import java.util.Arrays;

public class ArraysExercises {
   public static Person[] addPerson(Person[] array, Person singlePerson){//methods addPerson
        //Person newPerson[] = new Person[n+1]
       Person[] personAddOne = Arrays.copyOf(array,array.length +1);//function for adding +1, copyOf the array
                personAddOne[personAddOne.length-1] = singlePerson;
                return personAddOne;
            }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));//toString in order to output the array
        //What happens when you run the following code? Why is Arrays.toString necessary?

        Person[] people = new Person[3];
   //creates 3 people in array.
        people[0] = new Person("Mike");
        people[1] = new Person("John");
        people[2] = new Person("Nick");
        System.out.println(Arrays.toString(people));

        //print out the names
        for(int i = 0; i < people.length; i++) {
            //System.out.println("Name " + people[i].getName());
        }
        Person myPerson = new Person("Nicko");//method call
        Person[] array2 = ArraysExercises.addPerson(people, myPerson);

        for(Person addedPerson : array2){
            System.out.println(addedPerson.getName());
        }


   }
}
