https://www.geeksforgeeks.org/array-data-structure/


The above image can be looked as a top-level view of a staircase where you are at the base of the staircase. Each element can be uniquely identified by their index in the array (in a similar way as you could identify your friends by the step on which they were on in the above example).

##Topics :

####Introduction 
####Array Rotations 
####Arrangement Rearrangement 
####Order Statistics 
####Range Queries 
####Searching and Sorting 
####Optimization Problems 
####Matrix 
####Misc 
####Quick Links 
####Array Introduction : 

##Introduction to Arrays:
#####Arrays in C/C++
#####Arrays in Java
#####Arrays in Python
#####Array Rotations :


<br/>
<br/>
<br/>
<br/>
 

#####1) Program for array rotation

     Input : [18, 9, 33, 4, 84, 32, 96, 12, 11, 5, 122, 100]
    Output : [5, 122, 100, 18, 9, 33, 4, 84, 32, 96, 12, 11]
__Answer:__ Find the Algorithm for array rotation

     1.  ArrayRotation.java (rotate(int[] elements, int byPositions))
    
#####2) Reversal algorithm for array rotation
Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
    
    Example :
    Input :  arr[] = [1, 2, 3, 4, 5, 6, 7]
             d = 2
    Output : arr[] = [3, 4, 5, 6, 7, 1, 2] 
__Answer:__ Find the Algorithm for array rotation
    
    ArrayRotationByRotateStage thisInstance = new ArrayRotationByRotateStage();
            int[] elements = SortUtils.oneToSeven;
            int byPositions = 2;
            SortUtils.print("Input :", elements);
            thisInstance.rotate(elements, byPositions, RotateStage.LEFT);
            SortUtils.print("Output :", elements);
    
    
#####3) Block swap algorithm for array rotation
#####4) Program to cyclically rotate an array by one

     Input : [18, 9, 33, 4, 84, 32, 96, 12, 11, 5, 122, 100]
    Output : [5, 122, 100, 18, 9, 33, 4, 84, 32, 96, 12, 11]
__Answer:__ Find the Algorithm for array rotation

     1.  ArrayRotation.java (rotate(int[] elements))
    
#####5) Search an element in a sorted and rotated array
    Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
             key = 3
    Output : Found at index 8
    
    Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
             key = 30
    Output : Not found
    
    Input : arr[] = {30, 40, 50, 10, 20}
            key = 10   
    Output : Found at index 3
__Answer:__ Find the Algorithm for Search an element in a sorted and rotated array

     1.  PivotedSearch.java (rotate(int[] elements))

#####6) Given a sorted and rotated array, find if there is a pair with a given sum
    Examples :
    
    Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
    Output: true
    There is a pair (6, 10) with sum 16
    
    Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
    Output: true
    There is a pair (26, 9) with sum 35
    
    Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
    Output: false
    There is no pair with sum 45.
    
    
    
#####7) Find maximum value of Sum( i*ar r[i]) with only rotations on given array allowed
    Input: arr[] = {1, 20, 2, 10}
    Output: 72
    We can 72 by rotating array twice.
    {2, 10, 1, 20}
    20*3 + 1*2 + 10*1 + 2*0 = 72
    
    Input: arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Output: 330
    We can 330 by rotating array 9 times.
    {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    0*1 + 1*2 + 2*3 ... 9*10 = 330

__Answer:__ Find the Algorithm

     1.  FindMaximumValueOfSum.java
     2.  FindMaximumValueOfSumTest.java


#####8) Maximum sum of i*arr[i] among all rotations of a given array
    Input : arr[] = {8, 3, 1, 2}
    Output : 29
    Explanation : Let us see all rotations
    {8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
    {3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
    {1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
    {2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*1 = 17
    
    Input : arr[] = {3, 2, 1}
    Output : 7
__Answer:__ Find the Algorithm

     1.  FindMaximumOfSumValueForAllRotation.java
     2.  FindMaximumOfSumValueForAllRotationTest.java



#####9) Find the Rotation Count in Rotated Sorted array
    Input : arr[] = {15, 18, 2, 3, 6, 12}
    Output: 2
    Explanation : Initial array must be {2, 3,
    6, 12, 15, 18}. We get the given array after 
    rotating the initial array twice.
    
    Input : arr[] = {7, 9, 11, 12, 5}
    Output: 4
    
    Input: arr[] = {7, 9, 11, 12, 15};
    Output: 0

__Answer:__ Find the Algorithm.

    1. FindRotationCount.java
    2. FindRotationCountTest.java
    
    
#####10) Quickly find multiple left rotations of an array
    Input : arr[] = {1, 3, 5, 7, 9}
            k1 = 1
            k2 = 3
            k3 = 4
            k4 = 6
    Output : 3 5 7 9 1
             7 9 1 3 5
             9 1 3 5 7
             3 5 7 9 1
    
    Input : arr[] = {1, 3, 5, 7, 9}
            k1 = 14 
    Output : 9 1 3 5 7
    

__Answer:__ Find the Algorithm.

    1. QuickFindLeftRotation.java
    2. QuickFindLeftRotation2.java
        
#####11) Find the minimum element in a sorted and rotated array
    Input: {5, 6, 1, 2, 3, 4}
    Output: 1
    
    Input: {1, 2, 3, 4}
    Output: 1
    
    Input: {2, 1}
    Output: 1
    
__Answer:__ Find the Algorithm.
    
        1. FindTheMinimumElementInArray.java
        2. FindTheMinimumElementInArrayTest.java
    
#####12) Reversal algorithm for right rotation of an array
    Input: arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
              k = 3
    Output: 8 9 10 1 2 3 4 5 6 7
    
    Input: arr[] = {121, 232, 33, 43 ,5}
               k = 2
    Output: 43 5 121 232 33
    
__Answer:__ Find the Algorithm.
    
        1. FindTheMinimumElementInArray.java
        2. FindTheMinimumElementInArrayTest.java
    

#####13) Find a rotation with maximum hamming distance
    Input :  1 4 1
    Output :  2
    Explanation:  
    Maximum hamming distance = 2.
    We get this hamming distance with 4 1 1 
    or 1 1 4 
    
    input :  N = 4
             2 4 8 0
    output :  4
    Explanation: 
    Maximum hamming distance = 4
    We get this hamming distance with 4 8 0 2.
    All the places can be occupied by another digit.
    Other solutions can be 8 0 2 4, 4 0 2 8 etc.
    
    
    
#####14) Queries on Left and Right Circular shift on array
    Input : n = 5, arr[] = { 1, 2, 3, 4, 5 }
            query 1 = { 1, 3 }
            query 2 = { 3, 0, 2 }
            query 3 = { 2, 1 }
            query 4 = { 3, 1, 4 }
    Output : 12
             11
    Initial array arr[] = { 1, 2, 3, 4, 5 }
    After query 1, arr[] = { 3, 4, 5, 1, 2 }.
    After query 2, sum from index 0 to index 
                   2 is 12, so output 12.
    After query 3, arr[] = { 4, 5, 1, 2, 3 }.
    After query 4, sum from index 1 to index 
                   4 is 11, so output 11.
#####15) Print left rotation of array in O(n) time and O(1) space
    Input : arr[] = {1, 3, 5, 7, 9}
            k1 = 1
            k2 = 3
            k3 = 4
            k4 = 6
    Output : 3 5 7 9 1
             7 9 1 3 5
             9 1 3 5 7
             3 5 7 9 1
    
    Input : arr[] = {1, 3, 5, 7, 9}
            k1 = 14 
    Output : 9 1 3 5 7
#####16) Find element at given index after a number of rotations
    Input : arr[] : {1, 2, 3, 4, 5}
            ranges[] = { {0, 2}, {0, 3} }
            index : 1
    Output : 3
    Explanation : After first given rotation {0, 2}
                    arr[] = {3, 1, 2, 4, 5}
                  After second rotation {0, 3} 
                    arr[] = {4, 3, 1, 2, 5}
    After all rotations we have element 3 at given
    index 1. 
#####17) Split the array and add the first part to the end
    Input : arr[] = {12, 10, 5, 6, 52, 36}
                k = 2
    Output : arr[] = {5, 6, 52, 36, 12, 10}
    Explanation : Split from index 2 and first 
    part {12, 10} add to the end .
    
    Input : arr[] = {3, 1, 2}
               k = 1
    Output : arr[] = {1, 2, 3}
    Explanation : Split from index 1 and first
    part add to the end.


##Arrangement Rearrangement :

#####1) Rearrange an array such that arr[i] = i
#####2) Write a program to reverse an array or string
#####3) Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
#####1) Rearrange positive and negative numbers in O(n) time and O(1) extra space
#####1) Rearrange array in alternating positive & negative items with O(1) extra space | Set 1
#####1) Move all zeroes to end of array
#####1) Move all zeroes to end of array | Set-2 (Using single traversal)
#####1) Minimum swaps required to bring all elements less than or equal to k together
#####1) Rearrange positive and negative numbers using inbuilt sort function
#####1) Rearrange array such that even positioned are greater than odd
#####1) Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..
#####1) Double the first element and move zero to end
#####1) Reorder an array according to given indexes
#####1) Rearrange positive and negative numbers with constant extra space
#####1) Arrange given numbers to form the biggest number
#####1) Rearrange an array such that ‘arr[j]’ becomes ‘i’ if ‘arr[i]’ is ‘j’
#####1) Rearrange an array in maximum minimum form | Set 1
#####1) Rearrange an array in maximum minimum form | Set 2 (O(1) extra space)
#####1) Move all negative numbers to beginning and positive to end with constant extra space
#####1) Move all negative elements to end in order with extra space allowed
#####1) Rearrange array such that even index elements are smaller and odd index elements are greater
#####1) Positive elements at even and negative at odd positions
#####1) Replace every array element by multiplication of previous and next
#####1) Shuffle a given array
#####1) Segregate even and odd numbers
More >>

##Order Statistics :

#####1) K’th Smallest/Largest Element in Unsorted Array | Set 1
#####1) K’th Smallest/Largest Element in Unsorted Array | Set 2 (Expected Linear Time)
#####1) K’th Smallest/Largest Element in Unsorted Array | Set 3 (Worst Case Linear Time)
#####1) K’th Smallest/Largest Element using STL
#####1) k largest(or smallest) elements in an array | added Min Heap method
#####1) Kth smallest element in a row-wise and column-wise sorted 2D array | Set 1
#####1) Program to find largest element in an array
#####1) Find the largest three elements in an array
#####1) Find all elements in array which have at-least two greater elements
#####1) Program for Mean and median of an unsorted array
#####1) Median of Stream of Running Integers using STL
#####1) Minimum product of k integers in an array of positive Integers
#####1) K-th Largest Sum Contiguous Subarray
#####1) K maximum sum combinations from two arrays
#####1) K maximum sums of overlapping contiguous sub-arrays
#####1) K maximum sums of non-overlapping contiguous sub-arrays
#####1) k smallest elements in same order using O(1) extra space
#####1) Find k pairs with smallest sums in two arrays
#####1) k-th smallest absolute difference of two elements in an array
#####1) Find Second largest element in an array
#####1) Find k numbers with most occurrences in the given array
#####1) Find the smallest and second smallest elements in an array
#####1) Find the smallest missing number
#####1) Maximum sum such that no two elements are adjacent
#####1) Maximum and minimum of an array using minimum number of comparisons
More >>

##Range Queries :

#####1) MO’s Algorithm
#####1) Sqrt (or Square Root) Decomposition Technique | Set 1 (Introduction)
#####1) Sparse Table
#####1) Range sum query using Sparse Table
#####1) Range Minimum Query (Square Root Decomposition and Sparse Table)
#####1) Range Queries for Frequencies of array elements
#####1) Constant time range add operation on an array
#####1) Range LCM Queries
#####1) GCDs of given index ranges in an array
#####1) Queries for GCD of all numbers of an array except elements in a given range
#####1) Number of elements less than or equal to a given number in a given subarray
#####1) Number of elements less than or equal to a given number in a given subarray | Set 2 (Including Updates)
#####1) Queries for counts of array elements with values in given range
#####1) Queries for decimal values of subarrays of a binary array
#####1) Count elements which divide all numbers in range L-R
#####1) Number whose sum of XOR with given array range is maximum
#####1) XOR of numbers that appeared even number of times in given Range
#####1) Array range queries over range queries
#####1) Array range queries for searching an element
#####1) Array range queries for elements with frequency same as value
#####1) Maximum Occurrence in a Given Range
#####1) Number of indexes with equal elements in given range
#####1) Merge Sort Tree for Range Order Statistics
#####1) Total numbers with no repeated digits in a range
#####1) Difference Array | Range update query in O(1)
More >>



 

##Optimization Problems :

#####1) Largest Sum Contiguous Subarray
#####1) Maximum profit by buying and selling a share at most twice
#####1) Find the subarray with least average
#####1) Find the minimum distance between two numbers
#####1) Minimize the maximum difference between the heights
#####1) Minimum number of jumps to reach end
#####1) Dynamic Programming | Set 14 (Maximum Sum Increasing Subsequence)
#####1) Smallest subarray with sum greater than a given value
#####1) Find maximum average subarray of k length
#####1) Count minimum steps to get the given desired array
#####1) Number of subsets with product less than k
#####1) Find minimum number of merge operations to make an array palindrome
#####1) Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
#####1) Size of The Subarray With Maximum Sum
#####1) Find minimum difference between any two elements
#####1) Space optimization using bit manipulations
#####1) Longest Span with same Sum in two Binary arrays


##Sorting :

#####1) Alternative Sorting
#####1) Sort a nearly sorted (or K sorted) array
#####1) Sort an array according to absolute difference with given value
#####1) Sort an array in wave form
#####1) Merge an array of size n into another array of size m+n
#####1) Sort an array which contain 1 to n values
#####1) Sort 1 to N by swapping adjacent elements
#####1) Sort an array containing two types of elements
#####1) Sort elements by frequency | Set 1
#####1) Count Inversions in an array | Set 1 (Using Merge Sort)
#####1) Two elements whose sum is closest to zero
#####1) Shortest Un-ordered Subarray
#####1) Minimum number of swaps required to sort an array
#####1) Union and Intersection of two sorted arrays
#####1) Find Union and Intersection of two unsorted arrays
#####1) Sort an array of 0s, 1s and 2s
#####1) Find the Minimum length Unsorted Subarray, sorting which makes the complete array sorted
#####1) Median in a stream of integers (running integers)
#####1) Count the number of possible triangles
#####1) Find number of pairs (x, y) in an array such that x^y > y^x
#####1) Count all distinct pairs with difference equal to k
#####1) Print All Distinct Elements of a given integer array
#####1) Construct an array from its pair-sum array
#####1) Merge two sorted arrays with O(1) extra space
#####1) Product of maximum in first array and minimum in second
More >>

##Searching :

#####1) Search, insert and delete in an unsorted array
#####1) Search, insert and delete in a sorted array
#####1) Given an array A[] and a number x, check for pair in A[] with sum as x
#####1) Searching in an array where adjacent differ by at most k
#####1) Find common elements in three sorted arrays
#####1) Find position of an element in a sorted array of infinite numbers
#####1) Find the only repetitive element between 1 to n-1
#####1) Find the element that appears once
#####1) Maximum Subarray Sum Excluding Certain Elements
#####1) Maximum equlibrium sum in an array
#####1) Equilibrium index of an array
#####1) Leaders in an array
#####1) Ceiling in a sorted array
#####1) Majority Element
#####1) Check for Majority Element in a sorted array
#####1) Check if an array has a majority element
#####1) Two Pointers Technique
#####1) Find a peak element
#####1) Find the two repeating elements in a given array
#####1) Find a Fixed Point in a given array
#####1) Find sub-array with given sum
#####1) Maximum triplet sum in array
#####1) Smallest Difference Triplet from Three arrays
#####1) Find a triplet that sum to a given value
#####1) Find all triplets with zero sum
More >>

##Matrix :

#####1) Rotate Matrix Elements
#####1) Inplace rotate square matrix by 90 degrees | Set 1
#####1) Rotate a matrix by 90 degree without using any extra space | Set 2
#####1) Rotate a Matrix by 180 degree
#####1) Turn an image by 90 degree
#####1) Rotate each ring of matrix anticlockwise by K elements
#####1) Check if all rows of a matrix are circular rotations of each other
#####1) Sort the given matrix
#####1) Find the row with maximum number of 1s
#####1) Find median in row wise sorted matrix
#####1) Matrix Multiplication | Recursive
#####1) Program to multiply two matrices
#####1) Program for scalar multiplication of a matrix
#####1) Program to print Lower triangular and Upper triangular matrix of an array
#####1) Find distinct elements common to all rows of a matrix
#####1) Print a given matrix in spiral form
#####1) Find maximum element of each row in a matrix
#####1) Find unique elements in a matrix
#####1) Shift matrix elements row-wise by k
#####1) Different Operations on Matrices
#####1) Print a given matrix in counter-clock wise spiral form
#####1) Swap major and minor diagonals of a square matrix
#####1) Maximum path sum in matrix
#####1) Squares of Matrix Diagonal Elements
#####1) Move matrix elements in given direction and add elements with same value
More >>

##Misc :

#####1) Subarray/Substring vs Subsequence and Programs to Generate them
#####1) A Product Array Puzzle
#####1) Number of subarrays with given product
#####1) Linked List vs Array
#####1) Check if array elements are consecutive | Added Method 3
#####1) Find whether an array is subset of another array | Added Method 3
#####1) Implement two stacks in an array
#####1) Find relative complement of two sorted arrays
#####1) Minimum increment by k operations to make all elements equal
#####1) Minimize (max(A[i], B[j], C[k]) – min(A[i], B[j], C[k])) of three different sorted arrays