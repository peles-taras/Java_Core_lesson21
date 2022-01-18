package minimum;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {
	@CustomAnnotation(value = 1, description = "some description 1")
	private String name;
	@CustomAnnotation(value = 2, description = "some description 2")
	private String surname;
	@CustomAnnotation(value = 3, description = "some description 3")
	private int age;
	private int weight;
	private int height;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
