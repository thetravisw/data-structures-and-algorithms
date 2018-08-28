package OldStuff.Whiteboard12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FIFOAnimalShelterTest {

    @Test
    void adopt() {
        FIFOAnimalShelter.dogs.add(new Pet("snoop"));
        assertEquals("snoop", FIFOAnimalShelter.adopt("dog").name);
    }

    @Test
    void adopt2(){
        FIFOAnimalShelter.dogs.add(new Pet("snoop"));
        FIFOAnimalShelter.cats.add(new Pet("garfield"));
        FIFOAnimalShelter.dogs.add(new Pet("hot"));

        assertEquals("snoop",FIFOAnimalShelter.adopt().name);
    }

    @Test
    void adopt3(){
        assertEquals("error message", FIFOAnimalShelter.adopt().name);
        assertEquals("error message", FIFOAnimalShelter.adopt("dog").name);
        assertEquals("error message", FIFOAnimalShelter.adopt("cat").name);
    }
}