//Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
//The method should not return anything (void) and it needs to calculated the megaBytes and remaining kilobytes from the kilobytes parameter. 
//Then it needs to print a message in the format “XX KB and ZZ KB”.

//XX represents the original value kiloBytes.
//YY represents the calculated megabytes.
//ZZ represents the calculated remaining kilobytes.

//For example, when the parameter kiloBytes is 2500 it needs to print “2500KB = 2MB and 452 KB”

//If the parameter kiloBytes is less than 0 then print the “Invalid Value”.


public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megabytes = (kiloBytes/1024);
            int kiloRemainder = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+kiloRemainder+" KB");
        }

    }
    
}
