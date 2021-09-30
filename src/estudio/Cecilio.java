package estudio;

class Cecilio implements iGato {
    String name;
    int age;
    String habla;

    public Cecilio(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String getHabla(){
        return habla;
    }

    public void setHabla(String habla) {
        this.habla = habla;
    }

    @Override
    public String Meow() {
        return "Miau";
    }
}

