public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 9) {
            System.out.print(++i + " ");
        }
            System.out.println(" ");

        for (; i > 0; i--) {
                System.out.print(i + " ");
            }
                System.out.println(" ");
            int g = 2;
            for (; g <=31; g = g + 7){
            System.out.println("Сегодня пятница " + g +" -е число. Нужно подготовить отчет.");
        }
            System.out.println(" ");

          int currentYear = 2022;
          int oldYear = currentYear -200;
          int nextYear = currentYear +100;
          for (int b=79; b <= nextYear; b+=79){
              if(b >= oldYear){
                  System.out.println(b);
              }
          }




    }
}