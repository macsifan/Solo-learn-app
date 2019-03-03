package Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner in = new Scanner(System.in);
        String passwordSign = in.nextLine();
        for (int index = 0; index < passwordSign.length(); index++) {
            if (((int) passwordSign.charAt(index) >= 97 && (int) passwordSign.charAt(index) <= 122) || ((int) passwordSign.charAt(index) >= 65 && (int) passwordSign.charAt(index) <= 90) || ((int) passwordSign.charAt(index) >= 48 && (int) passwordSign.charAt(index) <= 57)) {
            } else {
                System.out.println("Enter Valid");
            }
        }

        String password = in.nextLine();


        PrintWriter printWriter = new PrintWriter(new FileOutputStream("users", true));
        printWriter.append(passwordSign + " " + password + "\n");
        printWriter.close();


        Scanner it = new Scanner(new FileInputStream("users"));
        while (it.hasNextLine()) {
            System.out.println(it.nextLine());
        }


        System.out.println("Enter");
        String nickname1 = in.nextLine();
        String password1 = in.nextLine();
        String res = nickname1 + " " + password1;
        System.out.println(res);

        Scanner it1 = new Scanner(new FileInputStream("users"));
        while (it1.hasNextLine()) {
            if (it1.nextLine().equals(res)) {
                System.out.println("yes");
            }
        }
        it.close();
    }
}
