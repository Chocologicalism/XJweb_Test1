import java.util.ArrayList;
public class Fibonacci{
    static int of(int p_index){
        ArrayList<Integer> r_results = new ArrayList<Integer>();
        r_results.add(0);
        r_results.add(1);
        for(int i = 1;i < p_index;i++){
            int temp = r_results.get(0) + r_results.get(1);
            r_results.remove(0);
            r_results.add(temp);
        }
        return r_results.get(1);
    }

    public static void main(String[] args){
        int limit = 200;
        for(int i = 1,temp = 0;temp <= limit;i++){
            temp = Fibonacci.of(i);
            if(temp <= limit){   
                System.out.print(temp + " ");
            }
        }
    }
}