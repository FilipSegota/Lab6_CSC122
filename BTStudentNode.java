/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 6: Binary Search Tree and Hash Table
/* File:        Binary Tree Node
/*****************************************************************************/
public class BTStudentNode {
    //field variables
    Student student;
    BTStudentNode left, right;
    
    //constructors
    BTStudentNode() {
        left = null;
        right = null;
    }
    
    BTStudentNode(Student student) {
        this.student = student;
        left = null;
        right = null;
    }
    
    //methods
    public Student getStudent() {
        return student;
    }
    
    public BTStudentNode getLeft() {
        return left;
    }
    
    public BTStudentNode getRight() {
        return right;
    }
    
    public void setLeft(BTStudentNode left) {
        this.left = left;
    }
    
    public void setRight(BTStudentNode right) {
        this.right = right;
    }
}