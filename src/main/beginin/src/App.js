import React, { Component } from 'react';
import { DefaultButton } from 'office-ui-fabric-react/lib/Button';
import MenuBarTop from './components/MenuBarTop';
import { loadTheme } from 'office-ui-fabric-react/lib/Styling';
import logo from './logo.svg';
import Lista from './Lista';
import './App.css';


loadTheme({
  palette: {
    themePrimary: 'black',
  },
});

const API_PATH = '/nayd/rubrics';
class App extends Component {
  constructor(props) {
    super(props);
    this.state = { data: [] };
    this.callApi = this.callApi.bind(this);
  }
	  //  componentDidMount() {
	  //       client({ method: 'GET', path: '/api/employees' }).done((response) => {
	  //           this.setState({ employees: response.entity._embedded.employees });
	  //       });
	  //   }
  callApi(event) {
	  event.preventDefault();
	  fetch(API_PATH)
		  .then(response => response.json())
		  .then((txt) => {
      //  console.log(txt);
          this.setState({ data: txt._embedded.rubrics });
      });
  }
  render() {
    // const rows = [];

    return (
      <div className="App">
        <MenuBarTop />
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Welcome to React</h2>
        </div>
        <DefaultButton onClick={this.callApi}>show the rest is runnnnniiing</DefaultButton>

        <Lista elems={this.state.data} />
      </div>
    );
  }
}

export default App;
