package design;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/
    public static void main(String[] args) {

        System.out.println(EmployeeInfo.companyName);
        //Employee information
        EmployeeInfo Employee1 = new EmployeeInfo("Jannat", 1);
        //Employee ID
        EmployeeInfo Employee = new EmployeeInfo(1);
        //Employee Bonus
        EmployeeInfo.calculateEmployeeBonus(2, 12000, "Best");
        //Employee pension
        double pension = EmployeeInfo.calculateEmployeePension(12000);
    }

}


