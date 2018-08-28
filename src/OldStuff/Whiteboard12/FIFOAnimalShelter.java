package OldStuff.Whiteboard12;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOAnimalShelter{

    static Queue<Pet> dogs = new LinkedList<>();
    static Queue<Pet> cats = new LinkedList<>();

    public static Pet adopt () {
        Pet dog = dogs.peek();
        Pet cat = cats.peek();

        if (dog == null && cat == null){
            return new Pet("error message");
        } else if (cat == null){
            dogs.remove();
            return dog;
        }
        else if (dog == null){
            cats.remove();
            return cat;
        } else if (dog.added.isBefore(cat.added)){
            dogs.remove();
            return dog;
        }
        else{
            cats.remove();
            return cat;
        }

    }

    public static Pet adopt (String animal) {
        if (animal.toLowerCase() == "cat" && !cats.isEmpty())
        {
            return cats.remove();
        }
        if (animal.toLowerCase() == "dog" && !dogs.isEmpty())
        {
            return dogs.remove();
        }
        return new Pet("error message");
    }
}