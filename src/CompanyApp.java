public class CompanyApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Peter Gibbons", "IT");
        System.out.println(emp.getName() + " works in " + emp.getDepartment());
        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }
    }

}
