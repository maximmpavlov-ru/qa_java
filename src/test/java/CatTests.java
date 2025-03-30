import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTests {
    @Mock
    Feline feline;

    @Test
    public void testGetSoundMethod() {
        String normalSound = "Мяу";

        Assert.assertEquals("Этот кот издает неправильные звуки", normalSound, new Cat(feline).getSound());
    }

    @Test
    public void testGetFoodMethod() throws Exception {
        List<String> normalListOfFood = List.of("Мясо", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(normalListOfFood);

        Assert.assertEquals("Наш кот такое есть не любит", normalListOfFood, new Cat(feline).getFood());
    }
}
