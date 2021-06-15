/**
 * @author Praveen Reddy Chalamalla
 * @create date 2021-06-14
 * @desc Main Method in enum. Java enumeration are Class Types. The keyword enum defines a class in java, hence it can have a main method also.
 */
enum LearnEnumMainMethod {
    C, CPP, JAVA, PYTHON;
    public static void main(String[] args) {
        LearnEnumMainMethod language=LearnEnumMainMethod.JAVA;
        System.out.println(language);
    }
}
