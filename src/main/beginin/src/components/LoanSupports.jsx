import React, { Component } from 'react';
import { AnimationClassNames } from 'office-ui-fabric-react/lib/Styling';
import { CSSTransitionGroup } from 'react-transition-group';
import { Button } from 'semantic-ui-react';

import CardSupport from './CardSupport';
import AddSupportForm from './AddSupportForm';
import RecapSupports from './customcontrols/RecapSupports';

export default class LoanSupports extends Component {
    constructor(props) {
        super(props);
        this.state = {
            loadin: false,
            loanElements: [],
            supports: [],
            selectedElems: [],
            showAdd: false,
            page: 1,
        };
        this.addSupport = this.addSupport.bind(this);
        this.removeSupport = this.removeSupport.bind(this);
        this.refreshData = this.refreshData.bind(this);
        this.showAddForm = this.showAddForm.bind(this);
        this.fakeData = this.fakeData.bind(this);
        this.updateSupport = this.updateSupport.bind(this);
        this.retour = this.retour.bind(this);
        this.validerDemande = this.validerDemande.bind(this);
    }

    componentWillMount() {
        // if (this.state.types.length == 0) this.refreshData();
        this.fakeData();
    }
    fakeData() {
        const data = require('../fakedata/SupportTypes.json');
        this.setState({ supports: data._embedded.supportTypes });
    }
    refreshData() {
        this.setState({ loadin: true });
        const repo = 'supportTypes';
          fetch(`/nayd/${repo}`)
          .then(resp => resp.json())
          .then((donnees) => {
            let suppTypes = donnees._embedded[repo];
            suppTypes = suppTypes.map(d =>
                // let uri = d._links.self.href;
                // uri = uri.substr(uri.lastIndexOf('/') + 1);
                 ({ typeName: d.supportTypeName, typeID: d.idSupportType }));
            this.setState({ loadin: false, supports: suppTypes });
            console.log(this.state.supports);
            localStorage.setItem('supportTypes', JSON.stringify(this.state.supports));
          })
          .catch(cause => console.log(cause));
    }
    addSupport(element) {
        const { supports } = this.state;
        const s = supports.find(elem => elem.idSupportType === element.support);
        const supp = {
                        idSupportType: s.idSupportType,
                        disposition: s.disposition,
                        supportTypeName: s.supportTypeName,
                        };
        const durr = s.supportFormats.find(elem => elem.idSupportFormat === element.duration);
        const newSupp = {
            support: supp,
            duration: durr,
            quantity: element.quantity,
        };
        this.setState({ loanElements: [...this.state.loanElements, newSupp],
            selectedElems: [...this.state.selectedElems, newSupp.duration.idSupportFormat] });
    }
    updateSupport(supp) {
        const idx = this.state.loanElements
                .findIndex(el => el.duration.idSupportFormat === supp.duration.idSupportFormat);
        const newsupps = this.state.loanElements;
        newsupps[idx].quantity = supp.quantity;
        this.setState({ loanElements: newsupps });
    }
    removeSupport(supp) {
        const newsupps = this.state.loanElements
                .filter(e => e.duration.idSupportFormat !== supp.duration.idSupportFormat);


        const newSelected = this.state.selectedElems
                    .filter(e => e !== supp.duration.idSupportFormat);

        this.setState({ loanElements: newsupps, selectedElems: newSelected });
    }
    showAddForm() {
        this.setState({ showAdd: !this.state.showAdd });
    }
    retour() {
        this.setState({ page: 1 });
    }
    validerDemande() {
        this.setState({
            page: 1,
            loanElements: [],
            selectedElems: [],
        });
    }
    render() {
        const { loadin, supports, showAdd, loanElements, selectedElems, page } = this.state;
        const suppElems = loanElements.map(elem => (
          <CardSupport
            key={elem.duration.idSupportFormat}
            element={elem}
            removeIt={this.removeSupport}
            updateIt={this.updateSupport}
          />
        ));
        return (
          <section>
            <h1 className={AnimationClassNames.fadeIn500}>emprunt de supports</h1>
            {loadin && 'Chargement en cours '}
            {page === 1 &&
            <Button.Group>
              <Button
                content="Ajouter un élement"
                icon={showAdd ? 'minus' : 'plus'}
                labelPosition="left"
                onClick={this.showAddForm}
              />
              <Button.Or text="ou" />
              <Button
                content="Valider les éléments"
                icon="check"
                disabled={selectedElems.length === 0}
                labelPosition="right"
                onClick={() => this.setState({ page: 2 })}
                positive
              />
            </Button.Group>}

            {page === 1 && showAdd && <AddSupportForm
              addSupport={this.addSupport}
              showAddForm={this.showAddForm}
              supps={supports}
              selectedElems={selectedElems}
            />}

            <div className="list-cards">
              {page === 1 &&
              <CSSTransitionGroup
                transitionName="cards"
                transitionEnterTimeout={500}
                transitionLeaveTimeout={300}
              >
                {suppElems}
              </CSSTransitionGroup>
              }
              {page === 2 &&
                <RecapSupports
                  elements={loanElements}
                  retour={this.retour}
                  valider={this.validerDemande}
                />
              }
            </div>

          </section>
        );
    }
}
