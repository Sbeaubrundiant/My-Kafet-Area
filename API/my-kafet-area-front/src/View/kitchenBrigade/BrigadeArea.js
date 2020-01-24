import React from 'react';
import '../../App.css';
import SideBar from "../../Components/SideBar/SideBar.js";
import Button from 'react-bootstrap/Button';
import { useHistory} from 'react-router-dom';
import CulinaryProposition from './CulinaryProposition';

export default function Brigadearea() {
// Redirect to culinaryproposition page on the button click
    let history = useHistory();
        function handleClick() {
          history.push("/CulinaryProposition");
        }

    return(
        
    <div id="App">
            <SideBar pageWrapId={"page-wrap"} outerContainerId={"App"} />
            <div id="page-wrap">
                <h1 id="Pick-up-line">
                   Brigade Area
                </h1>
             </div>
             <div>
                <Button variant="primary" type="submit" id="goToCulinaryProposition" onClick={handleClick}>
            Culinary Proposition
                 </Button>
              </div>

     </div>
               
    )

}