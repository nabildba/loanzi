import React, { Component } from 'react';
import { loadTheme } from 'office-ui-fabric-react/lib/Styling';


import MenuBarTop from './components/MenuBarTop';
import LoginForm from './components/LoginForm';
import MenuCircles from './components/MenuCircles';
import LoanSupports from './components/LoanSupports';
// import logo from './logo.svg';
import './App.css';


loadTheme({
  palette: {
    themePrimary: 'black',
  },
});

// const API_PATH = '/nayd/';

const compnList = {
  circles: MenuCircles,
  supports: LoanSupports,
};

class App extends Component {

  constructor(props) {
    super(props);
    this.state = {
      user: '',
      data: [],
      logged: false,
      progress: false,
      compn: 'circles',
    };
    this.authenticate = this.authenticate.bind(this);
    this.changeView = this.changeView.bind(this);
    this.logout = this.logout.bind(this);
  }

  changeView(compn) {
    this.setState({ compn });
  }
	  //  componentDidMount() {
	  //       client({ method: 'GET', path: '/api/employees' }).done((response) => {
	  //           this.setState({ employees: response.entity._embedded.employees });
	  //       });
    //   }
  logout() {
    this.setState({ user: '', logged: false });
  }
    // authentification
  authenticate(email, pass) {
    this.setState({ progress: true });

    // setTimeout(() => {
    //   console.log(pass);
    //   this.setState({ user: email, logged: true, progress: false });
    // }, 2000);

    fetch('/login', {
      method: 'post',
      headers: {
        'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8',
        'X-Custom-Header': 'ProcessThisImmediately',
      },
      body: `username=${email}&password=${pass}`,
    })
    .then((resp) => {
      if (resp.status === 200) {
        this.setState({ user: email, logged: true });
      }
    })
    .catch((raison) => { console.log(raison); });

                   /* body: JSON.stringify({
                      username: email,
                      password: pass,
                    }), */
  }

  render() {
    // const rows = [];
    const logged = this.state.logged;
    const Compn = compnList[this.state.compn];
    return (
      <div className="App">
        <header>
          {logged && <MenuBarTop
            changeCompn={this.changeView}
            logout={this.logout}
            userName={this.state.user}
          />}
        </header>
        <section>
          {!logged && <LoginForm send={this.authenticate} progress={this.state.progress} />}
          { logged && <Compn changeCompn={this.changeView} />}
        </section>
        <footer>
          <div className="status-bar">helloow</div>
        </footer>
      </div>
    );
  }
}

export default App;
