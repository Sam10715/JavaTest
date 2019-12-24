import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathClassTest {
    private MathClass mathClass;

    @BeforeAll
   static void  beforeAll(){

        System.out.println("first");
    }

    @BeforeEach
    void beforeEach(){
        mathClass = new MathClass();
        System.out.println("samer");
    }


    @Test
    void sum() {
        mathClass.setNumber1(1);
        mathClass.setNumber2(2);

        Assertions.assertTrue(mathClass.sum()<0,"test is not good");

    }


}