import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    @Mock
    Feline feline;

    @Test
    public void checkGetKittensMethod() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int expectedKittensCount = 3;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittensCount);

        Assert.assertEquals("Неправильное количество котят", expectedKittensCount, lion.getKittens());
    }

    @Test
    public void checkGetFoodMethod() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> normalFood = List.of("Мясо");
        Mockito.when(feline.getFood("Хищник")).thenReturn(normalFood);

        Assert.assertEquals("Неправильный список еды", normalFood, lion.getFood());
    }

    @Test
    public void checkDoesHaveManeMethod() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean hasMane = true;

        Assert.assertEquals("Метод вернул неправильное значение", hasMane, lion.doesHaveMane());
    }

    @Test
    public void checkLionCreationWithException() {
        try {
            new Lion("Не указан", feline);
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}
