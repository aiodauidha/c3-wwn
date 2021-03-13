USE test;

SELECT DISTINCT t1.SNO
FROM Student t1,
			Choose t2
WHERE t1.SNO = t2.SNO AND (t2.CourseID = "C1" OR t2.CourseID = "C3");