/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input_outputstm;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ISAIAH SHELL
 */
import java.util.Scanner;
public class Fileinput_stream {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        IOWriter writernow = new IOWriter();

        IOReader readnow = new IOReader();
        readnow.readFromFile("C:\\Users\\ISAIAH SHELL\\Documents\\ReadFile PRac\\ReadNOW.txt");
        String data = scn.nextLine();
        writernow.writefile("C:\\Users\\ISAIAH SHELL\\Documents\\ReadFile PRac\\ReadNOW.txt" , data);
    }

}

class IOReader {

    public void readFromFile(String filename) {

        try ( FileInputStream stream = new FileInputStream(filename)) {

            int i = 0;

            while ((i = stream.read()) > -1) {
                char ii = (char) i;

                System.out.print(ii);

            }
        } catch (IOException ex) {
        }
    }

    //    public void readwithBufferReader(){
//        Ass
//    }
}

class IOWriter {

    public void writefile(String filename, String data) {
        try ( FileWriter writer = new FileWriter(filename , true)) {
            int i = 0;
            writer.write(data);
        } catch (Exception e) {
        }
    }
}




//read from file with BuffereReader
