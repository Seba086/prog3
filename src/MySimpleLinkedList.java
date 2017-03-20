import java.util.ArrayList;

public class MySimpleLinkedList {
	protected Node first;
	private int size = 0;

	public MySimpleLinkedList() {
		first = null;

	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insert(String s) {

		Node nodo = new Node(null, s);
		if (first == null) {
			first = nodo;
		} else {
			if (s.compareTo(first.getInfo()) < 0) {
				nodo.setNext(first);
				first = nodo;
			} else {
				Node nodoActual = first;
				while ((nodoActual.getNext() != null) && (s.compareTo(nodoActual.getNext().getInfo()) > 0)) {
					nodoActual = nodoActual.getNext();
				}
				nodo.setNext(nodoActual.getNext());
				nodoActual.setNext(nodo);
			}
		}
		size++;
	}

	
	// ELIMINA UN NODO POR POSICION, Y VINCULA EL ANTERIOR CON EL SIGUIENTE
	public void deleteElement(int pos) {
		// Node tmp;
		if (size - 1 > pos && first == null) {
			System.out.println("No borré nada"); // Si la lista esta vacía
		} else if (pos == 0) { // Si borro el primero de la lista, el segundo se
								// vuelve el primero
			first = first.getNext();
			size--;
		} else {
			if (size > pos || first == null) {
				Node nodo = at(pos - 1);
				if (nodo != null) {
					nodo.setNext(nodo.getNext().getNext());
					size--;
				}
			}
			else System.out.println("No hay nada en esa posición");
		}

	}

	public Node at(int pos) {
		Node nodo = null;
		if (size < pos - 1 || first == null) {
			System.out.println("No hay nada en esa posiciòn");
		} else {
			nodo = first;
			for (int i = 0; i < pos; i++) {
				nodo = nodo.getNext();
			}
		}
		return nodo;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public void printNode(int pos){
		System.out.println(at(pos).getInfo());
	}
	public void insertElementAlPrincipio(String s){
		Node nodo = new Node(null, s);
		nodo.setNext(first);
		first = nodo;
		size++;;
	}
}
