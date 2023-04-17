public class Accountant extends Employee {



    public Accountant(String employeeName, int employeeId,  String employeeDateOfBirth) {
        super(employeeName, employeeId, Consts.ACCAUNTANT_DEFAULT_SALARY, Consts.ACCOUNTANT_TYPE, employeeDateOfBirth);
    }

   public void createReport(){

       System.out.println("Report created");
   }
}
