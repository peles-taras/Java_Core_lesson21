package minimum;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Methods {

	public static ArrayList<String> getAnnotation(Class<?> someClass) throws IOException {
		ArrayList<String> arr = new ArrayList<>();
		Field[] fields = someClass.getDeclaredFields();
		
		for (Field field : fields) {
			CustomAnnotation annotation = field.getAnnotation(CustomAnnotation.class);
			
			if (annotation instanceof CustomAnnotation) {
				arr.add(field.getName() + ": value = " + field.getAnnotation(CustomAnnotation.class).value()
						+ ", description = " + field.getAnnotation(CustomAnnotation.class).description());
			}
		}
		return arr;
	}

	public static void writeAnnotations(List<String> list, File file) throws IOException {
		Files.write(file.toPath(), list);
	}

}
