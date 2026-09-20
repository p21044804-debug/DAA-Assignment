# DAA Assignment

## Design and Analysis of Algorithms

This repository contains my solutions for the **Design and Analysis of Algorithms (DAA)** assignment.

The assignment consists of **10 LeetCode problems** divided into two parts. All problems are implemented in **Java** and focus on important algorithmic concepts such as Binary Search, Divide and Conquer, Sorting, Two Pointer Technique, Quickselect, and Kadane's Algorithm.

---

## 👨‍💻 Student Information

| Field | Details |
|---|---|
| **Name** | Pavan Patel |
| **Course** | B.Tech Computer Science and Engineering |
| **University** | Parul University |
| **Subject** | Design and Analysis of Algorithms |
| **Programming Language** | Java |
| **Platform** | LeetCode |
| **Repository** | DAA Assignment |

---

# 📚 Assignment Overview

| Assignment | Number of Problems | Main Topics |
|---|---:|---|
| Assignment 1 | 5 | Binary Search and Searching Algorithms |
| Assignment 2 | 5 | Sorting, Selection, Arrays and Divide & Conquer |
| **Total** | **10** | **Various DAA Concepts** |

---

# 📝 Assignment 1

Assignment 1 focuses mainly on **Binary Search and efficient searching techniques**.

## Problems

### 1. LeetCode 704 — Binary Search

**Concept:** Binary Search

**Description:**  
Search for a target value in a sorted integer array and return its index. If the target does not exist, return `-1`.

**Complexity:**
- Time: `O(log n)`
- Space: `O(1)`

---

### 2. LeetCode 35 — Search Insert Position

**Concept:** Binary Search

**Description:**  
Given a sorted array and a target value, return the index if the target is found. Otherwise, return the position where the target should be inserted to maintain the sorted order.

**Complexity:**
- Time: `O(log n)`
- Space: `O(1)`

---

### 3. LeetCode 74 — Search a 2D Matrix

**Concept:** Binary Search

**Description:**  
Search for a target value in a 2D matrix where the elements are arranged in sorted order.

The solution treats the matrix as a logically flattened sorted array and applies binary search.

**Complexity:**
- Time: `O(log(m × n))`
- Space: `O(1)`

---

### 4. LeetCode 33 — Search in Rotated Sorted Array

**Concept:** Modified Binary Search

**Description:**  
Search for a target value in a sorted array that has been rotated at an unknown position.

At every step, one half of the array is identified as sorted, allowing half of the search space to be eliminated.

**Complexity:**
- Time: `O(log n)`
- Space: `O(1)`

---

### 5. LeetCode 162 — Find Peak Element

**Concept:** Binary Search

**Description:**  
Find and return the index of any peak element in an array. A peak element is greater than its neighboring elements.

The solution uses binary search by comparing the middle element with the next element.

**Complexity:**
- Time: `O(log n)`
- Space: `O(1)`

---

# 📊 Assignment 1 Summary

| No. | Problem | Algorithm | Time | Space |
|---:|---|---|---|---|
| 1 | 704 - Binary Search | Binary Search | `O(log n)` | `O(1)` |
| 2 | 35 - Search Insert Position | Binary Search | `O(log n)` | `O(1)` |
| 3 | 74 - Search a 2D Matrix | Binary Search | `O(log(m × n))` | `O(1)` |
| 4 | 33 - Search in Rotated Sorted Array | Modified Binary Search | `O(log n)` | `O(1)` |
| 5 | 162 - Find Peak Element | Binary Search | `O(log n)` | `O(1)` |

---

# 📝 Assignment 2

Assignment 2 focuses on **sorting, selection, array processing, and divide-and-conquer techniques**.

## Problems

### 1. LeetCode 88 — Merge Sorted Array

**Concept:** Two Pointer Technique

**Description:**  
Merge two sorted arrays into the first array while maintaining sorted order.

The elements are processed from the end so that the existing elements in `nums1` are not overwritten.

**Complexity:**
- Time: `O(m + n)`
- Space: `O(1)`

---

### 2. LeetCode 912 — Sort an Array

**Concept:** Merge Sort

**Description:**  
Sort an integer array in ascending order without using built-in sorting functions.

Merge Sort is used by recursively dividing the array into smaller parts and merging the sorted parts.

**Complexity:**
- Time: `O(n log n)`
- Space: `O(n)`

---

### 3. LeetCode 215 — Kth Largest Element in an Array

**Concept:** Quickselect

**Description:**  
Find the kth largest element in an unsorted array without completely sorting the array.

Quickselect partitions the array and continues searching only in the portion containing the required element.

**Complexity:**
- Average Time: `O(n)`
- Worst-case Time: `O(n²)`
- Space: `O(1)`

---

### 4. LeetCode 53 — Maximum Subarray

**Concept:** Kadane's Algorithm

**Description:**  
Find the contiguous subarray with the largest possible sum.

The algorithm maintains the best subarray sum ending at the current position and updates the overall maximum.

**Complexity:**
- Time: `O(n)`
- Space: `O(1)`

---

### 5. LeetCode 4 — Median of Two Sorted Arrays

**Concept:** Binary Search and Partition

**Description:**  
Find the median of two sorted arrays without actually merging them.

Binary search is performed on the smaller array to find a correct partition between the two arrays.

**Complexity:**
- Time: `O(log(min(m, n)))`
- Space: `O(1)`

---

# 📊 Assignment 2 Summary

| No. | Problem | Algorithm | Time | Space |
|---:|---|---|---|---|
| 1 | 88 - Merge Sorted Array | Two Pointer | `O(m + n)` | `O(1)` |
| 2 | 912 - Sort an Array | Merge Sort | `O(n log n)` | `O(n)` |
| 3 | 215 - Kth Largest Element | Quickselect | Average `O(n)` | `O(1)` |
| 4 | 53 - Maximum Subarray | Kadane's Algorithm | `O(n)` | `O(1)` |
| 5 | 4 - Median of Two Sorted Arrays | Binary Search / Partition | `O(log(min(m,n)))` | `O(1)` |

---

# 📁 Repository Structure

```text
DAA-Assignment/
│
├── 0004-median-of-two-sorted-arrays/
│
├── 0033-search-in-rotated-sorted-array/
│
├── 0035-search-insert-position/
│
├── 0053-maximum-subarray/
│
├── 0074-search-a-2d-matrix/
│
├── 0088-merge-sorted-array/
│
├── 0162-find-peak-element/
│
├── 0215-kth-largest-element-in-an-array/
│
├── 0704-binary-search/
│
├── 0912-sort-an-array/
│
└── README.md

