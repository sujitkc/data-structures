NOTE: The instruction below are useful in using the code in a Unix/Linux like environment over a command line. If you use an IDE or a Windows system, the following commands may not be useful as is.
The relative positions of the source directories are important for the test cases to compile. Please don't move the directories.

Following are source directories available:
bintree/ :     Contains the implementation of ordinary (unsorted) binary tree.
bst/ :         Contains the implementation of binary search tree.
tree/ :        Contains the implementation of ordinary (unsorted) k-ary tree.
prettyprint/ : Contains Array.java which is a class for pretty printing binary trees. Is used by test cases in both bintree and bst.

Following test files named Test*.java have been added to aid testing in all these directories. They are as follows:
- bintree/TestTraversal.java : 
  * Contains test cases for testing the traversals of a binary tree (Traversal.java).
  * To run these tests:
    cd bintree
    make traversal
- bintree/TestBinaryTree.java
  * Contains test cases for testing the binary search tree (bintree/BinaryTree.java).
  * To run these tests:
    cd bintree
    make bt
- bst/TestBST.java :
  * Contains test cases for testing the binary search tree (bst/BST.java).
  * To run these tests:
    cd bst
    make bst
- tree/TestTree.java
  * Contains test cases for testing the binary search tree (tree/Tree.java).
  * To run these tests:
    cd tree
    make tree
- tree/TestTraversal.java
  * Contains test cases for testing the binary search tree (tree/Traversal.java).
  * To run these tests:
    cd tree
    make traversal
