import React, { Component } from 'react';
import { Icon, Menu } from 'semantic-ui-react';

export default class CardSupport extends Component {

    constructor(props) {
        super(props);
        this.handleItemClick = this.handleItemClick.bind(this);
        this.getTotal = this.getTotal.bind(this);
    }
    handleItemClick(e, { name }) {
      const elem = this.props.element;
      if (name === 'delete') {
        this.props.removeIt(elem);
        return;
      }
      if (name === 'plus') {
        elem.quantity++;
      } else if (name === 'minus') {
        elem.quantity--;
      }

      if (elem.quantity === 0) { this.props.removeIt(elem); } else { this.props.updateIt(elem); }
    }
    getTotal() {
      const { duration, quantity } = this.props.element;
      const total = duration.duration * quantity;
      const hours = Math.trunc(total / 60);
      const mins = total % 60;
      return `${hours}h${mins}min`;
    }
    render() {
        const { support, duration, quantity } = this.props.element;
        const colorBox = { backgroundColor: duration.color };
        const img = require(`../imgs/supports/${support.idSupportType}.png`);
        return (
          <article className="support-card">
            <div className="thumb-card">
              { <img src={img} alt={support.supportTypeName} /> }
            </div>
            <div className="details-card">
              <ul>
                <li>{`${support.disposition} : ${support.supportTypeName}`}</li>
                <li>Durée : {`${duration.supportName} (${duration.duration}min)`}</li>
                <li>
                  <span className="color-square" style={colorBox} /> {duration.size}
                  <span className="total-duration">{`(${this.getTotal()})`}</span>
                </li>
                <li className="qte">{quantity}</li>
              </ul>
            </div>
            <div className="actions">
              <Menu icon vertical size="mini">
                <Menu.Item name="plus" onClick={this.handleItemClick}>
                  <Icon name="plus circle" />
                </Menu.Item>

                <Menu.Item name="minus" onClick={this.handleItemClick}>
                  <Icon name="minus circle" />
                </Menu.Item>

                <Menu.Item name="delete" onClick={this.handleItemClick}>
                  <Icon name="trash" color="red" />
                </Menu.Item>
              </Menu>
            </div>
          </article>
        );
    }
}
