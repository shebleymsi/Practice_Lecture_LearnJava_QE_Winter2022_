package singleton;

public class LearnSingleton {

    // Singleton class: we are allowed to create one instance of a class at a time
    // Using private constructor we can ensure that not more than one object can be created at a time
    // singleton concept with the work default constructor only

    public LearnSingleton() {

    }

    public static void main(String[] args) {

        LearnSingleton learnSingleton = new LearnSingleton();

        LearnSingleton learnSingleton1 = new LearnSingleton();

    }

}
