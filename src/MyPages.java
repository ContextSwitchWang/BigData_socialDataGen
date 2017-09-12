import java.util.Iterator;

public class MyPages implements Iterable<String>{

	@Override
	public Iterator<String> iterator() {
		return new Iter(1, 100000);
	}
	public class Iter implements Iterator<String> {
		int id;
		int maxId;
		public Iter(int id, int maxId) {
			this.id = id;
			this.maxId = maxId;
		}
		@Override
		public boolean hasNext() {
			return id <= maxId;
		}

		@Override
		public String next() {
			return String.join(",",
				String.format("%d", id++),
				Util.randomString(10, 20),
				Util.randomString(10, 20),
				String.format("%d", Util.randomInt(1, 10)),
				Util.randomString(10, 20));
		}
	}
}
