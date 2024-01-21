import './App.css';
import React, {useState} from 'react';

let b = 0;
function setB() {
  b+=1;
}
function App() {
  const [count, setCount] = useState(0);
  // const [a, setA] = useState(0);
  return (
    <div className="App back">
      <div className="card">
        <h1>Hook Example</h1>
        <h2>Use State!</h2>
        <p>
          Clicked {count} times
        </p>
        <button onClick={() => setCount(count + 1)} className="btn">Click me</button>
      </div>
      <div className="card">
        <h1>Hook Example Self</h1>
        <h2>Use A!</h2>
        <p>
          Clicked <strong>{b}</strong> times
        </p>
        <button onClick={() => setB()} className="btn">Click me</button>
      </div>
    </div>
  );
}

export default App;
/*

*/