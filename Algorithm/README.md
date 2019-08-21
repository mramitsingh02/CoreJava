#Java Programs
####Java programs are frequently asked in the interview. These programs can be asked from control statements, array, string, oops etc. Let's see the list of java programs.
<br/>
<br/>

#####Java Sorting Programs
#####Java Searching Programs
#####Java Array Programs
#####Java Matrix Programs
#####Java String programs
#####Pattern programs
#####Singly Linked List Programs
#####Circular Linked List Programs
#####Doubly Linked List Programs
#####Tree Programs

####1) Fibonacci series
    Write a java program to print fibonacci series without using recursion and using recursion.
    Input: 10
    Output: 0 1 1 2 3 5 8 13 21 34
__Answer:__ Please find the Fibonacci Series Program in below file

    1.FibonacciSeries.java
    2.FibonacciSeriesOptimization.java
#####2) Prime number
    Write a java program to check prime number.
    Input: 44
    Output: not prime number
    Input: 7
    Output: prime number

__Answer:__ Please find the Prime Number Series Program

    1.CheckPrimeNumber.java
    2.PrimeNumberSeries.java
    3.PrimeNumberSeries2.java

#####3) Palindrome number
Write a java program to check palindrome number.

    Input: 329
    Output: not palindrome number
    Input: 12321
    Output: palindrome number
__Answer:__ Please find the Palindrome Program

    1.CheckPalindromeNumber.java
    2.CheckPalindromeNumberTest.java

#####4) Factorial number
Write a java program to print factorial of a number.
   
    Input: 5
    Output: 120
    Input: 6
    Output: 720
__Answer:__ Please find the Palindrome Program

    1.GenerateFactorialNumber.java
    2.GenerateFactorialNumberTest.java


#####5) Armstrong number
Write a java program to check Armstrong number.

    Input: 153
    Output: Armstrong number
    Input: 22
    Output: not Armstrong number

__Answer:__ Please find the Armstrong Number

    1.CheckArmstrongNumber.java
    2.CheckArmstrongNumberTest.java
 
##Java Sorting Programs
#####1) Bubble Sort
Write a java program to sort an array elements using bubble sort algorithm.
    
    Input: 18 9 33 4 84 32
    Output: 4 9 18 32 33 84

__Answer:__ Please find the Bubble Sort Algorithm

    1.BubbleSort.java
    2.BubbleSortTest.java
        
        Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
        Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
        
        Auxiliary Space: O(1)
        Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
        Sorting In Place: Yes
        Stable: Yes
        Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm.
        In computer graphics it is popular for its capability to detect a very small error (like swap of just two elements) in almost-sorted arrays and fix it with just linear complexity (2n). For example, it is used in a polygon filling algorithm, where bounding lines are sorted by their x coordinate at a specific scan line (a line parallel to x axis) and with incrementing y their order changes (two elements are swapped) only at intersections of two lines
#####2) Selection Sort
Write a java program to sort an array elements using selection sort algorithm.

    Input: 18 9 33 4 84 32
    Output: 4 9 18 32 33 84
__Answer:__ Please find the Selection Sort Algorithm

    1.SelectionSort.java
    2.SelectionSortTest.java

        Time Complexity: O(n2) as there are two nested loops.
        Auxiliary Space: O(1)
        The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
        
        Exercise : 
        Sort an array of strings using Selection Sort
        Stability : The default implementation is not stable. However it can be made stable. Please see stable selection sort for details.
        In Place : Yes, it does not require extra space.

#####3) Insertion Sort
Write a java program to sort an array elements using insertion sort algorithm.

    Input: 18 9 33 4 84 32
    Output: 4 9 18 32 33 84
__Answer:__ Please find the Insertion Sort Algorithm

    1.InsertionSort.java
    2.InsertionSortTest.java
        
        Time Complexity: O(n*2)
        Auxiliary Space: O(1)
        Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.
        Algorithmic Paradigm: Incremental Approach
        Sorting In Place: Yes
        Stable: Yes
        Online: Yes
        Uses: Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
        Q. What is Binary Insertion Sort?
        Q. We can use binary search to reduce the number of comparisons in normal insertion sort. Binary Insertion Sort uses binary search to find the proper location to insert the selected item at each iteration. In normal insertion, sorting takes O(i) (at ith iteration) in worst case. We can reduce it to O(logi) by using binary search. The algorithm, as a whole, still has a running worst case running time of O(n2) because of the series of swaps required for each insertion. Refer this for implementation.
        Q. How to implement Insertion Sort for Linked List?
        Q. Below is simple insertion sort algorithm for linked list.

#####4) Merge Sort
Write a java program to sort an array elements using merge sort algorithm.

    Input: 18 9 33 4 84 32
    Output: 4 9 18 32 33 84
__Answer:__ Please find the Merge Sort Algorithm

    1.MergeSort.java
    2.MergeSortTest.java

        Time Complexity: Sorting arrays on different machines. Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.
        T(n) = 2T(n/2) + \Theta(n)
        The above recurrence can be solved either using Recurrence Tree method or Master method. It falls in case II of Master Method and solution of the recurrence is \Theta(nLogn).
        Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and take linear time to merge two halves.
        Auxiliary Space: O(n)
        Algorithmic Paradigm: Divide and Conquer
        Sorting In Place: No in a typical implementation
        Stable: Yes
        Applications of Merge Sort
        
        Merge Sort is useful for sorting linked lists in O(nLogn) time.In the case of linked lists, the case is different mainly due to the difference in memory allocation of arrays and linked lists. Unlike arrays, linked list nodes may not be adjacent in memory. Unlike an array, in the linked list, we can insert items in the middle in O(1) extra space and O(1) time. Therefore merge operation of merge sort can be implemented without extra space for linked lists.
        In arrays, we can do random access as elements are contiguous in memory. Let us say we have an integer (4-byte) array A and let the address of A[0] be x then to access A[i], we can directly access the memory at (x + i*4). Unlike arrays, we can not do random access in the linked list. Quick Sort requires a lot of this kind of access. In linked list to access i’th index, we have to travel each and every node from the head to i’th node as we don’t have a continuous block of memory. Therefore, the overhead increases for quicksort. Merge sort accesses data sequentially and the need of random access is low.
        
        Inversion Count Problem
        Used in External Sorting
         

#####4) Heap Sort
Write a java program to sort an array elements using heap sort algorithm.

    Input: 18 9 33 4 84 32
    Output: 4 9 18 32 33 84
__Answer:__ Please find the Heap Sort Algorithm

    1.HeapSort.java
    2.HeapSortTest.java
    
        Notes:
        Heap sort is an in-place algorithm.
        Its typical implementation is not stable, but can be made stable (See this)
        
        Time Complexity: Time complexity of heapify is O(Logn). 
        Time complexity of createAndBuildHeap() is O(n) and overall time complexity of Heap Sort is O(nLogn).
        
        Applications of HeapSort
        1. Sort a nearly sorted (or K sorted) array
        2. k largest(or smallest) elements in an array
        
        Heap sort algorithm has limited uses because Quicksort and Mergesort are better in practice. 
        Nevertheless, the Heap data structure itself is enormously used. 
        See Applications of Heap Data Structure

#####4) Quick Sort
Write a java program to sort an array elements using quick sort algorithm.

    Input: 18 9 33 4 84 32
    Output: 4 9 18 32 33 84
__Answer:__ Please find the Quick Sort Algorithm

    1.QuickSort.java
    2.QuickSortTest.java
        Analysis of QuickSort

        Time taken by QuickSort in general can be written as following.
        
         T(n) = T(k) + T(n-k-1) + \theta(n)
        The first two terms are for two recursive calls, the last term is for the partition process. k is the number of elements which are smaller than pivot.
        The time taken by QuickSort depends upon the input array and partition strategy. Following are three cases.
        
        Worst Case: The worst case occurs when the partition process always picks greatest or smallest element as pivot. If we consider above partition strategy where last element is always picked as pivot, the worst case would occur when the array is already sorted in increasing or decreasing order. Following is recurrence for worst case.
        
         T(n) = T(0) + T(n-1) + \theta(n)
        which is equivalent to  
         T(n) = T(n-1) + \theta(n)
        The solution of above recurrence is \theta(n2).
        
        Best Case: The best case occurs when the partition process always picks the middle element as pivot. Following is recurrence for best case.
        
         T(n) = 2T(n/2) + \theta(n)
        The solution of above recurrence is \theta(nLogn). It can be solved using case 2 of Master Theorem.
        
        Average Case:
        To do average case analysis, we need to consider all possible permutation of array and calculate time taken by every permutation which doesn’t look easy.
        We can get an idea of average case by considering the case when partition puts O(n/9) elements in one set and O(9n/10) elements in other set. Following is recurrence for this case.
        
         T(n) = T(n/9) + T(9n/10) + \theta(n)
        Solution of above recurrence is also O(nLogn)
        
        Although the worst case time complexity of QuickSort is O(n2) which is more than many other sorting algorithms like Merge Sort and Heap Sort, QuickSort is faster in practice, because its inner loop can be efficiently implemented on most architectures, and in most real-world data. QuickSort can be implemented in different ways by changing the choice of pivot, so that the worst case rarely occurs for a given type of data. However, merge sort is generally considered better when data is huge and stored in external storage.
        
        Is QuickSort stable?
        The default implementation is not stable. However any sorting algorithm can be made stable by considering indexes as comparison parameter.
        Is QuickSort In-place?
        As per the broad definition of in-place algorithm it qualifies as an in-place sorting algorithm as it uses extra space only for storing recursive function calls but not for manipulating the input.
        
        
        
         
        
        What is 3-Way QuickSort?
        In simple QuickSort algorithm, we select an element as pivot, partition the array around pivot and recur for subarrays on left and right of pivot.
        Consider an array which has many redundant elements. For example, {1, 4, 2, 4, 2, 4, 1, 2, 4, 1, 2, 2, 2, 2, 4, 1, 4, 4, 4}. If 4 is picked as pivot in Simple QuickSort, we fix only one 4 and recursively process remaining occurrences. In 3 Way QuickSort, an array arr[l..r] is divided in 3 parts:
        a) arr[l..i] elements less than pivot.
        b) arr[i+1..j-1] elements equal to pivot.
        c) arr[j..r] elements greater than pivot.
        See this for implementation.
        
        How to implement QuickSort for Linked Lists?
        QuickSort on Singly Linked List
        QuickSort on Doubly Linked List
        
        Can we implement QuickSort Iteratively?
        Yes, please refer Iterative Quick Sort.
        
        Why Quick Sort is preferred over MergeSort for sorting Arrays
        Quick Sort in its general form is an in-place sort (i.e. it doesn’t require any extra storage) whereas merge sort requires O(N) extra storage, N denoting the array size which may be quite expensive. Allocating and de-allocating the extra space used for merge sort increases the running time of the algorithm. Comparing average complexity we find that both type of sorts have O(NlogN) average complexity but the constants differ. For arrays, merge sort loses due to the use of extra O(N) storage space.
        
        Most practical implementations of Quick Sort use randomized version. The randomized version has expected time complexity of O(nLogn). The worst case is possible in randomized version also, but worst case doesn’t occur for a particular pattern (like sorted array) and randomized Quick Sort works well in practice.
        
        Quick Sort is also a cache friendly sorting algorithm as it has good locality of reference when used for arrays.
        
        Quick Sort is also tail recursive, therefore tail call optimizations is done.
        
        Why MergeSort is preferred over QuickSort for Linked Lists?
        In case of linked lists the case is different mainly due to difference in memory allocation of arrays and linked lists. Unlike arrays, linked list nodes may not be adjacent in memory. Unlike array, in linked list, we can insert items in the middle in O(1) extra space and O(1) time. Therefore merge operation of merge sort can be implemented without extra space for linked lists.
        
        In arrays, we can do random access as elements are continuous in memory. Let us say we have an integer (4-byte) array A and let the address of A[0] be x then to access A[i], we can directly access the memory at (x + i*4). Unlike arrays, we can not do random access in linked list. Quick Sort requires a lot of this kind of access. In linked list to access i’th index, we have to travel each and every node from the head to i’th node as we don’t have continuous block of memory. Therefore, the overhead increases for quick sort. Merge sort accesses data sequentially and the need of random access is low.
        
        How to optimize QuickSort so that it takes O(Log n) extra space in worst case?
        Please see QuickSort Tail Call Optimization (Reducing worst case space to Log n )
    
     

    
#####QuickSort
#####Radix Sort
#####Counting Sort
#####Bucket Sort
#####ShellSort



##Java Searching Programs

#####1) Linear Search
Write a java program to perform linear search in java.

    Input: 18 9 33 4 84 32 
    Search Item: 9
    Output: Item Found
    Search Item: 11
    Output: Item Not Found
    
__Answer:__ Please find the Linear Search Algorithm

    1.LinearSearch.java
    2.LinearSearchTest.java


#####2) Binary Search
Write a java program to perform binary search in java.

    Input: 18 9 33 4 84 32 
    Search Item: 9
    Output: Item Found
    Search Item: 11
    Output: Item Not Found
    
__Answer:__ Please find the Binary Search Algorithm

    1.BinarySearch.java
    2.BinarySearchTest.java

##Java Array Programs
#####1) Java Program to copy all elements of one array into another array
__Answer:__ Please find Algorithm

    1.CopyArrayToAnotherArray.java
    2.CopyArrayToAnotherArrayTest.java

#####2) Java Program to find the frequency of each element in the array
__Answer:__ Please find Algorithm

    1.FindElementInArray.java
    2.FindElementInArrayTest.java



#####3) Java Program to left rotate the elements of an array
#####4) Java Program to print the duplicate elements of an array
#####5) Java Program to print the elements of an array
#####6) Java Program to print the elements of an array in reverse order
#####7) Java Program to print the elements of an array present on even position
#####8) Java Program to print the elements of an array present on odd position
#####9) Java Program to print the largest element in an array
#####10) Java Program to print the smallest element in an array
#####11) Java Program to print the number of elements present in an array
#####12) Java Program to print the sum of all the items of the array
#####13) Java Program to right rotate the elements of an array
#####14) Java Program to sort the elements of an array in ascending order
#####15) Java Program to sort the elements of an array in descending order

#####16) Find 3rd Largest Number in an Array
Write a java program to find 3rd largest number in an array.
    Input: 9, 13, 3, 2, 7, 5, 11, 3, 5, 9
    Output: 9

__Answer:__ Please find Algorithm


    1.Find3rdLargestNumber.java
    2.FindNthLargestNumber.java
    2.Find3rdLargestNumberTest.java

#####17) Find 2nd Largest Number in an Array
   Write a java program to find 2nd largest number in an array.
    
    Input: 1,2,5,6,3,2
    Output: 5

__Answer:__ Please find Algorithm

    1.FindNthNumber.java


#####18) Find Largest Number in an Array
Write a java program to find largest number in an array.

Input: 1,2,5,6,3,2
Output: 6

__Answer:__ Please find Algorithm

    int maxNumber = Arrays.stream(elements).max().getAsInt();


#####19) Find 2nd Smallest Number in an Array
Write a java program to find 2nd smallest number in an array.
    
    Input: 1,2,5,6,3,2
    Output: 2

__Answer:__ Please find Algorithm

    1.FindNthNumber.java

#####20) Find Smallest Number in an Array
Write a java program to find smallest number in an array.
    
    Input: 1,2,5,6,3,2
    Output: 1
__Answer:__ Please find Algorithm

     int minNumber = Arrays.stream(elements).min().getAsInt();

#####21) Remove Duplicate Element in an Array
Write a java program to remove duplicate element in an array.

    Input: 10,20,20,30,30,40,50,50
    Output: 10 20 30 40 50
__Answer:__ Please find Algorithm

    1.RemoveDuplicateNumber.java


#####22) Add Two Matrices
Write a java program to add two matrices.

    Input:
    First matrix elements:
    1 1 1
    2 2 2
    3 3 3
    Second matrix elements:
    1 1 1
    2 2 2
    3 3 3
    
    Output:
    Addition of the matrix:
    2 2 2
    4 4 4
    6 6 6
######23) Multiply Two Matrices
Write a java program to multiply two matrices.
    
    Input:
    
    First matrix elements:
    1 1 1
    2 2 2
    3 3 3
    Second matrix elements:
    1 1 1
    2 2 2
    3 3 3
    Output:
    
    Multiplication of the matrix:
    6 6 6
    12 12 12
    18 18 18
#####24) Print Odd and Even Number from an Array
Write a java program to print odd and even number from an array.

    Input: 1,2,5,6,3,2
    Output:
    Odd Numbers:
    1
    5
    3
    Even Numbers:
    2
    6
    2
#####25) Transpose matrix
Write a java program to transpose a matrix.
    
    Output:
    
    Printing Matrix without transpose:
    1 3 4 
    2 4 3 
    3 4 5 
    Printing Matrix After Transpose:
    1 2 3 
    3 4 4 
    4 3 5 
##Java Matrix Programs
Java Matrix Programs
2) Java Program to subtract the two matrices
3) Java Program to determine whether a given matrix is an identity matrix
4) Java Program to determine whether a given matrix is a sparse matrix
5) Java Program to determine whether two matrices are equal
6) Java Program to display the lower triangular matrix
7) Java Program to display the upper triangular matrix
8) Java Program to find the frequency of odd & even numbers in the given matrix
9) Java Program to find the product of two matrices
10) Java Program to find the sum of each row and each column of a matrix
11) Java Program to find the transpose of a given matrix
Java String programs
1) Java Program to count the total number of characters in a string
2) Java Program to count the total number of characters in a string 2
3) Java Program to count the total number of punctuation characters exists in a String
4) Java Program to count the total number of vowels and consonants in a string
5) Java Program to determine whether two strings are the anagram
6) Java Program to divide a string in 'N' equal parts.
7) Java Program to find all subsets of a string
8) Java Program to find the longest repeating sequence in a string
9) Java Program to find all the permutations of a string
10) Java Program to remove all the white spaces from a string
11) Java Program to replace lower-case characters with upper-case and vice-versa
12) Java Program to replace the spaces of a string with a specific character
13) Java Program to determine whether a given string is palindrome
14) Java Program to determine whether one string is a rotation of another
15) Java Program to find maximum and minimum occurring character in a string
16) Java Program to find Reverse of the string
17) Java program to find the duplicate characters in a string
18) Java program to find the duplicate words in a string
19) Java Program to find the frequency of characters
20) Java Program to find the largest and smallest word in a string
21) Java Program to find the most repeated word in a text file
22) Java Program to find the number of the words in the given text file
23) Java Program to separate the Individual Characters from a String
24) Java Program to swap two string variables without using third or temp variable.
25) Java Program to print smallest and biggest possible palindrome word in a given string
Java Pattern programs
1) Java Program to count the total number of punctuation characters exists in a String
2) Java program to print the following pattern
3) Java program to print the following pattern 2
4) Java program to print the following pattern 3
5) Java program to print the following pattern 4
6) Java program to print the following pattern 5
7) Java program to print the following pattern on the console
8) Java program to print the following pattern on the console 2
9) Java program to print the following pattern on the console 3
10) Java program to print the following pattern on the console 4
11) Java program to print the following pattern on the console 5
12) Java program to print the following pattern on the console 6
13) Java program to print the following pattern on the console 7
14) Java program to print the following pattern on the console 8
15) Java program to print the following pattern on the console 9
16) Java program to print the following pattern on the console 10
17) Java program to print the following pattern on the console 11
18) Java program to print the following pattern on the console 12
19) Java program to print the following spiral pattern on the console
Java Singly Linked List Programs
1) Singly linked list Examples in Java
2) Java Program to create and display a singly linked list
3) Java program to create a singly linked list of n nodes and count the number of nodes
4) Java program to create a singly linked list of n nodes and display it in reverse order
5) Java program to delete a node from the beginning of the singly linked list
6) Java program to delete a node from the middle of the singly linked list
7) Java program to delete a node from the end of the singly linked list
8) Java program to determine whether a singly linked list is the palindrome
9) Java program to find the maximum and minimum value node from a linked list
10) Java Program to insert a new node at the middle of the singly linked list
11) Java program to insert a new node at the beginning of the singly linked list
12) Java program to insert a new node at the end of the singly linked list
13) Java program to remove duplicate elements from a singly linked list
14) Java Program to search an element in a singly linked list
Java Circular Linked List Programs
1) Java program to create and display a Circular Linked List
2) Java program to create a Circular Linked List of N nodes and count the number of nodes
3) Java program to create a Circular Linked List of n nodes and display it in reverse order
4) Java program to delete a node from the beginning of the Circular Linked List
5) Java program to delete a node from the end of the Circular Linked List
6) Java program to delete a node from the middle of the Circular Linked List
7) Java program to find the maximum and minimum value node from a circular linked list
8) Java program to insert a new node at the beginning of the Circular Linked List
9) Java program to insert a new node at the end of the Circular Linked List
10) Java program to insert a new node at the middle of the Circular Linked List
11) Java program to remove duplicate elements from a Circular Linked List
12) Java program to search an element in a Circular Linked List
13) Java program to sort the elements of the Circular Linked List
Java Doubly Linked List Programs
1) Java program to convert a given binary tree to doubly linked list
2) Java program to create a doubly linked list from a ternary tree
3) Java program to create a doubly linked list of n nodes and count the number of nodes
4) Java program to create a doubly linked list of n nodes and display it in reverse order
5) Java program to create and display a doubly linked list
6) Java program to delete a new node from the beginning of the doubly linked list
7) Java program to delete a new node from the end of the doubly linked list
8) Java program to delete a new node from the middle of the doubly linked list
9) Java program to find the maximum and minimum value node from a doubly linked list
10) Java program to insert a new node at the beginning of the Doubly Linked list
10) Java program to insert a new node at the end of the Doubly Linked List
12) Java program to insert a new node at the middle of the Doubly Linked List
13) Java program to remove duplicate elements from a Doubly Linked List
14) Java program to rotate doubly linked list by N nodes
15) Java program to search an element in a doubly linked list
16) Java program to sort the elements of the doubly linked list
Java Tree Programs
1) Java Program to calculate the Difference between the Sum of the Odd Level and the Even Level Nodes of a Binary Tree
2) Java program to construct a Binary Search Tree and perform deletion and In-order traversal
3) Java program to convert Binary Tree to Binary Search Tree
4) Java program to determine whether all leaves are at same level
5) Java program to determine whether two trees are identical
6) Java program to find maximum width of a binary tree
7) Java program to find the largest element in a Binary Tree
8) Java program to find the maximum depth or height of a tree
9) Java program to find the nodes which are at the maximum distance in a Binary Tree
10) Java program to find the smallest element in a tree
11) Java program to find the sum of all the nodes of a binary tree
12) Java program to find the total number of possible Binary Search Trees with N keys
13) Java program to implement Binary Tree using the Linked List
14) Java program to search a node in a Binary Tree