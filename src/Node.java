public class Node {

	private String info;
	private Node next;
	
	public Node(Node n, String st){
		next = n;
		info = st;
	}


	public void setInfo(String st) {

		info = st;

	}

	public void setNext(Node i) {

		next = i;

	}

	public String getInfo() {

		return info;

	}

	public Node getNext() {

		return next;

	}

}