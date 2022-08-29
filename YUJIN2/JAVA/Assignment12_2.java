import java.io.*;
import java.util.*;

import javax.print.DocFlavor.STRING;

public class  Assignment11{
    public static void main(String[] args) throws IOException {
        String s = "Empty vessels make the most sound";
        System.out.println("입력: " + s);
        String[] SplitArr = s.split( " ");
        System.out.println("단어 개수: " + SplitArr.length);
        Arrays.sort(SplitArr);
        System.out.println("정렬된 토큰: " + Arrays.toString(SplitArr));

        File file= new File( "sort.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(Arrays.toString(SplitArr));
        fw.close();
    }
}