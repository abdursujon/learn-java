# Rules 
1. Dynamic Size — grows and shrinks automatically, unlike fixed-size arrays.
2. Objects Only — stores only objects (wrapper classes), not primitives.
3. Ordered — maintains insertion order.
4. Allows Duplicates — same value can appear multiple times.
5. Allows Null — can store null values.
6. Index-Based — elements are accessed by index (0-based).
7. Not Synchronized — not thread-safe by default.
8. Random Access — get() is O(1), but add()/remove() in the middle is O(n) due to shifting.
9. Initial Capacity — default internal array size is 10, grows by ~1.5x when full.
10. Part of Collections Framework — implements List interface. 