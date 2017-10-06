import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';

// window.addEventListener('beforeunload', (ev) =>
// {
//     ev.preventDefault();
//     return ev.returnValue = 'Are you sure you want to close?';
// });
ReactDOM.render(<App />, document.getElementById('root'));
registerServiceWorker();
