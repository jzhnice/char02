package Demo05;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-24 10:25
 */
public class Demo02 {


        static int i = 1, j = 2;

        static {
            display(i);
            i = i + j;
        }

        static void display(int n) {
            System.out.println(n);
        }

        public static void main(String[] args) {

            display(i);
        }
    }

