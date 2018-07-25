package Whiteboard12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FIFOAnimalShelterTest {

    @Test
    void adopt() {
        dogs.add(new Pet("snoop"));
        adopt("dog");
    }