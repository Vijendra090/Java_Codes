/*1:Anonymous class are expressions.And created in two ways i.e. Class(abstract or concrete) and interface
* 2:AC are often used in GUI applications */
public class AnonymousClassExample {
    interface HelloWorld{  //By default access specifier of an interface methods is public and abstract
        void greet();
        void greetSomeone(String someone);
    }

    public void sayHello(){

        //local class
        class EnglishGreeting implements HelloWorld{
            String name="Vijen";
            public void greet() {
                greetSomeone(name);
            }

            public void greetSomeone(String someone) {
                System.out.println("Hello "+someone);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        //anonymous class
        HelloWorld frenchGreeting = new HelloWorld() {
            String name;
            {
                name="Ranita";
            }
            public void greet() {
                greetSomeone(name);
            }

            public void greetSomeone(String someone) {
                System.out.println("Salut "+someone);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greet();
    }

    public static void main(String[] args){
        AnonymousClassExample example = new AnonymousClassExample();
        example.sayHello();
    }
}
