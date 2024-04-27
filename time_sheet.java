import java.io.PrintWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.Math;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class time_sheet<T> {
    private Node<T> head;
    int Numrow = 0;
    int Numcol = 0;

    public time_sheet() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public int getNumRows() {
        return Numrow;
    }

    public int getNumCols() {
        return Numcol;
    }

    public void writeSheet(int time, int hours, String day) {

    }
}
