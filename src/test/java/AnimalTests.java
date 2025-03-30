import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTests {

    @Test
    public void checkGetFamilyMethod() {
        String expectedMessage = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals("Неправильный список семейств", expectedMessage, new Animal().getFamily());
    }

    @Test
    public void checkGetFoodMethodWithException() {
        try {
            new Animal().getFood("Dial-up модем");
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}
