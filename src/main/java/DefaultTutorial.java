

public interface DefaultTutorial {
    default void add(){
        System.out.println("Default add method called!");
    }
    default void sub(){
        System.out.println("Default sub method called!");
    }
}

interface Numbers extends DefaultTutorial{

    @Override
    default void sub()
    {
        System.out.println("Overrided sub method called!");
    }
}

class Tutorial implements Numbers{

    public static void main(String... args)
    {
        Tutorial objectDefault = new Tutorial();
        System.out.println("In main");
        objectDefault.add();
        objectDefault.sub();
    }
}