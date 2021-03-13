USE test;

SELECT  t1.SNO,
				t1.Name,
				t2.CourseName,
				t3.Score
FROM  Student t1,
			Course t2,
			Choose t3
WHERE t1.SNO = t3.SNO,
			t2.CourseID = t3.CourseID;-- 这道题不太明白该去怎么写