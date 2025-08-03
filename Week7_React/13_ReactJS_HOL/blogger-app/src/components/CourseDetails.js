import React from 'react';

export default function CourseDetails() {
  const courses = [
    { name: "Full Stack Web Development", duration: "6 months" },
    { name: "Data Structures & Algorithms in Java", duration: "4 months" },
    { name: "Python for Data Science", duration: "3 months" },
    { name: "Machine Learning with TensorFlow", duration: "5 months" },
    { name: "React & Redux Mastery", duration: "2 months" },
  ];

  return (
    <div>
      <h2>Course Details</h2>
      <ul style={{listStyleType: "none" }}>
        {courses.map((course, index) => (
          <li key={index} style={{ marginBottom: "10px" }}>
            <strong>Course Name:</strong> {course.name} <br />
            <strong>Duration:</strong> {course.duration}
          </li>
        ))}
      </ul>
    </div>
  );
}
