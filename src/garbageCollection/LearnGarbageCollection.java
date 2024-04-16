package garbageCollection;

public class LearnGarbageCollection {

    // Garbage Collection

    String name = "James";
    String address = "NY,USA";
    String phoneNumber = "3453465346";
    double salary = 50000.7888;

    public static void main(String[] args) {

        LearnGarbageCollection learn = new LearnGarbageCollection();

        LearnGarbageCollection learn1 = new LearnGarbageCollection();

        LearnGarbageCollection learn3 = new LearnGarbageCollection();

        System.out.println(learn.name);

        // Requesting JVM for running Garbage Collection
        System.gc();

        // Requesting JVM for running Garbage Collection
        Runtime.getRuntime().gc();

    }

    protected void finalize() {
        System.out.println("Called The finalize method");
    }

}
