import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> age = new ArrayList<>();
    public static ArrayList<String> name = new ArrayList<>();

    public static void main(String[] args) {
            name.add("Anna");
            age.add(18);
            name.add("Victoria");
            age.add(20);
            name.add("Jose");
            age.add(21);
            getMenu();

        }
            public static void getMenu () {
                 Student[] stud = new Student[100];
                Scanner sc = new Scanner(System.in);
                while
                (true) {

                    int select;
                    System.out.println("1. Add Entry");
                    System.out.println("2. View Entry");
                    System.out.println("3. Update Entry");
                    System.out.println("4. Delete Entry");
                    System.out.println("0. Exit");
                    System.out.println("Select an Option:");
                    select = sc.nextInt();

                    switch (select) {
                        case 1:
                            addStud(stud);
                            break;
                        case 2:
                            viewStud(stud);
                            break;
                        case 3:
                            updateStud(stud);
                            break;
                        case 4:
                            delStud(stud);
                            break;
                        case 0:
                            break;

                    }
                }

            }
            public static void updateStud(Student[]stud){
        Scanner uPd = new Scanner(System.in);
        Scanner newaGe = new Scanner(System.in);
        Scanner newnAme = new Scanner(System.in);
        System.out.println("Update Entry");
        System.out.print("Enter name you want to update: ");
        String upd = uPd.nextLine();
        int i;
        boolean nameFound = false;
        for(i = 0; i < name.size(); i++){
            if(name.get(i) == null ? upd == null : name.get(i).equals(upd)){
                nameFound = true;
                break;
            }
        }
        if(nameFound){
            System.out.print("Enter new name: ");
            String newName = newnAme.nextLine();
            name.set(i, newName);
            System.out.print("\nEnter new age: ");
            int newAge = newaGe.nextInt();
            age.set(i, newAge);
        }
        else{
            System.out.println("No " + upd + " is in the list");
        }
        getMenu();
    }
    public static void viewStud(Student[]stud){
        int i;
        for(i = 0; i < name.size(); i++){
            System.out.println(name.get(i) + "\tis\t" + age.get(i));
        }
        getMenu();
    }
    public static void delStud(Student[]stud){
        Scanner dEl = new Scanner(System.in);
        System.out.println("Delete Entry");
        System.out.print("Enter name to delete: ");
        String del = dEl.nextLine();
        int i;
        boolean nameFound = false;
        for(i = 0; i < name.size(); i++){
            if(name.get(i) == null ? del == null : name.get(i).equals(del)){
                nameFound = true;
                break;
            }
        }
        if(nameFound){
            name.remove(del);
            age.remove(i);
            System.out.println(del + " is deleted!");
        }
        else{
            System.out.println(del + " doesn't exist.");
        }
        getMenu();
    }
            public static void addStud (Student[]stud){
                Scanner sc = new Scanner(System.in);
                int numAge ;
                String userName;

                int addMore;
                int i = 0;

                do {
                    System.out.println("2. Enter Name");
                    userName = sc.nextLine();
                    name.add(userName);
                    sc.nextLine();

                    System.out.println("1. Enter Age: ");
                    numAge = sc.nextInt();
                    stud[i] = new Student (numAge, userName);
                    ++i;
                    age.add(numAge);

                    System.out.println("To add another Record Press 1");
                    System.out.println("Press 0 To Exit");
                    addMore = sc.nextInt();
                    getMenu();
                }
                while (addMore == 1);

            }

}



