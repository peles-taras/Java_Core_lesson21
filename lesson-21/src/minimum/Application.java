package minimum;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Application {
	public static void main(String[] args) throws ClassNotFoundException, IOException {

		List<String> annotationsList = Methods.getAnnotation(Person.class);
		String path = "annotations.txt";
		File file = new File(path);

		for (String string : annotationsList) {
			System.out.println(string);
		}
		Methods.writeAnnotations(annotationsList, file);

	}

}
