import React, { Component } from 'react';
import { CommandBar } from 'office-ui-fabric-react/lib/CommandBar';

export default class MenuBarTop extends Component {
    constructor(props) {
        super(props);
        this.state = { data: [] };
        this.getCommands = this.getCommands.bind(this);
        // this.goHome = this.goHome.bind(this);
    }
    getCommands() {
        return [
            {
                key: 'home',
                name: 'Acceuil',
                iconProps: { iconName: 'BarChart4' },
                onClick: this.goHome,
            },
            {
                key: 'contact',
                name: 'contactez nous',
                iconProps: { iconName: 'AddTo' },
                onClick: this.goHome,
            },
            {
                key: 'param',
                name: 'paramétres',
                iconProps: { iconName: 'FerrySolid' },
                onClick: this.goHome,
            },
        ];
    }
    getFariItems() {
        return [
            {
                key: 'home0',
                name: 'Acceuil',
                icon: 'BarChart4',
                subMenuProps: {
                items: [
                    {
                        key: 'bla1',
                        name: 'reload',
                        iconProps: { iconName: 'ReplyMirrored' },
                    },
                    {
                        key: 'bla2',
                        name: 'se deconnecter',
                        icon: 'RemoveFilter',
                    },

                ],
            } },
            {
                key: 'contact0',
                name: '',
                icon: 'AddTo',
                onClick: this.goHome,
            },
            {
                key: 'param0',
                name: '',
                icon: 'FerrySolid',
                onClick: this.goHome,
            },
        ];
    }
    goHome() {
        console.log('clickes');
    }
    render() {
        return (
          <CommandBar
            className="ms-slideDownIn10"
            isSearchBoxVisible="true"
            searchPlaceholderText="Recherche ..."
            elipisisAriaLabel="More options"
            items={this.getCommands()}
            farItems={this.getFariItems()}
          />

        );
    }
}

