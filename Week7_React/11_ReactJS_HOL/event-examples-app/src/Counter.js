import React, {useState} from 'react'

function Counter() {
  const [counterValue, setAdd] = useState(0)

  const addValue = () => {
    setAdd(counterValue + 1)
  }

  const delVal = () => {
    if (counterValue <= 0) {
      alert('Cannot go below 0')
    }
    else {
      setAdd(counterValue - 1)
    }
  }

  const welcomefunc = () => alert('welcome')

  const clickfunc = () => alert('I was clicked')

  return (
    <>
      <h2>Counter value : {counterValue}</h2>

      <button
        onClick={addValue}>Increment</button>
      <br />
      <button
        onClick={delVal}>Decrement</button>
      <br />
      <button
        onClick={welcomefunc}>Say welcome</button>
      <br />
      <button
        onClick={clickfunc}>Click on me</button>
    </>
  )
}

export default Counter