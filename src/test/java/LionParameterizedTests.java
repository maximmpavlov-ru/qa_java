import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParameterizedTests {
    @Mock
    Feline feline;

    private final String sex;
    private final boolean hasMane;

    public LionParameterizedTests(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] lionTestsData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkLionWithParameters() throws Exception {
        Assert.assertEquals("Грива должна быть только у льва", hasMane, new Lion(sex, feline).doesHaveMane());
    }
}
