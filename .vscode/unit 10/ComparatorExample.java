import java.util.*;
public class ComparatorExample {
    public static void main(String args[]){
        ArrayList<Student> a1=new ArrayList<Student>();
        int n,roll,age,i;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.print("no of Students: ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter rollno,name and age: ");
            roll =sc.nextInt();
            name=sc.next();
            age=sc.nextInt();
            a1.add(new Student(roll,name,age));
        }
        System.out.println("\nSorting by Name");
        Collections.sort(a1,new NameComparator());
        for(Student st:a1){
            System.out.println(st.rollno+" "+st.name+" "+st.age);

        }
        System.out.println("\n\nSorting by age");
        Collections.sort(a1,new AgeComparator());
        for(Student st:a1){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
