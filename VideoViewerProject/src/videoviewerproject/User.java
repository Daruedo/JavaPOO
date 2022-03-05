package videoviewerproject;
public abstract class User {
    protected String name;
    protected int age;
    protected String gender;
    protected float exp;

    public User(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.exp = 0;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }
    
    @Override
    public String toString(){
        return " - Nome: " + name + "\n - Idade: " + age + "\n - Gênero: " + gender + "\n - Experiência: " + exp + "\n";
    }
    
}
