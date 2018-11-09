package test;

import org.apache.commons.cli.*;

public class OptionsTip {

    public static void main(String[] args) {
        try {
            Options opt = new Options();
            opt.addOption("h",false, "Print help for this application");
            opt.addOption("u", true, "The username to use");
            opt.addOption("dsn", true, "The data source to use");

            BasicParser parser = new BasicParser();
            CommandLine cl = parser.parse(opt, args);
            if (cl.hasOption('h')) {
                HelpFormatter f = new HelpFormatter();
                f.printHelp("OptionsTip", opt);
            } else {
                System.out.println(cl.getOptionValue("u"));
                System.out.println(cl.getOptionValue("dsn"));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
