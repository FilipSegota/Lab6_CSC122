/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 6: Binary Search Tree and Hash Table
/* File:        Hash Table Node
/*****************************************************************************/
public class HashStudentNode {
    //field variables
    int key;
    Student value;
    HashStudentNode next;
    
    //constructors
    HashStudentNode() {
        key = 0;
        value = null;
        next = null;
    }
    
    HashStudentNode(Student student) {
        key = Integer.valueOf(student.getId());
        value = student;
        next = null;
    }
    
    public int getKey() {
        return key;
    }
    
    public Student getValue() {
        return value;
    }
    
    public HashStudentNode getNext() {
        return next;
    }
    
    public void setNext(HashStudentNode next) {
        this.next = next;
    }
}