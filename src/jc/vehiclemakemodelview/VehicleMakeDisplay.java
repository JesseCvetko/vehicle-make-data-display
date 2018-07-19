package jc.vehiclemakemodelview;

import java.util.ArrayList;

/**
 * Display data from the vehicle make poll as a histogram
 *
 * @author Jesse Cvetko
 * @version 2018.06.07
 */
public class VehicleMakeDisplay
{
    private ArrayList<String> vehicleMakeData;
    private int[] vehicleMakeCounts;

    /**
     * Constructor for objects of class VehicleMakeDisplay
     */
    public VehicleMakeDisplay()
    {
        VehicleMakeData data = new VehicleMakeData();
        vehicleMakeData = data.getData();
        analyzeData();
    }

    /**
     * Analyze the data, recording counts of the following vehicle makes:
     * vehicleMakeCounts[0]: Toyota
     * vehicleMakeCounts[1]: Honda
     * vehicleMakeCounts[2]: Dodge
     * vehicleMakeCounts[3]: Ford
     * vehicleMakeCounts[4]: Chevy
     * vehicleMakeCounts[5]: any other vehicle make
     */
    private void analyzeData()
    {
        vehicleMakeCounts = new int[6];
        for (String vehicleMake : vehicleMakeData) {
            if (vehicleMake.equals("Toyota")) {
                vehicleMakeCounts[0]++;
            }
            else if (vehicleMake.equals("Honda")) {
                vehicleMakeCounts[1]++;
            }
            else if (vehicleMake.equals("Dodge")) {
                vehicleMakeCounts[2]++;
            }
            else if (vehicleMake.equals("Ford")) {
                vehicleMakeCounts[3]++;
            }
            else if (vehicleMake.equals("Chevy")) {
                vehicleMakeCounts[4]++;
            }
            else {
                vehicleMakeCounts[5]++;
            }
        }
    }

    /**
     * Display the analyzed data as a histogram
     */
    public void displayData()
    {
        StringBuilder displayHistogram = new StringBuilder();
        displayHistogram.append("Number of times each vehicle make was selected:");
        String[] displayVehicleMakes = new String[] {"Toyota:", "Honda:", "Dodge:", "Ford:", "Chevy:", "Other:"};
        for (int counter = 0; counter < vehicleMakeCounts.length; counter++) {
            displayHistogram.append('\n' + displayVehicleMakes[counter] + '\t'
                    + vehicleMakeCounts[counter] + "  ");
            for (int frequencySymbols = 0; frequencySymbols < vehicleMakeCounts[counter]; frequencySymbols++) {
                displayHistogram.append('*');
            }
        }
        displayHistogram.toString();
        System.out.println(displayHistogram);
    }

    /**
     * Display the analyzed data as a frequency table
     * with tally marks to show vehicle make counts
     */
    public void displayFrequency()
    {
        StringBuilder displayFrequency = new StringBuilder();
        displayFrequency.append("Frequency of vehicle makes reported in poll:");
        String[] displayVehicleMakes = new String[] {"Toyota:", "Honda:", "Dodge:", "Ford:", "Chevy:", "Other:"};
        for (int counter = 0; counter < vehicleMakeCounts.length; counter++) {
            displayFrequency.append('\n' + displayVehicleMakes[counter] + '\t');
            for (int tally = 0; tally < vehicleMakeCounts[counter]; tally++) {
                displayFrequency.append('|');
            }
        }
        displayFrequency.toString();
        System.out.println(displayFrequency);
    }
} 
