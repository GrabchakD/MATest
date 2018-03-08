import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Group group = new Group();
        Professor professor = new Professor("Grigoryi", "Ivanovich", "History");
        
        ArrayList<Students> journal = group.createGroup();   //Создаем группу и журнал;
        professor.checkup(journal);    //Проводим перекличку
        group.choieseElder(journal);   //Выбираем старосту группы;

    }
}
