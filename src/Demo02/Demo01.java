package Demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-24 09:02
 */
public class Demo01 {


        static {
            count = 20;
        }

        {
            size = 20;
            count = 30;
        }

        public int size = 10;
        public static int count = 10;

        public Demo01() {
            System.out.println("我是构造器");
            System.out.println( "size = "+ size );
            System.out.println( "count = "+ count );
        }

    }

