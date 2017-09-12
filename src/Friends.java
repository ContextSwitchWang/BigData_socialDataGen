import java.util.Iterator;

public class Friends implements Iterable<String>{

	@Override
	public Iterator<String> iterator() {
		return new Iter(1, 5000000);
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
			int i = Util.randomInt(1, 100000);
			return String.join(",",
				String.format("%d", id++),
				String.format("%d", i),
				String.format("%d", Util.randomInt(i, 100000)),
				String.format("%d", Util.randomInt(1, 1000000)),
				Util.randomString(20, 50));
		}
	}
}
