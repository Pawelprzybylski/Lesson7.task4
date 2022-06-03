import org.junit.Assert;
import org.junit.Test;

public class ConverterMinutesToSecondsTest {
    @Test
    public void shouldConvertionMinutesToSeconds() {
        //given
        int minutes = 50;

        //when
        int conversion = ConverterMinutesToSeconds.convertMinutesToSeconds(minutes);

        //then
        Assert.assertEquals(3000,
                conversion);
    }

}
