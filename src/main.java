import java.io.*;

public class main {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/longdo/SumTextile/src/numbers.txt");

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bf.readLine())!= null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }

            bf.close();
            System.out.println("Sum is: " +sum);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
