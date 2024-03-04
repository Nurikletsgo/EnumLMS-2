import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**
 * Күндөргө enum түзүңүз (Monday, Tuesday ...)
 Консолдон бир күндү белгилеңиз. Эгер Monday болсо - анда "Дуйшөмбү куну жава окуйм"
 же Tuesday болсо - анда "Шейшемби күнү англис тили сабагын окуйм" деп күнгө жараша
 кайсы сабакты окуганыңызды консолго чыгарыңыз. Жуманын күндөрүн кыргыз тилинде көрсөтүңүз. */
        System.out.print("Write day of the week : ");
        String day = new Scanner(System.in).nextLine();

        Days.valueOf(day.toUpperCase()).getTranslate();

    }
}



