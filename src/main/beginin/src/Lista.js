import React, { Component } from 'react';

class Lista extends Component {
    render() {
        return (
          <ul>
            {this.props.elems.map((e, i) => <li key={i}>{e.rubricName}</li>)}
          </ul>
        );
    }
}


export default Lista;
