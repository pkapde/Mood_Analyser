import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    MoodAnalyser moodAnalyser;

    @Test
    public void givenNullThrowException() {
        moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        }catch (MoodAnalyserException e) {
            Assert.assertEquals("Null Mood", e.getMessage());
        }
    }

    @Test
    public void givenEmptyThrowException() {
        moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyseMood();
        }catch (MoodAnalyserException e) {
            Assert.assertEquals("Empty Mood", e.getMessage());
        }
    }

}