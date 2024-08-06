// import logo from './logo.svg';
// import './App.css';
//
// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }
//
// export default App;
// frontend/src/App.js
import React, { useEffect, useState } from 'react';
import { getAllUsers } from './Api';

const App = () => {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    getAllUsers().then(response => {
      setUsers(response.data);
    });
  }, []);

  return (

      <div>

        <h1>Users</h1>
        <ul>
          {users.map(user => (
              <li key={user.name}>{user.name} {user.surname}</li>
          ))}
        </ul>
      </div>

  );
}

export default App;
