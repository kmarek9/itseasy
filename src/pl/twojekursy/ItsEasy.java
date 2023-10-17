package pl.twojekursy;

public class ItsEasy {
    public static void main(String[] args) {
        String anotherName = "Marek";
        /*
            - DRY - dont repeat yourself
            - zmienne
            - petle
            - instrukcje warunkowe
            - metody
            - parametry metod
         */


        int i=0;
        for(; i<10; i++){
            System.out.println("i=" + i);
           // String tmp = anotherName + i;

            if (i<5){
                printHello(anotherName + i);
            }else{
                System.out.println("w else");
            }

            System.out.println("po ifie");
        }

        printHello("po petli");
        printHello("Marek");
        printHello("Marek2");
    }

    private static void printHello(String name){
        System.out.println("Cześć " + name);
    }
}
