package com.thinqq.datastructure.trees;

public class BinarySearchTree {
	
	class Node{
		int data;
		Node left, right;
		
		public Node(int _data){
			data = _data;
			left = right = null;
		}
	}
	
	Node root;
	
	public BinarySearchTree() {}
	
	public void insert(int value) {
		
	}
	
	public Node create(Node root, int value) {
		
		if(root == null) {
			root = new Node(value);
			return root;
		}
		
		if(value <= root.data) {
			root.left = create(root.left,value);
		}else if(value > root.data) {
			root.right = create(root.right,value);
		}
		return root;
	}

	public static void main(String[] args) {

	}

}
