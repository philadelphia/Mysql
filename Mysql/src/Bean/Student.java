package Bean;

public class Student {
	private int id;
	private String name;
	private int age;
	private int score;
	
	public Student(int id, String name, int age, int score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", score=" + score + "]";
	}
}
