package problem2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        int a[] ={ 40,20,10,30,60,50,70};
        for(int i=0;i<a.length;i++){
           bst.root= bst.insert(bst.root,a[i]);
        }

        System.out.println("Enter sum:  ");
        int sum = sc.nextInt();
        bst.findPair(bst.root,sum);
        
        sc.close();
    }
}