import java.util.ArrayList;

public class Group {

    public ArrayList<Students> createGroup() {   //Создаем студентов и объединяем их в одну группу.
        Students students1 = new Students("Viktor", "Novikov", 21, 4.6);
        Students students2 = new Students("Anton", "Karpov", 21, 5.1);
        Students students3 = new Students("Viktoria", "Zueva", 20, 9.3);
        Students students4 = new Students("Liza", "Bikova", 21, 4.0);
        Students students5 = new Students("Danil", "Smirnov", 20, 7.8);
        Students students6 = new Students("Alex", "Egorov", 20, 8.2);
        Students students7 = new Students("Anastasya", "Krilova", 21, 10.1);
        Students students8 = new Students("Yurii", "Vahrushev", 21, 5.6);
        Students students9 = new Students("Svetlana", "Danilenko", 21, 7.3);
        Students students10 = new Students("Maxim", "Kotov", 20, 6.9);
        Students students11 = new Students("Ivan", "Panov", 21, 7.5);

        ArrayList<Students> journal = new ArrayList<>();    //Создаем журнал, со списком всех учащихся в группе.

        journal.add(students1);
        journal.add(students2);
        journal.add(students3);
        journal.add(students4);
        journal.add(students5);
        journal.add(students6);
        journal.add(students7);
        journal.add(students8);
        journal.add(students9);
        journal.add(students10);
        journal.add(students11);

        return journal;
    }

    public void choieseElder(ArrayList<Students> groupA) { //Метод с помощью которого мы сможем выбрать старосту в группе.
        String firstN = null;                              //Старостой становится тот, у кого самый высокий средний бал.
        String lastN = null;
        double average = 0;
        int count = 0;
        while(count < groupA.size()) {
            if (average < groupA.get(count).getAverageScore()) {
                average = groupA.get(count).getAverageScore();
                firstN = groupA.get(count).getFirstName();
                lastN = groupA.get(count).getLastName();
            }
            count++;
        }
        System.out.println("Soo, our elder is: " + firstN + " " + lastN);
    }
}