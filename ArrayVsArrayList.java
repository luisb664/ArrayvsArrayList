package ArrayVsArrayList;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args)
    {
        //Array example
        String[] holidaysArray = new String[3]; // Fixed size
        holidaysArray[0] = "New Year's Day";
        holidaysArray[1] = "Memorial Day";
        holidaysArray[2] = "Thanksgiving Day";

        System.out.println("Using Array:");
        for (int i = 0; i < holidaysArray.length; i++)
        {
            System.out.println(holidaysArray[i]);
        }


        // Array List example
        ArrayList<String> holidaysList = new ArrayList<>(); // Not fixed in size
        holidaysList.add("New Year's Day");
        holidaysList.add("Memorial Day");
        holidaysList.add("Thanksgiving");
        holidaysList.add("Christmas Day");

        System.out.println("\nUsing ArrayList:"); // Printing out list unchanged
        for (int i = 0; i < holidaysList.size(); i++)
        {
            System.out.println(holidaysList.get(i));
        }

        // Removing from Array list to show how it can change
        holidaysList.remove("Thanksgiving");
        System.out.println("\nAfter removing 'Thanksgiving' from ArrayList:");
        for (String holiday : holidaysList)
        {
            System.out.println(holiday);
        }
    }
}
