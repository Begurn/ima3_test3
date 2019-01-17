
public class Student {
	private String name;
	private int gebJahr;
	private String studiengang;
	
	/**
	 * 
	 * @param name
	 * @param gebJahr
	 * @param studiengang
	 */
public Student(String name, int gebJahr, String studiengang) {
		super();
		this.name = name;
		this.gebJahr = gebJahr;
		this.studiengang = studiengang;
	}
/**
 * 
 */
	public void ausgeben(){
		System.out.println(name + " / " + studiengang + " / " + gebJahr);
	}
	public int getAlter(){
		return 2019 - gebJahr;
		
	}
	
	public static void man(String[] args) {
		Student s1 = new Student ("Benni" , 1994, "IMA");
		s1.ausgeben();
	}
}
