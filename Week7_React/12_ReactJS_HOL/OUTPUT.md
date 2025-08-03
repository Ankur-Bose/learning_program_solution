
# 📘 React Rendering Concepts Lab

This document explains important React concepts including conditional rendering, using element variables, and techniques to prevent component rendering.

## 🧾 Table of Contents

- Conditional Rendering in React
- Element Variables
- Preventing Component Rendering

## 🔹 Conditional Rendering in React

Conditional rendering in React allows you to render different UI elements based on certain conditions.

It works the same way conditions work in JavaScript.

### Example using if-else:

```javascript
function Greeting(props) {
  if (props.isLoggedIn) {
    return <h1>Welcome back!</h1>;
  }
  return <h1>Please sign up.</h1>;
}
```

### Example using ternary operator:

```javascript
<button onClick={handleClick}>
  {isLoggedIn ? 'Logout' : 'Login'}
</button>
```

### Example using logical AND (&&):

```javascript
{messages.length > 0 && <h2>You have {messages.length} unread messages.</h2>}
```

## 🔹 Element Variables

Element variables can be used to store elements and help in conditionally rendering parts of components.

### Example:

```javascript
let button;
if (isLoggedIn) {
  button = <LogoutButton onClick={handleLogoutClick} />;
} else {
  button = <LoginButton onClick={handleLoginClick} />;
}

return (
  <div>
    {button}
  </div>
);
```

Using element variables makes the render logic cleaner and more manageable.

## 🔹 Preventing Component Rendering

You can prevent a component from rendering by returning `null` in its render method or function body.

### Example:

```javascript
function WarningBanner(props) {
  if (!props.warn) {
    return null; // Prevents rendering
  }

  return <div className="warning">Warning!</div>;
}
```

In this example, the `WarningBanner` component will not render anything if `props.warn` is false.

---

## Output
![screenshot](screenshot/screenshot1.png)
![screenshot](screenshot/screenshot2.png)

---

✨ These techniques help control what renders in a React application, making your UI more dynamic and responsive to application state.
