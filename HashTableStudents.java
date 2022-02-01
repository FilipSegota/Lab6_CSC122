/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 6: Binary Search Tree and Hash Table
/* File:        Hash Table Students
/*****************************************************************************/
import java.util.ArrayList;

public class HashTableStudents implements DataStructure{
    //field variables
    ArrayList<HashStudentNode> bucketArray;
    int capacity, compares, size;
    
    //constructors
    HashTableStudents() {
        bucketArray = new ArrayList<HashStudentNode>();
        capacity = 50;
        compares = 0;
        size = 0;
        for(int i = 0; i < capacity; i++) {
            bucketArray.add(null);
        }
    }
    
    HashTableStudents(int capacity) {
        bucketArray = new ArrayList<HashStudentNode>();
        this.capacity = capacity;
        compares = 0;
        size = 0;
        for(int i = 0; i < capacity; i++) {
            bucketArray.add(null);
        }
    }
    
    //methods
    public int getCapacity() {
        return capacity;
    }
    
    public int hashIndex(int key) {
        return (key/100) % capacity;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public String toString() {
        String s;
        HashStudentNode cur;
        
        s = "";
        
        for(int i = 0; i < capacity; i++) {
            s += "[";
            cur = bucketArray.get(i);
            while(cur != null) {
            s += cur.getValue().getName() + ", ";
            cur = cur.getNext();
            }
            s += "]";
        }
        return s;
    }
    
    public void add(Student student) {
        HashStudentNode newNode, head;
        int hash;
        
        newNode = new HashStudentNode(student);
        hash = hashIndex(newNode.getKey());
        
        if(bucketArray.get(hash) == null) {
            size++;
            bucketArray.set(hash, newNode);
        }
        else {
            size++;
            newNode.setNext(bucketArray.get(hash));
            bucketArray.set(hash, newNode);
        }
    }
    
    public Student find(String id) {
        HashStudentNode cur;
        
        for(int i = 0; i < capacity; i++) {
            cur = bucketArray.get(i);
            while(cur != null) {
                compares++;
                if(cur.getValue().getId().compareTo(id) == 0) {
                    return cur.getValue();
                }
                else {
                    cur = cur.getNext();
                }
            }
        }
        return null;
    }
    
    public int getCompares() {
        return compares;
    }
    
    public void resetCompares() {
        compares = 0;
    }
    
    public int getSize() {
        return size;
    }
}