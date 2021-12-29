package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExp {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(null);
		arrayList.add(10);
		arrayList.add(null);
		arrayList.add("Shilpi");
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}

}
