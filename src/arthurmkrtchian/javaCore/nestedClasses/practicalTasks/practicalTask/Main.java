package arthurmkrtchian.javaCore.nestedClasses.practicalTasks.practicalTask;

//        Create class Department which contains field name of String type and field address of
//        Address type
//        • In class Department create inner class Address with city and street fields of String type and
//        building of type int
//        • In main method create an instance for one department and initialize it.
//        • Create one more department by cloning previous created department, change city for this
//        object
//        • Print information about all departments


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Department[] departments = new Department[4];

        Department department = new Department(
                "Department of Architecture",
                new Department.Address("Dnipro","O. Paul avenue", 2)
        );

        departments[0] = department;

        Department sDepartment = (Department) department.clone();
        sDepartment.setName("Department of Youth and Sports");
        sDepartment.setAddress(new Department.Address("Kyiv", "Bohdana Khmelnytskoho str", 7));

        departments[1] = sDepartment;

        Department cDepartment = (Department) department.clone();
        cDepartment.setName("Department of Culture");
        cDepartment.setAddress(new Department.Address("Lviv", "Svobodu avenue", 3));

        departments[2] = cDepartment;

        Department aDepartment = (Department) department.clone();
        aDepartment.setName("Department of Agriculture");
        aDepartment.setAddress(new Department.Address("Kherson", "Tavriuskiy avenue", 3));

        departments[3] = aDepartment;

        for (int i = 0; i < departments.length; i++) {
            System.out.println(departments[i].toString());
        }
    }

}
