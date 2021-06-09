/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-03 
 * @desc Insights about classes, objects and methods in Java
 */
class Student{
    private String name;
    private int year_of_birth;
    private int year_of_death;
    private int curr_year;
    public Student(String name,int year_of_birth,int year_of_death,int curr_year){
        this.name=name;
        this.year_of_birth=year_of_birth;
        this.year_of_death=year_of_death;
        this.curr_year=curr_year;
    }
    public void displayDetails(){
        System.out.println("\nName : "+name);
        System.out.println("Year Of Birth : "+ Integer.toString(year_of_birth));
        System.out.println("Year Of Death : "+Integer.toString(year_of_death));
        System.out.println("Current Year : "+Integer.toString(curr_year));
    }
    public void lifeTime(){
        System.out.println(name + " Lived for "+Integer.toString(year_of_death-year_of_birth)) ;
    }

}
class LearnClassObjectsMethods{
    public static void main(String args[]) {
        Student p1=new Student("Ramu",1967, 1999, 2021);
        Student p2=new Student("Ravi",1970, 2007, 2021);
        Student p3=new Student("Hari",1980, 2015, 2021);
        p1.displayDetails();
        p1.lifeTime();
        p2.displayDetails();
        p2.lifeTime();
        p3.displayDetails();
        p3.lifeTime();
    }
}