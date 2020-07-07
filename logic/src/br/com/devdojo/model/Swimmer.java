package br.com.devdojo.model;

public class Swimmer {
    private String name;
    private int age;
    private String nivel;

    public Swimmer(String name, int age, String nivel) {
        this.name = name;
        this.age = age;
        this.nivel = nivel;
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

    public void setAge(int Age) {
        this.age = age;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Swimmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nivel='" + nivel + '\'' +
                '}';
    }
}
