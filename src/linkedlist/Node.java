package linkedlist;

public class Node<T> {
		private T data;
		private Node<T> next;
	public Node(T data) {
		this.data = data;
	}
	public Node(T data, Node<T> next){
		this(data);
		this.next = next;
	}
	public String toString(){
		String result = data.toString();
		if (next == null)
			return result;
		else 
			return data + ", " + next.toString();
	}

}
