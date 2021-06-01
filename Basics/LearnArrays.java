/** 
 * @author Praveen Reddy Chalamalla
 * Created on 2021-06-01
 * @desc Arrays in Java
*/
 
class Person{
    private String name;
    private int year_of_birth;
    public Person(String name,int year_of_birth){
        this.name=name;
        this.year_of_birth=year_of_birth;
    }
    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Year Of Birth : "+ Integer.toString(year_of_birth));
    }
}
class LearnArrays{
    public static void main(String args[]){

        //data_type[] array_name= new data_type[size]; Includes declaration and definition
        
        int[] arr1=new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr1.length;i++)
            System.out.print(arr1[i]+" ");
        System.out.println();
        /**
         * If we do not initialize the array elements , they will be auto initialized to the default values depending on the data type as below
         * int - 0
         * double - 0.0
         * string - null
         * boolean - false
         * User Defined Type - null
         */
        int[] arr2=new int[5]; //Every element is auto initialized to 0 in case of integer array.
        arr2[0]=3;
        arr2[3]=5;
        for(int i=0;i<arr2.length;i++)
            System.out.print(arr2[i]+" ");
        System.out.println();

        Person[] arr3=new Person[2]; // arr3 is an array which can hold 2 objects of type class Person.
        arr3[0]=new Person("Praveen",1999);
        arr3[1]=new Person("Sandeep",1997);
        for(int i=0;i<arr3.length;i++)
           arr3[i].displayDetails();
    }
}