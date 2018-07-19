package jc.vehiclemakemodelview;

import java.util.ArrayList;

/**
 * Data on vehicle makes.
 *
 * @author Jesse Cvetko
 * @version 2018.05.29
 */
public class VehicleMakeData
{
    private ArrayList<String> vehicleMakeData;

    /**
     * Constructor for objects of class VehicleMakeData
     */
    public VehicleMakeData()
    {
        vehicleMakeData = new ArrayList<>();
        populateData();
    }

    /**
     * Populate with raw data from poll on vehicle make
     */
    private void populateData()
    {
        vehicleMakeData.add("Toyota");
        vehicleMakeData.add("Honda");
        vehicleMakeData.add("Dodge");
        vehicleMakeData.add("Ford");
        vehicleMakeData.add("Toyota");
        vehicleMakeData.add("Chevy");
        vehicleMakeData.add("Toyota");
        vehicleMakeData.add("Chevy");
        vehicleMakeData.add("Honda");
        vehicleMakeData.add("Volvo");
    }

    /**
     * @return the raw data
     */
    public ArrayList<String> getData()
    {
        return vehicleMakeData;
    }
}
