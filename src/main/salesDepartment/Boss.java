package main.salesDepartment;

import java.io.FileWriter;
import java.io.IOException;

public class Boss {
    public void generateGlobalReport(Manager[] managers) throws IOException {
        double globalPriceSum = 0;
        double globalSelfPriceSum = 0;
        FileWriter fileWriter = new FileWriter("D:\\Java_projects\\Toyota_project\\data\\globalReport.txt");
        for (Manager manager : managers) {
            String reporting = manager.getName() + " - " +
                               manager.getPriceSum() + " - " +
                               manager.getSelfPriceSum() + " - " +
                               (manager.getPriceSum() - manager.getSelfPriceSum());
            fileWriter.write(reporting + "\n");
            globalPriceSum += manager.getPriceSum();
            globalSelfPriceSum += manager.getSelfPriceSum();
        }
        String reporting = "Итого: " + globalPriceSum + ", " + globalSelfPriceSum + ", " + (globalPriceSum - globalSelfPriceSum);
        fileWriter.write(reporting + "\n");
        fileWriter.close();
    }
}
