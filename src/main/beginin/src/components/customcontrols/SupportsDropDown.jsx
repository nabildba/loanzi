import * as React from 'react';
import { Dropdown } from 'office-ui-fabric-react/lib/Dropdown';
import './Dropdown.Basic.Example.scss';
import { Icon } from '../../Icon';

export class SupportsDropdown extends React.Component {
  constructor() {
    super();
    this.state = {
      selectedItem: null
    };
  }

   render() {
    let { selectedItem } = this.state;

    return (
        <Dropdown
          placeHolder='Select an Option'
          label='Custom example:'
          id='Customdrop1'
          selectedKey={ selectedItem && selectedItem.key }
          onChanged={ (item) => this.setState({ selectedItem: item }) }
          ariaLabel='Custom dropdown example'
          onRenderPlaceHolder={ this._onRenderPlaceHolder }
          onRenderTitle={ this._onRenderOption }
          onRenderOption={ this._onRenderOption }
          options={
            [
              { key: 'A', text: 'Option a', data: { icon: 'Memo' } },
              { key: 'B', text: 'Option b', data: { icon: 'Print' } },
              { key: 'C', text: 'Option c', data: { icon: 'ShoppingCart' } },
              { key: 'D', text: 'Option d', data: { icon: 'Train' } },
              { key: 'E', text: 'Option e', data: { icon: 'Repair' } },
              { key: 'F', text: 'Option f', data: { icon: 'Running' } },
              { key: 'G', text: 'Option g', data: { icon: 'EmojiNeutral' } },
              { key: 'H', text: 'Option h', data: { icon: 'ChatInviteFriend' } },
              { key: 'I', text: 'Option i', data: { icon: 'SecurityGroup' } },
              { key: 'J', text: 'Option j', data: { icon: 'AddGroup' } },
            ]
          }
        />
    );
  }

   _onRenderOption = (option) => {
    return (
      <div className='dropdownExample-option'>
        { option.data && option.data.icon &&
          <Icon
            style={ { marginRight: '8px' } }
            iconName={ option.data.icon }
            aria-hidden='true'
            title={ option.data.icon }
          />
        }
        <span>{ option.text }</span>
      </div>
    );
  }

   _onRenderPlaceHolder = (props)=> {
    return (
      <div className='dropdownExample-placeholder'>
        <Icon
          style={ { marginRight: '8px' } }
          iconName={ 'MessageFill' }
          aria-hidden='true'
        />
        <span>{ props.placeHolder }</span>
      </div>
    );
  }

}