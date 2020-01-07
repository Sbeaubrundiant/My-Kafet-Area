import React from 'react';
import SideBar from "../../Components/SideBar/SideBar";
import '../../App.css';
import oeufMimosa from "../../Components/View/starters/oeufMimosa.jpg";
import avocatCrevette from "../../Components/View/starters/avocatCrevette.jpg";


export default function Starters() {
  return (
    <div id="App">
      <SideBar pageWrapId={"page-wrap"} outerContainerId={"App"} />
        <header>  <h1 id="Pick-up-line">Choose your Starter</h1> </header>

        <div id="page-wrap">
          <div class="proposedStarterZone">
            <h3 class="proposedStarerName">Oeufs Mimosa</h3>
            <img src={oeufMimosa} alt="oeufMimosa" id="proposedStarterPicture" />
            <div class="dropdown">
              <h4>Yooooooo</h4>
              <button>click me</button>
            </div>
          </div>
        
          <div class="proposedStarterZone">
            <h3 class="proposedStarerName">Avocat Crevettes</h3>
            <img src={avocatCrevette} alt="avocatCrevette" id="proposedStarterPicture" />
          </div>

          <div class="proposedStarterZone">
            <img  alt="" class="proposedStarter" />
          </div>
          <div class="proposedStarterZone">
            <img  alt="" class="proposedStarter" />
          </div>
          <div class="proposedStarterZone">
            <img  alt="" class="proposedStarter" />
          </div>
        </div>
    </div>
  )
  }
