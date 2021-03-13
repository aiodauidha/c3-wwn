USE test;

SELECT SNO, Score
FROM Choose
WHERE Score < (SELECT Score FROM Choose WHERE SNO = (SELECT SNO FROM Student WHERE Name = "张三") AND
 CourseID = "C1") AND CourseID = "C1";