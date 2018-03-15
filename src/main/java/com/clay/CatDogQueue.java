package com.clay;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * CatDogQueue
 */
public class CatDogQueue {

    private Queue<PetCount> catQueue;

    private Queue<PetCount> dogQueue;

    public CatDogQueue() {
        this.catQueue = new LinkedBlockingQueue<PetCount>();
        this.dogQueue = new LinkedBlockingQueue<PetCount>();
    }

    public void add(Pet pet) {
        if (pet.getType().equals("dog")) {
            dogQueue.add(new PetCount(System.currentTimeMillis(), pet));
        }
        else if (pet.getType().equals("cat")) {
            catQueue.add(new PetCount(System.currentTimeMillis(), pet));
        }
    }

    public Pet pollAll() {
        if (dogQueue.isEmpty() && catQueue.isEmpty()) {
            throw new RuntimeException();
        }
        else if (dogQueue.isEmpty()) {
            return catQueue.poll().getPet();
        }
        else if (catQueue.isEmpty()) {
            return dogQueue.poll().getPet();
        }
        else {
            long catTime = catQueue.peek().getTime();
            long dogTime = dogQueue.peek().getTime();
            if (catTime < dogTime) {
                return catQueue.poll().getPet();
            }
            else {
                return dogQueue.poll().getPet();
            }
        }
    }
    
    public Pet pollDog() {
        if (dogQueue.isEmpty()) {
            throw new RuntimeException();
        }
        return dogQueue.poll().getPet();
    }

    public Pet pollCat() {
        if (catQueue.isEmpty()) {
            throw new RuntimeException();
        }
        return catQueue.poll().getPet();
    }

    public boolean isEmpty() {
        return catQueue.isEmpty() && dogQueue.isEmpty();
    }

    public boolean isDogEmpty() {
        return dogQueue.isEmpty();
    }

    public boolean isCatEmpty() {
        return catQueue.isEmpty();
    }



    
    public class PetCount {

        private long time;

        private Pet pet;

        public PetCount(long time, Pet pet) {
            this.time = time;
            this.pet = pet;
        }

        public Pet getPet() {
            return this.pet;
        }

        public String getPetType() {
            return this.pet.getType();
        }

        public long getTime() {
            return this.time;
        }
    }
    /**
     * Pet
     */
    public class Pet {
        private String type;

        public Pet(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }
    }

    /**
     * Dog
     */
    public class Dog extends Pet {
        public Dog() {
            super("dog");
        }
    }

    /**
     * Cat
     */
    public class Cat extends Pet {
        public Cat() {
            super("cat");
        }
    }
}