# 📘 React JSX Hands-on Lab

This document introduces **JSX (JavaScript XML)**, explains how it integrates with React to create dynamic UIs, and demonstrates how to render elements to the DOM. It also provides hands-on tasks to help you practice using JSX, inline CSS, and JavaScript expressions in React applications.

---

## 🧾 Table of Contents

- [What is JSX?](#what-is-jsx)
- [What is ECMAScript?](#what-is-ecmascript)
- [React.createElement()](#reactcreateelement)
- [Creating React Nodes with JSX](#creating-react-nodes-with-jsx)
- [Rendering JSX to the DOM](#rendering-jsx-to-the-dom)
- [Using JavaScript Expressions in JSX](#using-javascript-expressions-in-jsx)
- [Using Inline CSS in JSX](#using-inline-css-in-jsx)

---

## 🔹 What is JSX?

**JSX (JavaScript XML)** is a syntax extension for JavaScript used in React.  
It allows you to write HTML-like code within JavaScript, which React transforms into `React.createElement()` calls.

Example:

```javascript
const element = <h1>Hello, JSX!</h1>;
```

---

## 🔹 What is ECMAScript?

**ECMAScript (ES)** is the standard on which JavaScript is based.  
Modern React applications rely on **ES6+ features** like:

- `let` and `const`
- Arrow functions
- Template literals
- Destructuring
- Modules (`import` and `export`)

---

## 🔹 React.createElement()

Before JSX, React elements were created manually using `React.createElement()`:

```javascript
const element = React.createElement(
  'h1',
  { className: 'title' },
  'Hello, React!'
);
```

- First parameter → HTML tag or React component  
- Second parameter → Props (attributes)  
- Third parameter → Child content

JSX is **syntactic sugar** for this function call.

---

## 🔹 Creating React Nodes with JSX

JSX simplifies creating React nodes:

```javascript
const element = <h1 className="title">Hello, React with JSX!</h1>;
```

- React automatically translates this into `React.createElement()` internally.
- JSX **must have a single parent element**.

---

## 🔹 Rendering JSX to the DOM

Use `ReactDOM.render()` (or `createRoot` in React 18+) to render JSX into the DOM.

Example:

```javascript
import React from 'react';
import ReactDOM from 'react-dom/client';

const element = <h1>Hello, React!</h1>;

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(element);
```

---

## 🔹 Using JavaScript Expressions in JSX

You can embed **JavaScript expressions** in JSX using `{}`:

```javascript
const name = "Alice";
const element = <h2>Hello, {name}!</h2>;
```

- Any valid JS expression can be used: variables, function calls, arithmetic, ternary operators.

---

## 🔹 Using Inline CSS in JSX

Inline CSS is written as **JavaScript objects** using camelCase for property names:

```javascript
const styleObj = {
  color: 'blue',
  backgroundColor: 'lightyellow',
  padding: '10px'
};

const element = <h1 style={styleObj}>Styled with Inline CSS</h1>;
```

- Keys → CamelCase CSS properties  
- Values → Strings or variables

---

## 🧪 Hands-on Lab Tasks

1. Create a React element using **JSX** and render it to the DOM.
2. Display a **dynamic greeting** using JavaScript expressions in JSX.
3. Apply **inline CSS** to style a heading and paragraph.
4. Convert a **JSX element** to its equivalent `React.createElement()` manually.

---

## Output
![screenshot](screenshot/screenshot.png)

---

> ✨ This lab introduces JSX and teaches how to dynamically render and style elements in React.