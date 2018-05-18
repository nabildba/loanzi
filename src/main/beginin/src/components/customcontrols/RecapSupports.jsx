import React, { Component } from 'react';
import { Form, Button, Icon} from 'semantic-ui-react';
import {
    DetailsList,
    DetailsListLayoutMode
  } from 'office-ui-fabric-react/lib/DetailsList';

const options = [
    { key: 't', text: 'Tournage interne / externe', value: 'tourage' },
    { key: 'm', text: 'Montage', value: 'montage' },
    { key: 'c', text: 'Copie / Duplication', value: 'copie' },
    { key: 'p', text: 'PAD', value: 'pad' },
  ];
const columns =[
    {
        key: 'qtecol',
        name: 'Quantité',
        fieldName: 'qte',
        minWidth: 70,
        maxWidth: 90,
        isResizable: true,
        data: 'number',
    },
    {
        key: 'durrcol',
        name: 'Durée',
        fieldName: 'supportDur',
        minWidth: 120,
        maxWidth: 200,
        isResizable: true,
        data: 'string',
    },
    {
        key: 'suppcol',
        name: 'Support',
        fieldName: 'supportName',
        minWidth: 150,
        maxWidth: 300,
        isResizable: true,
        data: 'string',
    },
    {
        key: 'suppcolor',
        name: 'Couleur',
        minWidth: 50,
        maxWidth: 100,
        isResizable: true,
        data: 'string',
        onRender: (item) => {

            return (
                <span className="color-square" style={{backgroundColor: item.color, borderColor:'black'}} />
            );
          }
    },
    {
        key: 'supptype',
        name: 'Type',
        fieldName: 'supportType',
        minWidth: 120,
        maxWidth: 300,
        isResizable: true,
        data: 'string',
    },
];
export default class RecapSupports extends Component {
    constructor(props) {
        super(props);
        this.state = { value: 'sm', accepted: false, objet:'', usage:'', comment:'' };
        this.getElements=this.getElements.bind(this);
        this.accept=this.accept.bind(this);
    }
    handleChange = (e, { value }) => this.setState({ value });
    getElements(){
        const elems=this.props.elements.map(el => {
            return {
                supportName: el.support.supportTypeName,
                supportType: el.support.disposition,
                supportDur: `${el.duration.supportName} (${el.duration.duration}min)`,
                color: el.duration.color,
                qte: el.quantity,
            }
        });
        return elems;

    }
    accept(){
        this.props.valider();
    }
    render() {
        const { value, accepted } = this.state;
        const items=this.getElements();
        return (
          <Form inverted>
            <Form.Group widths="equal">
              <Form.Input label="Objet / nom du programme " placeholder="Objet de votre demande" />
              <Form.Select label="Usage" options={options} placeholder="Usage" />
            </Form.Group>
            <label>Supports choisis :</label>
            <div className='detail-list'>
            <DetailsList
                items={items}
                compact={true}
                columns={columns}
                setKey='set'
                layoutMode={DetailsListLayoutMode.justified}
                isHeaderVisible={true}
            />
            </div>
            <Form.TextArea label="Commentaires" placeholder="Nous en dire plus..." />
            <Form.Checkbox
                checked={accepted}
                onChange={(e, {checked})=> this.setState({accepted: checked})}
             label="Je me porte garant de retourner les supports (K7/ disques..) empruntés dans leurs intégralité directement après montage et en cas de non utilisation." />
            
            <Button.Group>
                <Button animated onClick={()=> this.props.retour()}>
                    <Button.Content visible>Retour</Button.Content>
                    <Button.Content hidden>
                        <Icon name='left arrow' />
                    </Button.Content>
                </Button>
                <Button.Or text='ou' />
                <Button animated='fade' 
                disabled={!accepted}
                onClick={this.accept} positive>
                    <Button.Content visible>Valider</Button.Content>
                    <Button.Content hidden>
                        <Icon name='check' />
                    </Button.Content>
                </Button>
            </Button.Group>
          </Form>
        );
    }
}
