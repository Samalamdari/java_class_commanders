package week_5.day_1.topics;

public class OneDimensionArray {

    /*
    Real-life Example:

    Think of a row of lockers in a school corridor. Each locker is assigned a unique number,
    starting from 1, and students can store their items in them. To put an item into a locker,
    you need to open it using its specific number, place your items inside, and then close it.
    Similarly, to retrieve an item, you open the locker with its unique number and take out
     what's inside. In this scenario, the row of lockers is analogous to a 1D array, the unique
     locker number corresponds to the array index, and the items inside represent the data we store
     in the array.

    Programming Explanation:

    A 1D array in programming is a linear collection of elements that can be accessed by a unique
    index. You can populate (store) data in specific positions using this index and retrieve
    data in a similar manner.

    Firstly, you'll declare and initialize an array.

    int[] lockerContents = new int[10]; // A row of 10 lockers

    Now, you want to store items (in our case, integer values) inside.

    lockerContents[0] = 45;  // Storing the number 45 in the first locker
    lockerContents[1] = 32;  // Storing the number 32 in the second locker
// ... and so on.

    Accessing items from our locker (array) using the locker number (index) is straightforward.

    int firstLockerItem = lockerContents[0];  // Retrieving what's inside the first locker
    int secondLockerItem = lockerContents[1]; // Retrieving what's inside the second locker
// ... and so on.

    You can print or use these retrieved values as required:

    System.out.println("The first locker contains: " + firstLockerItem);

*/


}
