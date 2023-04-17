public class Clerk extends Employee {



    public Clerk(String employeeName, int employeeId,  String employeeDateOfBirth) {
        super(employeeName, employeeId, Consts.CLERK_DEFAULT_SALARY, Consts.CLERK_TYPE, employeeDateOfBirth);
    }

    public void makeCall(String customerName){

        System.out.println(String.format("Connected to customer %s", customerName));
    }

    public void getCall(String customerName){

        System.out.println(String.format("Answered to customer %s", customerName));
    }
}
