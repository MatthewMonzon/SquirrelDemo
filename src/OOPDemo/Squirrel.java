package OOPDemo;

public class Squirrel{

    //instance variable
    Double heightDouble;
    Double weightDouble;
    String colourString;
    String speciesString;
    String nameString;
    int healthInt;

    //constructor
    /**
     * Squirrel Constructor
     * @param newHeightDouble
     * @param newWeightDouble
     * @param newColourString
     * @param newSpeciesString
     * @param newNameString
     */
    public Squirrel(Double newHeightDouble, Double newWeightDouble, String newColourString, String newSpeciesString, String newNameString){
       
        this.healthInt = 100;
        this.heightDouble = newHeightDouble;
        this.weightDouble = newWeightDouble;
        this.colourString = newColourString;
        this.speciesString = newSpeciesString;
        this.nameString = newNameString;

    }

    //instance methods
    /**
     * Store the nuts
     */
    public void storeNuts(){
        System.out.println("store deez nuts");
    }

    /**
     * walk
     */
    public void walk(){
        System.out.println("walking");
    }

    /**
     * climb
     */
    public void climbTree(){
        System.out.println("climb tree");
    }

    /**
     * get health
     * @return health value
     */
    public int getHealth(){
        return this.healthInt;
    }

    /**
     * scramble
     */
    public void scramble(){
        System.out.println("SCRAMBLE");
    }

    /**
     * take hit to health
     */
    public void injury(){
        this.healthInt--;
    }

}