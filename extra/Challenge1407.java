/*
Challenge # 1407
by, Ashutosh Sharma

You teach Java-programming at OLS School. You need to set the question-paper for the
upcoming First Terminal Examinations. Maximum marks for the exam are 80. You can assign
individual questions of 2, 3 or 12 marks. Before you start typing the question-paper you want to
be sure about the number of questions you’ll be assigning to be answered.
You can set marking scheme as per the given criteria;
1. Exam can be theory-based, in which you’ll want to include maximum 2 programs of 12-
marks each (rest of the questions will be of 3 and/or 2 marks)
2. Exam can be practical-based, in which you’ll want to include at-least 6 programs of 12-
marks each (rest of the questions will be of 3 and/or 2 marks)
3. Exam can be ICSE-pattern based, in which 32-marks will comprise of theoretical
questions (2 and/or 3 marks) and 48-marks will be from programs (4 questions of 12
marks each)
Create the following functions to do above work for you, so that you know how many questions
of which category you need to type if you choose a theoretical, practical or ICSE-based
approach:
public void theoretical()
public void practical()
public void icse()
Sample:
theoretical() → TH: 2 questions of 12 marks, 18 questions of 3 marks and
1 questions of 2 marks
practical() → PR: 6 questions of 12 marks, 2 questions of 3 marks and 1
questions of 2 marks
icse() → ICSE: 4 questions of 12 marks, 10 questions of 3 marks and 1 questions of 2 marks
*You can manipulate questions carrying 2 or 3 marks any way you want
 */
class Challenge1407
{
    public void theoretical()
    {
        int n12 = 2;
        int marks = 80 - n12*12;;
        int n3 = marks/3;
        marks = marks%3;
        int n2 = marks/2;
        System.out.println("TH: "+n12+" questions of 12 marks, "+n3+" questions of 3 marks and "+n2+" questions of 2 marks");
    }
    
    public void practical()
    {
        int n12 = 6;
        int marks = 80 - n12*12;
        int n3 = marks/3;
        marks = marks%3;
        int n2 = marks/2;
        System.out.println("PR: "+n12+" questions of 12 marks, "+n3+" questions of 3 marks and "+n2+" questions of 2 marks");
    }

    public void icse()
    {
        int n12 = 4;
        int marks = 80 - n12*12;
        int n3 = marks/3;
        marks = marks%3;
        int n2 = marks/2;
        System.out.println("ICSE: "+n12+" questions of 12 marks, "+n3+" questions of 3 marks and "+n2+" questions of 2 marks");
    }
    
    public static void main(String args[])
    {
        Challenge1407 o = new Challenge1407();
        o.theoretical();
        o.practical();
        o.icse();
    }
}