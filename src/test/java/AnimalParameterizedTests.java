import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParameterizedTests {
    private final String animalKind;
    private final List<String> expectedListOfFood;

    public AnimalParameterizedTests(String animalKind, List<String> expectedListOfFood) {
        this.animalKind = animalKind;
        this.expectedListOfFood = expectedListOfFood;
    }

    @Parameterized.Parameters
    public static Object[][] animalTestsData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void checkAnimalWithParameters() throws Exception {
        Assert.assertEquals("Неправильный набор еды для этого вида животных",
                expectedListOfFood, new Animal().getFood(animalKind));
    }
}