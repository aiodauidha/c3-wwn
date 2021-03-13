USE test;

SELECT CourseID,CourseName
FROM Course
WHERE CourseBeforeID IS NULL;