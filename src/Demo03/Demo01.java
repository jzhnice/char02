package Demo03;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-24 09:31
 */
public class Demo01 {
        public static void main(String[] args) {
            cat cat = null;
            for (int i = 0; i < 5; i++) {
                cat = new cat();
                new Dog();
            }
            System.out.println(cat.counter);
            System.out.println(Dog.counter);
        }
    }




