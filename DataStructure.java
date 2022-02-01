/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 6: Binary Search Tree and Hash Table
/* File:        Data Structure Interface
/*****************************************************************************/
public interface DataStructure {
    //methods
    public void add(Student student);
    public Student find(String name);
    public int getCompares();
    public void resetCompares();
    public int getSize();
}