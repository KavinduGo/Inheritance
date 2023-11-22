public class Employee {
    double sallery = 225785.99;

}
class Programmer extends Employee{
    int bonus = 25000;

    public static void main(String[] args) {
        Programmer pr = new Programmer();
        System.out.println("Programmer Sallery : " + pr.sallery);
        System.out.println("Programmer Bonus : " + pr.bonus);
        System.out.println("Programmer Income : " + (pr.bonus + pr.sallery));
    }

}
