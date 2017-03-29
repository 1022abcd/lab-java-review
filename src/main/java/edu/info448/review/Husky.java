package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable {
  /* class body goes here */
  public Husky(String name) {
		super(name, 'Husky');
    }
   public void pullSled() {
		System.out.println('Huksy pulled the sled');
	}
    public void bark() {
		System.out.println("barks like a Husky");
	}
    public void hug(){
        System.out.println(this+" is giving you a hug");
    }
}