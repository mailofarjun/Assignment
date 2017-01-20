package assignment;

public interface Edge<K,V> {
	 K getSource();
	 V getTarget();
	 long getWeight();
}
