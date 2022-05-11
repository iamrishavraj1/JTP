package Hashing.OpenAddresing;
import java.util.*;
public class LinearProbing {
    public static void main(String[] args) {
        /*
        No. of slots in hash table >= No. of keys to be inserted
        Cache friendly
        Linear probing : linearly matching for next empty slot when there is a collection.
        hash(key) = key % 7;
         */
        
        /*
        Search function work
        We compute the hash function
        we go the index then check the value if it presents the returns the value otherwise it is linear search
        until the index finds empty
         */
        
        /*
        Delete function work
        We compute the hash function
        we go that index and delete the value and index slot  will be empty but there is a problem
        when we have 2 same number in table and when we search the value, and then we get the empty slot before the          index of value then it show there is no value in table but there is so for that we
        mark that slot as deleted not empty.
         */
    }
}
