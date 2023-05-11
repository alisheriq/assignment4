# Assigments 4
# Course: Algorithms and Data Structures
# MyHashTable
---

## Tasks from
- [Assignment 4](https://moodle.astanait.edu.kz/mod/assign/view.php?id=82128)

## Build
IntelliJ IDEA
- I used v2022.3.1

## Explanation of the Assignment 4
<details>
<summary>myHashTable class</summary>
The MyHashTable class is a generic class that implements a hash table data structure. It stores key-value pairs where keys and values can be of any data type. It has the following methods and constructors:

Constructors:
public MyHashTable()
Creates a new MyHashTable object with default capacity of 100.
public MyHashTable(int capacity)
Creates a new MyHashTable object with the specified capacity.
  
Methods:
private int hash(K key)
Private method that returns an index for the given key using a hashing function.
  
public void put(K key, V value)
Inserts the given key-value pair into the hash table. If the key already exists, it updates its value.
  
public V get(K key)
Returns the value associated with the given key. If the key is not found, it returns null.
  
public V remove(K key)
Removes the key-value pair associated with the given key from the hash table. If the key is not found, it returns null.
  
public boolean contains(V value)
Returns true if the given value is present in the hash table. Otherwise, returns false.
  
public K getKey(V value)
Returns the key associated with the given value. If the value is not found, it returns null.
  
public void testTenThousand()
Prints the number of entries in each bucket of the hash table. Used for testing purposes only.
  
HashNode Class:
The HashNode class is a private nested class of MyHashTable that represents a node in the hash table. It has the following methods and constructor:

Constructor:
public HashNode(K key, V value)
Creates a new HashNode object with the given key and value.
Methods:

@Override public String toString()
Overrides the default toString() method to return a string representation of the node in the format "{key value}".

</details>

<details>
<summary>myTestingClass and Student classes</summary>
MyTestingClass:
public MyTestingClass(int x, int y): Constructor that creates an instance of MyTestingClass with the specified x and y values.
 
  
Student:
public Student(String name, int age): Constructor that creates an instance of Student with the specified name and age values.
</details>


## Install
 Copy the code from Main.java file to your project.  
 **IMPORTANT:** You will need to remove the comments to run the code.

## Download
Compiled binary material can be found at [releases](https://github.com/alisheriq/assignment4/tree/master/src).

## License
Majority of the source code is written by myself.
Any use of code without my permission is prohibited.
