import java.awt.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		MySimpleLinkedList listaSimple = new MySimpleLinkedList();
		ArrayList<String> array = new ArrayList();
		/*
		 * listaSimple.insert("elem1"); listaSimple.insert("elem8");
		 * listaSimple.insert("delem3"); listaSimple.insert("elem4");
		 * listaSimple.insert("elem2"); listaSimple.insert("felem3");
		 * listaSimple.insert("elem3"); listaSimple.deleteElement(111);
		 * listaSimple.insertElementAlPrincipio("yo voy primero");
		 * listaSimple.insertElementAlPrincipio("no, yo, yo voy primero");
		 */
		for (int i = 0; i < 20; i++) {
			listaSimple.insert("puntito" + i, (int)(Math.random()*20)+1);
			array.add("puntito" + i);
		}

		listaSimple.printListByNro();
		listaSimple.sortByNro();
		System.out.println("ahora ordenado:");
		listaSimple.printListByNro();
		
		/*for (int i = 0; i < listaSimple.getSize(); i++) {
			System.out.println(array.get(i));
		}

		DateFormat hora = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date inicioNodo = new Date();
		System.out.println(listaSimple.at(10000));
		System.out.println(listaSimple.getSize());
		Date finalNodo = new Date();
		Date inicioArray = new Date();
		for (int i = 0; i < 20000; i++) {
			array.add("puntito" + i);
		}
		System.out.println(array.get(10000));
		System.out.println(array.size());
		Date finalArray = new Date();
		long resultadoNodo = finalNodo.getTime() - inicioNodo.getTime();
		long resultadoArray = finalArray.getTime() - inicioArray.getTime();
		System.out.println(inicioNodo);
		System.out.println(finalNodo);
		System.out.println(resultadoNodo);
		System.out.println(resultadoArray);*/
	}

}
