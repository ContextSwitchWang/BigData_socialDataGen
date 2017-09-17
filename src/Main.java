import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Main {
	public static void write(String path, Iterable<String> what) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(path);
		for(String line : what) {
			writer.print(line);
			writer.print("\n");
		}
		writer.close();
	}
	public static void main(String [] args) throws FileNotFoundException {
		write("MyPage.txt", new MyPages());
		write("Friends.txt", new Friends());
		write("AccessLog.txt", new AccessLog());
	}
}
