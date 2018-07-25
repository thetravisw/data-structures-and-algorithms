package Whiteboard12;


import java.time.LocalDateTime;

class Pet {
    public static void main(String[] args) {
    }

    public String name;
    public LocalDateTime added;

    public Pet(String name) {
        this.name = name;
        this.added=LocalDateTime.now();
    }
}