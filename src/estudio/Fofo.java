package estudio;

class Fofo implements iGato{
    String name;
    int age;

    public Fofo(String menso, int i) {
        this.name = menso;
        this.age = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String Meow() {
        return "Wow";
    }
}
