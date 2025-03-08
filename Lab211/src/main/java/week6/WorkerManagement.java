package week6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class WorkerManagement {

    public static int menu() {
        System.out.println("1. Add worker.");
        System.out.println("2. Increase salary for worker.");
        System.out.println("3. Decrease for worker");
        System.out.println("4. Show adjusted salary worker information");
        System.out.println("5. Exit");
        return GetInput.checkInt("Enter your choice: ", 5);
    }

    public static void addWorker(ArrayList<Worker> lw) {
        String id = GetInput.get("Enter code: ");
        String name = GetInput.get("Enter name: ");
        int age = GetInput.checkInt("Enter age: ", 50);
        int salary = GetInput.checkInt("Enter salary: ");
        String workLocation = GetInput.get("Enter work location: ");

        lw.add(new Worker(id, name, age, salary, workLocation));
        System.err.println("Add success.");
    }

    public static void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status) {
        if (lw.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        String id = GetInput.get("Enter code: ");
        Worker worker = getWorkerByCode(lw, id);
        if (worker == null) {
            System.err.println("Worker not found.");
            return;
        }

        int salaryCurrent = worker.getSalary();
        int salaryUpdate;
        if (status == 1) {
            do {
                salaryUpdate = GetInput.checkInt("Enter new salary: ");
                if (salaryUpdate <= salaryCurrent) {
                    System.err.println("New salary must be greater than current salary.");
                }
            } while (salaryUpdate <= salaryCurrent);
            lh.add(new History("UP", getCurrentDate(), worker.getId(), worker.getName(), worker.getAge(), salaryUpdate, worker.getWorkLocation()));
        } else { 
            do {
                salaryUpdate = GetInput.checkInt("Enter new salary: ");
                if (salaryUpdate >= salaryCurrent) {
                    System.err.println("New salary must be less than current salary.");
                }
            } while (salaryUpdate >= salaryCurrent);
            lh.add(new History("DOWN", getCurrentDate(), worker.getId(), worker.getName(), worker.getAge(), salaryUpdate, worker.getWorkLocation()));
        }
        worker.setSalary(salaryUpdate);
        System.err.println("Update success.");
    }

    public static void printListHistory(ArrayList<History> lh) {
        if (lh.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.printf("%-5s%-15s%-5s%-10s%-10s%-20s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        Collections.sort(lh);
        for (History history : lh) {
            printHistory(history);
        }
    }

    public static Worker getWorkerByCode(ArrayList<Worker> lw, String id) {
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return worker;
            }
        }
        return null;
    }

    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }

    public static void printHistory(History history) {
        System.out.printf("%-5s%-15s%-5d%-10d%-10s%-20s\n", history.getId(), history.getName(), history.getAge(), history.getSalary(), history.getStatus(), history.getDate());
    }
}
