import React, { Component } from 'react';
import { CommandBar } from 'office-ui-fabric-react/lib/CommandBar';
import { AnimationClassNames } from 'office-ui-fabric-react/lib/Styling';

export default class MenuBarTop extends Component {
    constructor(props) {
        super(props);
        this.state = { userName: 'user' };
        this.getCommands = this.getCommands.bind(this);
        this.goHome = this.goHome.bind(this);
        this.getFariItems = this.getFariItems.bind(this);
    }
    componentDidMount() {
        // todo
        // get username
    }
    getCommands() {
        const { changeCompn } = this.props;
        return [
            {
                key: 'home',
                name: 'Acceuil',
                iconProps: { iconName: 'Home' },
                onClick: () => changeCompn('circles'),
            },
            {
                key: 'k7',
                name: 'Supports/K7',
                iconProps: { iconName: 'Video' },
                onClick: () => changeCompn('supports'),
            },
            {
                key: 'archive',
                name: 'Archives',
                iconProps: { iconName: 'Library' },
                onClick: () => changeCompn('archives'),
            },
            {
                key: 'dupli',
                name: 'Duplications',
                iconProps: { iconName: 'BuildQueue' },
                onClick: () => changeCompn('duplication'),
            },
        ];
    }
    getFariItems() {
        return [
            {
                key: 'history',
                name: 'Historique',
                iconProps: { iconName: 'Chart' },
                onClick: this.goHome,
            },
            {
                key: 'lang',
                name: 'Langue',
                iconProps: { iconName: 'Flag' },
                subMenuProps: {
                    items: [
                        {
                            key: 'ar',
                            name: 'العربية',
                        },
                        {
                            key: 'fr',
                            name: 'Français',
                        },

                    ],
                },
            },
            {
                key: 'profile',
                name: this.props.userName,
                iconProps: { iconName: 'Contact' },
                subMenuProps: {
                items: [
                    {
                        key: 'reset',
                        name: 'Changer mot de passe',
                        iconProps: { iconName: 'Unlock' },
                    },
                    {
                        key: 'deco',
                        name: 'se deconnecter',
                        iconProps: { iconName: 'OutOfOffice' },
                        onClick: () => this.props.logout(),
                    },

                ],
            } },

        ];
    }
    goHome(compn) {
        console.log(compn);
    }
    render() {
        return (
          <CommandBar
            className={AnimationClassNames.slideDownIn20}
            isSearchBoxVisible={false}
            searchPlaceholderText="Recherche ..."
            elipisisAriaLabel="More options"
            items={this.getCommands()}
            farItems={this.getFariItems()}
          />

        );
    }
}

