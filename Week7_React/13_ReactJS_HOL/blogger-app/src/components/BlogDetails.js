import React from 'react';

export default function BlogDetails() {
  const blogs = [
    { title: "React Conditional Rendering", author: "John Doe" },
    { title: "Understanding React Hooks", author: "Jane Smith" },
    { title: "State Management in React", author: "Michael Brown" },
    { title: "Optimizing React Performance", author: "Sarah Lee" },
    { title: "React vs Vue vs Angular", author: "David Wilson" },
  ];

  return (
    <div>
      <h2>Blog Details</h2>
      <ul style={{listStyleType: "none" }}>
        {blogs.map((blog, index) => (
          <li key={index} style={{ marginBottom: "10px" }}>
            <strong>Title:</strong> {blog.title} <br />
            <strong>Author:</strong> {blog.author}
          </li>
        ))}
      </ul>
    </div>
  );
}
