import React, { Component } from 'react';
import { Dropdown, DropdownMenuItemType } from 'office-ui-fabric-react/lib/Dropdown';
import { Button, Icon, Form } from 'semantic-ui-react';

export default class AddSupportForm extends Component {
    constructor(props) {
        super(props);
        this.state = { selectedType: null, selectedDuration: null, quantity: 1 };
        this.submit = this.submit.bind(this);
        this.getTypes = this.getTypes.bind(this);
        this.changeStateTyp = this.changeStateTyp.bind(this);
        this.changeStateDur = this.changeStateDur.bind(this);
    }


    getTypes() {
        const supps = this.props.supps;
        const k7 = supps.filter(a => a.disposition === 'Bande Magnétique')
            .map(item => ({
             key: item.idSupportType, text: item.supportTypeName,
            }));
        const discs = supps.filter(a => a.disposition === 'Disque Optique')
        .map(item => ({
         key: item.idSupportType, text: item.supportTypeName,
        }));
        const k7head = { key: 'HeaderK7', text: 'Bande Magnétique', itemType: DropdownMenuItemType.Header };
        const separ = { key: 'divider_1', text: '-', itemType: DropdownMenuItemType.Divider };
        const discHead = { key: 'HeaderDisc', text: 'Disque Optique', itemType: DropdownMenuItemType.Header };
        const types = [k7head, ...k7, separ, discHead, ...discs];
        return types;
    }
    getDurations() {
        const { selectedType } = this.state;
        const { selectedElems } = this.props;
        if (!selectedType) return;
        const supp = this.props.supps.find(elem => elem.idSupportType === selectedType.key);
        const durations = supp.supportFormats;
        const dispo = durations.filter((elem) => {
            const x = selectedElems.findIndex(e => e === elem.idSupportFormat);
            return x === -1;
        });

        return dispo.map(elem => ({
                            key: elem.idSupportFormat,
                            text: `${elem.supportName} - (${elem.duration}min)`,
                        }));
    }

    submit(e) {
        e.preventDefault();
        const { selectedType, selectedDuration } = this.state;
        let qte = this.quantity.value;
        qte = isNaN(qte) || qte <= 0 ? 1 : qte;
        const supp = {
            support: selectedType.key,
            duration: selectedDuration.key,
            quantity: qte,
        };
        this.props.addSupport(supp);
        this.props.showAddForm();
    }

    render() {
        const { selectedType, selectedDuration } = this.state;
        return (
          <Form onSubmit={this.submit} className="addsupp-form">
            <Dropdown
              placeHolder="Choisir le type du support"
              label="Type :"
              id="dd_type"
              options={this.getTypes()}
              selectedKey={selectedType && selectedType.key}
              onChanged={this.changeStateTyp}
            />
            {
            selectedType &&
            <Dropdown
              placeHolder="Choisir la durée"
              label="Durée :"
              id="dd_duration"
              options={this.getDurations()}
              selectedKey={selectedDuration && selectedDuration.key}
              onChanged={this.changeStateDur}
            />
            }
            {
           selectedDuration &&
           <p>
             <Form.Field>
               <label htmlFor="qte">Quantité</label>
               <input
                 type="number"
                 max={100}
                 min={1}
                 ref={(input) => { this.quantity = input; }}
                 defaultValue="1"
                 id="qte"
               />
             </Form.Field>
           </p>
            }
            {
           selectedDuration &&
           <Button animated="fade" onClick={this.submit}>
             <Button.Content visible>Ajouter</Button.Content>
             <Button.Content hidden>
               <Icon name="plus" />
             </Button.Content>
           </Button>
            }
          </Form>
        );
    }

    changeStateTyp(item) {
        this.setState({ selectedType: item, selectedDuration: null });
    }
    changeStateDur(item) {
        this.setState({ selectedDuration: item });
    }
    changeStateQte(e) {
        this.setState({ duration: e.value });
    }

}
