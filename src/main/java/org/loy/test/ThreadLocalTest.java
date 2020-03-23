package org.loy.test;

public class ThreadLocalTest {

    public String myTest(){
        return "loy";
    }
    @Transactional
    public static void main(String[] args) {
  /*      ThreadLocal<String> loyLocal = new ThreadLocal<String>(){
            @Override
            protected String initialValue() {
                return super.initialValue();
            }
        };*/

        ThreadLocalTest my = new ThreadLocalTest(){
            @Override
            public String myTest() {
                return "myloy";
            }
        };

        System.out.println(my.myTest());
    }

}
