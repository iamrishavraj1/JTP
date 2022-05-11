package Hashing;

public class Intro {
    public static void main(String[] args) {
        //In hashing we do Search,Insert, Delete in Big O(1) time.
        /* Application
            1. Database
            2. Password
            3. Cache
            4. Dictionary
            5. Many More...
         */
        
        /*
        How hash function work
        1. should always map a large key to some small key.
        2. should generate values from 0 to m-1. ( m is the size of array )
        3. should be fast O(1) for large integers and O(len) for string of length "ln".
        4. Should uniformly distribute large keys into hash table slots.
         */
        
        /*
        Examples Hash Functions.
        1. h(large_key) = large_key % m.
        2. for string, weighted sum
        3. str[] = "abc"
        4. str[0]*x^0 + str[1]*x^1+str[2]*x^n
        5. Universal Hashing
         */
        
        /*
        Collision Handling
        If we know keys in advance, then we can perfect hashing.
        If we do not know keys, then we use of the following.
            1. Chaining
            2. Open Addressing
                1. Linear Probling
                2. Quadratic Probing
                3. Double Hashing
         */
    
        /*
        Chaining
        m = No. of slots in Hash Table.
        n = No. of keys  to be inserted.
        Load Time or alpha = m/n
        Expected Chain length = Load Time or alpha
        Expected time to search = O(1+alpha)
        Expected time to insert/delete = O(1+alpha)
         */

    }
}
