import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [selected, setSelected] = useState("book");

  // Conditional Rendering using if-else
  const renderComponentIfElse = () => {
    if (selected === "book") {
      return <BookDetails />;
    } else if (selected === "blog") {
      return <BlogDetails />;
    } else if (selected === "course") {
      return <CourseDetails />;
    } else {
      return <h2>No Component Selected</h2>;
    }
  };

  return (
    <div style={{ textAlign: "center", marginTop: "30px" }}>
      <h1>Blogger App</h1>
      <hr />
      {/* <h2>Component Rendered using If-Else (3 Columns)</h2> */}

      {/* 3-column layout */}
      <div style={{
        display: "grid",
        gridTemplateColumns: "repeat(3, 1fr)",
        gap: "20px",
        marginTop: "20px",
        padding: "20px"
      }}>
        <div style={{ border: "2px solid green", borderRadius: "8px", padding: "10px"}}>
          <BookDetails />
        </div>
        <div style={{ border: "2px solid green", borderRadius: "8px", padding: "10px"}}>
          <BlogDetails />
        </div>
        <div style={{ border: "2px solid green", borderRadius: "8px", padding: "10px"}}>
          <CourseDetails />
        </div>

      </div>
    </div>
  );
}

export default App;
