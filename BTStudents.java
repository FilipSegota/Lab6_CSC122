/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 6: Binary Search Tree and Hash Table
/* File:        Binary Tree Students
/*****************************************************************************/
public class BTStudents implements DataStructure {
    //field variables
    BTStudentNode root;
    int compares, size;
    
    //constructors
    BTStudents() {
        root = null;
        compares = 0;
        size = 0;
    }
    
    //traversals
    public String preOrder() {
        return preOrder(root);
    }
    
    public String inOrder() {
        return inOrder(root);
    }
    
    public String postOrder() {
        return postOrder(root);
    }
    
    public String preOrder(BTStudentNode cur) {
        if (cur == null) return "";
        return cur.getStudent().getName() +
               preOrder(cur.getLeft()) +
               preOrder(cur.getRight());
    }
    
    public String inOrder(BTStudentNode cur) {
        if (cur == null) return "";
        return inOrder(cur.getLeft()) +
               cur.getStudent().getName() +
               inOrder(cur.getRight());
    }
    
    public String postOrder(BTStudentNode cur) {
        if (cur == null) return "";
        return postOrder(cur.getLeft()) +
               postOrder(cur.getRight()) +
               cur.getStudent().getName();
    }
    
    //methods
    public void add(Student s) {
        root = add(root, s);
        size++;
    }
    
    public BTStudentNode add(BTStudentNode cur, Student s) {
        if(cur == null) {
            cur = new BTStudentNode(s);
            return cur;
        }
        else {
            if(s.compareTo(cur.getStudent()) >= 0) {
                cur.setLeft(add(cur.left, s));
            }
            else {
                cur.setRight(add(cur.right, s));
            }
        }
        return cur;
    }
    
    public Student find(String id) {
        compares = 0;
        return find(id, root);
    }
    
    public Student find(String id, BTStudentNode cur) {
        if(cur == null) return null;
        
        compares++;
        if(cur.getStudent().getId().compareTo(id)== 0) return cur.getStudent();
        
        compares++;
        if(cur.getStudent().getId().compareTo(id) < 0) {
            return find(id, cur.getLeft());
        }
        else {
            return find(id, cur.getRight());
        }
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