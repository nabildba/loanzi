import React, { Component } from 'react';
// import { loadTheme } from 'office-ui-fabric-react/lib/Styling';


import MenuBarTop from './components/MenuBarTop';
import LoginForm from './components/LoginForm';
import MenuCircles from './components/MenuCircles';
import LoanSupports from './components/LoanSupports';
// import logo from './logo.svg';
import './App.css';
import './styles/cards.css';


// loadTheme({
//   palette: {
//     themePrimary: 'black',
//   },
// });

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
    }
    this.loggedIn = this.loggedIn.bind(this);
    this.changeView = this.changeView.bind(this);
    this.logout = this.logout.bind(this);
    this.loading = this.loading.bind(this);
  }

  changeView(compn) {
    this.setState({ compn });
  }
  componentDidMount() {
    const user = localStorage.getItem('user');
    if (user) this.loggedIn(user, true);
  }
  componentWillUnmount() {
    localStorage.setItem('tsed', 'ah tsed');
  }
  logout() {
    this.setState({ user: '', logged: false });
    localStorage.clear();
  }
    // authentification
  loggedIn(user, logged) {
    this.setState({ user, logged });
    localStorage.setItem('user', user);
    this.loading(false);
  }
  loading(progress) {
    this.setState({ progress });
  }
  render() {
    // const rows = [];
    const { logged, user, progress } = this.state;
    const Compn = compnList[this.state.compn];

    return (
      <div className="App">
        {progress && <InfoBulle />}
        <header>
          {logged && <MenuBarTop
            changeCompn={this.changeView}
            logout={this.logout}
            userName={user}
          />}
        </header>
        <div id="contents">
          {!logged && <LoginForm loggedIn={this.loggedIn} loading={this.loading} />}
          { logged && <Compn changeCompn={this.changeView} />}
        </div>
        <footer>
          <div className="status-bar">
            <img src={require('./imgs/snrt.png')} width="16" alt="snrt_logo" /> &copy;SNRT2017 | Département du patrimoine audiovisuel
          </div>
        </footer>
      </div>
    );
  }
}

const InfoBulle = () => (
  <div className="info-bulle">
    <span>Chargement en cours ..</span>
  </div>
);

export default App;
