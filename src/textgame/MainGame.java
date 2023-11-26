package sdf.day08.house;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine().trim();






            

            //Command Handling
            //the code checks if the user's input is not empty.
            //it creates a lineScanner to process the input and checks if the input contains a valid command.
            //depending on the command ("list," "add," "delete," or "stop"), it calls the corresponding method or displays an error message for invalid commands.
            if (!input.isEmpty()) {
                String command;
                Scanner lineScanner = new Scanner(input);
                if (lineScanner.hasNext()) {
                    command = lineScanner.next();

                    if (command.equals("list")) {
                        listItems(cart);
                    } else if (command.equals("add")) {
                        addItems(cart, input);
                    } else if (command.equals("delete")) {
                        deleteItems(cart, lineScanner);
                    } else if (command.equals("stop")) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
            }
        }
    }