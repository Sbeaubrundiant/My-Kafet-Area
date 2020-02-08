import React from 'react';
import '../../App.css';
import SideBar from "../../Components/SideBar/SideBar.js";
import Button from 'react-bootstrap/Button';
import { useHistory} from 'react-router-dom';
import LunchItemCreation from './LunchItemCreationn';

export default function Brigadearea() {
// Redirect to LunchItemCreation page on the button click
    let history = useHistory();
        function handleClick() {
          history.push("/LunchItemCreation");
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
                <Button variant="primary" type="submit" id="goToLunchItemCreation" onClick={handleClick}>
            Create lunch items
                 </Button>
              </div>

     </div>
               
    )

}