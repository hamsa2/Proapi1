

public class Post {
    public String name; // поле для имени
    // добавьте другие поля
    public String passport;
    public String patronymic;
    public String phone;
    public String surname;
    public boolean subscription;
    public FormDate birthday;

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", passport='" + passport + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phone='" + phone + '\'' +
                ", surname='" + surname + '\'' +
                ", subscription=" + subscription +
                ", birthday=" + birthday +
                '}';
    }
}




