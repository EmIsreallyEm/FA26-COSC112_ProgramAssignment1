import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EmpSalaryInc {

    public static void main(String[] args) throws IOException {

        Scanner employeeFile = new Scanner(new File("src/EmpData.txt"));
        FileWriter file = new FileWriter("EmpDataOutput.dat");

        String lastName = employeeFile.next();
        String firstName = employeeFile.next();
        double salary = employeeFile.nextDouble();
        double percent = employeeFile.nextDouble();

        double newSalary = salary + (salary * percent / 100);

        JOptionPane.showMessageDialog(null,
                "Employee name: " + lastName + ", " + firstName +
                        "\nCurrent salary: $" + String.format("%.2f", salary) +
                        "\n% pay rise: " + percent + "%" +
                        "\n==== New salary amount: $" + String.format("%.2f", newSalary));

        file.write("Employee name: " + lastName + ", " + firstName +
                "\nCurrent salary: $" + String.format("%.2f", salary) +
                "\n% pay rise: " + percent + "%" +
                "\n==== New salary amount: $" + String.format("%.2f", newSalary));

        employeeFile.close();
        file.close();
    }
}


