package jc.vehiclemakemodelview;

/**
 * Vehicle Make Display program
 *
 * @author Jesse Cvetko
 * @version 2018.06.07
 */
public class Main
{
    /**
     * Print the histogram
     * @param args program arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Ten people were asked to report the make" +
                " of their primary vehicle.");
        VehicleMakeDisplay display = new VehicleMakeDisplay();
        display.displayData();
    }
}
