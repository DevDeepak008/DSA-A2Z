# 🚀 Quick Sort – Complete Guide (DSA)

## 📌 What is Quick Sort?

Quick Sort is a **divide and conquer** sorting algorithm.
It selects a pivot element, partitions the array around the pivot,
and recursively sorts the subarrays.

---

## ⚙️ How Quick Sort Works

1. Choose a **pivot** element.
2. Partition the array such that:
   - Elements smaller than pivot are on the left
   - Elements greater than pivot are on the right
3. Recursively apply the same steps to left and right subarrays.

---

## 🧠 Partition Strategy Used

### ✅ Hoare Partition with Random Pivot

- Pivot is selected **randomly** to avoid worst-case scenarios
- Faster than Lomuto partition (fewer swaps)
- Prevents Time Limit Exceeded (TLE) on sorted inputs

---

## ⏱️ Time & Space Complexity

| Case | Time Complexity |
|------|----------------|
| Best Case | O(n log n) |
| Average Case | O(n log n) |
| Worst Case | O(n²) *(rare due to random pivot)* |

**Space Complexity:**  
- O(log n) due to recursion stack

---

## ✅ Why Random Pivot is Important

If pivot is chosen poorly (e.g., always first element):

- Sorted array → worst case
- Reverse sorted array → worst case
- Duplicate-heavy array → poor partition

**Random pivot selection makes worst-case extremely unlikely.**

---

## ⚠️ Edge Cases

| Edge Case | Behavior |
|----------|----------|
| Empty array | Returned as is |
| Single element | Already sorted |
| All elements equal | Safe with Hoare partition |
| Negative numbers | Works correctly |
| Large input size | Efficient with random pivot |

---

## ❌ Negative Scenarios

### 1️⃣ Fixed Pivot Selection

```java
pivot = arr[low]; // ❌ Not recommended

Causes unbalanced partitions
Leads to O(n²) time complexity
Can result in TLE on competitive platforms

Sorted / Reverse Sorted Input
[1, 2, 3, 4, 5]
[5, 4, 3, 2, 1]
Without random pivot, Quick Sort degrades to worst case.

3️⃣ Deep Recursion Risk
Quick Sort is recursive
Worst-case recursion depth may cause stack overflow
Mitigated by: Random pivot
Balanced partitions
Iterative Quick Sort (advanced)