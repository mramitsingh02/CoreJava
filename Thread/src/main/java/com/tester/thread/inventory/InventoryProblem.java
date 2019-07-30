package com.tester.thread.inventory;

import com.tester.thread.utils.ThreadUtils;

import java.util.stream.IntStream;

public class InventoryProblem {


    public static void main(String[] args) throws InterruptedException {

        Inventory inventory = new Inventory();

        Thread addToInvertoryThread = new Thread(new AddToInventory(inventory));
        Thread deleteFormInvertoryThread = new Thread(new DeleteFromInventory(inventory));

        addToInvertoryThread.start();
        deleteFormInvertoryThread.start();

        deleteFormInvertoryThread.join();
        inventory.showItems();



    }

    public static class Inventory {
        private int item;

        public  void increment() {
            item++;
        }

        public void decrement() {
            item--;

        }


        public void showItems() {
            System.out.println("Total Items : " + item);
        }
    }


    public static class AddToInventory implements Runnable {
        public final Inventory inventory;

        public AddToInventory(Inventory inventory) {
            this.inventory = inventory;
        }

        @Override
        public void run() {

            IntStream.range(1,101).forEach(( x )-> {
                inventory.increment();
                ThreadUtils.ONE_MICRO_SECOND.sleep();
            });
            System.out.printf("Inventory added\n");

        }

    }

    public static class DeleteFromInventory implements Runnable {
        public final Inventory inventory;

        public DeleteFromInventory(Inventory inventory) {
            this.inventory = inventory;
        }

        @Override
        public void run() {
            IntStream.range(1, 101).forEach((x) -> {
                inventory.decrement();
                ThreadUtils.ONE_MICRO_SECOND.sleep();
            });
            System.out.printf("Inventory deleting\n");

        }

    }


}
