// Q19: PayrollSystem - net salary after tax slabs
class PayrollSystem {
    double calculateNetSalary(double income) {
        double taxRate;
        if (income <= 250000) {
            taxRate = 0;        // no tax
        } else if (income <= 500000) {
            taxRate = 0.05;     // 5%
        } else if (income <= 1000000) {
            taxRate = 0.20;     // 20%
        } else {
            taxRate = 0.30;     // 30%
        }
        double tax = income * taxRate;
        System.out.println("Income = " + income + ", Tax = " + tax);
        return income - tax;
    }
}

public class Q19 {
    public static void main(String[] args) {
        PayrollSystem p = new PayrollSystem();
        System.out.println("Net salary = " + p.calculateNetSalary(200000));
        System.out.println("Net salary = " + p.calculateNetSalary(400000));
        System.out.println("Net salary = " + p.calculateNetSalary(800000));
        System.out.println("Net salary = " + p.calculateNetSalary(1500000));
    }
}
