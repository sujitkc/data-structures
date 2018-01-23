INC=-cp .:classes

bt :
	javac -d classes ../bintree/Node.java ../bintree/BinaryTree.java BST.java ../prettyprint/Array.java TestBST.java
	java $(INC) TestBST

clean:
	rm -rf classes/*
