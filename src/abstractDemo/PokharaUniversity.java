package abstractDemo;

public interface PokharaUniversity {
	
	void attendance();
	void summerProject();
	
	static void display() {
		System.out.println("static display");
	}
	default void show() {
		System.out.println("default show");
	}
}
