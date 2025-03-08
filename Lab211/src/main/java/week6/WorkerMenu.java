package week6;

import java.util.ArrayList;

public class WorkerMenu {

    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
        while (true) {
            int choice = WorkerManagement.menu();
            switch (choice) {
                case 1:
                    WorkerManagement.addWorker(lw);
                    break;
                case 2:
                    WorkerManagement.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    WorkerManagement.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    WorkerManagement.printListHistory(lh);
                    break;
                case 5:
                    return;
            }
        }
    }
}