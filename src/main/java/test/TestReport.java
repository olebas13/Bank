package test;

import data.DataSource;
import domain.AccumulateSavingsBatch;
import reporting.CustomerReport;

import java.io.IOException;
import java.util.Locale;

public class TestReport {

    private static final String USAGE = "USAGE: java test.TestReport <DataFilePath>";

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);

        if (args.length != 1) {
            System.out.println(USAGE);
        } else {
            String dataFilePath = args[0];

            try {
                System.out.println("Reading data file: " + dataFilePath);

                DataSource dataSource = new DataSource(dataFilePath);
                dataSource.loadData();

                CustomerReport report = new CustomerReport();
                report.generateReport();

                AccumulateSavingsBatch jobRate = new AccumulateSavingsBatch();
                jobRate.doBatch();

                report.generateReport();

            } catch (IOException ioe) {
                System.out.println("Could not load the data file.");
                System.out.println(ioe.getMessage());
                ioe.printStackTrace(System.err);
            }
        }


    }
}
