
public class Main {
    public static void main(String[] args) {

        String helloEn = "Hello";
        String helloKr = "안녕하세요";
        String bothHello = helloEn + helloKr;
        int kelinta; // kelinta yra artimiausiai anglų tarimui "h" raidė

        System.out.println();
        System.out.println("Pasisveikinimas angliškai: \"" + helloEn + "\" yra " + helloEn.getClass() + " kintamasis.");
        System.out.println("Pasisveikinimas korėjietiškai: \"" + helloKr + "\" yra " + helloKr.getClass() + " kintamasis.");
        System.out.println("Korėjietiškas pasisveikinimas yra iš " + helloKr.length() + " raidžių/simbolių.");
        kelinta = helloKr.indexOf("하") +1;
        System.out.println("Korėjietiškame pasisveikinime h raidė yra  " + kelinta + "-a.");
        System.out.println(bothHello + " Sujungtų pasisveikinimų 3-7 raidės/simboliai yra: " + bothHello.substring(2,7));

    }
}