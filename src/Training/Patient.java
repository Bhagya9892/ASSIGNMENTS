package Training;

public class Patient {

	public static void main(String[] args) {
		Encaps patient1 =new Encaps();
		patient1.setName("Jonny");
		patient1.setAge(45);
		patient1.setBloodgroup("O+");
		
		System.out.println(patient1.getName());
		System.out.println(patient1.getAge());
		System.out.println(patient1.getBloodgroup());
		
		Encaps patient2 =new Encaps();
		patient2.setName("Gini");
		patient2.setAge(32);
		patient2.setBloodgroup("B+");
		
		System.out.println(patient2.getName());
		System.out.println(patient2.getAge());
		System.out.println(patient2.getBloodgroup());

	}

}
