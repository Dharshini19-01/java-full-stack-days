package runtime.model;

public class Class3 extends Parent3 {

	public static void main(String[] args) {
		Class3 obj=new Class3();
	    obj.play();
	    obj.study();
	    obj.work();
	    obj.do_java_program();
	    //Dynamic Binding:
	    Parent3 parent=new Class3();
	    parent.study();
	    parent.work();
	    
	}
	public void play() {
		System.out.println("playing...");
	}
	public void study() {
		System.out.println("studying");
	}
	public void work() {
		System.out.println("working");
	}
	void do_java_program() {
		System.out.println("doing java program");
	}

}
