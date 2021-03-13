USE test;

SELECT  max(Score),
				min(Score),
				sum(Score),
				avg(Score)
FROM Choose
WHERE CourseID = "C1";