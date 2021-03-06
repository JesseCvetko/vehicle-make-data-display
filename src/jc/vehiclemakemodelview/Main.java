package jc.vehiclemakemodelview;

/**
 * Vehicle Make Display program
 *
 * @author Jesse Cvetko
 * @version 2018.07.19
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
        System.out.println("Date of Data Collection: May 28, 2018");
        VehicleMakeDisplay display = new VehicleMakeDisplay();
        display.displayData();
    }
}
