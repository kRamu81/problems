# Sorting Algorithms: Bubble, Selection, Merge, and Quick Sort

## 1. Bubble Sort
Bubble Sort is a simple comparison-based sorting algorithm.  
It repeatedly compares **adjacent elements** and swaps them if they are in the wrong order.  
After each pass, the largest element moves to the end of the array.

### Key Points
- Compares adjacent elements
- Multiple swaps per pass
- Easy to understand and implement

### Complexity
- Best Case: **O(n)** (already sorted)
- Average Case: **O(n²)**
- Worst Case: **O(n²)**
- Space Complexity: **O(1)** (in-place)
- Stability: **Stable**

---

## 2. Selection Sort
Selection Sort fixes **one position at a time**.  
It finds the minimum element from the unsorted part and places it at the correct position using **one swap per pass**.

### Key Points
- Compares one element with all remaining elements
- One swap per pass
- Simple but inefficient for large data

### Complexity
- Best Case: **O(n²)**
- Average Case: **O(n²)**
- Worst Case: **O(n²)**
- Space Complexity: **O(1)** (in-place)
- Stability: **Not Stable**

---

## 3. Merge Sort
Merge Sort follows the **divide and conquer** approach.  
The array is divided into smaller subarrays, sorted recursively, and then merged.

### Key Points
- Uses recursion
- Very efficient for large datasets
- Requires extra memory

### Complexity
- Best Case: **O(n log n)**
- Average Case: **O(n log n)**
- Worst Case: **O(n log n)**
- Space Complexity: **O(n)**
- Stability: **Stable**

---

## 4. Quick Sort
Quick Sort is also a **divide and conquer** algorithm.  
It selects a **pivot element**, partitions the array around the pivot, and recursively sorts the subarrays.

### Key Points
- Very fast in practice
- In-place sorting
- Performance depends on pivot selection

### Complexity
- Best Case: **O(n log n)**
- Average Case: **O(n log n)**
- Worst Case: **O(n²)** (poor pivot choice)
- Space Complexity: **O(log n)** (recursion stack)
- Stability: **Not Stable**

---

## 5. Comparison Table

| Algorithm | Time Complexity | Space | Stable | Suitable For |
|--------|---------------|-------|--------|--------------|
| Bubble Sort | O(n²) | O(1) | Yes | Very small datasets |
| Selection Sort | O(n²) | O(1) | No | Small datasets |
| Merge Sort | O(n log n) | O(n) | Yes | Large datasets |
| Quick Sort | O(n log n) avg | O(log n) | No | Fast practical use |

---

## Conclusion
- **Bubble & Selection Sort**
    - Easy to understand
    - Poor performance
    - Mainly used for learning

- **Merge Sort**
    - Consistent and reliable
    - Uses extra space

- **Quick Sort**
    - Fastest in practice
    - Worst-case can be slow

---

> In real-world applications, **Merge Sort and Quick Sort** are preferred over Bubble and Selection Sort.
