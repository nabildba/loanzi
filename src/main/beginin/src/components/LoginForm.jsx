import React, { Component } from 'react';
import { TextField } from 'office-ui-fabric-react/lib/TextField';
import { PrimaryButton } from 'office-ui-fabric-react/lib/Button';


export default class LoginForm extends Component {
  constructor(props) {
    super(props);
    this.state = { progress: false, err401: false };
    this.submited = this.submited.bind(this);
    this._onGetErrorMessage = this._onGetErrorMessage.bind(this);
  }
  submited() {
    this.props.loading(true);
    this.setState({ progress: true });
    const email = this.email.value;
    const pass = this.pass.value;

    // setTimeout(() => {
    //   console.log(pass);
    //   this.props.loggedIn(email, true);
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
        this.setState({ progress: false });
        this.props.loggedIn(email, true);
      }
      if (resp.status === 401) {
        this.setState({ err401: true, progress: false });
      }
    });
    // .catch((raison) => { console.log(raison); });
  }

  _onGetErrorMessage() {
    // TODO mail validation
    if (this.state.err401) { return ('nom d\'utiisateur ou mot de passe incorrecte'); }
    return '';
  }

  render() {
    const { progress, err401 } = this.state;
    return (
      <div className="login-wrapper">
        <div className="middle">
          <form className="login-form">
            <TextField
              ref={input => this.email = input}
              label="Nom d'utilisateur"
              placeholder="Adresse Email"
              onGetErrorMessage={this._onGetErrorMessage}
              iconProps={{ iconName: 'Mail' }}
            />
            <TextField
              ref={pass => this.pass = pass}
              label="Mot de passe"
              placeholder="Mot de passe"
              type="password"
              iconProps={{ iconName: 'Lock' }}
              errorMessage={err401 ? 'nom d\'utiisateur ou mot de passe incorrecte' : ''}
            />
            <PrimaryButton
              data-automation-id="test"
              text={progress ? 'Connection ..' : 'Se connecter'}
              disabled={progress}
              onClick={this.submited}
            />
          </form>
        </div>
      </div>
    );
  }
}
