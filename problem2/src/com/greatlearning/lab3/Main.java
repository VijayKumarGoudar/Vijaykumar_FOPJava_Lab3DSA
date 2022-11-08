package com.greatlearning.lab3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a[] = { 40, 20, 10, 30, 60, 50, 70 };

		Scanner sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();

		for (int i = 0; i < a.length; i++) {
			bst.root = bst.insert(bst.root, a[i]);
		}

		int sum = 130;
		bst.findPair(bst.root, sum);

		sc.close();
	}
}