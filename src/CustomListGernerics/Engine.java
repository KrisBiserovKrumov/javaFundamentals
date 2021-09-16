package CustomListGernerics;

import java.util.Scanner;

public class Engine implements Runnable{
    private static final String END_COMAND = "END";
    private Scanner scanner;
    private String input;
    private CommandParser commandParser;

    public Engine(){
        this.scanner = new Scanner(System.in);
        this.input = "";
        this.commandParser = new CommandParser();

    }

    @Override
    public void run() {
        this.input = this.scanner.nextLine();
        while (!this.input.equals(Engine.END_COMAND)){
            this.commandParser.execute(this.input);

            this.input = this.scanner.nextLine();

        }

    }
}
