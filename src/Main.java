//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 4
        var friend = 19;
        friend = friend +2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*8;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        //Задача 6
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        var totalWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Общая масса двух бойцов = "+totalWeight+"кг");
        var weightDifference = boxerTwoWeight%boxerOneWeight;
        System.out.println("Разница между массами бойцов = " + weightDifference +"кг");

        //Задача 7
        var weight1 = 130;
        var weight2 = 70.4;
        var difference = weight1%weight2;
        System.out.println("Разница между весами = " + difference + "кг" );

        //Задача 8
        var totalHours = 640;
        var hoursPerPerson = 8;
        var totalPersons = totalHours/hoursPerPerson;
        System.out.println("Всего работников в компании " + totalPersons);
        var totalPersonsNew = totalPersons+94;
        totalHours = totalPersonsNew*hoursPerPerson;
        System.out.println("Если в компании работает " + totalPersonsNew + " сотрудника, то всего " + totalHours + " часов работы может быть поделено между сотрудниками!");
    }
}