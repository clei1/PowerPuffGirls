# PowerPuffGirls
## APCS2 pd1 (Yedoh Kang, Connie Lei, Donia Tung)

<br />
### MergeSort Algorithm Runtime & Breakdown
<br />
#### Runtime: O(nlogn)

#### Brief Explanation:
##### *Detailed analysis in MergeSortTester.java
##### On each array, the number of halves is determined by log base 2 of n. This keeps on going until we have arrays of length 1. Then, when we merge the arrays, we iterate through the total length of the arrays, where the number of iterations is log base 2 of n, n times. Merge is a O(n) algorithm, and we perform this log base 2 of n times. The total runtime would be the sum of these two, which is 2n(log base 2 of n), which simplifies to O(nlogn).

#### Graphs + Flowchart:
##### Click here: (https://docs.google.com/document/d/1viPjuUBQELM0j-bif1lNVzls43u4c5pn4LOFdzPCHCM/pub “Documentation”)
