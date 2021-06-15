/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-14
 * @desc Constructors in Enums
 */

/**
 * Enums can have constructors, methods, and can implement interfaces.
 * The constructor is called when each enumeration constant is created.
 * Each enumeration constant has its own copy of an instance variable.
 * We can overload constructors in enums
 * 
 * Note: We cannot create an instance of Enum with a new keyword, because it contains private constructors only.
 * The constructor will be called implicitly when enum constants are declared!
 * We cannor even declare the constructor in enum as public 
 */
enum CovidVaccine{
    COVISHIELD(400), COVAXIN(600), SPUTNIK_V(900), PFIZER(1200), NOVAVAX; //These constants are similar to function calls. Whenever these constants are created, the constructor with corresponding value will be invoked.
    private int vaccine_price;
    /**
     * public CovidVaccine(){  //  ERROR. Constructor. Cannot be public in Enum
     *   vaccine_price=-1;
     * }
     */
    CovidVaccine(){  //Constructor. Cannot be public in Enum
        vaccine_price=-1;
    }
    CovidVaccine(int price){ //Constructor. Cannot be public in Enum
        vaccine_price=price;
    }
    int getPrice(){ //Custom Method
        return vaccine_price;
    }
}
class LearnConstructorsAndMethodsInEnums {
    public static void main(String args[]){

        //CovidVaccine vaccine=new CovidVaccine.PFIZER ; Error, we cannot create instance of Enum with new keyword
        //CovidVaccine vaccine=new CovidVaccine.PFIZER() ; Error, we cannot create instance of Enum with new keyword

        CovidVaccine vaccine=CovidVaccine.PFIZER; // Constructor is invoked with value 1200. Similar to CovidVaccine.PFIZER(1200);
        System.out.println(vaccine+" : "+vaccine.getPrice());

        vaccine=CovidVaccine.NOVAVAX; // Default Constructor is invoked.
        System.out.println(vaccine+" : "+vaccine.getPrice());

        for(CovidVaccine cv: CovidVaccine.values()){
            System.out.println("Price of "+cv+" is "+cv.getPrice());
        }
    }
}
