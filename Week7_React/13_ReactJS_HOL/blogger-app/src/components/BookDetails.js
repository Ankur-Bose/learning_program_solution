import React from 'react';

export default function BookDetails() {

  const books = [
    { title: "Learning React", author: "AB" },
    { title: "JavaScript: The Good Parts", author: "Douglas Crockford" },
    { title: "Eloquent JavaScript", author: "Marijn Haverbeke" },
    { title: "You Don’t Know JS", author: "Kyle Simpson" },
    { title: "Clean Code", author: "Robert C. Martin" },
  ];

  return (
    <div>
      <h2>Book Details</h2>
      <ul style={{listStyleType: "none" }}>
        {books.map((book, index) => (
          <li key={index} style={{ marginBottom: "10px" }}>
            <strong>Title:</strong> {book.title} <br />
            <strong>Author:</strong> {book.author}
          </li>
        ))}
      </ul>
    </div>
  );
}
