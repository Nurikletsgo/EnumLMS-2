public enum Days {
    MONDAY("Дуйшомбу"," жава отулот"),
    TUESDAY("Шейшемби"," сешн отулот "),
    WEDNESDAY("Шаршемби"," aнглийский отулот"),
    THURSDAY("Бейшемби"," софт скилс отулот"),
    FRIDAY("Жума"," евент отулот"),
    SATURDAY("Ишемби"," сешн отулот"),
    SUNDAY("Жекшемби"," выходной ");
     private  final String nameInKg;
     private final String myLesson;

    Days(String nameInKg, String myLesson) {
        this.nameInKg = nameInKg;
        this.myLesson = myLesson;
    }

 public void getTranslate(){
     System.out.println(nameInKg+myLesson);


 }
 }

