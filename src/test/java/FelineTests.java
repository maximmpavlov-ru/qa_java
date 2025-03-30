import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {
       Feline feline = new Feline();

    @Test
    public void checkEatMeatMethod() throws Exception {
        Assert.assertEquals("Это неправильная еда для хищника", feline.eatMeat(), feline.getFood("Хищник"));
    }

    @Test
    public void checkGetFamilyMethod() {
        String expectedFamilyName = "Кошачьи";

        Assert.assertEquals("Метод вернул неправильное семейство", expectedFamilyName, feline.getFamily());
    }

    @Test
    public void checkGetKittensDefaultMethod() {
        int expectedKittensCount = 1;

        Assert.assertEquals("Неправильное количество котят", expectedKittensCount, feline.getKittens());
    }

    @Test
    public void checkGetKittensWithInputMethod() {
        int expectedKittensCount = 3;

        Assert.assertEquals("Неправильное количество котят", expectedKittensCount, feline.getKittens(3));
    }
}
