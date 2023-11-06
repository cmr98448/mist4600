}public class Dog {
    private String DogName;
    private String DawgBreed;
    private int DogAge;

    public void init(String name, String dawgbreed, int age) {
        DogName = name;
        DawgBreed = dawgbreed;
        DogAge = age;
    }

    public void getDawgname() {
        System.out.println("The dog's name is " + DogName);
    }

    public void getDawgbreed() {
        System.out.println("The dog's dawg breed is " + DawgBreed);
    }

    public int getDawgage() {
        return DogAge;
    }

    public void bark() {
        System.out.println("BARRRRK!");

    }
}

