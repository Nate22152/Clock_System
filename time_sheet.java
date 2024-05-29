import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class time_sheet<T> {
    private Node<T> head;
    int Numrow = 0;
    int Numcol = 0;
    String info = "";

    public time_sheet() {
        this.head = null;
    }
    public Node<T> getHead(){
        return head;
    }
    public int getNumRows(){
        return Numrow;
    }
    public int getNumColumns(){
        return Numcol;
    }
    public String info() {
        return info;
    }
    // sets up the file into the node
    public void readFile(String filename) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean isHeader = true;
            int row = 0;

            while((line = br.readLine()) != null) {
                String[] values = line.split(" ");
                if(isHeader) {
                    isHeader = false;
                    continue;
                }
                
            }
        }
    }
    
}
