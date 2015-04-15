// Implement getTeacherComment
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GradeBook
{
    private String[] studentNames;
    private int numStudents = 22;
    private String[] topicNames;
    private int numTopics = 5;
    private double[][] grades;
    private String fileName = "grades.txt";
    
    public GradeBook() 
    {
        studentNames = new String[numStudents];
        topicNames = new String[numTopics];
        grades = new double[numStudents][numTopics];
        readScoresFromFile(fileName);
    }
    
    /**
     * Adds up all the scores for one student and returns the result.
     * Only works for a valid student index.
     * @param studentIndex the row for the student whose total you want.
     * @return the sum of that student's scores, or -1 if the index is bad.
     */
    public double totalForStudent(int studentIndex)
    {
        if (studentIndex < 0 || studentIndex >= numStudents)
        {
            return -1;
        }
        double sum = 0;
        for (int j=0; j < numTopics; j++)
        {
            sum = sum + grades[studentIndex][j];
        }
        return sum;
    }
    
    /**
     * Calculates the totals for all the students and returns the results
     * in a completely filled array. The order of the totals matches the 
     * order of the names in studentNames.
     * @return a filled array of the total for each student. 
     */
    public double[] totalsForAllStudents()
    {
        double[] totals = new double[numStudents];
        for (int student = 0; student < numStudents; student++)
        {
            totals[student] = totalForStudent(student);
        }
        return totals;
    }
    
    /**
     * Calculates the column totals (the sum of of all students'
     * scores for one topic) for all topics in a completely filled array.
     * The order of the topcs matches the order of the topic names in 
     * topicNames. 
     * @return a filled array of the total for each topic.
     */
    public double[] totalsForAllTopics()
    {
        double[] topicTotals = new double[numTopics];
        for (int topic = 0; topic < numTopics; topic++)
        {
            double topicTotal = 0;
            for (int student = 0; student < numStudents; student++)
            {
                topicTotal = topicTotal + grades[student][topic];
            }
            topicTotals[topic] = topicTotal;
        }
        return topicTotals;
    }
    
    /**
     * Provides the grade and comment for each topic, 
     *     along with overall grade and comment
     * @return String with a summary of students results
     *     Student: xxxx
     *     Topic: xxxx  Grade: 999.9 Comment: xxxxx
     *     ...
     *     Overall: Grade: 999.9 Comment: xxxxx
     *      
     */
    public String getTeacherComment(int student)
    {
        String sResults = "Student: " + studentNames[student] + "\n";   // Format Student Line
        double overall = totalForStudent(student) / numTopics;
        
        for (int topic = 0; topic < numTopics; topic++)   // for each topic
        {
            sResults = sResults + "Topic: " + topicNames[topic] + "\tGrade: " + grades[student][topic] +
                       "\tComment:  " + getComment(grades[student][topic]) + "\n";
            
        }
        
        sResults = sResults + "\nOverall Grade: " + overall + "  Comment: " + getComment(overall) + "\n";
        
        return sResults;
           
    }
    
    /**
     * Provides a teacher comment for a grade  - assume 10 point scale
     * @param the grade to comment on
     * @return the comment in a string
     *     letter grade and comment  i.e. A - fantastic, B - good job,  C - could improve
     *     D - work harder,  F - need help - see me
     */
    public String getComment(double grade)
    {
        String sResults = "";
        
        if (grade >= 9.0)
        {
            sResults = "A - Fantastic Work";
        }
        else if (grade >= 8.0)
        {
            sResults = "B - Good Job";
        }
        else if (grade >= 8.0)
        {
            sResults = "C - could improve";
        }
        else if (grade >= 8.0)
        {
            sResults = "D - work harder";
        }
        else
        {
            sResults = "F - need help - See me after class!";
        }
        
        return sResults;
           
    }
    
    /**
     * Gets the student names. 
     * @return the student names. 
     */
    public String getStudents()
    {
        return Arrays.asList(studentNames).toString();
    }
    
    /**
     * Gets the topic names.
     * @return the names of the topics. 
     */
    public String getTopics()
    {
        return Arrays.asList(topicNames).toString();
    }
    
    public String getScores() {
        String prettyScores = "";
        for (int i = 0; i < 22; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                prettyScores += "\t" + grades[i][j];
            }
            prettyScores += "\n";
        }
        return prettyScores;
    }
    
    private void readScoresFromFile(String fileName)
    {
        try
        {
            Scanner in = new Scanner(new FileReader(fileName));
            String value = in.next();
            for (int i = 0; i < 5; i++)
            {
                topicNames[i] = in.next();
            }
            int i = 0;
            int j = 0;
            while (in.hasNext())
            {
                String name = in.next();
                studentNames[i] = name;
                while (in.hasNextDouble())
                {
                    grades[i][j] = in.nextDouble();
                    j++;
                }
                i++;
                j = 0;
            }
            System.out.println(i);
            
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("Did you delete the file with the grades?");
        }
    }
}
