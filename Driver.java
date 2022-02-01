/*****************************************************************************
/* Author:      Filip Segota
/* Class:       CSC 122, Fall 2020
/* Assignment:  Lab 6: Binary Search Tree and Hash Table
/* File:        Driver
/*****************************************************************************/
public class Driver{
    public static void main(String[] args){
        String randId;
        
        System.out.println("Person class testing.");
        //constructor
        Person p1 = new Person("Filip", "filip.segota@betheluniversity.edu",
                               "638005", "10/05/2000");
        //accessors
        System.out.println(p1.getName());
        System.out.println(p1.getEmail());
        System.out.println(p1.getId());
        System.out.println(p1.getDob());
        
        //mutators
        p1.setName("Mark");
        p1.setEmail("");
        p1.setId("111111");
        p1.setDob("05/10/2001");
        
        //methods
        System.out.println(p1.isEqual(p1));
        System.out.println(p1.toString());
        
        System.out.println("\nStudent class testing.");
        //constructor
        Student s1 = new Student("Filip", "filip.segota@betheluniversity.edu",
                                 "638005", "10/05/2000", (float)4.00, 15,
                                 "Computer Science");
                                 
        //accessors
        System.out.println(s1.getGpa());
        System.out.println(s1.getHours());
        System.out.println(s1.getMajor());
        
        //mutators
        s1.setGpa((float)3.00);
        s1.setHours(16);
        s1.setMajor("Cyber Security");
        
        //methods
        s1.modifyGpa(3, "A");
        System.out.println(s1.compareTo(s1));
        Student s4 = new Student("Alex", "alex.segota@betheluniversity.edu",
                                 "638006", "10/05/2000", (float)3.0, 15,
                                 "Computer Science");
        System.out.println(s1.compareTo(s4));                         
        System.out.println(s1.toString());
        
        System.out.println("\nBTStudentNode and BTStudents class testing.");
        //constructors
        BTStudentNode btn1 = new BTStudentNode(s1);
        BTStudentNode btn2 = new BTStudentNode(s4);
        BTStudentNode btn3 = new BTStudentNode(s1);
        BTStudents binaryTree = new BTStudents();
        
        //methods
        System.out.println(btn1.getStudent().toString());
        binaryTree.add(s1);
        binaryTree.add(s4);
        binaryTree.add(s1);
        binaryTree.find("638006");
        System.out.println(binaryTree.getCompares());
        binaryTree.resetCompares();
        System.out.println(binaryTree.getCompares());
        btn1.setLeft(btn1);
        btn1.setRight(btn2);
        System.out.println(btn1.getLeft().getStudent().toString());
        System.out.println(btn1.getRight().getStudent().toString());
        System.out.println(binaryTree.getSize());
        System.out.println(binaryTree.preOrder());
        System.out.println(binaryTree.inOrder());
        System.out.println(binaryTree.postOrder());
        
        System.out.println("\nHashStudentNode and HashTableStudents testing.");
        //constructors
        HashStudentNode hashNode1 = new HashStudentNode(s1);
        HashStudentNode hashNode2 = new HashStudentNode(s4);
        HashStudentNode hashNode3 = new HashStudentNode(s1);
        HashTableStudents hashTable = new HashTableStudents(30);
        
        //methods
        hashTable.add(s1);
        hashTable.add(s4);
        hashTable.add(s1);
        hashTable.find("638006");
        System.out.println(hashTable.getCompares());
        hashTable.resetCompares();
        System.out.println(hashTable.getCompares());
        System.out.println(hashNode1.getKey());
        System.out.println(hashNode1.getValue().toString());
        if(hashNode1.getNext() != null)
        System.out.println(hashNode1.getNext().getValue().toString());
        System.out.println(hashTable.getCapacity());
        System.out.println(hashTable.getSize());
        System.out.println(hashTable.isEmpty());
        System.out.println(hashTable.toString());
        
        System.out.println("\nArrayStudents testing.");
        //constructors
        ArrayStudents studentsArray = new ArrayStudents(30);
        
        //methods
        studentsArray.add(s1);
        studentsArray.add(s4);
        studentsArray.add(s1);
        studentsArray.sort();
        studentsArray.find("638005");
        System.out.println(studentsArray.getCompares());
        studentsArray.resetCompares();
        System.out.println(studentsArray.getCompares());
        System.out.println(studentsArray.getCapacity());
        System.out.println(studentsArray.getSize());
        System.out.println(studentsArray.isEmpty());
        System.out.println(studentsArray.isFull());
        System.out.println(studentsArray.toString());
        
        System.out.println("\nAnalyzing.");
        System.out.println("\nInOrder.");
        
        System.out.println(BTtestInOrder(10));
        System.out.println(BTtestInOrder(50));
        System.out.println(BTtestInOrder(100));
        System.out.println(BTtestInOrder(250));
        System.out.println(BTtestInOrder(500));
        System.out.println(BTtestInOrder(750));
        System.out.println(BTtestInOrder(1000));
        System.out.println(BTtestInOrder(10));
        System.out.println(BTtestInOrder(50));
        System.out.println(BTtestInOrder(100));
        System.out.println(BTtestInOrder(250));
        System.out.println(BTtestInOrder(500));
        System.out.println(BTtestInOrder(750));
        System.out.println(BTtestInOrder(1000));
        System.out.println("\n");
        System.out.println(HTtestInOrder(10));
        System.out.println(HTtestInOrder(50));
        System.out.println(HTtestInOrder(100));
        System.out.println(HTtestInOrder(250));
        System.out.println(HTtestInOrder(500));
        System.out.println(HTtestInOrder(750));
        System.out.println(HTtestInOrder(1000));
        System.out.println(HTtestInOrder(10));
        System.out.println(HTtestInOrder(50));
        System.out.println(HTtestInOrder(100));
        System.out.println(HTtestInOrder(250));
        System.out.println(HTtestInOrder(500));
        System.out.println(HTtestInOrder(750));
        System.out.println(HTtestInOrder(1000));
        System.out.println("\n");
        System.out.println(AStestInOrder(10));
        System.out.println(AStestInOrder(50));
        System.out.println(AStestInOrder(100));
        System.out.println(AStestInOrder(250));
        System.out.println(AStestInOrder(500));
        System.out.println(AStestInOrder(750));
        System.out.println(AStestInOrder(1000));
        System.out.println(AStestInOrder(10));
        System.out.println(AStestInOrder(50));
        System.out.println(AStestInOrder(100));
        System.out.println(AStestInOrder(250));
        System.out.println(AStestInOrder(500));
        System.out.println(AStestInOrder(750));
        System.out.println(AStestInOrder(1000));
        
        System.out.println("\nReverse.");
        
        System.out.println(BTtestReverse(10));
        System.out.println(BTtestReverse(50));
        System.out.println(BTtestReverse(100));
        System.out.println(BTtestReverse(250));
        System.out.println(BTtestReverse(500));
        System.out.println(BTtestReverse(750));
        System.out.println(BTtestReverse(1000));
        System.out.println(BTtestReverse(10));
        System.out.println(BTtestReverse(50));
        System.out.println(BTtestReverse(100));
        System.out.println(BTtestReverse(250));
        System.out.println(BTtestReverse(500));
        System.out.println(BTtestReverse(750));
        System.out.println(BTtestReverse(1000));
        System.out.println("\n");
        System.out.println(HTtestReverse(10));
        System.out.println(HTtestReverse(50));
        System.out.println(HTtestReverse(100));
        System.out.println(HTtestReverse(250));
        System.out.println(HTtestReverse(500));
        System.out.println(HTtestReverse(750));
        System.out.println(HTtestReverse(1000));
        System.out.println(HTtestReverse(10));
        System.out.println(HTtestReverse(50));
        System.out.println(HTtestReverse(100));
        System.out.println(HTtestReverse(250));
        System.out.println(HTtestReverse(500));
        System.out.println(HTtestReverse(750));
        System.out.println(HTtestReverse(1000));
        System.out.println("\n");
        System.out.println(AStestReverse(10));
        System.out.println(AStestReverse(50));
        System.out.println(AStestReverse(100));
        System.out.println(AStestReverse(250));
        System.out.println(AStestReverse(500));
        System.out.println(AStestReverse(750));
        System.out.println(AStestReverse(1000));
        System.out.println(AStestReverse(10));
        System.out.println(AStestReverse(50));
        System.out.println(AStestReverse(100));
        System.out.println(AStestReverse(250));
        System.out.println(AStestReverse(500));
        System.out.println(AStestReverse(750));
        System.out.println(AStestReverse(1000));
        
        System.out.println("\nRandom.");
        
        System.out.println(BTtestRandom(10));
        System.out.println(BTtestRandom(50));
        System.out.println(BTtestRandom(100));
        System.out.println(BTtestRandom(250));
        System.out.println(BTtestRandom(500));
        System.out.println(BTtestRandom(750));
        System.out.println(BTtestRandom(1000));
        System.out.println(BTtestRandom(10));
        System.out.println(BTtestRandom(50));
        System.out.println(BTtestRandom(100));
        System.out.println(BTtestRandom(250));
        System.out.println(BTtestRandom(500));
        System.out.println(BTtestRandom(750));
        System.out.println(BTtestRandom(1000));
        System.out.println("\n");
        System.out.println(HTtestRandom(10));
        System.out.println(HTtestRandom(50));
        System.out.println(HTtestRandom(100));
        System.out.println(HTtestRandom(250));
        System.out.println(HTtestRandom(500));
        System.out.println(HTtestRandom(750));
        System.out.println(HTtestRandom(1000));
        System.out.println(HTtestRandom(10));
        System.out.println(HTtestRandom(50));
        System.out.println(HTtestRandom(100));
        System.out.println(HTtestRandom(250));
        System.out.println(HTtestRandom(500));
        System.out.println(HTtestRandom(750));
        System.out.println(HTtestRandom(1000));
        System.out.println("\n");
        System.out.println(AStestRandom(10));
        System.out.println(AStestRandom(50));
        System.out.println(AStestRandom(100));
        System.out.println(AStestRandom(250));
        System.out.println(AStestRandom(500));
        System.out.println(AStestRandom(750));
        System.out.println(AStestRandom(1000));
        System.out.println(AStestRandom(10));
        System.out.println(AStestRandom(50));
        System.out.println(AStestRandom(100));
        System.out.println(AStestRandom(250));
        System.out.println(AStestRandom(500));
        System.out.println(AStestRandom(750));
        System.out.println(AStestRandom(1000));
    }
    
    public static int BTtestInOrder(int n) {
        BTStudents bt;
        String randId;
        
        bt = new BTStudents();
        
        for(int i = 0; i < n; i++) {
            bt.add(new Student(String.valueOf(i), "",
                   String.valueOf(i), "", 0, 0, ""));
        }
        
        bt.resetCompares();
        randId = String.valueOf((int)(Math.random() * n));
        bt.find(randId);
        
        return bt.getCompares();
    }
    
    public static int HTtestInOrder(int n) {
        HashTableStudents ht;
        String randId;
        
        ht = new HashTableStudents(n);
        
        for(int i = 0; i < n; i++) {
            ht.add(new Student(String.valueOf(i), "",
                   String.valueOf(i), "", 0, 0, ""));
        }
        
        ht.resetCompares();
        randId = String.valueOf((int)(Math.random() * n));
        ht.find(randId);
        
        return ht.getCompares();
    }
    
    public static int AStestInOrder(int n) {
        ArrayStudents as;
        String randId;
        
        as = new ArrayStudents(n);
        
        for(int i = 0; i < n; i++) {
            as.add(new Student(String.valueOf(i), "",
                   String.valueOf(i), "", 0, 0, ""));
        }
        
        as.resetCompares();
        as.sort();
        randId = String.valueOf((int)(Math.random() * n));
        as.find(randId);
        
        return as.getCompares();
    }
    
    public static int BTtestReverse(int n) {
        BTStudents bt;
        String randId;
        
        bt = new BTStudents();
        
        for(int i = n-1; i >= 0; i--) {
            bt.add(new Student(String.valueOf(i), "",
                   String.valueOf(i), "", 0, 0, ""));
        }
        
        bt.resetCompares();
        randId = String.valueOf((int)(Math.random() * n));
        bt.find(randId);
        
        return bt.getCompares();
    }
    
    public static int HTtestReverse(int n) {
        HashTableStudents ht;
        String randId;
        
        ht = new HashTableStudents(n);
        
        for(int i = n-1; i >= 0; i--) {
            ht.add(new Student(String.valueOf(i), "",
                   String.valueOf(i), "", 0, 0, ""));
        }
        
        ht.resetCompares();
        randId = String.valueOf((int)(Math.random() * n));
        ht.find(randId);
        
        return ht.getCompares();
    }
    
    public static int AStestReverse(int n) {
        ArrayStudents as;
        String randId;
        
        as = new ArrayStudents(n);
        
        for(int i = n; i >= 0; i--) {
            as.add(new Student(String.valueOf(i), "",
                   String.valueOf(i), "", 0, 0, ""));
        }
        
        as.resetCompares();
        as.sort();
        randId = String.valueOf((int)(Math.random() * n));
        as.find(randId);
        
        return as.getCompares();
    }
    
    public static int BTtestRandom(int n) {
        BTStudents bt;
        String randId;
        int rand;
        
        bt = new BTStudents();
        
        for(int i = n-1; i >= 0; i--) {
            rand = (int)(Math.random() * n);
            while(bt.find(String.valueOf(rand)) != null) {
                rand = (int)(Math.random() * n);
            }
            bt.add(new Student(String.valueOf(rand), "",
                   String.valueOf(rand), "", 0, 0, ""));
        }
        
        bt.resetCompares();
        randId = String.valueOf((int)(Math.random() * n));
        bt.find(randId);
        
        return bt.getCompares();
    }
    
    public static int HTtestRandom(int n) {
        HashTableStudents ht;
        String randId;
        int rand;
        
        ht = new HashTableStudents(n);
        
        for(int i = n-1; i >= 0; i--) {
            rand = (int)(Math.random() * n);
            while(ht.find(String.valueOf(rand)) != null) {
                rand = (int)(Math.random() * n);
            }
            ht.add(new Student(String.valueOf(rand), "",
                   String.valueOf(rand), "", 0, 0, ""));
        }
        
        ht.resetCompares();
        randId = String.valueOf((int)(Math.random() * n));
        ht.find(randId);
        
        return ht.getCompares();
    }
    
    public static int AStestRandom(int n) {
        ArrayStudents as;
        String randId;
        int rand;
        
        as = new ArrayStudents(n);
        
        for(int i = n; i >= 0; i--) {
            rand = (int)(Math.random() * n);
            while(as.find(String.valueOf(rand)) != null) {
                rand = (int)(Math.random() * n);
            }
            as.add(new Student(String.valueOf(rand), "",
                   String.valueOf(rand), "", 0, 0, ""));
        }
        
        as.resetCompares();
        as.sort();
        randId = String.valueOf((int)(Math.random() * n));
        as.find(randId);
        
        return as.getCompares();
    }
}