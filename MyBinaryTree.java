// http://activedev.tistory.com/

public class MyBinaryTree {
	int key;
	MyBinaryTree leftNode, rightNode;
	
	public MyBinaryTree ( int val ) {
		key = val;
		leftNode = null;
		rightNode = null;
	}
	
	public void add(int val) {
		if ( val < key ) {
			if ( leftNode != null )
				leftNode.add(val);
			else
				leftNode = new MyBinaryTree(val);
		} else if ( val > key ) {
			if ( rightNode != null )
				rightNode.add(val);
			else
				rightNode = new MyBinaryTree(val);
		}
	}
	
	public void searchByInOrder() {
		if ( leftNode != null)
			leftNode.searchByInOrder();
		System.out.print(key + " ");
		if ( rightNode != null )
			rightNode.searchByInOrder();
	}
	public static void main(String[] args) {
		MyBinaryTree tree = new MyBinaryTree(10);
		tree.add(20);
		tree.add(30);
		tree.add(40);
		tree.add(5);
		tree.searchByInOrder();
		// TODO Auto-generated method stub
	}

}
