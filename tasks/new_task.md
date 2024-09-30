# Working with Arrays and ArrayLists

This week delves into the powerful data structures of Java: `Arrays` and `ArrayLists`, teaching you how to handle collections efficiently and understand Java's `static` keyword.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Explore [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects) and answer all the questions.

### ✅ Learning Goals
This week's objectives are to understand and work proficiently with:

* `Arrays`
* The `static` keyword
* `ArrayLists`
* Combining loops and collections

### 🚨 Troubleshooting Guide
If you face difficulties, here’s your troubleshooting path:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues).
2. If unresolved, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title starting "Task *x*: *summary of problem here*".
3. Ask a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Engage with peers to understand concepts, but ensure your solutions are independently crafted. Leverage AI for clarification but submit original, human solutions.

### 🏛 Assignment
Harness the power of `Arrays` and `ArrayLists` to complete the following exercises. Through these tasks, you will also understand the utility of the `static` keyword.

<details>
<summary> 📚 Understanding Arrays </summary>

**Arrays** are fixed-size data structures that store data of the same type, providing fast access but limited flexibility. 

Example:

```java
public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println(setAverage(numbers)); // Outputs 2
    }

    public static int setAverage(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum / array.length;
    }
}
```

Learn more: [Arrays in Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

---
</details>

<details>
<summary> 📚 Dive into ArrayLists </summary>

**ArrayLists** offer dynamic arrays and are part of Java's Collections Framework. Unlike arrays, they can grow as needed.

Example:

```java
import java.util.ArrayList;

public class ArrayListsExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

Discover more: [ArrayLists in Java](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html)

---
</details>

<details>
<summary> 📚 Unpacking the static Keyword</summary>

The `static` keyword in Java marks methods or fields as belonging to the class itself rather than any object instance.

Example:

```java
public class StaticExample {
    private static int count = 0;

    public StaticExample() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
```

Explore the [static keyword](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html) further.

---
</details>

### 🖥️ Exercises

#### Exercise 1: Working with Arrays
Using your understanding of arrays, create a method to find the **minimum** and **maximum** values of an integer array.

```java
public static int[] findMinMax(int[] array)
```

#### Exercise 2: Fun with ArrayLists
Create a method that returns a list of prime numbers from a given `ArrayList` of integers.

```java
public static ArrayList<Integer> listPrimes(ArrayList<Integer> numbers)
```

#### Exercise 3: Understanding Static
Develop a class `Statistics` with static methods that calculate the mean and median of a numeric array.

```java
public class Statistics {
    public static double mean(int[] numbers) { /* ... */ }
    public static double median(int[] numbers) { /* ... */ }
}
```

#### Exercise 4: Loops and Collections Combined
Write a method that takes an `ArrayList` and an array of integers. Return an `ArrayList` containing only the elements that exist in both collections.

```java
public static ArrayList<Integer> intersectCollections(ArrayList<Integer> list, int[] array)
```

Test your understanding by combining loops and collections creatively. Use these exercises to explore and manipulate data structures, gaining deep insight into their workings and applications. Happy coding!