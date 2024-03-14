import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(in);
            FileWriter out = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(out);
            String line;
            while ((line = br.readLine()) != null) {
              
                String modifiedLine = line.replaceAll("Nha Trang", "Vũng Tàu");
                bw.write(modifiedLine);
                bw.newLine(); 
            }
            bw.close();
            out.close();
            br.close();
            in.close();
            System.out.println("Thực hiện thay thế và ghi file output.txt thành công.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đã xảy ra lỗi khi thực hiện thay thế và ghi file output.txt.");
        }
    }
}
