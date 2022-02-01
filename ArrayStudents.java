/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 6: Binary Search Tree and Hash Table
/* File:        Simple Array of Students
/*****************************************************************************/
public class ArrayStudents implements DataStructure {
    //field variables
    Student[] students;
    int capacity, compares, size;
    
    //constructors
    ArrayStudents() {
        students = new Student[50];
        capacity = 50;
        compares = 0;
        size = 0;
        
        for(int i = 0; i < capacity; i++) {
            students[i] = null;
        }
    }
    
    ArrayStudents(int capacity) {
        students = new Student[capacity];
        this.capacity = capacity;
        compares = 0;
        size = 0;
        
        for(int i = 0; i < capacity; i++) {
            students[i] = null;
        }
    }
    
    //methods
    public int getCapacity() {
        return capacity;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
    
    public String toString() {
        String s;
        
        s = "";
        
        for(int i = 0; i < size; i++) {
            s += students[i].getName() + ", ";
        }
        
        return s;
    }
    
    public void merge(int l, int m, int r) {
        int n1, n2, i, j, k;
        Student[] templ, tempr;
        
        n1 = m - l + 1;
        n2 = r - m;
        
        templ = new Student[n1];
        tempr = new Student[n2];
        
        for(i = 0; i < n1; i++) {
            templ[i] = students[l + i];
        }
        for(j = 0; j < n2; j++) {
            tempr[j] = students[m + 1 + j];
        }
        
        i = 0;
        j = 0;
        k = l;
        
        while (i < n1 && j < n2) {
            compares++;
            if(templ[i].getId().compareTo(tempr[j].getId()) < 0) {
                students[k] = templ[i];
                i++;
            }
            else {
                students[k] = tempr[j];
                j++;
            }
            k++;
        }
        
        while(i < n1) {
            students[k] = templ[i];
            i++;
            k++;
        }
        
        while(j < n2) {
            students[k] = tempr[j];
            j++;
            k++;
        }
    }
    
    public void sort() {
        sort(0, size-1);
    }
    
    public void sort(int l, int r) {
        if(l < r) {
            int m = (l + r) / 2;
            
            sort(l, m);
            sort(m + 1, r);
            
            merge(l, m, r);
        }
    }
    
    public void add(Student student) {
        if(!isFull()) {
            students[size] = student;
            size++;
        }
    }
    
    public Student find(String id) {
        return find(0, size - 1, id);
    }
    
    public Student find(int l, int r, String id) {
        int mid;
    
        if(r >= l) {
            mid = l + (r - l) / 2;
            
            compares++;
            if(students[mid].getId().compareTo(id) == 0) {
                return students[mid];
            }
            
            compares++;
            if(students[mid].getId().compareTo(id) > 0) {
                return find(l, mid - 1, id);
            }
            
            return find(mid + 1, r, id);
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