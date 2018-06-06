/**
 * 
 */
package zxa;

public class OuterClass {

	interface innerInterface {
		public void greet();

		public void greetSomeone(String someone);
	}

	public void sayHello() {

		class LocalInnerClass implements innerInterface {
			String name = "world";

			public void greet() {
				greetSomeone("world");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		innerInterface englishGreeting = new LocalInnerClass();

		innerInterface frenchGreeting = new innerInterface() {
			String name = "tout le monde";

			public void greet() {
				greetSomeone("tout le monde");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		innerInterface spanishGreeting = new innerInterface() {
			String name = "mundo";

			public void greet() {
				greetSomeone("mundo");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
			}
		};
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
	}

	public static void main(String... args) {
		OuterClass myApp = new OuterClass();
		myApp.sayHello();
	}
}