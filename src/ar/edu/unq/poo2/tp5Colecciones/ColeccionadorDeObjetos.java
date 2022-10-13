package ar.edu.unq.poo2.tp5Colecciones;

import java.util.Collection;
import java.util.List;

public class ColeccionadorDeObjetos {
	
	public Object getFirstFrom(List<Object> collection) {
		
		return collection.get(0);
	}
	
	public void addLast (Object element, List<Object> collection) {
		
		collection.add(element);
	}
	
	public List<Object> getSubColection(List<Object> collection, int from, int to) {
		
		int x = 0;
		int y = 0;
		return collection.subList(x, y);
	}
	
	public Boolean containsElement(Collection<Object> collection, Object element) {
		return collection.contains(element);
	}
}
