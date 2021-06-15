/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-14
 * @desc Enums in Java
 */
/**
 * An enumeration (enum) is a list of named constants. Constants declared inside are known as enumeration constants
 * Enum defines a new data type. It is a kind of class having fixed constants and methods
 * The constants are implicitly static and final.
 * Enums can be used in switch case and if else.
 * 
 * All enumerations automatically contain three predefined methods
 * values() - returns an array of the enumeration constants
 * valueOf() - returns the enumeration constant whose value corresponds to the string passed as input
 * ordianl() - returns the ordinal position of this enumeration (starting with 0)
 * 
 * Java enumeration are Class Types. The keyword enum defines a class in java. It can have a main method also.
 * Though enums are Class Types, enums cannot extend any class. 
 * Internally enum inherits Enum class and if you try to extend it again, it becomes multiple inheritance which is not supported in Java
 */
enum CovidVaccines{
        COVISHIELD, COVAXIN, SPUTNIK_V, PFIZER //It is convention to name enumeration costants in Upper Case
}
class LearnEnums {
    public static void main(String args[]){
        CovidVaccines vaccine=CovidVaccines.SPUTNIK_V;
        System.out.println(vaccine);

        switch(vaccine){
            case COVISHIELD: System.out.println("Indian Vaccine");
                             break;
            case COVAXIN: System.out.println("Indian Vaccine");
                             break;
            case SPUTNIK_V: System.out.println("Russian Vaccine");
                             break;
            case PFIZER: System.out.println("American Vaccine");
                             break;                            
        }

        CovidVaccines [] vaccines=CovidVaccines.values();
        for (CovidVaccines vc : vaccines) {
            System.out.println(vc+" "+vc.ordinal());
        }

        System.out.println(CovidVaccines.valueOf("COVAXIN"));

    }
}
