import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GetGradeTest {

    static GradingCalculator gradingCalculator;

    @BeforeAll
    public static void initialize() {
        gradingCalculator= new GradingCalculator(0 ,0);
    }

    @Test
    public void TestGetGradeWhenGetGrade_95_90_ThenResult_A() {
        //Arrange
        gradingCalculator.score =95;
        gradingCalculator.attendancePercentage = 90;

        //Act
        char gradeAwait = 'A';

        //Assert
        Assertions.assertEquals(gradeAwait, gradingCalculator.getGrade());
    }

    @Test
    public void TestGetGradeWhenGetGrade_85_90_ThenResult_B() {
        //Arrange
        gradingCalculator.score =85;
        gradingCalculator.attendancePercentage = 90;

        //Act
        char gradeAwait = 'B';

        //Assert
        Assertions.assertEquals(gradeAwait, gradingCalculator.getGrade());
    }

    @Test
    public void TestGetGradeWhenGetGrade_65_90_ThenResult_C() {
        //Arrange
        gradingCalculator.score =65;
        gradingCalculator.attendancePercentage = 90;

        //Act
        char gradeAwait = 'C';

        //Assert
        Assertions.assertEquals(gradeAwait, gradingCalculator.getGrade());
    }

    @Test
    public void TestGetGradeWhenGetGrade_95_65_ThenResult_B() {
        //Arrange
        gradingCalculator.score =95;
        gradingCalculator.attendancePercentage = 65;

        //Act
        char gradeAwait = 'B';

        //Assert
        Assertions.assertEquals(gradeAwait, gradingCalculator.getGrade());
    }

    @Test
    public void TestGetGradeWhenGetGrade_95_55_ThenResult_F() {
        //Arrange
        gradingCalculator.score =95;
        gradingCalculator.attendancePercentage = 55;

        //Act
        char gradeAwait = 'F';

        //Assert
        Assertions.assertEquals(gradeAwait, gradingCalculator.getGrade());
    }

    @Test
    public void TestGetGradeWhenGetGrade_65_55_ThenResult_F() {
        //Arrange
        gradingCalculator.score =65;
        gradingCalculator.attendancePercentage = 55;

        //Act
        char gradeAwait = 'F';

        //Assert
        Assertions.assertEquals(gradeAwait, gradingCalculator.getGrade());
    }

    @Test
    public void TestGetGradeWhenGetGrade_50_90_ThenResult_F() {
        //Arrange
        gradingCalculator.score =50;
        gradingCalculator.attendancePercentage = 90;

        //Act
        char gradeAwait = 'F';

        //Assert
        Assertions.assertEquals(gradeAwait, gradingCalculator.getGrade());
    }

}

