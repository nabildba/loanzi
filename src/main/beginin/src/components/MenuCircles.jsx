import React, { Component } from 'react';
import { PrimaryButton } from 'office-ui-fabric-react/lib/Button';
import { AnimationClassNames } from 'office-ui-fabric-react/lib/Styling';


export default class extends Component {
    constructor(props) {
        super(props);
        this.state = { data: [], outrance: false };
    }
    componentWillUnmount() {
      this.setState({ outrance: true });
    }
    render() {
        return (
          <section>
            <h1 className={AnimationClassNames.fadeIn500}>Choisir votre demande</h1>
            <ul className="menu-circles">
              <li className={this.state.outrance ? 'outunmount' : ''}>
                <div className="front" />
                <img src={require('../imgs/supports.png')} alt="supports" />
                <div className="back">
                  <ul>
                    <li><strong>Quoi?</strong> Cassettes (DVCAM, HDCAM, IMX..) /
                    Disques (XDCAM, DVD/CD.. )..</li>
                    <li><strong>Pourquoi?</strong> Tournage interne ou externe / Montage / Parallèles.. </li>
                    <li><strong>Qui?</strong> Monteur / Cameraman / Chargé de production / Unités de tournage..</li>
                  </ul>
                </div>
                <PrimaryButton
                  text="Supports"
                  icon="Video"
                  onClick={() => this.props.changeCompn('supports')}
                />
              </li>
              <li>
                <div className="front" />
                <img src={require('../imgs/archives.png')} alt="supports" />
                <div className="back">
                  <ul>
                    <li><strong>Quoi?</strong> Programmes intégrales / <br /> extrait d’images..</li>
                    <li><strong>Sur</strong> Support professionnel (HDCAM, IMX, DVCAM..)</li>
                    <li><strong>Pourquoi?</strong> Diffusion / Préparation / Montage / JT / PAD.. </li>
                    <li><strong>Qui?</strong> Antenne / programmation / information.. </li>
                  </ul>
                </div>
                <PrimaryButton
                  text="Archives"
                  icon="Library"
                />
              </li>
              <li>
                <div className="front" />
                <img src={require('../imgs/duplication.png')} alt="supports" />
                <div className="back">
                  <ul>
                    <li><strong>Quoi?</strong> Copie de programme integral ou d'extrait /
                     avec ou sans logo</li>
                    <li><strong>Sur</strong> (DVD, Blu-ray.. | HDCAM, IMX..)</li>
                    <li><strong>Pourquoi?</strong> Achat d’images / demande externe / usage personnel..</li>
                    <li><strong>Qui?</strong> Organismes externes / personalité / particulier.. </li>
                  </ul>
                </div>
                <PrimaryButton
                  text="Duplication"
                  icon="BuildQueue"
                />
              </li>
            </ul>
          </section>
        );
    }
}
