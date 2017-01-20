package interfaces;

public interface LocationComparator<K extends Location> {
	<K> long difference( K source , K target);
}
