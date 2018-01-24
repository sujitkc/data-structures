INC=-cp .:classes

bt :
	javac -d classes Node.java BinaryTree.java ../prettyprint/Array.java TestBinaryTree.java
	java $(INC) TestBinaryTree

traversal :
	javac -d classes Node.java BinaryTree.java Traversal.java ../prettyprint/Array.java TestTraversal.java
	java $(INC) TestTraversal

clean:
	rm -rf classes/*
