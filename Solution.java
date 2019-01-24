import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
int m = Integer.parseInt(reader.readLine());
int n = Integer.parseInt(reader.readLine());

String str = "8"; 


for (int i = 0; i < m; i++ ){
    
    for (int k = 0; k < n; k++){
        System.out.print(str);
    }
     System.out.println(str);
}


    }
}
