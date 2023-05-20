package com.havefunwith.combinedExercices.exercise.dealership;

public class Util {

    public static void makingChanges(String expToBeChanged) {
        try {
            System.out.print("\nChanging " + expToBeChanged);
            com.havefunwith.globalUtil.Util.loading();
            System.out.println();
            System.out.println("===> " + expToBeChanged + " changed successfully.");
            System.out.println();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Something went wrong while making these changes :: CHANGING " + expToBeChanged.toUpperCase());
        }
    }

}