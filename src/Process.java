import java.util.Arrays;

public class Process {
    public static void main(String[] args) {
        QueueList female = new QueueList(5);
        QueueList male = new QueueList(5);
        QueueList all = new QueueList(10);

        Staff staff1 = new Staff("A1",15,"FEMALE");
        Staff staff2 = new Staff("A2",16,"FEMALE");
        Staff staff3 = new Staff("A3",17,"MALE");
        Staff staff4 = new Staff("A4",18,"MALE");
        Staff staff5 = new Staff("A5",19,"FEMALE");
        Staff staff6 = new Staff("A6",20,"MALE");
        Staff[] employees = {staff1,staff2,staff3,staff4,staff5,staff6};
        sortByAge(employees);
        for (int i=0; i<employees.length;i++) {
            if (employees[i].getGender().equals("MALE"))
                male.enqueue(employees[i]);
            else
                female.enqueue(employees[i]);

        }


        System.out.println(Arrays.toString(male.getArray()));
        System.out.println(Arrays.toString(female.getArray()));
    }
    public static void sortByAge(Staff[] array){
        Staff temp = array[0];
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1;j<array.length;j++){
                if(array[i].getAge()> array[j].getAge())
                    temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
    }
}

